package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Operationlogs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int opTime;

	private String opType;

	private String comment;

	private String userName;

	public int getOpTime() {
		return opTime;
	}

	public void setOpTime(int opTime) {
		this.opTime = opTime;
	}

	public String getOpType() {
		return opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}