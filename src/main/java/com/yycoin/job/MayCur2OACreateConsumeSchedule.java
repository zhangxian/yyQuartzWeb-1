package com.yycoin.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.service.IMayCurConsumeSubmitService;
import com.yycoin.util.BaseContants;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;

@Component
public class MayCur2OACreateConsumeSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCur2OACreateConsumeSchedule.class);

	@Autowired
	private IMayCurConsumeSubmitService mayCurConsumeSubmitService;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start create submit data to OA");
		MayCurConsumeSubmitExample submitExample = new MayCurConsumeSubmitExample();
		submitExample.createCriteria().andCreateflagEqualTo(0);
		List<MayCurConsumeSubmit> submitList = mayCurConsumeSubmitService.selectByExample(submitExample);

		if (submitList.size() > 0) {
			try {
				mayCurConsumeSubmitService.saveSubmitData2OA(submitList);
			} catch (Exception e) {
				logger.error("create submit data to OA error", e);
			}
		}

	}

}
