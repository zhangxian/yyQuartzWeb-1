package com.yycoin.vo.travelapply;

import com.yycoin.vo.travelapply.TCenterTravelApplyItem;
import com.yycoin.vo.travelapply.TCenterTravelApplyItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterTravelApplyItemMapper {
    int countByExample(TCenterTravelApplyItemExample example);

    int deleteByExample(TCenterTravelApplyItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterTravelApplyItem record);

    int insertSelective(TCenterTravelApplyItem record);

    List<TCenterTravelApplyItem> selectByExample(TCenterTravelApplyItemExample example);

    TCenterTravelApplyItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterTravelApplyItem record, @Param("example") TCenterTravelApplyItemExample example);

    int updateByExample(@Param("record") TCenterTravelApplyItem record, @Param("example") TCenterTravelApplyItemExample example);

    int updateByPrimaryKeySelective(TCenterTravelApplyItem record);

    int updateByPrimaryKey(TCenterTravelApplyItem record);
}