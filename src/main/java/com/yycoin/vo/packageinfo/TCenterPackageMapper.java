package com.yycoin.vo.packageinfo;

import com.yycoin.vo.packageinfo.TCenterPackage;
import com.yycoin.vo.packageinfo.TCenterPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterPackageMapper {
    int countByExample(TCenterPackageExample example);

    int deleteByExample(TCenterPackageExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterPackage record);

    int insertSelective(TCenterPackage record);

    List<TCenterPackage> selectByExample(TCenterPackageExample example);

    TCenterPackage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterPackage record, @Param("example") TCenterPackageExample example);

    int updateByExample(@Param("record") TCenterPackage record, @Param("example") TCenterPackageExample example);

    int updateByPrimaryKeySelective(TCenterPackage record);

    int updateByPrimaryKey(TCenterPackage record);
}