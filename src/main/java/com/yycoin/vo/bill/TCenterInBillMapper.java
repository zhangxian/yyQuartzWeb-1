package com.yycoin.vo.bill;

import com.yycoin.vo.bill.TCenterInBill;
import com.yycoin.vo.bill.TCenterInBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterInBillMapper {
    int countByExample(TCenterInBillExample example);

    int deleteByExample(TCenterInBillExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterInBill record);

    int insertSelective(TCenterInBill record);

    List<TCenterInBill> selectByExample(TCenterInBillExample example);

    TCenterInBill selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterInBill record, @Param("example") TCenterInBillExample example);

    int updateByExample(@Param("record") TCenterInBill record, @Param("example") TCenterInBillExample example);

    int updateByPrimaryKeySelective(TCenterInBill record);

    int updateByPrimaryKey(TCenterInBill record);
}