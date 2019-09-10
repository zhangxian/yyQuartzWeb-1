package com.yycoin.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "maycur")
@PropertySource(value = "classpath:maycurconfig.properties")
public class MayCurConfigProperties {

	private String host;

	private String code;

	private String secret;

	private String authapi;

	private String expensesubmit;

	private String expensedetail;

	private String expenseexport;

	private String consumesubmit;

	private String consumedetail;

	private String consumeexport;

	private String paymentupdate;

	private String repaymentsubmit;

	private String repaymentdetail;

	private String repaymentexport;

	private String queryemployee;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getAuthapi() {
		return authapi;
	}

	public void setAuthapi(String authapi) {
		this.authapi = authapi;
	}

	public String getExpensesubmit() {
		return expensesubmit;
	}

	public void setExpensesubmit(String expensesubmit) {
		this.expensesubmit = expensesubmit;
	}

	public String getExpensedetail() {
		return expensedetail;
	}

	public void setExpensedetail(String expensedetail) {
		this.expensedetail = expensedetail;
	}

	public String getExpenseexport() {
		return expenseexport;
	}

	public void setExpenseexport(String expenseexport) {
		this.expenseexport = expenseexport;
	}

	public String getConsumesubmit() {
		return consumesubmit;
	}

	public void setConsumesubmit(String consumesubmit) {
		this.consumesubmit = consumesubmit;
	}

	public String getConsumedetail() {
		return consumedetail;
	}

	public void setConsumedetail(String consumedetail) {
		this.consumedetail = consumedetail;
	}

	public String getConsumeexport() {
		return consumeexport;
	}

	public void setConsumeexport(String consumeexport) {
		this.consumeexport = consumeexport;
	}

	public String getPaymentupdate() {
		return paymentupdate;
	}

	public void setPaymentupdate(String paymentupdate) {
		this.paymentupdate = paymentupdate;
	}

	public String getRepaymentsubmit() {
		return repaymentsubmit;
	}

	public void setRepaymentsubmit(String repaymentsubmit) {
		this.repaymentsubmit = repaymentsubmit;
	}

	public String getRepaymentdetail() {
		return repaymentdetail;
	}

	public void setRepaymentdetail(String repaymentdetail) {
		this.repaymentdetail = repaymentdetail;
	}

	public String getRepaymentexport() {
		return repaymentexport;
	}

	public void setRepaymentexport(String repaymentexport) {
		this.repaymentexport = repaymentexport;
	}

	public String getQueryemployee() {
		return queryemployee;
	}

	public void setQueryemployee(String queryemployee) {
		this.queryemployee = queryemployee;
	}

}
