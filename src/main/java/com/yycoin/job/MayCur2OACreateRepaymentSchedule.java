package com.yycoin.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.service.IMayCurRepaymentSubmitService;
import com.yycoin.util.BaseContants;
import com.yycoin.vo.MayCurRepaymentSubmit;
import com.yycoin.vo.MayCurRepaymentSubmitExample;

@Component
public class MayCur2OACreateRepaymentSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCur2OACreateRepaymentSchedule.class);

	@Autowired
	private IMayCurRepaymentSubmitService mayCurRepaymentSubmitService;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {

		logger.info("start create repayment submit data to OA");
		MayCurRepaymentSubmitExample submitExample = new MayCurRepaymentSubmitExample();
		submitExample.createCriteria().andCreateflagEqualTo(0).andStatusEqualTo("SETTLEMENT");
		List<MayCurRepaymentSubmit> submitList = mayCurRepaymentSubmitService.selectByExample(submitExample);

		if (submitList.size() > 0) {
			try {
				mayCurRepaymentSubmitService.saveSubmitData2OA(submitList);
			} catch (Exception e) {
				logger.error("create submit repayment data to OA error", e);
			}
		}

	}

}