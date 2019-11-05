package com.yycoin.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.china.center.tools.FileTools;
import com.china.center.tools.ListTools;
import com.china.center.tools.SequenceTools;
import com.china.center.tools.StringTools;
import com.china.center.tools.TimeTools;
import com.yycoin.dao.IMayCurRepaymentSubmitDao;
import com.yycoin.pojo.maycur.repayment.detail.resp.Attachments;
import com.yycoin.pojo.maycur.repayment.detail.resp.Operationlogs;
import com.yycoin.pojo.maycur.repayment.detail.resp.Repayments;
import com.yycoin.service.IMayCurRepaymentSubmitService;
import com.yycoin.service.IOaStafferService;
import com.yycoin.service.common.ICommonSequenceService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.CommonConfigProperties;
import com.yycoin.util.CommonSequenceUtils;
import com.yycoin.util.DateUtils;
import com.yycoin.util.FinanceHelper;
import com.yycoin.util.ImageUtils;
import com.yycoin.util.TaxHelper;
import com.yycoin.util.Util;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitMapper;
import com.yycoin.vo.MayCurRepaymentDetailRootWithBLOBs;
import com.yycoin.vo.MayCurRepaymentSubmit;
import com.yycoin.vo.MayCurRepaymentSubmitExample;
import com.yycoin.vo.TCenterApproveLog;
import com.yycoin.vo.TCenterApproveLogMapper;
import com.yycoin.vo.TCenterBank;
import com.yycoin.vo.TCenterBankExample;
import com.yycoin.vo.TCenterBankMapper;
import com.yycoin.vo.TCenterDutyEntity;
import com.yycoin.vo.TCenterDutyEntityMapper;
import com.yycoin.vo.TCenterFinance;
import com.yycoin.vo.TCenterFinanceExample;
import com.yycoin.vo.TCenterFinanceItem;
import com.yycoin.vo.TCenterFinanceItemMapper;
import com.yycoin.vo.TCenterFinanceMapper;
import com.yycoin.vo.TCenterTax;
import com.yycoin.vo.TCenterTaxExample;
import com.yycoin.vo.TCenterTaxMapper;
import com.yycoin.vo.TCenterTcpExpense;
import com.yycoin.vo.TCenterTcpExpenseMapper;
import com.yycoin.vo.bill.TCenterInBill;
import com.yycoin.vo.bill.TCenterInBillMapper;
import com.yycoin.vo.travelapply.TCenterOaAttachment;
import com.yycoin.vo.travelapply.TCenterOaAttachmentMapper;
import com.yycoin.vo.travelapply.TCenterOaStaffer;
import com.yycoin.vo.travelapply.TCenterOaStafferExample;
import com.yycoin.vo.travelapply.TCenterTcpApply;
import com.yycoin.vo.travelapply.TCenterTcpApplyMapper;
import com.yycoin.vo.travelapply.TCenterTcpShare;
import com.yycoin.vo.travelapply.TCenterTcpShareMapper;

@Service
public class MayCurRepaymentSubmitServiceImpl implements IMayCurRepaymentSubmitService {

	private static Logger logger = LoggerFactory.getLogger(MayCurRepaymentSubmitServiceImpl.class);

	@Autowired
	private IMayCurRepaymentSubmitDao mayCurRepaymentSubmitDao;

	@Autowired
	private ICommonSequenceService commonSequenceService;

	@Autowired
	private TCenterTcpExpenseMapper tcpExpenseMapper;

	@Autowired
	private MayCurConsumeSubmitMapper consumeSubmitMapper;

	@Autowired
	private IOaStafferService oaStafferService;

	@Autowired
	private CommonConfigProperties commonConfigProperties;

	@Autowired
	private TCenterTcpApplyMapper tcpApplyMapper;

	@Autowired
	private TCenterOaAttachmentMapper attachementMapper;

	@Autowired
	private TCenterTcpShareMapper tcpShareMapper;

	@Autowired
	private TCenterApproveLogMapper approveLogMapper;

	@Autowired
	private TCenterTaxMapper taxMapper;

	@Autowired
	private TCenterDutyEntityMapper dutyEntityMapper;

