package com.yycoin.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.china.center.tools.FileTools;
import com.china.center.tools.SequenceTools;
import com.china.center.tools.TimeTools;
import com.yycoin.dao.IMayCurConsumeSubmitDao;
import com.yycoin.pojo.maycur.consume.detail.resp.Attachments;
import com.yycoin.pojo.maycur.consume.detail.resp.Expenses;
import com.yycoin.pojo.maycur.consume.detail.resp.Operationlogs;
import com.yycoin.pojo.maycur.consume.detail.resp.Payment;
import com.yycoin.service.IMayCurConsumeDetailRootService;
import com.yycoin.service.IMayCurConsumeSubmitService;
import com.yycoin.service.IOaStafferService;
import com.yycoin.service.common.ICommonSequenceService;
import com.yycoin.util.BaseContants;
import com.yycoin.util.CommonConfigProperties;
import com.yycoin.util.CommonSequenceUtils;
import com.yycoin.util.DateUtils;
import com.yycoin.util.ImageUtils;
import com.yycoin.util.MayCurExpenseTypeEnum;
import com.yycoin.vo.MayCurConsumeDetailRootWithBLOBs;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;
import com.yycoin.vo.TCenterApproveLog;
import com.yycoin.vo.TCenterApproveLogMapper;
import com.yycoin.vo.TCenterGroup;
import com.yycoin.vo.TCenterGroupExample;
import com.yycoin.vo.TCenterGroupMapper;
import com.yycoin.vo.TCenterTcpApprove;
import com.yycoin.vo.TCenterTcpApproveMapper;
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
public class MayCurConsumeSubmitServiceImpl implements IMayCurConsumeSubmitService {

	private static Logger logger = LoggerFactory.getLogger(MayCurConsumeSubmitServiceImpl.class);

	@Autowired
	private IMayCurConsumeSubmitDao dao;

	@Autowired
	private IMayCurConsumeDetailRootService mayCurConsumeDetailRootService;

	@Autowired
	private ICommonSequenceService commonSequenceService;

	@Autowired
	private IOaStafferService oaStafferService;

	@Autowired
	private CommonConfigProperties commonConfigProperties;

	@Autowired
	private TCenterApproveLogMapper approveLogMapper;

	@Autowired
	private TCenterTravelApplyMapper travelApplyMapper;

	@Autowired
	private TCenterTravelApplyPayMapper travelApplyPayMapper;

	@Autowired
	private TCenterTravelApplyItemMapper travelApplyItemMapper;

	@Autowired
	private TCenterTcpApplyMapper tcpApplyMapper;

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

	@Override
	public int countByExample(MayCurConsumeSubmitExample example) {
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurConsumeSubmitExample example) {
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return dao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurConsumeSubmit record) {
		return dao.insert(record);
	}

	@Override
	public int insertSelective(MayCurConsumeSubmit record) {
		return dao.insertSelective(record);
	}

