package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class TCenterFinanceItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterFinanceItemExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPareidIsNull() {
            addCriterion("pareId is null");
            return (Criteria) this;
        }

        public Criteria andPareidIsNotNull() {
            addCriterion("pareId is not null");
            return (Criteria) this;
        }

        public Criteria andPareidEqualTo(String value) {
            addCriterion("pareId =", value, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidNotEqualTo(String value) {
            addCriterion("pareId <>", value, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidGreaterThan(String value) {
            addCriterion("pareId >", value, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidGreaterThanOrEqualTo(String value) {
            addCriterion("pareId >=", value, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidLessThan(String value) {
            addCriterion("pareId <", value, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidLessThanOrEqualTo(String value) {
            addCriterion("pareId <=", value, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidLike(String value) {
            addCriterion("pareId like", value, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidNotLike(String value) {
            addCriterion("pareId not like", value, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidIn(List<String> values) {
            addCriterion("pareId in", values, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidNotIn(List<String> values) {
            addCriterion("pareId not in", values, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidBetween(String value1, String value2) {
            addCriterion("pareId between", value1, value2, "pareid");
            return (Criteria) this;
        }

        public Criteria andPareidNotBetween(String value1, String value2) {
            addCriterion("pareId not between", value1, value2, "pareid");
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

        public Criteria andCreatetypeIsNull() {
            addCriterion("createType is null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNotNull() {
            addCriterion("createType is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeEqualTo(Integer value) {
            addCriterion("createType =", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotEqualTo(Integer value) {
            addCriterion("createType <>", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThan(Integer value) {
            addCriterion("createType >", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createType >=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThan(Integer value) {
            addCriterion("createType <", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThanOrEqualTo(Integer value) {
            addCriterion("createType <=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIn(List<Integer> values) {
            addCriterion("createType in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotIn(List<Integer> values) {
            addCriterion("createType not in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeBetween(Integer value1, Integer value2) {
            addCriterion("createType between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("createType not between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andForwardIsNull() {
            addCriterion("forward is null");
            return (Criteria) this;
        }

        public Criteria andForwardIsNotNull() {
            addCriterion("forward is not null");
            return (Criteria) this;
        }

        public Criteria andForwardEqualTo(Integer value) {
            addCriterion("forward =", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotEqualTo(Integer value) {
            addCriterion("forward <>", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardGreaterThan(Integer value) {
            addCriterion("forward >", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("forward >=", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLessThan(Integer value) {
            addCriterion("forward <", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardLessThanOrEqualTo(Integer value) {
            addCriterion("forward <=", value, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardIn(List<Integer> values) {
            addCriterion("forward in", values, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotIn(List<Integer> values) {
            addCriterion("forward not in", values, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardBetween(Integer value1, Integer value2) {
            addCriterion("forward between", value1, value2, "forward");
            return (Criteria) this;
        }

        public Criteria andForwardNotBetween(Integer value1, Integer value2) {
            addCriterion("forward not between", value1, value2, "forward");
            return (Criteria) this;
        }

        public Criteria andTaxidIsNull() {
            addCriterion("taxId is null");
            return (Criteria) this;
        }

        public Criteria andTaxidIsNotNull() {
            addCriterion("taxId is not null");
            return (Criteria) this;
        }

        public Criteria andTaxidEqualTo(String value) {
            addCriterion("taxId =", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotEqualTo(String value) {
            addCriterion("taxId <>", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidGreaterThan(String value) {
            addCriterion("taxId >", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidGreaterThanOrEqualTo(String value) {
            addCriterion("taxId >=", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidLessThan(String value) {
            addCriterion("taxId <", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidLessThanOrEqualTo(String value) {
            addCriterion("taxId <=", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidLike(String value) {
            addCriterion("taxId like", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotLike(String value) {
            addCriterion("taxId not like", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidIn(List<String> values) {
            addCriterion("taxId in", values, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotIn(List<String> values) {
            addCriterion("taxId not in", values, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidBetween(String value1, String value2) {
            addCriterion("taxId between", value1, value2, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotBetween(String value1, String value2) {
            addCriterion("taxId not between", value1, value2, "taxid");
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

        public Criteria andInmoneyIsNull() {
            addCriterion("inmoney is null");
            return (Criteria) this;
        }

        public Criteria andInmoneyIsNotNull() {
            addCriterion("inmoney is not null");
            return (Criteria) this;
        }

        public Criteria andInmoneyEqualTo(Long value) {
            addCriterion("inmoney =", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyNotEqualTo(Long value) {
            addCriterion("inmoney <>", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyGreaterThan(Long value) {
            addCriterion("inmoney >", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("inmoney >=", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyLessThan(Long value) {
            addCriterion("inmoney <", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyLessThanOrEqualTo(Long value) {
            addCriterion("inmoney <=", value, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyIn(List<Long> values) {
            addCriterion("inmoney in", values, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyNotIn(List<Long> values) {
            addCriterion("inmoney not in", values, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyBetween(Long value1, Long value2) {
            addCriterion("inmoney between", value1, value2, "inmoney");
            return (Criteria) this;
        }

        public Criteria andInmoneyNotBetween(Long value1, Long value2) {
            addCriterion("inmoney not between", value1, value2, "inmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyIsNull() {
            addCriterion("outmoney is null");
            return (Criteria) this;
        }

        public Criteria andOutmoneyIsNotNull() {
            addCriterion("outmoney is not null");
            return (Criteria) this;
        }

        public Criteria andOutmoneyEqualTo(Long value) {
            addCriterion("outmoney =", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyNotEqualTo(Long value) {
            addCriterion("outmoney <>", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyGreaterThan(Long value) {
            addCriterion("outmoney >", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("outmoney >=", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyLessThan(Long value) {
            addCriterion("outmoney <", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyLessThanOrEqualTo(Long value) {
            addCriterion("outmoney <=", value, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyIn(List<Long> values) {
            addCriterion("outmoney in", values, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyNotIn(List<Long> values) {
            addCriterion("outmoney not in", values, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyBetween(Long value1, Long value2) {
            addCriterion("outmoney between", value1, value2, "outmoney");
            return (Criteria) this;
        }

        public Criteria andOutmoneyNotBetween(Long value1, Long value2) {
            addCriterion("outmoney not between", value1, value2, "outmoney");
            return (Criteria) this;
        }

        public Criteria andUnittypeIsNull() {
            addCriterion("unitType is null");
            return (Criteria) this;
        }

        public Criteria andUnittypeIsNotNull() {
            addCriterion("unitType is not null");
            return (Criteria) this;
        }

        public Criteria andUnittypeEqualTo(Integer value) {
            addCriterion("unitType =", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotEqualTo(Integer value) {
            addCriterion("unitType <>", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeGreaterThan(Integer value) {
            addCriterion("unitType >", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("unitType >=", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLessThan(Integer value) {
            addCriterion("unitType <", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeLessThanOrEqualTo(Integer value) {
            addCriterion("unitType <=", value, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeIn(List<Integer> values) {
            addCriterion("unitType in", values, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotIn(List<Integer> values) {
            addCriterion("unitType not in", values, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeBetween(Integer value1, Integer value2) {
            addCriterion("unitType between", value1, value2, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnittypeNotBetween(Integer value1, Integer value2) {
            addCriterion("unitType not between", value1, value2, "unittype");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNull() {
            addCriterion("unitId is null");
            return (Criteria) this;
        }

        public Criteria andUnitidIsNotNull() {
            addCriterion("unitId is not null");
            return (Criteria) this;
        }

        public Criteria andUnitidEqualTo(String value) {
            addCriterion("unitId =", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotEqualTo(String value) {
            addCriterion("unitId <>", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThan(String value) {
            addCriterion("unitId >", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidGreaterThanOrEqualTo(String value) {
            addCriterion("unitId >=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThan(String value) {
            addCriterion("unitId <", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLessThanOrEqualTo(String value) {
            addCriterion("unitId <=", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidLike(String value) {
            addCriterion("unitId like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotLike(String value) {
            addCriterion("unitId not like", value, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidIn(List<String> values) {
            addCriterion("unitId in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotIn(List<String> values) {
            addCriterion("unitId not in", values, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidBetween(String value1, String value2) {
            addCriterion("unitId between", value1, value2, "unitid");
            return (Criteria) this;
        }

        public Criteria andUnitidNotBetween(String value1, String value2) {
            addCriterion("unitId not between", value1, value2, "unitid");
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

        public Criteria andDepotidIsNull() {
            addCriterion("depotId is null");
            return (Criteria) this;
        }

        public Criteria andDepotidIsNotNull() {
            addCriterion("depotId is not null");
            return (Criteria) this;
        }

        public Criteria andDepotidEqualTo(String value) {
            addCriterion("depotId =", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidNotEqualTo(String value) {
            addCriterion("depotId <>", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidGreaterThan(String value) {
            addCriterion("depotId >", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidGreaterThanOrEqualTo(String value) {
            addCriterion("depotId >=", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidLessThan(String value) {
            addCriterion("depotId <", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidLessThanOrEqualTo(String value) {
            addCriterion("depotId <=", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidLike(String value) {
            addCriterion("depotId like", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidNotLike(String value) {
            addCriterion("depotId not like", value, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidIn(List<String> values) {
            addCriterion("depotId in", values, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidNotIn(List<String> values) {
            addCriterion("depotId not in", values, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidBetween(String value1, String value2) {
            addCriterion("depotId between", value1, value2, "depotid");
            return (Criteria) this;
        }

        public Criteria andDepotidNotBetween(String value1, String value2) {
            addCriterion("depotId not between", value1, value2, "depotid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productId like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productId not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andDuty2idIsNull() {
            addCriterion("duty2Id is null");
            return (Criteria) this;
        }

        public Criteria andDuty2idIsNotNull() {
            addCriterion("duty2Id is not null");
            return (Criteria) this;
        }

        public Criteria andDuty2idEqualTo(String value) {
            addCriterion("duty2Id =", value, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idNotEqualTo(String value) {
            addCriterion("duty2Id <>", value, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idGreaterThan(String value) {
            addCriterion("duty2Id >", value, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idGreaterThanOrEqualTo(String value) {
            addCriterion("duty2Id >=", value, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idLessThan(String value) {
            addCriterion("duty2Id <", value, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idLessThanOrEqualTo(String value) {
            addCriterion("duty2Id <=", value, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idLike(String value) {
            addCriterion("duty2Id like", value, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idNotLike(String value) {
            addCriterion("duty2Id not like", value, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idIn(List<String> values) {
            addCriterion("duty2Id in", values, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idNotIn(List<String> values) {
            addCriterion("duty2Id not in", values, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idBetween(String value1, String value2) {
            addCriterion("duty2Id between", value1, value2, "duty2id");
            return (Criteria) this;
        }

        public Criteria andDuty2idNotBetween(String value1, String value2) {
            addCriterion("duty2Id not between", value1, value2, "duty2id");
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

        public Criteria andRefoutIsNull() {
            addCriterion("refOut is null");
            return (Criteria) this;
        }

        public Criteria andRefoutIsNotNull() {
            addCriterion("refOut is not null");
            return (Criteria) this;
        }

        public Criteria andRefoutEqualTo(String value) {
            addCriterion("refOut =", value, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutNotEqualTo(String value) {
            addCriterion("refOut <>", value, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutGreaterThan(String value) {
            addCriterion("refOut >", value, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutGreaterThanOrEqualTo(String value) {
            addCriterion("refOut >=", value, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutLessThan(String value) {
            addCriterion("refOut <", value, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutLessThanOrEqualTo(String value) {
            addCriterion("refOut <=", value, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutLike(String value) {
            addCriterion("refOut like", value, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutNotLike(String value) {
            addCriterion("refOut not like", value, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutIn(List<String> values) {
            addCriterion("refOut in", values, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutNotIn(List<String> values) {
            addCriterion("refOut not in", values, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutBetween(String value1, String value2) {
            addCriterion("refOut between", value1, value2, "refout");
            return (Criteria) this;
        }

        public Criteria andRefoutNotBetween(String value1, String value2) {
            addCriterion("refOut not between", value1, value2, "refout");
            return (Criteria) this;
        }

        public Criteria andRefbillIsNull() {
            addCriterion("refBill is null");
            return (Criteria) this;
        }

        public Criteria andRefbillIsNotNull() {
            addCriterion("refBill is not null");
            return (Criteria) this;
        }

        public Criteria andRefbillEqualTo(String value) {
            addCriterion("refBill =", value, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillNotEqualTo(String value) {
            addCriterion("refBill <>", value, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillGreaterThan(String value) {
            addCriterion("refBill >", value, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillGreaterThanOrEqualTo(String value) {
            addCriterion("refBill >=", value, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillLessThan(String value) {
            addCriterion("refBill <", value, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillLessThanOrEqualTo(String value) {
            addCriterion("refBill <=", value, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillLike(String value) {
            addCriterion("refBill like", value, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillNotLike(String value) {
            addCriterion("refBill not like", value, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillIn(List<String> values) {
            addCriterion("refBill in", values, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillNotIn(List<String> values) {
            addCriterion("refBill not in", values, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillBetween(String value1, String value2) {
            addCriterion("refBill between", value1, value2, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefbillNotBetween(String value1, String value2) {
            addCriterion("refBill not between", value1, value2, "refbill");
            return (Criteria) this;
        }

        public Criteria andRefstockIsNull() {
            addCriterion("refStock is null");
            return (Criteria) this;
        }

        public Criteria andRefstockIsNotNull() {
            addCriterion("refStock is not null");
            return (Criteria) this;
        }

        public Criteria andRefstockEqualTo(String value) {
            addCriterion("refStock =", value, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockNotEqualTo(String value) {
            addCriterion("refStock <>", value, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockGreaterThan(String value) {
            addCriterion("refStock >", value, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockGreaterThanOrEqualTo(String value) {
            addCriterion("refStock >=", value, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockLessThan(String value) {
            addCriterion("refStock <", value, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockLessThanOrEqualTo(String value) {
            addCriterion("refStock <=", value, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockLike(String value) {
            addCriterion("refStock like", value, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockNotLike(String value) {
            addCriterion("refStock not like", value, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockIn(List<String> values) {
            addCriterion("refStock in", values, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockNotIn(List<String> values) {
            addCriterion("refStock not in", values, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockBetween(String value1, String value2) {
            addCriterion("refStock between", value1, value2, "refstock");
            return (Criteria) this;
        }

        public Criteria andRefstockNotBetween(String value1, String value2) {
            addCriterion("refStock not between", value1, value2, "refstock");
            return (Criteria) this;
        }

        public Criteria andFinancedateIsNull() {
            addCriterion("financeDate is null");
            return (Criteria) this;
        }

        public Criteria andFinancedateIsNotNull() {
            addCriterion("financeDate is not null");
            return (Criteria) this;
        }

        public Criteria andFinancedateEqualTo(String value) {
            addCriterion("financeDate =", value, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateNotEqualTo(String value) {
            addCriterion("financeDate <>", value, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateGreaterThan(String value) {
            addCriterion("financeDate >", value, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateGreaterThanOrEqualTo(String value) {
            addCriterion("financeDate >=", value, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateLessThan(String value) {
            addCriterion("financeDate <", value, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateLessThanOrEqualTo(String value) {
            addCriterion("financeDate <=", value, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateLike(String value) {
            addCriterion("financeDate like", value, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateNotLike(String value) {
            addCriterion("financeDate not like", value, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateIn(List<String> values) {
            addCriterion("financeDate in", values, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateNotIn(List<String> values) {
            addCriterion("financeDate not in", values, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateBetween(String value1, String value2) {
            addCriterion("financeDate between", value1, value2, "financedate");
            return (Criteria) this;
        }

        public Criteria andFinancedateNotBetween(String value1, String value2) {
            addCriterion("financeDate not between", value1, value2, "financedate");
            return (Criteria) this;
        }

        public Criteria andTaxid0IsNull() {
            addCriterion("taxId0 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid0IsNotNull() {
            addCriterion("taxId0 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid0EqualTo(String value) {
            addCriterion("taxId0 =", value, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0NotEqualTo(String value) {
            addCriterion("taxId0 <>", value, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0GreaterThan(String value) {
            addCriterion("taxId0 >", value, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0GreaterThanOrEqualTo(String value) {
            addCriterion("taxId0 >=", value, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0LessThan(String value) {
            addCriterion("taxId0 <", value, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0LessThanOrEqualTo(String value) {
            addCriterion("taxId0 <=", value, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0Like(String value) {
            addCriterion("taxId0 like", value, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0NotLike(String value) {
            addCriterion("taxId0 not like", value, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0In(List<String> values) {
            addCriterion("taxId0 in", values, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0NotIn(List<String> values) {
            addCriterion("taxId0 not in", values, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0Between(String value1, String value2) {
            addCriterion("taxId0 between", value1, value2, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid0NotBetween(String value1, String value2) {
            addCriterion("taxId0 not between", value1, value2, "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid1IsNull() {
            addCriterion("taxId1 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid1IsNotNull() {
            addCriterion("taxId1 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid1EqualTo(String value) {
            addCriterion("taxId1 =", value, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1NotEqualTo(String value) {
            addCriterion("taxId1 <>", value, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1GreaterThan(String value) {
            addCriterion("taxId1 >", value, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1GreaterThanOrEqualTo(String value) {
            addCriterion("taxId1 >=", value, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1LessThan(String value) {
            addCriterion("taxId1 <", value, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1LessThanOrEqualTo(String value) {
            addCriterion("taxId1 <=", value, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1Like(String value) {
            addCriterion("taxId1 like", value, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1NotLike(String value) {
            addCriterion("taxId1 not like", value, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1In(List<String> values) {
            addCriterion("taxId1 in", values, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1NotIn(List<String> values) {
            addCriterion("taxId1 not in", values, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1Between(String value1, String value2) {
            addCriterion("taxId1 between", value1, value2, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid1NotBetween(String value1, String value2) {
            addCriterion("taxId1 not between", value1, value2, "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid2IsNull() {
            addCriterion("taxId2 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid2IsNotNull() {
            addCriterion("taxId2 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid2EqualTo(String value) {
            addCriterion("taxId2 =", value, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2NotEqualTo(String value) {
            addCriterion("taxId2 <>", value, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2GreaterThan(String value) {
            addCriterion("taxId2 >", value, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2GreaterThanOrEqualTo(String value) {
            addCriterion("taxId2 >=", value, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2LessThan(String value) {
            addCriterion("taxId2 <", value, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2LessThanOrEqualTo(String value) {
            addCriterion("taxId2 <=", value, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2Like(String value) {
            addCriterion("taxId2 like", value, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2NotLike(String value) {
            addCriterion("taxId2 not like", value, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2In(List<String> values) {
            addCriterion("taxId2 in", values, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2NotIn(List<String> values) {
            addCriterion("taxId2 not in", values, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2Between(String value1, String value2) {
            addCriterion("taxId2 between", value1, value2, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid2NotBetween(String value1, String value2) {
            addCriterion("taxId2 not between", value1, value2, "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid3IsNull() {
            addCriterion("taxId3 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid3IsNotNull() {
            addCriterion("taxId3 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid3EqualTo(String value) {
            addCriterion("taxId3 =", value, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3NotEqualTo(String value) {
            addCriterion("taxId3 <>", value, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3GreaterThan(String value) {
            addCriterion("taxId3 >", value, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3GreaterThanOrEqualTo(String value) {
            addCriterion("taxId3 >=", value, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3LessThan(String value) {
            addCriterion("taxId3 <", value, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3LessThanOrEqualTo(String value) {
            addCriterion("taxId3 <=", value, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3Like(String value) {
            addCriterion("taxId3 like", value, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3NotLike(String value) {
            addCriterion("taxId3 not like", value, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3In(List<String> values) {
            addCriterion("taxId3 in", values, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3NotIn(List<String> values) {
            addCriterion("taxId3 not in", values, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3Between(String value1, String value2) {
            addCriterion("taxId3 between", value1, value2, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid3NotBetween(String value1, String value2) {
            addCriterion("taxId3 not between", value1, value2, "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid4IsNull() {
            addCriterion("taxId4 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid4IsNotNull() {
            addCriterion("taxId4 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid4EqualTo(String value) {
            addCriterion("taxId4 =", value, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4NotEqualTo(String value) {
            addCriterion("taxId4 <>", value, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4GreaterThan(String value) {
            addCriterion("taxId4 >", value, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4GreaterThanOrEqualTo(String value) {
            addCriterion("taxId4 >=", value, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4LessThan(String value) {
            addCriterion("taxId4 <", value, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4LessThanOrEqualTo(String value) {
            addCriterion("taxId4 <=", value, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4Like(String value) {
            addCriterion("taxId4 like", value, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4NotLike(String value) {
            addCriterion("taxId4 not like", value, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4In(List<String> values) {
            addCriterion("taxId4 in", values, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4NotIn(List<String> values) {
            addCriterion("taxId4 not in", values, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4Between(String value1, String value2) {
            addCriterion("taxId4 between", value1, value2, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid4NotBetween(String value1, String value2) {
            addCriterion("taxId4 not between", value1, value2, "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid5IsNull() {
            addCriterion("taxId5 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid5IsNotNull() {
            addCriterion("taxId5 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid5EqualTo(String value) {
            addCriterion("taxId5 =", value, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5NotEqualTo(String value) {
            addCriterion("taxId5 <>", value, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5GreaterThan(String value) {
            addCriterion("taxId5 >", value, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5GreaterThanOrEqualTo(String value) {
            addCriterion("taxId5 >=", value, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5LessThan(String value) {
            addCriterion("taxId5 <", value, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5LessThanOrEqualTo(String value) {
            addCriterion("taxId5 <=", value, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5Like(String value) {
            addCriterion("taxId5 like", value, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5NotLike(String value) {
            addCriterion("taxId5 not like", value, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5In(List<String> values) {
            addCriterion("taxId5 in", values, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5NotIn(List<String> values) {
            addCriterion("taxId5 not in", values, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5Between(String value1, String value2) {
            addCriterion("taxId5 between", value1, value2, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid5NotBetween(String value1, String value2) {
            addCriterion("taxId5 not between", value1, value2, "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid6IsNull() {
            addCriterion("taxId6 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid6IsNotNull() {
            addCriterion("taxId6 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid6EqualTo(String value) {
            addCriterion("taxId6 =", value, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6NotEqualTo(String value) {
            addCriterion("taxId6 <>", value, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6GreaterThan(String value) {
            addCriterion("taxId6 >", value, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6GreaterThanOrEqualTo(String value) {
            addCriterion("taxId6 >=", value, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6LessThan(String value) {
            addCriterion("taxId6 <", value, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6LessThanOrEqualTo(String value) {
            addCriterion("taxId6 <=", value, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6Like(String value) {
            addCriterion("taxId6 like", value, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6NotLike(String value) {
            addCriterion("taxId6 not like", value, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6In(List<String> values) {
            addCriterion("taxId6 in", values, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6NotIn(List<String> values) {
            addCriterion("taxId6 not in", values, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6Between(String value1, String value2) {
            addCriterion("taxId6 between", value1, value2, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid6NotBetween(String value1, String value2) {
            addCriterion("taxId6 not between", value1, value2, "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid7IsNull() {
            addCriterion("taxId7 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid7IsNotNull() {
            addCriterion("taxId7 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid7EqualTo(String value) {
            addCriterion("taxId7 =", value, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7NotEqualTo(String value) {
            addCriterion("taxId7 <>", value, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7GreaterThan(String value) {
            addCriterion("taxId7 >", value, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7GreaterThanOrEqualTo(String value) {
            addCriterion("taxId7 >=", value, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7LessThan(String value) {
            addCriterion("taxId7 <", value, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7LessThanOrEqualTo(String value) {
            addCriterion("taxId7 <=", value, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7Like(String value) {
            addCriterion("taxId7 like", value, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7NotLike(String value) {
            addCriterion("taxId7 not like", value, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7In(List<String> values) {
            addCriterion("taxId7 in", values, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7NotIn(List<String> values) {
            addCriterion("taxId7 not in", values, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7Between(String value1, String value2) {
            addCriterion("taxId7 between", value1, value2, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid7NotBetween(String value1, String value2) {
            addCriterion("taxId7 not between", value1, value2, "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid8IsNull() {
            addCriterion("taxId8 is null");
            return (Criteria) this;
        }

        public Criteria andTaxid8IsNotNull() {
            addCriterion("taxId8 is not null");
            return (Criteria) this;
        }

        public Criteria andTaxid8EqualTo(String value) {
            addCriterion("taxId8 =", value, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8NotEqualTo(String value) {
            addCriterion("taxId8 <>", value, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8GreaterThan(String value) {
            addCriterion("taxId8 >", value, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8GreaterThanOrEqualTo(String value) {
            addCriterion("taxId8 >=", value, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8LessThan(String value) {
            addCriterion("taxId8 <", value, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8LessThanOrEqualTo(String value) {
            addCriterion("taxId8 <=", value, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8Like(String value) {
            addCriterion("taxId8 like", value, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8NotLike(String value) {
            addCriterion("taxId8 not like", value, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8In(List<String> values) {
            addCriterion("taxId8 in", values, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8NotIn(List<String> values) {
            addCriterion("taxId8 not in", values, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8Between(String value1, String value2) {
            addCriterion("taxId8 between", value1, value2, "taxid8");
            return (Criteria) this;
        }

        public Criteria andTaxid8NotBetween(String value1, String value2) {
            addCriterion("taxId8 not between", value1, value2, "taxid8");
            return (Criteria) this;
        }

        public Criteria andProductamountinIsNull() {
            addCriterion("productAmountIn is null");
            return (Criteria) this;
        }

        public Criteria andProductamountinIsNotNull() {
            addCriterion("productAmountIn is not null");
            return (Criteria) this;
        }

        public Criteria andProductamountinEqualTo(Integer value) {
            addCriterion("productAmountIn =", value, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinNotEqualTo(Integer value) {
            addCriterion("productAmountIn <>", value, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinGreaterThan(Integer value) {
            addCriterion("productAmountIn >", value, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinGreaterThanOrEqualTo(Integer value) {
            addCriterion("productAmountIn >=", value, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinLessThan(Integer value) {
            addCriterion("productAmountIn <", value, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinLessThanOrEqualTo(Integer value) {
            addCriterion("productAmountIn <=", value, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinIn(List<Integer> values) {
            addCriterion("productAmountIn in", values, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinNotIn(List<Integer> values) {
            addCriterion("productAmountIn not in", values, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinBetween(Integer value1, Integer value2) {
            addCriterion("productAmountIn between", value1, value2, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountinNotBetween(Integer value1, Integer value2) {
            addCriterion("productAmountIn not between", value1, value2, "productamountin");
            return (Criteria) this;
        }

        public Criteria andProductamountoutIsNull() {
            addCriterion("productAmountOut is null");
            return (Criteria) this;
        }

        public Criteria andProductamountoutIsNotNull() {
            addCriterion("productAmountOut is not null");
            return (Criteria) this;
        }

        public Criteria andProductamountoutEqualTo(Integer value) {
            addCriterion("productAmountOut =", value, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutNotEqualTo(Integer value) {
            addCriterion("productAmountOut <>", value, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutGreaterThan(Integer value) {
            addCriterion("productAmountOut >", value, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("productAmountOut >=", value, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutLessThan(Integer value) {
            addCriterion("productAmountOut <", value, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutLessThanOrEqualTo(Integer value) {
            addCriterion("productAmountOut <=", value, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutIn(List<Integer> values) {
            addCriterion("productAmountOut in", values, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutNotIn(List<Integer> values) {
            addCriterion("productAmountOut not in", values, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutBetween(Integer value1, Integer value2) {
            addCriterion("productAmountOut between", value1, value2, "productamountout");
            return (Criteria) this;
        }

        public Criteria andProductamountoutNotBetween(Integer value1, Integer value2) {
            addCriterion("productAmountOut not between", value1, value2, "productamountout");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andPidLikeInsensitive(String value) {
            addCriterion("upper(pid) like", value.toUpperCase(), "pid");
            return (Criteria) this;
        }

        public Criteria andPareidLikeInsensitive(String value) {
            addCriterion("upper(pareId) like", value.toUpperCase(), "pareid");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andTaxidLikeInsensitive(String value) {
            addCriterion("upper(taxId) like", value.toUpperCase(), "taxid");
            return (Criteria) this;
        }

        public Criteria andDutyidLikeInsensitive(String value) {
            addCriterion("upper(dutyId) like", value.toUpperCase(), "dutyid");
            return (Criteria) this;
        }

        public Criteria andUnitidLikeInsensitive(String value) {
            addCriterion("upper(unitId) like", value.toUpperCase(), "unitid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLikeInsensitive(String value) {
            addCriterion("upper(departmentId) like", value.toUpperCase(), "departmentid");
            return (Criteria) this;
        }

        public Criteria andStafferidLikeInsensitive(String value) {
            addCriterion("upper(stafferId) like", value.toUpperCase(), "stafferid");
            return (Criteria) this;
        }

        public Criteria andDepotidLikeInsensitive(String value) {
            addCriterion("upper(depotId) like", value.toUpperCase(), "depotid");
            return (Criteria) this;
        }

        public Criteria andProductidLikeInsensitive(String value) {
            addCriterion("upper(productId) like", value.toUpperCase(), "productid");
            return (Criteria) this;
        }

        public Criteria andDuty2idLikeInsensitive(String value) {
            addCriterion("upper(duty2Id) like", value.toUpperCase(), "duty2id");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andLogtimeLikeInsensitive(String value) {
            addCriterion("upper(logTime) like", value.toUpperCase(), "logtime");
            return (Criteria) this;
        }

        public Criteria andRefidLikeInsensitive(String value) {
            addCriterion("upper(refId) like", value.toUpperCase(), "refid");
            return (Criteria) this;
        }

        public Criteria andRefoutLikeInsensitive(String value) {
            addCriterion("upper(refOut) like", value.toUpperCase(), "refout");
            return (Criteria) this;
        }

        public Criteria andRefbillLikeInsensitive(String value) {
            addCriterion("upper(refBill) like", value.toUpperCase(), "refbill");
            return (Criteria) this;
        }

        public Criteria andRefstockLikeInsensitive(String value) {
            addCriterion("upper(refStock) like", value.toUpperCase(), "refstock");
            return (Criteria) this;
        }

        public Criteria andFinancedateLikeInsensitive(String value) {
            addCriterion("upper(financeDate) like", value.toUpperCase(), "financedate");
            return (Criteria) this;
        }

        public Criteria andTaxid0LikeInsensitive(String value) {
            addCriterion("upper(taxId0) like", value.toUpperCase(), "taxid0");
            return (Criteria) this;
        }

        public Criteria andTaxid1LikeInsensitive(String value) {
            addCriterion("upper(taxId1) like", value.toUpperCase(), "taxid1");
            return (Criteria) this;
        }

        public Criteria andTaxid2LikeInsensitive(String value) {
            addCriterion("upper(taxId2) like", value.toUpperCase(), "taxid2");
            return (Criteria) this;
        }

        public Criteria andTaxid3LikeInsensitive(String value) {
            addCriterion("upper(taxId3) like", value.toUpperCase(), "taxid3");
            return (Criteria) this;
        }

        public Criteria andTaxid4LikeInsensitive(String value) {
            addCriterion("upper(taxId4) like", value.toUpperCase(), "taxid4");
            return (Criteria) this;
        }

        public Criteria andTaxid5LikeInsensitive(String value) {
            addCriterion("upper(taxId5) like", value.toUpperCase(), "taxid5");
            return (Criteria) this;
        }

        public Criteria andTaxid6LikeInsensitive(String value) {
            addCriterion("upper(taxId6) like", value.toUpperCase(), "taxid6");
            return (Criteria) this;
        }

        public Criteria andTaxid7LikeInsensitive(String value) {
            addCriterion("upper(taxId7) like", value.toUpperCase(), "taxid7");
            return (Criteria) this;
        }

        public Criteria andTaxid8LikeInsensitive(String value) {
            addCriterion("upper(taxId8) like", value.toUpperCase(), "taxid8");
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