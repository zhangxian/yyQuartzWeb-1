package com.yycoin.vo.packageinfo;

import com.yycoin.vo.packageinfo.TCenterPackageItem;
import com.yycoin.vo.packageinfo.TCenterPackageItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterPackageItemMapper {
    int countByExample(TCenterPackageItemExample example);

    int deleteByExample(TCenterPackageItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterPackageItem record);

    int insertSelective(TCenterPackageItem record);

    List<TCenterPackageItem> selectByExample(TCenterPackageItemExample example);

    TCenterPackageItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterPackageItem record, @Param("example") TCenterPackageItemExample example);

    int updateByExample(@Param("record") TCenterPackageItem record, @Param("example") TCenterPackageItemExample example);

    int updateByPrimaryKeySelective(TCenterPackageItem record);

    int updateByPrimaryKey(TCenterPackageItem record);
}