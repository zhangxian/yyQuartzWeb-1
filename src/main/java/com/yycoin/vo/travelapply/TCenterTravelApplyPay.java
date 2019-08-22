package com.yycoin.vo.travelapply;

public class TCenterTravelApplyPay {
    private String id;

    private String parentid;

    private Integer receivetype;

    private String bankname;

    private String username;

    private String bankno;

    private String description;

    private String cdescription;

    private Long moneys;

    private Long cmoneys;

    private String bankprovince;

    private String bankcity;

    private String payflag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public Integer getReceivetype() {
        return receivetype;
    }

    public void setReceivetype(Integer receivetype) {
        this.receivetype = receivetype;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription == null ? null : cdescription.trim();
    }

    public Long getMoneys() {
        return moneys;
    }

    public void setMoneys(Long moneys) {
        this.moneys = moneys;
    }

    public Long getCmoneys() {
        return cmoneys;
    }

    public void setCmoneys(Long cmoneys) {
        this.cmoneys = cmoneys;
    }

    public String getBankprovince() {
        return bankprovince;
    }

    public void setBankprovince(String bankprovince) {
        this.bankprovince = bankprovince == null ? null : bankprovince.trim();
    }

    public String getBankcity() {
        return bankcity;
    }

    public void setBankcity(String bankcity) {
        this.bankcity = bankcity == null ? null : bankcity.trim();
    }

    public String getPayflag() {
        return payflag;
    }

    public void setPayflag(String payflag) {
        this.payflag = payflag == null ? null : payflag.trim();
    }
}