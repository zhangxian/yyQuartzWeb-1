package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;
import java.util.List;

public class Allowances implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String date;

	private String type;

	private String amount;

	private String approvedAmount;

	private String baseCcySymbol;

	private List<CostTrackings> costTrackings;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(String approvedAmount) {
		this.approvedAmount = approvedAmount;
	}

	public String getBaseCcySymbol() {
		return baseCcySymbol;
	}

	public void setBaseCcySymbol(String baseCcySymbol) {
		this.baseCcySymbol = baseCcySymbol;
	}

	public List<CostTrackings> getCostTrackings() {
		return costTrackings;
	}

	public void setCostTrackings(List<CostTrackings> costTrackings) {
		this.costTrackings = costTrackings;
	}

}
