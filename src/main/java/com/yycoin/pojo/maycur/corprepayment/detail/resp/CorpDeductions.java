package com.yycoin.pojo.maycur.corprepayment.detail.resp;

import java.io.Serializable;

public class CorpDeductions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String corpDeductionDetailTypeName;

	private String corpReimburseName;

	private String corpReimburseCode;

	private String deductionAmount;

	private String residualDeductionAmount;

	public String getCorpDeductionDetailTypeName() {
		return corpDeductionDetailTypeName;
	}

	public void setCorpDeductionDetailTypeName(String corpDeductionDetailTypeName) {
		this.corpDeductionDetailTypeName = corpDeductionDetailTypeName;
	}

	public String getCorpReimburseName() {
		return corpReimburseName;
	}

	public void setCorpReimburseName(String corpReimburseName) {
		this.corpReimburseName = corpReimburseName;
	}

	public String getCorpReimburseCode() {
		return corpReimburseCode;
	}

	public void setCorpReimburseCode(String corpReimburseCode) {
		this.corpReimburseCode = corpReimburseCode;
	}

	public String getDeductionAmount() {
		return deductionAmount;
	}

	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getResidualDeductionAmount() {
		return residualDeductionAmount;
	}

	public void setResidualDeductionAmount(String residualDeductionAmount) {
		this.residualDeductionAmount = residualDeductionAmount;
	}

}
