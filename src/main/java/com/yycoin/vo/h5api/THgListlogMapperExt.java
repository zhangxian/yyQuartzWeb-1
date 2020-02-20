package com.yycoin.vo.h5api;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface THgListlogMapperExt {

	// 根据手机号查询单号、收货时间
	List<THgListlog> findBy(String phone);

	// 根据单号查询信息
	List<THgListlog> findByNoId(String NoId);

	void updateListLogStatus(@Param("backid") String backid, @Param("status") String status);

}