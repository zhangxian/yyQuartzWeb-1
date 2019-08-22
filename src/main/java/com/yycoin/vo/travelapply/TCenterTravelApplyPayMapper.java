package com.yycoin.vo.travelapply;

import com.yycoin.vo.travelapply.TCenterTravelApplyPay;
import com.yycoin.vo.travelapply.TCenterTravelApplyPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterTravelApplyPayMapper {
    int countByExample(TCenterTravelApplyPayExample example);

    int deleteByExample(TCenterTravelApplyPayExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterTravelApplyPay record);

    int insertSelective(TCenterTravelApplyPay record);

    List<TCenterTravelApplyPay> selectByExample(TCenterTravelApplyPayExample example);

    TCenterTravelApplyPay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterTravelApplyPay record, @Param("example") TCenterTravelApplyPayExample example);

    int updateByExample(@Param("record") TCenterTravelApplyPay record, @Param("example") TCenterTravelApplyPayExample example);

    int updateByPrimaryKeySelective(TCenterTravelApplyPay record);

    int updateByPrimaryKey(TCenterTravelApplyPay record);
}