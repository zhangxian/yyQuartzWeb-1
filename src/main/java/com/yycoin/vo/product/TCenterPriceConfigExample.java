package com.yycoin.vo.product;

import java.util.ArrayList;
import java.util.List;

public class TCenterPriceConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterPriceConfigExample() {
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

        public Criteria andIswaveIsNull() {
            addCriterion("isWave is null");
            return (Criteria) this;
        }

        public Criteria andIswaveIsNotNull() {
            addCriterion("isWave is not null");
            return (Criteria) this;
        }

        public Criteria andIswaveEqualTo(Integer value) {
            addCriterion("isWave =", value, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveNotEqualTo(Integer value) {
            addCriterion("isWave <>", value, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveGreaterThan(Integer value) {
            addCriterion("isWave >", value, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isWave >=", value, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveLessThan(Integer value) {
            addCriterion("isWave <", value, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveLessThanOrEqualTo(Integer value) {
            addCriterion("isWave <=", value, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveIn(List<Integer> values) {
            addCriterion("isWave in", values, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveNotIn(List<Integer> values) {
            addCriterion("isWave not in", values, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveBetween(Integer value1, Integer value2) {
            addCriterion("isWave between", value1, value2, "iswave");
            return (Criteria) this;
        }

        public Criteria andIswaveNotBetween(Integer value1, Integer value2) {
            addCriterion("isWave not between", value1, value2, "iswave");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andGspriceupIsNull() {
            addCriterion("gsPriceUp is null");
            return (Criteria) this;
        }

        public Criteria andGspriceupIsNotNull() {
            addCriterion("gsPriceUp is not null");
            return (Criteria) this;
        }

        public Criteria andGspriceupEqualTo(Double value) {
            addCriterion("gsPriceUp =", value, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupNotEqualTo(Double value) {
            addCriterion("gsPriceUp <>", value, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupGreaterThan(Double value) {
            addCriterion("gsPriceUp >", value, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupGreaterThanOrEqualTo(Double value) {
            addCriterion("gsPriceUp >=", value, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupLessThan(Double value) {
            addCriterion("gsPriceUp <", value, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupLessThanOrEqualTo(Double value) {
            addCriterion("gsPriceUp <=", value, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupIn(List<Double> values) {
            addCriterion("gsPriceUp in", values, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupNotIn(List<Double> values) {
            addCriterion("gsPriceUp not in", values, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupBetween(Double value1, Double value2) {
            addCriterion("gsPriceUp between", value1, value2, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspriceupNotBetween(Double value1, Double value2) {
            addCriterion("gsPriceUp not between", value1, value2, "gspriceup");
            return (Criteria) this;
        }

        public Criteria andGspricedownIsNull() {
            addCriterion("gsPriceDown is null");
            return (Criteria) this;
        }

        public Criteria andGspricedownIsNotNull() {
            addCriterion("gsPriceDown is not null");
            return (Criteria) this;
        }

        public Criteria andGspricedownEqualTo(Double value) {
            addCriterion("gsPriceDown =", value, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownNotEqualTo(Double value) {
            addCriterion("gsPriceDown <>", value, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownGreaterThan(Double value) {
            addCriterion("gsPriceDown >", value, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownGreaterThanOrEqualTo(Double value) {
            addCriterion("gsPriceDown >=", value, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownLessThan(Double value) {
            addCriterion("gsPriceDown <", value, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownLessThanOrEqualTo(Double value) {
            addCriterion("gsPriceDown <=", value, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownIn(List<Double> values) {
            addCriterion("gsPriceDown in", values, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownNotIn(List<Double> values) {
            addCriterion("gsPriceDown not in", values, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownBetween(Double value1, Double value2) {
            addCriterion("gsPriceDown between", value1, value2, "gspricedown");
            return (Criteria) this;
        }

        public Criteria andGspricedownNotBetween(Double value1, Double value2) {
            addCriterion("gsPriceDown not between", value1, value2, "gspricedown");
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

        public Criteria andIndustryidIsNull() {
            addCriterion("industryId is null");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNotNull() {
            addCriterion("industryId is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryidEqualTo(String value) {
            addCriterion("industryId =", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotEqualTo(String value) {
            addCriterion("industryId <>", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThan(String value) {
            addCriterion("industryId >", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThanOrEqualTo(String value) {
            addCriterion("industryId >=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThan(String value) {
            addCriterion("industryId <", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThanOrEqualTo(String value) {
            addCriterion("industryId <=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLike(String value) {
            addCriterion("industryId like", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotLike(String value) {
            addCriterion("industryId not like", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidIn(List<String> values) {
            addCriterion("industryId in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotIn(List<String> values) {
            addCriterion("industryId not in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidBetween(String value1, String value2) {
            addCriterion("industryId between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotBetween(String value1, String value2) {
            addCriterion("industryId not between", value1, value2, "industryid");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNull() {
            addCriterion("minPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinpriceIsNotNull() {
            addCriterion("minPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinpriceEqualTo(Double value) {
            addCriterion("minPrice =", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotEqualTo(Double value) {
            addCriterion("minPrice <>", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThan(Double value) {
            addCriterion("minPrice >", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("minPrice >=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThan(Double value) {
            addCriterion("minPrice <", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceLessThanOrEqualTo(Double value) {
            addCriterion("minPrice <=", value, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceIn(List<Double> values) {
            addCriterion("minPrice in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotIn(List<Double> values) {
            addCriterion("minPrice not in", values, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceBetween(Double value1, Double value2) {
            addCriterion("minPrice between", value1, value2, "minprice");
            return (Criteria) this;
        }

        public Criteria andMinpriceNotBetween(Double value1, Double value2) {
            addCriterion("minPrice not between", value1, value2, "minprice");
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

        public Criteria andFtypeIsNull() {
            addCriterion("ftype is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("ftype is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(Integer value) {
            addCriterion("ftype =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(Integer value) {
            addCriterion("ftype <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(Integer value) {
            addCriterion("ftype >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftype >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(Integer value) {
            addCriterion("ftype <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ftype <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<Integer> values) {
            addCriterion("ftype in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<Integer> values) {
            addCriterion("ftype not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(Integer value1, Integer value2) {
            addCriterion("ftype between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ftype not between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorIsNull() {
            addCriterion("goldPriceFactor is null");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorIsNotNull() {
            addCriterion("goldPriceFactor is not null");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorEqualTo(Double value) {
            addCriterion("goldPriceFactor =", value, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorNotEqualTo(Double value) {
            addCriterion("goldPriceFactor <>", value, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorGreaterThan(Double value) {
            addCriterion("goldPriceFactor >", value, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorGreaterThanOrEqualTo(Double value) {
            addCriterion("goldPriceFactor >=", value, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorLessThan(Double value) {
            addCriterion("goldPriceFactor <", value, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorLessThanOrEqualTo(Double value) {
            addCriterion("goldPriceFactor <=", value, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorIn(List<Double> values) {
            addCriterion("goldPriceFactor in", values, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorNotIn(List<Double> values) {
            addCriterion("goldPriceFactor not in", values, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorBetween(Double value1, Double value2) {
            addCriterion("goldPriceFactor between", value1, value2, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andGoldpricefactorNotBetween(Double value1, Double value2) {
            addCriterion("goldPriceFactor not between", value1, value2, "goldpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorIsNull() {
            addCriterion("silverPriceFactor is null");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorIsNotNull() {
            addCriterion("silverPriceFactor is not null");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorEqualTo(Double value) {
            addCriterion("silverPriceFactor =", value, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorNotEqualTo(Double value) {
            addCriterion("silverPriceFactor <>", value, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorGreaterThan(Double value) {
            addCriterion("silverPriceFactor >", value, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorGreaterThanOrEqualTo(Double value) {
            addCriterion("silverPriceFactor >=", value, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorLessThan(Double value) {
            addCriterion("silverPriceFactor <", value, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorLessThanOrEqualTo(Double value) {
            addCriterion("silverPriceFactor <=", value, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorIn(List<Double> values) {
            addCriterion("silverPriceFactor in", values, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorNotIn(List<Double> values) {
            addCriterion("silverPriceFactor not in", values, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorBetween(Double value1, Double value2) {
            addCriterion("silverPriceFactor between", value1, value2, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andSilverpricefactorNotBetween(Double value1, Double value2) {
            addCriterion("silverPriceFactor not between", value1, value2, "silverpricefactor");
            return (Criteria) this;
        }

        public Criteria andPpiceIsNull() {
            addCriterion("ppice is null");
            return (Criteria) this;
        }

        public Criteria andPpiceIsNotNull() {
            addCriterion("ppice is not null");
            return (Criteria) this;
        }

        public Criteria andPpiceEqualTo(Double value) {
            addCriterion("ppice =", value, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceNotEqualTo(Double value) {
            addCriterion("ppice <>", value, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceGreaterThan(Double value) {
            addCriterion("ppice >", value, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceGreaterThanOrEqualTo(Double value) {
            addCriterion("ppice >=", value, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceLessThan(Double value) {
            addCriterion("ppice <", value, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceLessThanOrEqualTo(Double value) {
            addCriterion("ppice <=", value, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceIn(List<Double> values) {
            addCriterion("ppice in", values, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceNotIn(List<Double> values) {
            addCriterion("ppice not in", values, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceBetween(Double value1, Double value2) {
            addCriterion("ppice between", value1, value2, "ppice");
            return (Criteria) this;
        }

        public Criteria andPpiceNotBetween(Double value1, Double value2) {
            addCriterion("ppice not between", value1, value2, "ppice");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andProductidLikeInsensitive(String value) {
            addCriterion("upper(productId) like", value.toUpperCase(), "productid");
            return (Criteria) this;
        }

        public Criteria andProvinceLikeInsensitive(String value) {
            addCriterion("upper(province) like", value.toUpperCase(), "province");
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

        public Criteria andIndustryidLikeInsensitive(String value) {
            addCriterion("upper(industryId) like", value.toUpperCase(), "industryid");
            return (Criteria) this;
        }

        public Criteria andStafferidLikeInsensitive(String value) {
            addCriterion("upper(stafferId) like", value.toUpperCase(), "stafferid");
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