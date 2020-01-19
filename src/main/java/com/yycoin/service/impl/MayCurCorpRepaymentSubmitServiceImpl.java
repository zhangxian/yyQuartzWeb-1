package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.service.IMayCurCorpRepaymentSubmitService;
import com.yycoin.vo.MayCurCorpRepaymentSubmit;
import com.yycoin.vo.MayCurCorpRepaymentSubmitExample;
import com.yycoin.vo.MayCurCorpRepaymentSubmitMapper;

@Service
public class MayCurCorpRepaymentSubmitServiceImpl implements IMayCurCorpRepaymentSubmitService {

	@Autowired
	private MayCurCorpRepaymentSubmitMapper mapper;

	@Override
	public int countByExample(MayCurCorpRepaymentSubmitExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurCorpRepaymentSubmitExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurCorpRepaymentSubmit record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurCorpRepaymentSubmit record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurCorpRepaymentSubmit> selectByExample(MayCurCorpRepaymentSubmitExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurCorpRepaymentSubmit selectByPrimaryKey(String reportId) {
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurCorpRepaymentSubmit record, MayCurCorpRepaymentSubmitExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurCorpRepaymentSubmit record, MayCurCorpRepaymentSubmitExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurCorpRepaymentSubmit record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurCorpRepaymentSubmit record) {
		return mapper.updateByPrimaryKey(record);
	}

}
