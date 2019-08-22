package com.yycoin.vo;

import com.yycoin.vo.TCenterApproveLog;
import com.yycoin.vo.TCenterApproveLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterApproveLogMapper {
    int countByExample(TCenterApproveLogExample example);

    int deleteByExample(TCenterApproveLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterApproveLog record);

    int insertSelective(TCenterApproveLog record);

    List<TCenterApproveLog> selectByExample(TCenterApproveLogExample example);

    TCenterApproveLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterApproveLog record, @Param("example") TCenterApproveLogExample example);

    int updateByExample(@Param("record") TCenterApproveLog record, @Param("example") TCenterApproveLogExample example);

    int updateByPrimaryKeySelective(TCenterApproveLog record);

    int updateByPrimaryKey(TCenterApproveLog record);
}