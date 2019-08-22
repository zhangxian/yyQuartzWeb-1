package com.yycoin.dao;

import java.util.List;

import com.yycoin.vo.MayCurConsumeDetailRoot;
import com.yycoin.vo.MayCurConsumeDetailRootExample;
import com.yycoin.vo.MayCurConsumeDetailRootWithBLOBs;

public interface IMayCurConsumeDetailRootDao {

	int countByExample(MayCurConsumeDetailRootExample example);

	int deleteByExample(MayCurConsumeDetailRootExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurConsumeDetailRootWithBLOBs record);

	int insertSelective(MayCurConsumeDetailRootWithBLOBs record);

	List<MayCurConsumeDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurConsumeDetailRootExample example);

	List<MayCurConsumeDetailRoot> selectByExample(MayCurConsumeDetailRootExample example);

	MayCurConsumeDetailRootWithBLOBs selectByPrimaryKey(String reportId);

	int updateByExampleSelective(MayCurConsumeDetailRootWithBLOBs record, MayCurConsumeDetailRootExample example);

	int updateByExampleWithBLOBs(MayCurConsumeDetailRootWithBLOBs record, MayCurConsumeDetailRootExample example);

	int updateByExample(MayCurConsumeDetailRoot record, MayCurConsumeDetailRootExample example);

	int updateByPrimaryKeySelective(MayCurConsumeDetailRootWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(MayCurConsumeDetailRootWithBLOBs record);

	int updateByPrimaryKey(MayCurConsumeDetailRoot record);

}
