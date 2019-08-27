package com.yycoin.vo;

import com.yycoin.vo.TCenterPayListLog;
import com.yycoin.vo.TCenterPayListLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterPayListLogMapper {
    int countByExample(TCenterPayListLogExample example);

    int deleteByExample(TCenterPayListLogExample example);

    int insert(TCenterPayListLog record);

    int insertSelective(TCenterPayListLog record);

    List<TCenterPayListLog> selectByExample(TCenterPayListLogExample example);

    int updateByExampleSelective(@Param("record") TCenterPayListLog record, @Param("example") TCenterPayListLogExample example);

    int updateByExample(@Param("record") TCenterPayListLog record, @Param("example") TCenterPayListLogExample example);
}