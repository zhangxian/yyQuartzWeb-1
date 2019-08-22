package com.yycoin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yycoin.vo.MayCurExpenseDetailRoot;
import com.yycoin.vo.MayCurExpenseDetailRootExample;
import com.yycoin.vo.MayCurExpenseDetailRootWithBLOBs;

public interface IMayCurExpenseDetailRootDao {

	int countByExample(MayCurExpenseDetailRootExample example);

	int deleteByExample(MayCurExpenseDetailRootExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurExpenseDetailRootWithBLOBs record);

	int insertSelective(MayCurExpenseDetailRootWithBLOBs record);

	List<MayCurExpenseDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurExpenseDetailRootExample example);

	List<MayCurExpenseDetailRoot> selectByExample(MayCurExpenseDetailRootExample example);

	MayCurExpenseDetailRootWithBLOBs selectByPrimaryKey(String reportId);

	int updateByExampleSelective(@Param("record") MayCurExpenseDetailRootWithBLOBs record,
			@Param("example") MayCurExpenseDetailRootExample example);

	int updateByExampleWithBLOBs(@Param("record") MayCurExpenseDetailRootWithBLOBs record,
			@Param("example") MayCurExpenseDetailRootExample example);

	int updateByExample(@Param("record") MayCurExpenseDetailRoot record,
			@Param("example") MayCurExpenseDetailRootExample example);

	int updateByPrimaryKeySelective(MayCurExpenseDetailRootWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(MayCurExpenseDetailRootWithBLOBs record);

	int updateByPrimaryKey(MayCurExpenseDetailRoot record);

}
