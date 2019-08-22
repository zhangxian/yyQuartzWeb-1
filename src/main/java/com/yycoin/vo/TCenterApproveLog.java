package com.yycoin.vo;

public class TCenterApproveLog {
    private Integer id;

    private String fullid;

    private String actor;

    private Integer oprmode;

    private Integer opramount;

    private Integer prestatus;

    private Integer afterstatus;

    private String logtime;

    private String description;

    private String actorid;

    private String reserved1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullid() {
        return fullid;
    }

    public void setFullid(String fullid) {
        this.fullid = fullid == null ? null : fullid.trim();
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public Integer getOprmode() {
        return oprmode;
    }

    public void setOprmode(Integer oprmode) {
        this.oprmode = oprmode;
    }

    public Integer getOpramount() {
        return opramount;
    }

    public void setOpramount(Integer opramount) {
        this.opramount = opramount;
    }

    public Integer getPrestatus() {
        return prestatus;
    }

    public void setPrestatus(Integer prestatus) {
        this.prestatus = prestatus;
    }

    public Integer getAfterstatus() {
        return afterstatus;
    }

    public void setAfterstatus(Integer afterstatus) {
        this.afterstatus = afterstatus;
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

    public String getActorid() {
        return actorid;
    }

    public void setActorid(String actorid) {
        this.actorid = actorid == null ? null : actorid.trim();
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }
}