package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.IOaUserDao;
import com.yycoin.vo.TCenterOaUser;
import com.yycoin.vo.TCenterOaUserExample;
import com.yycoin.vo.TCenterOaUserMapper;

@Service("oaUserDao")
public class OaUserDaoImpl implements IOaUserDao {

	@Autowired
	private TCenterOaUserMapper mapper;

	@Override
	public List<TCenterOaUser> queryOaUserListByUserName(String userName) {
		TCenterOaUserExample example = new TCenterOaUserExample();
		example.createCriteria().andNameEqualTo(userName);
		return mapper.selectByExample(example);
	}

}
