package com.yycoin.vo.travelapply;

import com.yycoin.vo.travelapply.TCenterTravelApply;
import com.yycoin.vo.travelapply.TCenterTravelApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterTravelApplyMapper {
    int countByExample(TCenterTravelApplyExample example);

    int deleteByExample(TCenterTravelApplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterTravelApply record);

    int insertSelective(TCenterTravelApply record);

    List<TCenterTravelApply> selectByExample(TCenterTravelApplyExample example);

    TCenterTravelApply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterTravelApply record, @Param("example") TCenterTravelApplyExample example);

    int updateByExample(@Param("record") TCenterTravelApply record, @Param("example") TCenterTravelApplyExample example);

    int updateByPrimaryKeySelective(TCenterTravelApply record);

    int updateByPrimaryKey(TCenterTravelApply record);
}