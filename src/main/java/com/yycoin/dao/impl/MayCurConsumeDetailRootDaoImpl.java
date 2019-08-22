package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurConsumeDetailRootDao;
import com.yycoin.vo.MayCurConsumeDetailRoot;
import com.yycoin.vo.MayCurConsumeDetailRootExample;
import com.yycoin.vo.MayCurConsumeDetailRootMapper;
import com.yycoin.vo.MayCurConsumeDetailRootWithBLOBs;

@Service
public class MayCurConsumeDetailRootDaoImpl implements IMayCurConsumeDetailRootDao {

	@Autowired
	private MayCurConsumeDetailRootMapper mapper;

	@Override
	public int countByExample(MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurConsumeDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurConsumeDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurConsumeDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<MayCurConsumeDetailRoot> selectByExample(MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurConsumeDetailRootWithBLOBs selectByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurConsumeDetailRootWithBLOBs record,
			MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(MayCurConsumeDetailRootWithBLOBs record,
			MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(MayCurConsumeDetailRoot record, MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurConsumeDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(MayCurConsumeDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurConsumeDetailRoot record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

}
