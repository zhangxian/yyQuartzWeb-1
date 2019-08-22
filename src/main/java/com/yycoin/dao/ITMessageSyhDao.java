package com.yycoin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yycoin.vo.TMessageSyh;
import com.yycoin.vo.TMessageSyhExample;

public interface ITMessageSyhDao {

	int countByExample(TMessageSyhExample example);

	int deleteByExample(TMessageSyhExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(TMessageSyh record);

	int insertSelective(TMessageSyh record);

	List<TMessageSyh> selectByExample(TMessageSyhExample example);

	TMessageSyh selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") TMessageSyh record, @Param("example") TMessageSyhExample example);

	int updateByExample(@Param("record") TMessageSyh record, @Param("example") TMessageSyhExample example);

	int updateByPrimaryKeySelective(TMessageSyh record);

	int updateByPrimaryKey(TMessageSyh record);

}
