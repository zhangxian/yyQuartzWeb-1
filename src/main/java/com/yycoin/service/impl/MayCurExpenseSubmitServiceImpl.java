package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurExpenseSubmitDao;
import com.yycoin.service.IMayCurExpenseSubmitService;
import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;

@Service
public class MayCurExpenseSubmitServiceImpl implements IMayCurExpenseSubmitService {

	@Autowired
	private IMayCurExpenseSubmitDao dao;

	@Override
	public int countByExample(MayCurExpenseSubmitExample example) {
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurExpenseSubmitExample example) {
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return dao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurExpenseSubmit record) {
		return dao.insert(record);
	}

	@Override
	public int insertSelective(MayCurExpenseSubmit record) {
		return dao.insertSelective(record);
	}

	@Override
	public List<MayCurExpenseSubmit> selectByExample(MayCurExpenseSubmitExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public MayCurExpenseSubmit selectByPrimaryKey(String reportId) {
		return dao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurExpenseSubmit record, MayCurExpenseSubmitExample example) {
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurExpenseSubmit record, MayCurExpenseSubmitExample example) {
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurExpenseSubmit record) {
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurExpenseSubmit record) {
		return dao.updateByPrimaryKey(record);
	}
}
