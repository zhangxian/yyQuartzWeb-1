package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class MayCurRepaymentDetailRootExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public MayCurRepaymentDetailRootExample() {
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

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(String value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(String value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(String value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(String value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(String value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLike(String value) {
            addCriterion("report_id like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotLike(String value) {
            addCriterion("report_id not like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<String> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<String> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(String value1, String value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(String value1, String value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("report_type like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("report_type not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeIsNull() {
            addCriterion("formSubType is null");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeIsNotNull() {
            addCriterion("formSubType is not null");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeEqualTo(String value) {
            addCriterion("formSubType =", value, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeNotEqualTo(String value) {
            addCriterion("formSubType <>", value, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeGreaterThan(String value) {
            addCriterion("formSubType >", value, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("formSubType >=", value, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeLessThan(String value) {
            addCriterion("formSubType <", value, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeLessThanOrEqualTo(String value) {
            addCriterion("formSubType <=", value, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeLike(String value) {
            addCriterion("formSubType like", value, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeNotLike(String value) {
            addCriterion("formSubType not like", value, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeIn(List<String> values) {
            addCriterion("formSubType in", values, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeNotIn(List<String> values) {
            addCriterion("formSubType not in", values, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeBetween(String value1, String value2) {
            addCriterion("formSubType between", value1, value2, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeNotBetween(String value1, String value2) {
            addCriterion("formSubType not between", value1, value2, "formsubtype");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("DATE like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("DATE not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("DATE not between", value1, value2, "date");
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

        public Criteria andCollectioncurrencyIsNull() {
            addCriterion("collectionCurrency is null");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyIsNotNull() {
            addCriterion("collectionCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyEqualTo(String value) {
            addCriterion("collectionCurrency =", value, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyNotEqualTo(String value) {
            addCriterion("collectionCurrency <>", value, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyGreaterThan(String value) {
            addCriterion("collectionCurrency >", value, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("collectionCurrency >=", value, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyLessThan(String value) {
            addCriterion("collectionCurrency <", value, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyLessThanOrEqualTo(String value) {
            addCriterion("collectionCurrency <=", value, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyLike(String value) {
            addCriterion("collectionCurrency like", value, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyNotLike(String value) {
            addCriterion("collectionCurrency not like", value, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyIn(List<String> values) {
            addCriterion("collectionCurrency in", values, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyNotIn(List<String> values) {
            addCriterion("collectionCurrency not in", values, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyBetween(String value1, String value2) {
            addCriterion("collectionCurrency between", value1, value2, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyNotBetween(String value1, String value2) {
            addCriterion("collectionCurrency not between", value1, value2, "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCostCenterIsNull() {
            addCriterion("cost_center is null");
            return (Criteria) this;
        }

        public Criteria andCostCenterIsNotNull() {
            addCriterion("cost_center is not null");
            return (Criteria) this;
        }

        public Criteria andCostCenterEqualTo(String value) {
            addCriterion("cost_center =", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotEqualTo(String value) {
            addCriterion("cost_center <>", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterGreaterThan(String value) {
            addCriterion("cost_center >", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterGreaterThanOrEqualTo(String value) {
            addCriterion("cost_center >=", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterLessThan(String value) {
            addCriterion("cost_center <", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterLessThanOrEqualTo(String value) {
            addCriterion("cost_center <=", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterLike(String value) {
            addCriterion("cost_center like", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotLike(String value) {
            addCriterion("cost_center not like", value, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterIn(List<String> values) {
            addCriterion("cost_center in", values, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotIn(List<String> values) {
            addCriterion("cost_center not in", values, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterBetween(String value1, String value2) {
            addCriterion("cost_center between", value1, value2, "costCenter");
            return (Criteria) this;
        }

        public Criteria andCostCenterNotBetween(String value1, String value2) {
            addCriterion("cost_center not between", value1, value2, "costCenter");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeIsNull() {
            addCriterion("departmentBusinessCode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeIsNotNull() {
            addCriterion("departmentBusinessCode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeEqualTo(String value) {
            addCriterion("departmentBusinessCode =", value, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeNotEqualTo(String value) {
            addCriterion("departmentBusinessCode <>", value, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeGreaterThan(String value) {
            addCriterion("departmentBusinessCode >", value, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeGreaterThanOrEqualTo(String value) {
            addCriterion("departmentBusinessCode >=", value, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeLessThan(String value) {
            addCriterion("departmentBusinessCode <", value, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeLessThanOrEqualTo(String value) {
            addCriterion("departmentBusinessCode <=", value, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeLike(String value) {
            addCriterion("departmentBusinessCode like", value, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeNotLike(String value) {
            addCriterion("departmentBusinessCode not like", value, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeIn(List<String> values) {
            addCriterion("departmentBusinessCode in", values, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeNotIn(List<String> values) {
            addCriterion("departmentBusinessCode not in", values, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeBetween(String value1, String value2) {
            addCriterion("departmentBusinessCode between", value1, value2, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeNotBetween(String value1, String value2) {
            addCriterion("departmentBusinessCode not between", value1, value2, "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentName =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentName <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentName >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentName >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentName <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentName <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentName like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentName not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentName in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentName not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentName between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentName not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameIsNull() {
            addCriterion("departmentFullName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameIsNotNull() {
            addCriterion("departmentFullName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameEqualTo(String value) {
            addCriterion("departmentFullName =", value, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameNotEqualTo(String value) {
            addCriterion("departmentFullName <>", value, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameGreaterThan(String value) {
            addCriterion("departmentFullName >", value, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentFullName >=", value, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameLessThan(String value) {
            addCriterion("departmentFullName <", value, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameLessThanOrEqualTo(String value) {
            addCriterion("departmentFullName <=", value, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameLike(String value) {
            addCriterion("departmentFullName like", value, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameNotLike(String value) {
            addCriterion("departmentFullName not like", value, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameIn(List<String> values) {
            addCriterion("departmentFullName in", values, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameNotIn(List<String> values) {
            addCriterion("departmentFullName not in", values, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameBetween(String value1, String value2) {
            addCriterion("departmentFullName between", value1, value2, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameNotBetween(String value1, String value2) {
            addCriterion("departmentFullName not between", value1, value2, "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeIsNull() {
            addCriterion("reim_user_code is null");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeIsNotNull() {
            addCriterion("reim_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeEqualTo(String value) {
            addCriterion("reim_user_code =", value, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeNotEqualTo(String value) {
            addCriterion("reim_user_code <>", value, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeGreaterThan(String value) {
            addCriterion("reim_user_code >", value, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reim_user_code >=", value, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeLessThan(String value) {
            addCriterion("reim_user_code <", value, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeLessThanOrEqualTo(String value) {
            addCriterion("reim_user_code <=", value, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeLike(String value) {
            addCriterion("reim_user_code like", value, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeNotLike(String value) {
            addCriterion("reim_user_code not like", value, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeIn(List<String> values) {
            addCriterion("reim_user_code in", values, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeNotIn(List<String> values) {
            addCriterion("reim_user_code not in", values, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeBetween(String value1, String value2) {
            addCriterion("reim_user_code between", value1, value2, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeNotBetween(String value1, String value2) {
            addCriterion("reim_user_code not between", value1, value2, "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimusernameIsNull() {
            addCriterion("reimUserName is null");
            return (Criteria) this;
        }

        public Criteria andReimusernameIsNotNull() {
            addCriterion("reimUserName is not null");
            return (Criteria) this;
        }

        public Criteria andReimusernameEqualTo(String value) {
            addCriterion("reimUserName =", value, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameNotEqualTo(String value) {
            addCriterion("reimUserName <>", value, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameGreaterThan(String value) {
            addCriterion("reimUserName >", value, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameGreaterThanOrEqualTo(String value) {
            addCriterion("reimUserName >=", value, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameLessThan(String value) {
            addCriterion("reimUserName <", value, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameLessThanOrEqualTo(String value) {
            addCriterion("reimUserName <=", value, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameLike(String value) {
            addCriterion("reimUserName like", value, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameNotLike(String value) {
            addCriterion("reimUserName not like", value, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameIn(List<String> values) {
            addCriterion("reimUserName in", values, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameNotIn(List<String> values) {
            addCriterion("reimUserName not in", values, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameBetween(String value1, String value2) {
            addCriterion("reimUserName between", value1, value2, "reimusername");
            return (Criteria) this;
        }

        public Criteria andReimusernameNotBetween(String value1, String value2) {
            addCriterion("reimUserName not between", value1, value2, "reimusername");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeIsNull() {
            addCriterion("repaymentTime is null");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeIsNotNull() {
            addCriterion("repaymentTime is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeEqualTo(String value) {
            addCriterion("repaymentTime =", value, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeNotEqualTo(String value) {
            addCriterion("repaymentTime <>", value, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeGreaterThan(String value) {
            addCriterion("repaymentTime >", value, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentTime >=", value, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeLessThan(String value) {
            addCriterion("repaymentTime <", value, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeLessThanOrEqualTo(String value) {
            addCriterion("repaymentTime <=", value, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeLike(String value) {
            addCriterion("repaymentTime like", value, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeNotLike(String value) {
            addCriterion("repaymentTime not like", value, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeIn(List<String> values) {
            addCriterion("repaymentTime in", values, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeNotIn(List<String> values) {
            addCriterion("repaymentTime not in", values, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeBetween(String value1, String value2) {
            addCriterion("repaymentTime between", value1, value2, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeNotBetween(String value1, String value2) {
            addCriterion("repaymentTime not between", value1, value2, "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameIsNull() {
            addCriterion("subsidiary_name is null");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameIsNotNull() {
            addCriterion("subsidiary_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameEqualTo(String value) {
            addCriterion("subsidiary_name =", value, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameNotEqualTo(String value) {
            addCriterion("subsidiary_name <>", value, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameGreaterThan(String value) {
            addCriterion("subsidiary_name >", value, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameGreaterThanOrEqualTo(String value) {
            addCriterion("subsidiary_name >=", value, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameLessThan(String value) {
            addCriterion("subsidiary_name <", value, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameLessThanOrEqualTo(String value) {
            addCriterion("subsidiary_name <=", value, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameLike(String value) {
            addCriterion("subsidiary_name like", value, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameNotLike(String value) {
            addCriterion("subsidiary_name not like", value, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameIn(List<String> values) {
            addCriterion("subsidiary_name in", values, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameNotIn(List<String> values) {
            addCriterion("subsidiary_name not in", values, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameBetween(String value1, String value2) {
            addCriterion("subsidiary_name between", value1, value2, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameNotBetween(String value1, String value2) {
            addCriterion("subsidiary_name not between", value1, value2, "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeIsNull() {
            addCriterion("subsidiary_code is null");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeIsNotNull() {
            addCriterion("subsidiary_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeEqualTo(String value) {
            addCriterion("subsidiary_code =", value, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeNotEqualTo(String value) {
            addCriterion("subsidiary_code <>", value, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeGreaterThan(String value) {
            addCriterion("subsidiary_code >", value, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("subsidiary_code >=", value, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeLessThan(String value) {
            addCriterion("subsidiary_code <", value, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeLessThanOrEqualTo(String value) {
            addCriterion("subsidiary_code <=", value, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeLike(String value) {
            addCriterion("subsidiary_code like", value, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeNotLike(String value) {
            addCriterion("subsidiary_code not like", value, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeIn(List<String> values) {
            addCriterion("subsidiary_code in", values, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeNotIn(List<String> values) {
            addCriterion("subsidiary_code not in", values, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeBetween(String value1, String value2) {
            addCriterion("subsidiary_code between", value1, value2, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeNotBetween(String value1, String value2) {
            addCriterion("subsidiary_code not between", value1, value2, "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andCreatedatIsNull() {
            addCriterion("createdAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedatIsNotNull() {
            addCriterion("createdAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedatEqualTo(String value) {
            addCriterion("createdAt =", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotEqualTo(String value) {
            addCriterion("createdAt <>", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatGreaterThan(String value) {
            addCriterion("createdAt >", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatGreaterThanOrEqualTo(String value) {
            addCriterion("createdAt >=", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatLessThan(String value) {
            addCriterion("createdAt <", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatLessThanOrEqualTo(String value) {
            addCriterion("createdAt <=", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatLike(String value) {
            addCriterion("createdAt like", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotLike(String value) {
            addCriterion("createdAt not like", value, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatIn(List<String> values) {
            addCriterion("createdAt in", values, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotIn(List<String> values) {
            addCriterion("createdAt not in", values, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatBetween(String value1, String value2) {
            addCriterion("createdAt between", value1, value2, "createdat");
            return (Criteria) this;
        }

        public Criteria andCreatedatNotBetween(String value1, String value2) {
            addCriterion("createdAt not between", value1, value2, "createdat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatIsNull() {
            addCriterion("submittedAt is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedatIsNotNull() {
            addCriterion("submittedAt is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedatEqualTo(String value) {
            addCriterion("submittedAt =", value, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatNotEqualTo(String value) {
            addCriterion("submittedAt <>", value, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatGreaterThan(String value) {
            addCriterion("submittedAt >", value, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatGreaterThanOrEqualTo(String value) {
            addCriterion("submittedAt >=", value, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatLessThan(String value) {
            addCriterion("submittedAt <", value, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatLessThanOrEqualTo(String value) {
            addCriterion("submittedAt <=", value, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatLike(String value) {
            addCriterion("submittedAt like", value, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatNotLike(String value) {
            addCriterion("submittedAt not like", value, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatIn(List<String> values) {
            addCriterion("submittedAt in", values, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatNotIn(List<String> values) {
            addCriterion("submittedAt not in", values, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatBetween(String value1, String value2) {
            addCriterion("submittedAt between", value1, value2, "submittedat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatNotBetween(String value1, String value2) {
            addCriterion("submittedAt not between", value1, value2, "submittedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatIsNull() {
            addCriterion("approvedAt is null");
            return (Criteria) this;
        }

        public Criteria andApprovedatIsNotNull() {
            addCriterion("approvedAt is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedatEqualTo(String value) {
            addCriterion("approvedAt =", value, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatNotEqualTo(String value) {
            addCriterion("approvedAt <>", value, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatGreaterThan(String value) {
            addCriterion("approvedAt >", value, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatGreaterThanOrEqualTo(String value) {
            addCriterion("approvedAt >=", value, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatLessThan(String value) {
            addCriterion("approvedAt <", value, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatLessThanOrEqualTo(String value) {
            addCriterion("approvedAt <=", value, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatLike(String value) {
            addCriterion("approvedAt like", value, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatNotLike(String value) {
            addCriterion("approvedAt not like", value, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatIn(List<String> values) {
            addCriterion("approvedAt in", values, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatNotIn(List<String> values) {
            addCriterion("approvedAt not in", values, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatBetween(String value1, String value2) {
            addCriterion("approvedAt between", value1, value2, "approvedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatNotBetween(String value1, String value2) {
            addCriterion("approvedAt not between", value1, value2, "approvedat");
            return (Criteria) this;
        }

        public Criteria andSettledatIsNull() {
            addCriterion("settledAt is null");
            return (Criteria) this;
        }

        public Criteria andSettledatIsNotNull() {
            addCriterion("settledAt is not null");
            return (Criteria) this;
        }

        public Criteria andSettledatEqualTo(String value) {
            addCriterion("settledAt =", value, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatNotEqualTo(String value) {
            addCriterion("settledAt <>", value, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatGreaterThan(String value) {
            addCriterion("settledAt >", value, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatGreaterThanOrEqualTo(String value) {
            addCriterion("settledAt >=", value, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatLessThan(String value) {
            addCriterion("settledAt <", value, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatLessThanOrEqualTo(String value) {
            addCriterion("settledAt <=", value, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatLike(String value) {
            addCriterion("settledAt like", value, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatNotLike(String value) {
            addCriterion("settledAt not like", value, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatIn(List<String> values) {
            addCriterion("settledAt in", values, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatNotIn(List<String> values) {
            addCriterion("settledAt not in", values, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatBetween(String value1, String value2) {
            addCriterion("settledAt between", value1, value2, "settledat");
            return (Criteria) this;
        }

        public Criteria andSettledatNotBetween(String value1, String value2) {
            addCriterion("settledAt not between", value1, value2, "settledat");
            return (Criteria) this;
        }

        public Criteria andModifiedatIsNull() {
            addCriterion("modifiedAt is null");
            return (Criteria) this;
        }

        public Criteria andModifiedatIsNotNull() {
            addCriterion("modifiedAt is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedatEqualTo(String value) {
            addCriterion("modifiedAt =", value, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatNotEqualTo(String value) {
            addCriterion("modifiedAt <>", value, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatGreaterThan(String value) {
            addCriterion("modifiedAt >", value, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatGreaterThanOrEqualTo(String value) {
            addCriterion("modifiedAt >=", value, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatLessThan(String value) {
            addCriterion("modifiedAt <", value, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatLessThanOrEqualTo(String value) {
            addCriterion("modifiedAt <=", value, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatLike(String value) {
            addCriterion("modifiedAt like", value, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatNotLike(String value) {
            addCriterion("modifiedAt not like", value, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatIn(List<String> values) {
            addCriterion("modifiedAt in", values, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatNotIn(List<String> values) {
            addCriterion("modifiedAt not in", values, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatBetween(String value1, String value2) {
            addCriterion("modifiedAt between", value1, value2, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andModifiedatNotBetween(String value1, String value2) {
            addCriterion("modifiedAt not between", value1, value2, "modifiedat");
            return (Criteria) this;
        }

        public Criteria andExportstatusIsNull() {
            addCriterion("exportStatus is null");
            return (Criteria) this;
        }

        public Criteria andExportstatusIsNotNull() {
            addCriterion("exportStatus is not null");
            return (Criteria) this;
        }

        public Criteria andExportstatusEqualTo(String value) {
            addCriterion("exportStatus =", value, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusNotEqualTo(String value) {
            addCriterion("exportStatus <>", value, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusGreaterThan(String value) {
            addCriterion("exportStatus >", value, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusGreaterThanOrEqualTo(String value) {
            addCriterion("exportStatus >=", value, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusLessThan(String value) {
            addCriterion("exportStatus <", value, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusLessThanOrEqualTo(String value) {
            addCriterion("exportStatus <=", value, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusLike(String value) {
            addCriterion("exportStatus like", value, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusNotLike(String value) {
            addCriterion("exportStatus not like", value, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusIn(List<String> values) {
            addCriterion("exportStatus in", values, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusNotIn(List<String> values) {
            addCriterion("exportStatus not in", values, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusBetween(String value1, String value2) {
            addCriterion("exportStatus between", value1, value2, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andExportstatusNotBetween(String value1, String value2) {
            addCriterion("exportStatus not between", value1, value2, "exportstatus");
            return (Criteria) this;
        }

        public Criteria andVouchernumIsNull() {
            addCriterion("voucherNum is null");
            return (Criteria) this;
        }

        public Criteria andVouchernumIsNotNull() {
            addCriterion("voucherNum is not null");
            return (Criteria) this;
        }

        public Criteria andVouchernumEqualTo(String value) {
            addCriterion("voucherNum =", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumNotEqualTo(String value) {
            addCriterion("voucherNum <>", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumGreaterThan(String value) {
            addCriterion("voucherNum >", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumGreaterThanOrEqualTo(String value) {
            addCriterion("voucherNum >=", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumLessThan(String value) {
            addCriterion("voucherNum <", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumLessThanOrEqualTo(String value) {
            addCriterion("voucherNum <=", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumLike(String value) {
            addCriterion("voucherNum like", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumNotLike(String value) {
            addCriterion("voucherNum not like", value, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumIn(List<String> values) {
            addCriterion("voucherNum in", values, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumNotIn(List<String> values) {
            addCriterion("voucherNum not in", values, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumBetween(String value1, String value2) {
            addCriterion("voucherNum between", value1, value2, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andVouchernumNotBetween(String value1, String value2) {
            addCriterion("voucherNum not between", value1, value2, "vouchernum");
            return (Criteria) this;
        }

        public Criteria andExportcommentsIsNull() {
            addCriterion("exportComments is null");
            return (Criteria) this;
        }

        public Criteria andExportcommentsIsNotNull() {
            addCriterion("exportComments is not null");
            return (Criteria) this;
        }

        public Criteria andExportcommentsEqualTo(String value) {
            addCriterion("exportComments =", value, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsNotEqualTo(String value) {
            addCriterion("exportComments <>", value, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsGreaterThan(String value) {
            addCriterion("exportComments >", value, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsGreaterThanOrEqualTo(String value) {
            addCriterion("exportComments >=", value, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsLessThan(String value) {
            addCriterion("exportComments <", value, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsLessThanOrEqualTo(String value) {
            addCriterion("exportComments <=", value, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsLike(String value) {
            addCriterion("exportComments like", value, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsNotLike(String value) {
            addCriterion("exportComments not like", value, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsIn(List<String> values) {
            addCriterion("exportComments in", values, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsNotIn(List<String> values) {
            addCriterion("exportComments not in", values, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsBetween(String value1, String value2) {
            addCriterion("exportComments between", value1, value2, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andExportcommentsNotBetween(String value1, String value2) {
            addCriterion("exportComments not between", value1, value2, "exportcomments");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberIsNull() {
            addCriterion("repaymentAccountNumber is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberIsNotNull() {
            addCriterion("repaymentAccountNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberEqualTo(String value) {
            addCriterion("repaymentAccountNumber =", value, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberNotEqualTo(String value) {
            addCriterion("repaymentAccountNumber <>", value, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberGreaterThan(String value) {
            addCriterion("repaymentAccountNumber >", value, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountNumber >=", value, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberLessThan(String value) {
            addCriterion("repaymentAccountNumber <", value, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountNumber <=", value, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberLike(String value) {
            addCriterion("repaymentAccountNumber like", value, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberNotLike(String value) {
            addCriterion("repaymentAccountNumber not like", value, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberIn(List<String> values) {
            addCriterion("repaymentAccountNumber in", values, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberNotIn(List<String> values) {
            addCriterion("repaymentAccountNumber not in", values, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberBetween(String value1, String value2) {
            addCriterion("repaymentAccountNumber between", value1, value2, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountNumber not between", value1, value2, "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameIsNull() {
            addCriterion("repaymentAccountName is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameIsNotNull() {
            addCriterion("repaymentAccountName is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameEqualTo(String value) {
            addCriterion("repaymentAccountName =", value, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameNotEqualTo(String value) {
            addCriterion("repaymentAccountName <>", value, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameGreaterThan(String value) {
            addCriterion("repaymentAccountName >", value, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountName >=", value, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameLessThan(String value) {
            addCriterion("repaymentAccountName <", value, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountName <=", value, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameLike(String value) {
            addCriterion("repaymentAccountName like", value, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameNotLike(String value) {
            addCriterion("repaymentAccountName not like", value, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameIn(List<String> values) {
            addCriterion("repaymentAccountName in", values, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameNotIn(List<String> values) {
            addCriterion("repaymentAccountName not in", values, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameBetween(String value1, String value2) {
            addCriterion("repaymentAccountName between", value1, value2, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountName not between", value1, value2, "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeIsNull() {
            addCriterion("repaymentAccountCode is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeIsNotNull() {
            addCriterion("repaymentAccountCode is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeEqualTo(String value) {
            addCriterion("repaymentAccountCode =", value, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeNotEqualTo(String value) {
            addCriterion("repaymentAccountCode <>", value, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeGreaterThan(String value) {
            addCriterion("repaymentAccountCode >", value, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountCode >=", value, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeLessThan(String value) {
            addCriterion("repaymentAccountCode <", value, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountCode <=", value, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeLike(String value) {
            addCriterion("repaymentAccountCode like", value, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeNotLike(String value) {
            addCriterion("repaymentAccountCode not like", value, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeIn(List<String> values) {
            addCriterion("repaymentAccountCode in", values, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeNotIn(List<String> values) {
            addCriterion("repaymentAccountCode not in", values, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeBetween(String value1, String value2) {
            addCriterion("repaymentAccountCode between", value1, value2, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountCode not between", value1, value2, "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceIsNull() {
            addCriterion("repaymentAccountProvince is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceIsNotNull() {
            addCriterion("repaymentAccountProvince is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceEqualTo(String value) {
            addCriterion("repaymentAccountProvince =", value, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceNotEqualTo(String value) {
            addCriterion("repaymentAccountProvince <>", value, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceGreaterThan(String value) {
            addCriterion("repaymentAccountProvince >", value, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountProvince >=", value, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceLessThan(String value) {
            addCriterion("repaymentAccountProvince <", value, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountProvince <=", value, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceLike(String value) {
            addCriterion("repaymentAccountProvince like", value, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceNotLike(String value) {
            addCriterion("repaymentAccountProvince not like", value, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceIn(List<String> values) {
            addCriterion("repaymentAccountProvince in", values, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceNotIn(List<String> values) {
            addCriterion("repaymentAccountProvince not in", values, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceBetween(String value1, String value2) {
            addCriterion("repaymentAccountProvince between", value1, value2, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountProvince not between", value1, value2, "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityIsNull() {
            addCriterion("repaymentAccountCity is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityIsNotNull() {
            addCriterion("repaymentAccountCity is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityEqualTo(String value) {
            addCriterion("repaymentAccountCity =", value, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityNotEqualTo(String value) {
            addCriterion("repaymentAccountCity <>", value, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityGreaterThan(String value) {
            addCriterion("repaymentAccountCity >", value, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountCity >=", value, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityLessThan(String value) {
            addCriterion("repaymentAccountCity <", value, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountCity <=", value, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityLike(String value) {
            addCriterion("repaymentAccountCity like", value, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityNotLike(String value) {
            addCriterion("repaymentAccountCity not like", value, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityIn(List<String> values) {
            addCriterion("repaymentAccountCity in", values, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityNotIn(List<String> values) {
            addCriterion("repaymentAccountCity not in", values, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityBetween(String value1, String value2) {
            addCriterion("repaymentAccountCity between", value1, value2, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountCity not between", value1, value2, "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoIsNull() {
            addCriterion("repaymentAccountBranchNO is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoIsNotNull() {
            addCriterion("repaymentAccountBranchNO is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoEqualTo(String value) {
            addCriterion("repaymentAccountBranchNO =", value, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoNotEqualTo(String value) {
            addCriterion("repaymentAccountBranchNO <>", value, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoGreaterThan(String value) {
            addCriterion("repaymentAccountBranchNO >", value, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountBranchNO >=", value, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoLessThan(String value) {
            addCriterion("repaymentAccountBranchNO <", value, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountBranchNO <=", value, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoLike(String value) {
            addCriterion("repaymentAccountBranchNO like", value, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoNotLike(String value) {
            addCriterion("repaymentAccountBranchNO not like", value, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoIn(List<String> values) {
            addCriterion("repaymentAccountBranchNO in", values, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoNotIn(List<String> values) {
            addCriterion("repaymentAccountBranchNO not in", values, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoBetween(String value1, String value2) {
            addCriterion("repaymentAccountBranchNO between", value1, value2, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountBranchNO not between", value1, value2, "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeIsNull() {
            addCriterion("repaymentAccountingSubjectBizCode is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeIsNotNull() {
            addCriterion("repaymentAccountingSubjectBizCode is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectBizCode =", value, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeNotEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectBizCode <>", value, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeGreaterThan(String value) {
            addCriterion("repaymentAccountingSubjectBizCode >", value, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectBizCode >=", value, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeLessThan(String value) {
            addCriterion("repaymentAccountingSubjectBizCode <", value, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectBizCode <=", value, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeLike(String value) {
            addCriterion("repaymentAccountingSubjectBizCode like", value, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeNotLike(String value) {
            addCriterion("repaymentAccountingSubjectBizCode not like", value, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeIn(List<String> values) {
            addCriterion("repaymentAccountingSubjectBizCode in", values, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeNotIn(List<String> values) {
            addCriterion("repaymentAccountingSubjectBizCode not in", values, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeBetween(String value1, String value2) {
            addCriterion("repaymentAccountingSubjectBizCode between", value1, value2, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountingSubjectBizCode not between", value1, value2, "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameIsNull() {
            addCriterion("repaymentAccountingSubjectFullName is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameIsNotNull() {
            addCriterion("repaymentAccountingSubjectFullName is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectFullName =", value, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameNotEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectFullName <>", value, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameGreaterThan(String value) {
            addCriterion("repaymentAccountingSubjectFullName >", value, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectFullName >=", value, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameLessThan(String value) {
            addCriterion("repaymentAccountingSubjectFullName <", value, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectFullName <=", value, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameLike(String value) {
            addCriterion("repaymentAccountingSubjectFullName like", value, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameNotLike(String value) {
            addCriterion("repaymentAccountingSubjectFullName not like", value, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameIn(List<String> values) {
            addCriterion("repaymentAccountingSubjectFullName in", values, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameNotIn(List<String> values) {
            addCriterion("repaymentAccountingSubjectFullName not in", values, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameBetween(String value1, String value2) {
            addCriterion("repaymentAccountingSubjectFullName between", value1, value2, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountingSubjectFullName not between", value1, value2, "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeIsNull() {
            addCriterion("repaymentAccountingSubjectCashFlowCode is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeIsNotNull() {
            addCriterion("repaymentAccountingSubjectCashFlowCode is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowCode =", value, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeNotEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowCode <>", value, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeGreaterThan(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowCode >", value, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowCode >=", value, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeLessThan(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowCode <", value, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowCode <=", value, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeLike(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowCode like", value, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeNotLike(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowCode not like", value, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeIn(List<String> values) {
            addCriterion("repaymentAccountingSubjectCashFlowCode in", values, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeNotIn(List<String> values) {
            addCriterion("repaymentAccountingSubjectCashFlowCode not in", values, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeBetween(String value1, String value2) {
            addCriterion("repaymentAccountingSubjectCashFlowCode between", value1, value2, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountingSubjectCashFlowCode not between", value1, value2, "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameIsNull() {
            addCriterion("repaymentAccountingSubjectCashFlowName is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameIsNotNull() {
            addCriterion("repaymentAccountingSubjectCashFlowName is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowName =", value, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameNotEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowName <>", value, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameGreaterThan(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowName >", value, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowName >=", value, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameLessThan(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowName <", value, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameLessThanOrEqualTo(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowName <=", value, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameLike(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowName like", value, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameNotLike(String value) {
            addCriterion("repaymentAccountingSubjectCashFlowName not like", value, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameIn(List<String> values) {
            addCriterion("repaymentAccountingSubjectCashFlowName in", values, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameNotIn(List<String> values) {
            addCriterion("repaymentAccountingSubjectCashFlowName not in", values, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameBetween(String value1, String value2) {
            addCriterion("repaymentAccountingSubjectCashFlowName between", value1, value2, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameNotBetween(String value1, String value2) {
            addCriterion("repaymentAccountingSubjectCashFlowName not between", value1, value2, "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesIsNull() {
            addCriterion("finance_codes is null");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesIsNotNull() {
            addCriterion("finance_codes is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesEqualTo(String value) {
            addCriterion("finance_codes =", value, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesNotEqualTo(String value) {
            addCriterion("finance_codes <>", value, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesGreaterThan(String value) {
            addCriterion("finance_codes >", value, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesGreaterThanOrEqualTo(String value) {
            addCriterion("finance_codes >=", value, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesLessThan(String value) {
            addCriterion("finance_codes <", value, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesLessThanOrEqualTo(String value) {
            addCriterion("finance_codes <=", value, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesLike(String value) {
            addCriterion("finance_codes like", value, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesNotLike(String value) {
            addCriterion("finance_codes not like", value, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesIn(List<String> values) {
            addCriterion("finance_codes in", values, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesNotIn(List<String> values) {
            addCriterion("finance_codes not in", values, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesBetween(String value1, String value2) {
            addCriterion("finance_codes between", value1, value2, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesNotBetween(String value1, String value2) {
            addCriterion("finance_codes not between", value1, value2, "financeCodes");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyIsNull() {
            addCriterion("baseCurrency is null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyIsNotNull() {
            addCriterion("baseCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyEqualTo(String value) {
            addCriterion("baseCurrency =", value, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyNotEqualTo(String value) {
            addCriterion("baseCurrency <>", value, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyGreaterThan(String value) {
            addCriterion("baseCurrency >", value, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("baseCurrency >=", value, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyLessThan(String value) {
            addCriterion("baseCurrency <", value, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyLessThanOrEqualTo(String value) {
            addCriterion("baseCurrency <=", value, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyLike(String value) {
            addCriterion("baseCurrency like", value, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyNotLike(String value) {
            addCriterion("baseCurrency not like", value, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyIn(List<String> values) {
            addCriterion("baseCurrency in", values, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyNotIn(List<String> values) {
            addCriterion("baseCurrency not in", values, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyBetween(String value1, String value2) {
            addCriterion("baseCurrency between", value1, value2, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyNotBetween(String value1, String value2) {
            addCriterion("baseCurrency not between", value1, value2, "basecurrency");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateIsNull() {
            addCriterion("collectionToBaseExchangeRate is null");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateIsNotNull() {
            addCriterion("collectionToBaseExchangeRate is not null");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateEqualTo(String value) {
            addCriterion("collectionToBaseExchangeRate =", value, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateNotEqualTo(String value) {
            addCriterion("collectionToBaseExchangeRate <>", value, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateGreaterThan(String value) {
            addCriterion("collectionToBaseExchangeRate >", value, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateGreaterThanOrEqualTo(String value) {
            addCriterion("collectionToBaseExchangeRate >=", value, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateLessThan(String value) {
            addCriterion("collectionToBaseExchangeRate <", value, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateLessThanOrEqualTo(String value) {
            addCriterion("collectionToBaseExchangeRate <=", value, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateLike(String value) {
            addCriterion("collectionToBaseExchangeRate like", value, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateNotLike(String value) {
            addCriterion("collectionToBaseExchangeRate not like", value, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateIn(List<String> values) {
            addCriterion("collectionToBaseExchangeRate in", values, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateNotIn(List<String> values) {
            addCriterion("collectionToBaseExchangeRate not in", values, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateBetween(String value1, String value2) {
            addCriterion("collectionToBaseExchangeRate between", value1, value2, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateNotBetween(String value1, String value2) {
            addCriterion("collectionToBaseExchangeRate not between", value1, value2, "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNull() {
            addCriterion("baseAmount is null");
            return (Criteria) this;
        }

        public Criteria andBaseamountIsNotNull() {
            addCriterion("baseAmount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseamountEqualTo(String value) {
            addCriterion("baseAmount =", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotEqualTo(String value) {
            addCriterion("baseAmount <>", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThan(String value) {
            addCriterion("baseAmount >", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountGreaterThanOrEqualTo(String value) {
            addCriterion("baseAmount >=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThan(String value) {
            addCriterion("baseAmount <", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLessThanOrEqualTo(String value) {
            addCriterion("baseAmount <=", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountLike(String value) {
            addCriterion("baseAmount like", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotLike(String value) {
            addCriterion("baseAmount not like", value, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountIn(List<String> values) {
            addCriterion("baseAmount in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotIn(List<String> values) {
            addCriterion("baseAmount not in", values, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountBetween(String value1, String value2) {
            addCriterion("baseAmount between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andBaseamountNotBetween(String value1, String value2) {
            addCriterion("baseAmount not between", value1, value2, "baseamount");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNull() {
            addCriterion("savetime is null");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNotNull() {
            addCriterion("savetime is not null");
            return (Criteria) this;
        }

        public Criteria andSavetimeEqualTo(String value) {
            addCriterion("savetime =", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotEqualTo(String value) {
            addCriterion("savetime <>", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThan(String value) {
            addCriterion("savetime >", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThanOrEqualTo(String value) {
            addCriterion("savetime >=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThan(String value) {
            addCriterion("savetime <", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThanOrEqualTo(String value) {
            addCriterion("savetime <=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLike(String value) {
            addCriterion("savetime like", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotLike(String value) {
            addCriterion("savetime not like", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeIn(List<String> values) {
            addCriterion("savetime in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotIn(List<String> values) {
            addCriterion("savetime not in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeBetween(String value1, String value2) {
            addCriterion("savetime between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotBetween(String value1, String value2) {
            addCriterion("savetime not between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andReportIdLikeInsensitive(String value) {
            addCriterion("upper(report_id) like", value.toUpperCase(), "reportId");
            return (Criteria) this;
        }

        public Criteria andReportTypeLikeInsensitive(String value) {
            addCriterion("upper(report_type) like", value.toUpperCase(), "reportType");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andFormsubtypeLikeInsensitive(String value) {
            addCriterion("upper(formSubType) like", value.toUpperCase(), "formsubtype");
            return (Criteria) this;
        }

        public Criteria andDateLikeInsensitive(String value) {
            addCriterion("upper(DATE) like", value.toUpperCase(), "date");
            return (Criteria) this;
        }

        public Criteria andAmountLikeInsensitive(String value) {
            addCriterion("upper(amount) like", value.toUpperCase(), "amount");
            return (Criteria) this;
        }

        public Criteria andCollectioncurrencyLikeInsensitive(String value) {
            addCriterion("upper(collectionCurrency) like", value.toUpperCase(), "collectioncurrency");
            return (Criteria) this;
        }

        public Criteria andCostCenterLikeInsensitive(String value) {
            addCriterion("upper(cost_center) like", value.toUpperCase(), "costCenter");
            return (Criteria) this;
        }

        public Criteria andDepartmentbusinesscodeLikeInsensitive(String value) {
            addCriterion("upper(departmentBusinessCode) like", value.toUpperCase(), "departmentbusinesscode");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLikeInsensitive(String value) {
            addCriterion("upper(departmentName) like", value.toUpperCase(), "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentfullnameLikeInsensitive(String value) {
            addCriterion("upper(departmentFullName) like", value.toUpperCase(), "departmentfullname");
            return (Criteria) this;
        }

        public Criteria andReimUserCodeLikeInsensitive(String value) {
            addCriterion("upper(reim_user_code) like", value.toUpperCase(), "reimUserCode");
            return (Criteria) this;
        }

        public Criteria andReimusernameLikeInsensitive(String value) {
            addCriterion("upper(reimUserName) like", value.toUpperCase(), "reimusername");
            return (Criteria) this;
        }

        public Criteria andRepaymenttimeLikeInsensitive(String value) {
            addCriterion("upper(repaymentTime) like", value.toUpperCase(), "repaymenttime");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryNameLikeInsensitive(String value) {
            addCriterion("upper(subsidiary_name) like", value.toUpperCase(), "subsidiaryName");
            return (Criteria) this;
        }

        public Criteria andSubsidiaryCodeLikeInsensitive(String value) {
            addCriterion("upper(subsidiary_code) like", value.toUpperCase(), "subsidiaryCode");
            return (Criteria) this;
        }

        public Criteria andCreatedatLikeInsensitive(String value) {
            addCriterion("upper(createdAt) like", value.toUpperCase(), "createdat");
            return (Criteria) this;
        }

        public Criteria andSubmittedatLikeInsensitive(String value) {
            addCriterion("upper(submittedAt) like", value.toUpperCase(), "submittedat");
            return (Criteria) this;
        }

        public Criteria andApprovedatLikeInsensitive(String value) {
            addCriterion("upper(approvedAt) like", value.toUpperCase(), "approvedat");
            return (Criteria) this;
        }

        public Criteria andSettledatLikeInsensitive(String value) {
            addCriterion("upper(settledAt) like", value.toUpperCase(), "settledat");
            return (Criteria) this;
        }

        public Criteria andModifiedatLikeInsensitive(String value) {
            addCriterion("upper(modifiedAt) like", value.toUpperCase(), "modifiedat");
            return (Criteria) this;
        }

        public Criteria andExportstatusLikeInsensitive(String value) {
            addCriterion("upper(exportStatus) like", value.toUpperCase(), "exportstatus");
            return (Criteria) this;
        }

        public Criteria andVouchernumLikeInsensitive(String value) {
            addCriterion("upper(voucherNum) like", value.toUpperCase(), "vouchernum");
            return (Criteria) this;
        }

        public Criteria andExportcommentsLikeInsensitive(String value) {
            addCriterion("upper(exportComments) like", value.toUpperCase(), "exportcomments");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnumberLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountNumber) like", value.toUpperCase(), "repaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnameLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountName) like", value.toUpperCase(), "repaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcodeLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountCode) like", value.toUpperCase(), "repaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountprovinceLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountProvince) like", value.toUpperCase(), "repaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountcityLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountCity) like", value.toUpperCase(), "repaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountbranchnoLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountBranchNO) like", value.toUpperCase(), "repaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectbizcodeLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountingSubjectBizCode) like", value.toUpperCase(), "repaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectfullnameLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountingSubjectFullName) like", value.toUpperCase(), "repaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflowcodeLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountingSubjectCashFlowCode) like", value.toUpperCase(), "repaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountingsubjectcashflownameLikeInsensitive(String value) {
            addCriterion("upper(repaymentAccountingSubjectCashFlowName) like", value.toUpperCase(), "repaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andFinanceCodesLikeInsensitive(String value) {
            addCriterion("upper(finance_codes) like", value.toUpperCase(), "financeCodes");
            return (Criteria) this;
        }

        public Criteria andBasecurrencyLikeInsensitive(String value) {
            addCriterion("upper(baseCurrency) like", value.toUpperCase(), "basecurrency");
            return (Criteria) this;
        }

        public Criteria andCollectiontobaseexchangerateLikeInsensitive(String value) {
            addCriterion("upper(collectionToBaseExchangeRate) like", value.toUpperCase(), "collectiontobaseexchangerate");
            return (Criteria) this;
        }

        public Criteria andBaseamountLikeInsensitive(String value) {
            addCriterion("upper(baseAmount) like", value.toUpperCase(), "baseamount");
            return (Criteria) this;
        }

        public Criteria andSavetimeLikeInsensitive(String value) {
            addCriterion("upper(savetime) like", value.toUpperCase(), "savetime");
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