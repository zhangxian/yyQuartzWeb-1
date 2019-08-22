package com.yycoin.vo;

import com.yycoin.vo.QrtzTriggers;
import com.yycoin.vo.QrtzTriggersExample;
import com.yycoin.vo.QrtzTriggersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzTriggersMapper {
    int countByExample(QrtzTriggersExample example);

    int deleteByExample(QrtzTriggersExample example);

    int deleteByPrimaryKey(QrtzTriggersKey key);

    int insert(QrtzTriggers record);

    int insertSelective(QrtzTriggers record);

    List<QrtzTriggers> selectByExampleWithBLOBs(QrtzTriggersExample example);

    List<QrtzTriggers> selectByExample(QrtzTriggersExample example);

    QrtzTriggers selectByPrimaryKey(QrtzTriggersKey key);

    int updateByExampleSelective(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByExample(@Param("record") QrtzTriggers record, @Param("example") QrtzTriggersExample example);

    int updateByPrimaryKeySelective(QrtzTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzTriggers record);

    int updateByPrimaryKey(QrtzTriggers record);
}