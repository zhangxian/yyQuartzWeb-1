package com.yycoin.vo.product;

import com.yycoin.vo.product.TCenterPriceConfig;
import com.yycoin.vo.product.TCenterPriceConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterPriceConfigMapper {
    int countByExample(TCenterPriceConfigExample example);

    int deleteByExample(TCenterPriceConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterPriceConfig record);

    int insertSelective(TCenterPriceConfig record);

    List<TCenterPriceConfig> selectByExample(TCenterPriceConfigExample example);

    TCenterPriceConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterPriceConfig record, @Param("example") TCenterPriceConfigExample example);

    int updateByExample(@Param("record") TCenterPriceConfig record, @Param("example") TCenterPriceConfigExample example);

    int updateByPrimaryKeySelective(TCenterPriceConfig record);

    int updateByPrimaryKey(TCenterPriceConfig record);
}