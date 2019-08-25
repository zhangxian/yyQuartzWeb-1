package com.yycoin.vo;

import com.yycoin.vo.TCenterFinanceItem;
import com.yycoin.vo.TCenterFinanceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterFinanceItemMapper {
    int countByExample(TCenterFinanceItemExample example);

    int deleteByExample(TCenterFinanceItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterFinanceItem record);

    int insertSelective(TCenterFinanceItem record);

    List<TCenterFinanceItem> selectByExample(TCenterFinanceItemExample example);

    TCenterFinanceItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterFinanceItem record, @Param("example") TCenterFinanceItemExample example);

    int updateByExample(@Param("record") TCenterFinanceItem record, @Param("example") TCenterFinanceItemExample example);

    int updateByPrimaryKeySelective(TCenterFinanceItem record);

    int updateByPrimaryKey(TCenterFinanceItem record);
}