package com.yycoin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yycoin.vo.MayCurCorpRepaymentDetailRoot;
import com.yycoin.vo.MayCurCorpRepaymentDetailRootExample;
import com.yycoin.vo.MayCurCorpRepaymentDetailRootWithBLOBs;

public interface IMayCurCorpRepaymentDetailService {

	int countByExample(MayCurCorpRepaymentDetailRootExample example);

	int deleteByExample(MayCurCorpRepaymentDetailRootExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurCorpRepaymentDetailRootWithBLOBs record);

	int insertSelective(MayCurCorpRepaymentDetailRootWithBLOBs record);

	List<MayCurCorpRepaymentDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurCorpRepaymentDetailRootExample example);

	List<MayCurCorpRepaymentDetailRoot> selectByExample(MayCurCorpRepaymentDetailRootExample example);

	MayCurCorpRepaymentDetailRootWithBLOBs selectByPrimaryKey(String reportId);

	int updateByExampleSelective(@Param("record") MayCurCorpRepaymentDetailRootWithBLOBs record,
			@Param("example") MayCurCorpRepaymentDetailRootExample example);

	int updateByExampleWithBLOBs(@Param("record") MayCurCorpRepaymentDetailRootWithBLOBs record,
			@Param("example") MayCurCorpRepaymentDetailRootExample example);

	int updateByExample(@Param("record") MayCurCorpRepaymentDetailRoot record,
			@Param("example") MayCurCorpRepaymentDetailRootExample example);

	int updateByPrimaryKeySelective(MayCurCorpRepaymentDetailRootWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(MayCurCorpRepaymentDetailRootWithBLOBs record);

	int updateByPrimaryKey(MayCurCorpRepaymentDetailRoot record);

}
