package com.yycoin.service.h5api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.multipleds.YYDataSource;
import com.yycoin.service.h5api.ListService;
import com.yycoin.vo.h5api.THgList;
import com.yycoin.vo.h5api.THgListMapper;

/**
 * @author SunQi
 * @Description: 回购发货信息接口
 * @date Create in 2017/10/19 13:50
 */
@Service
public class ListServiceImpl implements ListService {

	@Autowired
	private THgListMapper tHgListMapper;

	// 添加发货信息
	@Override
	@YYDataSource(name = "h5inter")
	public Integer addList(THgList tHgList) throws Exception {
		return tHgListMapper.insert(tHgList);
	}

}
