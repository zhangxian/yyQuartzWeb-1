package com.yycoin.vo;

import java.util.Date;

public class TMessageSyh {
    private Integer id;

    private Integer stafferid;

    private String staffername;

    private String locationid;

    private String mobile;

    private Integer bmid;

    private String bmname;

    private String ywbname;

    private Integer type;

    private Integer status;

    private Integer xl;

    private Integer mb;

    private String wcl;

    private Integer todayno;

    private Integer yestno;

    private String notxt;

    private Date logdate;

    private String superleader;

    private String dqname;

    private String superlocationid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStafferid() {
        return stafferid;
    }

    public void setStafferid(Integer stafferid) {
        this.stafferid = stafferid;
    }

    public String getStaffername() {
        return staffername;
    }

    public void setStaffername(String staffername) {
        this.staffername = staffername == null ? null : staffername.trim();
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid == null ? null : locationid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getBmid() {
        return bmid;
    }

    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }

    public String getBmname() {
        return bmname;
    }

    public void setBmname(String bmname) {
        this.bmname = bmname == null ? null : bmname.trim();
    }

    public String getYwbname() {
        return ywbname;
    }

    public void setYwbname(String ywbname) {
        this.ywbname = ywbname == null ? null : ywbname.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getXl() {
        return xl;
    }

    public void setXl(Integer xl) {
        this.xl = xl;
    }

    public Integer getMb() {
        return mb;
    }

    public void setMb(Integer mb) {
        this.mb = mb;
    }

    public String getWcl() {
        return wcl;
    }

    public void setWcl(String wcl) {
        this.wcl = wcl == null ? null : wcl.trim();
    }

    public Integer getTodayno() {
        return todayno;
    }

    public void setTodayno(Integer todayno) {
        this.todayno = todayno;
    }

    public Integer getYestno() {
        return yestno;
    }

    public void setYestno(Integer yestno) {
        this.yestno = yestno;
    }

    public String getNotxt() {
        return notxt;
    }

    public void setNotxt(String notxt) {
        this.notxt = notxt == null ? null : notxt.trim();
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getSuperleader() {
        return superleader;
    }

    public void setSuperleader(String superleader) {
        this.superleader = superleader == null ? null : superleader.trim();
    }

    public String getDqname() {
        return dqname;
    }

    public void setDqname(String dqname) {
        this.dqname = dqname == null ? null : dqname.trim();
    }

    public String getSuperlocationid() {
        return superlocationid;
    }

    public void setSuperlocationid(String superlocationid) {
        this.superlocationid = superlocationid == null ? null : superlocationid.trim();
    }
}