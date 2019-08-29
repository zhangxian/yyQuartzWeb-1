package com.yycoin.vo;

import com.yycoin.vo.TCenterBank;
import com.yycoin.vo.TCenterBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterBankMapper {
    int countByExample(TCenterBankExample example);

    int deleteByExample(TCenterBankExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterBank record);

    int insertSelective(TCenterBank record);

    List<TCenterBank> selectByExample(TCenterBankExample example);

    TCenterBank selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterBank record, @Param("example") TCenterBankExample example);

    int updateByExample(@Param("record") TCenterBank record, @Param("example") TCenterBankExample example);

    int updateByPrimaryKeySelective(TCenterBank record);

    int updateByPrimaryKey(TCenterBank record);
}