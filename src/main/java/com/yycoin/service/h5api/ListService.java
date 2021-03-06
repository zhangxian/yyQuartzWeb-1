package com.yycoin.service.h5api;

import org.springframework.transaction.annotation.Transactional;

import com.yycoin.vo.h5api.THgList;

/**
 * @author SunQi
 * @Description:
 * @date Create in 2017/10/19 13:50
 */
public interface ListService {

	// 添加回购发货信息
	@Transactional
	public Integer addList(THgList tHgList) throws Exception;

}
