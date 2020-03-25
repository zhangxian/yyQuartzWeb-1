package com.yycoin.pojo.maycur.corprepayment.detail.resp;

import java.util.List;

public class CorpRepaymentDetails {

	private String corpRepaymentTypeCode;

	private String corpRepaymentTypeName;

	private String repaymentAmount;

	private String accountingSubjectBizCode;

	private String accountingSubjectFullName;

	private String accountingSubjectCashFlowCode;

	private String accountingSubjectCashFlowName;

	private List<AccountingSubjectAccountingItems> accountingSubjectAccountingItems;

	private List<CorpDeductions> corpDeductions;

	private String approvedRepaymentAmount;

	public String getCorpRepaymentTypeCode() {
		return corpRepaymentTypeCode;
	}

	public void setCorpRepaymentTypeCode(String corpRepaymentTypeCode) {
		this.corpRepaymentTypeCode = corpRepaymentTypeCode;
	}

	public String getCorpRepaymentTypeName() {
		return corpRepaymentTypeName;
	}

	public void setCorpRepaymentTypeName(String corpRepaymentTypeName) {
		this.corpRepaymentTypeName = corpRepaymentTypeName;
	}

	public String getRepaymentAmount() {
		return repaymentAmount;
	}

	public void setRepaymentAmount(String repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
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

	public List<AccountingSubjectAccountingItems> getAccountingSubjectAccountingItems() {
		return accountingSubjectAccountingItems;
	}

	public void setAccountingSubjectAccountingItems(
			List<AccountingSubjectAccountingItems> accountingSubjectAccountingItems) {
		this.accountingSubjectAccountingItems = accountingSubjectAccountingItems;
	}

	public List<CorpDeductions> getCorpDeductions() {
		return corpDeductions;
	}

	public void setCorpDeductions(List<CorpDeductions> corpDeductions) {
		this.corpDeductions = corpDeductions;
	}

	public String getApprovedRepaymentAmount() {
		return approvedRepaymentAmount;
	}

	public void setApprovedRepaymentAmount(String approvedRepaymentAmount) {
		this.approvedRepaymentAmount = approvedRepaymentAmount;
	}

}