	@Autowired
	private TCenterFinanceMapper financeMapper;

	@Autowired
	private TCenterFinanceItemMapper financeItemMapper;

	@Autowired
	private TCenterInBillMapper inBillMapper;

	@Autowired
	private TCenterBankMapper bankMapper;

	@Override
	public int countByExample(MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mayCurRepaymentSubmitDao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurRepaymentSubmit record) {
		return mayCurRepaymentSubmitDao.insert(record);
	}

	@Override
	public int insertSelective(MayCurRepaymentSubmit record) {
		return mayCurRepaymentSubmitDao.insertSelective(record);
	}

	@Override
	public List<MayCurRepaymentSubmit> selectByExample(MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.selectByExample(example);
	}

	@Override
	public MayCurRepaymentSubmit selectByPrimaryKey(String reportId) {
		return mayCurRepaymentSubmitDao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example) {
		return mayCurRepaymentSubmitDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurRepaymentSubmit record) {
		return mayCurRepaymentSubmitDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurRepaymentSubmit record) {
		return mayCurRepaymentSubmitDao.updateByPrimaryKey(record);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveSubmitData2OA(MayCurRepaymentSubmit repaymentSubmit,
			MayCurRepaymentDetailRootWithBLOBs repaymentSubmitDetail) throws Exception {

		String currDateTime = DateUtils.getCurrDateTime();

		TCenterTcpExpense tcpExpense = new TCenterTcpExpense();

		// 报销
		String sequence = commonSequenceService.getSquenceString20();
		String applyId = CommonSequenceUtils.getSquenceString20(BaseContants.COMMON_SEQUENCE_UT_PREFIX, sequence);

		// 根据冲借款项，查找冲借款关联的借款申请单
		List<Repayments> repaymentList = JSONObject.parseArray(repaymentSubmitDetail.getRepayments(), Repayments.class);
		List<String> repaymentConsumeOaIdList = new ArrayList<String>();
		BigDecimal writeOffAmount = new BigDecimal(0);
		BigDecimal writeOffOrignalAmount = new BigDecimal(0);
		if (repaymentList != null && repaymentList.size() > 0) {
			for (Repayments repayments : repaymentList) {
				String repaymentReportId = repayments.getReport_id();
				MayCurConsumeSubmit consumeSubmit = consumeSubmitMapper.selectByPrimaryKey(repaymentReportId);
				if (consumeSubmit == null) {
					throw new Exception(
							"repayment relation consume report id:" + repaymentReportId + " has no consume data");
				}
				if (StringUtils.isEmpty(consumeSubmit.getOaorderid())) {
					throw new Exception(
							"repayment relation consume report id:" + repaymentReportId + " has no oa data");
				}
				repaymentConsumeOaIdList.add(consumeSubmit.getOaorderid());
				writeOffAmount = writeOffAmount.add(new BigDecimal(repayments.getApprovedAmount()));
				writeOffOrignalAmount = writeOffOrignalAmount.add(new BigDecimal(repayments.getApprovedAmount()));
			}
		}
		writeOffAmount = writeOffAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
		writeOffAmount = writeOffAmount.multiply(new BigDecimal(10000));

		writeOffOrignalAmount = writeOffOrignalAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal _100AmountDec = writeOffOrignalAmount.multiply(new BigDecimal(100));

		logger.info("create repayment tcp expanse,id:" + applyId);

		tcpExpense.setId(applyId);
		// 报销人工号
		String reim_user_code = repaymentSubmit.getReimUserCode();

		TCenterOaStafferExample oaStafferExample = new TCenterOaStafferExample();
		oaStafferExample.createCriteria().andCodeEqualTo(reim_user_code).andZzztEqualTo("在职")
				.andIndustryid3EqualTo(repaymentSubmit.getDepartmentbusinesscode());
		List<TCenterOaStaffer> stafferList = oaStafferService.selectByExample(oaStafferExample);
		if (stafferList.size() == 0) {
			logger.error("query staffer error, staffer code:" + reim_user_code);
			return;
		}
		tcpExpense.setName(repaymentSubmit.getName());
		tcpExpense.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
		TCenterOaStaffer oaStaffer = stafferList.get(0);
		tcpExpense.setStafferid(oaStaffer.getId().toString());
		tcpExpense.setBorrowstafferid(oaStaffer.getId().toString());
		tcpExpense.setDepartmentid(oaStaffer.getIndustryid3());
		tcpExpense.setType(BaseContants.TCP_EXPENSETYPE_PUBLIC);
		tcpExpense.setRefmoney(_100AmountDec.longValue());
		tcpExpense.setLastmoney(_100AmountDec.longValue());
		tcpExpense.setTicikcount(0);
		// 员工付款给公司
		tcpExpense.setPaytype(2);

		// 结束
		tcpExpense.setStatus(BaseContants.TRAVELAPPLYSTATUS_99);
		String createAt = repaymentSubmit.getCreatedat();
		String submitDateString = currDateTime;
		String submitBeginDateString = DateUtils.getCurrDate();
		if (StringUtils.isNotEmpty(createAt)) {
			submitDateString = DateUtils.longToDate(Long.valueOf(createAt));
			submitBeginDateString = DateUtils.longToDateYYYYMMDD(Long.valueOf(repaymentSubmit.getCreatedat()));
		}
		tcpExpense.setLogtime(submitDateString);
		tcpExpense.setBegindate(submitBeginDateString);
		tcpExpense.setDescription(repaymentSubmit.getName());

//		BigDecimal amountDec = new BigDecimal(repaymentSubmit.getAmount());
//		amountDec = amountDec.multiply(new BigDecimal(100));
		tcpExpense.setTotal(0L);
		tcpExpense.setBorrowtotal(0L);
		tcpExpense.setDutyid(BaseContants.DEFAULR_DUTY_ID);

		tcpExpenseMapper.insert(tcpExpense);

		logger.info("create repayment expense share,id:" + applyId);
		// 暂时定义为分担100
		TCenterTcpShare tcpShare = new TCenterTcpShare();
		String shareSequence = commonSequenceService.getSquenceString20();
		String shareId = CommonSequenceUtils.getSquenceString20(shareSequence);
		tcpShare.setId(shareId);
		tcpShare.setRefid(applyId);
		tcpShare.setBudgetid("");
		tcpShare.setDepartmentid(oaStaffer.getIndustryid3());
		tcpShare.setApproverid("");
		tcpShare.setRatio(0);
		tcpShare.setRealmonery(new Long(10000));
		tcpShare.setBearid(oaStaffer.getId().toString());

		tcpShareMapper.insert(tcpShare);

		// 生成收款单数据
		TCenterInBill inBill = new TCenterInBill();
		String inBillSequence = commonSequenceService.getSquenceString20();
		String inBillId = CommonSequenceUtils.getSquenceString20("SF", inBillSequence);
		inBill.setId(inBillId);
		// 个人付款
		inBill.setType(6);
		inBill.setUlock(1);
		inBill.setOutid(applyId);
		inBill.setStatus(0);
		inBill.setMoneys(writeOffOrignalAmount.doubleValue());
		inBill.setStafferid("551306184");
		inBill.setOwnerid(oaStaffer.getId().toString());
		inBill.setLocationid(oaStaffer.getLocationid());
		inBill.setLogtime(submitDateString);
		inBill.setDescription("日常费用报销申请报销还款金额:" + applyId);
		inBill.setCheckstatus(1);
		inBill.setSrcmoneys(writeOffOrignalAmount.doubleValue());
		inBill.setMtype(1);
		inBill.setDutyid(BaseContants.DEFAULR_DUTY_ID);
		// 收款账户
		String repaymentAccountNumber = repaymentSubmitDetail.getRepaymentaccountnumber();
		if (StringUtils.isEmpty(repaymentAccountNumber)) {
			repaymentAccountNumber = BaseContants.DEFAULT_BANK_PAY_ACCOUNT;
		}

		TCenterBankExample bankExample = new TCenterBankExample();
		bankExample.createCriteria().andBanknoEqualTo(repaymentAccountNumber);
		List<TCenterBank> bankList = bankMapper.selectByExample(bankExample);
		if (bankList.size() > 0) {
			TCenterBank bank = bankList.get(0);
			inBill.setBankid(bank.getId());
		}
		inBillMapper.insert(inBill);

		if (repaymentConsumeOaIdList.size() > 0) {
			for (String oaId : repaymentConsumeOaIdList) {
				// 关联申请单set refid
				TCenterTcpExpense updateExpense = new TCenterTcpExpense();
				updateExpense.setRefid(oaId);
				updateExpense.setId(applyId);
				tcpExpenseMapper.updateByPrimaryKeySelective(updateExpense);
			}
		}

		logger.info("create repayment apply attachement,id:" + applyId);
		// 附件
		List<Attachments> attachmentsJsonList = JSONObject.parseArray(repaymentSubmitDetail.getAttachments(),
				Attachments.class);
		for (Attachments attachments : attachmentsJsonList) {
			String fileName = attachments.getFileName();
			if (StringUtils.isEmpty(fileName)) {
				// 无文件名的时候，每刻有异常，不能下载附件
				continue;
			}
			String fileUrl = attachments.getFileUrl();
			if (StringUtils.isEmpty(fileUrl)) {
				// 无附件url的时候，每刻有异常，不能下载附件
				continue;
			}
			String attachePath = commonConfigProperties.getTcpAttachmentPath();

			String savePath = mkdir(attachePath);

			String fileAlais = SequenceTools.getSequence();

			String rabsPath = '/' + savePath + '/' + fileAlais + "." + FileTools.getFilePostfix(fileName).toLowerCase();

			String filePath = attachePath + '/' + rabsPath;

			String imageType = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());

			if ("jpg".equalsIgnoreCase(imageType) || "bmp".equalsIgnoreCase(imageType)
					|| "jpeg".equalsIgnoreCase(imageType) || "png".equalsIgnoreCase(imageType)
					|| "gif".equalsIgnoreCase(imageType)) {
				ImageUtils.downloadPictureByUrl(filePath, imageType, fileUrl);

			} else {
				ImageUtils.downloadFileByUrl(filePath, imageType, fileUrl);
			}

			TCenterOaAttachment oaAttachement = new TCenterOaAttachment();
			String attacheSequence = commonSequenceService.getSquenceString20();
			String attacheId = CommonSequenceUtils.getSquenceString20(attacheSequence);
			oaAttachement.setId(attacheId);
			oaAttachement.setLogtime(currDateTime);
			oaAttachement.setName(fileName);
			oaAttachement.setPath(rabsPath);
			oaAttachement.setRefid(applyId);
			attachementMapper.insert(oaAttachement);
		}

		logger.info("create repaymant tcp apply,id:" + applyId);
		// 申请总表
		TCenterTcpApply tcpApply = new TCenterTcpApply();
		tcpApply.setId(applyId);
		tcpApply.setName(applyId);
		tcpApply.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
		tcpApply.setApplyid(applyId);
		tcpApply.setApplyerid(oaStaffer.getId().toString());
		tcpApply.setDepartmentid(oaStaffer.getIndustryid3());
		tcpApply.setType(13);
		tcpApply.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
		tcpApply.setTotal(0L);
		tcpApply.setLogtime(currDateTime);
		tcpApply.setDescription(repaymentSubmit.getName());
		tcpApply.setPaytype(2);
		tcpApplyMapper.insert(tcpApply);

		logger.info("create repaymant approve log,id:" + applyId);
		// 流程日志
		List<Operationlogs> operationJsonList = JSONObject.parseArray(repaymentSubmitDetail.getOperationlogs(),
				Operationlogs.class);
		for (int i = 0; i < operationJsonList.size(); i++) {
			Operationlogs operationlogs = operationJsonList.get(i);
			TCenterApproveLog approveLog = new TCenterApproveLog();
			approveLog.setFullid(applyId);
			approveLog.setOprmode(0);
			approveLog.setActor(operationlogs.getUserName());
			approveLog.setActorid(oaStaffer.getId().toString());
			approveLog.setDescription(operationlogs.getComment());
			approveLog.setLogtime(DateUtils.longToDate(Long.valueOf(operationlogs.getOpTime())));
			if (i == 0) {
				approveLog.setPrestatus(0);
				approveLog.setAfterstatus(-1);
			} else {
				if (i == operationJsonList.size() - 1) {
					approveLog.setFullid(applyId);
					approveLog.setOprmode(0);
					approveLog.setActor("系统");
					approveLog.setActorid("99999999");
					approveLog.setDescription("系统自动审批通过");
					approveLog.setLogtime(currDateTime);
					approveLog.setPrestatus(22);
					approveLog.setPrestatus(-1);
					approveLog.setAfterstatus(BaseContants.TRAVELAPPLYSTATUS_99);
				} else {
					approveLog.setPrestatus(-1);
					approveLog.setAfterstatus(-1);
				}
			}
			approveLogMapper.insert(approveLog);
		}
		if (operationJsonList.size() == 1) {
			TCenterApproveLog approveLog = new TCenterApproveLog();
			approveLog.setFullid(applyId);
			approveLog.setOprmode(0);
			approveLog.setActor("系统");
			approveLog.setActorid("99999999");
			approveLog.setDescription("系统自动审批通过");
			approveLog.setLogtime(currDateTime);
			approveLog.setPrestatus(22);
			approveLog.setPrestatus(-1);
			approveLog.setAfterstatus(BaseContants.TRAVELAPPLYSTATUS_99);
			approveLogMapper.insert(approveLog);
		}

		// 生成凭证
		addRepaymentFinanceBean(tcpExpense, writeOffAmount, oaStaffer, inBill);

		logger.info("update maycur repayment data,id:" + repaymentSubmit.getReportId());
		// 更新每刻单据表的状态和orderid
		MayCurRepaymentSubmit updateRecord = new MayCurRepaymentSubmit();
		updateRecord.setReportId(repaymentSubmit.getReportId());
		updateRecord.setOaorderid(applyId);
		updateRecord.setCreateflag(1);
		updateRecord.setCreatetime(currDateTime);
		mayCurRepaymentSubmitDao.updateByPrimaryKeySelective(updateRecord);

	}

