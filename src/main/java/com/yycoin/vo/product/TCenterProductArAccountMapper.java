package com.yycoin.vo.product;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TCenterProductArAccountMapper {
	int countByExample(TCenterProductArAccountExample example);

	int deleteByExample(TCenterProductArAccountExample example);

	int insert(TCenterProductArAccount record);

	int insertSelective(TCenterProductArAccount record);

	List<TCenterProductArAccount> selectByExample(TCenterProductArAccountExample example);

	int updateByExampleSelective(@Param("record") TCenterProductArAccount record,
			@Param("example") TCenterProductArAccountExample example);

	int updateByExample(@Param("record") TCenterProductArAccount record,
			@Param("example") TCenterProductArAccountExample example);

	int insertBatch(@Param("arAccountList") List<TCenterProductArAccount> arAccountList);
}