package com.yycoin.vo;

import com.yycoin.vo.MayCurCorpPayAnalyse;
import com.yycoin.vo.MayCurCorpPayAnalyseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MayCurCorpPayAnalyseMapper {
    int countByExample(MayCurCorpPayAnalyseExample example);

    int deleteByExample(MayCurCorpPayAnalyseExample example);

    int insert(MayCurCorpPayAnalyse record);

    int insertSelective(MayCurCorpPayAnalyse record);

    List<MayCurCorpPayAnalyse> selectByExample(MayCurCorpPayAnalyseExample example);

    int updateByExampleSelective(@Param("record") MayCurCorpPayAnalyse record, @Param("example") MayCurCorpPayAnalyseExample example);

    int updateByExample(@Param("record") MayCurCorpPayAnalyse record, @Param("example") MayCurCorpPayAnalyseExample example);
}