package com.yycoin.dao;

import java.util.List;

import com.yycoin.vo.MayCurRepaymentDetailRoot;
import com.yycoin.vo.MayCurRepaymentDetailRootExample;
import com.yycoin.vo.MayCurRepaymentDetailRootWithBLOBs;

public interface IMayCurRepaymentDetailDao {

	int countByExample(MayCurRepaymentDetailRootExample example);

	int deleteByExample(MayCurRepaymentDetailRootExample example);

	int deleteByPrimaryKey(String reportId);

	int insert(MayCurRepaymentDetailRootWithBLOBs record);

	int insertSelective(MayCurRepaymentDetailRootWithBLOBs record);

	List<MayCurRepaymentDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurRepaymentDetailRootExample example);

	List<MayCurRepaymentDetailRoot> selectByExample(MayCurRepaymentDetailRootExample example);

	MayCurRepaymentDetailRootWithBLOBs selectByPrimaryKey(String reportId);

	int updateByExampleSelective(MayCurRepaymentDetailRootWithBLOBs record, MayCurRepaymentDetailRootExample example);

	int updateByExampleWithBLOBs(MayCurRepaymentDetailRootWithBLOBs record, MayCurRepaymentDetailRootExample example);

	int updateByExample(MayCurRepaymentDetailRoot record, MayCurRepaymentDetailRootExample example);

	int updateByPrimaryKeySelective(MayCurRepaymentDetailRootWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(MayCurRepaymentDetailRootWithBLOBs record);

	int updateByPrimaryKey(MayCurRepaymentDetailRoot record);

}
