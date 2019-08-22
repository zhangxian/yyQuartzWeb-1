package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurExpenseSubmitDao;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;
import com.yycoin.vo.MayCurExpenseSubmitMapper;

@Service
public class MayCurExpenseSubmitDaoImpl implements IMayCurExpenseSubmitDao {

	@Autowired
	private MayCurExpenseSubmitMapper mapper;

	@Override
	public int countByExample(MayCurExpenseSubmitExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurExpenseSubmitExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurExpenseSubmit record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurExpenseSubmit record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurExpenseSubmit> selectByExample(MayCurExpenseSubmitExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurExpenseSubmit selectByPrimaryKey(String reportId) {
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurExpenseSubmit record, MayCurExpenseSubmitExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurExpenseSubmit record, MayCurExpenseSubmitExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurExpenseSubmit record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurExpenseSubmit record) {
		return mapper.updateByPrimaryKey(record);
	}
}
