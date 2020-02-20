package com.yycoin.service.h5api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.multipleds.YYDataSource;
import com.yycoin.service.h5api.THgPayService;
import com.yycoin.vo.h5api.THgPay;
import com.yycoin.vo.h5api.THgPayMapper;

@Service
public class THgPayServiceImpl implements THgPayService {

	@Autowired
	private THgPayMapper tHgPayMapper;

	@Override
	@YYDataSource(name = "h5inter")
	public int insert(THgPay record) {
		return tHgPayMapper.insert(record);
	}

}
