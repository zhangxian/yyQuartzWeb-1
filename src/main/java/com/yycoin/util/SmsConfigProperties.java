package com.yycoin.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sms.alibaba")
public class SmsConfigProperties {

	@Value("url")
	private String url;

	@Value("context")
	private String context;

	@Value("method")
	private String method;

	@Value("appcode")
	private String appcode;

	@Value("akid")
	private String akid;

	@Value("aksecret")
	private String aksecret;

	@Value("smshost")
	private String smshost;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getAppcode() {
		return appcode;
	}

	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}

	public String getAkid() {
		return akid;
	}

	public void setAkid(String akid) {
		this.akid = akid;
	}

	public String getAksecret() {
		return aksecret;
	}

	public void setAksecret(String aksecret) {
		this.aksecret = aksecret;
	}

	public String getSmshost() {
		return smshost;
	}

	public void setSmshost(String smshost) {
		this.smshost = smshost;
	}

}
