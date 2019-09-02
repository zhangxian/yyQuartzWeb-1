package com.yycoin.pojo.maycur.repayment.detail.resp;

import java.io.Serializable;

public class Attachments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileUrl;

	private String fileName;

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
