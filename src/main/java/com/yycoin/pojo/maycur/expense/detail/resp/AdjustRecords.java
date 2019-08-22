package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;

public class AdjustRecords implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String adjustReason;

	private String adjustedAmount;

	private String adjustedBaseAmount;

	private String operationEmployeeId;

	private String operationAt;

	public String getAdjustReason() {
		return adjustReason;
	}

	public void setAdjustReason(String adjustReason) {
		this.adjustReason = adjustReason;
	}

	public String getAdjustedAmount() {
		return adjustedAmount;
	}

	public void setAdjustedAmount(String adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}

	public String getAdjustedBaseAmount() {
		return adjustedBaseAmount;
	}

	public void setAdjustedBaseAmount(String adjustedBaseAmount) {
		this.adjustedBaseAmount = adjustedBaseAmount;
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
