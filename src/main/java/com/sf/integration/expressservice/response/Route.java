package com.sf.integration.expressservice.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Route {

	private String remark;

	private String accept_time;

	private String accept_address;

	private String opcode;

	public String getRemark() {
		return remark;
	}

	@XmlAttribute(name = "remark")
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAccept_time() {
		return accept_time;
	}

	@XmlAttribute(name = "accept_time")
	public void setAccept_time(String accept_time) {
		this.accept_time = accept_time;
	}

	public String getAccept_address() {
		return accept_address;
	}

	@XmlAttribute(name = "accept_address")
	public void setAccept_address(String accept_address) {
		this.accept_address = accept_address;
	}

	public String getOpcode() {
		return opcode;
	}

	@XmlAttribute(name = "opcode")
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}

}
