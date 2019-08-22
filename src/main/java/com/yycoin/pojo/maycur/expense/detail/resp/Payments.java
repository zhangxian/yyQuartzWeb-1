package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Payments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String report_id;

	private String report_type;

	private String collectionCurrency;

	private String collection_account;

	private String collection_account_name;

	private String collectionBankProvince;

	private String collectionBankCity;

	private String collectionBankBranchNO;

	private String pay_amount;

	public String getReport_id() {
		return report_id;
	}

	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}

	public String getReport_type() {
		return report_type;
	}

	public void setReport_type(String report_type) {
		this.report_type = report_type;
	}

	public String getCollectionCurrency() {
		return collectionCurrency;
	}

	public void setCollectionCurrency(String collectionCurrency) {
		this.collectionCurrency = collectionCurrency;
	}

	public String getCollection_account() {
		return collection_account;
	}

	public void setCollection_account(String collection_account) {
		this.collection_account = collection_account;
	}

	public String getCollection_account_name() {
		return collection_account_name;
	}

	public void setCollection_account_name(String collection_account_name) {
		this.collection_account_name = collection_account_name;
	}

	public String getCollectionBankProvince() {
		return collectionBankProvince;
	}

	public void setCollectionBankProvince(String collectionBankProvince) {
		this.collectionBankProvince = collectionBankProvince;
	}

	public String getCollectionBankCity() {
		return collectionBankCity;
	}

	public void setCollectionBankCity(String collectionBankCity) {
		this.collectionBankCity = collectionBankCity;
	}

	public String getCollectionBankBranchNO() {
		return collectionBankBranchNO;
	}

	public void setCollectionBankBranchNO(String collectionBankBranchNO) {
		this.collectionBankBranchNO = collectionBankBranchNO;
	}

	public String getPay_amount() {
		return pay_amount;
	}

	public void setPay_amount(String pay_amount) {
		this.pay_amount = pay_amount;
	}

}