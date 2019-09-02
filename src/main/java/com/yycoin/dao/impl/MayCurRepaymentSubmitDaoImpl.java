package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurRepaymentSubmitDao;
import com.yycoin.vo.MayCurRepaymentSubmit;
import com.yycoin.vo.MayCurRepaymentSubmitExample;
import com.yycoin.vo.MayCurRepaymentSubmitMapper;

@Service
public class MayCurRepaymentSubmitDaoImpl implements IMayCurRepaymentSubmitDao {

	@Autowired
	private MayCurRepaymentSubmitMapper mapper;

	@Override
	public int countByExample(MayCurRepaymentSubmitExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurRepaymentSubmitExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurRepaymentSubmit record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurRepaymentSubmit record) {
		return mapper.insert(record);
	}

	@Override
	public List<MayCurRepaymentSubmit> selectByExample(MayCurRepaymentSubmitExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurRepaymentSubmit selectByPrimaryKey(String reportId) {
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurRepaymentSubmit record, MayCurRepaymentSubmitExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurRepaymentSubmit record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurRepaymentSubmit record) {
		return mapper.updateByPrimaryKey(record);
	}

}
