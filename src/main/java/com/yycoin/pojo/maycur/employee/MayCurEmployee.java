package com.yycoin.pojo.maycur.employee;

import java.io.Serializable;
import java.util.List;

public class MayCurEmployee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mobile;

	private String email;

	private String name;

	private String employeeId;

	private String rank;

	private String position;

	private String status;

	private String defaultSubsidiaryBizCode;

	private String hireDate;

	private String tag;

	private String residenceCode;

	private String custField1;

	private String custField2;

	private String custField3;

	private String note;

	private List<Departments> departments;

	private String firstName;

	private String middleName;

	private String lastName;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDefaultSubsidiaryBizCode() {
		return defaultSubsidiaryBizCode;
	}

	public void setDefaultSubsidiaryBizCode(String defaultSubsidiaryBizCode) {
		this.defaultSubsidiaryBizCode = defaultSubsidiaryBizCode;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getResidenceCode() {
		return residenceCode;
	}

	public void setResidenceCode(String residenceCode) {
		this.residenceCode = residenceCode;
	}

	public String getCustField1() {
		return custField1;
	}

	public void setCustField1(String custField1) {
		this.custField1 = custField1;
	}

	public String getCustField2() {
		return custField2;
	}

	public void setCustField2(String custField2) {
		this.custField2 = custField2;
	}

	public String getCustField3() {
		return custField3;
	}

	public void setCustField3(String custField3) {
		this.custField3 = custField3;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<Departments> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Departments> departments) {
		this.departments = departments;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
