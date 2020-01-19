package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.service.IMayCurCorpRepaymentDetailService;
import com.yycoin.vo.MayCurCorpRepaymentDetailRoot;
import com.yycoin.vo.MayCurCorpRepaymentDetailRootExample;
import com.yycoin.vo.MayCurCorpRepaymentDetailRootMapper;
import com.yycoin.vo.MayCurCorpRepaymentDetailRootWithBLOBs;

@Service
public class MayCurCorpRepaymentDetailServiceImpl implements IMayCurCorpRepaymentDetailService {

	@Autowired
	private MayCurCorpRepaymentDetailRootMapper mapper;

	@Override
	public int countByExample(MayCurCorpRepaymentDetailRootExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurCorpRepaymentDetailRootExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurCorpRepaymentDetailRootWithBLOBs record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurCorpRepaymentDetailRootWithBLOBs record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurCorpRepaymentDetailRootWithBLOBs> selectByExampleWithBLOBs(
			MayCurCorpRepaymentDetailRootExample example) {
		return mapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<MayCurCorpRepaymentDetailRoot> selectByExample(MayCurCorpRepaymentDetailRootExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurCorpRepaymentDetailRootWithBLOBs selectByPrimaryKey(String reportId) {
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurCorpRepaymentDetailRootWithBLOBs record,
			MayCurCorpRepaymentDetailRootExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(MayCurCorpRepaymentDetailRootWithBLOBs record,
			MayCurCorpRepaymentDetailRootExample example) {
		return mapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(MayCurCorpRepaymentDetailRoot record, MayCurCorpRepaymentDetailRootExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurCorpRepaymentDetailRootWithBLOBs record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(MayCurCorpRepaymentDetailRootWithBLOBs record) {
		return mapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurCorpRepaymentDetailRoot record) {
		return mapper.updateByPrimaryKey(record);
	}

}
