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
import com.yycoin.service.ITCenterPayListLogService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DateUtils;
import com.yycoin.util.MayCurConfigProperties;
import com.yycoin.util.MayCurUtils;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;
import com.yycoin.vo.TCenterPayListLog;
import com.yycoin.vo.TCenterPayListLogExample;
import com.yycoin.vo.travelapply.TCenterOaStaffer;

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
	private ITCenterPayListLogService tcenterPayListLogService;

	@Autowired
	private IOaStafferService oaStafferService;

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
					// 同一笔报销单多笔付款的情况下，只有全部支付成功，才通知每刻支付成功
					TCenterPayListLogExample payListTotalExample = new TCenterPayListLogExample();
					payListTotalExample.createCriteria().andOutidEqualTo(oaOrderId);
					int totalCount = tcenterPayListLogService.countByExample(payListTotalExample);
					if (totalCount == 0) {
						continue;
					}

					TCenterPayListLogExample payListSuccessExample = new TCenterPayListLogExample();
					payListSuccessExample.createCriteria().andOutidEqualTo(oaOrderId).andStatusEqualTo("3");
					int successCount = tcenterPayListLogService.countByExample(payListSuccessExample);
					if (totalCount == successCount) {
						List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
						Map<String, Object> map = new HashMap<String, Object>();
						Map<String, Object> dataMap = new HashMap<String, Object>();
						map.put("formNo", businessCode);
						map.put("type", "REIMBURSE");
						// 取任意一笔付款账户
						List<TCenterPayListLog> payLogList = tcenterPayListLogService
								.selectByExample(payListSuccessExample);
						TCenterPayListLog payLog = payLogList.get(0);
						map.put("payerAccountCode", payLog.getPayaccount());
						list.add(map);
						String oaStafferId = payLog.getOperator();
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
					// 同一笔报销单多笔付款的情况下，只有全部支付成功，才通知每刻支付成功
					TCenterPayListLogExample payListTotalExample = new TCenterPayListLogExample();
					payListTotalExample.createCriteria().andOutidEqualTo(oaOrderId);
					int totalCount = tcenterPayListLogService.countByExample(payListTotalExample);
					if (totalCount == 0) {
						continue;
					}

					TCenterPayListLogExample payListSuccessExample = new TCenterPayListLogExample();
					payListSuccessExample.createCriteria().andOutidEqualTo(oaOrderId).andStatusEqualTo("3");
					int successCount = tcenterPayListLogService.countByExample(payListSuccessExample);
					if (totalCount == successCount) {
						// 取任意一笔付款账户
						List<TCenterPayListLog> payLogList = tcenterPayListLogService
								.selectByExample(payListSuccessExample);
						TCenterPayListLog payLog = payLogList.get(0);
						List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
						Map<String, Object> map = new HashMap<String, Object>();
						map.put("formNo", businessCode);
						map.put("type", "PRECONSUME");
						map.put("payerAccountCode", payLog.getPayaccount());
						list.add(map);
						Map<String, Object> dataMap = new HashMap<String, Object>();
						String oaStafferId = payLog.getOperator();
						TCenterOaStaffer oaStaffer = oaStafferService.selectByPrimaryKey(Integer.valueOf(oaStafferId));
						String stafferCode = oaStaffer.getCode().trim();
						dataMap.put("employeeId", stafferCode);
						dataMap.put("formData", list);
						MayCurResultData exportResultData = mayCurUtils.synchronizeToMaycur(header, timestamp,
								paymentStatusUrlPath, "POST", "application/json", "UTF-8", list);
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
		}

		logger.info("end update consume paymentstatus");

	}

}
