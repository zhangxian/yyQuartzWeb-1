package com.yycoin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yycoin.vo.MayCurCorpRepaymentSubmit;
import com.yycoin.vo.MayCurCorpRepaymentSubmitExample;

public interface IMayCurCorpRepaymentSubmitService {

	int countByExample(MayCurCorpRepaymentSubmitExample example);

	int deleteByExample(MayCurCorpRepaymentSubmitExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurCorpRepaymentSubmit record);

	int insertSelective(MayCurCorpRepaymentSubmit record);

	List<MayCurCorpRepaymentSubmit> selectByExample(MayCurCorpRepaymentSubmitExample example);

	MayCurCorpRepaymentSubmit selectByPrimaryKey(String reportId);

	int updateByExampleSelective(@Param("record") MayCurCorpRepaymentSubmit record,
			@Param("example") MayCurCorpRepaymentSubmitExample example);

	int updateByExample(@Param("record") MayCurCorpRepaymentSubmit record,
			@Param("example") MayCurCorpRepaymentSubmitExample example);

	int updateByPrimaryKeySelective(MayCurCorpRepaymentSubmit record);

	int updateByPrimaryKey(MayCurCorpRepaymentSubmit record);

}
