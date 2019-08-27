package com.yycoin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.service.ITCenterPayListLogService;
import com.yycoin.vo.TCenterPayListLog;
import com.yycoin.vo.TCenterPayListLogExample;
import com.yycoin.vo.TCenterPayListLogMapper;

@Service
public class TCenterPayListLogServiceImpl implements ITCenterPayListLogService {

	@Autowired
	private TCenterPayListLogMapper mapper;

	@Override
	public int countByExample(TCenterPayListLogExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TCenterPayListLogExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int insert(TCenterPayListLog record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TCenterPayListLog record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<TCenterPayListLog> selectByExample(TCenterPayListLogExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(TCenterPayListLog record, TCenterPayListLogExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TCenterPayListLog record, TCenterPayListLogExample example) {
		return mapper.updateByExample(record, example);
	}

}
