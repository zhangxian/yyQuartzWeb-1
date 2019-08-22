package com.yycoin.vo;

public class TCenterVsGroupSta {
    private Integer id;

    private String groupid;

    private String stafferid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getStafferid() {
        return stafferid;
    }

    public void setStafferid(String stafferid) {
        this.stafferid = stafferid == null ? null : stafferid.trim();
    }
}