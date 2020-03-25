package com.yycoin.job;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.yycoin.pojo.maycur.corprepayment.detail.resp.CorpRepaymentDetails;
import com.yycoin.pojo.maycur.corpsubmit.detail.resp.CorpPayments;
import com.yycoin.service.IMayCurCorpDetailService;
import com.yycoin.service.IMayCurCorpRepaymentDetailService;
import com.yycoin.service.IMayCurCorpRepaymentSubmitService;
import com.yycoin.service.IMayCurCorpSubmitService;
import com.yycoin.util.DateUtils;
import com.yycoin.vo.MayCurCorpDetailRootWithBLOBs;
import com.yycoin.vo.MayCurCorpPayAnalyse;
import com.yycoin.vo.MayCurCorpPayAnalyseExample;
import com.yycoin.vo.MayCurCorpPayAnalyseMapper;
import com.yycoin.vo.MayCurCorpRepaymentDetailRootWithBLOBs;
import com.yycoin.vo.MayCurCorpRepaymentSubmit;
import com.yycoin.vo.MayCurCorpRepaymentSubmitExample;
import com.yycoin.vo.MayCurCorpSubmit;
import com.yycoin.vo.MayCurCorpSubmitExample;

/**
 * 对公支付数据分时间段提取
 * 
 * @author Administrator
 *
 */
@Component
public class CreateCorpPayAnalyseDataSchedule implements Job {

	private static Logger logger = LoggerFactory.getLogger(CreateCorpPayAnalyseDataSchedule.class);

	@Autowired
	private IMayCurCorpSubmitService mayCurCorpSubmitService;

	@Autowired
	private IMayCurCorpDetailService mayCurCorpDetailService;

	@Autowired
	private IMayCurCorpRepaymentSubmitService mayCurCorpRepaymentSubmitService;

	@Autowired
	private IMayCurCorpRepaymentDetailService mayCurCorpRepaymentDetailService;

	@Autowired
	private MayCurCorpPayAnalyseMapper mayCurCorpPayAnalyseMapper;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start CreateCorpPayAnalyseDataSchedule");

		MayCurCorpSubmitExample corpExample = new MayCurCorpSubmitExample();
		corpExample.createCriteria().andPaymentstatusEqualTo(1);
		corpExample.setOrderByClause(" paymenttime");

		List<MayCurCorpSubmit> compute10SubmitList = new ArrayList<MayCurCorpSubmit>();
		List<MayCurCorpSubmit> compute11SubmitList = new ArrayList<MayCurCorpSubmit>();
		List<MayCurCorpSubmit> compute12SubmitList = new ArrayList<MayCurCorpSubmit>();

		List<MayCurCorpSubmit> submitList = mayCurCorpSubmitService.selectByExample(corpExample);
		// 对公支付--其他保证金和押金
		for (MayCurCorpSubmit corpSubmit : submitList) {
			String reportId = corpSubmit.getReportId();
			MayCurCorpDetailRootWithBLOBs detail = mayCurCorpDetailService.selectByPrimaryKey(reportId);
			if (detail == null) {
				logger.error("report id :" + reportId + " has no detail data");
				continue;
			}
			List<CorpPayments> corpPaymentList = JSONObject.parseArray(detail.getCorppayments(), CorpPayments.class);
			if (corpPaymentList.size() == 0) {
				continue;
			}
			CorpPayments corpPayment = corpPaymentList.get(0);
			String paymentType = corpPayment.getCorpPaymentTypeBizCode();
			if ("77".equalsIgnoreCase(paymentType) || "88".equals(paymentType)) {
				compute10SubmitList.add(corpSubmit);
			} else if ("26".equalsIgnoreCase(paymentType)) {
				compute11SubmitList.add(corpSubmit);
			} else {
				compute12SubmitList.add(corpSubmit);
			}
		}
		if (compute10SubmitList.size() > 0) {
			computeCorpSubmitData(compute10SubmitList, 10);
		}
		if (compute11SubmitList.size() > 0) {
			computeCorpSubmitData(compute11SubmitList, 11);
		}
		if (compute12SubmitList.size() > 0) {
			computeCorpSubmitData(compute12SubmitList, 12);
		}

