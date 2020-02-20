package com.yycoin.service.h5api;

import java.util.List;

import com.yycoin.vo.h5api.THgListlog;

/**
 * @author SunQi
 * @Description:
 * @date Create in 2017/10/23 11:20
 */
public interface ListLogService {

	// 根据手机号查询
	public List<THgListlog> findByPhone(String phone) throws Exception;

	// 根据单号查询信息
	public List<THgListlog> findByNoId(String NoId) throws Exception;

	void updateListLogStatus(String backId, String status) throws Exception;
}
