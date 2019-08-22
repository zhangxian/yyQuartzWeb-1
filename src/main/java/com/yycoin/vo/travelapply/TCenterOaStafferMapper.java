package com.yycoin.vo.travelapply;

import com.yycoin.vo.travelapply.TCenterOaStaffer;
import com.yycoin.vo.travelapply.TCenterOaStafferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterOaStafferMapper {
    int countByExample(TCenterOaStafferExample example);

    int deleteByExample(TCenterOaStafferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterOaStaffer record);

    int insertSelective(TCenterOaStaffer record);

    List<TCenterOaStaffer> selectByExample(TCenterOaStafferExample example);

    TCenterOaStaffer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterOaStaffer record, @Param("example") TCenterOaStafferExample example);

    int updateByExample(@Param("record") TCenterOaStaffer record, @Param("example") TCenterOaStafferExample example);

    int updateByPrimaryKeySelective(TCenterOaStaffer record);

    int updateByPrimaryKey(TCenterOaStaffer record);
}