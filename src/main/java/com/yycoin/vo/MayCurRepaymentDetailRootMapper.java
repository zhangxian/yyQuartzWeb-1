package com.yycoin.vo;

import com.yycoin.vo.MayCurRepaymentDetailRoot;
import com.yycoin.vo.MayCurRepaymentDetailRootExample;
import com.yycoin.vo.MayCurRepaymentDetailRootWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MayCurRepaymentDetailRootMapper {
    int countByExample(MayCurRepaymentDetailRootExample example);

    int deleteByExample(MayCurRepaymentDetailRootExample example);

    int deleteByPrimaryKey(String reportId);

    int insert(MayCurRepaymentDetailRootWithBLOBs record);

    int insertSelective(MayCurRepaymentDetailRootWithBLOBs record);

    List<MayCurRepaymentDetailRootWithBLOBs> selectByExampleWithBLOBs(MayCurRepaymentDetailRootExample example);

    List<MayCurRepaymentDetailRoot> selectByExample(MayCurRepaymentDetailRootExample example);

    MayCurRepaymentDetailRootWithBLOBs selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") MayCurRepaymentDetailRootWithBLOBs record, @Param("example") MayCurRepaymentDetailRootExample example);

    int updateByExampleWithBLOBs(@Param("record") MayCurRepaymentDetailRootWithBLOBs record, @Param("example") MayCurRepaymentDetailRootExample example);

    int updateByExample(@Param("record") MayCurRepaymentDetailRoot record, @Param("example") MayCurRepaymentDetailRootExample example);

    int updateByPrimaryKeySelective(MayCurRepaymentDetailRootWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MayCurRepaymentDetailRootWithBLOBs record);

    int updateByPrimaryKey(MayCurRepaymentDetailRoot record);
}