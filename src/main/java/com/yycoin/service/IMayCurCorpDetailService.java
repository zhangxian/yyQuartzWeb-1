package com.yycoin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yycoin.vo.MayCurCorpDetailRoot;
import com.yycoin.vo.MayCurCorpDetailRootExample;
import com.yycoin.vo.MayCurCorpDetailRootWithBLOBs;

public interface IMayCurCorpDetailService {
	int countByExample(MayCurCorpDetailRootExample example);

	int deleteByExample(MayCurCorpDetailRootExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurCorpDetailRootWithBLOBs record);

	int insertSelective(MayCurCorpDetailRootWithBLOBs record);

	List<MayCurCorpDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurCorpDetailRootExample example);

	List<MayCurCorpDetailRoot> selectByExample(MayCurCorpDetailRootExample example);

	MayCurCorpDetailRootWithBLOBs selectByPrimaryKey(String reportId);

	int updateByExampleSelective(@Param("record") MayCurCorpDetailRootWithBLOBs record,
			@Param("example") MayCurCorpDetailRootExample example);

	int updateByExampleWithBLOBs(@Param("record") MayCurCorpDetailRootWithBLOBs record,
			@Param("example") MayCurCorpDetailRootExample example);

	int updateByExample(@Param("record") MayCurCorpDetailRoot record,
			@Param("example") MayCurCorpDetailRootExample example);

	int updateByPrimaryKeySelective(MayCurCorpDetailRootWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(MayCurCorpDetailRootWithBLOBs record);

	int updateByPrimaryKey(MayCurCorpDetailRoot record);
}
