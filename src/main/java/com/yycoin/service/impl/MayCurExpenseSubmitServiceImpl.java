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
import com.yycoin.dao.IMayCurExpenseSubmitDao;
import com.yycoin.pojo.maycur.MayCurAuthInfo;
import com.yycoin.pojo.maycur.MayCurResultData;
import com.yycoin.pojo.maycur.consume.detail.resp.Attachments;
import com.yycoin.pojo.maycur.consume.detail.resp.Expenses;
import com.yycoin.pojo.maycur.consume.detail.resp.Operationlogs;
import com.yycoin.pojo.maycur.employee.Departments;
import com.yycoin.pojo.maycur.employee.MayCurEmployee;
import com.yycoin.pojo.maycur.expense.detail.resp.Correlation;
import com.yycoin.pojo.maycur.expense.detail.resp.ExpenseAllocations;
import com.yycoin.pojo.maycur.expense.detail.resp.Payment;
import com.yycoin.pojo.maycur.expense.detail.resp.Repayments;
import com.yycoin.service.IMayCurExpenseDetailRootService;
import com.yycoin.service.IMayCurExpenseSubmitService;
import com.yycoin.service.IOaStafferService;
import com.yycoin.service.common.ICommonSequenceService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.CommonConfigProperties;
import com.yycoin.util.CommonSequenceUtils;
import com.yycoin.util.DateUtils;
import com.yycoin.util.FinanceHelper;
import com.yycoin.util.ImageUtils;
import com.yycoin.util.MayCurConfigProperties;
import com.yycoin.util.MayCurExpenseTypeEnum;
import com.yycoin.util.MayCurUtils;
import com.yycoin.util.TaxHelper;
import com.yycoin.util.Util;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitMapper;
import com.yycoin.vo.MayCurExpenseDetailRootWithBLOBs;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;
import com.yycoin.vo.TCenterApproveLog;
import com.yycoin.vo.TCenterApproveLogMapper;
import com.yycoin.vo.TCenterDutyEntity;
import com.yycoin.vo.TCenterDutyEntityMapper;
import com.yycoin.vo.TCenterFeeitem;
import com.yycoin.vo.TCenterFeeitemMapper;
import com.yycoin.vo.TCenterFinance;
import com.yycoin.vo.TCenterFinanceExample;
import com.yycoin.vo.TCenterFinanceItem;
import com.yycoin.vo.TCenterFinanceItemMapper;
import com.yycoin.vo.TCenterFinanceMapper;
import com.yycoin.vo.TCenterGroup;
import com.yycoin.vo.TCenterGroupExample;
import com.yycoin.vo.TCenterGroupMapper;
import com.yycoin.vo.TCenterTax;
import com.yycoin.vo.TCenterTaxMapper;
import com.yycoin.vo.TCenterTcpApprove;
import com.yycoin.vo.TCenterTcpApproveMapper;
import com.yycoin.vo.TCenterTcpExpense;
import com.yycoin.vo.TCenterTcpExpenseMapper;
import com.yycoin.vo.TCenterVsGroupSta;
import com.yycoin.vo.TCenterVsGroupStaExample;
import com.yycoin.vo.TCenterVsGroupStaMapper;
import com.yycoin.vo.travelapply.TCenterOaAttachment;
import com.yycoin.vo.travelapply.TCenterOaAttachmentMapper;
import com.yycoin.vo.travelapply.TCenterOaStaffer;
import com.yycoin.vo.travelapply.TCenterOaStafferExample;
import com.yycoin.vo.travelapply.TCenterTcpApply;
import com.yycoin.vo.travelapply.TCenterTcpApplyMapper;
import com.yycoin.vo.travelapply.TCenterTcpShare;
import com.yycoin.vo.travelapply.TCenterTcpShareMapper;
import com.yycoin.vo.travelapply.TCenterTravelApply;
import com.yycoin.vo.travelapply.TCenterTravelApplyItem;
import com.yycoin.vo.travelapply.TCenterTravelApplyItemMapper;
import com.yycoin.vo.travelapply.TCenterTravelApplyMapper;
import com.yycoin.vo.travelapply.TCenterTravelApplyPay;
import com.yycoin.vo.travelapply.TCenterTravelApplyPayMapper;

