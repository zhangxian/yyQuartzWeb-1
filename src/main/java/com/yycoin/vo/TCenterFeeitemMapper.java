package com.yycoin.vo;

import com.yycoin.vo.TCenterFeeitem;
import com.yycoin.vo.TCenterFeeitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterFeeitemMapper {
    int countByExample(TCenterFeeitemExample example);

    int deleteByExample(TCenterFeeitemExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterFeeitem record);

    int insertSelective(TCenterFeeitem record);

    List<TCenterFeeitem> selectByExample(TCenterFeeitemExample example);

    TCenterFeeitem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterFeeitem record, @Param("example") TCenterFeeitemExample example);

    int updateByExample(@Param("record") TCenterFeeitem record, @Param("example") TCenterFeeitemExample example);

    int updateByPrimaryKeySelective(TCenterFeeitem record);

    int updateByPrimaryKey(TCenterFeeitem record);
}