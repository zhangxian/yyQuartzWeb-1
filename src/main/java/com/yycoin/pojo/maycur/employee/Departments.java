package com.yycoin.pojo.maycur.employee;

import java.io.Serializable;

public class Departments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String departmentBizCode;

	private String managerId;

	private String employeeId;

	private String cover;

	public String getDepartmentBizCode() {
		return departmentBizCode;
	}

	public void setDepartmentBizCode(String departmentBizCode) {
		this.departmentBizCode = departmentBizCode;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

}
