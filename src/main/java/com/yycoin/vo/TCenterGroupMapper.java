package com.yycoin.vo;

import com.yycoin.vo.TCenterGroup;
import com.yycoin.vo.TCenterGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterGroupMapper {
    int countByExample(TCenterGroupExample example);

    int deleteByExample(TCenterGroupExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterGroup record);

    int insertSelective(TCenterGroup record);

    List<TCenterGroup> selectByExample(TCenterGroupExample example);

    TCenterGroup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterGroup record, @Param("example") TCenterGroupExample example);

    int updateByExample(@Param("record") TCenterGroup record, @Param("example") TCenterGroupExample example);

    int updateByPrimaryKeySelective(TCenterGroup record);

    int updateByPrimaryKey(TCenterGroup record);
}