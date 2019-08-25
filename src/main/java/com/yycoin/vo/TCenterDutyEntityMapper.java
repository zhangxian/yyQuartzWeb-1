package com.yycoin.vo;

import com.yycoin.vo.TCenterDutyEntity;
import com.yycoin.vo.TCenterDutyEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterDutyEntityMapper {
    int countByExample(TCenterDutyEntityExample example);

    int deleteByExample(TCenterDutyEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterDutyEntity record);

    int insertSelective(TCenterDutyEntity record);

    List<TCenterDutyEntity> selectByExample(TCenterDutyEntityExample example);

    TCenterDutyEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterDutyEntity record, @Param("example") TCenterDutyEntityExample example);

    int updateByExample(@Param("record") TCenterDutyEntity record, @Param("example") TCenterDutyEntityExample example);

    int updateByPrimaryKeySelective(TCenterDutyEntity record);

    int updateByPrimaryKey(TCenterDutyEntity record);
}