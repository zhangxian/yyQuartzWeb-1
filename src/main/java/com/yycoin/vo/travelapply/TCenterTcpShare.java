package com.yycoin.vo.travelapply;

public class TCenterTcpShare {
    private String id;

    private String refid;

    private String budgetid;

    private String departmentid;

    private String approverid;

    private Integer ratio;

    private Long realmonery;

    private String bearid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRefid() {
        return refid;
    }

    public void setRefid(String refid) {
        this.refid = refid == null ? null : refid.trim();
    }

    public String getBudgetid() {
        return budgetid;
    }

    public void setBudgetid(String budgetid) {
        this.budgetid = budgetid == null ? null : budgetid.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getApproverid() {
        return approverid;
    }

    public void setApproverid(String approverid) {
        this.approverid = approverid == null ? null : approverid.trim();
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public Long getRealmonery() {
        return realmonery;
    }

    public void setRealmonery(Long realmonery) {
        this.realmonery = realmonery;
    }

    public String getBearid() {
        return bearid;
    }

    public void setBearid(String bearid) {
        this.bearid = bearid == null ? null : bearid.trim();
    }
}