package com.yycoin.vo;

import com.yycoin.vo.MayCurExpenseSubmit;
import com.yycoin.vo.MayCurExpenseSubmitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MayCurExpenseSubmitMapper {
    int countByExample(MayCurExpenseSubmitExample example);

    int deleteByExample(MayCurExpenseSubmitExample example);

    int deleteByPrimaryKey(String reportId);

    int insert(MayCurExpenseSubmit record);

    int insertSelective(MayCurExpenseSubmit record);

    List<MayCurExpenseSubmit> selectByExample(MayCurExpenseSubmitExample example);

    MayCurExpenseSubmit selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") MayCurExpenseSubmit record, @Param("example") MayCurExpenseSubmitExample example);

    int updateByExample(@Param("record") MayCurExpenseSubmit record, @Param("example") MayCurExpenseSubmitExample example);

    int updateByPrimaryKeySelective(MayCurExpenseSubmit record);

    int updateByPrimaryKey(MayCurExpenseSubmit record);
}