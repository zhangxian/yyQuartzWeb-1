package com.yycoin.vo;

import com.yycoin.vo.MayCurConsumeDetailRoot;
import com.yycoin.vo.MayCurConsumeDetailRootExample;
import com.yycoin.vo.MayCurConsumeDetailRootWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MayCurConsumeDetailRootMapper {
    int countByExample(MayCurConsumeDetailRootExample example);

    int deleteByExample(MayCurConsumeDetailRootExample example);

    int deleteByPrimaryKey(String reportId);

    int insert(MayCurConsumeDetailRootWithBLOBs record);

    int insertSelective(MayCurConsumeDetailRootWithBLOBs record);

    List<MayCurConsumeDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurConsumeDetailRootExample example);

    List<MayCurConsumeDetailRoot> selectByExample(MayCurConsumeDetailRootExample example);

    MayCurConsumeDetailRootWithBLOBs selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") MayCurConsumeDetailRootWithBLOBs record, @Param("example") MayCurConsumeDetailRootExample example);

    int updateByExampleWithBLOBs(@Param("record") MayCurConsumeDetailRootWithBLOBs record, @Param("example") MayCurConsumeDetailRootExample example);

    int updateByExample(@Param("record") MayCurConsumeDetailRoot record, @Param("example") MayCurConsumeDetailRootExample example);

    int updateByPrimaryKeySelective(MayCurConsumeDetailRootWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MayCurConsumeDetailRootWithBLOBs record);

    int updateByPrimaryKey(MayCurConsumeDetailRoot record);
}