		// 对公还款
		List<MayCurCorpRepaymentSubmit> computeRepaymentList = new ArrayList<MayCurCorpRepaymentSubmit>();
		List<MayCurCorpRepaymentSubmit> repaymentList = new ArrayList<MayCurCorpRepaymentSubmit>();
		MayCurCorpRepaymentSubmitExample repaymentSubmitExample = new MayCurCorpRepaymentSubmitExample();
		repaymentList = mayCurCorpRepaymentSubmitService.selectByExample(repaymentSubmitExample);
		for (MayCurCorpRepaymentSubmit repaymentSubmit : repaymentList) {
			String reportId = repaymentSubmit.getReportId();
			MayCurCorpRepaymentDetailRootWithBLOBs detail = mayCurCorpRepaymentDetailService
					.selectByPrimaryKey(reportId);
			List<CorpRepaymentDetails> corpRepaymentDetailList = JSONObject.parseArray(detail.getCorprepaymentdetails(),
					CorpRepaymentDetails.class);
			if (corpRepaymentDetailList.size() == 0) {
				continue;
			}
			CorpRepaymentDetails corpPaymentDetail = corpRepaymentDetailList.get(0);
			String businessCode = corpPaymentDetail.getCorpRepaymentTypeCode();
			if ("77".equalsIgnoreCase(businessCode) || "88".equals(businessCode)) {
				computeRepaymentList.add(repaymentSubmit);
			}
		}
		if (computeRepaymentList.size() > 0) {
			computeCorpRepaymentData(computeRepaymentList);
		}

