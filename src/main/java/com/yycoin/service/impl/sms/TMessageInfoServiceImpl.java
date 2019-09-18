package com.yycoin.service.impl.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.sms.ITMessageInfoDao;
import com.yycoin.service.sms.ITMessageInfoService;
import com.yycoin.vo.sms.TMessageInfo;
import com.yycoin.vo.sms.TMessageInfoExample;

@Service
public class TMessageInfoServiceImpl implements ITMessageInfoService {

	@Autowired
	private ITMessageInfoDao dao;

	@Override
	public List<TMessageInfo> selectByExample(TMessageInfoExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(TMessageInfo record) {
		return dao.updateByPrimaryKeySelective(record);
	}

}
