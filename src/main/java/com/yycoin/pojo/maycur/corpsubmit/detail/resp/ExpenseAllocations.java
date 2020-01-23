package com.yycoin.pojo.maycur.corpsubmit.detail.resp;

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

	private String coverCostCenterCode;

	private String allocatedRatio;

	private String allocatedAmount;

	private String baseAmount;

	private List<CostTrackings> costTrackings;

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

	public String getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}

}