		logger.info("end CreateCorpPayAnalyseDataSchedule");

	}

	/**
	 * 对公收款
	 * 
	 * @param computeRepaymentList
	 */
	@Transactional(rollbackFor = Exception.class)
	public void computeCorpRepaymentData(List<MayCurCorpRepaymentSubmit> computeRepaymentList) {

		logger.info("start computeCorpRepaymentData");
		MayCurCorpPayAnalyseExample deleteExample = new MayCurCorpPayAnalyseExample();
		deleteExample.createCriteria().andDataTypeEqualTo(2);
		mayCurCorpPayAnalyseMapper.deleteByExample(deleteExample);
		// 先删除再写入
		String currDateString = DateUtils.getCurrDateTime();
		Date currDate = Calendar.getInstance().getTime();

		BigDecimal less3 = new BigDecimal(0);
		BigDecimal greate3less6 = new BigDecimal(0);
		BigDecimal greate6less12 = new BigDecimal(0);
		BigDecimal greate12less24 = new BigDecimal(0);
		BigDecimal greate24less36 = new BigDecimal(0);
		BigDecimal greate36 = new BigDecimal(0);

		for (MayCurCorpRepaymentSubmit submit : computeRepaymentList) {
			String paymentTime = submit.getSavetime();

			long dayMargindate = DateUtils.daysBetweenToday(paymentTime, currDateString);

			if (dayMargindate <= 90) {
				less3 = less3.add(new BigDecimal(submit.getApprovedamount()));

			} else if (dayMargindate > 90 && dayMargindate <= 180) {
				greate3less6 = greate3less6.add(new BigDecimal(submit.getApprovedamount()));

			} else if (dayMargindate > 180 && dayMargindate <= 365) {
				greate6less12 = greate6less12.add(new BigDecimal(submit.getApprovedamount()));

			} else if (dayMargindate > 365 && dayMargindate <= 730) {
				greate12less24 = greate12less24.add(new BigDecimal(submit.getApprovedamount()));

			} else if (dayMargindate > 730 && dayMargindate <= 1095) {
				greate24less36 = greate24less36.add(new BigDecimal(submit.getApprovedamount()));
			} else {
				greate36 = greate36.add(new BigDecimal(submit.getApprovedamount()));
			}

		}

		BigDecimal zeroDec = new BigDecimal(0);
		if (less3.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(2);
			analyse.setAmount(less3);
			analyse.setDayType(1);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate3less6.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(2);
			analyse.setAmount(greate3less6);
			analyse.setDayType(2);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate6less12.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(2);
			analyse.setAmount(greate6less12);
			analyse.setDayType(3);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate12less24.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(2);
			analyse.setAmount(greate12less24);
			analyse.setDayType(4);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate24less36.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(2);
			analyse.setAmount(greate24less36);
			analyse.setDayType(5);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate36.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(2);
			analyse.setAmount(greate36);
			analyse.setDayType(6);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		logger.info("end computeCorpRepaymentData");

	}

	/**
	 * 对公支付
	 * 
	 * @param computeSubmitList
	 * @param dataType          10--对公支付借款类保证金;11--借款类关联方借款;12-借款类其他
	 */
	@Transactional(rollbackFor = Exception.class)
	public void computeCorpSubmitData(List<MayCurCorpSubmit> computeSubmitList, int dataType) {
		logger.info("start computeCorpSubmitData");

		MayCurCorpPayAnalyseExample deleteExample = new MayCurCorpPayAnalyseExample();
		deleteExample.createCriteria().andDataTypeEqualTo(dataType);
		mayCurCorpPayAnalyseMapper.deleteByExample(deleteExample);
		// 先删除再写入
		String currDateString = DateUtils.getCurrDateTime();
		Date currDate = Calendar.getInstance().getTime();

		BigDecimal less3 = new BigDecimal(0);
		BigDecimal greate3less6 = new BigDecimal(0);
		BigDecimal greate6less12 = new BigDecimal(0);
		BigDecimal greate12less24 = new BigDecimal(0);
		BigDecimal greate24less36 = new BigDecimal(0);
		BigDecimal greate36 = new BigDecimal(0);

		for (MayCurCorpSubmit submit : computeSubmitList) {
			String paymentTime = submit.getPaymenttime();

			long dayMargindate = DateUtils.daysBetweenToday(paymentTime, currDateString);

			if (dayMargindate <= 90) {
				less3 = less3.add(new BigDecimal(submit.getPayAmount()));

			} else if (dayMargindate > 90 && dayMargindate <= 180) {
				greate3less6 = greate3less6.add(new BigDecimal(submit.getPayAmount()));

			} else if (dayMargindate > 180 && dayMargindate <= 365) {
				greate6less12 = greate6less12.add(new BigDecimal(submit.getPayAmount()));

			} else if (dayMargindate > 365 && dayMargindate <= 730) {
				greate12less24 = greate12less24.add(new BigDecimal(submit.getPayAmount()));

			} else if (dayMargindate > 730 && dayMargindate <= 1095) {
				greate24less36 = greate24less36.add(new BigDecimal(submit.getPayAmount()));
			} else {
				greate36 = greate36.add(new BigDecimal(submit.getPayAmount()));
			}

		}

		BigDecimal zeroDec = new BigDecimal(0);
		if (less3.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(dataType);
			analyse.setAmount(less3);
			analyse.setDayType(1);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate3less6.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(dataType);
			analyse.setAmount(greate3less6);
			analyse.setDayType(2);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate6less12.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(dataType);
			analyse.setAmount(greate6less12);
			analyse.setDayType(3);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate12less24.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(dataType);
			analyse.setAmount(greate12less24);
			analyse.setDayType(4);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate24less36.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(dataType);
			analyse.setAmount(greate24less36);
			analyse.setDayType(5);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		if (greate36.compareTo(zeroDec) > 0) {
			MayCurCorpPayAnalyse analyse = new MayCurCorpPayAnalyse();
			analyse.setDataType(dataType);
			analyse.setAmount(greate36);
			analyse.setDayType(6);
			analyse.setCreateTime(currDate);
			mayCurCorpPayAnalyseMapper.insert(analyse);

		}
		logger.info("end computeCorpSubmitData");
	}

}
