package com.yycoin.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IQuartzJobDao;
import com.yycoin.pojo.TCenterTaskScheduler;
import com.yycoin.service.IQuartzJobService;
import com.yycoin.util.PageBean;

@Service("quartzJobService")
public class QuartzJobServiceImpl implements IQuartzJobService {

	private static Logger log = LoggerFactory.getLogger(QuartzJobServiceImpl.class);

	@Autowired
	IQuartzJobDao quartzJobDao;

	@Autowired(required = false)
	private Scheduler scheduler;

	@Override
	public List<TCenterTaskScheduler> getAllJobsByPage(Map<String, String> paramMap, PageBean pg) {
		return quartzJobDao.getAllJobsByPage(paramMap, pg);
	}

	@Override
	public int countAllJobs(Map<String, String> paramMap) {
		return quartzJobDao.countAllJobs(paramMap);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addScheduler(TCenterTaskScheduler job) throws Exception {
		String jobName = job.getBeanClass();
		String jobGroup = job.getJobGroup();
		String cronExpression = job.getCronExpression();
		String jobDescription = job.getDescription();
		try {
			if (checkExists(jobName, jobGroup)) {
				log.info("add job fail, job already exist, jobGroup:{}, jobName:{}", jobGroup, jobName);
			}

			TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);
			JobKey jobKey = JobKey.jobKey(jobName, jobGroup);

			CronScheduleBuilder schedBuilder = CronScheduleBuilder.cronSchedule(cronExpression)
					.withMisfireHandlingInstructionDoNothing();
			CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(triggerKey).withDescription(jobDescription)
					.withSchedule(schedBuilder).build();

			Class<? extends Job> clazz = (Class<? extends Job>) Class.forName(jobName);
			JobDetail jobDetail = JobBuilder.newJob(clazz).withIdentity(jobKey).withDescription(jobDescription).build();
			scheduler.scheduleJob(jobDetail, trigger);
		} catch (SchedulerException | ClassNotFoundException e) {
			e.printStackTrace();
			log.error("addScheduler error:类名不存在或执行表达式错误", e);
			throw e;
		}
	}

	@Override
	public void editScheduler(TCenterTaskScheduler info) throws Exception {
		String jobName = info.getBeanClass();
		String jobGroup = info.getJobGroup();
		String cronExpression = info.getCronExpression();
		String jobDescription = info.getDescription();
		try {
			if (!checkExists(jobName, jobGroup)) {
				log.info("edit job fail, job is not exist, jobGroup:{}, jobName:{}", jobGroup, jobName);
			}
			TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);
			JobKey jobKey = new JobKey(jobName, jobGroup);
			CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression)
					.withMisfireHandlingInstructionDoNothing();
			CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(triggerKey)
					.withDescription(jobDescription).withSchedule(cronScheduleBuilder).build();

			JobDetail jobDetail = scheduler.getJobDetail(jobKey);
			jobDetail.getJobBuilder().withDescription(jobDescription);
			HashSet<Trigger> triggerSet = new HashSet<>();
			triggerSet.add(cronTrigger);

			scheduler.scheduleJob(jobDetail, triggerSet, true);
		} catch (SchedulerException e) {
			log.error("editScheduler error:类名不存在或执行表达式错误,", e);
			throw e;
		}

	}

	@Override
	public void deleteScheduler(String jobName, String jobGroup) throws Exception {
		TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);
		try {
			if (checkExists(jobName, jobGroup)) {
				scheduler.pauseTrigger(triggerKey);
				scheduler.unscheduleJob(triggerKey);
				log.info("delete job, triggerKey:{},jobGroup:{}, jobName:{}", triggerKey, jobGroup, jobName);
			}
		} catch (SchedulerException e) {
			log.error("deleteScheduler error", e);
			throw e;
		}

	}

	@Override
	public void pauseScheduler(String jobName, String jobGroup) throws Exception {
		TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);
		try {
			if (checkExists(jobName, jobGroup)) {
				scheduler.pauseTrigger(triggerKey);
				log.info("pause job success, triggerKey:{},jobGroup:{}, jobName:{}", triggerKey, jobGroup, jobName);
			}
		} catch (SchedulerException e) {
			log.error("pauseScheduler error", e);
			throw e;
		}

	}

	@Override
	public void resumeScheduler(String jobName, String jobGroup) throws Exception {
		TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);

		try {
			if (checkExists(jobName, jobGroup)) {
				scheduler.resumeTrigger(triggerKey);
				log.info("resume job success,triggerKey:{},jobGroup:{}, jobName:{}", triggerKey, jobGroup, jobName);
			}
		} catch (SchedulerException e) {
			log.error(e.getMessage());
			throw e;
		}

	}

	@Override
	public boolean checkExists(String jobName, String jobGroup) throws SchedulerException {
		TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);
		return scheduler.checkExists(triggerKey);
	}

}
