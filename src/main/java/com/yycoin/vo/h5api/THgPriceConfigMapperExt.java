package com.yycoin.vo.h5api;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface THgPriceConfigMapperExt {
	// 商品查询列表
	List<String> findTHg();

	// 根据商品名查询年份列表
	List<String> findYear(String cate);

	// 根据(商品名+年份)Standard
	List<String> findStandard(@Param("cate") String cate, @Param("year") String year);

	// 根据(商品名+年份+standard)查询condition
	List<String> findCondition(@Param("cate") String cate, @Param("year") String year,
			@Param("standard") String standard);

	// 根据(商品名+年份+standard+condition)查询packaged
	List<String> findPackaged(THgPriceConfig tHg);

	// 根据(商品名+年份+standard+condition+packaged)查询certificate
	List<String> findCertificate(THgPriceConfig tHg);

	// 根据6个字段查询价格
	String findPrice(THgPriceConfig tHg);
}