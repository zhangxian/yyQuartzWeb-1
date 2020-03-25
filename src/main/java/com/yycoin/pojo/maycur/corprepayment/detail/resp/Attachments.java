package com.yycoin.pojo.maycur.corprepayment.detail.resp;

import java.io.Serializable;

public class Attachments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileDownloadUrl;

	private String fileUrl;

	private String fileName;

	public String getFileDownloadUrl() {
		return fileDownloadUrl;
	}

	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

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
