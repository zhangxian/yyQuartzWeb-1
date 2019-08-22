package com.yycoin.vo.travelapply;

public class TCenterTcpApply {
    private String id;

    private String applyid;

    private String name;

    private String flowkey;

    private String applyerid;

    private Integer type;

    private Integer status;

    private Long total;

    private String departmentid;

    private String logtime;

    private String description;

    private Integer stype;

    private Integer paytype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getApplyid() {
        return applyid;
    }

    public void setApplyid(String applyid) {
        this.applyid = applyid == null ? null : applyid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFlowkey() {
        return flowkey;
    }

    public void setFlowkey(String flowkey) {
        this.flowkey = flowkey == null ? null : flowkey.trim();
    }

    public String getApplyerid() {
        return applyerid;
    }

    public void setApplyerid(String applyerid) {
        this.applyerid = applyerid == null ? null : applyerid.trim();
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
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

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }
}