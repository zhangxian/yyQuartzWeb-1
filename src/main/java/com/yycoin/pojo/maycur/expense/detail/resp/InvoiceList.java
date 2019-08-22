package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;
import java.util.List;

public class InvoiceList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String buyerName;

	private String buyerTaxNumber;

	private String buyerAddressPhone;

	private String buyerBankAccount;

	private String invoiceCode;

	private String invoiceNumber;

	private String issueDate;

	private String totalPriceAmount;

	private String totalTaxAmount;

	private String totalPriceAndTax;

	private String supplierName;

	private String supplierAddress;

	private String validateStatus;

	private String validateStatusDesc;

	private String remark;

	private String checksum;

	private String bizType;

	private String bizTypeDesc;

	private List<LineItems> lineItems;

	private List<Attachments> attachments;

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerTaxNumber() {
		return buyerTaxNumber;
	}

	public void setBuyerTaxNumber(String buyerTaxNumber) {
		this.buyerTaxNumber = buyerTaxNumber;
	}

	public String getBuyerAddressPhone() {
		return buyerAddressPhone;
	}

	public void setBuyerAddressPhone(String buyerAddressPhone) {
		this.buyerAddressPhone = buyerAddressPhone;
	}

	public String getBuyerBankAccount() {
		return buyerBankAccount;
	}

	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}

	public String getInvoiceCode() {
		return invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getTotalPriceAmount() {
		return totalPriceAmount;
	}

	public void setTotalPriceAmount(String totalPriceAmount) {
		this.totalPriceAmount = totalPriceAmount;
	}

	public String getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(String totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public String getTotalPriceAndTax() {
		return totalPriceAndTax;
	}

	public void setTotalPriceAndTax(String totalPriceAndTax) {
		this.totalPriceAndTax = totalPriceAndTax;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public String getValidateStatus() {
		return validateStatus;
	}

	public void setValidateStatus(String validateStatus) {
		this.validateStatus = validateStatus;
	}

	public String getValidateStatusDesc() {
		return validateStatusDesc;
	}

	public void setValidateStatusDesc(String validateStatusDesc) {
		this.validateStatusDesc = validateStatusDesc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizTypeDesc() {
		return bizTypeDesc;
	}

	public void setBizTypeDesc(String bizTypeDesc) {
		this.bizTypeDesc = bizTypeDesc;
	}

	public List<LineItems> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItems> lineItems) {
		this.lineItems = lineItems;
	}

	public List<Attachments> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachments> attachments) {
		this.attachments = attachments;
	}

}
