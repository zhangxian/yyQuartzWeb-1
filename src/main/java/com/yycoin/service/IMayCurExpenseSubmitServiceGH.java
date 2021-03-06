package com.yycoin.service;

import java.util.List;

import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;

public interface IMayCurExpenseSubmitServiceGH {

	int countByExample(MayCurExpenseSubmitExample example);

	int deleteByExample(MayCurExpenseSubmitExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurExpenseSubmit record);

	int insertSelective(MayCurExpenseSubmit record);

	List<MayCurExpenseSubmit> selectByExample(MayCurExpenseSubmitExample example);

	MayCurExpenseSubmit selectByPrimaryKey(String reportId);

	int updateByExampleSelective(MayCurExpenseSubmit record, MayCurExpenseSubmitExample example);

	int updateByExample(MayCurExpenseSubmit record, MayCurExpenseSubmitExample example);

	int updateByPrimaryKeySelective(MayCurExpenseSubmit record);

	int updateByPrimaryKey(MayCurExpenseSubmit record);

	public void saveSubmitData2OA(String reportId) throws Exception;
}
