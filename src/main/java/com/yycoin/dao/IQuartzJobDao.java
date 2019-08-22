package com.yycoin.dao;

import java.util.List;
import java.util.Map;

import com.yycoin.pojo.TCenterTaskScheduler;
import com.yycoin.util.PageBean;

public interface IQuartzJobDao {

	List<TCenterTaskScheduler> getAllJobsByPage(Map<String, String> paramMap, PageBean pg);

	int countAllJobs(Map<String, String> paramMap);

}
