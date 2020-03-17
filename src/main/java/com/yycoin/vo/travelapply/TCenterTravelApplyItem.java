package com.yycoin.vo.travelapply;

public class TCenterTravelApplyItem {
    private String id;

    private String parentid;

    private String begindate;

    private String enddate;

    private String feeitemid;

    private String purpose;

    private Long moneys;

    private String description;

    private String productname;

    private Integer amount;

    private Long prices;

    private Long checkprices;

    private String feestafferid;

    private String budgetid;

    private Long cmoneys;

    private String uportalstatus;

    private String maycurPayname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
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

    public String getFeeitemid() {
        return feeitemid;
    }

    public void setFeeitemid(String feeitemid) {
        this.feeitemid = feeitemid == null ? null : feeitemid.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public Long getMoneys() {
        return moneys;
    }

    public void setMoneys(Long moneys) {
        this.moneys = moneys;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Long getPrices() {
        return prices;
    }

    public void setPrices(Long prices) {
        this.prices = prices;
    }

    public Long getCheckprices() {
        return checkprices;
    }

    public void setCheckprices(Long checkprices) {
        this.checkprices = checkprices;
    }

    public String getFeestafferid() {
        return feestafferid;
    }

    public void setFeestafferid(String feestafferid) {
        this.feestafferid = feestafferid == null ? null : feestafferid.trim();
    }

    public String getBudgetid() {
        return budgetid;
    }

    public void setBudgetid(String budgetid) {
        this.budgetid = budgetid == null ? null : budgetid.trim();
    }

    public Long getCmoneys() {
        return cmoneys;
    }

    public void setCmoneys(Long cmoneys) {
        this.cmoneys = cmoneys;
    }

    public String getUportalstatus() {
        return uportalstatus;
    }

    public void setUportalstatus(String uportalstatus) {
        this.uportalstatus = uportalstatus == null ? null : uportalstatus.trim();
    }

    public String getMaycurPayname() {
        return maycurPayname;
    }

    public void setMaycurPayname(String maycurPayname) {
        this.maycurPayname = maycurPayname == null ? null : maycurPayname.trim();
    }
}