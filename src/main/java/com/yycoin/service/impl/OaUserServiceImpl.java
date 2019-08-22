package com.yycoin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.yycoin.dao.IOaUserDao;
import com.yycoin.service.IOaUserService;
import com.yycoin.vo.TCenterOaUser;

@Service("oaUserService")
public class OaUserServiceImpl implements IOaUserService {

	@Autowired
	private IOaUserDao oaUserDao;

	@Override
	public List<TCenterOaUser> queryOaUserListByUserName(String userName) {
		List<TCenterOaUser> oaUserList = new ArrayList<TCenterOaUser>();
		if (StringUtils.isEmpty(userName)) {
			return oaUserList;
		}
		userName = StringUtils.trimAllWhitespace(userName);
		oaUserList = oaUserDao.queryOaUserListByUserName(userName);
		return oaUserList;
	}

}
