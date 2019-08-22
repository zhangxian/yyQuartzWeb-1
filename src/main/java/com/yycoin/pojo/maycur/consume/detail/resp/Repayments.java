package com.yycoin.pojo.maycur.consume.detail.resp;

import java.io.Serializable;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Repayments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String type;

	private String approvedAmount;

	private String repaymentAmount;

	private String loanTypeBizCode;

	private String accountingSubjectBizCode;

	private String accountingSubjectFullName;

	private String accountingSubjectCashFlowCode;

	private String accountingSubjectCashFlowName;

	private String report_id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(String approvedAmount) {
		this.approvedAmount = approvedAmount;
	}

	public String getRepaymentAmount() {
		return repaymentAmount;
	}

	public void setRepaymentAmount(String repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

	public String getLoanTypeBizCode() {
		return loanTypeBizCode;
	}

	public void setLoanTypeBizCode(String loanTypeBizCode) {
		this.loanTypeBizCode = loanTypeBizCode;
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

	public String getReport_id() {
		return report_id;
	}

	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}

}