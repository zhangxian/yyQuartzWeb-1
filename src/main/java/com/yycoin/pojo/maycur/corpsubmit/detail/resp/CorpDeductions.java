package com.yycoin.pojo.maycur.corpsubmit.detail.resp;

import java.io.Serializable;

public class CorpDeductions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String corpDeductionType;

	private String corpDeductionDetailTypeCode;

	private String corpDeductionDetailTypeName;

	private String formName;

	private String formCode;

	private String deductionAmount;

	private String residualDeductionAmount;

	public String getCorpDeductionType() {
		return corpDeductionType;
	}

	public void setCorpDeductionType(String corpDeductionType) {
		this.corpDeductionType = corpDeductionType;
	}

	public String getCorpDeductionDetailTypeCode() {
		return corpDeductionDetailTypeCode;
	}

	public void setCorpDeductionDetailTypeCode(String corpDeductionDetailTypeCode) {
		this.corpDeductionDetailTypeCode = corpDeductionDetailTypeCode;
	}

	public String getCorpDeductionDetailTypeName() {
		return corpDeductionDetailTypeName;
	}

	public void setCorpDeductionDetailTypeName(String corpDeductionDetailTypeName) {
		this.corpDeductionDetailTypeName = corpDeductionDetailTypeName;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFormCode() {
		return formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
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
