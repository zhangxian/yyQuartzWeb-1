package com.yycoin.vo;

public class TCenterGroup {
    private String id;

    private String name;

    private Integer type;

    private String stafferid;

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

    public String getStafferid() {
        return stafferid;
    }

    public void setStafferid(String stafferid) {
        this.stafferid = stafferid == null ? null : stafferid.trim();
    }
}