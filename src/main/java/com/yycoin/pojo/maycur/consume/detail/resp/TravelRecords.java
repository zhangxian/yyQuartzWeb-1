package com.yycoin.pojo.maycur.consume.detail.resp;

import java.io.Serializable;
import java.util.List;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class TravelRecords implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String begin;

	private String end;

	private String amount;

	private String approvedAmount;

	private String typeName;

	private String days;

	private String destinationName;

	private String departureName;

	private List<TravelRecordDetails> details;

	private String accompaniedEmployeeNos;

	public List<TravelRecordDetails> getDetails() {
		return details;
	}

	public void setDetails(List<TravelRecordDetails> details) {
		this.details = details;
	}

	public String getAccompaniedEmployeeNos() {
		return accompaniedEmployeeNos;
	}

	public void setAccompaniedEmployeeNos(String accompaniedEmployeeNos) {
		this.accompaniedEmployeeNos = accompaniedEmployeeNos;
	}

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
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

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDepartureName() {
		return departureName;
	}

	public void setDepartureName(String departureName) {
		this.departureName = departureName;
	}

}