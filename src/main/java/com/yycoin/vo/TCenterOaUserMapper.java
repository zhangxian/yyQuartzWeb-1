package com.yycoin.vo;

import com.yycoin.vo.TCenterOaUser;
import com.yycoin.vo.TCenterOaUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterOaUserMapper {
    int countByExample(TCenterOaUserExample example);

    int deleteByExample(TCenterOaUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterOaUser record);

    int insertSelective(TCenterOaUser record);

    List<TCenterOaUser> selectByExample(TCenterOaUserExample example);

    TCenterOaUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TCenterOaUser record, @Param("example") TCenterOaUserExample example);

    int updateByExample(@Param("record") TCenterOaUser record, @Param("example") TCenterOaUserExample example);

    int updateByPrimaryKeySelective(TCenterOaUser record);

    int updateByPrimaryKey(TCenterOaUser record);
}