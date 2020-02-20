package com.yycoin.service.h5api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.multipleds.YYDataSource;
import com.yycoin.service.h5api.EstService;
import com.yycoin.vo.h5api.THgEstimate;
import com.yycoin.vo.h5api.THgEstimateMapper;

/**
 * @author SunQi
 * @Description: 商品信息添加接口
 * @date Create in 2017/10/18 14:01
 */
@Service
public class EstServiceImpl implements EstService {

	@Autowired
	private THgEstimateMapper tHgEstimateMapper;

	@Override
	@YYDataSource(name = "h5inter")
	public Integer addEst(THgEstimate est) throws Exception {
		return tHgEstimateMapper.insert(est);
	}

}
