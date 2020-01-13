package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class MayCurCorpSubmitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public MayCurCorpSubmitExample() {
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

        public Criteria andCoverUserCodeIsNull() {
            addCriterion("cover_user_code is null");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeIsNotNull() {
            addCriterion("cover_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeEqualTo(String value) {
            addCriterion("cover_user_code =", value, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeNotEqualTo(String value) {
            addCriterion("cover_user_code <>", value, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeGreaterThan(String value) {
            addCriterion("cover_user_code >", value, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cover_user_code >=", value, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeLessThan(String value) {
            addCriterion("cover_user_code <", value, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeLessThanOrEqualTo(String value) {
            addCriterion("cover_user_code <=", value, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeLike(String value) {
            addCriterion("cover_user_code like", value, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeNotLike(String value) {
            addCriterion("cover_user_code not like", value, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeIn(List<String> values) {
            addCriterion("cover_user_code in", values, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeNotIn(List<String> values) {
            addCriterion("cover_user_code not in", values, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeBetween(String value1, String value2) {
            addCriterion("cover_user_code between", value1, value2, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverUserCodeNotBetween(String value1, String value2) {
            addCriterion("cover_user_code not between", value1, value2, "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverusernameIsNull() {
            addCriterion("coverUserName is null");
            return (Criteria) this;
        }

        public Criteria andCoverusernameIsNotNull() {
            addCriterion("coverUserName is not null");
            return (Criteria) this;
        }

        public Criteria andCoverusernameEqualTo(String value) {
            addCriterion("coverUserName =", value, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameNotEqualTo(String value) {
            addCriterion("coverUserName <>", value, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameGreaterThan(String value) {
            addCriterion("coverUserName >", value, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameGreaterThanOrEqualTo(String value) {
            addCriterion("coverUserName >=", value, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameLessThan(String value) {
            addCriterion("coverUserName <", value, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameLessThanOrEqualTo(String value) {
            addCriterion("coverUserName <=", value, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameLike(String value) {
            addCriterion("coverUserName like", value, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameNotLike(String value) {
            addCriterion("coverUserName not like", value, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameIn(List<String> values) {
            addCriterion("coverUserName in", values, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameNotIn(List<String> values) {
            addCriterion("coverUserName not in", values, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameBetween(String value1, String value2) {
            addCriterion("coverUserName between", value1, value2, "coverusername");
            return (Criteria) this;
        }

        public Criteria andCoverusernameNotBetween(String value1, String value2) {
            addCriterion("coverUserName not between", value1, value2, "coverusername");
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

        public Criteria andPayAmountIsNull() {
            addCriterion("pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(String value) {
            addCriterion("pay_amount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(String value) {
            addCriterion("pay_amount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(String value) {
            addCriterion("pay_amount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(String value) {
            addCriterion("pay_amount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(String value) {
            addCriterion("pay_amount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(String value) {
            addCriterion("pay_amount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLike(String value) {
            addCriterion("pay_amount like", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotLike(String value) {
            addCriterion("pay_amount not like", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<String> values) {
            addCriterion("pay_amount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<String> values) {
            addCriterion("pay_amount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(String value1, String value2) {
            addCriterion("pay_amount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(String value1, String value2) {
            addCriterion("pay_amount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("pay_method like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("pay_method not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
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

        public Criteria andContractidIsNull() {
            addCriterion("contractId is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("contractId is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(String value) {
            addCriterion("contractId =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(String value) {
            addCriterion("contractId <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(String value) {
            addCriterion("contractId >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(String value) {
            addCriterion("contractId >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(String value) {
            addCriterion("contractId <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(String value) {
            addCriterion("contractId <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLike(String value) {
            addCriterion("contractId like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotLike(String value) {
            addCriterion("contractId not like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<String> values) {
            addCriterion("contractId in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<String> values) {
            addCriterion("contractId not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(String value1, String value2) {
            addCriterion("contractId between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(String value1, String value2) {
            addCriterion("contractId not between", value1, value2, "contractid");
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

        public Criteria andDeleteflagIsNull() {
            addCriterion("deleteFlag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("deleteFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("deleteFlag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("deleteFlag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("deleteFlag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("deleteFlag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("deleteFlag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("deleteFlag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLike(String value) {
            addCriterion("deleteFlag like", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("deleteFlag not like", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("deleteFlag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("deleteFlag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("deleteFlag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("deleteFlag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andExportflagIsNull() {
            addCriterion("exportflag is null");
            return (Criteria) this;
        }

        public Criteria andExportflagIsNotNull() {
            addCriterion("exportflag is not null");
            return (Criteria) this;
        }

        public Criteria andExportflagEqualTo(Integer value) {
            addCriterion("exportflag =", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotEqualTo(Integer value) {
            addCriterion("exportflag <>", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagGreaterThan(Integer value) {
            addCriterion("exportflag >", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("exportflag >=", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagLessThan(Integer value) {
            addCriterion("exportflag <", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagLessThanOrEqualTo(Integer value) {
            addCriterion("exportflag <=", value, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagIn(List<Integer> values) {
            addCriterion("exportflag in", values, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotIn(List<Integer> values) {
            addCriterion("exportflag not in", values, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagBetween(Integer value1, Integer value2) {
            addCriterion("exportflag between", value1, value2, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExportflagNotBetween(Integer value1, Integer value2) {
            addCriterion("exportflag not between", value1, value2, "exportflag");
            return (Criteria) this;
        }

        public Criteria andExporttimeIsNull() {
            addCriterion("exporttime is null");
            return (Criteria) this;
        }

        public Criteria andExporttimeIsNotNull() {
            addCriterion("exporttime is not null");
            return (Criteria) this;
        }

        public Criteria andExporttimeEqualTo(String value) {
            addCriterion("exporttime =", value, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeNotEqualTo(String value) {
            addCriterion("exporttime <>", value, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeGreaterThan(String value) {
            addCriterion("exporttime >", value, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeGreaterThanOrEqualTo(String value) {
            addCriterion("exporttime >=", value, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeLessThan(String value) {
            addCriterion("exporttime <", value, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeLessThanOrEqualTo(String value) {
            addCriterion("exporttime <=", value, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeLike(String value) {
            addCriterion("exporttime like", value, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeNotLike(String value) {
            addCriterion("exporttime not like", value, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeIn(List<String> values) {
            addCriterion("exporttime in", values, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeNotIn(List<String> values) {
            addCriterion("exporttime not in", values, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeBetween(String value1, String value2) {
            addCriterion("exporttime between", value1, value2, "exporttime");
            return (Criteria) this;
        }

        public Criteria andExporttimeNotBetween(String value1, String value2) {
            addCriterion("exporttime not between", value1, value2, "exporttime");
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

        public Criteria andCreateflagIsNull() {
            addCriterion("createflag is null");
            return (Criteria) this;
        }

        public Criteria andCreateflagIsNotNull() {
            addCriterion("createflag is not null");
            return (Criteria) this;
        }

        public Criteria andCreateflagEqualTo(Integer value) {
            addCriterion("createflag =", value, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagNotEqualTo(Integer value) {
            addCriterion("createflag <>", value, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagGreaterThan(Integer value) {
            addCriterion("createflag >", value, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("createflag >=", value, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagLessThan(Integer value) {
            addCriterion("createflag <", value, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagLessThanOrEqualTo(Integer value) {
            addCriterion("createflag <=", value, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagIn(List<Integer> values) {
            addCriterion("createflag in", values, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagNotIn(List<Integer> values) {
            addCriterion("createflag not in", values, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagBetween(Integer value1, Integer value2) {
            addCriterion("createflag between", value1, value2, "createflag");
            return (Criteria) this;
        }

        public Criteria andCreateflagNotBetween(Integer value1, Integer value2) {
            addCriterion("createflag not between", value1, value2, "createflag");
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

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNull() {
            addCriterion("paymentstatus is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIsNotNull() {
            addCriterion("paymentstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusEqualTo(Integer value) {
            addCriterion("paymentstatus =", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotEqualTo(Integer value) {
            addCriterion("paymentstatus <>", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThan(Integer value) {
            addCriterion("paymentstatus >", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentstatus >=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThan(Integer value) {
            addCriterion("paymentstatus <", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusLessThanOrEqualTo(Integer value) {
            addCriterion("paymentstatus <=", value, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusIn(List<Integer> values) {
            addCriterion("paymentstatus in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotIn(List<Integer> values) {
            addCriterion("paymentstatus not in", values, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusBetween(Integer value1, Integer value2) {
            addCriterion("paymentstatus between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentstatus not between", value1, value2, "paymentstatus");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIsNull() {
            addCriterion("paymenttime is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIsNotNull() {
            addCriterion("paymenttime is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeEqualTo(String value) {
            addCriterion("paymenttime =", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotEqualTo(String value) {
            addCriterion("paymenttime <>", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeGreaterThan(String value) {
            addCriterion("paymenttime >", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("paymenttime >=", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLessThan(String value) {
            addCriterion("paymenttime <", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLessThanOrEqualTo(String value) {
            addCriterion("paymenttime <=", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLike(String value) {
            addCriterion("paymenttime like", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotLike(String value) {
            addCriterion("paymenttime not like", value, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeIn(List<String> values) {
            addCriterion("paymenttime in", values, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotIn(List<String> values) {
            addCriterion("paymenttime not in", values, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeBetween(String value1, String value2) {
            addCriterion("paymenttime between", value1, value2, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeNotBetween(String value1, String value2) {
            addCriterion("paymenttime not between", value1, value2, "paymenttime");
            return (Criteria) this;
        }

        public Criteria andOaorderidIsNull() {
            addCriterion("oaorderid is null");
            return (Criteria) this;
        }

        public Criteria andOaorderidIsNotNull() {
            addCriterion("oaorderid is not null");
            return (Criteria) this;
        }

        public Criteria andOaorderidEqualTo(String value) {
            addCriterion("oaorderid =", value, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidNotEqualTo(String value) {
            addCriterion("oaorderid <>", value, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidGreaterThan(String value) {
            addCriterion("oaorderid >", value, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidGreaterThanOrEqualTo(String value) {
            addCriterion("oaorderid >=", value, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidLessThan(String value) {
            addCriterion("oaorderid <", value, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidLessThanOrEqualTo(String value) {
            addCriterion("oaorderid <=", value, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidLike(String value) {
            addCriterion("oaorderid like", value, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidNotLike(String value) {
            addCriterion("oaorderid not like", value, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidIn(List<String> values) {
            addCriterion("oaorderid in", values, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidNotIn(List<String> values) {
            addCriterion("oaorderid not in", values, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidBetween(String value1, String value2) {
            addCriterion("oaorderid between", value1, value2, "oaorderid");
            return (Criteria) this;
        }

        public Criteria andOaorderidNotBetween(String value1, String value2) {
            addCriterion("oaorderid not between", value1, value2, "oaorderid");
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

        public Criteria andFormsubtypeLikeInsensitive(String value) {
            addCriterion("upper(formSubType) like", value.toUpperCase(), "formsubtype");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME) like", value.toUpperCase(), "name");
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

        public Criteria andCoverUserCodeLikeInsensitive(String value) {
            addCriterion("upper(cover_user_code) like", value.toUpperCase(), "coverUserCode");
            return (Criteria) this;
        }

        public Criteria andCoverusernameLikeInsensitive(String value) {
            addCriterion("upper(coverUserName) like", value.toUpperCase(), "coverusername");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andPayAmountLikeInsensitive(String value) {
            addCriterion("upper(pay_amount) like", value.toUpperCase(), "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayMethodLikeInsensitive(String value) {
            addCriterion("upper(pay_method) like", value.toUpperCase(), "payMethod");
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

        public Criteria andContractidLikeInsensitive(String value) {
            addCriterion("upper(contractId) like", value.toUpperCase(), "contractid");
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

        public Criteria andDeleteflagLikeInsensitive(String value) {
            addCriterion("upper(deleteFlag) like", value.toUpperCase(), "deleteflag");
            return (Criteria) this;
        }

        public Criteria andExporttimeLikeInsensitive(String value) {
            addCriterion("upper(exporttime) like", value.toUpperCase(), "exporttime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLikeInsensitive(String value) {
            addCriterion("upper(savetime) like", value.toUpperCase(), "savetime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLikeInsensitive(String value) {
            addCriterion("upper(createtime) like", value.toUpperCase(), "createtime");
            return (Criteria) this;
        }

        public Criteria andPaymenttimeLikeInsensitive(String value) {
            addCriterion("upper(paymenttime) like", value.toUpperCase(), "paymenttime");
            return (Criteria) this;
        }

        public Criteria andOaorderidLikeInsensitive(String value) {
            addCriterion("upper(oaorderid) like", value.toUpperCase(), "oaorderid");
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