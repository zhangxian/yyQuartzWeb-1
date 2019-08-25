package com.yycoin.vo;

import com.yycoin.vo.TCenterFinance;
import com.yycoin.vo.TCenterFinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterFinanceMapper {
    int countByExample(TCenterFinanceExample example);

    int deleteByExample(TCenterFinanceExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterFinance record);

    int insertSelective(TCenterFinance record);

    List<TCenterFinance> selectByExample(TCenterFinanceExample example);

    TCenterFinance selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterFinance record, @Param("example") TCenterFinanceExample example);

    int updateByExample(@Param("record") TCenterFinance record, @Param("example") TCenterFinanceExample example);

    int updateByPrimaryKeySelective(TCenterFinance record);

    int updateByPrimaryKey(TCenterFinance record);
    
    int findMaxMonthIndex(TCenterFinanceExample example);
}