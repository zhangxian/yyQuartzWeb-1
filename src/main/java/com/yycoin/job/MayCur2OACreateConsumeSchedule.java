package com.yycoin.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yycoin.service.IMayCurConsumeSubmitService;
import com.yycoin.util.BaseContants;

//@Component
public class MayCur2OACreateConsumeSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCur2OACreateConsumeSchedule.class);

	@Autowired
	private IMayCurConsumeSubmitService mayCurConsumeSubmitService;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start create consume submit data to OA");
//		MayCurConsumeSubmitExample submitExample = new MayCurConsumeSubmitExample();
//		submitExample.createCriteria().andCreateflagEqualTo(0).andStatusEqualTo("SETTLEMENT");
//		List<MayCurConsumeSubmit> submitList = mayCurConsumeSubmitService.selectByExample(submitExample);
//
//		if (submitList.size() > 0) {
//			try {
//				for (MayCurConsumeSubmit submit : submitList) {
//					logger.info("create " + submit.getReportId() + " oa data");
//					mayCurConsumeSubmitService.saveSubmitData2OA(submit);
//					logger.info("end create " + submit.getReportId() + " oa data");
//				}
//			} catch (Exception e) {
//				logger.error("create consume submit data to OA error", e);
//			}
//		}

	}

}
