package com.yycoin.vo.product;

public class TCenterStorageRalation {
	private String id;

	private String depotpartid;

	private String storageid;

	private String productid;

	private String locationid;

	private String pricekey;

	private Integer amount;

	private Double price;

	private Double lastprice;

	private String stafferid;

	private Double inputrate;

	private Double virtualprice;

	private String virtualpricekey;

	private String changetime;

	private String productname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getDepotpartid() {
		return depotpartid;
	}

	public void setDepotpartid(String depotpartid) {
		this.depotpartid = depotpartid == null ? null : depotpartid.trim();
	}

	public String getStorageid() {
		return storageid;
	}

	public void setStorageid(String storageid) {
		this.storageid = storageid == null ? null : storageid.trim();
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid == null ? null : productid.trim();
	}

	public String getLocationid() {
		return locationid;
	}

	public void setLocationid(String locationid) {
		this.locationid = locationid == null ? null : locationid.trim();
	}

	public String getPricekey() {
		return pricekey;
	}

	public void setPricekey(String pricekey) {
		this.pricekey = pricekey == null ? null : pricekey.trim();
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getLastprice() {
		return lastprice;
	}

	public void setLastprice(Double lastprice) {
		this.lastprice = lastprice;
	}

	public String getStafferid() {
		return stafferid;
	}

	public void setStafferid(String stafferid) {
		this.stafferid = stafferid == null ? null : stafferid.trim();
	}

	public Double getInputrate() {
		return inputrate;
	}

	public void setInputrate(Double inputrate) {
		this.inputrate = inputrate;
	}

	public Double getVirtualprice() {
		return virtualprice;
	}

	public void setVirtualprice(Double virtualprice) {
		this.virtualprice = virtualprice;
	}

	public String getVirtualpricekey() {
		return virtualpricekey;
	}

	public void setVirtualpricekey(String virtualpricekey) {
		this.virtualpricekey = virtualpricekey == null ? null : virtualpricekey.trim();
	}

	public String getChangetime() {
		return changetime;
	}

	public void setChangetime(String changetime) {
		this.changetime = changetime;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

}