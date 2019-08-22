package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IOaStafferDao;
import com.yycoin.vo.travelapply.TCenterOaStaffer;
import com.yycoin.vo.travelapply.TCenterOaStafferExample;
import com.yycoin.vo.travelapply.TCenterOaStafferMapper;

@Service
public class OaStafferDaoImpl implements IOaStafferDao {

	@Autowired
	private TCenterOaStafferMapper mapper;

	@Override
	public int countByExample(TCenterOaStafferExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TCenterOaStafferExample example) {
		// TODO Auto-generated method stub
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TCenterOaStaffer record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TCenterOaStaffer record) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public List<TCenterOaStaffer> selectByExample(TCenterOaStafferExample example) {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public TCenterOaStaffer selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(TCenterOaStaffer record, TCenterOaStafferExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TCenterOaStaffer record, TCenterOaStafferExample example) {
		// TODO Auto-generated method stub
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TCenterOaStaffer record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TCenterOaStaffer record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

}
