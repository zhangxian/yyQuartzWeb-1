package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class TCenterTcpExpenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterTcpExpenseExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFlowkeyIsNull() {
            addCriterion("flowKey is null");
            return (Criteria) this;
        }

        public Criteria andFlowkeyIsNotNull() {
            addCriterion("flowKey is not null");
            return (Criteria) this;
        }

        public Criteria andFlowkeyEqualTo(String value) {
            addCriterion("flowKey =", value, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyNotEqualTo(String value) {
            addCriterion("flowKey <>", value, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyGreaterThan(String value) {
            addCriterion("flowKey >", value, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyGreaterThanOrEqualTo(String value) {
            addCriterion("flowKey >=", value, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyLessThan(String value) {
            addCriterion("flowKey <", value, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyLessThanOrEqualTo(String value) {
            addCriterion("flowKey <=", value, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyLike(String value) {
            addCriterion("flowKey like", value, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyNotLike(String value) {
            addCriterion("flowKey not like", value, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyIn(List<String> values) {
            addCriterion("flowKey in", values, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyNotIn(List<String> values) {
            addCriterion("flowKey not in", values, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyBetween(String value1, String value2) {
            addCriterion("flowKey between", value1, value2, "flowkey");
            return (Criteria) this;
        }

        public Criteria andFlowkeyNotBetween(String value1, String value2) {
            addCriterion("flowKey not between", value1, value2, "flowkey");
            return (Criteria) this;
        }

        public Criteria andStafferidIsNull() {
            addCriterion("stafferId is null");
            return (Criteria) this;
        }

        public Criteria andStafferidIsNotNull() {
            addCriterion("stafferId is not null");
            return (Criteria) this;
        }

        public Criteria andStafferidEqualTo(String value) {
            addCriterion("stafferId =", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidNotEqualTo(String value) {
            addCriterion("stafferId <>", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidGreaterThan(String value) {
            addCriterion("stafferId >", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidGreaterThanOrEqualTo(String value) {
            addCriterion("stafferId >=", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidLessThan(String value) {
            addCriterion("stafferId <", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidLessThanOrEqualTo(String value) {
            addCriterion("stafferId <=", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidLike(String value) {
            addCriterion("stafferId like", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidNotLike(String value) {
            addCriterion("stafferId not like", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidIn(List<String> values) {
            addCriterion("stafferId in", values, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidNotIn(List<String> values) {
            addCriterion("stafferId not in", values, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidBetween(String value1, String value2) {
            addCriterion("stafferId between", value1, value2, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidNotBetween(String value1, String value2) {
            addCriterion("stafferId not between", value1, value2, "stafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidIsNull() {
            addCriterion("borrowStafferId is null");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidIsNotNull() {
            addCriterion("borrowStafferId is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidEqualTo(String value) {
            addCriterion("borrowStafferId =", value, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidNotEqualTo(String value) {
            addCriterion("borrowStafferId <>", value, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidGreaterThan(String value) {
            addCriterion("borrowStafferId >", value, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidGreaterThanOrEqualTo(String value) {
            addCriterion("borrowStafferId >=", value, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidLessThan(String value) {
            addCriterion("borrowStafferId <", value, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidLessThanOrEqualTo(String value) {
            addCriterion("borrowStafferId <=", value, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidLike(String value) {
            addCriterion("borrowStafferId like", value, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidNotLike(String value) {
            addCriterion("borrowStafferId not like", value, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidIn(List<String> values) {
            addCriterion("borrowStafferId in", values, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidNotIn(List<String> values) {
            addCriterion("borrowStafferId not in", values, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidBetween(String value1, String value2) {
            addCriterion("borrowStafferId between", value1, value2, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidNotBetween(String value1, String value2) {
            addCriterion("borrowStafferId not between", value1, value2, "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(String value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(String value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(String value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(String value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLike(String value) {
            addCriterion("departmentId like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotLike(String value) {
            addCriterion("departmentId not like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<String> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<String> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(String value1, String value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(String value1, String value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTicikcountIsNull() {
            addCriterion("ticikCount is null");
            return (Criteria) this;
        }

        public Criteria andTicikcountIsNotNull() {
            addCriterion("ticikCount is not null");
            return (Criteria) this;
        }

        public Criteria andTicikcountEqualTo(Integer value) {
            addCriterion("ticikCount =", value, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountNotEqualTo(Integer value) {
            addCriterion("ticikCount <>", value, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountGreaterThan(Integer value) {
            addCriterion("ticikCount >", value, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticikCount >=", value, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountLessThan(Integer value) {
            addCriterion("ticikCount <", value, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountLessThanOrEqualTo(Integer value) {
            addCriterion("ticikCount <=", value, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountIn(List<Integer> values) {
            addCriterion("ticikCount in", values, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountNotIn(List<Integer> values) {
            addCriterion("ticikCount not in", values, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountBetween(Integer value1, Integer value2) {
            addCriterion("ticikCount between", value1, value2, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andTicikcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ticikCount not between", value1, value2, "ticikcount");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Integer value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Integer value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Integer value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Integer value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Integer> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Integer> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payType not between", value1, value2, "paytype");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRefidIsNull() {
            addCriterion("refId is null");
            return (Criteria) this;
        }

        public Criteria andRefidIsNotNull() {
            addCriterion("refId is not null");
            return (Criteria) this;
        }

        public Criteria andRefidEqualTo(String value) {
            addCriterion("refId =", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidNotEqualTo(String value) {
            addCriterion("refId <>", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidGreaterThan(String value) {
            addCriterion("refId >", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidGreaterThanOrEqualTo(String value) {
            addCriterion("refId >=", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidLessThan(String value) {
            addCriterion("refId <", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidLessThanOrEqualTo(String value) {
            addCriterion("refId <=", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidLike(String value) {
            addCriterion("refId like", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidNotLike(String value) {
            addCriterion("refId not like", value, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidIn(List<String> values) {
            addCriterion("refId in", values, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidNotIn(List<String> values) {
            addCriterion("refId not in", values, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidBetween(String value1, String value2) {
            addCriterion("refId between", value1, value2, "refid");
            return (Criteria) this;
        }

        public Criteria andRefidNotBetween(String value1, String value2) {
            addCriterion("refId not between", value1, value2, "refid");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNull() {
            addCriterion("logTime is null");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNotNull() {
            addCriterion("logTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogtimeEqualTo(String value) {
            addCriterion("logTime =", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotEqualTo(String value) {
            addCriterion("logTime <>", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThan(String value) {
            addCriterion("logTime >", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThanOrEqualTo(String value) {
            addCriterion("logTime >=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThan(String value) {
            addCriterion("logTime <", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThanOrEqualTo(String value) {
            addCriterion("logTime <=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLike(String value) {
            addCriterion("logTime like", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotLike(String value) {
            addCriterion("logTime not like", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeIn(List<String> values) {
            addCriterion("logTime in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotIn(List<String> values) {
            addCriterion("logTime not in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeBetween(String value1, String value2) {
            addCriterion("logTime between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotBetween(String value1, String value2) {
            addCriterion("logTime not between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andSrccityIsNull() {
            addCriterion("srcCity is null");
            return (Criteria) this;
        }

        public Criteria andSrccityIsNotNull() {
            addCriterion("srcCity is not null");
            return (Criteria) this;
        }

        public Criteria andSrccityEqualTo(String value) {
            addCriterion("srcCity =", value, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityNotEqualTo(String value) {
            addCriterion("srcCity <>", value, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityGreaterThan(String value) {
            addCriterion("srcCity >", value, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityGreaterThanOrEqualTo(String value) {
            addCriterion("srcCity >=", value, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityLessThan(String value) {
            addCriterion("srcCity <", value, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityLessThanOrEqualTo(String value) {
            addCriterion("srcCity <=", value, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityLike(String value) {
            addCriterion("srcCity like", value, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityNotLike(String value) {
            addCriterion("srcCity not like", value, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityIn(List<String> values) {
            addCriterion("srcCity in", values, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityNotIn(List<String> values) {
            addCriterion("srcCity not in", values, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityBetween(String value1, String value2) {
            addCriterion("srcCity between", value1, value2, "srccity");
            return (Criteria) this;
        }

        public Criteria andSrccityNotBetween(String value1, String value2) {
            addCriterion("srcCity not between", value1, value2, "srccity");
            return (Criteria) this;
        }

        public Criteria andDestcityIsNull() {
            addCriterion("destCity is null");
            return (Criteria) this;
        }

        public Criteria andDestcityIsNotNull() {
            addCriterion("destCity is not null");
            return (Criteria) this;
        }

        public Criteria andDestcityEqualTo(String value) {
            addCriterion("destCity =", value, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityNotEqualTo(String value) {
            addCriterion("destCity <>", value, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityGreaterThan(String value) {
            addCriterion("destCity >", value, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityGreaterThanOrEqualTo(String value) {
            addCriterion("destCity >=", value, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityLessThan(String value) {
            addCriterion("destCity <", value, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityLessThanOrEqualTo(String value) {
            addCriterion("destCity <=", value, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityLike(String value) {
            addCriterion("destCity like", value, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityNotLike(String value) {
            addCriterion("destCity not like", value, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityIn(List<String> values) {
            addCriterion("destCity in", values, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityNotIn(List<String> values) {
            addCriterion("destCity not in", values, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityBetween(String value1, String value2) {
            addCriterion("destCity between", value1, value2, "destcity");
            return (Criteria) this;
        }

        public Criteria andDestcityNotBetween(String value1, String value2) {
            addCriterion("destCity not between", value1, value2, "destcity");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesIsNull() {
            addCriterion("airplaneCharges is null");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesIsNotNull() {
            addCriterion("airplaneCharges is not null");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesEqualTo(Long value) {
            addCriterion("airplaneCharges =", value, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesNotEqualTo(Long value) {
            addCriterion("airplaneCharges <>", value, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesGreaterThan(Long value) {
            addCriterion("airplaneCharges >", value, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesGreaterThanOrEqualTo(Long value) {
            addCriterion("airplaneCharges >=", value, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesLessThan(Long value) {
            addCriterion("airplaneCharges <", value, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesLessThanOrEqualTo(Long value) {
            addCriterion("airplaneCharges <=", value, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesIn(List<Long> values) {
            addCriterion("airplaneCharges in", values, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesNotIn(List<Long> values) {
            addCriterion("airplaneCharges not in", values, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesBetween(Long value1, Long value2) {
            addCriterion("airplaneCharges between", value1, value2, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andAirplanechargesNotBetween(Long value1, Long value2) {
            addCriterion("airplaneCharges not between", value1, value2, "airplanecharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesIsNull() {
            addCriterion("trainCharges is null");
            return (Criteria) this;
        }

        public Criteria andTrainchargesIsNotNull() {
            addCriterion("trainCharges is not null");
            return (Criteria) this;
        }

        public Criteria andTrainchargesEqualTo(Long value) {
            addCriterion("trainCharges =", value, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesNotEqualTo(Long value) {
            addCriterion("trainCharges <>", value, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesGreaterThan(Long value) {
            addCriterion("trainCharges >", value, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesGreaterThanOrEqualTo(Long value) {
            addCriterion("trainCharges >=", value, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesLessThan(Long value) {
            addCriterion("trainCharges <", value, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesLessThanOrEqualTo(Long value) {
            addCriterion("trainCharges <=", value, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesIn(List<Long> values) {
            addCriterion("trainCharges in", values, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesNotIn(List<Long> values) {
            addCriterion("trainCharges not in", values, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesBetween(Long value1, Long value2) {
            addCriterion("trainCharges between", value1, value2, "traincharges");
            return (Criteria) this;
        }

        public Criteria andTrainchargesNotBetween(Long value1, Long value2) {
            addCriterion("trainCharges not between", value1, value2, "traincharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesIsNull() {
            addCriterion("busCharges is null");
            return (Criteria) this;
        }

        public Criteria andBuschargesIsNotNull() {
            addCriterion("busCharges is not null");
            return (Criteria) this;
        }

        public Criteria andBuschargesEqualTo(Long value) {
            addCriterion("busCharges =", value, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesNotEqualTo(Long value) {
            addCriterion("busCharges <>", value, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesGreaterThan(Long value) {
            addCriterion("busCharges >", value, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesGreaterThanOrEqualTo(Long value) {
            addCriterion("busCharges >=", value, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesLessThan(Long value) {
            addCriterion("busCharges <", value, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesLessThanOrEqualTo(Long value) {
            addCriterion("busCharges <=", value, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesIn(List<Long> values) {
            addCriterion("busCharges in", values, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesNotIn(List<Long> values) {
            addCriterion("busCharges not in", values, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesBetween(Long value1, Long value2) {
            addCriterion("busCharges between", value1, value2, "buscharges");
            return (Criteria) this;
        }

        public Criteria andBuschargesNotBetween(Long value1, Long value2) {
            addCriterion("busCharges not between", value1, value2, "buscharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesIsNull() {
            addCriterion("hotelCharges is null");
            return (Criteria) this;
        }

        public Criteria andHotelchargesIsNotNull() {
            addCriterion("hotelCharges is not null");
            return (Criteria) this;
        }

        public Criteria andHotelchargesEqualTo(Long value) {
            addCriterion("hotelCharges =", value, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesNotEqualTo(Long value) {
            addCriterion("hotelCharges <>", value, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesGreaterThan(Long value) {
            addCriterion("hotelCharges >", value, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesGreaterThanOrEqualTo(Long value) {
            addCriterion("hotelCharges >=", value, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesLessThan(Long value) {
            addCriterion("hotelCharges <", value, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesLessThanOrEqualTo(Long value) {
            addCriterion("hotelCharges <=", value, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesIn(List<Long> values) {
            addCriterion("hotelCharges in", values, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesNotIn(List<Long> values) {
            addCriterion("hotelCharges not in", values, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesBetween(Long value1, Long value2) {
            addCriterion("hotelCharges between", value1, value2, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andHotelchargesNotBetween(Long value1, Long value2) {
            addCriterion("hotelCharges not between", value1, value2, "hotelcharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesIsNull() {
            addCriterion("entertainCharges is null");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesIsNotNull() {
            addCriterion("entertainCharges is not null");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesEqualTo(Long value) {
            addCriterion("entertainCharges =", value, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesNotEqualTo(Long value) {
            addCriterion("entertainCharges <>", value, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesGreaterThan(Long value) {
            addCriterion("entertainCharges >", value, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesGreaterThanOrEqualTo(Long value) {
            addCriterion("entertainCharges >=", value, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesLessThan(Long value) {
            addCriterion("entertainCharges <", value, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesLessThanOrEqualTo(Long value) {
            addCriterion("entertainCharges <=", value, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesIn(List<Long> values) {
            addCriterion("entertainCharges in", values, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesNotIn(List<Long> values) {
            addCriterion("entertainCharges not in", values, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesBetween(Long value1, Long value2) {
            addCriterion("entertainCharges between", value1, value2, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andEntertainchargesNotBetween(Long value1, Long value2) {
            addCriterion("entertainCharges not between", value1, value2, "entertaincharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesIsNull() {
            addCriterion("allowanceCharges is null");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesIsNotNull() {
            addCriterion("allowanceCharges is not null");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesEqualTo(Long value) {
            addCriterion("allowanceCharges =", value, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesNotEqualTo(Long value) {
            addCriterion("allowanceCharges <>", value, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesGreaterThan(Long value) {
            addCriterion("allowanceCharges >", value, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesGreaterThanOrEqualTo(Long value) {
            addCriterion("allowanceCharges >=", value, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesLessThan(Long value) {
            addCriterion("allowanceCharges <", value, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesLessThanOrEqualTo(Long value) {
            addCriterion("allowanceCharges <=", value, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesIn(List<Long> values) {
            addCriterion("allowanceCharges in", values, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesNotIn(List<Long> values) {
            addCriterion("allowanceCharges not in", values, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesBetween(Long value1, Long value2) {
            addCriterion("allowanceCharges between", value1, value2, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andAllowancechargesNotBetween(Long value1, Long value2) {
            addCriterion("allowanceCharges not between", value1, value2, "allowancecharges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesIsNull() {
            addCriterion("other1Charges is null");
            return (Criteria) this;
        }

        public Criteria andOther1chargesIsNotNull() {
            addCriterion("other1Charges is not null");
            return (Criteria) this;
        }

        public Criteria andOther1chargesEqualTo(Long value) {
            addCriterion("other1Charges =", value, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesNotEqualTo(Long value) {
            addCriterion("other1Charges <>", value, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesGreaterThan(Long value) {
            addCriterion("other1Charges >", value, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesGreaterThanOrEqualTo(Long value) {
            addCriterion("other1Charges >=", value, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesLessThan(Long value) {
            addCriterion("other1Charges <", value, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesLessThanOrEqualTo(Long value) {
            addCriterion("other1Charges <=", value, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesIn(List<Long> values) {
            addCriterion("other1Charges in", values, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesNotIn(List<Long> values) {
            addCriterion("other1Charges not in", values, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesBetween(Long value1, Long value2) {
            addCriterion("other1Charges between", value1, value2, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther1chargesNotBetween(Long value1, Long value2) {
            addCriterion("other1Charges not between", value1, value2, "other1charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesIsNull() {
            addCriterion("other2Charges is null");
            return (Criteria) this;
        }

        public Criteria andOther2chargesIsNotNull() {
            addCriterion("other2Charges is not null");
            return (Criteria) this;
        }

        public Criteria andOther2chargesEqualTo(Long value) {
            addCriterion("other2Charges =", value, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesNotEqualTo(Long value) {
            addCriterion("other2Charges <>", value, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesGreaterThan(Long value) {
            addCriterion("other2Charges >", value, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesGreaterThanOrEqualTo(Long value) {
            addCriterion("other2Charges >=", value, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesLessThan(Long value) {
            addCriterion("other2Charges <", value, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesLessThanOrEqualTo(Long value) {
            addCriterion("other2Charges <=", value, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesIn(List<Long> values) {
            addCriterion("other2Charges in", values, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesNotIn(List<Long> values) {
            addCriterion("other2Charges not in", values, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesBetween(Long value1, Long value2) {
            addCriterion("other2Charges between", value1, value2, "other2charges");
            return (Criteria) this;
        }

        public Criteria andOther2chargesNotBetween(Long value1, Long value2) {
            addCriterion("other2Charges not between", value1, value2, "other2charges");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("beginDate is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("beginDate is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(String value) {
            addCriterion("beginDate =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(String value) {
            addCriterion("beginDate <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(String value) {
            addCriterion("beginDate >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(String value) {
            addCriterion("beginDate >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(String value) {
            addCriterion("beginDate <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(String value) {
            addCriterion("beginDate <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLike(String value) {
            addCriterion("beginDate like", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotLike(String value) {
            addCriterion("beginDate not like", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<String> values) {
            addCriterion("beginDate in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<String> values) {
            addCriterion("beginDate not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(String value1, String value2) {
            addCriterion("beginDate between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(String value1, String value2) {
            addCriterion("beginDate not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("endDate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("endDate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalIsNull() {
            addCriterion("borrowTotal is null");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalIsNotNull() {
            addCriterion("borrowTotal is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalEqualTo(Long value) {
            addCriterion("borrowTotal =", value, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalNotEqualTo(Long value) {
            addCriterion("borrowTotal <>", value, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalGreaterThan(Long value) {
            addCriterion("borrowTotal >", value, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalGreaterThanOrEqualTo(Long value) {
            addCriterion("borrowTotal >=", value, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalLessThan(Long value) {
            addCriterion("borrowTotal <", value, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalLessThanOrEqualTo(Long value) {
            addCriterion("borrowTotal <=", value, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalIn(List<Long> values) {
            addCriterion("borrowTotal in", values, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalNotIn(List<Long> values) {
            addCriterion("borrowTotal not in", values, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalBetween(Long value1, Long value2) {
            addCriterion("borrowTotal between", value1, value2, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andBorrowtotalNotBetween(Long value1, Long value2) {
            addCriterion("borrowTotal not between", value1, value2, "borrowtotal");
            return (Criteria) this;
        }

        public Criteria andLastmoneyIsNull() {
            addCriterion("lastMoney is null");
            return (Criteria) this;
        }

        public Criteria andLastmoneyIsNotNull() {
            addCriterion("lastMoney is not null");
            return (Criteria) this;
        }

        public Criteria andLastmoneyEqualTo(Long value) {
            addCriterion("lastMoney =", value, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyNotEqualTo(Long value) {
            addCriterion("lastMoney <>", value, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyGreaterThan(Long value) {
            addCriterion("lastMoney >", value, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("lastMoney >=", value, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyLessThan(Long value) {
            addCriterion("lastMoney <", value, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyLessThanOrEqualTo(Long value) {
            addCriterion("lastMoney <=", value, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyIn(List<Long> values) {
            addCriterion("lastMoney in", values, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyNotIn(List<Long> values) {
            addCriterion("lastMoney not in", values, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyBetween(Long value1, Long value2) {
            addCriterion("lastMoney between", value1, value2, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andLastmoneyNotBetween(Long value1, Long value2) {
            addCriterion("lastMoney not between", value1, value2, "lastmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyIsNull() {
            addCriterion("refMoney is null");
            return (Criteria) this;
        }

        public Criteria andRefmoneyIsNotNull() {
            addCriterion("refMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRefmoneyEqualTo(Long value) {
            addCriterion("refMoney =", value, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyNotEqualTo(Long value) {
            addCriterion("refMoney <>", value, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyGreaterThan(Long value) {
            addCriterion("refMoney >", value, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("refMoney >=", value, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyLessThan(Long value) {
            addCriterion("refMoney <", value, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyLessThanOrEqualTo(Long value) {
            addCriterion("refMoney <=", value, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyIn(List<Long> values) {
            addCriterion("refMoney in", values, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyNotIn(List<Long> values) {
            addCriterion("refMoney not in", values, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyBetween(Long value1, Long value2) {
            addCriterion("refMoney between", value1, value2, "refmoney");
            return (Criteria) this;
        }

        public Criteria andRefmoneyNotBetween(Long value1, Long value2) {
            addCriterion("refMoney not between", value1, value2, "refmoney");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("unitName is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("unitName is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("unitName =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("unitName <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("unitName >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("unitName >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("unitName <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("unitName <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("unitName like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("unitName not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("unitName in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("unitName not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("unitName between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("unitName not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCustomernamesIsNull() {
            addCriterion("customerNames is null");
            return (Criteria) this;
        }

        public Criteria andCustomernamesIsNotNull() {
            addCriterion("customerNames is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernamesEqualTo(String value) {
            addCriterion("customerNames =", value, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesNotEqualTo(String value) {
            addCriterion("customerNames <>", value, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesGreaterThan(String value) {
            addCriterion("customerNames >", value, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesGreaterThanOrEqualTo(String value) {
            addCriterion("customerNames >=", value, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesLessThan(String value) {
            addCriterion("customerNames <", value, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesLessThanOrEqualTo(String value) {
            addCriterion("customerNames <=", value, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesLike(String value) {
            addCriterion("customerNames like", value, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesNotLike(String value) {
            addCriterion("customerNames not like", value, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesIn(List<String> values) {
            addCriterion("customerNames in", values, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesNotIn(List<String> values) {
            addCriterion("customerNames not in", values, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesBetween(String value1, String value2) {
            addCriterion("customerNames between", value1, value2, "customernames");
            return (Criteria) this;
        }

        public Criteria andCustomernamesNotBetween(String value1, String value2) {
            addCriterion("customerNames not between", value1, value2, "customernames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesIsNull() {
            addCriterion("aroundNames is null");
            return (Criteria) this;
        }

        public Criteria andAroundnamesIsNotNull() {
            addCriterion("aroundNames is not null");
            return (Criteria) this;
        }

        public Criteria andAroundnamesEqualTo(String value) {
            addCriterion("aroundNames =", value, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesNotEqualTo(String value) {
            addCriterion("aroundNames <>", value, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesGreaterThan(String value) {
            addCriterion("aroundNames >", value, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesGreaterThanOrEqualTo(String value) {
            addCriterion("aroundNames >=", value, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesLessThan(String value) {
            addCriterion("aroundNames <", value, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesLessThanOrEqualTo(String value) {
            addCriterion("aroundNames <=", value, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesLike(String value) {
            addCriterion("aroundNames like", value, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesNotLike(String value) {
            addCriterion("aroundNames not like", value, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesIn(List<String> values) {
            addCriterion("aroundNames in", values, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesNotIn(List<String> values) {
            addCriterion("aroundNames not in", values, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesBetween(String value1, String value2) {
            addCriterion("aroundNames between", value1, value2, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesNotBetween(String value1, String value2) {
            addCriterion("aroundNames not between", value1, value2, "aroundnames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesIsNull() {
            addCriterion("companyStafferNames is null");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesIsNotNull() {
            addCriterion("companyStafferNames is not null");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesEqualTo(String value) {
            addCriterion("companyStafferNames =", value, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesNotEqualTo(String value) {
            addCriterion("companyStafferNames <>", value, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesGreaterThan(String value) {
            addCriterion("companyStafferNames >", value, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesGreaterThanOrEqualTo(String value) {
            addCriterion("companyStafferNames >=", value, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesLessThan(String value) {
            addCriterion("companyStafferNames <", value, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesLessThanOrEqualTo(String value) {
            addCriterion("companyStafferNames <=", value, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesLike(String value) {
            addCriterion("companyStafferNames like", value, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesNotLike(String value) {
            addCriterion("companyStafferNames not like", value, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesIn(List<String> values) {
            addCriterion("companyStafferNames in", values, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesNotIn(List<String> values) {
            addCriterion("companyStafferNames not in", values, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesBetween(String value1, String value2) {
            addCriterion("companyStafferNames between", value1, value2, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesNotBetween(String value1, String value2) {
            addCriterion("companyStafferNames not between", value1, value2, "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("stype is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("stype is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(Integer value) {
            addCriterion("stype =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(Integer value) {
            addCriterion("stype <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(Integer value) {
            addCriterion("stype >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stype >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(Integer value) {
            addCriterion("stype <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(Integer value) {
            addCriterion("stype <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<Integer> values) {
            addCriterion("stype in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<Integer> values) {
            addCriterion("stype not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(Integer value1, Integer value2) {
            addCriterion("stype between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(Integer value1, Integer value2) {
            addCriterion("stype not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeIsNull() {
            addCriterion("specialType is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeIsNotNull() {
            addCriterion("specialType is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeEqualTo(Integer value) {
            addCriterion("specialType =", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeNotEqualTo(Integer value) {
            addCriterion("specialType <>", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeGreaterThan(Integer value) {
            addCriterion("specialType >", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialType >=", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeLessThan(Integer value) {
            addCriterion("specialType <", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeLessThanOrEqualTo(Integer value) {
            addCriterion("specialType <=", value, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeIn(List<Integer> values) {
            addCriterion("specialType in", values, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeNotIn(List<Integer> values) {
            addCriterion("specialType not in", values, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeBetween(Integer value1, Integer value2) {
            addCriterion("specialType between", value1, value2, "specialtype");
            return (Criteria) this;
        }

        public Criteria andSpecialtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("specialType not between", value1, value2, "specialtype");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNull() {
            addCriterion("dutyId is null");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNotNull() {
            addCriterion("dutyId is not null");
            return (Criteria) this;
        }

        public Criteria andDutyidEqualTo(String value) {
            addCriterion("dutyId =", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotEqualTo(String value) {
            addCriterion("dutyId <>", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThan(String value) {
            addCriterion("dutyId >", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThanOrEqualTo(String value) {
            addCriterion("dutyId >=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThan(String value) {
            addCriterion("dutyId <", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThanOrEqualTo(String value) {
            addCriterion("dutyId <=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLike(String value) {
            addCriterion("dutyId like", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotLike(String value) {
            addCriterion("dutyId not like", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidIn(List<String> values) {
            addCriterion("dutyId in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotIn(List<String> values) {
            addCriterion("dutyId not in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidBetween(String value1, String value2) {
            addCriterion("dutyId between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotBetween(String value1, String value2) {
            addCriterion("dutyId not between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andComplianceIsNull() {
            addCriterion("compliance is null");
            return (Criteria) this;
        }

        public Criteria andComplianceIsNotNull() {
            addCriterion("compliance is not null");
            return (Criteria) this;
        }

        public Criteria andComplianceEqualTo(String value) {
            addCriterion("compliance =", value, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceNotEqualTo(String value) {
            addCriterion("compliance <>", value, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceGreaterThan(String value) {
            addCriterion("compliance >", value, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceGreaterThanOrEqualTo(String value) {
            addCriterion("compliance >=", value, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceLessThan(String value) {
            addCriterion("compliance <", value, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceLessThanOrEqualTo(String value) {
            addCriterion("compliance <=", value, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceLike(String value) {
            addCriterion("compliance like", value, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceNotLike(String value) {
            addCriterion("compliance not like", value, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceIn(List<String> values) {
            addCriterion("compliance in", values, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceNotIn(List<String> values) {
            addCriterion("compliance not in", values, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceBetween(String value1, String value2) {
            addCriterion("compliance between", value1, value2, "compliance");
            return (Criteria) this;
        }

        public Criteria andComplianceNotBetween(String value1, String value2) {
            addCriterion("compliance not between", value1, value2, "compliance");
            return (Criteria) this;
        }

        public Criteria andMarketingflagIsNull() {
            addCriterion("marketingFlag is null");
            return (Criteria) this;
        }

        public Criteria andMarketingflagIsNotNull() {
            addCriterion("marketingFlag is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingflagEqualTo(Integer value) {
            addCriterion("marketingFlag =", value, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagNotEqualTo(Integer value) {
            addCriterion("marketingFlag <>", value, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagGreaterThan(Integer value) {
            addCriterion("marketingFlag >", value, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("marketingFlag >=", value, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagLessThan(Integer value) {
            addCriterion("marketingFlag <", value, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagLessThanOrEqualTo(Integer value) {
            addCriterion("marketingFlag <=", value, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagIn(List<Integer> values) {
            addCriterion("marketingFlag in", values, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagNotIn(List<Integer> values) {
            addCriterion("marketingFlag not in", values, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagBetween(Integer value1, Integer value2) {
            addCriterion("marketingFlag between", value1, value2, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andMarketingflagNotBetween(Integer value1, Integer value2) {
            addCriterion("marketingFlag not between", value1, value2, "marketingflag");
            return (Criteria) this;
        }

        public Criteria andProcesstimeIsNull() {
            addCriterion("processTime is null");
            return (Criteria) this;
        }

        public Criteria andProcesstimeIsNotNull() {
            addCriterion("processTime is not null");
            return (Criteria) this;
        }

        public Criteria andProcesstimeEqualTo(String value) {
            addCriterion("processTime =", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeNotEqualTo(String value) {
            addCriterion("processTime <>", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeGreaterThan(String value) {
            addCriterion("processTime >", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeGreaterThanOrEqualTo(String value) {
            addCriterion("processTime >=", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeLessThan(String value) {
            addCriterion("processTime <", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeLessThanOrEqualTo(String value) {
            addCriterion("processTime <=", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeLike(String value) {
            addCriterion("processTime like", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeNotLike(String value) {
            addCriterion("processTime not like", value, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeIn(List<String> values) {
            addCriterion("processTime in", values, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeNotIn(List<String> values) {
            addCriterion("processTime not in", values, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeBetween(String value1, String value2) {
            addCriterion("processTime between", value1, value2, "processtime");
            return (Criteria) this;
        }

        public Criteria andProcesstimeNotBetween(String value1, String value2) {
            addCriterion("processTime not between", value1, value2, "processtime");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNull() {
            addCriterion("bankprovince is null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNotNull() {
            addCriterion("bankprovince is not null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceEqualTo(String value) {
            addCriterion("bankprovince =", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotEqualTo(String value) {
            addCriterion("bankprovince <>", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThan(String value) {
            addCriterion("bankprovince >", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("bankprovince >=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThan(String value) {
            addCriterion("bankprovince <", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThanOrEqualTo(String value) {
            addCriterion("bankprovince <=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLike(String value) {
            addCriterion("bankprovince like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotLike(String value) {
            addCriterion("bankprovince not like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIn(List<String> values) {
            addCriterion("bankprovince in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotIn(List<String> values) {
            addCriterion("bankprovince not in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceBetween(String value1, String value2) {
            addCriterion("bankprovince between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotBetween(String value1, String value2) {
            addCriterion("bankprovince not between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNull() {
            addCriterion("bankcity is null");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNotNull() {
            addCriterion("bankcity is not null");
            return (Criteria) this;
        }

        public Criteria andBankcityEqualTo(String value) {
            addCriterion("bankcity =", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotEqualTo(String value) {
            addCriterion("bankcity <>", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThan(String value) {
            addCriterion("bankcity >", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThanOrEqualTo(String value) {
            addCriterion("bankcity >=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThan(String value) {
            addCriterion("bankcity <", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThanOrEqualTo(String value) {
            addCriterion("bankcity <=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLike(String value) {
            addCriterion("bankcity like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotLike(String value) {
            addCriterion("bankcity not like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityIn(List<String> values) {
            addCriterion("bankcity in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotIn(List<String> values) {
            addCriterion("bankcity not in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityBetween(String value1, String value2) {
            addCriterion("bankcity between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotBetween(String value1, String value2) {
            addCriterion("bankcity not between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andFlowkeyLikeInsensitive(String value) {
            addCriterion("upper(flowKey) like", value.toUpperCase(), "flowkey");
            return (Criteria) this;
        }

        public Criteria andStafferidLikeInsensitive(String value) {
            addCriterion("upper(stafferId) like", value.toUpperCase(), "stafferid");
            return (Criteria) this;
        }

        public Criteria andBorrowstafferidLikeInsensitive(String value) {
            addCriterion("upper(borrowStafferId) like", value.toUpperCase(), "borrowstafferid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLikeInsensitive(String value) {
            addCriterion("upper(departmentId) like", value.toUpperCase(), "departmentid");
            return (Criteria) this;
        }

        public Criteria andRefidLikeInsensitive(String value) {
            addCriterion("upper(refId) like", value.toUpperCase(), "refid");
            return (Criteria) this;
        }

        public Criteria andLogtimeLikeInsensitive(String value) {
            addCriterion("upper(logTime) like", value.toUpperCase(), "logtime");
            return (Criteria) this;
        }

        public Criteria andSrccityLikeInsensitive(String value) {
            addCriterion("upper(srcCity) like", value.toUpperCase(), "srccity");
            return (Criteria) this;
        }

        public Criteria andDestcityLikeInsensitive(String value) {
            addCriterion("upper(destCity) like", value.toUpperCase(), "destcity");
            return (Criteria) this;
        }

        public Criteria andBegindateLikeInsensitive(String value) {
            addCriterion("upper(beginDate) like", value.toUpperCase(), "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateLikeInsensitive(String value) {
            addCriterion("upper(endDate) like", value.toUpperCase(), "enddate");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andUnitnameLikeInsensitive(String value) {
            addCriterion("upper(unitName) like", value.toUpperCase(), "unitname");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andCustomernamesLikeInsensitive(String value) {
            addCriterion("upper(customerNames) like", value.toUpperCase(), "customernames");
            return (Criteria) this;
        }

        public Criteria andAroundnamesLikeInsensitive(String value) {
            addCriterion("upper(aroundNames) like", value.toUpperCase(), "aroundnames");
            return (Criteria) this;
        }

        public Criteria andCompanystaffernamesLikeInsensitive(String value) {
            addCriterion("upper(companyStafferNames) like", value.toUpperCase(), "companystaffernames");
            return (Criteria) this;
        }

        public Criteria andDutyidLikeInsensitive(String value) {
            addCriterion("upper(dutyId) like", value.toUpperCase(), "dutyid");
            return (Criteria) this;
        }

        public Criteria andComplianceLikeInsensitive(String value) {
            addCriterion("upper(compliance) like", value.toUpperCase(), "compliance");
            return (Criteria) this;
        }

        public Criteria andProcesstimeLikeInsensitive(String value) {
            addCriterion("upper(processTime) like", value.toUpperCase(), "processtime");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLikeInsensitive(String value) {
            addCriterion("upper(bankprovince) like", value.toUpperCase(), "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankcityLikeInsensitive(String value) {
            addCriterion("upper(bankcity) like", value.toUpperCase(), "bankcity");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
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