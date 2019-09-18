package com.yycoin.vo.sms;

import com.yycoin.vo.sms.TMessageInfo;
import com.yycoin.vo.sms.TMessageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMessageInfoMapper {
    int countByExample(TMessageInfoExample example);

    int deleteByExample(TMessageInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMessageInfo record);

    int insertSelective(TMessageInfo record);

    List<TMessageInfo> selectByExample(TMessageInfoExample example);

    TMessageInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMessageInfo record, @Param("example") TMessageInfoExample example);

    int updateByExample(@Param("record") TMessageInfo record, @Param("example") TMessageInfoExample example);

    int updateByPrimaryKeySelective(TMessageInfo record);

    int updateByPrimaryKey(TMessageInfo record);
}