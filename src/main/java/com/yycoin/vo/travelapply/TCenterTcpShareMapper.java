package com.yycoin.vo.travelapply;

import com.yycoin.vo.travelapply.TCenterTcpShare;
import com.yycoin.vo.travelapply.TCenterTcpShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterTcpShareMapper {
    int countByExample(TCenterTcpShareExample example);

    int deleteByExample(TCenterTcpShareExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterTcpShare record);

    int insertSelective(TCenterTcpShare record);

    List<TCenterTcpShare> selectByExample(TCenterTcpShareExample example);

    TCenterTcpShare selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterTcpShare record, @Param("example") TCenterTcpShareExample example);

    int updateByExample(@Param("record") TCenterTcpShare record, @Param("example") TCenterTcpShareExample example);

    int updateByPrimaryKeySelective(TCenterTcpShare record);

    int updateByPrimaryKey(TCenterTcpShare record);
}