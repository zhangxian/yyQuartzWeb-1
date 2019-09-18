package com.yycoin.service.sms;

import java.util.List;

import com.yycoin.vo.sms.TMessageInfo;
import com.yycoin.vo.sms.TMessageInfoExample;

public interface ITMessageInfoService {

	List<TMessageInfo> selectByExample(TMessageInfoExample example);

	int updateByPrimaryKeySelective(TMessageInfo record);

}
