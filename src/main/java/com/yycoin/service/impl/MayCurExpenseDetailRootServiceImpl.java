package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurExpenseDetailRootDao;
import com.yycoin.service.IMayCurExpenseDetailRootService;
import com.yycoin.vo.MayCurExpenseDetailRoot;
import com.yycoin.vo.MayCurExpenseDetailRootExample;
import com.yycoin.vo.MayCurExpenseDetailRootWithBLOBs;

@Service
public class MayCurExpenseDetailRootServiceImpl implements IMayCurExpenseDetailRootService {

	@Autowired
	private IMayCurExpenseDetailRootDao dao;

	@Override
	public int countByExample(MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurExpenseDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int insertSelective(MayCurExpenseDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	@Override
	public List<MayCurExpenseDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<MayCurExpenseDetailRoot> selectByExample(MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.selectByExample(example);
	}

	@Override
	public MayCurExpenseDetailRootWithBLOBs selectByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurExpenseDetailRootWithBLOBs record,
			MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(MayCurExpenseDetailRootWithBLOBs record,
			MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(MayCurExpenseDetailRoot record, MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurExpenseDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(MayCurExpenseDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurExpenseDetailRoot record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}

}
