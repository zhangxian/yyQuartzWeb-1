package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IOaStafferDao;
import com.yycoin.service.IOaStafferService;
import com.yycoin.vo.travelapply.TCenterOaStaffer;
import com.yycoin.vo.travelapply.TCenterOaStafferExample;

@Service
public class OaStafferServiceImpl implements IOaStafferService {

	@Autowired
	private IOaStafferDao dao;

	@Override
	public List<TCenterOaStaffer> selectByExample(TCenterOaStafferExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public TCenterOaStaffer selectByPrimaryKey(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

}
