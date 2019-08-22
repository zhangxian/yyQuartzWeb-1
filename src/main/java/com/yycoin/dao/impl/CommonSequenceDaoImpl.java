package com.yycoin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.common.ICommonSequenceDao;
import com.yycoin.vo.common.TCenterSequence;
import com.yycoin.vo.common.TCenterSequenceExample;
import com.yycoin.vo.common.TCenterSequenceMapper;

@Service
public class CommonSequenceDaoImpl implements ICommonSequenceDao {

	@Autowired
	private TCenterSequenceMapper mapper;

	@Override
	public Integer getSquenceString20() {
		List<TCenterSequence> sequenceList = mapper.selectByExample(null);
		return sequenceList.get(0).getId();
	}

	@Override
	public void updateSequence(int now, int before) {
		TCenterSequenceExample updateExample = new TCenterSequenceExample();
		updateExample.createCriteria().andIdEqualTo(before);

		TCenterSequence updateRecord = new TCenterSequence();
		updateRecord.setId(now);
		mapper.updateByExample(updateRecord, updateExample);

	}

}
