package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.service.IMayCurCorpDetailService;
import com.yycoin.vo.MayCurCorpDetailRoot;
import com.yycoin.vo.MayCurCorpDetailRootExample;
import com.yycoin.vo.MayCurCorpDetailRootMapper;
import com.yycoin.vo.MayCurCorpDetailRootWithBLOBs;

@Service
public class MayCurCorpDetailServiceImpl implements IMayCurCorpDetailService {

	@Autowired
	private MayCurCorpDetailRootMapper mapper;

	@Override
	public int countByExample(MayCurCorpDetailRootExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurCorpDetailRootExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurCorpDetailRootWithBLOBs record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurCorpDetailRootWithBLOBs record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurCorpDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurCorpDetailRootExample example) {
		return mapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<MayCurCorpDetailRoot> selectByExample(MayCurCorpDetailRootExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurCorpDetailRootWithBLOBs selectByPrimaryKey(String reportId) {
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurCorpDetailRootWithBLOBs record, MayCurCorpDetailRootExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(MayCurCorpDetailRootWithBLOBs record, MayCurCorpDetailRootExample example) {
		return mapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(MayCurCorpDetailRoot record, MayCurCorpDetailRootExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurCorpDetailRootWithBLOBs record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(MayCurCorpDetailRootWithBLOBs record) {
		return mapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurCorpDetailRoot record) {
		return mapper.updateByPrimaryKey(record);
	}

}
