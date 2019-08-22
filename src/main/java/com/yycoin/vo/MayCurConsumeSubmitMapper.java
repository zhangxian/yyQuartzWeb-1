package com.yycoin.vo;

import com.yycoin.vo.MayCurConsumeSubmit;
import com.yycoin.vo.MayCurConsumeSubmitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MayCurConsumeSubmitMapper {
    int countByExample(MayCurConsumeSubmitExample example);

    int deleteByExample(MayCurConsumeSubmitExample example);

    int deleteByPrimaryKey(String reportId);

    int insert(MayCurConsumeSubmit record);

    int insertSelective(MayCurConsumeSubmit record);

    List<MayCurConsumeSubmit> selectByExample(MayCurConsumeSubmitExample example);

    MayCurConsumeSubmit selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") MayCurConsumeSubmit record, @Param("example") MayCurConsumeSubmitExample example);

    int updateByExample(@Param("record") MayCurConsumeSubmit record, @Param("example") MayCurConsumeSubmitExample example);

    int updateByPrimaryKeySelective(MayCurConsumeSubmit record);

    int updateByPrimaryKey(MayCurConsumeSubmit record);
}