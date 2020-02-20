package com.yycoin.service.h5api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.multipleds.YYDataSource;
import com.yycoin.service.h5api.THgService;
import com.yycoin.vo.h5api.THgPriceConfig;
import com.yycoin.vo.h5api.THgPriceConfigMapperExt;

/**
 * @author SunQi
 * @Description: 回购商品查询接口
 * @date Create in 2017/10/16 15:52
 */
@Service
public class THgServiceImpl implements THgService {

	@Autowired
	private THgPriceConfigMapperExt tHgPriceconfigMapperExt;

	// 商品查询列表
	@Override
	@YYDataSource(name = "h5inter")
	public List<String> findTHgList() throws Exception {
		return tHgPriceconfigMapperExt.findTHg();
	}

	// 根据商品名查询年份列表
	@Override
	@YYDataSource(name = "h5inter")
	public List<String> findYearList(String cate) throws Exception {
		return tHgPriceconfigMapperExt.findYear(cate);
	}

	// 根据(+商品名)年份查询standard列表
	@Override
	@YYDataSource(name = "h5inter")
	public List<String> findStandardList(String cate, String year) throws Exception {
		return tHgPriceconfigMapperExt.findStandard(cate, year);
	}

	// 根据(商品名+年份+standard)查询condition
	@Override
	@YYDataSource(name = "h5inter")
	public List<String> findConditionList(String cate, String year, String standard) throws Exception {
		return tHgPriceconfigMapperExt.findCondition(cate, year, standard);
	}

	// 根据(商品名+年份+standard+condition)查询packaged
	@Override
	@YYDataSource(name = "h5inter")
	public List<String> findPackagedList(THgPriceConfig tHg) throws Exception {
		return tHgPriceconfigMapperExt.findPackaged(tHg);
	}

	// 根据(商品名+年份+standard+condition+packaged)查询certificate
	@Override
	@YYDataSource(name = "h5inter")
	public List<String> findCertificateList(THgPriceConfig tHg) throws Exception {
		return tHgPriceconfigMapperExt.findCertificate(tHg);
	}

	// 根据6个字段查询价格
	@Override
	@YYDataSource(name = "h5inter")
	public String findPrice(THgPriceConfig tHg) throws Exception {
		return tHgPriceconfigMapperExt.findPrice(tHg);
	}

}