	@Override
	public List<MayCurConsumeSubmit> selectByExample(MayCurConsumeSubmitExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public MayCurConsumeSubmit selectByPrimaryKey(String reportId) {
		return dao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurConsumeSubmit record, MayCurConsumeSubmitExample example) {
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurConsumeSubmit record, MayCurConsumeSubmitExample example) {
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurConsumeSubmit record) {
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurConsumeSubmit record) {
		return dao.updateByPrimaryKey(record);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveSubmitData2OA(List<MayCurConsumeSubmit> submitList) throws Exception {
		String currDateTime = DateUtils.getCurrDateTime();

		for (MayCurConsumeSubmit submit : submitList) {
			try {
				MayCurConsumeDetailRootWithBLOBs submitDetail = mayCurConsumeDetailRootService
						.selectByPrimaryKey(submit.getReportId());
				if (submitDetail == null) {
					logger.error("query submit detail error，reportid:" + submit.getReportId());
					continue;
				}
				String subType = submitDetail.getFormsubtype();
				TCenterTravelApply travelApply = new TCenterTravelApply();

				if (BaseContants.MAYCUR_FORM_SUBTYPE_DGYWSQ.equalsIgnoreCase(subType)) {
					// 对公业务申请
					String sequence = commonSequenceService.getSquenceString20();
					String applyId = CommonSequenceUtils.getSquenceString20(BaseContants.COMMON_SEQUENCE_UT_PREFIX,
							sequence);
					logger.info("create travel apply,id:" + applyId);
					travelApply.setId(applyId);
					// 报销人工号
					String reim_user_code = submit.getReimUserCode();
					// 承担人工号
					String cover_user_code = submit.getCoverUserCode();

					TCenterOaStafferExample oaStafferExample = new TCenterOaStafferExample();
					oaStafferExample.createCriteria().andCodeEqualTo(reim_user_code).andZzztEqualTo("在职");
					List<TCenterOaStaffer> stafferList = oaStafferService.selectByExample(oaStafferExample);
					if (stafferList.size() == 0) {
						logger.error("query staffer error，staffer code:" + reim_user_code);
						continue;
					}
					travelApply.setName(submitDetail.getName());
					travelApply.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
					TCenterOaStaffer oaStaffer = stafferList.get(0);
					travelApply.setStafferid(oaStaffer.getId().toString());
					travelApply.setBorrowstafferid(oaStaffer.getId().toString());
					travelApply.setDepartmentid(oaStaffer.getIndustryid3());
					travelApply.setType(3);
					// 未关联报销
					travelApply.setFeedback(0);

					// 待财务支付
					travelApply.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
					travelApply.setBorrow(1);
					String submitDateString = DateUtils.longToDate(Long.valueOf(submit.getCreatedat()));
					travelApply.setLogtime(submitDateString);
					travelApply.setBegindate(DateUtils.longToDateYYYYMMDD(Long.valueOf(submit.getCreatedat())));
					travelApply.setDescription(submitDetail.getName());

					BigDecimal amountDec = new BigDecimal(submit.getApprovedamount());
					amountDec = amountDec.multiply(new BigDecimal(100));
					travelApply.setTotal(amountDec.longValue());
					travelApply.setBorrowtotal(amountDec.longValue());
					travelApply.setDutyid(BaseContants.DUTY_ID);
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
						approve.setDepartmentid(oaStaffer.getIndustryid3());
						approve.setType(3);
						approve.setPool(0);
						approve.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
						approve.setTotal(amountDec.longValue());
						approve.setLogtime(submitDateString);
						approve.setStype(0);
						approve.setPaytype(1);
						approve.setChecktotal(amountDec.longValue());
						tcpApproveMapper.insert(approve);

					}

					travelApplyMapper.insert(travelApply);

					logger.info("create travel apply item,id:" + applyId);
					// 费用明细
					List<Expenses> expensesJsonList = JSONObject.parseArray(submitDetail.getExpenses(), Expenses.class);
					for (Expenses expenses : expensesJsonList) {
						String approvedAmount = expenses.getAmount_approved();
						String expense_type = expenses.getExpense_type();
						// 金额为0，不创建费用明细
						if (StringUtils.isEmpty(approvedAmount)) {
							logger.info("apply id :" + applyId + " approvedAmount is empty");
							continue;
						}
						if ("0".equals(approvedAmount)) {
							logger.info("apply id :" + applyId + " approvedAmount is 0");
							continue;
						}
						if (StringUtils.isEmpty(expense_type)) {
							logger.info("apply id :" + applyId + " expense_type is empty");
							continue;
						}
						TCenterTravelApplyItem applyItem = new TCenterTravelApplyItem();
						String applyItemSequence = commonSequenceService.getSquenceString20();
						String applyItemId = CommonSequenceUtils.getSquenceString20(applyItemSequence);
						applyItem.setId(applyItemId);
						applyItem.setParentid(applyId);
						String dateString = DateUtils.longToDate(Long.valueOf(expenses.getExchange_date()));
						applyItem.setBegindate(dateString);
						applyItem.setEnddate(dateString);
						String feeItemId = MayCurExpenseTypeEnum.getEnumValueOf(expense_type).getValue();
						applyItem.setFeeitemid(feeItemId);
						BigDecimal approvedAmountBig = new BigDecimal(approvedAmount);
						approvedAmountBig = approvedAmountBig.multiply(new BigDecimal(100));
						applyItem.setMoneys(approvedAmountBig.longValue());
						applyItem.setCmoneys(approvedAmountBig.longValue());
						travelApplyItemMapper.insert(applyItem);
					}
					logger.info("create travel apply pay,id:" + applyId);
					// 收款明细
					Payment payment = JSONObject.parseObject(submitDetail.getPayment(), Payment.class);
					TCenterTravelApplyPay travelPay = new TCenterTravelApplyPay();
					String applyPaySequence = commonSequenceService.getSquenceString20();
					String applyPayId = CommonSequenceUtils.getSquenceString20(applyPaySequence);
					travelPay.setId(applyPayId);
					travelPay.setParentid(applyId);
					travelPay.setReceivetype(1);
					travelPay.setBankname(payment.getCollectionBankName());
					travelPay.setUsername(payment.getCollection_account_name());
					travelPay.setBankno(payment.getCollection_account());
					travelPay.setCdescription("ok");
					BigDecimal payAmount = new BigDecimal(payment.getPay_amount());
					payAmount = payAmount.multiply(new BigDecimal(100));
					travelPay.setMoneys(payAmount.longValue());
					travelPay.setCmoneys(payAmount.longValue());
					travelPay.setBankprovince(payment.getCollectionBankProvince());
					travelPay.setBankcity(payment.getCollectionBankCity());
					travelPay.setPayflag("0");
					travelApplyPayMapper.insert(travelPay);

					logger.info("create travel apply tcp share,id:" + applyId);
					// 费用分担
					TCenterTcpShare tcpShare = new TCenterTcpShare();
					String shareSequence = commonSequenceService.getSquenceString20();
					String shareId = CommonSequenceUtils.getSquenceString20(shareSequence);
					tcpShare.setId(shareId);
					tcpShare.setRefid(applyId);
					tcpShare.setBudgetid("");
					tcpShare.setDepartmentid("");
					tcpShare.setApproverid("");
					tcpShare.setRatio(0);
					tcpShare.setRealmonery(amountDec.longValue());
					tcpShare.setBearid(oaStaffer.getId().toString());
					tcpShareMapper.insert(tcpShare);

					logger.info("create travel apply attachement,id:" + applyId);
					// 附件
					List<Attachments> attachmentsJsonList = JSONObject.parseArray(submitDetail.getAttachments(),
							Attachments.class);
					for (Attachments attachments : attachmentsJsonList) {
						String fileName = attachments.getFileName();
						String fileUrl = attachments.getFileUrl();
						if (StringUtils.isEmpty(fileUrl)) {
							logger.error("applyid:" + applyId + ";attachement url is null");
							throw new Exception("applyid:" + applyId + ";attachement url is null");
						}
						String attachePath = commonConfigProperties.getTcpAttachmentPath();

						String savePath = mkdir(attachePath);

						String fileAlais = SequenceTools.getSequence();

						String rabsPath = '/' + savePath + '/' + fileAlais + "."
								+ FileTools.getFilePostfix(fileName).toLowerCase();

						String filePath = attachePath + '/' + rabsPath;

						String imageType = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());

						ImageUtils.downloadPictureByUrl(filePath, imageType, fileUrl);

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

					logger.info("create travel apply tcp apply,id:" + applyId);
					// 申请总表
					TCenterTcpApply tcpApply = new TCenterTcpApply();
					tcpApply.setId(applyId);
					tcpApply.setName(applyId);
					tcpApply.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
					tcpApply.setApplyid(applyId);
					tcpApply.setApplyerid(oaStaffer.getId().toString());
					tcpApply.setDepartmentid(oaStaffer.getIndustryid3());
					tcpApply.setType(3);
					tcpApply.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
					tcpApply.setTotal(amountDec.longValue());
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

					logger.info("update maycur data,id:" + submit.getReportId());
					// 更新每刻单据表的状态和orderid
					MayCurConsumeSubmit updateRecord = new MayCurConsumeSubmit();
					updateRecord.setReportId(submit.getReportId());
					updateRecord.setOaorderid(applyId);
					updateRecord.setCreateflag(1);
					dao.updateByPrimaryKeySelective(updateRecord);

				}
				if (BaseContants.MAYCUR_FORM_SUBTYPE_CLFSQ.equalsIgnoreCase(subType)) {
					// 差旅费申请及借款
					String sequence = commonSequenceService.getSquenceString20();
					String applyId = CommonSequenceUtils.getSquenceString20(BaseContants.COMMON_SEQUENCE_UT_PREFIX,
							sequence);
					logger.info("create travel apply,id:" + applyId);
					travelApply.setId(applyId);
					// 报销人工号
					String reim_user_code = submit.getReimUserCode();
					// 承担人工号
					String cover_user_code = submit.getCoverUserCode();

					TCenterOaStafferExample oaStafferExample = new TCenterOaStafferExample();
					oaStafferExample.createCriteria().andCodeEqualTo(reim_user_code).andZzztEqualTo("在职");
					List<TCenterOaStaffer> stafferList = oaStafferService.selectByExample(oaStafferExample);
					if (stafferList.size() == 0) {
						logger.error("query staffer error，staffer code:" + reim_user_code);
						continue;
					}
					travelApply.setName(submitDetail.getName());
					travelApply.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
					TCenterOaStaffer oaStaffer = stafferList.get(0);
					travelApply.setStafferid(oaStaffer.getId().toString());
					travelApply.setBorrowstafferid(oaStaffer.getId().toString());
					travelApply.setDepartmentid(oaStaffer.getIndustryid3());
					travelApply.setType(0);
					// 未关联报销
					travelApply.setFeedback(0);

					// 待财务支付
					travelApply.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
					travelApply.setBorrow(1);
					String submitDateString = DateUtils.longToDate(Long.valueOf(submit.getCreatedat()));
					travelApply.setLogtime(submitDateString);
					travelApply.setBegindate(DateUtils.longToDateYYYYMMDD(Long.valueOf(submit.getCreatedat())));
					travelApply.setDescription(submitDetail.getName());

					BigDecimal amountDec = new BigDecimal(submit.getApprovedamount());
					amountDec = amountDec.multiply(new BigDecimal(100));
					travelApply.setTotal(amountDec.longValue());
					travelApply.setBorrowtotal(amountDec.longValue());
					travelApply.setDutyid(BaseContants.DUTY_ID);
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
						approve.setDepartmentid(oaStaffer.getIndustryid3());
						approve.setType(0);
						approve.setPool(0);
						approve.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
						approve.setTotal(amountDec.longValue());
						approve.setLogtime(submitDateString);
						approve.setStype(0);
						approve.setPaytype(1);
						approve.setChecktotal(amountDec.longValue());
						tcpApproveMapper.insert(approve);

					}

					logger.info("create travel apply item,id:" + applyId);
					// 费用明细
					List<Expenses> expensesJsonList = JSONObject.parseArray(submitDetail.getExpenses(), Expenses.class);
					BigDecimal hotelDel = new BigDecimal(0);
					BigDecimal airplaneDel = new BigDecimal(0);
					BigDecimal trainDel = new BigDecimal(0);
					BigDecimal busDel = new BigDecimal(0);
					BigDecimal allowanceDel = new BigDecimal(0);
					BigDecimal otherDel = new BigDecimal(0);
					for (Expenses expenses : expensesJsonList) {
						String approvedAmount = expenses.getAmount_approved();
						String expense_type = expenses.getExpense_type();
						// 金额为0，不创建费用明细
						if (StringUtils.isEmpty(approvedAmount)) {
							logger.info("apply id :" + applyId + " approvedAmount is empty");
							continue;
						}
						if ("0".equals(approvedAmount)) {
							logger.info("apply id :" + applyId + " approvedAmount is 0");
							continue;
						}
						if (StringUtils.isEmpty(expense_type)) {
							logger.info("apply id :" + applyId + " expense_type is empty");
							continue;
						}
						TCenterTravelApplyItem applyItem = new TCenterTravelApplyItem();
						String applyItemSequence = commonSequenceService.getSquenceString20();
						String applyItemId = CommonSequenceUtils.getSquenceString20(applyItemSequence);
						applyItem.setId(applyItemId);
						applyItem.setParentid(applyId);

						String exchangeDate = expenses.getExchange_date();
						if (StringUtils.isNotEmpty(exchangeDate)) {
							String dateString = DateUtils.longToDate(Long.valueOf(exchangeDate));
							applyItem.setBegindate(dateString);
							applyItem.setEnddate(dateString);
						}

						String feeItemId = MayCurExpenseTypeEnum.getEnumValueOf(expense_type).getValue();
						applyItem.setFeeitemid(feeItemId);
						BigDecimal approvedAmountBig = new BigDecimal(approvedAmount);
						approvedAmountBig = approvedAmountBig.multiply(new BigDecimal(100));
						applyItem.setMoneys(approvedAmountBig.longValue());
						if ("D1001".equalsIgnoreCase(expense_type)) {
							hotelDel = hotelDel.add(approvedAmountBig);
						} else if ("D1002".equalsIgnoreCase(expense_type)) {
							airplaneDel = airplaneDel.add(approvedAmountBig);
						} else if ("D1003".equalsIgnoreCase(expense_type)) {
							trainDel = trainDel.add(approvedAmountBig);
						} else if ("D1004".equalsIgnoreCase(expense_type)) {
							busDel = busDel.add(approvedAmountBig);
						} else if ("D10010".equalsIgnoreCase(expense_type)) {
							allowanceDel = allowanceDel.add(approvedAmountBig);
						} else {
							otherDel = otherDel.add(approvedAmountBig);
						}
						travelApplyItemMapper.insert(applyItem);
					}
					travelApply.setHotelcharges(hotelDel.longValue());
					travelApply.setAirplanecharges(airplaneDel.longValue());
					travelApply.setTraincharges(trainDel.longValue());
					travelApply.setBuscharges(busDel.longValue());
					travelApply.setAllowancecharges(allowanceDel.longValue());
					travelApply.setOther1charges(otherDel.longValue());
					travelApplyMapper.insert(travelApply);
					logger.info("create travel apply pay,id:" + applyId);
					// 收款明细
					Payment payment = JSONObject.parseObject(submitDetail.getPayment(), Payment.class);
					TCenterTravelApplyPay travelPay = new TCenterTravelApplyPay();
					String applyPaySequence = commonSequenceService.getSquenceString20();
					String applyPayId = CommonSequenceUtils.getSquenceString20(applyPaySequence);
					travelPay.setId(applyPayId);
					travelPay.setParentid(applyId);
					travelPay.setReceivetype(1);
					travelPay.setBankname(payment.getCollectionBankName());
					travelPay.setUsername(payment.getCollection_account_name());
					travelPay.setBankno(payment.getCollection_account());
					travelPay.setCdescription("ok");
					BigDecimal payAmount = new BigDecimal(payment.getPay_amount());
					payAmount = payAmount.multiply(new BigDecimal(100));
					travelPay.setMoneys(payAmount.longValue());
					travelPay.setCmoneys(payAmount.longValue());
					travelPay.setBankprovince(payment.getCollectionBankProvince());
					travelPay.setBankcity(payment.getCollectionBankCity());
					travelPay.setPayflag("0");
					travelApplyPayMapper.insert(travelPay);

					logger.info("create travel apply tcp share,id:" + applyId);
					// 费用分担
					TCenterTcpShare tcpShare = new TCenterTcpShare();
					String shareSequence = commonSequenceService.getSquenceString20();
					String shareId = CommonSequenceUtils.getSquenceString20(shareSequence);
					tcpShare.setId(shareId);
					tcpShare.setRefid(applyId);
					tcpShare.setBudgetid("");
					tcpShare.setDepartmentid("");
					tcpShare.setApproverid("");
					tcpShare.setRatio(0);
					tcpShare.setRealmonery(amountDec.longValue());
					tcpShare.setBearid(oaStaffer.getId().toString());
					tcpShareMapper.insert(tcpShare);

					logger.info("create travel apply attachement,id:" + applyId);
					// 附件
					List<Attachments> attachmentsJsonList = JSONObject.parseArray(submitDetail.getAttachments(),
							Attachments.class);
					for (Attachments attachments : attachmentsJsonList) {
						String fileName = attachments.getFileName();
						String fileUrl = attachments.getFileUrl();
						if (StringUtils.isEmpty(fileUrl)) {
							logger.error("applyid:" + applyId + ";attachement url is null");
							throw new Exception("applyid:" + applyId + ";attachement url is null");
						}
						String attachePath = commonConfigProperties.getTcpAttachmentPath();

						String savePath = mkdir(attachePath);

						String fileAlais = SequenceTools.getSequence();

						String rabsPath = '/' + savePath + '/' + fileAlais + "."
								+ FileTools.getFilePostfix(fileName).toLowerCase();

						String filePath = attachePath + '/' + rabsPath;

						String imageType = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());

						ImageUtils.downloadPictureByUrl(filePath, imageType, fileUrl);

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

					logger.info("create travel apply tcp apply,id:" + applyId);
					// 申请总表
					TCenterTcpApply tcpApply = new TCenterTcpApply();
					tcpApply.setId(applyId);
					tcpApply.setName(applyId);
					tcpApply.setFlowkey(BaseContants.CONSUME_WORKFLOW_KEY);
					tcpApply.setApplyid(applyId);
					tcpApply.setApplyerid(oaStaffer.getId().toString());
					tcpApply.setDepartmentid(oaStaffer.getIndustryid3());
					tcpApply.setType(0);
					tcpApply.setStatus(BaseContants.TRAVELAPPLYSTATUS_22);
					tcpApply.setTotal(amountDec.longValue());
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

					logger.info("update maycur data,id:" + submit.getReportId());
					// 更新每刻单据表的状态和orderid
					MayCurConsumeSubmit updateRecord = new MayCurConsumeSubmit();
					updateRecord.setReportId(submit.getReportId());
					updateRecord.setOaorderid(applyId);
					updateRecord.setCreateflag(1);
					updateRecord.setCreatetime(currDateTime);
					dao.updateByPrimaryKeySelective(updateRecord);

				}
			} catch (Exception e) {
				logger.error("create submit data to OA error", e);
				throw e;
			}
		}

	}

	private String mkdir(String root) {
		String path = TimeTools.now("yyyy/MM/dd/HH") + "/"
				+ SequenceTools.getSequence(String.valueOf(new Random().nextInt(1000)));

		FileTools.mkdirs(root + '/' + path);

		return path;
	}

}
