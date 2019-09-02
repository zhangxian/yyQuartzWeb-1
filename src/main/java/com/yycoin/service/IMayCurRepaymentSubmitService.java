package com.yycoin.service;

import java.util.List;

import com.yycoin.vo.MayCurRepaymentSubmit;
import com.yycoin.vo.MayCurRepaymentSubmitExample;

public interface IMayCurRepaymentSubmitService {

	int countByExample(MayCurRepaymentSubmitExample example);

	int deleteByExample(MayCurRepaymentSubmitExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurRepaymentSubmit record);

	int insertSelective(MayCurRepaymentSubmit record);

	List<MayCurRepaymentSubmit> selectByExample(MayCurRepaymentSubmitExample example);

	MayCurRepaymentSubmit selectByPrimaryKey(String reportId);

	int updateByExampleSelective(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example);

	int updateByExample(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example);

	int updateByPrimaryKeySelective(MayCurRepaymentSubmit record);

	int updateByPrimaryKey(MayCurRepaymentSubmit record);

	public void saveSubmitData2OA(List<MayCurRepaymentSubmit> submitList) throws Exception;

}
