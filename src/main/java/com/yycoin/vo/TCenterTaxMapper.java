package com.yycoin.vo;

import com.yycoin.vo.TCenterTax;
import com.yycoin.vo.TCenterTaxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterTaxMapper {
    int countByExample(TCenterTaxExample example);

    int deleteByExample(TCenterTaxExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterTax record);

    int insertSelective(TCenterTax record);

    List<TCenterTax> selectByExample(TCenterTaxExample example);

    TCenterTax selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterTax record, @Param("example") TCenterTaxExample example);

    int updateByExample(@Param("record") TCenterTax record, @Param("example") TCenterTaxExample example);

    int updateByPrimaryKeySelective(TCenterTax record);

    int updateByPrimaryKey(TCenterTax record);
}