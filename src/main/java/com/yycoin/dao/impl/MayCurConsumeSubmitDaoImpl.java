package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IMayCurConsumeSubmitDao;
import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;
import com.yycoin.vo.MayCurConsumeSubmitMapper;

@Service
public class MayCurConsumeSubmitDaoImpl implements IMayCurConsumeSubmitDao {

	@Autowired
	private MayCurConsumeSubmitMapper mapper;

	@Override
	public int countByExample(MayCurConsumeSubmitExample example) {
		// TODO Auto-generated method stub
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(MayCurConsumeSubmitExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(reportId);
	}

	@Override
	public int insert(MayCurConsumeSubmit record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(MayCurConsumeSubmit record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<MayCurConsumeSubmit> selectByExample(MayCurConsumeSubmitExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public MayCurConsumeSubmit selectByPrimaryKey(String reportId) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(reportId);
	}

	@Override
	public int updateByExampleSelective(MayCurConsumeSubmit record, MayCurConsumeSubmitExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(MayCurConsumeSubmit record, MayCurConsumeSubmitExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(MayCurConsumeSubmit record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(MayCurConsumeSubmit record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

}
