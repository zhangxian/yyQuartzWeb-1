package com.yycoin.vo;

public class MayCurCorpRepaymentDetailRootWithBLOBs extends MayCurCorpRepaymentDetailRoot {
    private String corprepaymentdetails;

    private String corpsupplier;

    private String approvalProcess;

    private String operationlogs;

    private String payments;

    private String attachments;

    public String getCorprepaymentdetails() {
        return corprepaymentdetails;
    }

    public void setCorprepaymentdetails(String corprepaymentdetails) {
        this.corprepaymentdetails = corprepaymentdetails == null ? null : corprepaymentdetails.trim();
    }

    public String getCorpsupplier() {
        return corpsupplier;
    }

    public void setCorpsupplier(String corpsupplier) {
        this.corpsupplier = corpsupplier == null ? null : corpsupplier.trim();
    }

    public String getApprovalProcess() {
        return approvalProcess;
    }

    public void setApprovalProcess(String approvalProcess) {
        this.approvalProcess = approvalProcess == null ? null : approvalProcess.trim();
    }

    public String getOperationlogs() {
        return operationlogs;
    }

    public void setOperationlogs(String operationlogs) {
        this.operationlogs = operationlogs == null ? null : operationlogs.trim();
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments == null ? null : payments.trim();
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments == null ? null : attachments.trim();
    }
}