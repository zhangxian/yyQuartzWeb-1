package com.yycoin.pojo.maycur.corpsubmit.detail.resp;

import java.io.Serializable;
import java.util.List;

import com.yycoin.pojo.maycur.expense.detail.resp.ApprovalProcess;

public class MayCurCorpRepaymentDetailRootBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String report_id;

	private String report_type;

	private String name;

	private String formSubType;

	private long date;

	private String amount;

	private String approvedAmount;

	private String baseAmount;

	private String baseApprovedAmount;

	private String collectionCurrency;

	private String cost_center;

	private String departmentBusinessCode;

	private String departmentName;

	private String departmentFullName;

	private String reim_user_code;

	private String reimUserName;

	private String status;

	private String pay_amount;

	private String pay_method;

	private String remittanceNotes;

	private String subsidiary_name;

	private String subsidiary_code;

	private String contractId;

	private String createdAt;

	private String submittedAt;

	private String approvedAt;

	private String settledAt;

	private String modifiedAt;

	private String exportStatus;

	private String voucherNum;

	private String exportComments;

	private List<Payment> payment;

	private List<CostTrackings> costTrackings;

	private List<Expenses> expenses;

	private List<CorpPayments> corpPayments;

	private List<CorpSupplier> corpSupplier;

	private List<ApprovalProcess> approval_process;

	private String finance_codes;

	private List<Operationlogs> operationLogs;

	private String baseCurrency;

	private String collectionToBaseExchangeRate;

	private List<Attachments> attachments;

	public String getReport_id() {
		return report_id;
	}

	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}

	public String getReport_type() {
		return report_type;
	}

	public void setReport_type(String report_type) {
		this.report_type = report_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFormSubType() {
		return formSubType;
	}

	public void setFormSubType(String formSubType) {
		this.formSubType = formSubType;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
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

	public String getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}

	public String getBaseApprovedAmount() {
		return baseApprovedAmount;
	}

	public void setBaseApprovedAmount(String baseApprovedAmount) {
		this.baseApprovedAmount = baseApprovedAmount;
	}

	public String getCollectionCurrency() {
		return collectionCurrency;
	}

	public void setCollectionCurrency(String collectionCurrency) {
		this.collectionCurrency = collectionCurrency;
	}

	public String getCost_center() {
		return cost_center;
	}

	public void setCost_center(String cost_center) {
		this.cost_center = cost_center;
	}

	public String getDepartmentBusinessCode() {
		return departmentBusinessCode;
	}

	public void setDepartmentBusinessCode(String departmentBusinessCode) {
		this.departmentBusinessCode = departmentBusinessCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentFullName() {
		return departmentFullName;
	}

	public void setDepartmentFullName(String departmentFullName) {
		this.departmentFullName = departmentFullName;
	}

	public String getReim_user_code() {
		return reim_user_code;
	}

	public void setReim_user_code(String reim_user_code) {
		this.reim_user_code = reim_user_code;
	}

	public String getReimUserName() {
		return reimUserName;
	}

	public void setReimUserName(String reimUserName) {
		this.reimUserName = reimUserName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPay_amount() {
		return pay_amount;
	}

	public void setPay_amount(String pay_amount) {
		this.pay_amount = pay_amount;
	}

	public String getPay_method() {
		return pay_method;
	}

	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}

	public String getRemittanceNotes() {
		return remittanceNotes;
	}

	public void setRemittanceNotes(String remittanceNotes) {
		this.remittanceNotes = remittanceNotes;
	}

	public String getSubsidiary_name() {
		return subsidiary_name;
	}

	public void setSubsidiary_name(String subsidiary_name) {
		this.subsidiary_name = subsidiary_name;
	}

	public String getSubsidiary_code() {
		return subsidiary_code;
	}

	public void setSubsidiary_code(String subsidiary_code) {
		this.subsidiary_code = subsidiary_code;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getSubmittedAt() {
		return submittedAt;
	}

	public void setSubmittedAt(String submittedAt) {
		this.submittedAt = submittedAt;
	}

	public String getApprovedAt() {
		return approvedAt;
	}

	public void setApprovedAt(String approvedAt) {
		this.approvedAt = approvedAt;
	}

	public String getSettledAt() {
		return settledAt;
	}

	public void setSettledAt(String settledAt) {
		this.settledAt = settledAt;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getExportStatus() {
		return exportStatus;
	}

	public void setExportStatus(String exportStatus) {
		this.exportStatus = exportStatus;
	}

	public String getVoucherNum() {
		return voucherNum;
	}

	public void setVoucherNum(String voucherNum) {
		this.voucherNum = voucherNum;
	}

	public String getExportComments() {
		return exportComments;
	}

	public void setExportComments(String exportComments) {
		this.exportComments = exportComments;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	public List<CostTrackings> getCostTrackings() {
		return costTrackings;
	}

	public void setCostTrackings(List<CostTrackings> costTrackings) {
		this.costTrackings = costTrackings;
	}

	public List<Expenses> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expenses> expenses) {
		this.expenses = expenses;
	}

	public List<CorpPayments> getCorpPayments() {
		return corpPayments;
	}

	public void setCorpPayments(List<CorpPayments> corpPayments) {
		this.corpPayments = corpPayments;
	}

	public List<CorpSupplier> getCorpSupplier() {
		return corpSupplier;
	}

	public void setCorpSupplier(List<CorpSupplier> corpSupplier) {
		this.corpSupplier = corpSupplier;
	}

	public List<ApprovalProcess> getApproval_process() {
		return approval_process;
	}

	public void setApproval_process(List<ApprovalProcess> approval_process) {
		this.approval_process = approval_process;
	}

	public String getFinance_codes() {
		return finance_codes;
	}

	public void setFinance_codes(String finance_codes) {
		this.finance_codes = finance_codes;
	}

	public List<Operationlogs> getOperationLogs() {
		return operationLogs;
	}

	public void setOperationLogs(List<Operationlogs> operationLogs) {
		this.operationLogs = operationLogs;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getCollectionToBaseExchangeRate() {
		return collectionToBaseExchangeRate;
	}

	public void setCollectionToBaseExchangeRate(String collectionToBaseExchangeRate) {
		this.collectionToBaseExchangeRate = collectionToBaseExchangeRate;
	}

	public List<Attachments> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachments> attachments) {
		this.attachments = attachments;
	}

}
