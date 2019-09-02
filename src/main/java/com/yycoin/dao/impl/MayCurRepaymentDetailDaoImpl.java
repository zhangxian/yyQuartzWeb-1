package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurRepaymentDetailDao;
import com.yycoin.vo.MayCurRepaymentDetailRoot;
import com.yycoin.vo.MayCurRepaymentDetailRootExample;
import com.yycoin.vo.MayCurRepaymentDetailRootMapper;
import com.yycoin.vo.MayCurRepaymentDetailRootWithBLOBs;

@Service
public class MayCurRepaymentDetailDaoImpl implements IMayCurRepaymentDetailDao {

	@Autowired
	private MayCurRepaymentDetailRootMapper mapper;

	@Override
	public int countByExample(MayCurRepaymentDetailRootExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurRepaymentDetailRootExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurRepaymentDetailRootWithBLOBs record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurRepaymentDetailRootWithBLOBs record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurRepaymentDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurRepaymentDetailRootExample example) {
		return mapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<MayCurRepaymentDetailRoot> selectByExample(MayCurRepaymentDetailRootExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurRepaymentDetailRootWithBLOBs selectByPrimaryKey(String reportId) {
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurRepaymentDetailRootWithBLOBs record,
			MayCurRepaymentDetailRootExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(MayCurRepaymentDetailRootWithBLOBs record,
			MayCurRepaymentDetailRootExample example) {
		return mapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(MayCurRepaymentDetailRoot record, MayCurRepaymentDetailRootExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurRepaymentDetailRootWithBLOBs record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(MayCurRepaymentDetailRootWithBLOBs record) {
		return mapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurRepaymentDetailRoot record) {
		return mapper.updateByPrimaryKey(record);
	}

}
