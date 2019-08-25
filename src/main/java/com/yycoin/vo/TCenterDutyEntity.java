package com.yycoin.vo;

public class TCenterDutyEntity {
    private String id;

    private String name;

    private Integer type;

    private String icp;

    private String description;

    private Integer dues;

    private Integer mtype;

    private Integer showtype;

    private String invoicer;

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

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp == null ? null : icp.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getDues() {
        return dues;
    }

    public void setDues(Integer dues) {
        this.dues = dues;
    }

    public Integer getMtype() {
        return mtype;
    }

    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    public Integer getShowtype() {
        return showtype;
    }

    public void setShowtype(Integer showtype) {
        this.showtype = showtype;
    }

    public String getInvoicer() {
        return invoicer;
    }

    public void setInvoicer(String invoicer) {
        this.invoicer = invoicer == null ? null : invoicer.trim();
    }
}