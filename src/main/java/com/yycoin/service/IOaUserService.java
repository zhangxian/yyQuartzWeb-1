package com.yycoin.service;

import java.util.List;

import com.yycoin.vo.TCenterOaUser;

public interface IOaUserService {

	List<TCenterOaUser> queryOaUserListByUserName(String userName);

}
