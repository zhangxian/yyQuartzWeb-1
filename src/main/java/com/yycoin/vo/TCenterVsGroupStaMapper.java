package com.yycoin.vo;

import com.yycoin.vo.TCenterVsGroupSta;
import com.yycoin.vo.TCenterVsGroupStaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterVsGroupStaMapper {
    int countByExample(TCenterVsGroupStaExample example);

    int deleteByExample(TCenterVsGroupStaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterVsGroupSta record);

    int insertSelective(TCenterVsGroupSta record);

    List<TCenterVsGroupSta> selectByExample(TCenterVsGroupStaExample example);

    TCenterVsGroupSta selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterVsGroupSta record, @Param("example") TCenterVsGroupStaExample example);

    int updateByExample(@Param("record") TCenterVsGroupSta record, @Param("example") TCenterVsGroupStaExample example);

    int updateByPrimaryKeySelective(TCenterVsGroupSta record);

    int updateByPrimaryKey(TCenterVsGroupSta record);
}