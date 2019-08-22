package com.yycoin.dao.common;

public interface ICommonSequenceDao {

	public Integer getSquenceString20();

	public void updateSequence(int now, int before);

}
