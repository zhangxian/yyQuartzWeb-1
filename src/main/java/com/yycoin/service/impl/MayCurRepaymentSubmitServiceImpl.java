package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurRepaymentSubmitDao;
import com.yycoin.service.IMayCurRepaymentSubmitService;
import com.yycoin.vo.MayCurRepaymentSubmit;
import com.yycoin.vo.MayCurRepaymentSubmitExample;

@Service
public class MayCurRepaymentSubmitServiceImpl implements IMayCurRepaymentSubmitService {

	@Autowired
	private IMayCurRepaymentSubmitDao dao;

	@Override
	public int countByExample(MayCurRepaymentSubmitExample example) {
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurRepaymentSubmitExample example) {
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return dao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurRepaymentSubmit record) {
		return dao.insert(record);
	}

	@Override
	public int insertSelective(MayCurRepaymentSubmit record) {
		return dao.insertSelective(record);
	}

	@Override
	public List<MayCurRepaymentSubmit> selectByExample(MayCurRepaymentSubmitExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public MayCurRepaymentSubmit selectByPrimaryKey(String reportId) {
		return dao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example) {
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example) {
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurRepaymentSubmit record) {
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurRepaymentSubmit record) {
		return dao.updateByPrimaryKey(record);
	}

}
