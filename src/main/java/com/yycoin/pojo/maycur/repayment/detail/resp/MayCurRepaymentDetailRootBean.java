package com.yycoin.pojo.maycur.repayment.detail.resp;

import java.io.Serializable;
import java.util.List;

import com.yycoin.pojo.maycur.expense.detail.resp.ApprovalProcess;

public class MayCurRepaymentDetailRootBean implements Serializable {

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

	private String collectionCurrency;

	private String cost_center;

	private String departmentBusinessCode;

	private String departmentName;

	private String departmentFullName;

	private String reim_user_code;

	private String reimUserName;

	private long repaymentTime;

	private String status;

	private String subsidiary_name;

	private String subsidiary_code;

	private String createdAt;

	private String submittedAt;

	private String approvedAt;

	private String modifiedAt;

	private String exportStatus;

	private String voucherNum;

	private String exportComments;

	private String repaymentAccountNumber;

	private String repaymentAccountName;

	private String repaymentAccountCode;

	private String repaymentAccountProvince;

	private String repaymentAccountCity;

	private String repaymentAccountBranchNO;

	private String repaymentAccountingSubjectBizCode;

	private String repaymentAccountingSubjectFullName;

	private String repaymentAccountingSubjectCashFlowCode;

	private String repaymentAccountingSubjectCashFlowName;

	private List<ApprovalProcess> approval_process;

	private String finance_codes;

	private List<Repayments> repayments;

	private List<CostTrackings> costTrackings;

	private List<Operationlogs> operationLogs;

	private String baseCurrency;

	private String collectionToBaseExchangeRate;

	private String baseAmount;

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

	public long getRepaymentTime() {
		return repaymentTime;
	}

	public void setRepaymentTime(long repaymentTime) {
		this.repaymentTime = repaymentTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getRepaymentAccountNumber() {
		return repaymentAccountNumber;
	}

	public void setRepaymentAccountNumber(String repaymentAccountNumber) {
		this.repaymentAccountNumber = repaymentAccountNumber;
	}

	public String getRepaymentAccountName() {
		return repaymentAccountName;
	}

	public void setRepaymentAccountName(String repaymentAccountName) {
		this.repaymentAccountName = repaymentAccountName;
	}

	public String getRepaymentAccountCode() {
		return repaymentAccountCode;
	}

	public void setRepaymentAccountCode(String repaymentAccountCode) {
		this.repaymentAccountCode = repaymentAccountCode;
	}

	public String getRepaymentAccountProvince() {
		return repaymentAccountProvince;
	}

	public void setRepaymentAccountProvince(String repaymentAccountProvince) {
		this.repaymentAccountProvince = repaymentAccountProvince;
	}

	public String getRepaymentAccountCity() {
		return repaymentAccountCity;
	}

	public void setRepaymentAccountCity(String repaymentAccountCity) {
		this.repaymentAccountCity = repaymentAccountCity;
	}

	public String getRepaymentAccountBranchNO() {
		return repaymentAccountBranchNO;
	}

	public void setRepaymentAccountBranchNO(String repaymentAccountBranchNO) {
		this.repaymentAccountBranchNO = repaymentAccountBranchNO;
	}

	public String getRepaymentAccountingSubjectBizCode() {
		return repaymentAccountingSubjectBizCode;
	}

	public void setRepaymentAccountingSubjectBizCode(String repaymentAccountingSubjectBizCode) {
		this.repaymentAccountingSubjectBizCode = repaymentAccountingSubjectBizCode;
	}

	public String getRepaymentAccountingSubjectFullName() {
		return repaymentAccountingSubjectFullName;
	}

	public void setRepaymentAccountingSubjectFullName(String repaymentAccountingSubjectFullName) {
		this.repaymentAccountingSubjectFullName = repaymentAccountingSubjectFullName;
	}

	public String getRepaymentAccountingSubjectCashFlowCode() {
		return repaymentAccountingSubjectCashFlowCode;
	}

	public void setRepaymentAccountingSubjectCashFlowCode(String repaymentAccountingSubjectCashFlowCode) {
		this.repaymentAccountingSubjectCashFlowCode = repaymentAccountingSubjectCashFlowCode;
	}

	public String getRepaymentAccountingSubjectCashFlowName() {
		return repaymentAccountingSubjectCashFlowName;
	}

	public void setRepaymentAccountingSubjectCashFlowName(String repaymentAccountingSubjectCashFlowName) {
		this.repaymentAccountingSubjectCashFlowName = repaymentAccountingSubjectCashFlowName;
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

	public List<Repayments> getRepayments() {
		return repayments;
	}

	public void setRepayments(List<Repayments> repayments) {
		this.repayments = repayments;
	}

	public List<CostTrackings> getCostTrackings() {
		return costTrackings;
	}

	public void setCostTrackings(List<CostTrackings> costTrackings) {
		this.costTrackings = costTrackings;
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

	public String getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}

	public List<Attachments> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachments> attachments) {
		this.attachments = attachments;
	}

}
