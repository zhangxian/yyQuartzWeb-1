package com.yycoin.dao;

import java.util.List;

import com.yycoin.vo.TCenterOaUser;

public interface IOaUserDao {

	List<TCenterOaUser> queryOaUserListByUserName(String userName);
}
