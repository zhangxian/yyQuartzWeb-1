package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.ITMessageSyhDao;
import com.yycoin.service.ITMessageSyhService;
import com.yycoin.vo.TMessageSyh;
import com.yycoin.vo.TMessageSyhExample;

@Service
public class TMessageServiceImpl implements ITMessageSyhService {

	@Autowired
	private ITMessageSyhDao dao;

	@Override
	public int countByExample(TMessageSyhExample example) {
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(TMessageSyhExample example) {
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TMessageSyh record) {
		return dao.insert(record);
	}

	@Override
	public int insertSelective(TMessageSyh record) {
		return dao.insertSelective(record);
	}

	@Override
	public List<TMessageSyh> selectByExample(TMessageSyhExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public TMessageSyh selectByPrimaryKey(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(TMessageSyh record, TMessageSyhExample example) {
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TMessageSyh record, TMessageSyhExample example) {
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TMessageSyh record) {
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TMessageSyh record) {
		return dao.updateByPrimaryKey(record);
	}

}
