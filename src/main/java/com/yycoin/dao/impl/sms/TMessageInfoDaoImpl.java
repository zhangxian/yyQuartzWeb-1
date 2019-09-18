package com.yycoin.dao.impl.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.sms.ITMessageInfoDao;
import com.yycoin.vo.sms.TMessageInfo;
import com.yycoin.vo.sms.TMessageInfoExample;
import com.yycoin.vo.sms.TMessageInfoMapper;

@Service
public class TMessageInfoDaoImpl implements ITMessageInfoDao {

	@Autowired
	private TMessageInfoMapper mapper;

	@Override
	public int countByExample(TMessageInfoExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(TMessageInfoExample example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TMessageInfo record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(TMessageInfo record) {
		return mapper.insertSelective(record);
	}

	@Override
	public List<TMessageInfo> selectByExample(TMessageInfoExample example) {
		return mapper.selectByExample(example);
	}

	@Override
	public TMessageInfo selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(TMessageInfo record, TMessageInfoExample example) {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TMessageInfo record, TMessageInfoExample example) {
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TMessageInfo record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TMessageInfo record) {
		return mapper.updateByPrimaryKey(record);
	}

}
