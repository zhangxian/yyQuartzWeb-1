package com.yycoin.vo;

public class MayCurExpenseDetailRootWithBLOBs extends MayCurExpenseDetailRoot {
    private String creditrecords;

    private String externalformlinks;

    private String payment;

    private String costtrackings;

    private String expenses;

    private String approvalProcess;

    private String repayments;

    private String allowances;

    private String travelrecords;

    private String operationlogs;

    private String payments;

    private String attachments;

    public String getCreditrecords() {
        return creditrecords;
    }

    public void setCreditrecords(String creditrecords) {
        this.creditrecords = creditrecords == null ? null : creditrecords.trim();
    }

    public String getExternalformlinks() {
        return externalformlinks;
    }

    public void setExternalformlinks(String externalformlinks) {
        this.externalformlinks = externalformlinks == null ? null : externalformlinks.trim();
    }

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

    public String getAllowances() {
        return allowances;
    }

    public void setAllowances(String allowances) {
        this.allowances = allowances == null ? null : allowances.trim();
    }

    public String getTravelrecords() {
        return travelrecords;
    }

    public void setTravelrecords(String travelrecords) {
        this.travelrecords = travelrecords == null ? null : travelrecords.trim();
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