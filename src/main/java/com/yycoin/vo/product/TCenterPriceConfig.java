package com.yycoin.vo.product;

public class TCenterPriceConfig {
    private String id;

    private String productid;

    private Integer iswave;

    private String province;

    private Double gspriceup;

    private Double gspricedown;

    private String begindate;

    private String enddate;

    private String industryid;

    private String stafferid;

    private Double price;

    private Double minprice;

    private Integer type;

    private Integer ftype;

    private Double goldpricefactor;

    private Double silverpricefactor;

    private Double ppice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getIswave() {
        return iswave;
    }

    public void setIswave(Integer iswave) {
        this.iswave = iswave;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Double getGspriceup() {
        return gspriceup;
    }

    public void setGspriceup(Double gspriceup) {
        this.gspriceup = gspriceup;
    }

    public Double getGspricedown() {
        return gspricedown;
    }

    public void setGspricedown(Double gspricedown) {
        this.gspricedown = gspricedown;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getIndustryid() {
        return industryid;
    }

    public void setIndustryid(String industryid) {
        this.industryid = industryid == null ? null : industryid.trim();
    }

    public String getStafferid() {
        return stafferid;
    }

    public void setStafferid(String stafferid) {
        this.stafferid = stafferid == null ? null : stafferid.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMinprice() {
        return minprice;
    }

    public void setMinprice(Double minprice) {
        this.minprice = minprice;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    public Double getGoldpricefactor() {
        return goldpricefactor;
    }

    public void setGoldpricefactor(Double goldpricefactor) {
        this.goldpricefactor = goldpricefactor;
    }

    public Double getSilverpricefactor() {
        return silverpricefactor;
    }

    public void setSilverpricefactor(Double silverpricefactor) {
        this.silverpricefactor = silverpricefactor;
    }

    public Double getPpice() {
        return ppice;
    }

    public void setPpice(Double ppice) {
        this.ppice = ppice;
    }
}