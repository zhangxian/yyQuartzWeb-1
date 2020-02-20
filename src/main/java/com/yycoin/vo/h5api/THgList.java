package com.yycoin.vo.h5api;

public class THgList {
    private Integer id;

    private String transportno;

    private String province;

    private String city;

    private String county;

    private String address;

    private String fromer;

    private String mobile;

    private String discription;

    private String estimateid;

    private String productdis;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransportno() {
        return transportno;
    }

    public void setTransportno(String transportno) {
        this.transportno = transportno == null ? null : transportno.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFromer() {
        return fromer;
    }

    public void setFromer(String fromer) {
        this.fromer = fromer == null ? null : fromer.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription == null ? null : discription.trim();
    }

    public String getEstimateid() {
        return estimateid;
    }

    public void setEstimateid(String estimateid) {
        this.estimateid = estimateid == null ? null : estimateid.trim();
    }

    public String getProductdis() {
        return productdis;
    }

    public void setProductdis(String productdis) {
        this.productdis = productdis == null ? null : productdis.trim();
    }
}