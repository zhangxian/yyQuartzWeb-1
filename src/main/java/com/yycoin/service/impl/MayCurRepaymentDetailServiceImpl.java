package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurRepaymentDetailDao;
import com.yycoin.service.IMayCurRepaymentDetailService;
import com.yycoin.vo.MayCurRepaymentDetailRoot;
import com.yycoin.vo.MayCurRepaymentDetailRootExample;
import com.yycoin.vo.MayCurRepaymentDetailRootWithBLOBs;

@Service
public class MayCurRepaymentDetailServiceImpl implements IMayCurRepaymentDetailService {

	@Autowired
	private IMayCurRepaymentDetailDao dao;

	@Override
	public int countByExample(MayCurRepaymentDetailRootExample example) {
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurRepaymentDetailRootExample example) {
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return dao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurRepaymentDetailRootWithBLOBs record) {
		return dao.insert(record);
	}

	@Override
	public int insertSelective(MayCurRepaymentDetailRootWithBLOBs record) {
		return dao.insertSelective(record);
	}

	@Override
	public List<MayCurRepaymentDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurRepaymentDetailRootExample example) {
		return dao.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<MayCurRepaymentDetailRoot> selectByExample(MayCurRepaymentDetailRootExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public MayCurRepaymentDetailRootWithBLOBs selectByPrimaryKey(String reportId) {
		return dao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurRepaymentDetailRootWithBLOBs record,
			MayCurRepaymentDetailRootExample example) {
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(MayCurRepaymentDetailRootWithBLOBs record,
			MayCurRepaymentDetailRootExample example) {
		return dao.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(MayCurRepaymentDetailRoot record, MayCurRepaymentDetailRootExample example) {
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurRepaymentDetailRootWithBLOBs record) {
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(MayCurRepaymentDetailRootWithBLOBs record) {
		return dao.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurRepaymentDetailRoot record) {
		return dao.updateByPrimaryKey(record);
	}

}
