package com.yycoin.vo.travelapply;

import com.yycoin.vo.travelapply.TCenterTcpApply;
import com.yycoin.vo.travelapply.TCenterTcpApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterTcpApplyMapper {
    int countByExample(TCenterTcpApplyExample example);

    int deleteByExample(TCenterTcpApplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterTcpApply record);

    int insertSelective(TCenterTcpApply record);

    List<TCenterTcpApply> selectByExample(TCenterTcpApplyExample example);

    TCenterTcpApply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterTcpApply record, @Param("example") TCenterTcpApplyExample example);

    int updateByExample(@Param("record") TCenterTcpApply record, @Param("example") TCenterTcpApplyExample example);

    int updateByPrimaryKeySelective(TCenterTcpApply record);

    int updateByPrimaryKey(TCenterTcpApply record);
}