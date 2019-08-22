package com.yycoin.controller;

import com.yycoin.util.PageBean;

public abstract class BaseController {

	protected int pageNumber = 1;

	protected int pageSize = 10;

	@SuppressWarnings("rawtypes")
	protected PageBean getPageBean(int pageNumber, int pageSize, int totalRecord) {
		PageBean pg = new PageBean(pageNumber, pageSize, totalRecord);
		return pg;
	}

}
