package com.yycoin.job;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yycoin.service.IMayCurExpenseSubmitService;
import com.yycoin.util.BaseContants;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;

@Component
public class MayCur2OACreateExpenseSchedule implements Job, BaseContants {

	private static Logger logger = LoggerFactory.getLogger(MayCur2OACreateExpenseSchedule.class);

	@Autowired
	private IMayCurExpenseSubmitService mayCurExpenseSubmitService;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("start create submit data to OA");
		MayCurExpenseSubmitExample submitExample = new MayCurExpenseSubmitExample();
		submitExample.createCriteria().andCreateflagEqualTo(0);
		List<MayCurExpenseSubmit> submitList = mayCurExpenseSubmitService.selectByExample(submitExample);

		if (submitList.size() > 0) {
			try {
				mayCurExpenseSubmitService.saveSubmitData2OA(submitList);
			} catch (Exception e) {
				logger.error("create submit data to OA error", e);
			}
		}

	}

}
