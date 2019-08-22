package com.yycoin.vo;

import com.yycoin.vo.TCenterOutBill;
import com.yycoin.vo.TCenterOutBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterOutBillMapper {
    int countByExample(TCenterOutBillExample example);

    int deleteByExample(TCenterOutBillExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterOutBill record);

    int insertSelective(TCenterOutBill record);

    List<TCenterOutBill> selectByExample(TCenterOutBillExample example);

    TCenterOutBill selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterOutBill record, @Param("example") TCenterOutBillExample example);

    int updateByExample(@Param("record") TCenterOutBill record, @Param("example") TCenterOutBillExample example);

    int updateByPrimaryKeySelective(TCenterOutBill record);

    int updateByPrimaryKey(TCenterOutBill record);
}