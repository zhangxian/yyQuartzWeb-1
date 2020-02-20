package com.yycoin.vo.h5api;

import com.yycoin.vo.h5api.THgEstimate;
import com.yycoin.vo.h5api.THgEstimateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THgEstimateMapper {
    int countByExample(THgEstimateExample example);

    int deleteByExample(THgEstimateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THgEstimate record);

    int insertSelective(THgEstimate record);

    List<THgEstimate> selectByExample(THgEstimateExample example);

    THgEstimate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THgEstimate record, @Param("example") THgEstimateExample example);

    int updateByExample(@Param("record") THgEstimate record, @Param("example") THgEstimateExample example);

    int updateByPrimaryKeySelective(THgEstimate record);

    int updateByPrimaryKey(THgEstimate record);
}