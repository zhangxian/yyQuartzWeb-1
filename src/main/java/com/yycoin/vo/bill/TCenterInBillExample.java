package com.yycoin.vo.bill;

import java.util.ArrayList;
import java.util.List;

public class TCenterInBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterInBillExample() {
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

        public Criteria andUlockIsNull() {
            addCriterion("ulock is null");
            return (Criteria) this;
        }

        public Criteria andUlockIsNotNull() {
            addCriterion("ulock is not null");
            return (Criteria) this;
        }

        public Criteria andUlockEqualTo(Integer value) {
            addCriterion("ulock =", value, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockNotEqualTo(Integer value) {
            addCriterion("ulock <>", value, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockGreaterThan(Integer value) {
            addCriterion("ulock >", value, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockGreaterThanOrEqualTo(Integer value) {
            addCriterion("ulock >=", value, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockLessThan(Integer value) {
            addCriterion("ulock <", value, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockLessThanOrEqualTo(Integer value) {
            addCriterion("ulock <=", value, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockIn(List<Integer> values) {
            addCriterion("ulock in", values, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockNotIn(List<Integer> values) {
            addCriterion("ulock not in", values, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockBetween(Integer value1, Integer value2) {
            addCriterion("ulock between", value1, value2, "ulock");
            return (Criteria) this;
        }

        public Criteria andUlockNotBetween(Integer value1, Integer value2) {
            addCriterion("ulock not between", value1, value2, "ulock");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankId is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankId is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(String value) {
            addCriterion("bankId =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(String value) {
            addCriterion("bankId <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(String value) {
            addCriterion("bankId >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(String value) {
            addCriterion("bankId >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(String value) {
            addCriterion("bankId <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(String value) {
            addCriterion("bankId <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLike(String value) {
            addCriterion("bankId like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotLike(String value) {
            addCriterion("bankId not like", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<String> values) {
            addCriterion("bankId in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<String> values) {
            addCriterion("bankId not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(String value1, String value2) {
            addCriterion("bankId between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(String value1, String value2) {
            addCriterion("bankId not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andOutidIsNull() {
            addCriterion("outId is null");
            return (Criteria) this;
        }

        public Criteria andOutidIsNotNull() {
            addCriterion("outId is not null");
            return (Criteria) this;
        }

        public Criteria andOutidEqualTo(String value) {
            addCriterion("outId =", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotEqualTo(String value) {
            addCriterion("outId <>", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThan(String value) {
            addCriterion("outId >", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThanOrEqualTo(String value) {
            addCriterion("outId >=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThan(String value) {
            addCriterion("outId <", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThanOrEqualTo(String value) {
            addCriterion("outId <=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLike(String value) {
            addCriterion("outId like", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotLike(String value) {
            addCriterion("outId not like", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidIn(List<String> values) {
            addCriterion("outId in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotIn(List<String> values) {
            addCriterion("outId not in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidBetween(String value1, String value2) {
            addCriterion("outId between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotBetween(String value1, String value2) {
            addCriterion("outId not between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidIsNull() {
            addCriterion("outBalanceId is null");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidIsNotNull() {
            addCriterion("outBalanceId is not null");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidEqualTo(String value) {
            addCriterion("outBalanceId =", value, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidNotEqualTo(String value) {
            addCriterion("outBalanceId <>", value, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidGreaterThan(String value) {
            addCriterion("outBalanceId >", value, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidGreaterThanOrEqualTo(String value) {
            addCriterion("outBalanceId >=", value, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidLessThan(String value) {
            addCriterion("outBalanceId <", value, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidLessThanOrEqualTo(String value) {
            addCriterion("outBalanceId <=", value, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidLike(String value) {
            addCriterion("outBalanceId like", value, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidNotLike(String value) {
            addCriterion("outBalanceId not like", value, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidIn(List<String> values) {
            addCriterion("outBalanceId in", values, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidNotIn(List<String> values) {
            addCriterion("outBalanceId not in", values, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidBetween(String value1, String value2) {
            addCriterion("outBalanceId between", value1, value2, "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidNotBetween(String value1, String value2) {
            addCriterion("outBalanceId not between", value1, value2, "outbalanceid");
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

        public Criteria andMoneysIsNull() {
            addCriterion("moneys is null");
            return (Criteria) this;
        }

        public Criteria andMoneysIsNotNull() {
            addCriterion("moneys is not null");
            return (Criteria) this;
        }

        public Criteria andMoneysEqualTo(Double value) {
            addCriterion("moneys =", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysNotEqualTo(Double value) {
            addCriterion("moneys <>", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysGreaterThan(Double value) {
            addCriterion("moneys >", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysGreaterThanOrEqualTo(Double value) {
            addCriterion("moneys >=", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysLessThan(Double value) {
            addCriterion("moneys <", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysLessThanOrEqualTo(Double value) {
            addCriterion("moneys <=", value, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysIn(List<Double> values) {
            addCriterion("moneys in", values, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysNotIn(List<Double> values) {
            addCriterion("moneys not in", values, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysBetween(Double value1, Double value2) {
            addCriterion("moneys between", value1, value2, "moneys");
            return (Criteria) this;
        }

        public Criteria andMoneysNotBetween(Double value1, Double value2) {
            addCriterion("moneys not between", value1, value2, "moneys");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerId like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerId not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
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

        public Criteria andOwneridIsNull() {
            addCriterion("ownerId is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("ownerId is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(String value) {
            addCriterion("ownerId =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(String value) {
            addCriterion("ownerId <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(String value) {
            addCriterion("ownerId >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(String value) {
            addCriterion("ownerId >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(String value) {
            addCriterion("ownerId <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(String value) {
            addCriterion("ownerId <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLike(String value) {
            addCriterion("ownerId like", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotLike(String value) {
            addCriterion("ownerId not like", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<String> values) {
            addCriterion("ownerId in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<String> values) {
            addCriterion("ownerId not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(String value1, String value2) {
            addCriterion("ownerId between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(String value1, String value2) {
            addCriterion("ownerId not between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNull() {
            addCriterion("locationId is null");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNotNull() {
            addCriterion("locationId is not null");
            return (Criteria) this;
        }

        public Criteria andLocationidEqualTo(String value) {
            addCriterion("locationId =", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotEqualTo(String value) {
            addCriterion("locationId <>", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThan(String value) {
            addCriterion("locationId >", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThanOrEqualTo(String value) {
            addCriterion("locationId >=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThan(String value) {
            addCriterion("locationId <", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThanOrEqualTo(String value) {
            addCriterion("locationId <=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLike(String value) {
            addCriterion("locationId like", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotLike(String value) {
            addCriterion("locationId not like", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidIn(List<String> values) {
            addCriterion("locationId in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotIn(List<String> values) {
            addCriterion("locationId not in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidBetween(String value1, String value2) {
            addCriterion("locationId between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotBetween(String value1, String value2) {
            addCriterion("locationId not between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andDestbankidIsNull() {
            addCriterion("destBankId is null");
            return (Criteria) this;
        }

        public Criteria andDestbankidIsNotNull() {
            addCriterion("destBankId is not null");
            return (Criteria) this;
        }

        public Criteria andDestbankidEqualTo(String value) {
            addCriterion("destBankId =", value, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidNotEqualTo(String value) {
            addCriterion("destBankId <>", value, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidGreaterThan(String value) {
            addCriterion("destBankId >", value, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidGreaterThanOrEqualTo(String value) {
            addCriterion("destBankId >=", value, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidLessThan(String value) {
            addCriterion("destBankId <", value, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidLessThanOrEqualTo(String value) {
            addCriterion("destBankId <=", value, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidLike(String value) {
            addCriterion("destBankId like", value, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidNotLike(String value) {
            addCriterion("destBankId not like", value, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidIn(List<String> values) {
            addCriterion("destBankId in", values, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidNotIn(List<String> values) {
            addCriterion("destBankId not in", values, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidBetween(String value1, String value2) {
            addCriterion("destBankId between", value1, value2, "destbankid");
            return (Criteria) this;
        }

        public Criteria andDestbankidNotBetween(String value1, String value2) {
            addCriterion("destBankId not between", value1, value2, "destbankid");
            return (Criteria) this;
        }

        public Criteria andRefbillidIsNull() {
            addCriterion("refBillId is null");
            return (Criteria) this;
        }

        public Criteria andRefbillidIsNotNull() {
            addCriterion("refBillId is not null");
            return (Criteria) this;
        }

        public Criteria andRefbillidEqualTo(String value) {
            addCriterion("refBillId =", value, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidNotEqualTo(String value) {
            addCriterion("refBillId <>", value, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidGreaterThan(String value) {
            addCriterion("refBillId >", value, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidGreaterThanOrEqualTo(String value) {
            addCriterion("refBillId >=", value, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidLessThan(String value) {
            addCriterion("refBillId <", value, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidLessThanOrEqualTo(String value) {
            addCriterion("refBillId <=", value, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidLike(String value) {
            addCriterion("refBillId like", value, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidNotLike(String value) {
            addCriterion("refBillId not like", value, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidIn(List<String> values) {
            addCriterion("refBillId in", values, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidNotIn(List<String> values) {
            addCriterion("refBillId not in", values, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidBetween(String value1, String value2) {
            addCriterion("refBillId between", value1, value2, "refbillid");
            return (Criteria) this;
        }

        public Criteria andRefbillidNotBetween(String value1, String value2) {
            addCriterion("refBillId not between", value1, value2, "refbillid");
            return (Criteria) this;
        }

        public Criteria andPaymentidIsNull() {
            addCriterion("paymentId is null");
            return (Criteria) this;
        }

        public Criteria andPaymentidIsNotNull() {
            addCriterion("paymentId is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentidEqualTo(String value) {
            addCriterion("paymentId =", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotEqualTo(String value) {
            addCriterion("paymentId <>", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThan(String value) {
            addCriterion("paymentId >", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThanOrEqualTo(String value) {
            addCriterion("paymentId >=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThan(String value) {
            addCriterion("paymentId <", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThanOrEqualTo(String value) {
            addCriterion("paymentId <=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLike(String value) {
            addCriterion("paymentId like", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotLike(String value) {
            addCriterion("paymentId not like", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidIn(List<String> values) {
            addCriterion("paymentId in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotIn(List<String> values) {
            addCriterion("paymentId not in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidBetween(String value1, String value2) {
            addCriterion("paymentId between", value1, value2, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotBetween(String value1, String value2) {
            addCriterion("paymentId not between", value1, value2, "paymentid");
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

        public Criteria andCheckstatusIsNull() {
            addCriterion("checkStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(Integer value) {
            addCriterion("checkStatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(Integer value) {
            addCriterion("checkStatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(Integer value) {
            addCriterion("checkStatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkStatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(Integer value) {
            addCriterion("checkStatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(Integer value) {
            addCriterion("checkStatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<Integer> values) {
            addCriterion("checkStatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<Integer> values) {
            addCriterion("checkStatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(Integer value1, Integer value2) {
            addCriterion("checkStatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("checkStatus not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysIsNull() {
            addCriterion("srcMoneys is null");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysIsNotNull() {
            addCriterion("srcMoneys is not null");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysEqualTo(Double value) {
            addCriterion("srcMoneys =", value, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysNotEqualTo(Double value) {
            addCriterion("srcMoneys <>", value, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysGreaterThan(Double value) {
            addCriterion("srcMoneys >", value, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysGreaterThanOrEqualTo(Double value) {
            addCriterion("srcMoneys >=", value, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysLessThan(Double value) {
            addCriterion("srcMoneys <", value, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysLessThanOrEqualTo(Double value) {
            addCriterion("srcMoneys <=", value, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysIn(List<Double> values) {
            addCriterion("srcMoneys in", values, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysNotIn(List<Double> values) {
            addCriterion("srcMoneys not in", values, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysBetween(Double value1, Double value2) {
            addCriterion("srcMoneys between", value1, value2, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andSrcmoneysNotBetween(Double value1, Double value2) {
            addCriterion("srcMoneys not between", value1, value2, "srcmoneys");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNull() {
            addCriterion("updateId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNotNull() {
            addCriterion("updateId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateidEqualTo(Integer value) {
            addCriterion("updateId =", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotEqualTo(Integer value) {
            addCriterion("updateId <>", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThan(Integer value) {
            addCriterion("updateId >", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateId >=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThan(Integer value) {
            addCriterion("updateId <", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThanOrEqualTo(Integer value) {
            addCriterion("updateId <=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidIn(List<Integer> values) {
            addCriterion("updateId in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotIn(List<Integer> values) {
            addCriterion("updateId not in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidBetween(Integer value1, Integer value2) {
            addCriterion("updateId between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotBetween(Integer value1, Integer value2) {
            addCriterion("updateId not between", value1, value2, "updateid");
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

        public Criteria andMtypeIsNull() {
            addCriterion("mtype is null");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNotNull() {
            addCriterion("mtype is not null");
            return (Criteria) this;
        }

        public Criteria andMtypeEqualTo(Integer value) {
            addCriterion("mtype =", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotEqualTo(Integer value) {
            addCriterion("mtype <>", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThan(Integer value) {
            addCriterion("mtype >", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mtype >=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThan(Integer value) {
            addCriterion("mtype <", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThanOrEqualTo(Integer value) {
            addCriterion("mtype <=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeIn(List<Integer> values) {
            addCriterion("mtype in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotIn(List<Integer> values) {
            addCriterion("mtype not in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeBetween(Integer value1, Integer value2) {
            addCriterion("mtype between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mtype not between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNull() {
            addCriterion("freeze is null");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNotNull() {
            addCriterion("freeze is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeEqualTo(Integer value) {
            addCriterion("freeze =", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotEqualTo(Integer value) {
            addCriterion("freeze <>", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThan(Integer value) {
            addCriterion("freeze >", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeze >=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThan(Integer value) {
            addCriterion("freeze <", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThanOrEqualTo(Integer value) {
            addCriterion("freeze <=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeIn(List<Integer> values) {
            addCriterion("freeze in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotIn(List<Integer> values) {
            addCriterion("freeze not in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeBetween(Integer value1, Integer value2) {
            addCriterion("freeze between", value1, value2, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotBetween(Integer value1, Integer value2) {
            addCriterion("freeze not between", value1, value2, "freeze");
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

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andBankidLikeInsensitive(String value) {
            addCriterion("upper(bankId) like", value.toUpperCase(), "bankid");
            return (Criteria) this;
        }

        public Criteria andOutidLikeInsensitive(String value) {
            addCriterion("upper(outId) like", value.toUpperCase(), "outid");
            return (Criteria) this;
        }

        public Criteria andOutbalanceidLikeInsensitive(String value) {
            addCriterion("upper(outBalanceId) like", value.toUpperCase(), "outbalanceid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLikeInsensitive(String value) {
            addCriterion("upper(customerId) like", value.toUpperCase(), "customerid");
            return (Criteria) this;
        }

        public Criteria andStafferidLikeInsensitive(String value) {
            addCriterion("upper(stafferId) like", value.toUpperCase(), "stafferid");
            return (Criteria) this;
        }

        public Criteria andOwneridLikeInsensitive(String value) {
            addCriterion("upper(ownerId) like", value.toUpperCase(), "ownerid");
            return (Criteria) this;
        }

        public Criteria andLocationidLikeInsensitive(String value) {
            addCriterion("upper(locationId) like", value.toUpperCase(), "locationid");
            return (Criteria) this;
        }

        public Criteria andDestbankidLikeInsensitive(String value) {
            addCriterion("upper(destBankId) like", value.toUpperCase(), "destbankid");
            return (Criteria) this;
        }

        public Criteria andRefbillidLikeInsensitive(String value) {
            addCriterion("upper(refBillId) like", value.toUpperCase(), "refbillid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLikeInsensitive(String value) {
            addCriterion("upper(paymentId) like", value.toUpperCase(), "paymentid");
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

        public Criteria andChecksLikeInsensitive(String value) {
            addCriterion("upper(checks) like", value.toUpperCase(), "checks");
            return (Criteria) this;
        }

        public Criteria andDutyidLikeInsensitive(String value) {
            addCriterion("upper(dutyId) like", value.toUpperCase(), "dutyid");
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