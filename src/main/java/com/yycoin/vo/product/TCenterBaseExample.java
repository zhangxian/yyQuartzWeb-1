package com.yycoin.vo.product;

import java.util.ArrayList;
import java.util.List;

public class TCenterBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterBaseExample() {
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

        public Criteria andInwayIsNull() {
            addCriterion("inway is null");
            return (Criteria) this;
        }

        public Criteria andInwayIsNotNull() {
            addCriterion("inway is not null");
            return (Criteria) this;
        }

        public Criteria andInwayEqualTo(Integer value) {
            addCriterion("inway =", value, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayNotEqualTo(Integer value) {
            addCriterion("inway <>", value, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayGreaterThan(Integer value) {
            addCriterion("inway >", value, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("inway >=", value, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayLessThan(Integer value) {
            addCriterion("inway <", value, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayLessThanOrEqualTo(Integer value) {
            addCriterion("inway <=", value, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayIn(List<Integer> values) {
            addCriterion("inway in", values, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayNotIn(List<Integer> values) {
            addCriterion("inway not in", values, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayBetween(Integer value1, Integer value2) {
            addCriterion("inway between", value1, value2, "inway");
            return (Criteria) this;
        }

        public Criteria andInwayNotBetween(Integer value1, Integer value2) {
            addCriterion("inway not between", value1, value2, "inway");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
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

        public Criteria andCostpriceIsNull() {
            addCriterion("costPrice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("costPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(Double value) {
            addCriterion("costPrice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(Double value) {
            addCriterion("costPrice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(Double value) {
            addCriterion("costPrice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("costPrice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(Double value) {
            addCriterion("costPrice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(Double value) {
            addCriterion("costPrice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<Double> values) {
            addCriterion("costPrice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<Double> values) {
            addCriterion("costPrice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(Double value1, Double value2) {
            addCriterion("costPrice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(Double value1, Double value2) {
            addCriterion("costPrice not between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyIsNull() {
            addCriterion("costPriceKey is null");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyIsNotNull() {
            addCriterion("costPriceKey is not null");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyEqualTo(String value) {
            addCriterion("costPriceKey =", value, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyNotEqualTo(String value) {
            addCriterion("costPriceKey <>", value, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyGreaterThan(String value) {
            addCriterion("costPriceKey >", value, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyGreaterThanOrEqualTo(String value) {
            addCriterion("costPriceKey >=", value, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyLessThan(String value) {
            addCriterion("costPriceKey <", value, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyLessThanOrEqualTo(String value) {
            addCriterion("costPriceKey <=", value, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyLike(String value) {
            addCriterion("costPriceKey like", value, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyNotLike(String value) {
            addCriterion("costPriceKey not like", value, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyIn(List<String> values) {
            addCriterion("costPriceKey in", values, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyNotIn(List<String> values) {
            addCriterion("costPriceKey not in", values, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyBetween(String value1, String value2) {
            addCriterion("costPriceKey between", value1, value2, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyNotBetween(String value1, String value2) {
            addCriterion("costPriceKey not between", value1, value2, "costpricekey");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Double value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Double value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Double value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Double value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Double value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Double value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Double> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Double> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Double value1, Double value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Double value1, Double value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNull() {
            addCriterion("ownerName is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("ownerName is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("ownerName =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("ownerName <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("ownerName >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("ownerName >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("ownerName <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("ownerName <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("ownerName like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("ownerName not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("ownerName in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("ownerName not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("ownerName between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("ownerName not between", value1, value2, "ownername");
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

        public Criteria andShownameIsNull() {
            addCriterion("showName is null");
            return (Criteria) this;
        }

        public Criteria andShownameIsNotNull() {
            addCriterion("showName is not null");
            return (Criteria) this;
        }

        public Criteria andShownameEqualTo(String value) {
            addCriterion("showName =", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotEqualTo(String value) {
            addCriterion("showName <>", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThan(String value) {
            addCriterion("showName >", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThanOrEqualTo(String value) {
            addCriterion("showName >=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThan(String value) {
            addCriterion("showName <", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThanOrEqualTo(String value) {
            addCriterion("showName <=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLike(String value) {
            addCriterion("showName like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotLike(String value) {
            addCriterion("showName not like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameIn(List<String> values) {
            addCriterion("showName in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotIn(List<String> values) {
            addCriterion("showName not in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameBetween(String value1, String value2) {
            addCriterion("showName between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotBetween(String value1, String value2) {
            addCriterion("showName not between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andShowidIsNull() {
            addCriterion("showId is null");
            return (Criteria) this;
        }

        public Criteria andShowidIsNotNull() {
            addCriterion("showId is not null");
            return (Criteria) this;
        }

        public Criteria andShowidEqualTo(String value) {
            addCriterion("showId =", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidNotEqualTo(String value) {
            addCriterion("showId <>", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidGreaterThan(String value) {
            addCriterion("showId >", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidGreaterThanOrEqualTo(String value) {
            addCriterion("showId >=", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidLessThan(String value) {
            addCriterion("showId <", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidLessThanOrEqualTo(String value) {
            addCriterion("showId <=", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidLike(String value) {
            addCriterion("showId like", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidNotLike(String value) {
            addCriterion("showId not like", value, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidIn(List<String> values) {
            addCriterion("showId in", values, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidNotIn(List<String> values) {
            addCriterion("showId not in", values, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidBetween(String value1, String value2) {
            addCriterion("showId between", value1, value2, "showid");
            return (Criteria) this;
        }

        public Criteria andShowidNotBetween(String value1, String value2) {
            addCriterion("showId not between", value1, value2, "showid");
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

        public Criteria andStorageidIsNull() {
            addCriterion("storageId is null");
            return (Criteria) this;
        }

        public Criteria andStorageidIsNotNull() {
            addCriterion("storageId is not null");
            return (Criteria) this;
        }

        public Criteria andStorageidEqualTo(String value) {
            addCriterion("storageId =", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotEqualTo(String value) {
            addCriterion("storageId <>", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThan(String value) {
            addCriterion("storageId >", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidGreaterThanOrEqualTo(String value) {
            addCriterion("storageId >=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThan(String value) {
            addCriterion("storageId <", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLessThanOrEqualTo(String value) {
            addCriterion("storageId <=", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidLike(String value) {
            addCriterion("storageId like", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotLike(String value) {
            addCriterion("storageId not like", value, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidIn(List<String> values) {
            addCriterion("storageId in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotIn(List<String> values) {
            addCriterion("storageId not in", values, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidBetween(String value1, String value2) {
            addCriterion("storageId between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andStorageidNotBetween(String value1, String value2) {
            addCriterion("storageId not between", value1, value2, "storageid");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameIsNull() {
            addCriterion("depotpartName is null");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameIsNotNull() {
            addCriterion("depotpartName is not null");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameEqualTo(String value) {
            addCriterion("depotpartName =", value, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameNotEqualTo(String value) {
            addCriterion("depotpartName <>", value, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameGreaterThan(String value) {
            addCriterion("depotpartName >", value, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameGreaterThanOrEqualTo(String value) {
            addCriterion("depotpartName >=", value, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameLessThan(String value) {
            addCriterion("depotpartName <", value, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameLessThanOrEqualTo(String value) {
            addCriterion("depotpartName <=", value, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameLike(String value) {
            addCriterion("depotpartName like", value, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameNotLike(String value) {
            addCriterion("depotpartName not like", value, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameIn(List<String> values) {
            addCriterion("depotpartName in", values, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameNotIn(List<String> values) {
            addCriterion("depotpartName not in", values, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameBetween(String value1, String value2) {
            addCriterion("depotpartName between", value1, value2, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameNotBetween(String value1, String value2) {
            addCriterion("depotpartName not between", value1, value2, "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartidIsNull() {
            addCriterion("depotpartId is null");
            return (Criteria) this;
        }

        public Criteria andDepotpartidIsNotNull() {
            addCriterion("depotpartId is not null");
            return (Criteria) this;
        }

        public Criteria andDepotpartidEqualTo(String value) {
            addCriterion("depotpartId =", value, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidNotEqualTo(String value) {
            addCriterion("depotpartId <>", value, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidGreaterThan(String value) {
            addCriterion("depotpartId >", value, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidGreaterThanOrEqualTo(String value) {
            addCriterion("depotpartId >=", value, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidLessThan(String value) {
            addCriterion("depotpartId <", value, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidLessThanOrEqualTo(String value) {
            addCriterion("depotpartId <=", value, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidLike(String value) {
            addCriterion("depotpartId like", value, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidNotLike(String value) {
            addCriterion("depotpartId not like", value, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidIn(List<String> values) {
            addCriterion("depotpartId in", values, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidNotIn(List<String> values) {
            addCriterion("depotpartId not in", values, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidBetween(String value1, String value2) {
            addCriterion("depotpartId between", value1, value2, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidNotBetween(String value1, String value2) {
            addCriterion("depotpartId not between", value1, value2, "depotpartid");
            return (Criteria) this;
        }

        public Criteria andInputpriceIsNull() {
            addCriterion("inputPrice is null");
            return (Criteria) this;
        }

        public Criteria andInputpriceIsNotNull() {
            addCriterion("inputPrice is not null");
            return (Criteria) this;
        }

        public Criteria andInputpriceEqualTo(Double value) {
            addCriterion("inputPrice =", value, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceNotEqualTo(Double value) {
            addCriterion("inputPrice <>", value, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceGreaterThan(Double value) {
            addCriterion("inputPrice >", value, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("inputPrice >=", value, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceLessThan(Double value) {
            addCriterion("inputPrice <", value, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceLessThanOrEqualTo(Double value) {
            addCriterion("inputPrice <=", value, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceIn(List<Double> values) {
            addCriterion("inputPrice in", values, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceNotIn(List<Double> values) {
            addCriterion("inputPrice not in", values, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceBetween(Double value1, Double value2) {
            addCriterion("inputPrice between", value1, value2, "inputprice");
            return (Criteria) this;
        }

        public Criteria andInputpriceNotBetween(Double value1, Double value2) {
            addCriterion("inputPrice not between", value1, value2, "inputprice");
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

        public Criteria andInvoicemoneyIsNull() {
            addCriterion("invoiceMoney is null");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyIsNotNull() {
            addCriterion("invoiceMoney is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyEqualTo(Double value) {
            addCriterion("invoiceMoney =", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyNotEqualTo(Double value) {
            addCriterion("invoiceMoney <>", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyGreaterThan(Double value) {
            addCriterion("invoiceMoney >", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("invoiceMoney >=", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyLessThan(Double value) {
            addCriterion("invoiceMoney <", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyLessThanOrEqualTo(Double value) {
            addCriterion("invoiceMoney <=", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyIn(List<Double> values) {
            addCriterion("invoiceMoney in", values, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyNotIn(List<Double> values) {
            addCriterion("invoiceMoney not in", values, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyBetween(Double value1, Double value2) {
            addCriterion("invoiceMoney between", value1, value2, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyNotBetween(Double value1, Double value2) {
            addCriterion("invoiceMoney not between", value1, value2, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNull() {
            addCriterion("pprice is null");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNotNull() {
            addCriterion("pprice is not null");
            return (Criteria) this;
        }

        public Criteria andPpriceEqualTo(Double value) {
            addCriterion("pprice =", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotEqualTo(Double value) {
            addCriterion("pprice <>", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThan(Double value) {
            addCriterion("pprice >", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pprice >=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThan(Double value) {
            addCriterion("pprice <", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThanOrEqualTo(Double value) {
            addCriterion("pprice <=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceIn(List<Double> values) {
            addCriterion("pprice in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotIn(List<Double> values) {
            addCriterion("pprice not in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceBetween(Double value1, Double value2) {
            addCriterion("pprice between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotBetween(Double value1, Double value2) {
            addCriterion("pprice not between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andIpriceIsNull() {
            addCriterion("iprice is null");
            return (Criteria) this;
        }

        public Criteria andIpriceIsNotNull() {
            addCriterion("iprice is not null");
            return (Criteria) this;
        }

        public Criteria andIpriceEqualTo(Double value) {
            addCriterion("iprice =", value, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceNotEqualTo(Double value) {
            addCriterion("iprice <>", value, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceGreaterThan(Double value) {
            addCriterion("iprice >", value, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("iprice >=", value, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceLessThan(Double value) {
            addCriterion("iprice <", value, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceLessThanOrEqualTo(Double value) {
            addCriterion("iprice <=", value, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceIn(List<Double> values) {
            addCriterion("iprice in", values, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceNotIn(List<Double> values) {
            addCriterion("iprice not in", values, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceBetween(Double value1, Double value2) {
            addCriterion("iprice between", value1, value2, "iprice");
            return (Criteria) this;
        }

        public Criteria andIpriceNotBetween(Double value1, Double value2) {
            addCriterion("iprice not between", value1, value2, "iprice");
            return (Criteria) this;
        }

        public Criteria andDelivertypeIsNull() {
            addCriterion("deliverType is null");
            return (Criteria) this;
        }

        public Criteria andDelivertypeIsNotNull() {
            addCriterion("deliverType is not null");
            return (Criteria) this;
        }

        public Criteria andDelivertypeEqualTo(Integer value) {
            addCriterion("deliverType =", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeNotEqualTo(Integer value) {
            addCriterion("deliverType <>", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeGreaterThan(Integer value) {
            addCriterion("deliverType >", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliverType >=", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeLessThan(Integer value) {
            addCriterion("deliverType <", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeLessThanOrEqualTo(Integer value) {
            addCriterion("deliverType <=", value, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeIn(List<Integer> values) {
            addCriterion("deliverType in", values, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeNotIn(List<Integer> values) {
            addCriterion("deliverType not in", values, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeBetween(Integer value1, Integer value2) {
            addCriterion("deliverType between", value1, value2, "delivertype");
            return (Criteria) this;
        }

        public Criteria andDelivertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("deliverType not between", value1, value2, "delivertype");
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

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Double value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Double value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Double value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Double value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Double value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Double> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Double> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Double value1, Double value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Double value1, Double value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitratioIsNull() {
            addCriterion("profitRatio is null");
            return (Criteria) this;
        }

        public Criteria andProfitratioIsNotNull() {
            addCriterion("profitRatio is not null");
            return (Criteria) this;
        }

        public Criteria andProfitratioEqualTo(Double value) {
            addCriterion("profitRatio =", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotEqualTo(Double value) {
            addCriterion("profitRatio <>", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioGreaterThan(Double value) {
            addCriterion("profitRatio >", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioGreaterThanOrEqualTo(Double value) {
            addCriterion("profitRatio >=", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioLessThan(Double value) {
            addCriterion("profitRatio <", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioLessThanOrEqualTo(Double value) {
            addCriterion("profitRatio <=", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioIn(List<Double> values) {
            addCriterion("profitRatio in", values, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotIn(List<Double> values) {
            addCriterion("profitRatio not in", values, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioBetween(Double value1, Double value2) {
            addCriterion("profitRatio between", value1, value2, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotBetween(Double value1, Double value2) {
            addCriterion("profitRatio not between", value1, value2, "profitratio");
            return (Criteria) this;
        }

        public Criteria andOldgoodsIsNull() {
            addCriterion("oldGoods is null");
            return (Criteria) this;
        }

        public Criteria andOldgoodsIsNotNull() {
            addCriterion("oldGoods is not null");
            return (Criteria) this;
        }

        public Criteria andOldgoodsEqualTo(Integer value) {
            addCriterion("oldGoods =", value, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsNotEqualTo(Integer value) {
            addCriterion("oldGoods <>", value, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsGreaterThan(Integer value) {
            addCriterion("oldGoods >", value, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldGoods >=", value, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsLessThan(Integer value) {
            addCriterion("oldGoods <", value, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsLessThanOrEqualTo(Integer value) {
            addCriterion("oldGoods <=", value, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsIn(List<Integer> values) {
            addCriterion("oldGoods in", values, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsNotIn(List<Integer> values) {
            addCriterion("oldGoods not in", values, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsBetween(Integer value1, Integer value2) {
            addCriterion("oldGoods between", value1, value2, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andOldgoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("oldGoods not between", value1, value2, "oldgoods");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("taxrate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("taxrate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Double value) {
            addCriterion("taxrate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Double value) {
            addCriterion("taxrate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Double value) {
            addCriterion("taxrate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Double value) {
            addCriterion("taxrate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Double value) {
            addCriterion("taxrate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Double value) {
            addCriterion("taxrate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Double> values) {
            addCriterion("taxrate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Double> values) {
            addCriterion("taxrate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Double value1, Double value2) {
            addCriterion("taxrate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Double value1, Double value2) {
            addCriterion("taxrate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Double value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Double value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Double value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Double value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Double value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Double> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Double> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Double value1, Double value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Double value1, Double value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andInputrateIsNull() {
            addCriterion("inputRate is null");
            return (Criteria) this;
        }

        public Criteria andInputrateIsNotNull() {
            addCriterion("inputRate is not null");
            return (Criteria) this;
        }

        public Criteria andInputrateEqualTo(Double value) {
            addCriterion("inputRate =", value, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateNotEqualTo(Double value) {
            addCriterion("inputRate <>", value, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateGreaterThan(Double value) {
            addCriterion("inputRate >", value, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateGreaterThanOrEqualTo(Double value) {
            addCriterion("inputRate >=", value, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateLessThan(Double value) {
            addCriterion("inputRate <", value, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateLessThanOrEqualTo(Double value) {
            addCriterion("inputRate <=", value, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateIn(List<Double> values) {
            addCriterion("inputRate in", values, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateNotIn(List<Double> values) {
            addCriterion("inputRate not in", values, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateBetween(Double value1, Double value2) {
            addCriterion("inputRate between", value1, value2, "inputrate");
            return (Criteria) this;
        }

        public Criteria andInputrateNotBetween(Double value1, Double value2) {
            addCriterion("inputRate not between", value1, value2, "inputrate");
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

        public Criteria andIbmoneyIsNull() {
            addCriterion("ibMoney is null");
            return (Criteria) this;
        }

        public Criteria andIbmoneyIsNotNull() {
            addCriterion("ibMoney is not null");
            return (Criteria) this;
        }

        public Criteria andIbmoneyEqualTo(Double value) {
            addCriterion("ibMoney =", value, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyNotEqualTo(Double value) {
            addCriterion("ibMoney <>", value, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyGreaterThan(Double value) {
            addCriterion("ibMoney >", value, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ibMoney >=", value, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyLessThan(Double value) {
            addCriterion("ibMoney <", value, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ibMoney <=", value, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyIn(List<Double> values) {
            addCriterion("ibMoney in", values, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyNotIn(List<Double> values) {
            addCriterion("ibMoney not in", values, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyBetween(Double value1, Double value2) {
            addCriterion("ibMoney between", value1, value2, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andIbmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ibMoney not between", value1, value2, "ibmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyIsNull() {
            addCriterion("motivationMoney is null");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyIsNotNull() {
            addCriterion("motivationMoney is not null");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyEqualTo(Double value) {
            addCriterion("motivationMoney =", value, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyNotEqualTo(Double value) {
            addCriterion("motivationMoney <>", value, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyGreaterThan(Double value) {
            addCriterion("motivationMoney >", value, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("motivationMoney >=", value, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyLessThan(Double value) {
            addCriterion("motivationMoney <", value, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyLessThanOrEqualTo(Double value) {
            addCriterion("motivationMoney <=", value, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyIn(List<Double> values) {
            addCriterion("motivationMoney in", values, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyNotIn(List<Double> values) {
            addCriterion("motivationMoney not in", values, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyBetween(Double value1, Double value2) {
            addCriterion("motivationMoney between", value1, value2, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andMotivationmoneyNotBetween(Double value1, Double value2) {
            addCriterion("motivationMoney not between", value1, value2, "motivationmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyIsNull() {
            addCriterion("profitmoney is null");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyIsNotNull() {
            addCriterion("profitmoney is not null");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyEqualTo(Double value) {
            addCriterion("profitmoney =", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyNotEqualTo(Double value) {
            addCriterion("profitmoney <>", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyGreaterThan(Double value) {
            addCriterion("profitmoney >", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("profitmoney >=", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyLessThan(Double value) {
            addCriterion("profitmoney <", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyLessThanOrEqualTo(Double value) {
            addCriterion("profitmoney <=", value, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyIn(List<Double> values) {
            addCriterion("profitmoney in", values, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyNotIn(List<Double> values) {
            addCriterion("profitmoney not in", values, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyBetween(Double value1, Double value2) {
            addCriterion("profitmoney between", value1, value2, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andProfitmoneyNotBetween(Double value1, Double value2) {
            addCriterion("profitmoney not between", value1, value2, "profitmoney");
            return (Criteria) this;
        }

        public Criteria andGrossprofitIsNull() {
            addCriterion("grossProfit is null");
            return (Criteria) this;
        }

        public Criteria andGrossprofitIsNotNull() {
            addCriterion("grossProfit is not null");
            return (Criteria) this;
        }

        public Criteria andGrossprofitEqualTo(Double value) {
            addCriterion("grossProfit =", value, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitNotEqualTo(Double value) {
            addCriterion("grossProfit <>", value, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitGreaterThan(Double value) {
            addCriterion("grossProfit >", value, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitGreaterThanOrEqualTo(Double value) {
            addCriterion("grossProfit >=", value, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitLessThan(Double value) {
            addCriterion("grossProfit <", value, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitLessThanOrEqualTo(Double value) {
            addCriterion("grossProfit <=", value, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitIn(List<Double> values) {
            addCriterion("grossProfit in", values, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitNotIn(List<Double> values) {
            addCriterion("grossProfit not in", values, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitBetween(Double value1, Double value2) {
            addCriterion("grossProfit between", value1, value2, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andGrossprofitNotBetween(Double value1, Double value2) {
            addCriterion("grossProfit not between", value1, value2, "grossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitIsNull() {
            addCriterion("checkgrossProfit is null");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitIsNotNull() {
            addCriterion("checkgrossProfit is not null");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitEqualTo(Double value) {
            addCriterion("checkgrossProfit =", value, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitNotEqualTo(Double value) {
            addCriterion("checkgrossProfit <>", value, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitGreaterThan(Double value) {
            addCriterion("checkgrossProfit >", value, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitGreaterThanOrEqualTo(Double value) {
            addCriterion("checkgrossProfit >=", value, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitLessThan(Double value) {
            addCriterion("checkgrossProfit <", value, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitLessThanOrEqualTo(Double value) {
            addCriterion("checkgrossProfit <=", value, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitIn(List<Double> values) {
            addCriterion("checkgrossProfit in", values, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitNotIn(List<Double> values) {
            addCriterion("checkgrossProfit not in", values, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitBetween(Double value1, Double value2) {
            addCriterion("checkgrossProfit between", value1, value2, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCheckgrossprofitNotBetween(Double value1, Double value2) {
            addCriterion("checkgrossProfit not between", value1, value2, "checkgrossprofit");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(Double value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(Double value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(Double value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(Double value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(Double value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(Double value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<Double> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<Double> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(Double value1, Double value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(Double value1, Double value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andIbmoney2IsNull() {
            addCriterion("ibMoney2 is null");
            return (Criteria) this;
        }

        public Criteria andIbmoney2IsNotNull() {
            addCriterion("ibMoney2 is not null");
            return (Criteria) this;
        }

        public Criteria andIbmoney2EqualTo(Double value) {
            addCriterion("ibMoney2 =", value, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2NotEqualTo(Double value) {
            addCriterion("ibMoney2 <>", value, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2GreaterThan(Double value) {
            addCriterion("ibMoney2 >", value, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2GreaterThanOrEqualTo(Double value) {
            addCriterion("ibMoney2 >=", value, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2LessThan(Double value) {
            addCriterion("ibMoney2 <", value, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2LessThanOrEqualTo(Double value) {
            addCriterion("ibMoney2 <=", value, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2In(List<Double> values) {
            addCriterion("ibMoney2 in", values, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2NotIn(List<Double> values) {
            addCriterion("ibMoney2 not in", values, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2Between(Double value1, Double value2) {
            addCriterion("ibMoney2 between", value1, value2, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andIbmoney2NotBetween(Double value1, Double value2) {
            addCriterion("ibMoney2 not between", value1, value2, "ibmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2IsNull() {
            addCriterion("motivationMoney2 is null");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2IsNotNull() {
            addCriterion("motivationMoney2 is not null");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2EqualTo(Double value) {
            addCriterion("motivationMoney2 =", value, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2NotEqualTo(Double value) {
            addCriterion("motivationMoney2 <>", value, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2GreaterThan(Double value) {
            addCriterion("motivationMoney2 >", value, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2GreaterThanOrEqualTo(Double value) {
            addCriterion("motivationMoney2 >=", value, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2LessThan(Double value) {
            addCriterion("motivationMoney2 <", value, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2LessThanOrEqualTo(Double value) {
            addCriterion("motivationMoney2 <=", value, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2In(List<Double> values) {
            addCriterion("motivationMoney2 in", values, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2NotIn(List<Double> values) {
            addCriterion("motivationMoney2 not in", values, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2Between(Double value1, Double value2) {
            addCriterion("motivationMoney2 between", value1, value2, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andMotivationmoney2NotBetween(Double value1, Double value2) {
            addCriterion("motivationMoney2 not between", value1, value2, "motivationmoney2");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeIsNull() {
            addCriterion("platformFee is null");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeIsNotNull() {
            addCriterion("platformFee is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeEqualTo(Double value) {
            addCriterion("platformFee =", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeNotEqualTo(Double value) {
            addCriterion("platformFee <>", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeGreaterThan(Double value) {
            addCriterion("platformFee >", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("platformFee >=", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeLessThan(Double value) {
            addCriterion("platformFee <", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeLessThanOrEqualTo(Double value) {
            addCriterion("platformFee <=", value, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeIn(List<Double> values) {
            addCriterion("platformFee in", values, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeNotIn(List<Double> values) {
            addCriterion("platformFee not in", values, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeBetween(Double value1, Double value2) {
            addCriterion("platformFee between", value1, value2, "platformfee");
            return (Criteria) this;
        }

        public Criteria andPlatformfeeNotBetween(Double value1, Double value2) {
            addCriterion("platformFee not between", value1, value2, "platformfee");
            return (Criteria) this;
        }

        public Criteria andProductimportidIsNull() {
            addCriterion("productImportId is null");
            return (Criteria) this;
        }

        public Criteria andProductimportidIsNotNull() {
            addCriterion("productImportId is not null");
            return (Criteria) this;
        }

        public Criteria andProductimportidEqualTo(String value) {
            addCriterion("productImportId =", value, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidNotEqualTo(String value) {
            addCriterion("productImportId <>", value, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidGreaterThan(String value) {
            addCriterion("productImportId >", value, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidGreaterThanOrEqualTo(String value) {
            addCriterion("productImportId >=", value, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidLessThan(String value) {
            addCriterion("productImportId <", value, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidLessThanOrEqualTo(String value) {
            addCriterion("productImportId <=", value, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidLike(String value) {
            addCriterion("productImportId like", value, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidNotLike(String value) {
            addCriterion("productImportId not like", value, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidIn(List<String> values) {
            addCriterion("productImportId in", values, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidNotIn(List<String> values) {
            addCriterion("productImportId not in", values, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidBetween(String value1, String value2) {
            addCriterion("productImportId between", value1, value2, "productimportid");
            return (Criteria) this;
        }

        public Criteria andProductimportidNotBetween(String value1, String value2) {
            addCriterion("productImportId not between", value1, value2, "productimportid");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyIsNull() {
            addCriterion("ykibMoney is null");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyIsNotNull() {
            addCriterion("ykibMoney is not null");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyEqualTo(Double value) {
            addCriterion("ykibMoney =", value, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyNotEqualTo(Double value) {
            addCriterion("ykibMoney <>", value, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyGreaterThan(Double value) {
            addCriterion("ykibMoney >", value, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ykibMoney >=", value, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyLessThan(Double value) {
            addCriterion("ykibMoney <", value, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ykibMoney <=", value, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyIn(List<Double> values) {
            addCriterion("ykibMoney in", values, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyNotIn(List<Double> values) {
            addCriterion("ykibMoney not in", values, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyBetween(Double value1, Double value2) {
            addCriterion("ykibMoney between", value1, value2, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andYkibmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ykibMoney not between", value1, value2, "ykibmoney");
            return (Criteria) this;
        }

        public Criteria andCash2IsNull() {
            addCriterion("cash2 is null");
            return (Criteria) this;
        }

        public Criteria andCash2IsNotNull() {
            addCriterion("cash2 is not null");
            return (Criteria) this;
        }

        public Criteria andCash2EqualTo(Double value) {
            addCriterion("cash2 =", value, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2NotEqualTo(Double value) {
            addCriterion("cash2 <>", value, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2GreaterThan(Double value) {
            addCriterion("cash2 >", value, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2GreaterThanOrEqualTo(Double value) {
            addCriterion("cash2 >=", value, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2LessThan(Double value) {
            addCriterion("cash2 <", value, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2LessThanOrEqualTo(Double value) {
            addCriterion("cash2 <=", value, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2In(List<Double> values) {
            addCriterion("cash2 in", values, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2NotIn(List<Double> values) {
            addCriterion("cash2 not in", values, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2Between(Double value1, Double value2) {
            addCriterion("cash2 between", value1, value2, "cash2");
            return (Criteria) this;
        }

        public Criteria andCash2NotBetween(Double value1, Double value2) {
            addCriterion("cash2 not between", value1, value2, "cash2");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceIsNull() {
            addCriterion("virtualPrice is null");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceIsNotNull() {
            addCriterion("virtualPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceEqualTo(Double value) {
            addCriterion("virtualPrice =", value, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceNotEqualTo(Double value) {
            addCriterion("virtualPrice <>", value, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceGreaterThan(Double value) {
            addCriterion("virtualPrice >", value, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("virtualPrice >=", value, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceLessThan(Double value) {
            addCriterion("virtualPrice <", value, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceLessThanOrEqualTo(Double value) {
            addCriterion("virtualPrice <=", value, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceIn(List<Double> values) {
            addCriterion("virtualPrice in", values, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceNotIn(List<Double> values) {
            addCriterion("virtualPrice not in", values, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceBetween(Double value1, Double value2) {
            addCriterion("virtualPrice between", value1, value2, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpriceNotBetween(Double value1, Double value2) {
            addCriterion("virtualPrice not between", value1, value2, "virtualprice");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyIsNull() {
            addCriterion("virtualPriceKey is null");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyIsNotNull() {
            addCriterion("virtualPriceKey is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyEqualTo(String value) {
            addCriterion("virtualPriceKey =", value, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyNotEqualTo(String value) {
            addCriterion("virtualPriceKey <>", value, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyGreaterThan(String value) {
            addCriterion("virtualPriceKey >", value, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyGreaterThanOrEqualTo(String value) {
            addCriterion("virtualPriceKey >=", value, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyLessThan(String value) {
            addCriterion("virtualPriceKey <", value, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyLessThanOrEqualTo(String value) {
            addCriterion("virtualPriceKey <=", value, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyLike(String value) {
            addCriterion("virtualPriceKey like", value, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyNotLike(String value) {
            addCriterion("virtualPriceKey not like", value, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyIn(List<String> values) {
            addCriterion("virtualPriceKey in", values, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyNotIn(List<String> values) {
            addCriterion("virtualPriceKey not in", values, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyBetween(String value1, String value2) {
            addCriterion("virtualPriceKey between", value1, value2, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyNotBetween(String value1, String value2) {
            addCriterion("virtualPriceKey not between", value1, value2, "virtualpricekey");
            return (Criteria) this;
        }

        public Criteria andProductidLikeInsensitive(String value) {
            addCriterion("upper(productId) like", value.toUpperCase(), "productid");
            return (Criteria) this;
        }

        public Criteria andUnitLikeInsensitive(String value) {
            addCriterion("upper(unit) like", value.toUpperCase(), "unit");
            return (Criteria) this;
        }

        public Criteria andCostpricekeyLikeInsensitive(String value) {
            addCriterion("upper(costPriceKey) like", value.toUpperCase(), "costpricekey");
            return (Criteria) this;
        }

        public Criteria andOwnerLikeInsensitive(String value) {
            addCriterion("upper(owner) like", value.toUpperCase(), "owner");
            return (Criteria) this;
        }

        public Criteria andOwnernameLikeInsensitive(String value) {
            addCriterion("upper(ownerName) like", value.toUpperCase(), "ownername");
            return (Criteria) this;
        }

        public Criteria andLocationidLikeInsensitive(String value) {
            addCriterion("upper(locationId) like", value.toUpperCase(), "locationid");
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

        public Criteria andShownameLikeInsensitive(String value) {
            addCriterion("upper(showName) like", value.toUpperCase(), "showname");
            return (Criteria) this;
        }

        public Criteria andShowidLikeInsensitive(String value) {
            addCriterion("upper(showId) like", value.toUpperCase(), "showid");
            return (Criteria) this;
        }

        public Criteria andOutidLikeInsensitive(String value) {
            addCriterion("upper(outId) like", value.toUpperCase(), "outid");
            return (Criteria) this;
        }

        public Criteria andStorageidLikeInsensitive(String value) {
            addCriterion("upper(storageId) like", value.toUpperCase(), "storageid");
            return (Criteria) this;
        }

        public Criteria andDepotpartnameLikeInsensitive(String value) {
            addCriterion("upper(depotpartName) like", value.toUpperCase(), "depotpartname");
            return (Criteria) this;
        }

        public Criteria andDepotpartidLikeInsensitive(String value) {
            addCriterion("upper(depotpartId) like", value.toUpperCase(), "depotpartid");
            return (Criteria) this;
        }

        public Criteria andRefidLikeInsensitive(String value) {
            addCriterion("upper(refId) like", value.toUpperCase(), "refid");
            return (Criteria) this;
        }

        public Criteria andProductimportidLikeInsensitive(String value) {
            addCriterion("upper(productImportId) like", value.toUpperCase(), "productimportid");
            return (Criteria) this;
        }

        public Criteria andVirtualpricekeyLikeInsensitive(String value) {
            addCriterion("upper(virtualPriceKey) like", value.toUpperCase(), "virtualpricekey");
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