package com.yycoin.pojo.maycur.corpsubmit.detail.resp;

import java.io.Serializable;
import java.util.List;

/**
 * Auto-generated: 2019-08-12 11:14:16
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Expenses implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String expense_type;

	private String expense_type_name;

	private String expense_type_parent_name;

	private String amount_base;

	private String amount_original;

	private String amount_approved;

	private String baseAmount;

	private String baseApprovedAmount;

	private String tax_rate;

	private String tax_amount;

	private String tax_code;

	private String deduction_amount;

	private String transferred_amount;

	private String deductionFlag;

	private String is_booking;

	private String baseCurrency;

	private String collBaseExchangeRate;

	private String comments;

	private String exchange_date;

	private String currentPaymentAmount;

	private String taxAccountingSubjectBizCode;

	private String taxAccountingSubjectFullName;

	private String transferTaxAccountingSubjectBizCode;

	private String transferTaxAccountingSubjectFullName;

	private String taxAccountingSubjectCashFlowCode;

	private String taxAccountingSubjectCashFlowName;

	private String taxAccountingSubjectTransferCashFlowCode;

	private String taxAccountingSubjectTransferCashFlowName;

	private List<CostTrackings> costTrackings;

	private List<Correlation> correlation;

	private List<ExpenseAllocations> expenseAllocations;

	private List<InvoiceList> invoiceList;

	private List<CorpDeductions> corpDeductions;

	public String getCurrentPaymentAmount() {
		return currentPaymentAmount;
	}

	public void setCurrentPaymentAmount(String currentPaymentAmount) {
		this.currentPaymentAmount = currentPaymentAmount;
	}

	public String getExchange_date() {
		return exchange_date;
	}

	public void setExchange_date(String exchange_date) {
		this.exchange_date = exchange_date;
	}

	public String getExpense_type() {
		return expense_type;
	}

	public void setExpense_type(String expense_type) {
		this.expense_type = expense_type;
	}

	public String getExpense_type_name() {
		return expense_type_name;
	}

	public void setExpense_type_name(String expense_type_name) {
		this.expense_type_name = expense_type_name;
	}

	public String getExpense_type_parent_name() {
		return expense_type_parent_name;
	}

	public void setExpense_type_parent_name(String expense_type_parent_name) {
		this.expense_type_parent_name = expense_type_parent_name;
	}

	public String getAmount_base() {
		return amount_base;
	}

	public void setAmount_base(String amount_base) {
		this.amount_base = amount_base;
	}

	public String getAmount_original() {
		return amount_original;
	}

	public void setAmount_original(String amount_original) {
		this.amount_original = amount_original;
	}

	public String getAmount_approved() {
		return amount_approved;
	}

	public void setAmount_approved(String amount_approved) {
		this.amount_approved = amount_approved;
	}

	public String getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}

	public String getBaseApprovedAmount() {
		return baseApprovedAmount;
	}

	public void setBaseApprovedAmount(String baseApprovedAmount) {
		this.baseApprovedAmount = baseApprovedAmount;
	}

	public String getTax_rate() {
		return tax_rate;
	}

	public void setTax_rate(String tax_rate) {
		this.tax_rate = tax_rate;
	}

	public String getTax_amount() {
		return tax_amount;
	}

	public void setTax_amount(String tax_amount) {
		this.tax_amount = tax_amount;
	}

	public String getTax_code() {
		return tax_code;
	}

	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}

	public String getDeduction_amount() {
		return deduction_amount;
	}

	public void setDeduction_amount(String deduction_amount) {
		this.deduction_amount = deduction_amount;
	}

	public String getTransferred_amount() {
		return transferred_amount;
	}

	public void setTransferred_amount(String transferred_amount) {
		this.transferred_amount = transferred_amount;
	}

	public String getDeductionFlag() {
		return deductionFlag;
	}

	public void setDeductionFlag(String deductionFlag) {
		this.deductionFlag = deductionFlag;
	}

	public String getIs_booking() {
		return is_booking;
	}

	public void setIs_booking(String is_booking) {
		this.is_booking = is_booking;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getCollBaseExchangeRate() {
		return collBaseExchangeRate;
	}

	public void setCollBaseExchangeRate(String collBaseExchangeRate) {
		this.collBaseExchangeRate = collBaseExchangeRate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getTaxAccountingSubjectBizCode() {
		return taxAccountingSubjectBizCode;
	}

	public void setTaxAccountingSubjectBizCode(String taxAccountingSubjectBizCode) {
		this.taxAccountingSubjectBizCode = taxAccountingSubjectBizCode;
	}

	public String getTaxAccountingSubjectFullName() {
		return taxAccountingSubjectFullName;
	}

	public void setTaxAccountingSubjectFullName(String taxAccountingSubjectFullName) {
		this.taxAccountingSubjectFullName = taxAccountingSubjectFullName;
	}

	public String getTransferTaxAccountingSubjectBizCode() {
		return transferTaxAccountingSubjectBizCode;
	}

	public void setTransferTaxAccountingSubjectBizCode(String transferTaxAccountingSubjectBizCode) {
		this.transferTaxAccountingSubjectBizCode = transferTaxAccountingSubjectBizCode;
	}

	public String getTransferTaxAccountingSubjectFullName() {
		return transferTaxAccountingSubjectFullName;
	}

	public void setTransferTaxAccountingSubjectFullName(String transferTaxAccountingSubjectFullName) {
		this.transferTaxAccountingSubjectFullName = transferTaxAccountingSubjectFullName;
	}

	public String getTaxAccountingSubjectCashFlowCode() {
		return taxAccountingSubjectCashFlowCode;
	}

	public void setTaxAccountingSubjectCashFlowCode(String taxAccountingSubjectCashFlowCode) {
		this.taxAccountingSubjectCashFlowCode = taxAccountingSubjectCashFlowCode;
	}

	public String getTaxAccountingSubjectCashFlowName() {
		return taxAccountingSubjectCashFlowName;
	}

	public void setTaxAccountingSubjectCashFlowName(String taxAccountingSubjectCashFlowName) {
		this.taxAccountingSubjectCashFlowName = taxAccountingSubjectCashFlowName;
	}

	public String getTaxAccountingSubjectTransferCashFlowCode() {
		return taxAccountingSubjectTransferCashFlowCode;
	}

	public void setTaxAccountingSubjectTransferCashFlowCode(String taxAccountingSubjectTransferCashFlowCode) {
		this.taxAccountingSubjectTransferCashFlowCode = taxAccountingSubjectTransferCashFlowCode;
	}

	public String getTaxAccountingSubjectTransferCashFlowName() {
		return taxAccountingSubjectTransferCashFlowName;
	}

	public void setTaxAccountingSubjectTransferCashFlowName(String taxAccountingSubjectTransferCashFlowName) {
		this.taxAccountingSubjectTransferCashFlowName = taxAccountingSubjectTransferCashFlowName;
	}

	public List<CostTrackings> getCostTrackings() {
		return costTrackings;
	}

	public void setCostTrackings(List<CostTrackings> costTrackings) {
		this.costTrackings = costTrackings;
	}

	public List<Correlation> getCorrelation() {
		return correlation;
	}

	public void setCorrelation(List<Correlation> correlation) {
		this.correlation = correlation;
	}

	public List<ExpenseAllocations> getExpenseAllocations() {
		return expenseAllocations;
	}

	public void setExpenseAllocations(List<ExpenseAllocations> expenseAllocations) {
		this.expenseAllocations = expenseAllocations;
	}

	public List<InvoiceList> getInvoiceList() {
		return invoiceList;
	}

	public void setInvoiceList(List<InvoiceList> invoiceList) {
		this.invoiceList = invoiceList;
	}

	public List<CorpDeductions> getCorpDeductions() {
		return corpDeductions;
	}

	public void setCorpDeductions(List<CorpDeductions> corpDeductions) {
		this.corpDeductions = corpDeductions;
	}

}