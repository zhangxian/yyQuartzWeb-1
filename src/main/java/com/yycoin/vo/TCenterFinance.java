package com.yycoin.vo;

import java.util.List;

public class TCenterFinance {
    private String id;

    private String name;

    private Integer type;

    private Integer createtype;

    private Integer status;

    private Integer updateflag;

    private String dutyid;

    private String refid;

    private String refout;

    private String refbill;

    private String refstock;

    private String createrid;

    private Long inmoney;

    private Long outmoney;

    private String checks;

    private String description;

    private String financedate;

    private String logtime;

    private Integer locks;

    private Integer monthindex;

    private String refchecks;
    
    private List<TCenterFinanceItem> itemList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCreatetype() {
        return createtype;
    }

    public void setCreatetype(Integer createtype) {
        this.createtype = createtype;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUpdateflag() {
        return updateflag;
    }

    public void setUpdateflag(Integer updateflag) {
        this.updateflag = updateflag;
    }

    public String getDutyid() {
        return dutyid;
    }

    public void setDutyid(String dutyid) {
        this.dutyid = dutyid == null ? null : dutyid.trim();
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid == null ? null : refid.trim();
    }

    public String getRefout() {
        return refout;
    }

    public void setRefout(String refout) {
        this.refout = refout == null ? null : refout.trim();
    }

    public String getRefbill() {
        return refbill;
    }

    public void setRefbill(String refbill) {
        this.refbill = refbill == null ? null : refbill.trim();
    }

    public String getRefstock() {
        return refstock;
    }

    public void setRefstock(String refstock) {
        this.refstock = refstock == null ? null : refstock.trim();
    }

    public String getCreaterid() {
        return createrid;
    }

    public void setCreaterid(String createrid) {
        this.createrid = createrid == null ? null : createrid.trim();
    }

    public Long getInmoney() {
        return inmoney;
    }

    public void setInmoney(Long inmoney) {
        this.inmoney = inmoney;
    }

    public Long getOutmoney() {
        return outmoney;
    }

    public void setOutmoney(Long outmoney) {
        this.outmoney = outmoney;
    }

    public String getChecks() {
        return checks;
    }

    public void setChecks(String checks) {
        this.checks = checks == null ? null : checks.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFinancedate() {
        return financedate;
    }

    public void setFinancedate(String financedate) {
        this.financedate = financedate == null ? null : financedate.trim();
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime == null ? null : logtime.trim();
    }

    public Integer getLocks() {
        return locks;
    }

    public void setLocks(Integer locks) {
        this.locks = locks;
    }

    public Integer getMonthindex() {
        return monthindex;
    }

    public void setMonthindex(Integer monthindex) {
        this.monthindex = monthindex;
    }

    public String getRefchecks() {
        return refchecks;
    }

    public void setRefchecks(String refchecks) {
        this.refchecks = refchecks == null ? null : refchecks.trim();
    }

	public List<TCenterFinanceItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<TCenterFinanceItem> itemList) {
		this.itemList = itemList;
	}
 
}