package com.yycoin.vo.product;

import java.math.BigDecimal;

public class TCenterProductArAccount {
    private String idKey;

    private String productid;

    private String productname;

    private BigDecimal price;

    private BigDecimal virtualPrice;

    private Integer totalAmount;

    private Integer amount;

    private Integer dateMargin;

    private String changeTime;

    private String createTime;

    public String getIdKey() {
        return idKey;
    }

    public void setIdKey(String idKey) {
        this.idKey = idKey == null ? null : idKey.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVirtualPrice() {
        return virtualPrice;
    }

    public void setVirtualPrice(BigDecimal virtualPrice) {
        this.virtualPrice = virtualPrice;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getDateMargin() {
        return dateMargin;
    }

    public void setDateMargin(Integer dateMargin) {
        this.dateMargin = dateMargin;
    }

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime == null ? null : changeTime.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}