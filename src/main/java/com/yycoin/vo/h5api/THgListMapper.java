package com.yycoin.vo.h5api;

import com.yycoin.vo.h5api.THgList;
import com.yycoin.vo.h5api.THgListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface THgListMapper {
    int countByExample(THgListExample example);

    int deleteByExample(THgListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(THgList record);

    int insertSelective(THgList record);

    List<THgList> selectByExample(THgListExample example);

    THgList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") THgList record, @Param("example") THgListExample example);

    int updateByExample(@Param("record") THgList record, @Param("example") THgListExample example);

    int updateByPrimaryKeySelective(THgList record);

    int updateByPrimaryKey(THgList record);
}