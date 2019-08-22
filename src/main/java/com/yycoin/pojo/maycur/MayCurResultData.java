package com.yycoin.pojo.maycur;

import java.io.Serializable;

public class MayCurResultData<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String success;

	private String message;

	private boolean lastPage;

	private String code;

	private T data;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isLastPage() {
		return lastPage;
	}

	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "MayCurResultData [success=" + success + ", message=" + message + ", lastPage=" + lastPage + ", code="
				+ code + ", data=" + data + "]";
	}

}
