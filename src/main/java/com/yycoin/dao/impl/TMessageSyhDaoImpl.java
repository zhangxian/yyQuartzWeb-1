package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.ITMessageSyhDao;
import com.yycoin.vo.TMessageSyh;
import com.yycoin.vo.TMessageSyhExample;
import com.yycoin.vo.TMessageSyhMapper;

@Service
public class TMessageSyhDaoImpl implements ITMessageSyhDao {

	@Autowired
	TMessageSyhMapper mapper;

	@Override
	public int countByExample(TMessageSyhExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TMessageSyhExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TMessageSyh record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TMessageSyh record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<TMessageSyh> selectByExample(TMessageSyhExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public TMessageSyh selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(TMessageSyh record, TMessageSyhExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TMessageSyh record, TMessageSyhExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TMessageSyh record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TMessageSyh record) {
		return mapper.updateByPrimaryKey(record);
	}

}
