package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.service.IMayCurCorpSubmitService;
import com.yycoin.vo.MayCurCorpSubmit;
import com.yycoin.vo.MayCurCorpSubmitExample;
import com.yycoin.vo.MayCurCorpSubmitMapper;

@Service
public class MayCurCorpSubmitServiceImpl implements IMayCurCorpSubmitService {

	@Autowired
	private MayCurCorpSubmitMapper mapper;

	@Override
	public int countByExample(MayCurCorpSubmitExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurCorpSubmitExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurCorpSubmit record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurCorpSubmit record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurCorpSubmit> selectByExample(MayCurCorpSubmitExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurCorpSubmit selectByPrimaryKey(String reportId) {
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurCorpSubmit record, MayCurCorpSubmitExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurCorpSubmit record, MayCurCorpSubmitExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurCorpSubmit record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurCorpSubmit record) {
		return mapper.updateByPrimaryKey(record);
	}

}
