package com.yycoin.vo.common;

import com.yycoin.vo.common.TCenterSequence;
import com.yycoin.vo.common.TCenterSequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterSequenceMapper {
    int countByExample(TCenterSequenceExample example);

    int deleteByExample(TCenterSequenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TCenterSequence record);

    int insertSelective(TCenterSequence record);

    List<TCenterSequence> selectByExample(TCenterSequenceExample example);

    int updateByExampleSelective(@Param("record") TCenterSequence record, @Param("example") TCenterSequenceExample example);

    int updateByExample(@Param("record") TCenterSequence record, @Param("example") TCenterSequenceExample example);
}