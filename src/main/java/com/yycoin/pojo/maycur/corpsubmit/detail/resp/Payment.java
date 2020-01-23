package com.yycoin.pojo.maycur.corpsubmit.detail.resp;

import java.io.Serializable;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String currency;

	private long paidDate;

	private String payment_account;

	private String payment_account_name;

	private String collection_account;

	private String collection_account_name;

	private String collectionBankProvince;

	private String collectionBankCity;

	private String accountingSubjectCashFlowCode;

	private String collectionBankBranchNo;

	private String cost_center;

	private String pay_amount;

	private String paymentAccountBranchName;

	private String collectionBankBranchName;

	private String reportType;

	private String payMethod;

	private String collectionCurrency;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(long paidDate) {
		this.paidDate = paidDate;
	}

	public String getPayment_account() {
		return payment_account;
	}

	public void setPayment_account(String payment_account) {
		this.payment_account = payment_account;
	}

	public String getPayment_account_name() {
		return payment_account_name;
	}

	public void setPayment_account_name(String payment_account_name) {
		this.payment_account_name = payment_account_name;
	}

	public String getCollection_account() {
		return collection_account;
	}

	public void setCollection_account(String collection_account) {
		this.collection_account = collection_account;
	}

	public String getCollection_account_name() {
		return collection_account_name;
	}

	public void setCollection_account_name(String collection_account_name) {
		this.collection_account_name = collection_account_name;
	}

	public String getCollectionBankProvince() {
		return collectionBankProvince;
	}

	public void setCollectionBankProvince(String collectionBankProvince) {
		this.collectionBankProvince = collectionBankProvince;
	}

	public String getCollectionBankCity() {
		return collectionBankCity;
	}

	public void setCollectionBankCity(String collectionBankCity) {
		this.collectionBankCity = collectionBankCity;
	}

	public String getAccountingSubjectCashFlowCode() {
		return accountingSubjectCashFlowCode;
	}

	public void setAccountingSubjectCashFlowCode(String accountingSubjectCashFlowCode) {
		this.accountingSubjectCashFlowCode = accountingSubjectCashFlowCode;
	}

	public String getCollectionBankBranchNo() {
		return collectionBankBranchNo;
	}

	public void setCollectionBankBranchNo(String collectionBankBranchNo) {
		this.collectionBankBranchNo = collectionBankBranchNo;
	}

	public String getCost_center() {
		return cost_center;
	}

	public void setCost_center(String cost_center) {
		this.cost_center = cost_center;
	}

	public String getPay_amount() {
		return pay_amount;
	}

	public void setPay_amount(String pay_amount) {
		this.pay_amount = pay_amount;
	}

	public String getPaymentAccountBranchName() {
		return paymentAccountBranchName;
	}

	public void setPaymentAccountBranchName(String paymentAccountBranchName) {
		this.paymentAccountBranchName = paymentAccountBranchName;
	}

	public String getCollectionBankBranchName() {
		return collectionBankBranchName;
	}

	public void setCollectionBankBranchName(String collectionBankBranchName) {
		this.collectionBankBranchName = collectionBankBranchName;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getCollectionCurrency() {
		return collectionCurrency;
	}

	public void setCollectionCurrency(String collectionCurrency) {
		this.collectionCurrency = collectionCurrency;
	}

}