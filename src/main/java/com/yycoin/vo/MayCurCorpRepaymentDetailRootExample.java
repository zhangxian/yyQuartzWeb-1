package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class MayCurCorpRepaymentDetailRootExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public MayCurCorpRepaymentDetailRootExample() {
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

        public Criteria andApprovedamountIsNull() {
            addCriterion("approvedAmount is null");
            return (Criteria) this;
        }

        public Criteria andApprovedamountIsNotNull() {
            addCriterion("approvedAmount is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedamountEqualTo(String value) {
            addCriterion("approvedAmount =", value, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountNotEqualTo(String value) {
            addCriterion("approvedAmount <>", value, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountGreaterThan(String value) {
            addCriterion("approvedAmount >", value, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountGreaterThanOrEqualTo(String value) {
            addCriterion("approvedAmount >=", value, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountLessThan(String value) {
            addCriterion("approvedAmount <", value, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountLessThanOrEqualTo(String value) {
            addCriterion("approvedAmount <=", value, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountLike(String value) {
            addCriterion("approvedAmount like", value, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountNotLike(String value) {
            addCriterion("approvedAmount not like", value, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountIn(List<String> values) {
            addCriterion("approvedAmount in", values, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountNotIn(List<String> values) {
            addCriterion("approvedAmount not in", values, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountBetween(String value1, String value2) {
            addCriterion("approvedAmount between", value1, value2, "approvedamount");
            return (Criteria) this;
        }

        public Criteria andApprovedamountNotBetween(String value1, String value2) {
            addCriterion("approvedAmount not between", value1, value2, "approvedamount");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andCorprepaymenttimeIsNull() {
            addCriterion("corpRepaymentTime is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeIsNotNull() {
            addCriterion("corpRepaymentTime is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeEqualTo(String value) {
            addCriterion("corpRepaymentTime =", value, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeNotEqualTo(String value) {
            addCriterion("corpRepaymentTime <>", value, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeGreaterThan(String value) {
            addCriterion("corpRepaymentTime >", value, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentTime >=", value, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeLessThan(String value) {
            addCriterion("corpRepaymentTime <", value, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentTime <=", value, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeLike(String value) {
            addCriterion("corpRepaymentTime like", value, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeNotLike(String value) {
            addCriterion("corpRepaymentTime not like", value, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeIn(List<String> values) {
            addCriterion("corpRepaymentTime in", values, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeNotIn(List<String> values) {
            addCriterion("corpRepaymentTime not in", values, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeBetween(String value1, String value2) {
            addCriterion("corpRepaymentTime between", value1, value2, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentTime not between", value1, value2, "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeIsNull() {
            addCriterion("corpRepaymentAccountCode is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeIsNotNull() {
            addCriterion("corpRepaymentAccountCode is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeEqualTo(String value) {
            addCriterion("corpRepaymentAccountCode =", value, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountCode <>", value, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeGreaterThan(String value) {
            addCriterion("corpRepaymentAccountCode >", value, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountCode >=", value, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeLessThan(String value) {
            addCriterion("corpRepaymentAccountCode <", value, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountCode <=", value, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeLike(String value) {
            addCriterion("corpRepaymentAccountCode like", value, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeNotLike(String value) {
            addCriterion("corpRepaymentAccountCode not like", value, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeIn(List<String> values) {
            addCriterion("corpRepaymentAccountCode in", values, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountCode not in", values, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountCode between", value1, value2, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountCode not between", value1, value2, "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameIsNull() {
            addCriterion("corpRepaymentAccountName is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameIsNotNull() {
            addCriterion("corpRepaymentAccountName is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameEqualTo(String value) {
            addCriterion("corpRepaymentAccountName =", value, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountName <>", value, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameGreaterThan(String value) {
            addCriterion("corpRepaymentAccountName >", value, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountName >=", value, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameLessThan(String value) {
            addCriterion("corpRepaymentAccountName <", value, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountName <=", value, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameLike(String value) {
            addCriterion("corpRepaymentAccountName like", value, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameNotLike(String value) {
            addCriterion("corpRepaymentAccountName not like", value, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameIn(List<String> values) {
            addCriterion("corpRepaymentAccountName in", values, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountName not in", values, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountName between", value1, value2, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountName not between", value1, value2, "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberIsNull() {
            addCriterion("corpRepaymentAccountNumber is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberIsNotNull() {
            addCriterion("corpRepaymentAccountNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberEqualTo(String value) {
            addCriterion("corpRepaymentAccountNumber =", value, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountNumber <>", value, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberGreaterThan(String value) {
            addCriterion("corpRepaymentAccountNumber >", value, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountNumber >=", value, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberLessThan(String value) {
            addCriterion("corpRepaymentAccountNumber <", value, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountNumber <=", value, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberLike(String value) {
            addCriterion("corpRepaymentAccountNumber like", value, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberNotLike(String value) {
            addCriterion("corpRepaymentAccountNumber not like", value, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberIn(List<String> values) {
            addCriterion("corpRepaymentAccountNumber in", values, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountNumber not in", values, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountNumber between", value1, value2, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountNumber not between", value1, value2, "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceIsNull() {
            addCriterion("corpRepaymentAccountProvince is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceIsNotNull() {
            addCriterion("corpRepaymentAccountProvince is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceEqualTo(String value) {
            addCriterion("corpRepaymentAccountProvince =", value, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountProvince <>", value, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceGreaterThan(String value) {
            addCriterion("corpRepaymentAccountProvince >", value, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountProvince >=", value, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceLessThan(String value) {
            addCriterion("corpRepaymentAccountProvince <", value, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountProvince <=", value, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceLike(String value) {
            addCriterion("corpRepaymentAccountProvince like", value, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceNotLike(String value) {
            addCriterion("corpRepaymentAccountProvince not like", value, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceIn(List<String> values) {
            addCriterion("corpRepaymentAccountProvince in", values, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountProvince not in", values, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountProvince between", value1, value2, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountProvince not between", value1, value2, "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityIsNull() {
            addCriterion("corpRepaymentAccountCity is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityIsNotNull() {
            addCriterion("corpRepaymentAccountCity is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityEqualTo(String value) {
            addCriterion("corpRepaymentAccountCity =", value, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountCity <>", value, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityGreaterThan(String value) {
            addCriterion("corpRepaymentAccountCity >", value, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountCity >=", value, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityLessThan(String value) {
            addCriterion("corpRepaymentAccountCity <", value, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountCity <=", value, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityLike(String value) {
            addCriterion("corpRepaymentAccountCity like", value, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityNotLike(String value) {
            addCriterion("corpRepaymentAccountCity not like", value, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityIn(List<String> values) {
            addCriterion("corpRepaymentAccountCity in", values, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountCity not in", values, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountCity between", value1, value2, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountCity not between", value1, value2, "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoIsNull() {
            addCriterion("corpRepaymentAccountBranchNO is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoIsNotNull() {
            addCriterion("corpRepaymentAccountBranchNO is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoEqualTo(String value) {
            addCriterion("corpRepaymentAccountBranchNO =", value, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountBranchNO <>", value, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoGreaterThan(String value) {
            addCriterion("corpRepaymentAccountBranchNO >", value, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountBranchNO >=", value, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoLessThan(String value) {
            addCriterion("corpRepaymentAccountBranchNO <", value, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountBranchNO <=", value, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoLike(String value) {
            addCriterion("corpRepaymentAccountBranchNO like", value, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoNotLike(String value) {
            addCriterion("corpRepaymentAccountBranchNO not like", value, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoIn(List<String> values) {
            addCriterion("corpRepaymentAccountBranchNO in", values, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountBranchNO not in", values, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountBranchNO between", value1, value2, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountBranchNO not between", value1, value2, "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeIsNull() {
            addCriterion("corpRepaymentAccountingSubjectBizCode is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeIsNotNull() {
            addCriterion("corpRepaymentAccountingSubjectBizCode is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectBizCode =", value, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectBizCode <>", value, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeGreaterThan(String value) {
            addCriterion("corpRepaymentAccountingSubjectBizCode >", value, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectBizCode >=", value, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeLessThan(String value) {
            addCriterion("corpRepaymentAccountingSubjectBizCode <", value, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectBizCode <=", value, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeLike(String value) {
            addCriterion("corpRepaymentAccountingSubjectBizCode like", value, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeNotLike(String value) {
            addCriterion("corpRepaymentAccountingSubjectBizCode not like", value, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeIn(List<String> values) {
            addCriterion("corpRepaymentAccountingSubjectBizCode in", values, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountingSubjectBizCode not in", values, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountingSubjectBizCode between", value1, value2, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountingSubjectBizCode not between", value1, value2, "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameIsNull() {
            addCriterion("corpRepaymentAccountingSubjectFullName is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameIsNotNull() {
            addCriterion("corpRepaymentAccountingSubjectFullName is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectFullName =", value, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectFullName <>", value, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameGreaterThan(String value) {
            addCriterion("corpRepaymentAccountingSubjectFullName >", value, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectFullName >=", value, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameLessThan(String value) {
            addCriterion("corpRepaymentAccountingSubjectFullName <", value, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectFullName <=", value, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameLike(String value) {
            addCriterion("corpRepaymentAccountingSubjectFullName like", value, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameNotLike(String value) {
            addCriterion("corpRepaymentAccountingSubjectFullName not like", value, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameIn(List<String> values) {
            addCriterion("corpRepaymentAccountingSubjectFullName in", values, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountingSubjectFullName not in", values, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountingSubjectFullName between", value1, value2, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountingSubjectFullName not between", value1, value2, "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeIsNull() {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeIsNotNull() {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode =", value, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode <>", value, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeGreaterThan(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode >", value, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode >=", value, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeLessThan(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode <", value, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode <=", value, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeLike(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode like", value, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeNotLike(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode not like", value, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeIn(List<String> values) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode in", values, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode not in", values, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode between", value1, value2, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowCode not between", value1, value2, "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameIsNull() {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName is null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameIsNotNull() {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName is not null");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName =", value, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameNotEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName <>", value, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameGreaterThan(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName >", value, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameGreaterThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName >=", value, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameLessThan(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName <", value, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameLessThanOrEqualTo(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName <=", value, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameLike(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName like", value, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameNotLike(String value) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName not like", value, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameIn(List<String> values) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName in", values, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameNotIn(List<String> values) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName not in", values, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName between", value1, value2, "corprepaymentaccountingsubjectcashflowname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameNotBetween(String value1, String value2) {
            addCriterion("corpRepaymentAccountingSubjectCashFlowName not between", value1, value2, "corprepaymentaccountingsubjectcashflowname");
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

        public Criteria andApprovedamountLikeInsensitive(String value) {
            addCriterion("upper(approvedAmount) like", value.toUpperCase(), "approvedamount");
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

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
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

        public Criteria andModifiedatLikeInsensitive(String value) {
            addCriterion("upper(modifiedAt) like", value.toUpperCase(), "modifiedat");
            return (Criteria) this;
        }

        public Criteria andCorprepaymenttimeLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentTime) like", value.toUpperCase(), "corprepaymenttime");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcodeLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountCode) like", value.toUpperCase(), "corprepaymentaccountcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnameLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountName) like", value.toUpperCase(), "corprepaymentaccountname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountnumberLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountNumber) like", value.toUpperCase(), "corprepaymentaccountnumber");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountprovinceLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountProvince) like", value.toUpperCase(), "corprepaymentaccountprovince");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountcityLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountCity) like", value.toUpperCase(), "corprepaymentaccountcity");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountbranchnoLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountBranchNO) like", value.toUpperCase(), "corprepaymentaccountbranchno");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectbizcodeLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountingSubjectBizCode) like", value.toUpperCase(), "corprepaymentaccountingsubjectbizcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectfullnameLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountingSubjectFullName) like", value.toUpperCase(), "corprepaymentaccountingsubjectfullname");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflowcodeLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountingSubjectCashFlowCode) like", value.toUpperCase(), "corprepaymentaccountingsubjectcashflowcode");
            return (Criteria) this;
        }

        public Criteria andCorprepaymentaccountingsubjectcashflownameLikeInsensitive(String value) {
            addCriterion("upper(corpRepaymentAccountingSubjectCashFlowName) like", value.toUpperCase(), "corprepaymentaccountingsubjectcashflowname");
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