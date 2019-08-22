package com.yycoin.vo;

public class TCenterOutBill {
    private String id;

    private Integer type;

    private Integer paytype;

    private Integer ulock;

    private String bankid;

    private String stockid;

    private String stockitemid;

    private Integer status;

    private Double moneys;

    private String provideid;

    private String stafferid;

    private String invoiceid;

    private String ownerid;

    private String locationid;

    private String destbankid;

    private String refbillid;

    private String logtime;

    private String description;

    private String checks;

    private Integer checkstatus;

    private Double srcmoneys;

    private Integer updateid;

    private Integer createtype;

    private Integer mtype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getUlock() {
        return ulock;
    }

    public void setUlock(Integer ulock) {
        this.ulock = ulock;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getStockid() {
        return stockid;
    }

    public void setStockid(String stockid) {
        this.stockid = stockid == null ? null : stockid.trim();
    }

    public String getStockitemid() {
        return stockitemid;
    }

    public void setStockitemid(String stockitemid) {
        this.stockitemid = stockitemid == null ? null : stockitemid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getMoneys() {
        return moneys;
    }

    public void setMoneys(Double moneys) {
        this.moneys = moneys;
    }

    public String getProvideid() {
        return provideid;
    }

    public void setProvideid(String provideid) {
        this.provideid = provideid == null ? null : provideid.trim();
    }

    public String getStafferid() {
        return stafferid;
    }

    public void setStafferid(String stafferid) {
        this.stafferid = stafferid == null ? null : stafferid.trim();
    }

    public String getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid == null ? null : invoiceid.trim();
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid == null ? null : ownerid.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getDestbankid() {
        return destbankid;
    }

    public void setDestbankid(String destbankid) {
        this.destbankid = destbankid == null ? null : destbankid.trim();
    }

    public String getRefbillid() {
        return refbillid;
    }

    public void setRefbillid(String refbillid) {
        this.refbillid = refbillid == null ? null : refbillid.trim();
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime == null ? null : logtime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getChecks() {
        return checks;
    }

    public void setChecks(String checks) {
        this.checks = checks == null ? null : checks.trim();
    }

    public Integer getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    public Double getSrcmoneys() {
        return srcmoneys;
    }

    public void setSrcmoneys(Double srcmoneys) {
        this.srcmoneys = srcmoneys;
    }

    public Integer getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Integer updateid) {
        this.updateid = updateid;
    }

    public Integer getCreatetype() {
        return createtype;
    }

    public void setCreatetype(Integer createtype) {
        this.createtype = createtype;
    }

    public Integer getMtype() {
        return mtype;
    }

    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }
}