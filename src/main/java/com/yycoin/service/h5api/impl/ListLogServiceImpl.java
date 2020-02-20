package com.yycoin.service.h5api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.multipleds.YYDataSource;
import com.yycoin.service.h5api.ListLogService;
import com.yycoin.vo.h5api.THgListlog;
import com.yycoin.vo.h5api.THgListlogMapperExt;

/**
 * @author SunQi
 * @Description:
 * @date Create in 2017/10/23 11:20
 */
@Service
public class ListLogServiceImpl implements ListLogService {

	@Autowired
	private THgListlogMapperExt tHgListlogMapperExt;

	// 根据手机号查询
	@Override
	@YYDataSource(name = "h5inter")
	public List<THgListlog> findByPhone(String phone) throws Exception {
		return tHgListlogMapperExt.findBy(phone);
	}

	// 根据单号查询信息
	@Override
	@YYDataSource(name = "h5inter")
	public List<THgListlog> findByNoId(String NoId) throws Exception {
		return tHgListlogMapperExt.findByNoId(NoId);
	}

	@Override
	@YYDataSource(name = "h5inter")
	public void updateListLogStatus(String backId, String status) throws Exception {
		tHgListlogMapperExt.updateListLogStatus(backId, status);
	}
}
