package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Allocations implements Serializable {

	@JsonProperty("departmentName")
	private String departmentname;
	@JsonProperty("departmentHeirCode")
	private String departmentheircode;
	private double amount;
	private String code;
	@JsonProperty("departmentCode")
	private String departmentcode;
	@JsonProperty("coverUserEmployeeNo")
	private String coveruseremployeeno;
	@JsonProperty("coverUserName")
	private String coverusername;
	@JsonProperty("baseAmount")
	private String baseamount;
	@JsonProperty("coverUserCode")
	private String coverusercode;
	@JsonProperty("subsidiaryName")
	private String subsidiaryname;
	@JsonProperty("approvedBaseAmount")
	private String approvedbaseamount;
	@JsonProperty("departmentBusinessCode")
	private String departmentbusinesscode;
	@JsonProperty("subsidiaryCode")
	private String subsidiarycode;
	private double ratio;

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentheircode(String departmentheircode) {
		this.departmentheircode = departmentheircode;
	}

	public String getDepartmentheircode() {
		return departmentheircode;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}

	public String getDepartmentcode() {
		return departmentcode;
	}

	public void setCoveruseremployeeno(String coveruseremployeeno) {
		this.coveruseremployeeno = coveruseremployeeno;
	}

	public String getCoveruseremployeeno() {
		return coveruseremployeeno;
	}

	public void setCoverusername(String coverusername) {
		this.coverusername = coverusername;
	}

	public String getCoverusername() {
		return coverusername;
	}

	public void setBaseamount(String baseamount) {
		this.baseamount = baseamount;
	}

	public String getBaseamount() {
		return baseamount;
	}

	public void setCoverusercode(String coverusercode) {
		this.coverusercode = coverusercode;
	}

	public String getCoverusercode() {
		return coverusercode;
	}

	public void setSubsidiaryname(String subsidiaryname) {
		this.subsidiaryname = subsidiaryname;
	}

	public String getSubsidiaryname() {
		return subsidiaryname;
	}

	public void setApprovedbaseamount(String approvedbaseamount) {
		this.approvedbaseamount = approvedbaseamount;
	}

	public String getApprovedbaseamount() {
		return approvedbaseamount;
	}

	public void setDepartmentbusinesscode(String departmentbusinesscode) {
		this.departmentbusinesscode = departmentbusinesscode;
	}

	public String getDepartmentbusinesscode() {
		return departmentbusinesscode;
	}

	public void setSubsidiarycode(String subsidiarycode) {
		this.subsidiarycode = subsidiarycode;
	}

	public String getSubsidiarycode() {
		return subsidiarycode;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public double getRatio() {
		return ratio;
	}

}