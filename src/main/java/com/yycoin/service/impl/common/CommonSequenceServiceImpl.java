package com.yycoin.service.impl.common;

import java.util.Calendar;

import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yycoin.dao.common.ICommonSequenceDao;
import com.yycoin.service.common.ICommonSequenceService;

@Service
public class CommonSequenceServiceImpl implements ICommonSequenceService {

	private int squenceBegin = 0;

	private int squenceEnd = 0;

	@Autowired
	private ICommonSequenceDao dao;

	@Override
	public String getSquenceString20() {

		if (squenceBegin != 0 && squenceBegin < squenceEnd) {
			squenceBegin = squenceBegin + 1;

			return String.valueOf(squenceBegin);
		}
		Integer sequence = dao.getSquenceString20();

		int kk = sequence;

		if (sequence > (Integer.MAX_VALUE - 101000)) {
			kk = 0;
		}
		squenceBegin = kk + 1;
		squenceEnd = kk + 1000;

		dao.updateSequence(squenceEnd, sequence);
		
		String timeLabel = DateUtils.formatDate(Calendar.getInstance().getTime(), "yyyyMMddHH");

		return timeLabel + String.valueOf(squenceBegin);
	}
	
	@Override
	public String getSquenceString20(String prefix) {

		return prefix + this.getSquenceString20();
	}

}
