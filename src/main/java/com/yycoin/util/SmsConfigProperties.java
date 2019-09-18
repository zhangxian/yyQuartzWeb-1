package com.yycoin.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sms.alibaba")
@PropertySource(value = "smsconfig.properties")
public class SmsConfigProperties {

	private String url;

	private String context;

	private String method;

	private String appcode;

	private String akid;

	private String aksecret;

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
