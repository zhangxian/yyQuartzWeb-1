package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class TCenterApproveLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterApproveLogExample() {
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

        public Criteria andFullidIsNull() {
            addCriterion("fullId is null");
            return (Criteria) this;
        }

        public Criteria andFullidIsNotNull() {
            addCriterion("fullId is not null");
            return (Criteria) this;
        }

        public Criteria andFullidEqualTo(String value) {
            addCriterion("fullId =", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidNotEqualTo(String value) {
            addCriterion("fullId <>", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidGreaterThan(String value) {
            addCriterion("fullId >", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidGreaterThanOrEqualTo(String value) {
            addCriterion("fullId >=", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidLessThan(String value) {
            addCriterion("fullId <", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidLessThanOrEqualTo(String value) {
            addCriterion("fullId <=", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidLike(String value) {
            addCriterion("fullId like", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidNotLike(String value) {
            addCriterion("fullId not like", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidIn(List<String> values) {
            addCriterion("fullId in", values, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidNotIn(List<String> values) {
            addCriterion("fullId not in", values, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidBetween(String value1, String value2) {
            addCriterion("fullId between", value1, value2, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidNotBetween(String value1, String value2) {
            addCriterion("fullId not between", value1, value2, "fullid");
            return (Criteria) this;
        }

        public Criteria andActorIsNull() {
            addCriterion("actor is null");
            return (Criteria) this;
        }

        public Criteria andActorIsNotNull() {
            addCriterion("actor is not null");
            return (Criteria) this;
        }

        public Criteria andActorEqualTo(String value) {
            addCriterion("actor =", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotEqualTo(String value) {
            addCriterion("actor <>", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorGreaterThan(String value) {
            addCriterion("actor >", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorGreaterThanOrEqualTo(String value) {
            addCriterion("actor >=", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLessThan(String value) {
            addCriterion("actor <", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLessThanOrEqualTo(String value) {
            addCriterion("actor <=", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorLike(String value) {
            addCriterion("actor like", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotLike(String value) {
            addCriterion("actor not like", value, "actor");
            return (Criteria) this;
        }

        public Criteria andActorIn(List<String> values) {
            addCriterion("actor in", values, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotIn(List<String> values) {
            addCriterion("actor not in", values, "actor");
            return (Criteria) this;
        }

        public Criteria andActorBetween(String value1, String value2) {
            addCriterion("actor between", value1, value2, "actor");
            return (Criteria) this;
        }

        public Criteria andActorNotBetween(String value1, String value2) {
            addCriterion("actor not between", value1, value2, "actor");
            return (Criteria) this;
        }

        public Criteria andOprmodeIsNull() {
            addCriterion("oprMode is null");
            return (Criteria) this;
        }

        public Criteria andOprmodeIsNotNull() {
            addCriterion("oprMode is not null");
            return (Criteria) this;
        }

        public Criteria andOprmodeEqualTo(Integer value) {
            addCriterion("oprMode =", value, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeNotEqualTo(Integer value) {
            addCriterion("oprMode <>", value, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeGreaterThan(Integer value) {
            addCriterion("oprMode >", value, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("oprMode >=", value, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeLessThan(Integer value) {
            addCriterion("oprMode <", value, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeLessThanOrEqualTo(Integer value) {
            addCriterion("oprMode <=", value, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeIn(List<Integer> values) {
            addCriterion("oprMode in", values, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeNotIn(List<Integer> values) {
            addCriterion("oprMode not in", values, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeBetween(Integer value1, Integer value2) {
            addCriterion("oprMode between", value1, value2, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOprmodeNotBetween(Integer value1, Integer value2) {
            addCriterion("oprMode not between", value1, value2, "oprmode");
            return (Criteria) this;
        }

        public Criteria andOpramountIsNull() {
            addCriterion("oprAmount is null");
            return (Criteria) this;
        }

        public Criteria andOpramountIsNotNull() {
            addCriterion("oprAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOpramountEqualTo(Integer value) {
            addCriterion("oprAmount =", value, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountNotEqualTo(Integer value) {
            addCriterion("oprAmount <>", value, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountGreaterThan(Integer value) {
            addCriterion("oprAmount >", value, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountGreaterThanOrEqualTo(Integer value) {
            addCriterion("oprAmount >=", value, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountLessThan(Integer value) {
            addCriterion("oprAmount <", value, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountLessThanOrEqualTo(Integer value) {
            addCriterion("oprAmount <=", value, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountIn(List<Integer> values) {
            addCriterion("oprAmount in", values, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountNotIn(List<Integer> values) {
            addCriterion("oprAmount not in", values, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountBetween(Integer value1, Integer value2) {
            addCriterion("oprAmount between", value1, value2, "opramount");
            return (Criteria) this;
        }

        public Criteria andOpramountNotBetween(Integer value1, Integer value2) {
            addCriterion("oprAmount not between", value1, value2, "opramount");
            return (Criteria) this;
        }

        public Criteria andPrestatusIsNull() {
            addCriterion("preStatus is null");
            return (Criteria) this;
        }

        public Criteria andPrestatusIsNotNull() {
            addCriterion("preStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPrestatusEqualTo(Integer value) {
            addCriterion("preStatus =", value, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusNotEqualTo(Integer value) {
            addCriterion("preStatus <>", value, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusGreaterThan(Integer value) {
            addCriterion("preStatus >", value, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("preStatus >=", value, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusLessThan(Integer value) {
            addCriterion("preStatus <", value, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusLessThanOrEqualTo(Integer value) {
            addCriterion("preStatus <=", value, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusIn(List<Integer> values) {
            addCriterion("preStatus in", values, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusNotIn(List<Integer> values) {
            addCriterion("preStatus not in", values, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusBetween(Integer value1, Integer value2) {
            addCriterion("preStatus between", value1, value2, "prestatus");
            return (Criteria) this;
        }

        public Criteria andPrestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("preStatus not between", value1, value2, "prestatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusIsNull() {
            addCriterion("afterStatus is null");
            return (Criteria) this;
        }

        public Criteria andAfterstatusIsNotNull() {
            addCriterion("afterStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAfterstatusEqualTo(Integer value) {
            addCriterion("afterStatus =", value, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusNotEqualTo(Integer value) {
            addCriterion("afterStatus <>", value, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusGreaterThan(Integer value) {
            addCriterion("afterStatus >", value, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("afterStatus >=", value, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusLessThan(Integer value) {
            addCriterion("afterStatus <", value, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusLessThanOrEqualTo(Integer value) {
            addCriterion("afterStatus <=", value, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusIn(List<Integer> values) {
            addCriterion("afterStatus in", values, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusNotIn(List<Integer> values) {
            addCriterion("afterStatus not in", values, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusBetween(Integer value1, Integer value2) {
            addCriterion("afterStatus between", value1, value2, "afterstatus");
            return (Criteria) this;
        }

        public Criteria andAfterstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("afterStatus not between", value1, value2, "afterstatus");
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

        public Criteria andActoridIsNull() {
            addCriterion("actorId is null");
            return (Criteria) this;
        }

        public Criteria andActoridIsNotNull() {
            addCriterion("actorId is not null");
            return (Criteria) this;
        }

        public Criteria andActoridEqualTo(String value) {
            addCriterion("actorId =", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridNotEqualTo(String value) {
            addCriterion("actorId <>", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridGreaterThan(String value) {
            addCriterion("actorId >", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridGreaterThanOrEqualTo(String value) {
            addCriterion("actorId >=", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridLessThan(String value) {
            addCriterion("actorId <", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridLessThanOrEqualTo(String value) {
            addCriterion("actorId <=", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridLike(String value) {
            addCriterion("actorId like", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridNotLike(String value) {
            addCriterion("actorId not like", value, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridIn(List<String> values) {
            addCriterion("actorId in", values, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridNotIn(List<String> values) {
            addCriterion("actorId not in", values, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridBetween(String value1, String value2) {
            addCriterion("actorId between", value1, value2, "actorid");
            return (Criteria) this;
        }

        public Criteria andActoridNotBetween(String value1, String value2) {
            addCriterion("actorId not between", value1, value2, "actorid");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNull() {
            addCriterion("reserved1 is null");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNotNull() {
            addCriterion("reserved1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved1EqualTo(String value) {
            addCriterion("reserved1 =", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotEqualTo(String value) {
            addCriterion("reserved1 <>", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThan(String value) {
            addCriterion("reserved1 >", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("reserved1 >=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThan(String value) {
            addCriterion("reserved1 <", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThanOrEqualTo(String value) {
            addCriterion("reserved1 <=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Like(String value) {
            addCriterion("reserved1 like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotLike(String value) {
            addCriterion("reserved1 not like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1In(List<String> values) {
            addCriterion("reserved1 in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotIn(List<String> values) {
            addCriterion("reserved1 not in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Between(String value1, String value2) {
            addCriterion("reserved1 between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotBetween(String value1, String value2) {
            addCriterion("reserved1 not between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andFullidLikeInsensitive(String value) {
            addCriterion("upper(fullId) like", value.toUpperCase(), "fullid");
            return (Criteria) this;
        }

        public Criteria andActorLikeInsensitive(String value) {
            addCriterion("upper(actor) like", value.toUpperCase(), "actor");
            return (Criteria) this;
        }

        public Criteria andLogtimeLikeInsensitive(String value) {
            addCriterion("upper(logTime) like", value.toUpperCase(), "logtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andActoridLikeInsensitive(String value) {
            addCriterion("upper(actorId) like", value.toUpperCase(), "actorid");
            return (Criteria) this;
        }

        public Criteria andReserved1LikeInsensitive(String value) {
            addCriterion("upper(reserved1) like", value.toUpperCase(), "reserved1");
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