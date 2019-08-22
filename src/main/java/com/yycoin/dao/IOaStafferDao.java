package com.yycoin.dao;

import java.util.List;

import com.yycoin.vo.travelapply.TCenterOaStaffer;
import com.yycoin.vo.travelapply.TCenterOaStafferExample;

public interface IOaStafferDao {

	int countByExample(TCenterOaStafferExample example);

	int deleteByExample(TCenterOaStafferExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(TCenterOaStaffer record);

	int insertSelective(TCenterOaStaffer record);

	List<TCenterOaStaffer> selectByExample(TCenterOaStafferExample example);

	TCenterOaStaffer selectByPrimaryKey(Integer id);

	int updateByExampleSelective(TCenterOaStaffer record, TCenterOaStafferExample example);

	int updateByExample(TCenterOaStaffer record, TCenterOaStafferExample example);

	int updateByPrimaryKeySelective(TCenterOaStaffer record);

	int updateByPrimaryKey(TCenterOaStaffer record);

}
