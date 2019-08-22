package com.yycoin.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IQuartzJobDao;
import com.yycoin.pojo.TCenterTaskScheduler;
import com.yycoin.util.BaseContants;
import com.yycoin.util.DateUtils;
import com.yycoin.util.PageBean;
import com.yycoin.vo.QrtzCronTriggers;
import com.yycoin.vo.QrtzCronTriggersExample;
import com.yycoin.vo.QrtzCronTriggersMapper;
import com.yycoin.vo.QrtzJobDetailsMapper;
import com.yycoin.vo.QrtzTriggers;
import com.yycoin.vo.QrtzTriggersExample;
import com.yycoin.vo.QrtzTriggersMapper;

@Service("quartzJobDao")
public class QuartzJobDaoImpl implements IQuartzJobDao {

	@Autowired
	QrtzTriggersMapper qrtzTriggersMapper;

	@Autowired
	QrtzCronTriggersMapper qrtzCronTriggersMapper;

	@Autowired
	QrtzJobDetailsMapper qrtzJobDetailsMapper;

	@Override
	public List<TCenterTaskScheduler> getAllJobsByPage(Map<String, String> paramMap, PageBean pg) {
		List<TCenterTaskScheduler> list = new ArrayList<TCenterTaskScheduler>();
		QrtzTriggersExample example = new QrtzTriggersExample();
		QrtzTriggersExample.Criteria cr = example.createCriteria();
		example.setStartRecordNum(pg.getStartIndex());
		example.setNumberOfRecordsToSelect(pg.getPageSize());
		if (StringUtils.isNotEmpty(paramMap.get("description"))) {
			cr.andDescriptionLikeInsensitive("%" + paramMap.get("description") + "%");
		}
		String jobStatus = paramMap.get("jobStatus");
		if (StringUtils.isNotEmpty(jobStatus)) {
			List<String> statusList = new ArrayList<String>();
			if ("0".equals(jobStatus)) {
				statusList.add("PAUSED");
				statusList.add("PAUSED_BLOCKED");
				cr.andTriggerStateIn(statusList);
			} else {
				statusList.add("ACQUIRED");
				statusList.add("WAITING");
				statusList.add("BLOCKED");
				cr.andTriggerStateIn(statusList);
			}
		}
		List<QrtzTriggers> triggersList = qrtzTriggersMapper.selectByExample(example);
		for (QrtzTriggers triggers : triggersList) {
			// 获取任务执行频率,执行时间,状态等
			QrtzCronTriggersExample cronExample = new QrtzCronTriggersExample();
			QrtzCronTriggersExample.Criteria cronCriteria = cronExample.createCriteria();
			cronCriteria.andTriggerNameEqualTo(triggers.getTriggerName());
			List<QrtzCronTriggers> cronTriggersList = qrtzCronTriggersMapper.selectByExample(cronExample);
			QrtzCronTriggers cronTriggers = cronTriggersList.get(0);
			TCenterTaskScheduler taskScheduler = new TCenterTaskScheduler();
			taskScheduler.setBeanClass(triggers.getTriggerName());
			taskScheduler.setLastTime(
					DateUtils.transferLongToDate(BaseContants.DATE_FORMAT_YYMMDDHHMMSS, triggers.getPrevFireTime()));
			taskScheduler.setNextTime(
					DateUtils.transferLongToDate(BaseContants.DATE_FORMAT_YYMMDDHHMMSS, triggers.getNextFireTime()));
			taskScheduler.setCronExpression(cronTriggers.getCronExpression());
			taskScheduler.setJobStatus(triggers.getTriggerState());
			taskScheduler.setDescription(triggers.getDescription());
			list.add(taskScheduler);
		}

		return list;
	}

	@Override
	public int countAllJobs(Map<String, String> paramMap) {
		QrtzTriggersExample example = new QrtzTriggersExample();
		QrtzTriggersExample.Criteria cr = example.createCriteria();
		if (StringUtils.isNotEmpty(paramMap.get("description"))) {
			cr.andJobNameLikeInsensitive("%" + paramMap.get("description") + "%");
		}
		String jobStatus = paramMap.get("jobStatus");
		if (StringUtils.isNotEmpty(jobStatus)) {
			List<String> statusList = new ArrayList<String>();
			if ("0".equals(jobStatus)) {
				statusList.add("PAUSED");
				statusList.add("PAUSED_BLOCKED");
				cr.andTriggerStateIn(statusList);
			} else {
				statusList.add("ACQUIRED");
				statusList.add("WAITING");
				statusList.add("BLOCKED");
				cr.andTriggerStateIn(statusList);
			}
		}
		return qrtzTriggersMapper.countByExample(example);
	}

}
