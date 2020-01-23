package com.yycoin.pojo.maycur.corpsubmit.detail.resp;

import java.io.Serializable;
import java.util.List;

public class CorpPayments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String paymentAmount;

	private String approvedPaymentAmount;

	private String corpPaymentTypeBizCode;

	private String corpPaymentTypeName;

	private String baseAmount;

	private String approvedBaseAmount;

	private long estimatedInvoiceDate;

	private long estimatedRepaymentDate;

	private List<CorpDeductions> corpDeductions;

	private String supplierName;

	private String supplierBusinessCode;

	private String supplierAccountName;

	private String supplierAccountBizCode;

	private String supplierAccount;

	private String supplierAccountBankName;

	private String supplierAccountBankBranchNo;

	private String supplierAccountBankBranchName;

	private String supplierAccountBankBranchLocation;

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getApprovedPaymentAmount() {
		return approvedPaymentAmount;
	}

	public void setApprovedPaymentAmount(String approvedPaymentAmount) {
		this.approvedPaymentAmount = approvedPaymentAmount;
	}

	public String getCorpPaymentTypeBizCode() {
		return corpPaymentTypeBizCode;
	}

	public void setCorpPaymentTypeBizCode(String corpPaymentTypeBizCode) {
		this.corpPaymentTypeBizCode = corpPaymentTypeBizCode;
	}

	public String getCorpPaymentTypeName() {
		return corpPaymentTypeName;
	}

	public void setCorpPaymentTypeName(String corpPaymentTypeName) {
		this.corpPaymentTypeName = corpPaymentTypeName;
	}

	public String getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}

	public String getApprovedBaseAmount() {
		return approvedBaseAmount;
	}

	public void setApprovedBaseAmount(String approvedBaseAmount) {
		this.approvedBaseAmount = approvedBaseAmount;
	}

	public long getEstimatedInvoiceDate() {
		return estimatedInvoiceDate;
	}

	public void setEstimatedInvoiceDate(long estimatedInvoiceDate) {
		this.estimatedInvoiceDate = estimatedInvoiceDate;
	}

	public long getEstimatedRepaymentDate() {
		return estimatedRepaymentDate;
	}

	public void setEstimatedRepaymentDate(long estimatedRepaymentDate) {
		this.estimatedRepaymentDate = estimatedRepaymentDate;
	}

	public List<CorpDeductions> getCorpDeductions() {
		return corpDeductions;
	}

	public void setCorpDeductions(List<CorpDeductions> corpDeductions) {
		this.corpDeductions = corpDeductions;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierBusinessCode() {
		return supplierBusinessCode;
	}

	public void setSupplierBusinessCode(String supplierBusinessCode) {
		this.supplierBusinessCode = supplierBusinessCode;
	}

	public String getSupplierAccountName() {
		return supplierAccountName;
	}

	public void setSupplierAccountName(String supplierAccountName) {
		this.supplierAccountName = supplierAccountName;
	}

	public String getSupplierAccountBizCode() {
		return supplierAccountBizCode;
	}

	public void setSupplierAccountBizCode(String supplierAccountBizCode) {
		this.supplierAccountBizCode = supplierAccountBizCode;
	}

	public String getSupplierAccount() {
		return supplierAccount;
	}

	public void setSupplierAccount(String supplierAccount) {
		this.supplierAccount = supplierAccount;
	}

	public String getSupplierAccountBankName() {
		return supplierAccountBankName;
	}

	public void setSupplierAccountBankName(String supplierAccountBankName) {
		this.supplierAccountBankName = supplierAccountBankName;
	}

	public String getSupplierAccountBankBranchNo() {
		return supplierAccountBankBranchNo;
	}

	public void setSupplierAccountBankBranchNo(String supplierAccountBankBranchNo) {
		this.supplierAccountBankBranchNo = supplierAccountBankBranchNo;
	}

	public String getSupplierAccountBankBranchName() {
		return supplierAccountBankBranchName;
	}

	public void setSupplierAccountBankBranchName(String supplierAccountBankBranchName) {
		this.supplierAccountBankBranchName = supplierAccountBankBranchName;
	}

	public String getSupplierAccountBankBranchLocation() {
		return supplierAccountBankBranchLocation;
	}

	public void setSupplierAccountBankBranchLocation(String supplierAccountBankBranchLocation) {
		this.supplierAccountBankBranchLocation = supplierAccountBankBranchLocation;
	}

}
