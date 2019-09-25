package com.sf.integration.expressservice.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RouteResponse {

	private String mailno;

	private List<Route> route;

	public String getMailno() {
		return mailno;
	}

	@XmlAttribute(name = "mailno")
	public void setMailno(String mailno) {
		this.mailno = mailno;
	}

	public List<Route> getRoute() {
		return route;
	}

	@XmlElement(name = "Route")
	public void setRoute(List<Route> route) {
		this.route = route;
	}

}
