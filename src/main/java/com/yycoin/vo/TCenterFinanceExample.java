package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class TCenterFinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterFinanceExample() {
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

        public Criteria andUpdateflagIsNull() {
            addCriterion("updateFlag is null");
            return (Criteria) this;
        }

        public Criteria andUpdateflagIsNotNull() {
            addCriterion("updateFlag is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateflagEqualTo(Integer value) {
            addCriterion("updateFlag =", value, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagNotEqualTo(Integer value) {
            addCriterion("updateFlag <>", value, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagGreaterThan(Integer value) {
            addCriterion("updateFlag >", value, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateFlag >=", value, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagLessThan(Integer value) {
            addCriterion("updateFlag <", value, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagLessThanOrEqualTo(Integer value) {
            addCriterion("updateFlag <=", value, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagIn(List<Integer> values) {
            addCriterion("updateFlag in", values, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagNotIn(List<Integer> values) {
            addCriterion("updateFlag not in", values, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagBetween(Integer value1, Integer value2) {
            addCriterion("updateFlag between", value1, value2, "updateflag");
            return (Criteria) this;
        }

        public Criteria andUpdateflagNotBetween(Integer value1, Integer value2) {
            addCriterion("updateFlag not between", value1, value2, "updateflag");
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

        public Criteria andCreateridIsNull() {
            addCriterion("createrId is null");
            return (Criteria) this;
        }

        public Criteria andCreateridIsNotNull() {
            addCriterion("createrId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateridEqualTo(String value) {
            addCriterion("createrId =", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotEqualTo(String value) {
            addCriterion("createrId <>", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridGreaterThan(String value) {
            addCriterion("createrId >", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridGreaterThanOrEqualTo(String value) {
            addCriterion("createrId >=", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLessThan(String value) {
            addCriterion("createrId <", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLessThanOrEqualTo(String value) {
            addCriterion("createrId <=", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridLike(String value) {
            addCriterion("createrId like", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotLike(String value) {
            addCriterion("createrId not like", value, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridIn(List<String> values) {
            addCriterion("createrId in", values, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotIn(List<String> values) {
            addCriterion("createrId not in", values, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridBetween(String value1, String value2) {
            addCriterion("createrId between", value1, value2, "createrid");
            return (Criteria) this;
        }

        public Criteria andCreateridNotBetween(String value1, String value2) {
            addCriterion("createrId not between", value1, value2, "createrid");
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

        public Criteria andChecksIsNull() {
            addCriterion("checks is null");
            return (Criteria) this;
        }

        public Criteria andChecksIsNotNull() {
            addCriterion("checks is not null");
            return (Criteria) this;
        }

        public Criteria andChecksEqualTo(String value) {
            addCriterion("checks =", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksNotEqualTo(String value) {
            addCriterion("checks <>", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksGreaterThan(String value) {
            addCriterion("checks >", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksGreaterThanOrEqualTo(String value) {
            addCriterion("checks >=", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksLessThan(String value) {
            addCriterion("checks <", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksLessThanOrEqualTo(String value) {
            addCriterion("checks <=", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksLike(String value) {
            addCriterion("checks like", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksNotLike(String value) {
            addCriterion("checks not like", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksIn(List<String> values) {
            addCriterion("checks in", values, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksNotIn(List<String> values) {
            addCriterion("checks not in", values, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksBetween(String value1, String value2) {
            addCriterion("checks between", value1, value2, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksNotBetween(String value1, String value2) {
            addCriterion("checks not between", value1, value2, "checks");
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

        public Criteria andLocksIsNull() {
            addCriterion("locks is null");
            return (Criteria) this;
        }

        public Criteria andLocksIsNotNull() {
            addCriterion("locks is not null");
            return (Criteria) this;
        }

        public Criteria andLocksEqualTo(Integer value) {
            addCriterion("locks =", value, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksNotEqualTo(Integer value) {
            addCriterion("locks <>", value, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksGreaterThan(Integer value) {
            addCriterion("locks >", value, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksGreaterThanOrEqualTo(Integer value) {
            addCriterion("locks >=", value, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksLessThan(Integer value) {
            addCriterion("locks <", value, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksLessThanOrEqualTo(Integer value) {
            addCriterion("locks <=", value, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksIn(List<Integer> values) {
            addCriterion("locks in", values, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksNotIn(List<Integer> values) {
            addCriterion("locks not in", values, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksBetween(Integer value1, Integer value2) {
            addCriterion("locks between", value1, value2, "locks");
            return (Criteria) this;
        }

        public Criteria andLocksNotBetween(Integer value1, Integer value2) {
            addCriterion("locks not between", value1, value2, "locks");
            return (Criteria) this;
        }

        public Criteria andMonthindexIsNull() {
            addCriterion("monthIndex is null");
            return (Criteria) this;
        }

        public Criteria andMonthindexIsNotNull() {
            addCriterion("monthIndex is not null");
            return (Criteria) this;
        }

        public Criteria andMonthindexEqualTo(Integer value) {
            addCriterion("monthIndex =", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotEqualTo(Integer value) {
            addCriterion("monthIndex <>", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexGreaterThan(Integer value) {
            addCriterion("monthIndex >", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthIndex >=", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexLessThan(Integer value) {
            addCriterion("monthIndex <", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexLessThanOrEqualTo(Integer value) {
            addCriterion("monthIndex <=", value, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexIn(List<Integer> values) {
            addCriterion("monthIndex in", values, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotIn(List<Integer> values) {
            addCriterion("monthIndex not in", values, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexBetween(Integer value1, Integer value2) {
            addCriterion("monthIndex between", value1, value2, "monthindex");
            return (Criteria) this;
        }

        public Criteria andMonthindexNotBetween(Integer value1, Integer value2) {
            addCriterion("monthIndex not between", value1, value2, "monthindex");
            return (Criteria) this;
        }

        public Criteria andRefchecksIsNull() {
            addCriterion("refChecks is null");
            return (Criteria) this;
        }

        public Criteria andRefchecksIsNotNull() {
            addCriterion("refChecks is not null");
            return (Criteria) this;
        }

        public Criteria andRefchecksEqualTo(String value) {
            addCriterion("refChecks =", value, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksNotEqualTo(String value) {
            addCriterion("refChecks <>", value, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksGreaterThan(String value) {
            addCriterion("refChecks >", value, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksGreaterThanOrEqualTo(String value) {
            addCriterion("refChecks >=", value, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksLessThan(String value) {
            addCriterion("refChecks <", value, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksLessThanOrEqualTo(String value) {
            addCriterion("refChecks <=", value, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksLike(String value) {
            addCriterion("refChecks like", value, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksNotLike(String value) {
            addCriterion("refChecks not like", value, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksIn(List<String> values) {
            addCriterion("refChecks in", values, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksNotIn(List<String> values) {
            addCriterion("refChecks not in", values, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksBetween(String value1, String value2) {
            addCriterion("refChecks between", value1, value2, "refchecks");
            return (Criteria) this;
        }

        public Criteria andRefchecksNotBetween(String value1, String value2) {
            addCriterion("refChecks not between", value1, value2, "refchecks");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andDutyidLikeInsensitive(String value) {
            addCriterion("upper(dutyId) like", value.toUpperCase(), "dutyid");
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

        public Criteria andCreateridLikeInsensitive(String value) {
            addCriterion("upper(createrId) like", value.toUpperCase(), "createrid");
            return (Criteria) this;
        }

        public Criteria andChecksLikeInsensitive(String value) {
            addCriterion("upper(checks) like", value.toUpperCase(), "checks");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andFinancedateLikeInsensitive(String value) {
            addCriterion("upper(financeDate) like", value.toUpperCase(), "financedate");
            return (Criteria) this;
        }

        public Criteria andLogtimeLikeInsensitive(String value) {
            addCriterion("upper(logTime) like", value.toUpperCase(), "logtime");
            return (Criteria) this;
        }

        public Criteria andRefchecksLikeInsensitive(String value) {
            addCriterion("upper(refChecks) like", value.toUpperCase(), "refchecks");
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