package com.yycoin.pojo.maycur.consume.detail.resp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2019-08-12 14:29:4
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class MayCurConsumeDetailRootBean implements Serializable {

	private int date;
	private Loan loan;
	private List<String> attachments;
	@JsonProperty("outstandingAmount")
	private int outstandingamount;
	@JsonProperty("collectionCurrency")
	private String collectioncurrency;
	@JsonProperty("modifiedAt")
	private int modifiedat;
	@JsonProperty("coverUserName")
	private String coverusername;
	@JsonProperty("corpRepaymentAccountBranchName")
	private String corprepaymentaccountbranchname;
	@JsonProperty("collectionToBaseExchangeRate")
	private int collectiontobaseexchangerate;
	@JsonProperty("repaymentAccountBranchName")
	private String repaymentaccountbranchname;
	@JsonProperty("operationLogs")
	private List<Operationlogs> operationlogs;
	@JsonProperty("baseCurrency")
	private String basecurrency;
	@JsonProperty("deleteFlag")
	private boolean deleteflag;
	@JsonProperty("createdAt")
	private int createdat;
	@JsonProperty("corpRepaymentAccountCode")
	private String corprepaymentaccountcode;
	@JsonProperty("reim_user_code")
	private String reimUserCode;
	@JsonProperty("subsidiary_code")
	private String subsidiaryCode;
	@JsonProperty("cover_user_code")
	private String coverUserCode;
	@JsonProperty("approval_process")
	private List<ApprovalProcess> approvalProcess;
	@JsonProperty("departmentFullName")
	private String departmentfullname;
	private Payment payment;
	@JsonProperty("departmentBusinessCode")
	private String departmentbusinesscode;
	@JsonProperty("approvedAmount")
	private int approvedamount;
	@JsonProperty("formSubType")
	private String formsubtype;
	@JsonProperty("submittedAt")
	private int submittedat;
	@JsonProperty("departmentName")
	private String departmentname;
	private int amount;
	@JsonProperty("reimUserName")
	private String reimusername;
	@JsonProperty("pay_amount")
	private int payAmount;
	@JsonProperty("reimDepartmentFullName")
	private String reimdepartmentfullname;
	@JsonProperty("reimDepartmentName")
	private String reimdepartmentname;
	@JsonProperty("report_type")
	private String reportType;
	@JsonProperty("pay_method")
	private String payMethod;
	@JsonProperty("approvedAt")
	private int approvedat;
	@JsonProperty("baseAmount")
	private int baseamount;
	@JsonProperty("subsidiary_name")
	private String subsidiaryName;
	@JsonProperty("travelRecords")
	private List<String> travelrecords;
	@JsonProperty("reimDepartmentBusinessCode")
	private String reimdepartmentbusinesscode;
	@JsonProperty("cost_center")
	private String costCenter;
	@JsonProperty("settledAt")
	private int settledat;
	@JsonProperty("report_id")
	private String reportId;
	private String name;
	@JsonProperty("costTrackings")
	private List<CostTrackings> costtrackings;
	@JsonProperty("repaymentTime")
	private int repaymenttime;
	private List<Expenses> expenses;
	private String status;
	@JsonProperty("finance_codes")
	private List<String> financeCodes;

	public void setDate(int date) {
		this.date = date;
	}

	public int getDate() {
		return date;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setAttachments(List<String> attachments) {
		this.attachments = attachments;
	}

	public List<String> getAttachments() {
		return attachments;
	}

	public void setOutstandingamount(int outstandingamount) {
		this.outstandingamount = outstandingamount;
	}

	public int getOutstandingamount() {
		return outstandingamount;
	}

	public void setCollectioncurrency(String collectioncurrency) {
		this.collectioncurrency = collectioncurrency;
	}

	public String getCollectioncurrency() {
		return collectioncurrency;
	}

	public void setModifiedat(int modifiedat) {
		this.modifiedat = modifiedat;
	}

	public int getModifiedat() {
		return modifiedat;
	}

	public void setCoverusername(String coverusername) {
		this.coverusername = coverusername;
	}

	public String getCoverusername() {
		return coverusername;
	}

	public void setCorprepaymentaccountbranchname(String corprepaymentaccountbranchname) {
		this.corprepaymentaccountbranchname = corprepaymentaccountbranchname;
	}

	public String getCorprepaymentaccountbranchname() {
		return corprepaymentaccountbranchname;
	}

	public void setCollectiontobaseexchangerate(int collectiontobaseexchangerate) {
		this.collectiontobaseexchangerate = collectiontobaseexchangerate;
	}

	public int getCollectiontobaseexchangerate() {
		return collectiontobaseexchangerate;
	}

	public void setRepaymentaccountbranchname(String repaymentaccountbranchname) {
		this.repaymentaccountbranchname = repaymentaccountbranchname;
	}

	public String getRepaymentaccountbranchname() {
		return repaymentaccountbranchname;
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

	public void setDeleteflag(boolean deleteflag) {
		this.deleteflag = deleteflag;
	}

	public boolean getDeleteflag() {
		return deleteflag;
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

	public void setSubsidiaryCode(String subsidiaryCode) {
		this.subsidiaryCode = subsidiaryCode;
	}

	public String getSubsidiaryCode() {
		return subsidiaryCode;
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

	public void setFormsubtype(String formsubtype) {
		this.formsubtype = formsubtype;
	}

	public String getFormsubtype() {
		return formsubtype;
	}

	public void setSubmittedat(int submittedat) {
		this.submittedat = submittedat;
	}

	public int getSubmittedat() {
		return submittedat;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setReimusername(String reimusername) {
		this.reimusername = reimusername;
	}

	public String getReimusername() {
		return reimusername;
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

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getPayMethod() {
		return payMethod;
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

	public void setTravelrecords(List<String> travelrecords) {
		this.travelrecords = travelrecords;
	}

	public List<String> getTravelrecords() {
		return travelrecords;
	}

	public void setReimdepartmentbusinesscode(String reimdepartmentbusinesscode) {
		this.reimdepartmentbusinesscode = reimdepartmentbusinesscode;
	}

	public String getReimdepartmentbusinesscode() {
		return reimdepartmentbusinesscode;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getCostCenter() {
		return costCenter;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCosttrackings(List<CostTrackings> costtrackings) {
		this.costtrackings = costtrackings;
	}

	public List<CostTrackings> getCosttrackings() {
		return costtrackings;
	}

	public void setRepaymenttime(int repaymenttime) {
		this.repaymenttime = repaymenttime;
	}

	public int getRepaymenttime() {
		return repaymenttime;
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

}