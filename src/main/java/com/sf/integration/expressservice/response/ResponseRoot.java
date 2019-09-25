package com.sf.integration.expressservice.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Response")
public class ResponseRoot {

	private String service;

	private RouteHead routeHead;

	private RouteResponseBody body;

	public String getService() {
		return service;
	}

	@XmlAttribute(name = "service")
	public void setService(String service) {
		this.service = service;
	}

	public RouteHead getRouteHead() {
		return routeHead;
	}

	@XmlElement(name = "Head")
	public void setRouteHead(RouteHead routeHead) {
		this.routeHead = routeHead;
	}

	public RouteResponseBody getBody() {
		return body;
	}

	@XmlElement(name = "Body")
	public void setBody(RouteResponseBody body) {
		this.body = body;
	}

}
