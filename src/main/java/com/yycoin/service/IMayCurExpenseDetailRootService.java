package com.yycoin.service;

import java.util.List;

import com.yycoin.vo.MayCurExpenseDetailRoot;
import com.yycoin.vo.MayCurExpenseDetailRootExample;
import com.yycoin.vo.MayCurExpenseDetailRootWithBLOBs;

public interface IMayCurExpenseDetailRootService {

	int countByExample(MayCurExpenseDetailRootExample example);

	int deleteByExample(MayCurExpenseDetailRootExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurExpenseDetailRootWithBLOBs record);

	int insertSelective(MayCurExpenseDetailRootWithBLOBs record);

	List<MayCurExpenseDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurExpenseDetailRootExample example);

	List<MayCurExpenseDetailRoot> selectByExample(MayCurExpenseDetailRootExample example);

	MayCurExpenseDetailRootWithBLOBs selectByPrimaryKey(String reportId);

	int updateByExampleSelective(MayCurExpenseDetailRootWithBLOBs record, MayCurExpenseDetailRootExample example);

	int updateByExampleWithBLOBs(MayCurExpenseDetailRootWithBLOBs record, MayCurExpenseDetailRootExample example);

	int updateByExample(MayCurExpenseDetailRoot record, MayCurExpenseDetailRootExample example);

	int updateByPrimaryKeySelective(MayCurExpenseDetailRootWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(MayCurExpenseDetailRootWithBLOBs record);

	int updateByPrimaryKey(MayCurExpenseDetailRoot record);

}