	/**
	 * 生成凭证
	 * 
	 * @param tcpExpense
	 * @param repaymentAmountDec
	 * @param oaStaffer
	 * @throws Exception
	 */
	public void addRepaymentFinanceBean(TCenterTcpExpense tcpExpense, BigDecimal repaymentAmountDec,
			TCenterOaStaffer oaStaffer, TCenterInBill inBill) throws Exception {
		List<String> taxIdList = new ArrayList<>();
		List<Long> moneyList = new ArrayList<>();
		List<String> stafferIdList = new ArrayList<>();
		taxIdList.add("1133-01");
		stafferIdList.add(oaStaffer.getId().toString());
		moneyList.add(repaymentAmountDec.multiply(new BigDecimal(-1)).longValue());
		// prepare data finish

		TCenterFinance financeBean = new TCenterFinance();

		StringBuilder builder = new StringBuilder();
		builder.append(tcpExpense.getDescription() + ",");
		builder.append("日常费用报销");
		builder.append("报销最终通过:");

		builder.append(tcpExpense.getId() + ".");

		String name = builder.toString();

		financeBean.setName(name);

		financeBean.setCreatetype(BaseContants.FINANCE_CREATETYPE_EXPENSE_PUBLIC);

		financeBean.setRefid(tcpExpense.getId());

		financeBean.setRefbill(inBill.getId());

		financeBean.setDutyid(tcpExpense.getDutyid());

		financeBean.setDescription(financeBean.getName());

		financeBean.setFinancedate(TimeTools.now_short());

		financeBean.setLogtime(TimeTools.now());

		List<TCenterFinanceItem> itemList = new ArrayList<TCenterFinanceItem>();

		// 各种费用/备用金
		createAddItem4(tcpExpense, taxIdList, moneyList, financeBean, itemList, stafferIdList, inBill.getBankid());

		financeBean.setItemList(itemList);

		this.addInner(financeBean);

	}

