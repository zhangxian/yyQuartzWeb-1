package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class TCenterTaxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterTaxExample() {
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

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentid0IsNull() {
            addCriterion("parentId0 is null");
            return (Criteria) this;
        }

        public Criteria andParentid0IsNotNull() {
            addCriterion("parentId0 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid0EqualTo(String value) {
            addCriterion("parentId0 =", value, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0NotEqualTo(String value) {
            addCriterion("parentId0 <>", value, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0GreaterThan(String value) {
            addCriterion("parentId0 >", value, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0GreaterThanOrEqualTo(String value) {
            addCriterion("parentId0 >=", value, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0LessThan(String value) {
            addCriterion("parentId0 <", value, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0LessThanOrEqualTo(String value) {
            addCriterion("parentId0 <=", value, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0Like(String value) {
            addCriterion("parentId0 like", value, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0NotLike(String value) {
            addCriterion("parentId0 not like", value, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0In(List<String> values) {
            addCriterion("parentId0 in", values, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0NotIn(List<String> values) {
            addCriterion("parentId0 not in", values, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0Between(String value1, String value2) {
            addCriterion("parentId0 between", value1, value2, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid0NotBetween(String value1, String value2) {
            addCriterion("parentId0 not between", value1, value2, "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid1IsNull() {
            addCriterion("parentId1 is null");
            return (Criteria) this;
        }

        public Criteria andParentid1IsNotNull() {
            addCriterion("parentId1 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid1EqualTo(String value) {
            addCriterion("parentId1 =", value, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1NotEqualTo(String value) {
            addCriterion("parentId1 <>", value, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1GreaterThan(String value) {
            addCriterion("parentId1 >", value, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1GreaterThanOrEqualTo(String value) {
            addCriterion("parentId1 >=", value, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1LessThan(String value) {
            addCriterion("parentId1 <", value, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1LessThanOrEqualTo(String value) {
            addCriterion("parentId1 <=", value, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1Like(String value) {
            addCriterion("parentId1 like", value, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1NotLike(String value) {
            addCriterion("parentId1 not like", value, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1In(List<String> values) {
            addCriterion("parentId1 in", values, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1NotIn(List<String> values) {
            addCriterion("parentId1 not in", values, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1Between(String value1, String value2) {
            addCriterion("parentId1 between", value1, value2, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid1NotBetween(String value1, String value2) {
            addCriterion("parentId1 not between", value1, value2, "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid2IsNull() {
            addCriterion("parentId2 is null");
            return (Criteria) this;
        }

        public Criteria andParentid2IsNotNull() {
            addCriterion("parentId2 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid2EqualTo(String value) {
            addCriterion("parentId2 =", value, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2NotEqualTo(String value) {
            addCriterion("parentId2 <>", value, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2GreaterThan(String value) {
            addCriterion("parentId2 >", value, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2GreaterThanOrEqualTo(String value) {
            addCriterion("parentId2 >=", value, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2LessThan(String value) {
            addCriterion("parentId2 <", value, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2LessThanOrEqualTo(String value) {
            addCriterion("parentId2 <=", value, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2Like(String value) {
            addCriterion("parentId2 like", value, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2NotLike(String value) {
            addCriterion("parentId2 not like", value, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2In(List<String> values) {
            addCriterion("parentId2 in", values, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2NotIn(List<String> values) {
            addCriterion("parentId2 not in", values, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2Between(String value1, String value2) {
            addCriterion("parentId2 between", value1, value2, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid2NotBetween(String value1, String value2) {
            addCriterion("parentId2 not between", value1, value2, "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid3IsNull() {
            addCriterion("parentId3 is null");
            return (Criteria) this;
        }

        public Criteria andParentid3IsNotNull() {
            addCriterion("parentId3 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid3EqualTo(String value) {
            addCriterion("parentId3 =", value, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3NotEqualTo(String value) {
            addCriterion("parentId3 <>", value, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3GreaterThan(String value) {
            addCriterion("parentId3 >", value, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3GreaterThanOrEqualTo(String value) {
            addCriterion("parentId3 >=", value, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3LessThan(String value) {
            addCriterion("parentId3 <", value, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3LessThanOrEqualTo(String value) {
            addCriterion("parentId3 <=", value, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3Like(String value) {
            addCriterion("parentId3 like", value, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3NotLike(String value) {
            addCriterion("parentId3 not like", value, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3In(List<String> values) {
            addCriterion("parentId3 in", values, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3NotIn(List<String> values) {
            addCriterion("parentId3 not in", values, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3Between(String value1, String value2) {
            addCriterion("parentId3 between", value1, value2, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid3NotBetween(String value1, String value2) {
            addCriterion("parentId3 not between", value1, value2, "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid4IsNull() {
            addCriterion("parentId4 is null");
            return (Criteria) this;
        }

        public Criteria andParentid4IsNotNull() {
            addCriterion("parentId4 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid4EqualTo(String value) {
            addCriterion("parentId4 =", value, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4NotEqualTo(String value) {
            addCriterion("parentId4 <>", value, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4GreaterThan(String value) {
            addCriterion("parentId4 >", value, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4GreaterThanOrEqualTo(String value) {
            addCriterion("parentId4 >=", value, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4LessThan(String value) {
            addCriterion("parentId4 <", value, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4LessThanOrEqualTo(String value) {
            addCriterion("parentId4 <=", value, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4Like(String value) {
            addCriterion("parentId4 like", value, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4NotLike(String value) {
            addCriterion("parentId4 not like", value, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4In(List<String> values) {
            addCriterion("parentId4 in", values, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4NotIn(List<String> values) {
            addCriterion("parentId4 not in", values, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4Between(String value1, String value2) {
            addCriterion("parentId4 between", value1, value2, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid4NotBetween(String value1, String value2) {
            addCriterion("parentId4 not between", value1, value2, "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid5IsNull() {
            addCriterion("parentId5 is null");
            return (Criteria) this;
        }

        public Criteria andParentid5IsNotNull() {
            addCriterion("parentId5 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid5EqualTo(String value) {
            addCriterion("parentId5 =", value, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5NotEqualTo(String value) {
            addCriterion("parentId5 <>", value, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5GreaterThan(String value) {
            addCriterion("parentId5 >", value, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5GreaterThanOrEqualTo(String value) {
            addCriterion("parentId5 >=", value, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5LessThan(String value) {
            addCriterion("parentId5 <", value, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5LessThanOrEqualTo(String value) {
            addCriterion("parentId5 <=", value, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5Like(String value) {
            addCriterion("parentId5 like", value, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5NotLike(String value) {
            addCriterion("parentId5 not like", value, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5In(List<String> values) {
            addCriterion("parentId5 in", values, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5NotIn(List<String> values) {
            addCriterion("parentId5 not in", values, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5Between(String value1, String value2) {
            addCriterion("parentId5 between", value1, value2, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid5NotBetween(String value1, String value2) {
            addCriterion("parentId5 not between", value1, value2, "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid6IsNull() {
            addCriterion("parentId6 is null");
            return (Criteria) this;
        }

        public Criteria andParentid6IsNotNull() {
            addCriterion("parentId6 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid6EqualTo(String value) {
            addCriterion("parentId6 =", value, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6NotEqualTo(String value) {
            addCriterion("parentId6 <>", value, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6GreaterThan(String value) {
            addCriterion("parentId6 >", value, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6GreaterThanOrEqualTo(String value) {
            addCriterion("parentId6 >=", value, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6LessThan(String value) {
            addCriterion("parentId6 <", value, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6LessThanOrEqualTo(String value) {
            addCriterion("parentId6 <=", value, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6Like(String value) {
            addCriterion("parentId6 like", value, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6NotLike(String value) {
            addCriterion("parentId6 not like", value, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6In(List<String> values) {
            addCriterion("parentId6 in", values, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6NotIn(List<String> values) {
            addCriterion("parentId6 not in", values, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6Between(String value1, String value2) {
            addCriterion("parentId6 between", value1, value2, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid6NotBetween(String value1, String value2) {
            addCriterion("parentId6 not between", value1, value2, "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid7IsNull() {
            addCriterion("parentId7 is null");
            return (Criteria) this;
        }

        public Criteria andParentid7IsNotNull() {
            addCriterion("parentId7 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid7EqualTo(String value) {
            addCriterion("parentId7 =", value, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7NotEqualTo(String value) {
            addCriterion("parentId7 <>", value, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7GreaterThan(String value) {
            addCriterion("parentId7 >", value, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7GreaterThanOrEqualTo(String value) {
            addCriterion("parentId7 >=", value, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7LessThan(String value) {
            addCriterion("parentId7 <", value, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7LessThanOrEqualTo(String value) {
            addCriterion("parentId7 <=", value, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7Like(String value) {
            addCriterion("parentId7 like", value, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7NotLike(String value) {
            addCriterion("parentId7 not like", value, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7In(List<String> values) {
            addCriterion("parentId7 in", values, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7NotIn(List<String> values) {
            addCriterion("parentId7 not in", values, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7Between(String value1, String value2) {
            addCriterion("parentId7 between", value1, value2, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid7NotBetween(String value1, String value2) {
            addCriterion("parentId7 not between", value1, value2, "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid8IsNull() {
            addCriterion("parentId8 is null");
            return (Criteria) this;
        }

        public Criteria andParentid8IsNotNull() {
            addCriterion("parentId8 is not null");
            return (Criteria) this;
        }

        public Criteria andParentid8EqualTo(String value) {
            addCriterion("parentId8 =", value, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8NotEqualTo(String value) {
            addCriterion("parentId8 <>", value, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8GreaterThan(String value) {
            addCriterion("parentId8 >", value, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8GreaterThanOrEqualTo(String value) {
            addCriterion("parentId8 >=", value, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8LessThan(String value) {
            addCriterion("parentId8 <", value, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8LessThanOrEqualTo(String value) {
            addCriterion("parentId8 <=", value, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8Like(String value) {
            addCriterion("parentId8 like", value, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8NotLike(String value) {
            addCriterion("parentId8 not like", value, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8In(List<String> values) {
            addCriterion("parentId8 in", values, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8NotIn(List<String> values) {
            addCriterion("parentId8 not in", values, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8Between(String value1, String value2) {
            addCriterion("parentId8 between", value1, value2, "parentid8");
            return (Criteria) this;
        }

        public Criteria andParentid8NotBetween(String value1, String value2) {
            addCriterion("parentId8 not between", value1, value2, "parentid8");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNull() {
            addCriterion("ptype is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("ptype is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(String value) {
            addCriterion("ptype =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(String value) {
            addCriterion("ptype <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(String value) {
            addCriterion("ptype >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ptype >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(String value) {
            addCriterion("ptype <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(String value) {
            addCriterion("ptype <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLike(String value) {
            addCriterion("ptype like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotLike(String value) {
            addCriterion("ptype not like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<String> values) {
            addCriterion("ptype in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<String> values) {
            addCriterion("ptype not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(String value1, String value2) {
            addCriterion("ptype between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(String value1, String value2) {
            addCriterion("ptype not between", value1, value2, "ptype");
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

        public Criteria andBnameIsNull() {
            addCriterion("bname is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bname is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bname =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bname <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bname >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bname >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bname <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bname <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bname like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bname not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bname in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bname not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bname between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bname not between", value1, value2, "bname");
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

        public Criteria andReftypeIsNull() {
            addCriterion("refType is null");
            return (Criteria) this;
        }

        public Criteria andReftypeIsNotNull() {
            addCriterion("refType is not null");
            return (Criteria) this;
        }

        public Criteria andReftypeEqualTo(Integer value) {
            addCriterion("refType =", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeNotEqualTo(Integer value) {
            addCriterion("refType <>", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeGreaterThan(Integer value) {
            addCriterion("refType >", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refType >=", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeLessThan(Integer value) {
            addCriterion("refType <", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeLessThanOrEqualTo(Integer value) {
            addCriterion("refType <=", value, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeIn(List<Integer> values) {
            addCriterion("refType in", values, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeNotIn(List<Integer> values) {
            addCriterion("refType not in", values, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeBetween(Integer value1, Integer value2) {
            addCriterion("refType between", value1, value2, "reftype");
            return (Criteria) this;
        }

        public Criteria andReftypeNotBetween(Integer value1, Integer value2) {
            addCriterion("refType not between", value1, value2, "reftype");
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

        public Criteria andBottomflagIsNull() {
            addCriterion("bottomFlag is null");
            return (Criteria) this;
        }

        public Criteria andBottomflagIsNotNull() {
            addCriterion("bottomFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBottomflagEqualTo(Integer value) {
            addCriterion("bottomFlag =", value, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagNotEqualTo(Integer value) {
            addCriterion("bottomFlag <>", value, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagGreaterThan(Integer value) {
            addCriterion("bottomFlag >", value, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("bottomFlag >=", value, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagLessThan(Integer value) {
            addCriterion("bottomFlag <", value, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagLessThanOrEqualTo(Integer value) {
            addCriterion("bottomFlag <=", value, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagIn(List<Integer> values) {
            addCriterion("bottomFlag in", values, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagNotIn(List<Integer> values) {
            addCriterion("bottomFlag not in", values, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagBetween(Integer value1, Integer value2) {
            addCriterion("bottomFlag between", value1, value2, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andBottomflagNotBetween(Integer value1, Integer value2) {
            addCriterion("bottomFlag not between", value1, value2, "bottomflag");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Integer value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Integer value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Integer value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Integer value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Integer value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Integer> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Integer> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Integer value1, Integer value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Integer value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Integer value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Integer value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Integer value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Integer> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Integer> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andStafferIsNull() {
            addCriterion("staffer is null");
            return (Criteria) this;
        }

        public Criteria andStafferIsNotNull() {
            addCriterion("staffer is not null");
            return (Criteria) this;
        }

        public Criteria andStafferEqualTo(Integer value) {
            addCriterion("staffer =", value, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferNotEqualTo(Integer value) {
            addCriterion("staffer <>", value, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferGreaterThan(Integer value) {
            addCriterion("staffer >", value, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferGreaterThanOrEqualTo(Integer value) {
            addCriterion("staffer >=", value, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferLessThan(Integer value) {
            addCriterion("staffer <", value, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferLessThanOrEqualTo(Integer value) {
            addCriterion("staffer <=", value, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferIn(List<Integer> values) {
            addCriterion("staffer in", values, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferNotIn(List<Integer> values) {
            addCriterion("staffer not in", values, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferBetween(Integer value1, Integer value2) {
            addCriterion("staffer between", value1, value2, "staffer");
            return (Criteria) this;
        }

        public Criteria andStafferNotBetween(Integer value1, Integer value2) {
            addCriterion("staffer not between", value1, value2, "staffer");
            return (Criteria) this;
        }

        public Criteria andDepotIsNull() {
            addCriterion("depot is null");
            return (Criteria) this;
        }

        public Criteria andDepotIsNotNull() {
            addCriterion("depot is not null");
            return (Criteria) this;
        }

        public Criteria andDepotEqualTo(Integer value) {
            addCriterion("depot =", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotNotEqualTo(Integer value) {
            addCriterion("depot <>", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotGreaterThan(Integer value) {
            addCriterion("depot >", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotGreaterThanOrEqualTo(Integer value) {
            addCriterion("depot >=", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotLessThan(Integer value) {
            addCriterion("depot <", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotLessThanOrEqualTo(Integer value) {
            addCriterion("depot <=", value, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotIn(List<Integer> values) {
            addCriterion("depot in", values, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotNotIn(List<Integer> values) {
            addCriterion("depot not in", values, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotBetween(Integer value1, Integer value2) {
            addCriterion("depot between", value1, value2, "depot");
            return (Criteria) this;
        }

        public Criteria andDepotNotBetween(Integer value1, Integer value2) {
            addCriterion("depot not between", value1, value2, "depot");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(Integer value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(Integer value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(Integer value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(Integer value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(Integer value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<Integer> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<Integer> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(Integer value1, Integer value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(Integer value1, Integer value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("duty is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("duty is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(Integer value) {
            addCriterion("duty =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(Integer value) {
            addCriterion("duty <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(Integer value) {
            addCriterion("duty >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(Integer value) {
            addCriterion("duty >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(Integer value) {
            addCriterion("duty <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(Integer value) {
            addCriterion("duty <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<Integer> values) {
            addCriterion("duty in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<Integer> values) {
            addCriterion("duty not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(Integer value1, Integer value2) {
            addCriterion("duty between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(Integer value1, Integer value2) {
            addCriterion("duty not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andCheckstafferIsNull() {
            addCriterion("checkStaffer is null");
            return (Criteria) this;
        }

        public Criteria andCheckstafferIsNotNull() {
            addCriterion("checkStaffer is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstafferEqualTo(Integer value) {
            addCriterion("checkStaffer =", value, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferNotEqualTo(Integer value) {
            addCriterion("checkStaffer <>", value, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferGreaterThan(Integer value) {
            addCriterion("checkStaffer >", value, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkStaffer >=", value, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferLessThan(Integer value) {
            addCriterion("checkStaffer <", value, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferLessThanOrEqualTo(Integer value) {
            addCriterion("checkStaffer <=", value, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferIn(List<Integer> values) {
            addCriterion("checkStaffer in", values, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferNotIn(List<Integer> values) {
            addCriterion("checkStaffer not in", values, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferBetween(Integer value1, Integer value2) {
            addCriterion("checkStaffer between", value1, value2, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andCheckstafferNotBetween(Integer value1, Integer value2) {
            addCriterion("checkStaffer not between", value1, value2, "checkstaffer");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andParentidLikeInsensitive(String value) {
            addCriterion("upper(parentId) like", value.toUpperCase(), "parentid");
            return (Criteria) this;
        }

        public Criteria andParentid0LikeInsensitive(String value) {
            addCriterion("upper(parentId0) like", value.toUpperCase(), "parentid0");
            return (Criteria) this;
        }

        public Criteria andParentid1LikeInsensitive(String value) {
            addCriterion("upper(parentId1) like", value.toUpperCase(), "parentid1");
            return (Criteria) this;
        }

        public Criteria andParentid2LikeInsensitive(String value) {
            addCriterion("upper(parentId2) like", value.toUpperCase(), "parentid2");
            return (Criteria) this;
        }

        public Criteria andParentid3LikeInsensitive(String value) {
            addCriterion("upper(parentId3) like", value.toUpperCase(), "parentid3");
            return (Criteria) this;
        }

        public Criteria andParentid4LikeInsensitive(String value) {
            addCriterion("upper(parentId4) like", value.toUpperCase(), "parentid4");
            return (Criteria) this;
        }

        public Criteria andParentid5LikeInsensitive(String value) {
            addCriterion("upper(parentId5) like", value.toUpperCase(), "parentid5");
            return (Criteria) this;
        }

        public Criteria andParentid6LikeInsensitive(String value) {
            addCriterion("upper(parentId6) like", value.toUpperCase(), "parentid6");
            return (Criteria) this;
        }

        public Criteria andParentid7LikeInsensitive(String value) {
            addCriterion("upper(parentId7) like", value.toUpperCase(), "parentid7");
            return (Criteria) this;
        }

        public Criteria andParentid8LikeInsensitive(String value) {
            addCriterion("upper(parentId8) like", value.toUpperCase(), "parentid8");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andPtypeLikeInsensitive(String value) {
            addCriterion("upper(ptype) like", value.toUpperCase(), "ptype");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andBnameLikeInsensitive(String value) {
            addCriterion("upper(bname) like", value.toUpperCase(), "bname");
            return (Criteria) this;
        }

        public Criteria andRefidLikeInsensitive(String value) {
            addCriterion("upper(refId) like", value.toUpperCase(), "refid");
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