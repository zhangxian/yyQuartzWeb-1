package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;
import java.util.List;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class ExpenseAllocations implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String coverEmployeeNo;

	private String coverDepartmentBizCode;

	private String allocatedRatio;

	private String allocatedAmount;

	private String coverCostCenterCode;

	private List<CostTrackings> costTrackings;

	private String accountingSubjectBizCode;

	private String accountingSubjectFullName;

	private String accountingSubjectCashFlowCode;

	private String accountingSubjectCashFlowName;

	public String getCoverEmployeeNo() {
		return coverEmployeeNo;
	}

	public void setCoverEmployeeNo(String coverEmployeeNo) {
		this.coverEmployeeNo = coverEmployeeNo;
	}

	public String getCoverDepartmentBizCode() {
		return coverDepartmentBizCode;
	}

	public void setCoverDepartmentBizCode(String coverDepartmentBizCode) {
		this.coverDepartmentBizCode = coverDepartmentBizCode;
	}

	public String getAllocatedRatio() {
		return allocatedRatio;
	}

	public void setAllocatedRatio(String allocatedRatio) {
		this.allocatedRatio = allocatedRatio;
	}

	public String getAllocatedAmount() {
		return allocatedAmount;
	}

	public void setAllocatedAmount(String allocatedAmount) {
		this.allocatedAmount = allocatedAmount;
	}

	public String getCoverCostCenterCode() {
		return coverCostCenterCode;
	}

	public void setCoverCostCenterCode(String coverCostCenterCode) {
		this.coverCostCenterCode = coverCostCenterCode;
	}

	public List<CostTrackings> getCostTrackings() {
		return costTrackings;
	}

	public void setCostTrackings(List<CostTrackings> costTrackings) {
		this.costTrackings = costTrackings;
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

}