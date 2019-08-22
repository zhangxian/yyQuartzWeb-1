package com.yycoin.vo;

import com.yycoin.vo.TCenterTcpApprove;
import com.yycoin.vo.TCenterTcpApproveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterTcpApproveMapper {
    int countByExample(TCenterTcpApproveExample example);

    int deleteByExample(TCenterTcpApproveExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterTcpApprove record);

    int insertSelective(TCenterTcpApprove record);

    List<TCenterTcpApprove> selectByExample(TCenterTcpApproveExample example);

    TCenterTcpApprove selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterTcpApprove record, @Param("example") TCenterTcpApproveExample example);

    int updateByExample(@Param("record") TCenterTcpApprove record, @Param("example") TCenterTcpApproveExample example);

    int updateByPrimaryKeySelective(TCenterTcpApprove record);

    int updateByPrimaryKey(TCenterTcpApprove record);
}