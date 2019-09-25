package com.sf.integration.expressservice.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RouteResponseBody {

	private RouteResponse routeResponse;

	public RouteResponse getRouteResponse() {
		return routeResponse;
	}

	@XmlElement(name = "RouteResponse")
	public void setRouteResponse(RouteResponse routeResponse) {
		this.routeResponse = routeResponse;
	}

}
