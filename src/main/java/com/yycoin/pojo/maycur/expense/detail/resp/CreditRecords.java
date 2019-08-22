package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;

public class CreditRecords implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String credit;

	private String reason;

	private String afterValue;

	private String operationEmployeeId;

	private String operationAt;

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAfterValue() {
		return afterValue;
	}

	public void setAfterValue(String afterValue) {
		this.afterValue = afterValue;
	}

	public String getOperationEmployeeId() {
		return operationEmployeeId;
	}

	public void setOperationEmployeeId(String operationEmployeeId) {
		this.operationEmployeeId = operationEmployeeId;
	}

	public String getOperationAt() {
		return operationAt;
	}

	public void setOperationAt(String operationAt) {
		this.operationAt = operationAt;
	}

}
