package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;

public class Attendees implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String attendeesType;

	private String attendeesName;

	private String attendeesEmployeeId;

	private String attendeesDepartment;

	private String attendeesHolder;

	private String attendeesCompanyName;

	public String getAttendeesType() {
		return attendeesType;
	}

	public void setAttendeesType(String attendeesType) {
		this.attendeesType = attendeesType;
	}

	public String getAttendeesName() {
		return attendeesName;
	}

	public void setAttendeesName(String attendeesName) {
		this.attendeesName = attendeesName;
	}

	public String getAttendeesEmployeeId() {
		return attendeesEmployeeId;
	}

	public void setAttendeesEmployeeId(String attendeesEmployeeId) {
		this.attendeesEmployeeId = attendeesEmployeeId;
	}

	public String getAttendeesDepartment() {
		return attendeesDepartment;
	}

	public void setAttendeesDepartment(String attendeesDepartment) {
		this.attendeesDepartment = attendeesDepartment;
	}

	public String getAttendeesHolder() {
		return attendeesHolder;
	}

	public void setAttendeesHolder(String attendeesHolder) {
		this.attendeesHolder = attendeesHolder;
	}

	public String getAttendeesCompanyName() {
		return attendeesCompanyName;
	}

	public void setAttendeesCompanyName(String attendeesCompanyName) {
		this.attendeesCompanyName = attendeesCompanyName;
	}

}
