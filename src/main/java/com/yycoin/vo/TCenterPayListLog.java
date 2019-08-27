package com.yycoin.vo;

import java.math.BigDecimal;

public class TCenterPayListLog {
    private String id;

    private String outid;

    private String type;

    private String bankname;

    private String username;

    private String bankno;

    private BigDecimal money;

    private String province;

    private String city;

    private String description;

    private String outidtime;

    private String status;

    private String outbillid;

    private String operator;

    private String operatorid;

    private String paytime;

    private String payaccount;

    private String paybank;

    private String paybankid;

    private String bankstatus;

    private String bankpaytime;

    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOutid() {
        return outid;
    }

    public void setOutid(String outid) {
        this.outid = outid == null ? null : outid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno == null ? null : bankno.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOutidtime() {
        return outidtime;
    }

    public void setOutidtime(String outidtime) {
        this.outidtime = outidtime == null ? null : outidtime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOutbillid() {
        return outbillid;
    }

    public void setOutbillid(String outbillid) {
        this.outbillid = outbillid == null ? null : outbillid.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid == null ? null : operatorid.trim();
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime == null ? null : paytime.trim();
    }

    public String getPayaccount() {
        return payaccount;
    }

    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount == null ? null : payaccount.trim();
    }

    public String getPaybank() {
        return paybank;
    }

    public void setPaybank(String paybank) {
        this.paybank = paybank == null ? null : paybank.trim();
    }

    public String getPaybankid() {
        return paybankid;
    }

    public void setPaybankid(String paybankid) {
        this.paybankid = paybankid == null ? null : paybankid.trim();
    }

    public String getBankstatus() {
        return bankstatus;
    }

    public void setBankstatus(String bankstatus) {
        this.bankstatus = bankstatus == null ? null : bankstatus.trim();
    }

    public String getBankpaytime() {
        return bankpaytime;
    }

    public void setBankpaytime(String bankpaytime) {
        this.bankpaytime = bankpaytime == null ? null : bankpaytime.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}