package com.yycoin.pojo.maycur.consume.detail.resp;

import java.io.Serializable;

/**
 * Auto-generated: 2019-08-12 14:29:4
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Loan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String loanToBaseCcyRate;

	private String loanTypeName;

	private String loanTypeCode;

	private String amount;

	private String approvedAmount;

	private String accountingSubjectBizCode;

	private String accountingSubjectFullName;

	private String accountingSubjectCashFlowCode;

	private String accountingSubjectCashFlowName;

	private String loanCcy;

	public String getLoanToBaseCcyRate() {
		return loanToBaseCcyRate;
	}

	public void setLoanToBaseCcyRate(String loanToBaseCcyRate) {
		this.loanToBaseCcyRate = loanToBaseCcyRate;
	}

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

	public String getLoanTypeCode() {
		return loanTypeCode;
	}

	public void setLoanTypeCode(String loanTypeCode) {
		this.loanTypeCode = loanTypeCode;
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

	public String getAccountingSubjectBizCode() {
		return accountingSubjectBizCode;
	}

	public void setAccountingSubjectBizCode(String accountingSubjectBizCode) {
		this.accountingSubjectBizCode = accountingSubjectBizCode;
	}

	public String getAccountingSubjectFullName() {
		return accountingSubjectFullName;
	}

	public void setAccountingSubjectFullName(String accountingSubjectFullName) {
		this.accountingSubjectFullName = accountingSubjectFullName;
	}

	public String getAccountingSubjectCashFlowCode() {
		return accountingSubjectCashFlowCode;
	}

	public void setAccountingSubjectCashFlowCode(String accountingSubjectCashFlowCode) {
		this.accountingSubjectCashFlowCode = accountingSubjectCashFlowCode;
	}

	public String getAccountingSubjectCashFlowName() {
		return accountingSubjectCashFlowName;
	}

	public void setAccountingSubjectCashFlowName(String accountingSubjectCashFlowName) {
		this.accountingSubjectCashFlowName = accountingSubjectCashFlowName;
	}

	public String getLoanCcy() {
		return loanCcy;
	}

	public void setLoanCcy(String loanCcy) {
		this.loanCcy = loanCcy;
	}

}