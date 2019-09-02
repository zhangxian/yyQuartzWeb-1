package com.yycoin.vo;

import com.yycoin.vo.MayCurRepaymentSubmit;
import com.yycoin.vo.MayCurRepaymentSubmitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MayCurRepaymentSubmitMapper {
    int countByExample(MayCurRepaymentSubmitExample example);

    int deleteByExample(MayCurRepaymentSubmitExample example);

    int deleteByPrimaryKey(String reportId);

    int insert(MayCurRepaymentSubmit record);

    int insertSelective(MayCurRepaymentSubmit record);

    List<MayCurRepaymentSubmit> selectByExample(MayCurRepaymentSubmitExample example);

    MayCurRepaymentSubmit selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") MayCurRepaymentSubmit record, @Param("example") MayCurRepaymentSubmitExample example);

    int updateByExample(@Param("record") MayCurRepaymentSubmit record, @Param("example") MayCurRepaymentSubmitExample example);

    int updateByPrimaryKeySelective(MayCurRepaymentSubmit record);

    int updateByPrimaryKey(MayCurRepaymentSubmit record);
}