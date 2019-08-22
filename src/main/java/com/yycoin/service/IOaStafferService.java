package com.yycoin.service;

import java.util.List;

import com.yycoin.vo.travelapply.TCenterOaStaffer;
import com.yycoin.vo.travelapply.TCenterOaStafferExample;

public interface IOaStafferService {

	public List<TCenterOaStaffer> selectByExample(TCenterOaStafferExample example);

	public TCenterOaStaffer selectByPrimaryKey(Integer id);

}
