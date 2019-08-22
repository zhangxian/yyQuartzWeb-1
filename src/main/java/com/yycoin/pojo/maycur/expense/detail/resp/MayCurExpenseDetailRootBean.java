package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class MayCurExpenseDetailRootBean implements Serializable {

	private int date;
	@JsonProperty("creditRecords")
	private List<String> creditrecords;
	@JsonProperty("modifiedAt")
	private int modifiedat;
	@JsonProperty("corpRepaymentAccountBranchName")
	private String corprepaymentaccountbranchname;
	@JsonProperty("repaymentAccountBranchName")
	private String repaymentaccountbranchname;
	@JsonProperty("deleteFlag")
	private boolean deleteflag;
	@JsonProperty("auditFree")
	private boolean auditfree;
	@JsonProperty("createdAt")
	private int createdat;
	@JsonProperty("corpRepaymentAccountCode")
	private String corprepaymentaccountcode;
	@JsonProperty("reim_user_code")
	private String reimUserCode;
	@JsonProperty("cover_user_code")
	private String coverUserCode;
	@JsonProperty("approval_process")
	private List<ApprovalProcess> approvalProcess;
	@JsonProperty("departmentFullName")
	private String departmentfullname;
	private Payment payment;
	@JsonProperty("formSubType")
	private String formsubtype;
	@JsonProperty("departmentName")
	private String departmentname;
	@JsonProperty("invoiceFree")
	private boolean invoicefree;
	@JsonProperty("reimUserName")
	private String reimusername;
	@JsonProperty("externalFormLinks")
	private List<String> externalformlinks;
	@JsonProperty("reimDepartmentName")
	private String reimdepartmentname;
	@JsonProperty("report_type")
	private String reportType;
	@JsonProperty("approvedAt")
	private int approvedat;
	@JsonProperty("baseAmount")
	private int baseamount;
	@JsonProperty("subsidiary_name")
	private String subsidiaryName;
	@JsonProperty("cost_center")
	private String costCenter;
	@JsonProperty("name")
	private String name;
	private List<Expenses> expenses;
	@JsonProperty("status")
	private String status;
	@JsonProperty("finance_codes")
	private List<String> financeCodes;
	@JsonProperty("attachments")
	private List<String> attachments;
	@JsonProperty("collectionCurrency")
	private String collectioncurrency;
	private List<Payments> payments;
	@JsonProperty("coverUserName")
	private String coverusername;
	@JsonProperty("collectionToBaseExchangeRate")
	private int collectiontobaseexchangerate;
	@JsonProperty("operationLogs")
	private List<Operationlogs> operationlogs;
	@JsonProperty("baseCurrency")
	private String basecurrency;
	@JsonProperty("subsidiary_code")
	private String subsidiaryCode;
	private List<Allocations> allocations;
	@JsonProperty("departmentBusinessCode")
	private String departmentbusinesscode;
	@JsonProperty("approvedAmount")
	private int approvedamount;
	@JsonProperty("submittedAt")
	private int submittedat;
	@JsonProperty("amount")
	private int amount;
	@JsonProperty("pay_amount")
	private int payAmount;
	@JsonProperty("reimDepartmentFullName")
	private String reimdepartmentfullname;
	@JsonProperty("pay_method")
	private String payMethod;
	@JsonProperty("travelRecords")
	private List<TravelRecords> travelrecords;
	@JsonProperty("reimDepartmentBusinessCode")
	private String reimdepartmentbusinesscode;
	@JsonProperty("settledAt")
	private int settledat;
	@JsonProperty("report_id")
	private String reportId;
	private List<Repayments> repayments;
	@JsonProperty("costTrackings")
	private List<String> costtrackings;

	public void setDate(int date) {
		this.date = date;
	}

	public int getDate() {
		return date;
	}

	public void setCreditrecords(List<String> creditrecords) {
		this.creditrecords = creditrecords;
	}

	public List<String> getCreditrecords() {
		return creditrecords;
	}

	public void setModifiedat(int modifiedat) {
		this.modifiedat = modifiedat;
	}

	public int getModifiedat() {
		return modifiedat;
	}

	public void setCorprepaymentaccountbranchname(String corprepaymentaccountbranchname) {
		this.corprepaymentaccountbranchname = corprepaymentaccountbranchname;
	}

	public String getCorprepaymentaccountbranchname() {
		return corprepaymentaccountbranchname;
	}

	public void setRepaymentaccountbranchname(String repaymentaccountbranchname) {
		this.repaymentaccountbranchname = repaymentaccountbranchname;
	}

	public String getRepaymentaccountbranchname() {
		return repaymentaccountbranchname;
	}

	public void setDeleteflag(boolean deleteflag) {
		this.deleteflag = deleteflag;
	}

	public boolean getDeleteflag() {
		return deleteflag;
	}

	public void setAuditfree(boolean auditfree) {
		this.auditfree = auditfree;
	}

	public boolean getAuditfree() {
		return auditfree;
	}

	public void setCreatedat(int createdat) {
		this.createdat = createdat;
	}

	public int getCreatedat() {
		return createdat;
	}

	public void setCorprepaymentaccountcode(String corprepaymentaccountcode) {
		this.corprepaymentaccountcode = corprepaymentaccountcode;
	}

	public String getCorprepaymentaccountcode() {
		return corprepaymentaccountcode;
	}

	public void setReimUserCode(String reimUserCode) {
		this.reimUserCode = reimUserCode;
	}

	public String getReimUserCode() {
		return reimUserCode;
	}

	public void setCoverUserCode(String coverUserCode) {
		this.coverUserCode = coverUserCode;
	}

	public String getCoverUserCode() {
		return coverUserCode;
	}

	public void setApprovalProcess(List<ApprovalProcess> approvalProcess) {
		this.approvalProcess = approvalProcess;
	}

	public List<ApprovalProcess> getApprovalProcess() {
		return approvalProcess;
	}

	public void setDepartmentfullname(String departmentfullname) {
		this.departmentfullname = departmentfullname;
	}

	public String getDepartmentfullname() {
		return departmentfullname;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setFormsubtype(String formsubtype) {
		this.formsubtype = formsubtype;
	}

	public String getFormsubtype() {
		return formsubtype;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setInvoicefree(boolean invoicefree) {
		this.invoicefree = invoicefree;
	}

	public boolean getInvoicefree() {
		return invoicefree;
	}

	public void setReimusername(String reimusername) {
		this.reimusername = reimusername;
	}

	public String getReimusername() {
		return reimusername;
	}

	public void setExternalformlinks(List<String> externalformlinks) {
		this.externalformlinks = externalformlinks;
	}

	public List<String> getExternalformlinks() {
		return externalformlinks;
	}

	public void setReimdepartmentname(String reimdepartmentname) {
		this.reimdepartmentname = reimdepartmentname;
	}

	public String getReimdepartmentname() {
		return reimdepartmentname;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReportType() {
		return reportType;
	}

	public void setApprovedat(int approvedat) {
		this.approvedat = approvedat;
	}

	public int getApprovedat() {
		return approvedat;
	}

	public void setBaseamount(int baseamount) {
		this.baseamount = baseamount;
	}

	public int getBaseamount() {
		return baseamount;
	}

	public void setSubsidiaryName(String subsidiaryName) {
		this.subsidiaryName = subsidiaryName;
	}

	public String getSubsidiaryName() {
		return subsidiaryName;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setExpenses(List<Expenses> expenses) {
		this.expenses = expenses;
	}

	public List<Expenses> getExpenses() {
		return expenses;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setFinanceCodes(List<String> financeCodes) {
		this.financeCodes = financeCodes;
	}

	public List<String> getFinanceCodes() {
		return financeCodes;
	}

	public void setAttachments(List<String> attachments) {
		this.attachments = attachments;
	}

	public List<String> getAttachments() {
		return attachments;
	}

	public void setCollectioncurrency(String collectioncurrency) {
		this.collectioncurrency = collectioncurrency;
	}

	public String getCollectioncurrency() {
		return collectioncurrency;
	}

	public void setPayments(List<Payments> payments) {
		this.payments = payments;
	}

	public List<Payments> getPayments() {
		return payments;
	}

	public void setCoverusername(String coverusername) {
		this.coverusername = coverusername;
	}

	public String getCoverusername() {
		return coverusername;
	}

	public void setCollectiontobaseexchangerate(int collectiontobaseexchangerate) {
		this.collectiontobaseexchangerate = collectiontobaseexchangerate;
	}

	public int getCollectiontobaseexchangerate() {
		return collectiontobaseexchangerate;
	}

	public void setOperationlogs(List<Operationlogs> operationlogs) {
		this.operationlogs = operationlogs;
	}

	public List<Operationlogs> getOperationlogs() {
		return operationlogs;
	}

	public void setBasecurrency(String basecurrency) {
		this.basecurrency = basecurrency;
	}

	public String getBasecurrency() {
		return basecurrency;
	}

	public void setSubsidiaryCode(String subsidiaryCode) {
		this.subsidiaryCode = subsidiaryCode;
	}

	public String getSubsidiaryCode() {
		return subsidiaryCode;
	}

	public void setAllocations(List<Allocations> allocations) {
		this.allocations = allocations;
	}

	public List<Allocations> getAllocations() {
		return allocations;
	}

	public void setDepartmentbusinesscode(String departmentbusinesscode) {
		this.departmentbusinesscode = departmentbusinesscode;
	}

	public String getDepartmentbusinesscode() {
		return departmentbusinesscode;
	}

	public void setApprovedamount(int approvedamount) {
		this.approvedamount = approvedamount;
	}

	public int getApprovedamount() {
		return approvedamount;
	}

	public void setSubmittedat(int submittedat) {
		this.submittedat = submittedat;
	}

	public int getSubmittedat() {
		return submittedat;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setReimdepartmentfullname(String reimdepartmentfullname) {
		this.reimdepartmentfullname = reimdepartmentfullname;
	}

	public String getReimdepartmentfullname() {
		return reimdepartmentfullname;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setTravelrecords(List<TravelRecords> travelrecords) {
		this.travelrecords = travelrecords;
	}

	public List<TravelRecords> getTravelrecords() {
		return travelrecords;
	}

	public void setReimdepartmentbusinesscode(String reimdepartmentbusinesscode) {
		this.reimdepartmentbusinesscode = reimdepartmentbusinesscode;
	}

	public String getReimdepartmentbusinesscode() {
		return reimdepartmentbusinesscode;
	}

	public void setSettledat(int settledat) {
		this.settledat = settledat;
	}

	public int getSettledat() {
		return settledat;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportId() {
		return reportId;
	}

	public void setRepayments(List<Repayments> repayments) {
		this.repayments = repayments;
	}

	public List<Repayments> getRepayments() {
		return repayments;
	}

	public void setCosttrackings(List<String> costtrackings) {
		this.costtrackings = costtrackings;
	}

	public List<String> getCosttrackings() {
		return costtrackings;
	}

}