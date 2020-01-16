package com.yycoin.job;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.druid.util.StringUtils;
import com.yycoin.pojo.maycur.MayCurAuthInfo;
import com.yycoin.pojo.maycur.MayCurResultData;
import com.yycoin.service.IMayCurConsumeSubmitService;
import com.yycoin.service.IMayCurExpenseSubmitService;
import com.yycoin.service.IOaStafferService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DateUtils;
import com.yycoin.util.MayCurConfigProperties;
import com.yycoin.util.MayCurUtils;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;
import com.yycoin.vo.TCenterBank;
import com.yycoin.vo.TCenterBankMapper;
import com.yycoin.vo.TCenterOutBill;
import com.yycoin.vo.TCenterOutBillExample;
import com.yycoin.vo.TCenterOutBillMapper;
import com.yycoin.vo.TCenterTcpExpenseExample;
import com.yycoin.vo.TCenterTcpExpenseMapper;
import com.yycoin.vo.travelapply.TCenterOaStaffer;
import com.yycoin.vo.travelapply.TCenterTravelApplyExample;
import com.yycoin.vo.travelapply.TCenterTravelApplyMapper;

@Component
public class MayCurPaymentStatusUpdateSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCurPaymentStatusUpdateSchedule.class);

	@Autowired
	private MayCurUtils mayCurUtils;

	@Autowired
	private MayCurConfigProperties mayCurConfigProperties;

	@Autowired
	private IMayCurExpenseSubmitService mayCurExpenseSubmitService;

	@Autowired
	private IMayCurConsumeSubmitService mayCurConsumeSubmitService;

	@Autowired
	private TCenterBankMapper bankMapper;

	@Autowired
	private TCenterOutBillMapper outBillMapper;

	@Autowired
	private TCenterTcpExpenseMapper tcpExpenseMapper;

	@Autowired
	private TCenterTravelApplyMapper travelApplyMapper;

	@Autowired
	private IOaStafferService oaStafferService;

	@SuppressWarnings("rawtypes")
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start update expense paymentstatus");
		MayCurExpenseSubmitExample expenseSubmitExample = new MayCurExpenseSubmitExample();
		expenseSubmitExample.createCriteria().andPaymentstatusEqualTo(0).andCreateflagEqualTo(1)
				.andStatusEqualTo("SETTLEMENT");
		List<MayCurExpenseSubmit> expenseList = mayCurExpenseSubmitService.selectByExample(expenseSubmitExample);
		if (expenseList.size() > 0) {

			logger.info("start update expense paymentstatus,do login maycur");
			MayCurResultData<MayCurAuthInfo> loginResult = mayCurUtils.loginMayCurOpenAPI();
			logger.info(loginResult.toString());
			String code = loginResult.getCode();

			if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(code)) {
				String entCode = loginResult.getData().getEntCode();
				String tokenId = loginResult.getData().getTokenId();
				long timestamp = loginResult.getData().getTimestamp();
				Map<String, String> header = new HashMap<String, String>();
				header.put("entCode", entCode);
				header.put("tokenId", tokenId);
				String paymentStatusUrlPath = mayCurConfigProperties.getHost()
						+ mayCurConfigProperties.getPaymentupdate();
				String currDateTime = DateUtils.getCurrDateTime();
				for (MayCurExpenseSubmit expense : expenseList) {
					String businessCode = expense.getReportId();
					String oaOrderId = expense.getOaorderid();
					if (StringUtils.isEmpty(oaOrderId)) {
						logger.error("expense oa orderid is null");
						continue;
					}
					// 查看单据是否已经支付完毕,即单据状态为99结束
					TCenterTcpExpenseExample expenseExample = new TCenterTcpExpenseExample();
					expenseExample.createCriteria().andIdEqualTo(oaOrderId).andStatusEqualTo(99);
					int totalCount = tcpExpenseMapper.countByExample(expenseExample);
					if (totalCount == 0) {
						continue;
					}

					List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
					Map<String, Object> map = new HashMap<String, Object>();
					Map<String, Object> dataMap = new HashMap<String, Object>();
					map.put("formNo", businessCode);
					map.put("type", "REIMBURSE");

					// 根据付款单，查找付款银行账户
					String payAccount = "";
					String oaStafferId = "";
					TCenterOutBillExample outBillExample = new TCenterOutBillExample();
					outBillExample.or().andStockidEqualTo(oaOrderId);
					outBillExample.or().andRefbillidEqualTo(oaOrderId);

					List<TCenterOutBill> outBillList = outBillMapper.selectByExample(outBillExample);
					if (outBillList.size() == 0) {
						// 冲销单，没有付款记录
						payAccount = DEFAULT_BANK_PAY_ACCOUNT;
						// 取最近的支付操作人
						outBillExample = new TCenterOutBillExample();
						outBillExample.createCriteria().andStafferidNotEqualTo("");
						outBillExample.setNumberOfRecordsToSelect(1);
						outBillExample.setStartRecordNum(0);
						outBillExample.setOrderByClause(" logtime DESC");
						List<TCenterOutBill> recentBillList = outBillMapper.selectByExample(outBillExample);

						TCenterOutBill recentOutBill = recentBillList.get(0);
						oaStafferId = recentOutBill.getStafferid();

					} else {
						TCenterOutBill outBill = outBillList.get(0);
						String bankId = outBill.getBankid();
						oaStafferId = outBill.getStafferid();
						if (StringUtils.isEmpty(bankId)) {
							logger.error("oa order id:" + oaOrderId + " bank id is null");
							throw new JobExecutionException("oa order id:" + oaOrderId + " bank id is null");
						}
						TCenterBank bankVO = bankMapper.selectByPrimaryKey(bankId);
						if (bankVO == null) {
							logger.error("oa order id:" + oaOrderId + ";bankId:" + bankId + " can not find bank");
							throw new JobExecutionException(
									"oa order id:" + oaOrderId + ";bankId:" + bankId + " can not find bank");
						}
						if (StringUtils.isEmpty(bankVO.getBankno())) {
							logger.error("oa order id:" + oaOrderId + ";bankId:" + bankId + " bank account is empty");
							throw new JobExecutionException(
									"oa order id:" + oaOrderId + ";bankId:" + bankId + " bank account is empty");
						}
						payAccount = bankVO.getBankno().trim();
					}
					if (StringUtils.isEmpty(payAccount)) {
						logger.error("oa order id:" + oaOrderId + " can not find payment account");
						throw new JobExecutionException("oa order id:" + oaOrderId + " can not find payment account");
					}
					if (StringUtils.isEmpty(oaStafferId)) {
						logger.error("oa order id:" + oaOrderId + " can not find stafferid");
						throw new JobExecutionException("oa order id:" + oaOrderId + " can not find stafferid");
					}

					map.put("payerAccountCode", payAccount);
					list.add(map);

					TCenterOaStaffer oaStaffer = oaStafferService.selectByPrimaryKey(Integer.valueOf(oaStafferId));
					String stafferCode = oaStaffer.getCode().trim();
					dataMap.put("employeeId", stafferCode);
					dataMap.put("formData", list);

					MayCurResultData exportResultData = mayCurUtils.synchronizeToMaycur(header, timestamp,
							paymentStatusUrlPath, "POST", "application/json", "UTF-8", dataMap);
					String exportResultCode = exportResultData.getCode();
					logger.info("update expense paymentstatus businesscode:" + businessCode + " result code:"
							+ exportResultCode);
					if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(exportResultCode)) {
						MayCurExpenseSubmitExample updateExample = new MayCurExpenseSubmitExample();
						updateExample.createCriteria().andReportIdEqualTo(businessCode).andPaymentstatusEqualTo(0);
						MayCurExpenseSubmit updateRecord = new MayCurExpenseSubmit();
						updateRecord.setReportId(businessCode);
						updateRecord.setPaymentstatus(1);
						updateRecord.setPaymenttime(currDateTime);
						updateRecord.setStatus("COMPLETED");
						mayCurExpenseSubmitService.updateByExampleSelective(updateRecord, updateExample);

					}
				}
			}
		}

		logger.info("end update expense paymentstatus");

		logger.info("start update consume paymentstatus");
		MayCurConsumeSubmitExample consumeSubmitExample = new MayCurConsumeSubmitExample();
		consumeSubmitExample.createCriteria().andPaymentstatusEqualTo(0).andCreateflagEqualTo(1)
				.andStatusEqualTo("SETTLEMENT");
		List<MayCurConsumeSubmit> consumeList = mayCurConsumeSubmitService.selectByExample(consumeSubmitExample);
		if (consumeList.size() > 0) {

			logger.info("start update consume paymentstatus,do login maycur");
			MayCurResultData<MayCurAuthInfo> loginResult = mayCurUtils.loginMayCurOpenAPI();

			logger.info(loginResult.toString());

			String code = loginResult.getCode();

			if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(code)) {
				String entCode = loginResult.getData().getEntCode();
				String tokenId = loginResult.getData().getTokenId();
				long timestamp = loginResult.getData().getTimestamp();
				Map<String, String> header = new HashMap<String, String>();
				header.put("entCode", entCode);
				header.put("tokenId", tokenId);
				String paymentStatusUrlPath = mayCurConfigProperties.getHost()
						+ mayCurConfigProperties.getPaymentupdate();
				String currDateTime = DateUtils.getCurrDateTime();
				for (MayCurConsumeSubmit consume : consumeList) {
					String businessCode = consume.getReportId();
					String oaOrderId = consume.getOaorderid();
					// 查看单据是否已经支付完毕,即单据状态为99结束
					TCenterTravelApplyExample travelApplyExample = new TCenterTravelApplyExample();
					travelApplyExample.createCriteria().andIdEqualTo(oaOrderId).andStatusEqualTo(99);
					int totalCount = travelApplyMapper.countByExample(travelApplyExample);
					if (totalCount == 0) {
						continue;
					}

					List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("formNo", businessCode);
					map.put("type", "PRECONSUME");

					// 根据付款单，查找付款银行账户
					String payAccount = "";
					String oaStafferId = "";
					TCenterOutBillExample outBillExample = new TCenterOutBillExample();
					outBillExample.or().andStockidEqualTo(oaOrderId);
					outBillExample.or().andRefbillidEqualTo(oaOrderId);

					List<TCenterOutBill> outBillList = outBillMapper.selectByExample(outBillExample);
					if (outBillList.size() == 0) {
						logger.error("oa order id:" + oaOrderId + " can not find out bill");
						throw new JobExecutionException("oa order id:" + oaOrderId + " can not find out bill");
					}
					TCenterOutBill outBill = outBillList.get(0);
					String bankId = outBill.getBankid();
					oaStafferId = outBill.getStafferid();
					if (StringUtils.isEmpty(bankId)) {
						logger.error("oa order id:" + oaOrderId + " bank id is null");
						// throw new JobExecutionException("oa order id:" + oaOrderId + " bank id is
						// null");
					}
					TCenterBank bankVO = bankMapper.selectByPrimaryKey(bankId);
					if (bankVO == null) {
						logger.error("oa order id:" + oaOrderId + ";bankId:" + bankId + " can not find bank");
//						throw new JobExecutionException(
//								"oa order id:" + oaOrderId + ";bankId:" + bankId + " can not find bank");
						continue;
					}
					if (StringUtils.isEmpty(bankVO.getBankno())) {
						logger.error("oa order id:" + oaOrderId + ";bankId:" + bankId + " bank account is empty");
//						throw new JobExecutionException(
//								"oa order id:" + oaOrderId + ";bankId:" + bankId + " bank account is empty");
						continue;
					}
					payAccount = bankVO.getBankno().trim();
					if (StringUtils.isEmpty(payAccount)) {
						logger.error("oa order id:" + oaOrderId + " can not find payment account");
//						throw new JobExecutionException("oa order id:" + oaOrderId + " can not find payment account");
						continue;
					}
					if (StringUtils.isEmpty(oaStafferId)) {
						logger.error("oa order id:" + oaOrderId + " can not find payment account");
//						throw new JobExecutionException("oa order id:" + oaOrderId + " can not find payment account");
						continue;
					}
					map.put("payerAccountCode", payAccount);
					list.add(map);
					Map<String, Object> dataMap = new HashMap<String, Object>();
					TCenterOaStaffer oaStaffer = oaStafferService.selectByPrimaryKey(Integer.valueOf(oaStafferId));
					String stafferCode = oaStaffer.getCode().trim();
					dataMap.put("employeeId", stafferCode);
					dataMap.put("formData", list);
					MayCurResultData exportResultData = mayCurUtils.synchronizeToMaycur(header, timestamp,
							paymentStatusUrlPath, "POST", "application/json", "UTF-8", dataMap);
					String exportResultCode = exportResultData.getCode();
					logger.info("update consume paymentstatus businesscode:" + businessCode + " result code:"
							+ exportResultCode);
					if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(exportResultCode)) {
						MayCurConsumeSubmitExample updateExample = new MayCurConsumeSubmitExample();
						updateExample.createCriteria().andReportIdEqualTo(businessCode).andPaymentstatusEqualTo(0);
						MayCurConsumeSubmit updateRecord = new MayCurConsumeSubmit();
						updateRecord.setReportId(businessCode);
						updateRecord.setPaymentstatus(1);
						updateRecord.setPaymenttime(currDateTime);
						updateRecord.setStatus("COMPLETED");
						mayCurConsumeSubmitService.updateByExampleSelective(updateRecord, updateExample);
					}

				}
			}
		}

		logger.info("end update consume paymentstatus");

	}

}