@Service
public class MayCurExpenseSubmitServiceImpl implements IMayCurExpenseSubmitService, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCurExpenseSubmitServiceImpl.class);

	@Autowired
	private IMayCurExpenseSubmitDao dao;

	@Autowired
	private IMayCurExpenseDetailRootService mayCurExpenseDetailRootService;

	@Autowired
	private IMayCurExpenseSubmitService mayCurExpenseSubmitService;

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
	private TCenterTravelApplyPayMapper travelApplyPayMapper;

	@Autowired
	private TCenterOaAttachmentMapper attachementMapper;

	@Autowired
	private TCenterTcpShareMapper tcpShareMapper;

	@Autowired
	private TCenterVsGroupStaMapper groupStaMapper;

	@Autowired
	private TCenterGroupMapper groupMapper;

	@Autowired
	private TCenterTcpApproveMapper tcpApproveMapper;

	@Autowired
	private TCenterApproveLogMapper approveLogMapper;

	@Autowired
	private TCenterTravelApplyItemMapper travelApplyItemMapper;

	@Autowired
	private TCenterTaxMapper taxMapper;

	@Autowired
	private TCenterDutyEntityMapper dutyEntityMapper;

	@Autowired
	private TCenterFinanceMapper financeMapper;

	@Autowired
	private TCenterFinanceItemMapper financeItemMapper;

	@Autowired
	private TCenterFeeitemMapper feeitemMapper;

	@Autowired
	private TCenterTravelApplyMapper travelApplyMapper;

	@Autowired
	private MayCurConfigProperties mayCurConfigProperties;

	@Autowired
	private MayCurUtils mayCurUtils;

	@Override
	public int countByExample(MayCurExpenseSubmitExample example) {
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurExpenseSubmitExample example) {
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return dao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurExpenseSubmit record) {
		return dao.insert(record);
	}

	@Override
	public int insertSelective(MayCurExpenseSubmit record) {
		return dao.insertSelective(record);
	}

	@Override
	public List<MayCurExpenseSubmit> selectByExample(MayCurExpenseSubmitExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public MayCurExpenseSubmit selectByPrimaryKey(String reportId) {
		return dao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurExpenseSubmit record, MayCurExpenseSubmitExample example) {
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurExpenseSubmit record, MayCurExpenseSubmitExample example) {
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurExpenseSubmit record) {
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurExpenseSubmit record) {
		return dao.updateByPrimaryKey(record);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveSubmitData2OA(String reportId) throws Exception {
		if (StringUtils.isEmpty(reportId)) {
			logger.error("create expense oa data,report id is null");
			return;
		}
		MayCurExpenseSubmitExample submitExample = new MayCurExpenseSubmitExample();
		submitExample.createCriteria().andCreateflagEqualTo(0).andStatusEqualTo("SETTLEMENT")
				.andReportIdEqualTo(reportId);
		List<MayCurExpenseSubmit> submitList = mayCurExpenseSubmitService.selectByExample(submitExample);

		if (submitList.size() == 0) {
			logger.error("create expense oa data,report id is:" + reportId + ",query data is null");
			return;
		}
		MayCurExpenseSubmit submit = submitList.get(0);
		MayCurExpenseDetailRootWithBLOBs submitDetail = mayCurExpenseDetailRootService
				.selectByPrimaryKey(submit.getReportId());
		if (submitDetail == null) {
			logger.error("query expense submit detail error, reportid:" + submit.getReportId());
			return;
		}
		String subType = submitDetail.getFormsubtype();
		int expenseType = 0;
		if (BaseContants.MAYCUR_FORM_SUBTYPE_CLFBXD.equalsIgnoreCase(subType)) {
			expenseType = BaseContants.TCP_EXPENSETYPE_TRAVEL;
		} else if (BaseContants.MAYCUR_FORM_SUBTYPE_RCFYBX.equalsIgnoreCase(subType)) {
			expenseType = BaseContants.TCP_EXPENSETYPE_PUBLIC;
		} else if (BaseContants.MAYCUR_FORM_SUBTYPE_TYBX.equalsIgnoreCase(subType)) {
			expenseType = BaseContants.TCP_EXPENSETYPE_PUBLIC;
		} else {
			throw new Exception("report id:" + submit.getReportId() + " subType error");
		}

		String currDateTime = DateUtils.getCurrDateTime();

		TCenterTcpExpense tcpExpense = new TCenterTcpExpense();

		// 报销
		String sequence = commonSequenceService.getSquenceString20();
		String applyId = CommonSequenceUtils.getSquenceString20(BaseContants.COMMON_SEQUENCE_UT_PREFIX, sequence);

		logger.info("create travel apply pay,id:" + applyId);

		// 付款金额为0，表示借款与报销冲销，不生成收付款明细数据
		// 收款明细
		Payment payment = JSONObject.parseObject(submitDetail.getPayment(), Payment.class);
		String paymentAmount = payment.getPay_amount();
		if (StringUtils.isEmpty(paymentAmount)) {
			paymentAmount = "0";
		}
		BigDecimal paymentAmountDec = new BigDecimal(paymentAmount);
		paymentAmountDec = paymentAmountDec.multiply(new BigDecimal(100));

		if (paymentAmountDec.compareTo(new BigDecimal(0)) != 0) {
			TCenterTravelApplyPay travelPay = new TCenterTravelApplyPay();
			String applyPaySequence = commonSequenceService.getSquenceString20();
			String applyPayId = CommonSequenceUtils.getSquenceString20(applyPaySequence);
			travelPay.setId(applyPayId);
			travelPay.setParentid(applyId);
			travelPay.setReceivetype(1);
			travelPay.setBankname(payment.getCollectionBankBranchName());
			travelPay.setUsername(payment.getCollection_account_name());
			travelPay.setBankno(payment.getCollection_account());
			travelPay.setCdescription("ok");
			// 存在冲销借款的可能性，使用付款金额作为实际付款金额
			travelPay.setMoneys(paymentAmountDec.longValue());
			travelPay.setCmoneys(paymentAmountDec.longValue());
			travelPay.setBankprovince(payment.getCollectionBankProvince());
			travelPay.setBankcity(payment.getCollectionBankCity());
			travelPay.setPayflag("0");
			travelApplyPayMapper.insert(travelPay);
		}

		logger.info("create travel apply,id:" + applyId);

		tcpExpense.setId(applyId);
		// 报销人工号
		String reim_user_code = submit.getReimUserCode();
		// 承担人工号
		// String cover_user_code = submit.getCoverUserCode();

		// 根据工号查询每刻的员工部门编码
//		String deparmentCode = queryStafferDepartment(reim_user_code);

		TCenterOaStafferExample oaStafferExample = new TCenterOaStafferExample();
		oaStafferExample.createCriteria().andCodeEqualTo(reim_user_code).andZzztEqualTo("在职");
		List<TCenterOaStaffer> stafferList = oaStafferService.selectByExample(oaStafferExample);
		if (stafferList.size() == 0) {
			logger.error("query staffer error, staffer code:" + reim_user_code);
			return;
		}
		tcpExpense.setName(submitDetail.getName());
		tcpExpense.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
		TCenterOaStaffer oaStaffer = stafferList.get(0);
		tcpExpense.setStafferid(oaStaffer.getId().toString());
		tcpExpense.setBorrowstafferid(oaStaffer.getId().toString());
		tcpExpense.setDepartmentid(submit.getDepartmentbusinesscode());
		tcpExpense.setType(expenseType);

		tcpExpense.setTicikcount(1);
		tcpExpense.setPaytype(1);

		// 待财务支付
		tcpExpense.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
		String submitDateString = DateUtils.longToDate(Long.valueOf(submit.getCreatedat()));
		tcpExpense.setLogtime(submitDateString);
		tcpExpense.setBegindate(DateUtils.longToDateYYYYMMDD(Long.valueOf(submit.getCreatedat())));
		tcpExpense.setDescription(submitDetail.getName());

		BigDecimal amountDec = new BigDecimal(submit.getPayAmount());
		amountDec = amountDec.multiply(new BigDecimal(100));

		// 总费用为原报销批准金额
		BigDecimal approveAmountDec = new BigDecimal(submit.getApprovedamount());
		approveAmountDec = approveAmountDec.multiply(new BigDecimal(100));
		tcpExpense.setTotal(approveAmountDec.longValue());
		// 公司支付金额,对冲冲借款后的实际支付金额
		tcpExpense.setBorrowtotal(amountDec.longValue());
		tcpExpense.setDutyid(BaseContants.DEFAULR_DUTY_ID);
		if (paymentAmountDec.compareTo(new BigDecimal(0)) != 0) {
			// 查找处理人
			TCenterGroupExample groupExample = new TCenterGroupExample();
			groupExample.createCriteria().andNameEqualTo("报销-财务支付");
			List<TCenterGroup> groupList = groupMapper.selectByExample(groupExample);
			TCenterGroup group = groupList.get(0);
			String groupId = group.getId();
			TCenterVsGroupStaExample vsGroupStaExample = new TCenterVsGroupStaExample();
			vsGroupStaExample.createCriteria().andGroupidEqualTo(groupId);
			List<TCenterVsGroupSta> groupstaList = groupStaMapper.selectByExample(vsGroupStaExample);
			for (TCenterVsGroupSta groupSta : groupstaList) {
				String stafferId = groupSta.getStafferid();
				TCenterOaStaffer st = oaStafferService.selectByPrimaryKey(Integer.valueOf(stafferId));

				TCenterTcpApprove approve = new TCenterTcpApprove();
				String approveSequence = commonSequenceService.getSquenceString20();
				String approveId = CommonSequenceUtils.getSquenceString20(approveSequence);
				approve.setId(approveId);
				approve.setApplyid(applyId);
				approve.setName(submitDetail.getName());
				approve.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
				approve.setApplyerid(oaStaffer.getId().toString());
				approve.setApproverid(st.getId().toString());
				approve.setDepartmentid(submit.getDepartmentbusinesscode());
				approve.setType(expenseType);
				approve.setPool(1);
				approve.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
				approve.setTotal(paymentAmountDec.longValue());
				approve.setLogtime(submitDateString);
				approve.setStype(0);
				approve.setPaytype(1);
				approve.setChecktotal(paymentAmountDec.longValue());
				tcpApproveMapper.insert(approve);
			}
		}

		tcpExpenseMapper.insert(tcpExpense);

		logger.info("create travel apply item,id:" + applyId);
		// 费用明细
		List<Expenses> expensesJsonList = JSONObject.parseArray(submitDetail.getExpenses(), Expenses.class);
		List<TCenterTcpShare> tcpShareList = new ArrayList<TCenterTcpShare>();
		Map<String, TCenterTcpShare> tcpShareMap = new HashMap<String, TCenterTcpShare>();
		for (Expenses expenses : expensesJsonList) {
			TCenterTravelApplyItem applyItem = new TCenterTravelApplyItem();
			String applyItemSequence = commonSequenceService.getSquenceString20();
			String applyItemId = CommonSequenceUtils.getSquenceString20(applyItemSequence);
			applyItem.setId(applyItemId);
			applyItem.setParentid(applyId);
			String approvedAmount = expenses.getAmount_approved();
			String dateString = DateUtils.longToDate(Long.valueOf(expenses.getExchange_date()));
			applyItem.setBegindate(dateString);
			applyItem.setEnddate(dateString);
			String expense_type = expenses.getExpense_type();
			String feeItemId = MayCurExpenseTypeEnum.getEnumValueOf(expense_type).getValue();
			applyItem.setFeeitemid(feeItemId);
			BigDecimal approvedAmountBig = new BigDecimal(approvedAmount);
			approvedAmountBig = approvedAmountBig.multiply(new BigDecimal(100));
			applyItem.setMoneys(approvedAmountBig.longValue());
			applyItem.setCmoneys(approvedAmountBig.longValue());
			travelApplyItemMapper.insert(applyItem);

			// 分摊
			List<ExpenseAllocations> expenseAllocations = expenses.getExpenseAllocations();
			logger.info("create travel apply tcp share,id:" + applyId);
			for (ExpenseAllocations ea : expenseAllocations) {
				// 费用分担
				TCenterOaStafferExample oaStafferCoverExample = new TCenterOaStafferExample();
				oaStafferCoverExample.createCriteria().andCodeEqualTo(ea.getCoverEmployeeNo()).andZzztEqualTo("在职");
				List<TCenterOaStaffer> coverStafferList = oaStafferService.selectByExample(oaStafferCoverExample);
				if (coverStafferList.size() == 0) {
					logger.error("query staffer error, staffer code:" + ea.getCoverEmployeeNo());
					throw new Exception("query staffer error, staffer code:" + ea.getCoverEmployeeNo());
				}
				// 承担人id===oastafferid
				String bearId = String.valueOf(coverStafferList.get(0).getId());
				BigDecimal allocatedAmountDec = new BigDecimal(ea.getAllocatedAmount());
				allocatedAmountDec = allocatedAmountDec.multiply(new BigDecimal(100));

				// 相同承担人合并
				TCenterTcpShare existTcpShare = tcpShareMap.get(bearId);
				if (existTcpShare != null) {
					BigDecimal addAmount = new BigDecimal(existTcpShare.getRealmonery());
					addAmount = addAmount.add(allocatedAmountDec);
					existTcpShare.setRealmonery(addAmount.longValue());
					continue;
				}
				TCenterTcpShare tcpShare = new TCenterTcpShare();
				String shareSequence = commonSequenceService.getSquenceString20();
				String shareId = CommonSequenceUtils.getSquenceString20(shareSequence);
				tcpShare.setId(shareId);
				tcpShare.setRefid(applyId);
				tcpShare.setBudgetid("");
				tcpShare.setDepartmentid(ea.getCoverDepartmentBizCode());
				tcpShare.setApproverid("");
				tcpShare.setRatio(0);
				tcpShare.setRealmonery(allocatedAmountDec.longValue());
				tcpShare.setBearid(bearId);
				tcpShareMap.put(bearId, tcpShare);
				tcpShareList.add(tcpShare);

			}
		}

		for (TCenterTcpShare insertTcpShare : tcpShareList) {
			tcpShareMapper.insert(insertTcpShare);
		}

		// 先通过借款申请关联
		String consumeCode = "";
		logger.info("update expense to consume relation,id:" + applyId);
		for (Expenses expenses : expensesJsonList) {
			List<Correlation> correlationList = expenses.getCorrelation();
			if (correlationList != null) {
				for (Correlation co : correlationList) {
					String temp = co.getConsumeFormCode();
					if (StringUtils.isNotEmpty(temp)) {
						consumeCode = temp;
					}
				}
			}

		}

		if (StringUtils.isNotEmpty(consumeCode)) {
			// 关联申请单set refid
			MayCurConsumeSubmit consumeSubmit = consumeSubmitMapper.selectByPrimaryKey(consumeCode);
			if (consumeSubmit != null) {
				TCenterTcpExpense updateExpense = new TCenterTcpExpense();
				updateExpense.setRefid(consumeSubmit.getOaorderid());
				updateExpense.setId(applyId);
				tcpExpenseMapper.updateByPrimaryKeySelective(updateExpense);

			}
			// 将申请单的是否关联报销单的状态和refid修改
			TCenterTravelApply updateTravelApply = new TCenterTravelApply();

			updateTravelApply.setId(consumeSubmit.getOaorderid());
			updateTravelApply.setFeedback(1);
			updateTravelApply.setRefid(applyId);

			travelApplyMapper.updateByPrimaryKeySelective(updateTravelApply);
		}

		// 通过还款单数据关联申请单

		// 原借款金额
		BigDecimal repaymentAmountDec = new BigDecimal(0);
		List<Repayments> repaymentsJsonList = JSONObject.parseArray(submitDetail.getRepayments(), Repayments.class);
		if (repaymentsJsonList != null && repaymentsJsonList.size() > 0) {
			for (Repayments repayments : repaymentsJsonList) {
				consumeCode = repayments.getReport_id();
				String repaymentAmount = repayments.getApprovedAmount();
				repaymentAmountDec = repaymentAmountDec.add(new BigDecimal(repaymentAmount));
			}
			if (StringUtils.isNotEmpty(consumeCode)) {
				// 关联申请单set refid
				MayCurConsumeSubmit consumeSubmit = consumeSubmitMapper.selectByPrimaryKey(consumeCode);
				if (consumeSubmit != null) {
					TCenterTcpExpense updateExpense = new TCenterTcpExpense();
					updateExpense.setRefid(consumeSubmit.getOaorderid());
					updateExpense.setId(applyId);
					updateExpense.setRefmoney(repaymentAmountDec.multiply(new BigDecimal(100)).longValue());
					tcpExpenseMapper.updateByPrimaryKeySelective(updateExpense);
					// 将申请单的是否关联报销单的状态和refid修改
					TCenterTravelApply updateTravelApply = new TCenterTravelApply();

					updateTravelApply.setId(consumeSubmit.getOaorderid());
					updateTravelApply.setFeedback(1);
					updateTravelApply.setRefid(applyId);

					travelApplyMapper.updateByPrimaryKeySelective(updateTravelApply);
				}
			}
		}

		logger.info("create travel apply attachement,id:" + applyId);
		// 附件
		List<Attachments> attachmentsJsonList = JSONObject.parseArray(submitDetail.getAttachments(), Attachments.class);
		if (attachmentsJsonList != null && attachmentsJsonList.size() > 0) {
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

				String rabsPath = '/' + savePath + '/' + fileAlais + "."
						+ FileTools.getFilePostfix(fileName).toLowerCase();

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

			// 更新附件的张数
			TCenterTcpExpense updateExpenseTicket = new TCenterTcpExpense();
			updateExpenseTicket.setId(applyId);
			updateExpenseTicket.setTicikcount(attachmentsJsonList.size());
			tcpExpenseMapper.updateByPrimaryKeySelective(updateExpenseTicket);
		}

		logger.info("create travel apply tcp apply,id:" + applyId);
		// 申请总表
		TCenterTcpApply tcpApply = new TCenterTcpApply();
		tcpApply.setId(applyId);
		tcpApply.setName(applyId);
		tcpApply.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
		tcpApply.setApplyid(applyId);
		tcpApply.setApplyerid(oaStaffer.getId().toString());
		tcpApply.setDepartmentid(submit.getDepartmentbusinesscode());
		tcpApply.setType(3);
		tcpApply.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
		tcpApply.setTotal(paymentAmountDec.longValue());
		tcpApply.setLogtime(currDateTime);
		tcpApply.setDescription(submit.getName());
		tcpApply.setPaytype(BaseContants.CONSUME_PAY_TYPE_98);
		tcpApplyMapper.insert(tcpApply);

		logger.info("create travel apply approve log,id:" + applyId);
		// 流程日志
		List<Operationlogs> operationJsonList = JSONObject.parseArray(submitDetail.getOperationlogs(),
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
					approveLog.setPrestatus(-1);
					approveLog.setAfterstatus(BaseContants.TRAVELAPPLYSTATUS_22);
				} else {
					approveLog.setPrestatus(-1);
					approveLog.setAfterstatus(-1);
				}
			}
			approveLogMapper.insert(approveLog);
		}
		// 生成凭证
		this.addFinanceBean(tcpExpense, expensesJsonList);

		logger.info("update maycur data,id:" + submit.getReportId());
		// 更新每刻单据表的状态和orderid
		MayCurExpenseSubmit updateRecord = new MayCurExpenseSubmit();
		updateRecord.setReportId(submit.getReportId());
		updateRecord.setOaorderid(applyId);
		updateRecord.setCreateflag(1);
		updateRecord.setCreatetime(currDateTime);
		dao.updateByPrimaryKeySelective(updateRecord);

		// 报销金额为0,报销单状态改为99
		if (paymentAmountDec.compareTo(new BigDecimal(0)) == 0) {
			TCenterTcpExpense updateExpense = new TCenterTcpExpense();
			updateExpense.setStatus(99);
			updateExpense.setId(applyId);
			tcpExpenseMapper.updateByPrimaryKeySelective(updateExpense);
			TCenterApproveLog approveLog = new TCenterApproveLog();
			approveLog.setFullid(applyId);
			approveLog.setOprmode(0);
			approveLog.setActor("系统");
			approveLog.setActorid("99999999");
			approveLog.setDescription("系统自动审批通过");
			approveLog.setLogtime(currDateTime);
			approveLog.setPrestatus(22);
			approveLog.setAfterstatus(99);
			approveLogMapper.insert(approveLog);
		}

	}

	/**
	 * 生成凭证
	 * 
	 * @param tcpExpense
	 * @param expensesJsonList
	 * @param repaymentsJsonList
	 * @throws Exception
	 */
	private void addFinanceBean(TCenterTcpExpense tcpExpense, List<Expenses> expensesJsonList) throws Exception {
		List<String> taxIdList = new ArrayList<>();
		List<Long> moneyList = new ArrayList<>();
		List<String> stafferIdList = new ArrayList<>();
		if (expensesJsonList.size() > 0) {
			for (Expenses expenses : expensesJsonList) {
				String expense_type = expenses.getExpense_type();
				// 预算id
				String feeItemId = MayCurExpenseTypeEnum.getEnumValueOf(expense_type).getValue();
				List<ExpenseAllocations> expenseAllocationsList = expenses.getExpenseAllocations();
				for (ExpenseAllocations expenseAllocation : expenseAllocationsList) {
					// 承担人工号
					String coverEmployeeNo = expenseAllocation.getCoverEmployeeNo();
					TCenterOaStafferExample coverStafferExample = new TCenterOaStafferExample();
					coverStafferExample.createCriteria().andCodeEqualTo(coverEmployeeNo).andZzztEqualTo("在职");

					List<TCenterOaStaffer> coverStafferList = oaStafferService.selectByExample(coverStafferExample);
					TCenterOaStaffer coverStaffer = coverStafferList.get(0);

					TCenterFeeitem feeItemBean = this.feeitemMapper.selectByPrimaryKey(feeItemId);
					if (coverStaffer.getOtype() == BaseContants.OTYPE_SAIL) {
						taxIdList.add(feeItemBean.getTaxid());
					} else {
						taxIdList.add(feeItemBean.getTaxid2());
					}
					BigDecimal allocationAmount = new BigDecimal(expenseAllocation.getAllocatedAmount());
					allocationAmount = allocationAmount.multiply(new BigDecimal(10000));
					moneyList.add(allocationAmount.longValue());
					stafferIdList.add(coverStaffer.getId().toString());
				}

			}
			// prepare data finish

			TCenterFinance financeBean = new TCenterFinance();

			StringBuilder builder = new StringBuilder();
			builder.append(tcpExpense.getDescription() + ",");
			builder.append(this.getTcpTypeName(tcpExpense.getType()));

			if (BaseContants.TCP_STATUS_WAIT_PAY == tcpExpense.getStatus()) {
				builder.append("财务审批通过:");
			} else {
				builder.append("报销最终通过:");
			}

			builder.append(tcpExpense.getId() + ".");

			String name = builder.toString();

			financeBean.setName(name);

			fillType(tcpExpense, financeBean);

			financeBean.setRefid(tcpExpense.getId());

			financeBean.setDutyid(tcpExpense.getDutyid());

			/*
			 * if (user!= null){ financeBean.setCreaterId(user.getStafferId()); }
			 */

			financeBean.setDescription(financeBean.getName());

			financeBean.setFinancedate(TimeTools.now_short());

			financeBean.setLogtime(TimeTools.now());

			List<TCenterFinanceItem> itemList = new ArrayList<TCenterFinanceItem>();

			// 各种费用/备用金
			createAddItem4(tcpExpense, taxIdList, moneyList, financeBean, itemList, stafferIdList);

			financeBean.setItemList(itemList);

			this.addInner(financeBean);
		}
//		// 生成冲销的凭证
//		if (repaymentsJsonList.size() > 0) {
//			String stafferId = tcpExpense.getStafferid();
//			BigDecimal approveAmountTotalDec = new BigDecimal(0);
//			TCenterFinance financeBean = new TCenterFinance();
//			StringBuilder builder = new StringBuilder();
//			builder.append(tcpExpense.getDescription() + ",");
//			builder.append(this.getTcpTypeName(tcpExpense.getType()));
//
//			if (BaseContants.TCP_STATUS_WAIT_PAY == tcpExpense.getStatus()) {
//				builder.append("财务审批通过:");
//			} else {
//				builder.append("报销最终通过:");
//			}
//			builder.append(tcpExpense.getId() + ".");
//
//			String name = builder.toString();
//
//			financeBean.setName(name);
//
//			fillType(tcpExpense, financeBean);
//
//			financeBean.setRefid(tcpExpense.getId());
//
//			financeBean.setDutyid(tcpExpense.getDutyid());
//
//			financeBean.setDescription(financeBean.getName());
//
//			financeBean.setFinancedate(TimeTools.now_short());
//
//			financeBean.setLogtime(TimeTools.now());
//			for (Repayments repayments : repaymentsJsonList) {
//
//				String approveAmount = repayments.getApprovedAmount();
//				BigDecimal approveAmountDec = new BigDecimal(approveAmount);
//
//				approveAmountDec = approveAmountDec.multiply(new BigDecimal(100));
//
//				approveAmountTotalDec = approveAmountTotalDec.add(approveAmountDec);
//
//				moneyList.add(approveAmountDec.longValue());
//				taxIdList.add(BaseContants.TRAVEL_VOUCHER_SUBJECT);
//				stafferIdList.add(stafferId);
//
//			}
//			List<TCenterFinanceItem> itemList = new ArrayList<TCenterFinanceItem>();
//
//			// 各种费用/备用金
//			createBankVoucherAddItem4(tcpExpense, taxIdList, moneyList, financeBean, itemList, stafferIdList);
//
//			financeBean.setItemList(itemList);
//
//			this.addInner(financeBean);
//
//		}

	}

	/**
	 * 各种费用/备用金
	 * 
	 * @param bean
	 * @param financeBean
	 * @param itemList
	 * @throws MYException
	 */
	private void createAddItem4(TCenterTcpExpense bean, List<String> taxIds, List<Long> moneyList,
			TCenterFinance financeBean, List<TCenterFinanceItem> itemList, List<String> stafferIdList)
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

		String name = "报销最终入账:" + bean.getId() + '.';
		itemOut.setName("其他应收款_备用金:" + name);

		itemOut.setForward(BaseContants.TAX_FORWARD_OUT);

		FinanceHelper.copyFinanceItem(financeBean, itemOut);

		// 其他应收款_备用金
		TCenterTax outTax = taxMapper.selectByPrimaryKey(BaseContants.OTHER_RECEIVE_BORROW);

		if (outTax == null) {
			throw new Exception("缺少其他应收款_备用金,请确认操作");
		}

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

	/**
	 * 银行存款科目
	 * 
	 * @param bean
	 * @param financeBean
	 * @param itemList
	 * @throws MYException
	 */
	private void createBankVoucherAddItem4(TCenterTcpExpense bean, List<String> taxIds, List<Long> moneyList,
			TCenterFinance financeBean, List<TCenterFinanceItem> itemList, List<String> stafferIdList)
			throws Exception {

		logger.info("****************createBankVoucherAddItem4*************");
		TCenterOaStaffer staffer = oaStafferService.selectByPrimaryKey(Util.getInteger(bean.getBorrowstafferid()));

		if (staffer == null) {
			throw new Exception("数据错误,请确认操作");
		}

		String pareId = commonSequenceService.getSquenceString20();

		long total = 0L;

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

		String name = "报销最终入账:" + bean.getId() + '.';
		itemOut.setName("其他应收款_备用金:" + name);

		itemOut.setForward(BaseContants.TAX_FORWARD_OUT);

		FinanceHelper.copyFinanceItem(financeBean, itemOut);

		// 其他应收款_备用金
		TCenterTax outTax = taxMapper.selectByPrimaryKey(BaseContants.BANK_CREDIT_VOUCHER_SUBJECT);

		if (outTax == null) {
			throw new Exception("缺少其他应收款_备用金,请确认操作");
		}

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

	private void addInner(TCenterFinance bean) throws Exception {
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

		// checkTime(bean);

		// 入库时间
		bean.setLogtime(TimeTools.now());

		/*
		 * if (OATools.getManagerFlag() && StringTools.isNullOrNone(bean.getDutyid())) {
		 * String msg = "凭证必须有纳税实体的属性"; logger.error(msg); throw new MYException(msg); }
		 */

		// 默认纳税实体
		if (bean.getType() == BaseContants.FINANCE_TYPE_MANAGER && StringTools.isNullOrNone(bean.getDutyid())) {
			bean.setDutyid(BaseContants.DEFAULR_DUTY_ID);
		}

		if (bean.getType() == BaseContants.FINANCE_TYPE_DUTY && StringTools.isNullOrNone(bean.getDutyid())) {
			String msg = "普通凭证必须有纳税实体的属性";
			logger.error(msg);
			throw new Exception(msg);
		}

		TCenterDutyEntity duty = dutyEntityMapper.selectByPrimaryKey(bean.getDutyid());

		// 管理属性
		bean.setType(duty.getMtype());

		List<TCenterFinanceItem> itemList = bean.getItemList();

		boolean isTurn = FinanceHelper.isTurnFinance(itemList);

		/*
		 * if (isLOCK_FINANCE() && !isTurn) { String msg = "被锁定结转,不能增加凭证";
		 * logger.error(msg); throw new Exception(msg); }
		 */

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

			/*
			 * // 必须是最小科目哦 if (tax.getBottomFlag() != TaxConstanst.TAX_BOTTOMFLAG_ITEM) {
			 * String msg = tax.getName() + tax.getId()+"[%s]科目必须是最小科目,请确认操作";
			 * logger.error(msg); throw new MYException("[%s]科目必须是最小科目,请确认操作", tax.getName()
			 * + tax.getId()); }
			 */

			// 不是结转需要检查辅助核算项
			if (!isTurn) {
				// checkItem(financeItemBean, tax, bean.isCheckOrg(), bean.isCheckUnit());
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

		/*
		 * if (inTotal != outTotal) { String msg =
		 * FinanceHelper.longToString(inTotal)+"总借[%s],总贷[%s]不等,凭证增加错误:"+FinanceHelper.
		 * longToString(outTotal); logger.error(msg); throw new
		 * MYException("总借[%s],总贷[%s]不等,凭证增加错误", FinanceHelper.longToString(inTotal),
		 * FinanceHelper.longToString(outTotal)); }
		 */

		// CORE 核对借贷必相等的原则
		// checkPare(pareMap);
		boolean mainTable = true;
		if (mainTable) {
			// 核心锁
//            commonDAO.updatePublicLock();

			String financeDate = bean.getFinancedate();

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
		/*
		 * else { // 保存到临时的 FinanceTempBean temp = new FinanceTempBean();
		 * 
		 * BeanUtil.copyProperties(temp, bean);
		 * 
		 * financeTempDAO.saveEntityBean(temp);
		 * 
		 * for (FinanceItemBean eachItem : itemList) { FinanceItemTempBean tempItem =
		 * new FinanceItemTempBean();
		 * 
		 * BeanUtil.copyProperties(tempItem, eachItem);
		 * 
		 * financeItemTempDAO.saveEntityBean(tempItem); } }
		 * 
		 * // 手工增加增加成功后需要更新 if (bean.getCreateType() ==
		 * TaxConstanst.FINANCE_CREATETYPE_HAND &&
		 * !StringTools.isNullOrNone(bean.getRefId())) {
		 * billManager.updateBillBeanChecksWithoutTransactional(user, bean.getRefId(),
		 * "增加手工凭证自动更新收款单核对状态:" + FinanceHelper.createFinanceLink(bean.getId()), true);
		 * }
		 * 
		 * if (bean.getCreateType() == TaxConstanst.FINANCE_CREATETYPE_HAND){
		 * List<AttachmentBean> attachmentList = bean.getAttachmentList();
		 * 
		 * if(null != attachmentList && attachmentList.size() > 0) { for (AttachmentBean
		 * attachmentBean : attachmentList) {
		 * attachmentBean.setId(commonDAO.getSquenceString20());
		 * attachmentBean.setRefId(bean.getId()); }
		 * 
		 * attachmentDAO.saveAllEntityBeans(attachmentList); } }
		 */

	}

	public final String getTcpTypeName(int type) {
		String rst = "";
		if (type == BaseContants.TCP_EXPENSETYPE_TRAVEL) {
			rst = "差旅费报销";
		} else if (type == BaseContants.TCP_EXPENSETYPE_PUBLIC) {
			rst = "日常费用报销";
		}

		return rst;
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

	/**
	 * 凭证类型
	 * 
	 * @param bean
	 * @param financeBean
	 */
	private void fillType(TCenterTcpExpense bean, TCenterFinance financeBean) {
		financeBean.setType(0);

		if (bean.getType() == BaseContants.TCP_EXPENSETYPE_TRAVEL) {
			financeBean.setCreatetype(BaseContants.FINANCE_CREATETYPE_EXPENSE_BORROW);
		} else if (bean.getType() == BaseContants.TCP_EXPENSETYPE_PUBLIC) {
			financeBean.setCreatetype(BaseContants.FINANCE_CREATETYPE_EXPENSE_PUBLIC);
		} else if (bean.getType() == BaseContants.TCP_EXPENSETYPE_COMMON) {
			financeBean.setCreatetype(BaseContants.FINANCE_CREATETYPE_EXPENSE_COMMON);
		}
	}

	/**
	 * 查询员工信息
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	private String queryStafferDepartment(String stafferCode) {

		String stafferDeparmentCode = "";
		MayCurResultData<MayCurAuthInfo> loginResult = mayCurUtils.loginMayCurOpenAPI();

		logger.info(loginResult.toString());

		String code = loginResult.getCode();

		logger.info("auth login code:" + code);
		if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(code)) {

			String entCode = loginResult.getData().getEntCode();
			String tokenId = loginResult.getData().getTokenId();
			long timestamp = loginResult.getData().getTimestamp();
			Map<String, String> header = new HashMap<String, String>();
			header.put("entCode", entCode);
			header.put("tokenId", tokenId);

			String queryStafferUrlPath = mayCurConfigProperties.getHost() + mayCurConfigProperties.getQueryemployee();

			// 拼接url请求参数
			StringBuilder builder = new StringBuilder();
			builder.append(queryStafferUrlPath);
			builder.append("?");
			builder.append("offset=0");
			builder.append("&limit=500");
			builder.append("&employeeId=");
			builder.append(stafferCode);

			logger.info("start query staffer info:" + builder.toString());

			MayCurResultData resultData = new MayCurResultData();
			try {
				resultData = mayCurUtils.synchronizeToMaycur(header, timestamp, builder.toString(), "GET",
						"application/json", "UTF-8", null);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String resultCode = resultData.getCode();
			if (MAYCUR_SUCCESS_CODE.equalsIgnoreCase(resultCode)) {
				String resultDataString = resultData.getData().toString();
				logger.info("员工信息返回字符串:" + resultDataString);
				List<MayCurEmployee> employeeList = JSONObject.parseArray(resultDataString, MayCurEmployee.class);
				if (employeeList != null && employeeList.size() > 0) {
					MayCurEmployee employee = employeeList.get(0);
					List<Departments> departmentList = employee.getDepartments();
					if (departmentList != null && departmentList.size() > 0) {
						stafferDeparmentCode = departmentList.get(0).getDepartmentBizCode();

					}
				}

			}

		}
		return stafferDeparmentCode;
	}
}
