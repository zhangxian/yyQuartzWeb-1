package com.yycoin.vo;

public class MayCurRepaymentDetailRootWithBLOBs extends MayCurRepaymentDetailRoot {
    private String approvalProcess;

    private String repayments;

    private String costtrackings;

    private String operationlogs;

    private String attachments;

    public String getApprovalProcess() {
        return approvalProcess;
    }

    public void setApprovalProcess(String approvalProcess) {
        this.approvalProcess = approvalProcess == null ? null : approvalProcess.trim();
    }

    public String getRepayments() {
        return repayments;
    }

    public void setRepayments(String repayments) {
        this.repayments = repayments == null ? null : repayments.trim();
    }

    public String getCosttrackings() {
        return costtrackings;
    }

    public void setCosttrackings(String costtrackings) {
        this.costtrackings = costtrackings == null ? null : costtrackings.trim();
    }

    public String getOperationlogs() {
        return operationlogs;
    }

    public void setOperationlogs(String operationlogs) {
        this.operationlogs = operationlogs == null ? null : operationlogs.trim();
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments == null ? null : attachments.trim();
    }
}