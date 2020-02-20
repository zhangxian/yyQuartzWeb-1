package com.yycoin.vo.h5api;

import com.yycoin.vo.h5api.THgPriceConfig;
import com.yycoin.vo.h5api.THgPriceConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THgPriceConfigMapper {
    int countByExample(THgPriceConfigExample example);

    int deleteByExample(THgPriceConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THgPriceConfig record);

    int insertSelective(THgPriceConfig record);

    List<THgPriceConfig> selectByExample(THgPriceConfigExample example);

    THgPriceConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THgPriceConfig record, @Param("example") THgPriceConfigExample example);

    int updateByExample(@Param("record") THgPriceConfig record, @Param("example") THgPriceConfigExample example);

    int updateByPrimaryKeySelective(THgPriceConfig record);

    int updateByPrimaryKey(THgPriceConfig record);
}