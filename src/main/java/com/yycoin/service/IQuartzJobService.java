package com.yycoin.service;

import java.util.List;
import java.util.Map;

import com.yycoin.pojo.TCenterTaskScheduler;
import com.yycoin.util.PageBean;

public interface IQuartzJobService {

	List<TCenterTaskScheduler> getAllJobsByPage(Map<String, String> paramMap, PageBean pg);

	int countAllJobs(Map<String, String> paramMap);

	void addScheduler(TCenterTaskScheduler job) throws Exception;

	void editScheduler(TCenterTaskScheduler info) throws Exception;

	void deleteScheduler(String jobName, String jobGroup) throws Exception;

	void pauseScheduler(String jobName, String jobGroup) throws Exception;

	void resumeScheduler(String jobName, String jobGroup) throws Exception;

	boolean checkExists(String jobName, String jobGroup) throws Exception;

}
