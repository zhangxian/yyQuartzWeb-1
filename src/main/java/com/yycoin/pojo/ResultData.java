package com.yycoin.pojo;

import java.io.Serializable;

public class ResultData<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2807733971842290195L;

	private String returnCode;

	private String returnMsg;

	private Object returnObj;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMsg() {
		return returnMsg;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}

	public Object getReturnObj() {
		return returnObj;
	}

	public void setReturnObj(Object returnObj) {
		this.returnObj = returnObj;
	}

}
