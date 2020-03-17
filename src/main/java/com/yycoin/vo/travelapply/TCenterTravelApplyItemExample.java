package com.yycoin.vo.travelapply;

import java.util.ArrayList;
import java.util.List;

public class TCenterTravelApplyItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterTravelApplyItemExample() {
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

        public Criteria andFeeitemidIsNull() {
            addCriterion("feeItemId is null");
            return (Criteria) this;
        }

        public Criteria andFeeitemidIsNotNull() {
            addCriterion("feeItemId is not null");
            return (Criteria) this;
        }

        public Criteria andFeeitemidEqualTo(String value) {
            addCriterion("feeItemId =", value, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidNotEqualTo(String value) {
            addCriterion("feeItemId <>", value, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidGreaterThan(String value) {
            addCriterion("feeItemId >", value, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidGreaterThanOrEqualTo(String value) {
            addCriterion("feeItemId >=", value, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidLessThan(String value) {
            addCriterion("feeItemId <", value, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidLessThanOrEqualTo(String value) {
            addCriterion("feeItemId <=", value, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidLike(String value) {
            addCriterion("feeItemId like", value, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidNotLike(String value) {
            addCriterion("feeItemId not like", value, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidIn(List<String> values) {
            addCriterion("feeItemId in", values, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidNotIn(List<String> values) {
            addCriterion("feeItemId not in", values, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidBetween(String value1, String value2) {
            addCriterion("feeItemId between", value1, value2, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeitemidNotBetween(String value1, String value2) {
            addCriterion("feeItemId not between", value1, value2, "feeitemid");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andMoneysIsNull() {
            addCriterion("moneys is null");
            return (Criteria) this;
        }

        public Criteria andMoneysIsNotNull() {
            addCriterion("moneys is not null");
            return (Criteria) this;
        }

        public Criteria andMoneysEqualTo(Long value) {
            addCriterion("moneys =", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysNotEqualTo(Long value) {
            addCriterion("moneys <>", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysGreaterThan(Long value) {
            addCriterion("moneys >", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysGreaterThanOrEqualTo(Long value) {
            addCriterion("moneys >=", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysLessThan(Long value) {
            addCriterion("moneys <", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysLessThanOrEqualTo(Long value) {
            addCriterion("moneys <=", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysIn(List<Long> values) {
            addCriterion("moneys in", values, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysNotIn(List<Long> values) {
            addCriterion("moneys not in", values, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysBetween(Long value1, Long value2) {
            addCriterion("moneys between", value1, value2, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysNotBetween(Long value1, Long value2) {
            addCriterion("moneys not between", value1, value2, "moneys");
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

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
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

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPricesIsNull() {
            addCriterion("prices is null");
            return (Criteria) this;
        }

        public Criteria andPricesIsNotNull() {
            addCriterion("prices is not null");
            return (Criteria) this;
        }

        public Criteria andPricesEqualTo(Long value) {
            addCriterion("prices =", value, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesNotEqualTo(Long value) {
            addCriterion("prices <>", value, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesGreaterThan(Long value) {
            addCriterion("prices >", value, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesGreaterThanOrEqualTo(Long value) {
            addCriterion("prices >=", value, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesLessThan(Long value) {
            addCriterion("prices <", value, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesLessThanOrEqualTo(Long value) {
            addCriterion("prices <=", value, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesIn(List<Long> values) {
            addCriterion("prices in", values, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesNotIn(List<Long> values) {
            addCriterion("prices not in", values, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesBetween(Long value1, Long value2) {
            addCriterion("prices between", value1, value2, "prices");
            return (Criteria) this;
        }

        public Criteria andPricesNotBetween(Long value1, Long value2) {
            addCriterion("prices not between", value1, value2, "prices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesIsNull() {
            addCriterion("checkPrices is null");
            return (Criteria) this;
        }

        public Criteria andCheckpricesIsNotNull() {
            addCriterion("checkPrices is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpricesEqualTo(Long value) {
            addCriterion("checkPrices =", value, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesNotEqualTo(Long value) {
            addCriterion("checkPrices <>", value, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesGreaterThan(Long value) {
            addCriterion("checkPrices >", value, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesGreaterThanOrEqualTo(Long value) {
            addCriterion("checkPrices >=", value, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesLessThan(Long value) {
            addCriterion("checkPrices <", value, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesLessThanOrEqualTo(Long value) {
            addCriterion("checkPrices <=", value, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesIn(List<Long> values) {
            addCriterion("checkPrices in", values, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesNotIn(List<Long> values) {
            addCriterion("checkPrices not in", values, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesBetween(Long value1, Long value2) {
            addCriterion("checkPrices between", value1, value2, "checkprices");
            return (Criteria) this;
        }

        public Criteria andCheckpricesNotBetween(Long value1, Long value2) {
            addCriterion("checkPrices not between", value1, value2, "checkprices");
            return (Criteria) this;
        }

        public Criteria andFeestafferidIsNull() {
            addCriterion("feeStafferId is null");
            return (Criteria) this;
        }

        public Criteria andFeestafferidIsNotNull() {
            addCriterion("feeStafferId is not null");
            return (Criteria) this;
        }

        public Criteria andFeestafferidEqualTo(String value) {
            addCriterion("feeStafferId =", value, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidNotEqualTo(String value) {
            addCriterion("feeStafferId <>", value, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidGreaterThan(String value) {
            addCriterion("feeStafferId >", value, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidGreaterThanOrEqualTo(String value) {
            addCriterion("feeStafferId >=", value, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidLessThan(String value) {
            addCriterion("feeStafferId <", value, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidLessThanOrEqualTo(String value) {
            addCriterion("feeStafferId <=", value, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidLike(String value) {
            addCriterion("feeStafferId like", value, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidNotLike(String value) {
            addCriterion("feeStafferId not like", value, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidIn(List<String> values) {
            addCriterion("feeStafferId in", values, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidNotIn(List<String> values) {
            addCriterion("feeStafferId not in", values, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidBetween(String value1, String value2) {
            addCriterion("feeStafferId between", value1, value2, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andFeestafferidNotBetween(String value1, String value2) {
            addCriterion("feeStafferId not between", value1, value2, "feestafferid");
            return (Criteria) this;
        }

        public Criteria andBudgetidIsNull() {
            addCriterion("budgetId is null");
            return (Criteria) this;
        }

        public Criteria andBudgetidIsNotNull() {
            addCriterion("budgetId is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetidEqualTo(String value) {
            addCriterion("budgetId =", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidNotEqualTo(String value) {
            addCriterion("budgetId <>", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidGreaterThan(String value) {
            addCriterion("budgetId >", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidGreaterThanOrEqualTo(String value) {
            addCriterion("budgetId >=", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidLessThan(String value) {
            addCriterion("budgetId <", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidLessThanOrEqualTo(String value) {
            addCriterion("budgetId <=", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidLike(String value) {
            addCriterion("budgetId like", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidNotLike(String value) {
            addCriterion("budgetId not like", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidIn(List<String> values) {
            addCriterion("budgetId in", values, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidNotIn(List<String> values) {
            addCriterion("budgetId not in", values, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidBetween(String value1, String value2) {
            addCriterion("budgetId between", value1, value2, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidNotBetween(String value1, String value2) {
            addCriterion("budgetId not between", value1, value2, "budgetid");
            return (Criteria) this;
        }

        public Criteria andCmoneysIsNull() {
            addCriterion("cmoneys is null");
            return (Criteria) this;
        }

        public Criteria andCmoneysIsNotNull() {
            addCriterion("cmoneys is not null");
            return (Criteria) this;
        }

        public Criteria andCmoneysEqualTo(Long value) {
            addCriterion("cmoneys =", value, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysNotEqualTo(Long value) {
            addCriterion("cmoneys <>", value, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysGreaterThan(Long value) {
            addCriterion("cmoneys >", value, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysGreaterThanOrEqualTo(Long value) {
            addCriterion("cmoneys >=", value, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysLessThan(Long value) {
            addCriterion("cmoneys <", value, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysLessThanOrEqualTo(Long value) {
            addCriterion("cmoneys <=", value, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysIn(List<Long> values) {
            addCriterion("cmoneys in", values, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysNotIn(List<Long> values) {
            addCriterion("cmoneys not in", values, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysBetween(Long value1, Long value2) {
            addCriterion("cmoneys between", value1, value2, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andCmoneysNotBetween(Long value1, Long value2) {
            addCriterion("cmoneys not between", value1, value2, "cmoneys");
            return (Criteria) this;
        }

        public Criteria andUportalstatusIsNull() {
            addCriterion("uportalstatus is null");
            return (Criteria) this;
        }

        public Criteria andUportalstatusIsNotNull() {
            addCriterion("uportalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andUportalstatusEqualTo(String value) {
            addCriterion("uportalstatus =", value, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusNotEqualTo(String value) {
            addCriterion("uportalstatus <>", value, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusGreaterThan(String value) {
            addCriterion("uportalstatus >", value, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("uportalstatus >=", value, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusLessThan(String value) {
            addCriterion("uportalstatus <", value, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusLessThanOrEqualTo(String value) {
            addCriterion("uportalstatus <=", value, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusLike(String value) {
            addCriterion("uportalstatus like", value, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusNotLike(String value) {
            addCriterion("uportalstatus not like", value, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusIn(List<String> values) {
            addCriterion("uportalstatus in", values, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusNotIn(List<String> values) {
            addCriterion("uportalstatus not in", values, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusBetween(String value1, String value2) {
            addCriterion("uportalstatus between", value1, value2, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andUportalstatusNotBetween(String value1, String value2) {
            addCriterion("uportalstatus not between", value1, value2, "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameIsNull() {
            addCriterion("maycur_payname is null");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameIsNotNull() {
            addCriterion("maycur_payname is not null");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameEqualTo(String value) {
            addCriterion("maycur_payname =", value, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameNotEqualTo(String value) {
            addCriterion("maycur_payname <>", value, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameGreaterThan(String value) {
            addCriterion("maycur_payname >", value, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameGreaterThanOrEqualTo(String value) {
            addCriterion("maycur_payname >=", value, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameLessThan(String value) {
            addCriterion("maycur_payname <", value, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameLessThanOrEqualTo(String value) {
            addCriterion("maycur_payname <=", value, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameLike(String value) {
            addCriterion("maycur_payname like", value, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameNotLike(String value) {
            addCriterion("maycur_payname not like", value, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameIn(List<String> values) {
            addCriterion("maycur_payname in", values, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameNotIn(List<String> values) {
            addCriterion("maycur_payname not in", values, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameBetween(String value1, String value2) {
            addCriterion("maycur_payname between", value1, value2, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameNotBetween(String value1, String value2) {
            addCriterion("maycur_payname not between", value1, value2, "maycurPayname");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andParentidLikeInsensitive(String value) {
            addCriterion("upper(parentId) like", value.toUpperCase(), "parentid");
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

        public Criteria andFeeitemidLikeInsensitive(String value) {
            addCriterion("upper(feeItemId) like", value.toUpperCase(), "feeitemid");
            return (Criteria) this;
        }

        public Criteria andPurposeLikeInsensitive(String value) {
            addCriterion("upper(purpose) like", value.toUpperCase(), "purpose");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andProductnameLikeInsensitive(String value) {
            addCriterion("upper(productName) like", value.toUpperCase(), "productname");
            return (Criteria) this;
        }

        public Criteria andFeestafferidLikeInsensitive(String value) {
            addCriterion("upper(feeStafferId) like", value.toUpperCase(), "feestafferid");
            return (Criteria) this;
        }

        public Criteria andBudgetidLikeInsensitive(String value) {
            addCriterion("upper(budgetId) like", value.toUpperCase(), "budgetid");
            return (Criteria) this;
        }

        public Criteria andUportalstatusLikeInsensitive(String value) {
            addCriterion("upper(uportalstatus) like", value.toUpperCase(), "uportalstatus");
            return (Criteria) this;
        }

        public Criteria andMaycurPaynameLikeInsensitive(String value) {
            addCriterion("upper(maycur_payname) like", value.toUpperCase(), "maycurPayname");
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