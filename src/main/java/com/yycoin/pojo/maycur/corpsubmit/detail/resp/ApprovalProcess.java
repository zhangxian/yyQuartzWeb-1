package com.yycoin.pojo.maycur.corpsubmit.detail.resp;

import java.io.Serializable;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class ApprovalProcess implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String user_code;

	private String user_name;

	private long approval_time;

	private String taskName;

	private String approvalComment;

	private String taskCategory;

	public String getUser_code() {
		return user_code;
	}

	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public long getApproval_time() {
		return approval_time;
	}

	public void setApproval_time(long approval_time) {
		this.approval_time = approval_time;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getApprovalComment() {
		return approvalComment;
	}

	public void setApprovalComment(String approvalComment) {
		this.approvalComment = approvalComment;
	}

	public String getTaskCategory() {
		return taskCategory;
	}

	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}

}