	public void addInner(TCenterFinance bean) throws Exception {
		String appName = "体内";
		String sequence = commonSequenceService.getSquenceString20();
		String financeId = CommonSequenceUtils.getSquenceString20(BaseContants.COMMON_SEQUENCE_PZ_PREFIX, sequence);
		bean.setId(financeId);

		bean.setName(financeId);
		logger.info(appName + " addInner for FinanceBean id:{}", bean.getId());
		if (StringTools.isNullOrNone(bean.getCreaterid())) {
			// TODO bean.setCreaterId(user.getStafferId());
		}

		// 允许自己制定凭证日期
		if (StringTools.isNullOrNone(bean.getFinancedate())) {
			bean.setFinancedate(TimeTools.now_short());
		}

		// 入库时间
		bean.setLogtime(TimeTools.now());

		TCenterDutyEntity duty = dutyEntityMapper.selectByPrimaryKey(bean.getDutyid());

		// 管理属性
		bean.setType(duty.getMtype());

		List<TCenterFinanceItem> itemList = bean.getItemList();

		boolean isTurn = FinanceHelper.isTurnFinance(itemList);

		Map<String, List<TCenterFinanceItem>> pareMap = new HashMap<String, List<TCenterFinanceItem>>();

		long inTotal = 0;

		long outTotal = 0;

		// 整理出凭证对(且校验凭证的合法性)
		for (TCenterFinanceItem financeItemBean : itemList) {
			String sequenceItem = commonSequenceService.getSquenceString20();
			String itemId = CommonSequenceUtils.getSquenceString20(BaseContants.COMMON_SEQUENCE_PZ_PREFIX,
					sequenceItem);
			financeItemBean.setId(itemId);

			financeItemBean.setFinancedate(bean.getFinancedate());

			financeItemBean.setName(financeItemBean.getId());

			FinanceHelper.copyFinanceItem(bean, financeItemBean);

			financeItemBean.setPid(financeId);

			financeItemBean.setType(bean.getType());

			String taxId = financeItemBean.getTaxid();

			if (StringTools.isNullOrNone(taxId)) {
				String msg = "缺少科目信息,请确认操作";
				logger.error(msg);
				throw new Exception(msg);
			}

			// 其他应收款_备用金
			TCenterTax tax = taxMapper.selectByPrimaryKey(taxId);

			if (tax == null) {
				String msg = "科目不存在,请确认操作:" + taxId;
				logger.error(msg);
				throw new Exception(msg);
			}

			// 拷贝凭证的父级ID
			TaxHelper.copyParent(financeItemBean, tax);

			String key = financeItemBean.getPareid();

			if (pareMap.get(key) == null) {
				pareMap.put(key, new ArrayList<TCenterFinanceItem>());
			}

			pareMap.get(key).add(financeItemBean);

			// 必须有一个为0
			if (financeItemBean.getInmoney() * financeItemBean.getOutmoney() != 0) {
				String msg = financeItemBean.getId() + "借方金额或者贷方金额不能都不为0";
				logger.error(msg);
				throw new Exception(msg);
			}

			inTotal += financeItemBean.getInmoney();

			outTotal += financeItemBean.getOutmoney();

			logger.debug("getInmoney():" + financeItemBean.getInmoney() + ", getOutmoney():"
					+ financeItemBean.getOutmoney());
		}
		bean.setInmoney(inTotal);

		bean.setOutmoney(outTotal);

		TCenterFinanceExample financeExample = new TCenterFinanceExample();

		int maxMonthIndex = financeMapper.findMaxMonthIndex(financeExample);

		// 设置MonthIndex(高并发会重复)
		bean.setMonthindex(maxMonthIndex);

		financeMapper.insert(bean);

		for (TCenterFinanceItem record : itemList) {
			financeItemMapper.insert(record);
		}

		// 2015/4/28 add debug info for 5101
		if (!ListTools.isEmptyOrNull(itemList)) {
			logger.info("created FinanceItemBean size:" + itemList.size());
			for (TCenterFinanceItem item : itemList) {
				if ("5101".equals(item.getTaxid()) || "5101".equals(item.getTaxid0())) {
					logger.info(item.getId() + " saved with getInmoney:" + item.getInmoney() + "***getOutmoney:"
							+ item.getOutmoney());
				}
			}
		}

	}

