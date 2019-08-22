package com.yycoin.vo.travelapply;

import com.yycoin.vo.travelapply.TCenterOaAttachment;
import com.yycoin.vo.travelapply.TCenterOaAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCenterOaAttachmentMapper {
    int countByExample(TCenterOaAttachmentExample example);

    int deleteByExample(TCenterOaAttachmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(TCenterOaAttachment record);

    int insertSelective(TCenterOaAttachment record);

    List<TCenterOaAttachment> selectByExample(TCenterOaAttachmentExample example);

    TCenterOaAttachment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TCenterOaAttachment record, @Param("example") TCenterOaAttachmentExample example);

    int updateByExample(@Param("record") TCenterOaAttachment record, @Param("example") TCenterOaAttachmentExample example);

    int updateByPrimaryKeySelective(TCenterOaAttachment record);

    int updateByPrimaryKey(TCenterOaAttachment record);
}