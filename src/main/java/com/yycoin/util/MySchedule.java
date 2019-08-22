package com.yycoin.util;

import org.quartz.CronTrigger;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

@DisallowConcurrentExecution
@Component
public class MySchedule implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		boolean isExecute = false; // 是否已执行业务逻辑
		boolean flag = false; // 业务逻辑执行后返回结果
		try {
			CronTrigger trigger = (CronTrigger) context.getTrigger();
			String corn = trigger.getCronExpression();
			String jobName = trigger.getKey().getName();
			String jobGroup = trigger.getKey().getGroup();
			System.out.println("corn:" + corn);
			System.out.println("jobName:" + jobName);
			System.out.println("jobGroup:" + jobGroup);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("执行任务中");
	}

}
