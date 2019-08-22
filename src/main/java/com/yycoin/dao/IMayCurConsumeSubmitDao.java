package com.yycoin.dao;

import java.util.List;

import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;

public interface IMayCurConsumeSubmitDao {

	int countByExample(MayCurConsumeSubmitExample example);

	int deleteByExample(MayCurConsumeSubmitExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurConsumeSubmit record);

	int insertSelective(MayCurConsumeSubmit record);

	List<MayCurConsumeSubmit> selectByExample(MayCurConsumeSubmitExample example);

	MayCurConsumeSubmit selectByPrimaryKey(String reportId);

	int updateByExampleSelective(MayCurConsumeSubmit record, MayCurConsumeSubmitExample example);

	int updateByExample(MayCurConsumeSubmit record, MayCurConsumeSubmitExample example);

	int updateByPrimaryKeySelective(MayCurConsumeSubmit record);

	int updateByPrimaryKey(MayCurConsumeSubmit record);

}
