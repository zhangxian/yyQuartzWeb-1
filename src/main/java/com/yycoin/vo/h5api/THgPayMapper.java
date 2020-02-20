package com.yycoin.vo.h5api;

import com.yycoin.vo.h5api.THgPay;
import com.yycoin.vo.h5api.THgPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THgPayMapper {
    int countByExample(THgPayExample example);

    int deleteByExample(THgPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THgPay record);

    int insertSelective(THgPay record);

    List<THgPay> selectByExample(THgPayExample example);

    THgPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THgPay record, @Param("example") THgPayExample example);

    int updateByExample(@Param("record") THgPay record, @Param("example") THgPayExample example);

    int updateByPrimaryKeySelective(THgPay record);

    int updateByPrimaryKey(THgPay record);
}