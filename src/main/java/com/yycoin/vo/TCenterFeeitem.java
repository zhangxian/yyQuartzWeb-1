package com.yycoin.vo;

public class TCenterFeeitem {
    private String id;

    private String name;

    private String taxid;

    private Integer type;

    private String taxid2;

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

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid == null ? null : taxid.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTaxid2() {
        return taxid2;
    }

    public void setTaxid2(String taxid2) {
        this.taxid2 = taxid2 == null ? null : taxid2.trim();
    }
}