package com.yycoin.pojo.maycur.expense.detail.resp;

import java.io.Serializable;

public class ExternalFormLinks implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String externalFormTypeName;

	private String title;

	private String formCode;

	private String link;

	private String comment;

	public String getExternalFormTypeName() {
		return externalFormTypeName;
	}

	public void setExternalFormTypeName(String externalFormTypeName) {
		this.externalFormTypeName = externalFormTypeName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFormCode() {
		return formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
