package com.yycoin.vo;

public class MayCurConsumeDetailRootWithBLOBs extends MayCurConsumeDetailRoot {
    private String accompaniedemployeenos;

    private String payment;

    private String costtrackings;

    private String expenses;

    private String expense;

    private String approvalProcess;

    private String repayments;

    private String loan;

    private String travelrecords;

    private String operationlogs;

    private String attachments;

    public String getAccompaniedemployeenos() {
        return accompaniedemployeenos;
    }

    public void setAccompaniedemployeenos(String accompaniedemployeenos) {
        this.accompaniedemployeenos = accompaniedemployeenos == null ? null : accompaniedemployeenos.trim();
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

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense == null ? null : expense.trim();
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

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan == null ? null : loan.trim();
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

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments == null ? null : attachments.trim();
    }
}