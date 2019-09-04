package com.yycoin.vo.bill;

import com.yycoin.vo.bill.TCenterOut;
import com.yycoin.vo.bill.TCenterOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterOutMapper {
    int countByExample(TCenterOutExample example);

    int deleteByExample(TCenterOutExample example);

    int insert(TCenterOut record);

    int insertSelective(TCenterOut record);

    List<TCenterOut> selectByExample(TCenterOutExample example);

    int updateByExampleSelective(@Param("record") TCenterOut record, @Param("example") TCenterOutExample example);

    int updateByExample(@Param("record") TCenterOut record, @Param("example") TCenterOutExample example);
}