package com.yycoin.service;

import java.util.List;

import com.yycoin.vo.TCenterPayListLog;
import com.yycoin.vo.TCenterPayListLogExample;

public interface ITCenterPayListLogService {

	int countByExample(TCenterPayListLogExample example);

	int deleteByExample(TCenterPayListLogExample example);

	int insert(TCenterPayListLog record);

	int insertSelective(TCenterPayListLog record);

	List<TCenterPayListLog> selectByExample(TCenterPayListLogExample example);

	int updateByExampleSelective(TCenterPayListLog record, TCenterPayListLogExample example);

	int updateByExample(TCenterPayListLog record, TCenterPayListLogExample example);

}
