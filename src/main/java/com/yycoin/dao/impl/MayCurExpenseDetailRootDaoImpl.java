package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurExpenseDetailRootDao;
import com.yycoin.vo.MayCurExpenseDetailRoot;
import com.yycoin.vo.MayCurExpenseDetailRootExample;
import com.yycoin.vo.MayCurExpenseDetailRootMapper;
import com.yycoin.vo.MayCurExpenseDetailRootWithBLOBs;

@Service
public class MayCurExpenseDetailRootDaoImpl implements IMayCurExpenseDetailRootDao {

	@Autowired
	private MayCurExpenseDetailRootMapper mapper;

	@Override
	public int countByExample(MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurExpenseDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurExpenseDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurExpenseDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<MayCurExpenseDetailRoot> selectByExample(MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurExpenseDetailRootWithBLOBs selectByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurExpenseDetailRootWithBLOBs record,
			MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(MayCurExpenseDetailRootWithBLOBs record,
			MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(MayCurExpenseDetailRoot record, MayCurExpenseDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurExpenseDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(MayCurExpenseDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurExpenseDetailRoot record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

}
