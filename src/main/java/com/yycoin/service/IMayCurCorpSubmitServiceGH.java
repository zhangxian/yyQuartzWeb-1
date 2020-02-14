package com.yycoin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yycoin.vo.MayCurCorpSubmit;
import com.yycoin.vo.MayCurCorpSubmitExample;

public interface IMayCurCorpSubmitServiceGH {
	int countByExample(MayCurCorpSubmitExample example);

	int deleteByExample(MayCurCorpSubmitExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurCorpSubmit record);

	int insertSelective(MayCurCorpSubmit record);

	List<MayCurCorpSubmit> selectByExample(MayCurCorpSubmitExample example);

	MayCurCorpSubmit selectByPrimaryKey(String reportId);

	int updateByExampleSelective(@Param("record") MayCurCorpSubmit record,
			@Param("example") MayCurCorpSubmitExample example);

	int updateByExample(@Param("record") MayCurCorpSubmit record, @Param("example") MayCurCorpSubmitExample example);

	int updateByPrimaryKeySelective(MayCurCorpSubmit record);

	int updateByPrimaryKey(MayCurCorpSubmit record);

	public void saveSubmitData2OA(String reportId) throws Exception;
}