	/**
	 * 各种费用/备用金
	 * 
	 * @param bean
	 * @param financeBean
	 * @param itemList
	 * @throws MYException
	 */
	public void createAddItem4(TCenterTcpExpense bean, List<String> taxIds, List<Long> moneyList,
			TCenterFinance financeBean, List<TCenterFinanceItem> itemList, List<String> stafferIdList, String bankId)
			throws Exception {

		logger.info("****************createAddItem4*************");
		// 收款人
		// StafferBean staffer = stafferDAO.find(bean.getBorrowStafferId());

		TCenterOaStaffer staffer = oaStafferService.selectByPrimaryKey(Util.getInteger(bean.getBorrowstafferid()));

		if (staffer == null) {
			throw new Exception("数据错误,请确认操作");
		}

//       String name = "报销最终入账:" + bean.getId() + '.';

		String pareId = commonSequenceService.getSquenceString20();

		long total = 0L;

		// 借方
		for (int i = 0; i < taxIds.size(); i++) {
			String eachTaxId = taxIds.get(i);

			TCenterOaStaffer inStaffer = null;

			// 通用报销可能费用的花销人是A，但是收款人是B
			if (StringTools.isNullOrNone(stafferIdList.get(i))) {
				inStaffer = staffer;
			} else {
				inStaffer = oaStafferService.selectByPrimaryKey(Util.getInteger(stafferIdList.get(i)));

				if (inStaffer == null) {
					throw new Exception("数据错误,请确认操作");
				}
			}

			TCenterFinanceItem itemIn = new TCenterFinanceItem();

			itemIn.setPareid(pareId);

			itemIn.setName(this.getInName(bean));

			itemIn.setForward(BaseContants.TAX_FORWARD_IN);

			FinanceHelper.copyFinanceItem(financeBean, itemIn);

			// 费用科目
			TCenterTax inTax = taxMapper.selectByPrimaryKey(eachTaxId);

			if (inTax == null) {
				throw new Exception("数据错误,请确认操作");
			}

			// 科目拷贝
			FinanceHelper.copyTax(inTax, itemIn);

			itemIn.setInmoney(moneyList.get(i));
			logger.info("****itemIn inMoney****" + moneyList.get(i));

			total += moneyList.get(i);

			itemIn.setOutmoney(0L);

			itemIn.setDescription(itemIn.getName());

			// 辅助核算 部门和职员
			itemIn.setDepartmentid(inStaffer.getPrincipalshipid());
			itemIn.setStafferid(Util.getString(inStaffer.getId()));

			itemList.add(itemIn);
		}

		// 贷方
		TCenterFinanceItem itemOut = new TCenterFinanceItem();

		itemOut.setPareid(pareId);

		String name = "还款:" + bean.getId() + '.';
		itemOut.setName("银行科目:" + name);

		itemOut.setForward(BaseContants.TAX_FORWARD_OUT);

		FinanceHelper.copyFinanceItem(financeBean, itemOut);

		// 银行存款科目
		TCenterTaxExample taxExample = new TCenterTaxExample();
		taxExample.createCriteria().andRefidEqualTo(bankId).andReftypeEqualTo(0);
		List<TCenterTax> taxList = taxMapper.selectByExample(taxExample);
		if (taxList.size() == 0) {
			throw new Exception("缺少银行存款科目,请确认操作,银行id:" + bankId);
		}
		TCenterTax outTax = taxList.get(0);

		// 科目拷贝
		FinanceHelper.copyTax(outTax, itemOut);

		itemOut.setInmoney(0L);

		itemOut.setOutmoney(total);

		itemOut.setDescription(itemOut.getName());

		// 辅助核算 部门和职员
		itemOut.setDepartmentid(staffer.getPrincipalshipid());
		itemOut.setStafferid(Util.getString(staffer.getId()));

		// 辅助核算 NA
		itemList.add(itemOut);
	}

	private String getInName(TCenterTcpExpense bean) {
		String inName = "申请事由:" + bean.getDescription() + ":" + bean.getId() + ".";
		return inName;
	}

	private String mkdir(String root) {
		String path = TimeTools.now("yyyy/MM/dd/HH") + "/"
				+ SequenceTools.getSequence(String.valueOf(new Random().nextInt(1000)));

		FileTools.mkdirs(root + '/' + path);

		return path;
	}

}
