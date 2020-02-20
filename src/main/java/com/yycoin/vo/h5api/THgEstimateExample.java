package com.yycoin.vo.h5api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class THgEstimateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public THgEstimateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public int getStartRecordNum() {
        return this.startRecordNum;
    }

    public void setStartRecordNum(int startRecordNum) {
        this.startRecordNum=startRecordNum;
    }

    public int getRecordIndex() {
        return this.recordIndex;
    }

    public void setRecordIndex(int recordIndex) {
        this.recordIndex=recordIndex;
    }

    public int getNumberOfRecordsToSelect() {
        return this.numberOfRecordsToSelect;
    }

    public void setNumberOfRecordsToSelect(int numberOfRecordsToSelect) {
        this.numberOfRecordsToSelect=numberOfRecordsToSelect;
    }

    public String getSortField() {
        return this.sortField;
    }

    public void setSortField(String sortField) {
        this.sortField=sortField;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder=sortOrder;
    }

    public int getEndRecordNum() {
        return this.numberOfRecordsToSelect + this.startRecordNum;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEstimateidIsNull() {
            addCriterion("estimateid is null");
            return (Criteria) this;
        }

        public Criteria andEstimateidIsNotNull() {
            addCriterion("estimateid is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateidEqualTo(String value) {
            addCriterion("estimateid =", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotEqualTo(String value) {
            addCriterion("estimateid <>", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidGreaterThan(String value) {
            addCriterion("estimateid >", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidGreaterThanOrEqualTo(String value) {
            addCriterion("estimateid >=", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidLessThan(String value) {
            addCriterion("estimateid <", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidLessThanOrEqualTo(String value) {
            addCriterion("estimateid <=", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidLike(String value) {
            addCriterion("estimateid like", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotLike(String value) {
            addCriterion("estimateid not like", value, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidIn(List<String> values) {
            addCriterion("estimateid in", values, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotIn(List<String> values) {
            addCriterion("estimateid not in", values, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidBetween(String value1, String value2) {
            addCriterion("estimateid between", value1, value2, "estimateid");
            return (Criteria) this;
        }

        public Criteria andEstimateidNotBetween(String value1, String value2) {
            addCriterion("estimateid not between", value1, value2, "estimateid");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andYeardIsNull() {
            addCriterion("yeard is null");
            return (Criteria) this;
        }

        public Criteria andYeardIsNotNull() {
            addCriterion("yeard is not null");
            return (Criteria) this;
        }

        public Criteria andYeardEqualTo(String value) {
            addCriterion("yeard =", value, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardNotEqualTo(String value) {
            addCriterion("yeard <>", value, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardGreaterThan(String value) {
            addCriterion("yeard >", value, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardGreaterThanOrEqualTo(String value) {
            addCriterion("yeard >=", value, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardLessThan(String value) {
            addCriterion("yeard <", value, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardLessThanOrEqualTo(String value) {
            addCriterion("yeard <=", value, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardLike(String value) {
            addCriterion("yeard like", value, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardNotLike(String value) {
            addCriterion("yeard not like", value, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardIn(List<String> values) {
            addCriterion("yeard in", values, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardNotIn(List<String> values) {
            addCriterion("yeard not in", values, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardBetween(String value1, String value2) {
            addCriterion("yeard between", value1, value2, "yeard");
            return (Criteria) this;
        }

        public Criteria andYeardNotBetween(String value1, String value2) {
            addCriterion("yeard not between", value1, value2, "yeard");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andConditiondIsNull() {
            addCriterion("conditiond is null");
            return (Criteria) this;
        }

        public Criteria andConditiondIsNotNull() {
            addCriterion("conditiond is not null");
            return (Criteria) this;
        }

        public Criteria andConditiondEqualTo(String value) {
            addCriterion("conditiond =", value, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondNotEqualTo(String value) {
            addCriterion("conditiond <>", value, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondGreaterThan(String value) {
            addCriterion("conditiond >", value, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondGreaterThanOrEqualTo(String value) {
            addCriterion("conditiond >=", value, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondLessThan(String value) {
            addCriterion("conditiond <", value, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondLessThanOrEqualTo(String value) {
            addCriterion("conditiond <=", value, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondLike(String value) {
            addCriterion("conditiond like", value, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondNotLike(String value) {
            addCriterion("conditiond not like", value, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondIn(List<String> values) {
            addCriterion("conditiond in", values, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondNotIn(List<String> values) {
            addCriterion("conditiond not in", values, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondBetween(String value1, String value2) {
            addCriterion("conditiond between", value1, value2, "conditiond");
            return (Criteria) this;
        }

        public Criteria andConditiondNotBetween(String value1, String value2) {
            addCriterion("conditiond not between", value1, value2, "conditiond");
            return (Criteria) this;
        }

        public Criteria andPackagedIsNull() {
            addCriterion("packaged is null");
            return (Criteria) this;
        }

        public Criteria andPackagedIsNotNull() {
            addCriterion("packaged is not null");
            return (Criteria) this;
        }

        public Criteria andPackagedEqualTo(String value) {
            addCriterion("packaged =", value, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedNotEqualTo(String value) {
            addCriterion("packaged <>", value, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedGreaterThan(String value) {
            addCriterion("packaged >", value, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedGreaterThanOrEqualTo(String value) {
            addCriterion("packaged >=", value, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedLessThan(String value) {
            addCriterion("packaged <", value, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedLessThanOrEqualTo(String value) {
            addCriterion("packaged <=", value, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedLike(String value) {
            addCriterion("packaged like", value, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedNotLike(String value) {
            addCriterion("packaged not like", value, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedIn(List<String> values) {
            addCriterion("packaged in", values, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedNotIn(List<String> values) {
            addCriterion("packaged not in", values, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedBetween(String value1, String value2) {
            addCriterion("packaged between", value1, value2, "packaged");
            return (Criteria) this;
        }

        public Criteria andPackagedNotBetween(String value1, String value2) {
            addCriterion("packaged not between", value1, value2, "packaged");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andInvoicenameIsNull() {
            addCriterion("invoicename is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenameIsNotNull() {
            addCriterion("invoicename is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenameEqualTo(String value) {
            addCriterion("invoicename =", value, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameNotEqualTo(String value) {
            addCriterion("invoicename <>", value, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameGreaterThan(String value) {
            addCriterion("invoicename >", value, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameGreaterThanOrEqualTo(String value) {
            addCriterion("invoicename >=", value, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameLessThan(String value) {
            addCriterion("invoicename <", value, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameLessThanOrEqualTo(String value) {
            addCriterion("invoicename <=", value, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameLike(String value) {
            addCriterion("invoicename like", value, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameNotLike(String value) {
            addCriterion("invoicename not like", value, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameIn(List<String> values) {
            addCriterion("invoicename in", values, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameNotIn(List<String> values) {
            addCriterion("invoicename not in", values, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameBetween(String value1, String value2) {
            addCriterion("invoicename between", value1, value2, "invoicename");
            return (Criteria) this;
        }

        public Criteria andInvoicenameNotBetween(String value1, String value2) {
            addCriterion("invoicename not between", value1, value2, "invoicename");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIsNull() {
            addCriterion("discription is null");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIsNotNull() {
            addCriterion("discription is not null");
            return (Criteria) this;
        }

        public Criteria andDiscriptionEqualTo(String value) {
            addCriterion("discription =", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotEqualTo(String value) {
            addCriterion("discription <>", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionGreaterThan(String value) {
            addCriterion("discription >", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("discription >=", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLessThan(String value) {
            addCriterion("discription <", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLessThanOrEqualTo(String value) {
            addCriterion("discription <=", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLike(String value) {
            addCriterion("discription like", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotLike(String value) {
            addCriterion("discription not like", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIn(List<String> values) {
            addCriterion("discription in", values, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotIn(List<String> values) {
            addCriterion("discription not in", values, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionBetween(String value1, String value2) {
            addCriterion("discription between", value1, value2, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotBetween(String value1, String value2) {
            addCriterion("discription not between", value1, value2, "discription");
            return (Criteria) this;
        }

        public Criteria andEstimateidLikeInsensitive(String value) {
            addCriterion("upper(estimateid) like", value.toUpperCase(), "estimateid");
            return (Criteria) this;
        }

        public Criteria andCategoryLikeInsensitive(String value) {
            addCriterion("upper(category) like", value.toUpperCase(), "category");
            return (Criteria) this;
        }

        public Criteria andYeardLikeInsensitive(String value) {
            addCriterion("upper(yeard) like", value.toUpperCase(), "yeard");
            return (Criteria) this;
        }

        public Criteria andStandardLikeInsensitive(String value) {
            addCriterion("upper(standard) like", value.toUpperCase(), "standard");
            return (Criteria) this;
        }

        public Criteria andConditiondLikeInsensitive(String value) {
            addCriterion("upper(conditiond) like", value.toUpperCase(), "conditiond");
            return (Criteria) this;
        }

        public Criteria andPackagedLikeInsensitive(String value) {
            addCriterion("upper(packaged) like", value.toUpperCase(), "packaged");
            return (Criteria) this;
        }

        public Criteria andCertificateLikeInsensitive(String value) {
            addCriterion("upper(certificate) like", value.toUpperCase(), "certificate");
            return (Criteria) this;
        }

        public Criteria andInvoicenameLikeInsensitive(String value) {
            addCriterion("upper(invoicename) like", value.toUpperCase(), "invoicename");
            return (Criteria) this;
        }

        public Criteria andProductnameLikeInsensitive(String value) {
            addCriterion("upper(productname) like", value.toUpperCase(), "productname");
            return (Criteria) this;
        }

        public Criteria andAmountLikeInsensitive(String value) {
            addCriterion("upper(amount) like", value.toUpperCase(), "amount");
            return (Criteria) this;
        }

        public Criteria andPriceLikeInsensitive(String value) {
            addCriterion("upper(price) like", value.toUpperCase(), "price");
            return (Criteria) this;
        }

        public Criteria andCreaterLikeInsensitive(String value) {
            addCriterion("upper(creater) like", value.toUpperCase(), "creater");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLikeInsensitive(String value) {
            addCriterion("upper(discription) like", value.toUpperCase(), "discription");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}