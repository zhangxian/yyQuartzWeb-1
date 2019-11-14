package com.yycoin.vo.product;

import com.yycoin.vo.product.TCenterBase;
import com.yycoin.vo.product.TCenterBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterBaseMapper {
    int countByExample(TCenterBaseExample example);

    int deleteByExample(TCenterBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterBase record);

    int insertSelective(TCenterBase record);

    List<TCenterBase> selectByExample(TCenterBaseExample example);

    TCenterBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterBase record, @Param("example") TCenterBaseExample example);

    int updateByExample(@Param("record") TCenterBase record, @Param("example") TCenterBaseExample example);

    int updateByPrimaryKeySelective(TCenterBase record);

    int updateByPrimaryKey(TCenterBase record);
}