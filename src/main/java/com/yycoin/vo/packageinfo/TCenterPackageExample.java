package com.yycoin.vo.packageinfo;

import java.util.ArrayList;
import java.util.List;

public class TCenterPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterPackageExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andShippingIsNull() {
            addCriterion("shipping is null");
            return (Criteria) this;
        }

        public Criteria andShippingIsNotNull() {
            addCriterion("shipping is not null");
            return (Criteria) this;
        }

        public Criteria andShippingEqualTo(Integer value) {
            addCriterion("shipping =", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotEqualTo(Integer value) {
            addCriterion("shipping <>", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThan(Integer value) {
            addCriterion("shipping >", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping >=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThan(Integer value) {
            addCriterion("shipping <", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThanOrEqualTo(Integer value) {
            addCriterion("shipping <=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingIn(List<Integer> values) {
            addCriterion("shipping in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotIn(List<Integer> values) {
            addCriterion("shipping not in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingBetween(Integer value1, Integer value2) {
            addCriterion("shipping between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping not between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andTransport1IsNull() {
            addCriterion("transport1 is null");
            return (Criteria) this;
        }

        public Criteria andTransport1IsNotNull() {
            addCriterion("transport1 is not null");
            return (Criteria) this;
        }

        public Criteria andTransport1EqualTo(Integer value) {
            addCriterion("transport1 =", value, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1NotEqualTo(Integer value) {
            addCriterion("transport1 <>", value, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1GreaterThan(Integer value) {
            addCriterion("transport1 >", value, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1GreaterThanOrEqualTo(Integer value) {
            addCriterion("transport1 >=", value, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1LessThan(Integer value) {
            addCriterion("transport1 <", value, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1LessThanOrEqualTo(Integer value) {
            addCriterion("transport1 <=", value, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1In(List<Integer> values) {
            addCriterion("transport1 in", values, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1NotIn(List<Integer> values) {
            addCriterion("transport1 not in", values, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1Between(Integer value1, Integer value2) {
            addCriterion("transport1 between", value1, value2, "transport1");
            return (Criteria) this;
        }

        public Criteria andTransport1NotBetween(Integer value1, Integer value2) {
            addCriterion("transport1 not between", value1, value2, "transport1");
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

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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

        public Criteria andExpresspayIsNull() {
            addCriterion("expressPay is null");
            return (Criteria) this;
        }

        public Criteria andExpresspayIsNotNull() {
            addCriterion("expressPay is not null");
            return (Criteria) this;
        }

        public Criteria andExpresspayEqualTo(Integer value) {
            addCriterion("expressPay =", value, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayNotEqualTo(Integer value) {
            addCriterion("expressPay <>", value, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayGreaterThan(Integer value) {
            addCriterion("expressPay >", value, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayGreaterThanOrEqualTo(Integer value) {
            addCriterion("expressPay >=", value, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayLessThan(Integer value) {
            addCriterion("expressPay <", value, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayLessThanOrEqualTo(Integer value) {
            addCriterion("expressPay <=", value, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayIn(List<Integer> values) {
            addCriterion("expressPay in", values, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayNotIn(List<Integer> values) {
            addCriterion("expressPay not in", values, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayBetween(Integer value1, Integer value2) {
            addCriterion("expressPay between", value1, value2, "expresspay");
            return (Criteria) this;
        }

        public Criteria andExpresspayNotBetween(Integer value1, Integer value2) {
            addCriterion("expressPay not between", value1, value2, "expresspay");
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

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
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

        public Criteria andStaffernameIsNull() {
            addCriterion("stafferName is null");
            return (Criteria) this;
        }

        public Criteria andStaffernameIsNotNull() {
            addCriterion("stafferName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffernameEqualTo(String value) {
            addCriterion("stafferName =", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameNotEqualTo(String value) {
            addCriterion("stafferName <>", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameGreaterThan(String value) {
            addCriterion("stafferName >", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameGreaterThanOrEqualTo(String value) {
            addCriterion("stafferName >=", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameLessThan(String value) {
            addCriterion("stafferName <", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameLessThanOrEqualTo(String value) {
            addCriterion("stafferName <=", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameLike(String value) {
            addCriterion("stafferName like", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameNotLike(String value) {
            addCriterion("stafferName not like", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameIn(List<String> values) {
            addCriterion("stafferName in", values, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameNotIn(List<String> values) {
            addCriterion("stafferName not in", values, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameBetween(String value1, String value2) {
            addCriterion("stafferName between", value1, value2, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameNotBetween(String value1, String value2) {
            addCriterion("stafferName not between", value1, value2, "staffername");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIsNull() {
            addCriterion("industryName is null");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIsNotNull() {
            addCriterion("industryName is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrynameEqualTo(String value) {
            addCriterion("industryName =", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotEqualTo(String value) {
            addCriterion("industryName <>", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameGreaterThan(String value) {
            addCriterion("industryName >", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameGreaterThanOrEqualTo(String value) {
            addCriterion("industryName >=", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLessThan(String value) {
            addCriterion("industryName <", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLessThanOrEqualTo(String value) {
            addCriterion("industryName <=", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLike(String value) {
            addCriterion("industryName like", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotLike(String value) {
            addCriterion("industryName not like", value, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameIn(List<String> values) {
            addCriterion("industryName in", values, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotIn(List<String> values) {
            addCriterion("industryName not in", values, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameBetween(String value1, String value2) {
            addCriterion("industryName between", value1, value2, "industryname");
            return (Criteria) this;
        }

        public Criteria andIndustrynameNotBetween(String value1, String value2) {
            addCriterion("industryName not between", value1, value2, "industryname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNull() {
            addCriterion("departName is null");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNotNull() {
            addCriterion("departName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartnameEqualTo(String value) {
            addCriterion("departName =", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotEqualTo(String value) {
            addCriterion("departName <>", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThan(String value) {
            addCriterion("departName >", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("departName >=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThan(String value) {
            addCriterion("departName <", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThanOrEqualTo(String value) {
            addCriterion("departName <=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLike(String value) {
            addCriterion("departName like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotLike(String value) {
            addCriterion("departName not like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIn(List<String> values) {
            addCriterion("departName in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotIn(List<String> values) {
            addCriterion("departName not in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameBetween(String value1, String value2) {
            addCriterion("departName between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotBetween(String value1, String value2) {
            addCriterion("departName not between", value1, value2, "departname");
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

        public Criteria andPickupidIsNull() {
            addCriterion("pickupId is null");
            return (Criteria) this;
        }

        public Criteria andPickupidIsNotNull() {
            addCriterion("pickupId is not null");
            return (Criteria) this;
        }

        public Criteria andPickupidEqualTo(String value) {
            addCriterion("pickupId =", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidNotEqualTo(String value) {
            addCriterion("pickupId <>", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidGreaterThan(String value) {
            addCriterion("pickupId >", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidGreaterThanOrEqualTo(String value) {
            addCriterion("pickupId >=", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidLessThan(String value) {
            addCriterion("pickupId <", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidLessThanOrEqualTo(String value) {
            addCriterion("pickupId <=", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidLike(String value) {
            addCriterion("pickupId like", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidNotLike(String value) {
            addCriterion("pickupId not like", value, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidIn(List<String> values) {
            addCriterion("pickupId in", values, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidNotIn(List<String> values) {
            addCriterion("pickupId not in", values, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidBetween(String value1, String value2) {
            addCriterion("pickupId between", value1, value2, "pickupid");
            return (Criteria) this;
        }

        public Criteria andPickupidNotBetween(String value1, String value2) {
            addCriterion("pickupId not between", value1, value2, "pickupid");
            return (Criteria) this;
        }

        public Criteria andIndexPosIsNull() {
            addCriterion("index_pos is null");
            return (Criteria) this;
        }

        public Criteria andIndexPosIsNotNull() {
            addCriterion("index_pos is not null");
            return (Criteria) this;
        }

        public Criteria andIndexPosEqualTo(Integer value) {
            addCriterion("index_pos =", value, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosNotEqualTo(Integer value) {
            addCriterion("index_pos <>", value, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosGreaterThan(Integer value) {
            addCriterion("index_pos >", value, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_pos >=", value, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosLessThan(Integer value) {
            addCriterion("index_pos <", value, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosLessThanOrEqualTo(Integer value) {
            addCriterion("index_pos <=", value, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosIn(List<Integer> values) {
            addCriterion("index_pos in", values, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosNotIn(List<Integer> values) {
            addCriterion("index_pos not in", values, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosBetween(Integer value1, Integer value2) {
            addCriterion("index_pos between", value1, value2, "indexPos");
            return (Criteria) this;
        }

        public Criteria andIndexPosNotBetween(Integer value1, Integer value2) {
            addCriterion("index_pos not between", value1, value2, "indexPos");
            return (Criteria) this;
        }

        public Criteria andTransport2IsNull() {
            addCriterion("transport2 is null");
            return (Criteria) this;
        }

        public Criteria andTransport2IsNotNull() {
            addCriterion("transport2 is not null");
            return (Criteria) this;
        }

        public Criteria andTransport2EqualTo(Integer value) {
            addCriterion("transport2 =", value, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2NotEqualTo(Integer value) {
            addCriterion("transport2 <>", value, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2GreaterThan(Integer value) {
            addCriterion("transport2 >", value, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2GreaterThanOrEqualTo(Integer value) {
            addCriterion("transport2 >=", value, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2LessThan(Integer value) {
            addCriterion("transport2 <", value, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2LessThanOrEqualTo(Integer value) {
            addCriterion("transport2 <=", value, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2In(List<Integer> values) {
            addCriterion("transport2 in", values, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2NotIn(List<Integer> values) {
            addCriterion("transport2 not in", values, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2Between(Integer value1, Integer value2) {
            addCriterion("transport2 between", value1, value2, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransport2NotBetween(Integer value1, Integer value2) {
            addCriterion("transport2 not between", value1, value2, "transport2");
            return (Criteria) this;
        }

        public Criteria andTransportpayIsNull() {
            addCriterion("transportPay is null");
            return (Criteria) this;
        }

        public Criteria andTransportpayIsNotNull() {
            addCriterion("transportPay is not null");
            return (Criteria) this;
        }

        public Criteria andTransportpayEqualTo(Integer value) {
            addCriterion("transportPay =", value, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayNotEqualTo(Integer value) {
            addCriterion("transportPay <>", value, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayGreaterThan(Integer value) {
            addCriterion("transportPay >", value, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("transportPay >=", value, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayLessThan(Integer value) {
            addCriterion("transportPay <", value, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayLessThanOrEqualTo(Integer value) {
            addCriterion("transportPay <=", value, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayIn(List<Integer> values) {
            addCriterion("transportPay in", values, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayNotIn(List<Integer> values) {
            addCriterion("transportPay not in", values, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayBetween(Integer value1, Integer value2) {
            addCriterion("transportPay between", value1, value2, "transportpay");
            return (Criteria) this;
        }

        public Criteria andTransportpayNotBetween(Integer value1, Integer value2) {
            addCriterion("transportPay not between", value1, value2, "transportpay");
            return (Criteria) this;
        }

        public Criteria andProductcountIsNull() {
            addCriterion("productCount is null");
            return (Criteria) this;
        }

        public Criteria andProductcountIsNotNull() {
            addCriterion("productCount is not null");
            return (Criteria) this;
        }

        public Criteria andProductcountEqualTo(Integer value) {
            addCriterion("productCount =", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotEqualTo(Integer value) {
            addCriterion("productCount <>", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountGreaterThan(Integer value) {
            addCriterion("productCount >", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("productCount >=", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountLessThan(Integer value) {
            addCriterion("productCount <", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountLessThanOrEqualTo(Integer value) {
            addCriterion("productCount <=", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountIn(List<Integer> values) {
            addCriterion("productCount in", values, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotIn(List<Integer> values) {
            addCriterion("productCount not in", values, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountBetween(Integer value1, Integer value2) {
            addCriterion("productCount between", value1, value2, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotBetween(Integer value1, Integer value2) {
            addCriterion("productCount not between", value1, value2, "productcount");
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

        public Criteria andShiptimeIsNull() {
            addCriterion("shipTime is null");
            return (Criteria) this;
        }

        public Criteria andShiptimeIsNotNull() {
            addCriterion("shipTime is not null");
            return (Criteria) this;
        }

        public Criteria andShiptimeEqualTo(String value) {
            addCriterion("shipTime =", value, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeNotEqualTo(String value) {
            addCriterion("shipTime <>", value, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeGreaterThan(String value) {
            addCriterion("shipTime >", value, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeGreaterThanOrEqualTo(String value) {
            addCriterion("shipTime >=", value, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeLessThan(String value) {
            addCriterion("shipTime <", value, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeLessThanOrEqualTo(String value) {
            addCriterion("shipTime <=", value, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeLike(String value) {
            addCriterion("shipTime like", value, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeNotLike(String value) {
            addCriterion("shipTime not like", value, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeIn(List<String> values) {
            addCriterion("shipTime in", values, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeNotIn(List<String> values) {
            addCriterion("shipTime not in", values, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeBetween(String value1, String value2) {
            addCriterion("shipTime between", value1, value2, "shiptime");
            return (Criteria) this;
        }

        public Criteria andShiptimeNotBetween(String value1, String value2) {
            addCriterion("shipTime not between", value1, value2, "shiptime");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("cityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("cityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("cityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("cityId like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("cityId not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("cityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityId not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andEmergencyIsNull() {
            addCriterion("emergency is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyIsNotNull() {
            addCriterion("emergency is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyEqualTo(Integer value) {
            addCriterion("emergency =", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotEqualTo(Integer value) {
            addCriterion("emergency <>", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyGreaterThan(Integer value) {
            addCriterion("emergency >", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("emergency >=", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyLessThan(Integer value) {
            addCriterion("emergency <", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyLessThanOrEqualTo(Integer value) {
            addCriterion("emergency <=", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyIn(List<Integer> values) {
            addCriterion("emergency in", values, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotIn(List<Integer> values) {
            addCriterion("emergency not in", values, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyBetween(Integer value1, Integer value2) {
            addCriterion("emergency between", value1, value2, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotBetween(Integer value1, Integer value2) {
            addCriterion("emergency not between", value1, value2, "emergency");
            return (Criteria) this;
        }

        public Criteria andSendmailflagIsNull() {
            addCriterion("sendMailFlag is null");
            return (Criteria) this;
        }

        public Criteria andSendmailflagIsNotNull() {
            addCriterion("sendMailFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSendmailflagEqualTo(Integer value) {
            addCriterion("sendMailFlag =", value, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagNotEqualTo(Integer value) {
            addCriterion("sendMailFlag <>", value, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagGreaterThan(Integer value) {
            addCriterion("sendMailFlag >", value, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendMailFlag >=", value, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagLessThan(Integer value) {
            addCriterion("sendMailFlag <", value, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagLessThanOrEqualTo(Integer value) {
            addCriterion("sendMailFlag <=", value, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagIn(List<Integer> values) {
            addCriterion("sendMailFlag in", values, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagNotIn(List<Integer> values) {
            addCriterion("sendMailFlag not in", values, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagBetween(Integer value1, Integer value2) {
            addCriterion("sendMailFlag between", value1, value2, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andSendmailflagNotBetween(Integer value1, Integer value2) {
            addCriterion("sendMailFlag not between", value1, value2, "sendmailflag");
            return (Criteria) this;
        }

        public Criteria andBillstimeIsNull() {
            addCriterion("billsTime is null");
            return (Criteria) this;
        }

        public Criteria andBillstimeIsNotNull() {
            addCriterion("billsTime is not null");
            return (Criteria) this;
        }

        public Criteria andBillstimeEqualTo(String value) {
            addCriterion("billsTime =", value, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeNotEqualTo(String value) {
            addCriterion("billsTime <>", value, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeGreaterThan(String value) {
            addCriterion("billsTime >", value, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeGreaterThanOrEqualTo(String value) {
            addCriterion("billsTime >=", value, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeLessThan(String value) {
            addCriterion("billsTime <", value, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeLessThanOrEqualTo(String value) {
            addCriterion("billsTime <=", value, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeLike(String value) {
            addCriterion("billsTime like", value, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeNotLike(String value) {
            addCriterion("billsTime not like", value, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeIn(List<String> values) {
            addCriterion("billsTime in", values, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeNotIn(List<String> values) {
            addCriterion("billsTime not in", values, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeBetween(String value1, String value2) {
            addCriterion("billsTime between", value1, value2, "billstime");
            return (Criteria) this;
        }

        public Criteria andBillstimeNotBetween(String value1, String value2) {
            addCriterion("billsTime not between", value1, value2, "billstime");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutIsNull() {
            addCriterion("insFollowOut is null");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutIsNotNull() {
            addCriterion("insFollowOut is not null");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutEqualTo(Integer value) {
            addCriterion("insFollowOut =", value, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutNotEqualTo(Integer value) {
            addCriterion("insFollowOut <>", value, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutGreaterThan(Integer value) {
            addCriterion("insFollowOut >", value, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("insFollowOut >=", value, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutLessThan(Integer value) {
            addCriterion("insFollowOut <", value, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutLessThanOrEqualTo(Integer value) {
            addCriterion("insFollowOut <=", value, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutIn(List<Integer> values) {
            addCriterion("insFollowOut in", values, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutNotIn(List<Integer> values) {
            addCriterion("insFollowOut not in", values, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutBetween(Integer value1, Integer value2) {
            addCriterion("insFollowOut between", value1, value2, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andInsfollowoutNotBetween(Integer value1, Integer value2) {
            addCriterion("insFollowOut not between", value1, value2, "insfollowout");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateIsNull() {
            addCriterion("sfReceiveDate is null");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateIsNotNull() {
            addCriterion("sfReceiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateEqualTo(String value) {
            addCriterion("sfReceiveDate =", value, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateNotEqualTo(String value) {
            addCriterion("sfReceiveDate <>", value, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateGreaterThan(String value) {
            addCriterion("sfReceiveDate >", value, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateGreaterThanOrEqualTo(String value) {
            addCriterion("sfReceiveDate >=", value, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateLessThan(String value) {
            addCriterion("sfReceiveDate <", value, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateLessThanOrEqualTo(String value) {
            addCriterion("sfReceiveDate <=", value, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateLike(String value) {
            addCriterion("sfReceiveDate like", value, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateNotLike(String value) {
            addCriterion("sfReceiveDate not like", value, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateIn(List<String> values) {
            addCriterion("sfReceiveDate in", values, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateNotIn(List<String> values) {
            addCriterion("sfReceiveDate not in", values, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateBetween(String value1, String value2) {
            addCriterion("sfReceiveDate between", value1, value2, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateNotBetween(String value1, String value2) {
            addCriterion("sfReceiveDate not between", value1, value2, "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andTransportnoIsNull() {
            addCriterion("transportNo is null");
            return (Criteria) this;
        }

        public Criteria andTransportnoIsNotNull() {
            addCriterion("transportNo is not null");
            return (Criteria) this;
        }

        public Criteria andTransportnoEqualTo(String value) {
            addCriterion("transportNo =", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotEqualTo(String value) {
            addCriterion("transportNo <>", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoGreaterThan(String value) {
            addCriterion("transportNo >", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoGreaterThanOrEqualTo(String value) {
            addCriterion("transportNo >=", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLessThan(String value) {
            addCriterion("transportNo <", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLessThanOrEqualTo(String value) {
            addCriterion("transportNo <=", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoLike(String value) {
            addCriterion("transportNo like", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotLike(String value) {
            addCriterion("transportNo not like", value, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoIn(List<String> values) {
            addCriterion("transportNo in", values, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotIn(List<String> values) {
            addCriterion("transportNo not in", values, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoBetween(String value1, String value2) {
            addCriterion("transportNo between", value1, value2, "transportno");
            return (Criteria) this;
        }

        public Criteria andTransportnoNotBetween(String value1, String value2) {
            addCriterion("transportNo not between", value1, value2, "transportno");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhIsNull() {
            addCriterion("sendMailFlagNbyh is null");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhIsNotNull() {
            addCriterion("sendMailFlagNbyh is not null");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhEqualTo(Integer value) {
            addCriterion("sendMailFlagNbyh =", value, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhNotEqualTo(Integer value) {
            addCriterion("sendMailFlagNbyh <>", value, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhGreaterThan(Integer value) {
            addCriterion("sendMailFlagNbyh >", value, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendMailFlagNbyh >=", value, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhLessThan(Integer value) {
            addCriterion("sendMailFlagNbyh <", value, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhLessThanOrEqualTo(Integer value) {
            addCriterion("sendMailFlagNbyh <=", value, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhIn(List<Integer> values) {
            addCriterion("sendMailFlagNbyh in", values, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhNotIn(List<Integer> values) {
            addCriterion("sendMailFlagNbyh not in", values, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhBetween(Integer value1, Integer value2) {
            addCriterion("sendMailFlagNbyh between", value1, value2, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagnbyhNotBetween(Integer value1, Integer value2) {
            addCriterion("sendMailFlagNbyh not between", value1, value2, "sendmailflagnbyh");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsIsNull() {
            addCriterion("sendMailFlagSails is null");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsIsNotNull() {
            addCriterion("sendMailFlagSails is not null");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsEqualTo(Integer value) {
            addCriterion("sendMailFlagSails =", value, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsNotEqualTo(Integer value) {
            addCriterion("sendMailFlagSails <>", value, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsGreaterThan(Integer value) {
            addCriterion("sendMailFlagSails >", value, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendMailFlagSails >=", value, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsLessThan(Integer value) {
            addCriterion("sendMailFlagSails <", value, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsLessThanOrEqualTo(Integer value) {
            addCriterion("sendMailFlagSails <=", value, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsIn(List<Integer> values) {
            addCriterion("sendMailFlagSails in", values, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsNotIn(List<Integer> values) {
            addCriterion("sendMailFlagSails not in", values, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsBetween(Integer value1, Integer value2) {
            addCriterion("sendMailFlagSails between", value1, value2, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andSendmailflagsailsNotBetween(Integer value1, Integer value2) {
            addCriterion("sendMailFlagSails not between", value1, value2, "sendmailflagsails");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutIsNull() {
            addCriterion("zsFollowOut is null");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutIsNotNull() {
            addCriterion("zsFollowOut is not null");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutEqualTo(Integer value) {
            addCriterion("zsFollowOut =", value, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutNotEqualTo(Integer value) {
            addCriterion("zsFollowOut <>", value, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutGreaterThan(Integer value) {
            addCriterion("zsFollowOut >", value, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("zsFollowOut >=", value, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutLessThan(Integer value) {
            addCriterion("zsFollowOut <", value, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutLessThanOrEqualTo(Integer value) {
            addCriterion("zsFollowOut <=", value, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutIn(List<Integer> values) {
            addCriterion("zsFollowOut in", values, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutNotIn(List<Integer> values) {
            addCriterion("zsFollowOut not in", values, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutBetween(Integer value1, Integer value2) {
            addCriterion("zsFollowOut between", value1, value2, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andZsfollowoutNotBetween(Integer value1, Integer value2) {
            addCriterion("zsFollowOut not between", value1, value2, "zsfollowout");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIsNull() {
            addCriterion("pickupTime is null");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIsNotNull() {
            addCriterion("pickupTime is not null");
            return (Criteria) this;
        }

        public Criteria andPickuptimeEqualTo(String value) {
            addCriterion("pickupTime =", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotEqualTo(String value) {
            addCriterion("pickupTime <>", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeGreaterThan(String value) {
            addCriterion("pickupTime >", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeGreaterThanOrEqualTo(String value) {
            addCriterion("pickupTime >=", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLessThan(String value) {
            addCriterion("pickupTime <", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLessThanOrEqualTo(String value) {
            addCriterion("pickupTime <=", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLike(String value) {
            addCriterion("pickupTime like", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotLike(String value) {
            addCriterion("pickupTime not like", value, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeIn(List<String> values) {
            addCriterion("pickupTime in", values, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotIn(List<String> values) {
            addCriterion("pickupTime not in", values, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeBetween(String value1, String value2) {
            addCriterion("pickupTime between", value1, value2, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPickuptimeNotBetween(String value1, String value2) {
            addCriterion("pickupTime not between", value1, value2, "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIsNull() {
            addCriterion("printTime is null");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIsNotNull() {
            addCriterion("printTime is not null");
            return (Criteria) this;
        }

        public Criteria andPrinttimeEqualTo(String value) {
            addCriterion("printTime =", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotEqualTo(String value) {
            addCriterion("printTime <>", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeGreaterThan(String value) {
            addCriterion("printTime >", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeGreaterThanOrEqualTo(String value) {
            addCriterion("printTime >=", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLessThan(String value) {
            addCriterion("printTime <", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLessThanOrEqualTo(String value) {
            addCriterion("printTime <=", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLike(String value) {
            addCriterion("printTime like", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotLike(String value) {
            addCriterion("printTime not like", value, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeIn(List<String> values) {
            addCriterion("printTime in", values, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotIn(List<String> values) {
            addCriterion("printTime not in", values, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeBetween(String value1, String value2) {
            addCriterion("printTime between", value1, value2, "printtime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeNotBetween(String value1, String value2) {
            addCriterion("printTime not between", value1, value2, "printtime");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andDirectIsNull() {
            addCriterion("direct is null");
            return (Criteria) this;
        }

        public Criteria andDirectIsNotNull() {
            addCriterion("direct is not null");
            return (Criteria) this;
        }

        public Criteria andDirectEqualTo(Integer value) {
            addCriterion("direct =", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotEqualTo(Integer value) {
            addCriterion("direct <>", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThan(Integer value) {
            addCriterion("direct >", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct >=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThan(Integer value) {
            addCriterion("direct <", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectLessThanOrEqualTo(Integer value) {
            addCriterion("direct <=", value, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectIn(List<Integer> values) {
            addCriterion("direct in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotIn(List<Integer> values) {
            addCriterion("direct not in", values, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectBetween(Integer value1, Integer value2) {
            addCriterion("direct between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andDirectNotBetween(Integer value1, Integer value2) {
            addCriterion("direct not between", value1, value2, "direct");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagIsNull() {
            addCriterion("taobaoflag is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagIsNotNull() {
            addCriterion("taobaoflag is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagEqualTo(String value) {
            addCriterion("taobaoflag =", value, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagNotEqualTo(String value) {
            addCriterion("taobaoflag <>", value, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagGreaterThan(String value) {
            addCriterion("taobaoflag >", value, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagGreaterThanOrEqualTo(String value) {
            addCriterion("taobaoflag >=", value, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagLessThan(String value) {
            addCriterion("taobaoflag <", value, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagLessThanOrEqualTo(String value) {
            addCriterion("taobaoflag <=", value, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagLike(String value) {
            addCriterion("taobaoflag like", value, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagNotLike(String value) {
            addCriterion("taobaoflag not like", value, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagIn(List<String> values) {
            addCriterion("taobaoflag in", values, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagNotIn(List<String> values) {
            addCriterion("taobaoflag not in", values, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagBetween(String value1, String value2) {
            addCriterion("taobaoflag between", value1, value2, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagNotBetween(String value1, String value2) {
            addCriterion("taobaoflag not between", value1, value2, "taobaoflag");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(Id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andCustomeridLikeInsensitive(String value) {
            addCriterion("upper(customerId) like", value.toUpperCase(), "customerid");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andReceiverLikeInsensitive(String value) {
            addCriterion("upper(receiver) like", value.toUpperCase(), "receiver");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andStaffernameLikeInsensitive(String value) {
            addCriterion("upper(stafferName) like", value.toUpperCase(), "staffername");
            return (Criteria) this;
        }

        public Criteria andIndustrynameLikeInsensitive(String value) {
            addCriterion("upper(industryName) like", value.toUpperCase(), "industryname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLikeInsensitive(String value) {
            addCriterion("upper(departName) like", value.toUpperCase(), "departname");
            return (Criteria) this;
        }

        public Criteria andLogtimeLikeInsensitive(String value) {
            addCriterion("upper(logTime) like", value.toUpperCase(), "logtime");
            return (Criteria) this;
        }

        public Criteria andPickupidLikeInsensitive(String value) {
            addCriterion("upper(pickupId) like", value.toUpperCase(), "pickupid");
            return (Criteria) this;
        }

        public Criteria andLocationidLikeInsensitive(String value) {
            addCriterion("upper(locationId) like", value.toUpperCase(), "locationid");
            return (Criteria) this;
        }

        public Criteria andShiptimeLikeInsensitive(String value) {
            addCriterion("upper(shipTime) like", value.toUpperCase(), "shiptime");
            return (Criteria) this;
        }

        public Criteria andCityidLikeInsensitive(String value) {
            addCriterion("upper(cityId) like", value.toUpperCase(), "cityid");
            return (Criteria) this;
        }

        public Criteria andBillstimeLikeInsensitive(String value) {
            addCriterion("upper(billsTime) like", value.toUpperCase(), "billstime");
            return (Criteria) this;
        }

        public Criteria andSfreceivedateLikeInsensitive(String value) {
            addCriterion("upper(sfReceiveDate) like", value.toUpperCase(), "sfreceivedate");
            return (Criteria) this;
        }

        public Criteria andTransportnoLikeInsensitive(String value) {
            addCriterion("upper(transportNo) like", value.toUpperCase(), "transportno");
            return (Criteria) this;
        }

        public Criteria andPickuptimeLikeInsensitive(String value) {
            addCriterion("upper(pickupTime) like", value.toUpperCase(), "pickuptime");
            return (Criteria) this;
        }

        public Criteria andPrinttimeLikeInsensitive(String value) {
            addCriterion("upper(printTime) like", value.toUpperCase(), "printtime");
            return (Criteria) this;
        }

        public Criteria andTelephoneLikeInsensitive(String value) {
            addCriterion("upper(telephone) like", value.toUpperCase(), "telephone");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLikeInsensitive(String value) {
            addCriterion("upper(createTime) like", value.toUpperCase(), "createtime");
            return (Criteria) this;
        }

        public Criteria andTaobaoflagLikeInsensitive(String value) {
            addCriterion("upper(taobaoflag) like", value.toUpperCase(), "taobaoflag");
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