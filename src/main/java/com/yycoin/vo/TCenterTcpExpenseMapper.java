package com.yycoin.vo;

import com.yycoin.vo.TCenterTcpExpense;
import com.yycoin.vo.TCenterTcpExpenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterTcpExpenseMapper {
    int countByExample(TCenterTcpExpenseExample example);

    int deleteByExample(TCenterTcpExpenseExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterTcpExpense record);

    int insertSelective(TCenterTcpExpense record);

    List<TCenterTcpExpense> selectByExample(TCenterTcpExpenseExample example);

    TCenterTcpExpense selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterTcpExpense record, @Param("example") TCenterTcpExpenseExample example);

    int updateByExample(@Param("record") TCenterTcpExpense record, @Param("example") TCenterTcpExpenseExample example);

    int updateByPrimaryKeySelective(TCenterTcpExpense record);

    int updateByPrimaryKey(TCenterTcpExpense record);
}