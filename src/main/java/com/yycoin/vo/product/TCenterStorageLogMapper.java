package com.yycoin.vo.product;

import com.yycoin.vo.product.TCenterStorageLog;
import com.yycoin.vo.product.TCenterStorageLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterStorageLogMapper {
    int countByExample(TCenterStorageLogExample example);

    int deleteByExample(TCenterStorageLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterStorageLog record);

    int insertSelective(TCenterStorageLog record);

    List<TCenterStorageLog> selectByExample(TCenterStorageLogExample example);

    TCenterStorageLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterStorageLog record, @Param("example") TCenterStorageLogExample example);

    int updateByExample(@Param("record") TCenterStorageLog record, @Param("example") TCenterStorageLogExample example);

    int updateByPrimaryKeySelective(TCenterStorageLog record);

    int updateByPrimaryKey(TCenterStorageLog record);
}