package com.yycoin.vo;

public class MayCurCorpDetailRootWithBLOBs extends MayCurCorpDetailRoot {
    private String payment;

    private String costtrackings;

    private String expenses;

    private String corppayments;

    private String corpsupplier;

    private String approvalProcess;

    private String operationlogs;

    private String attachments;

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getCosttrackings() {
        return costtrackings;
    }

    public void setCosttrackings(String costtrackings) {
        this.costtrackings = costtrackings == null ? null : costtrackings.trim();
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses == null ? null : expenses.trim();
    }

    public String getCorppayments() {
        return corppayments;
    }

    public void setCorppayments(String corppayments) {
        this.corppayments = corppayments == null ? null : corppayments.trim();
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

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments == null ? null : attachments.trim();
    }
}