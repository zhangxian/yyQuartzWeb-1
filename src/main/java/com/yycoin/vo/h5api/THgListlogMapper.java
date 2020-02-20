package com.yycoin.vo.h5api;

import com.yycoin.vo.h5api.THgListlog;
import com.yycoin.vo.h5api.THgListlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THgListlogMapper {
    int countByExample(THgListlogExample example);

    int deleteByExample(THgListlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THgListlog record);

    int insertSelective(THgListlog record);

    List<THgListlog> selectByExample(THgListlogExample example);

    THgListlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THgListlog record, @Param("example") THgListlogExample example);

    int updateByExample(@Param("record") THgListlog record, @Param("example") THgListlogExample example);

    int updateByPrimaryKeySelective(THgListlog record);

    int updateByPrimaryKey(THgListlog record);
}