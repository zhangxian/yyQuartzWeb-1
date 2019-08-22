package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurConsumeDetailRootDao;
import com.yycoin.service.IMayCurConsumeDetailRootService;
import com.yycoin.vo.MayCurConsumeDetailRoot;
import com.yycoin.vo.MayCurConsumeDetailRootExample;
import com.yycoin.vo.MayCurConsumeDetailRootWithBLOBs;

@Service
public class MayCurConsumeDetailRootServiceImpl implements IMayCurConsumeDetailRootService {

	@Autowired
	private IMayCurConsumeDetailRootDao dao;

	@Override
	public int countByExample(MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurConsumeDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public int insertSelective(MayCurConsumeDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return dao.insertSelective(record);
	}

	@Override
	public List<MayCurConsumeDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<MayCurConsumeDetailRoot> selectByExample(MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.selectByExample(example);
	}

	@Override
	public MayCurConsumeDetailRootWithBLOBs selectByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurConsumeDetailRootWithBLOBs record,
			MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(MayCurConsumeDetailRootWithBLOBs record,
			MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(MayCurConsumeDetailRoot record, MayCurConsumeDetailRootExample example) {
		// TODO Auto-generated method stub
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurConsumeDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(MayCurConsumeDetailRootWithBLOBs record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurConsumeDetailRoot record) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(record);
	}

}
