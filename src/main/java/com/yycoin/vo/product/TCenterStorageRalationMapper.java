package com.yycoin.vo.product;

import com.yycoin.vo.product.TCenterStorageRalation;
import com.yycoin.vo.product.TCenterStorageRalationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterStorageRalationMapper {
    int countByExample(TCenterStorageRalationExample example);

    int deleteByExample(TCenterStorageRalationExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterStorageRalation record);

    int insertSelective(TCenterStorageRalation record);

    List<TCenterStorageRalation> selectByExample(TCenterStorageRalationExample example);

    TCenterStorageRalation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterStorageRalation record, @Param("example") TCenterStorageRalationExample example);

    int updateByExample(@Param("record") TCenterStorageRalation record, @Param("example") TCenterStorageRalationExample example);

    int updateByPrimaryKeySelective(TCenterStorageRalation record);

    int updateByPrimaryKey(TCenterStorageRalation record);
}