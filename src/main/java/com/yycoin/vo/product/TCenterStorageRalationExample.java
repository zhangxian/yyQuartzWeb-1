package com.yycoin.vo.product;

import java.util.ArrayList;
import java.util.List;

public class TCenterStorageRalationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterStorageRalationExample() {
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

        public Criteria andPricekeyIsNull() {
            addCriterion("priceKey is null");
            return (Criteria) this;
        }

        public Criteria andPricekeyIsNotNull() {
            addCriterion("priceKey is not null");
            return (Criteria) this;
        }

        public Criteria andPricekeyEqualTo(String value) {
            addCriterion("priceKey =", value, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyNotEqualTo(String value) {
            addCriterion("priceKey <>", value, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyGreaterThan(String value) {
            addCriterion("priceKey >", value, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyGreaterThanOrEqualTo(String value) {
            addCriterion("priceKey >=", value, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyLessThan(String value) {
            addCriterion("priceKey <", value, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyLessThanOrEqualTo(String value) {
            addCriterion("priceKey <=", value, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyLike(String value) {
            addCriterion("priceKey like", value, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyNotLike(String value) {
            addCriterion("priceKey not like", value, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyIn(List<String> values) {
            addCriterion("priceKey in", values, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyNotIn(List<String> values) {
            addCriterion("priceKey not in", values, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyBetween(String value1, String value2) {
            addCriterion("priceKey between", value1, value2, "pricekey");
            return (Criteria) this;
        }

        public Criteria andPricekeyNotBetween(String value1, String value2) {
            addCriterion("priceKey not between", value1, value2, "pricekey");
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

        public Criteria andLastpriceIsNull() {
            addCriterion("lastPrice is null");
            return (Criteria) this;
        }

        public Criteria andLastpriceIsNotNull() {
            addCriterion("lastPrice is not null");
            return (Criteria) this;
        }

        public Criteria andLastpriceEqualTo(Double value) {
            addCriterion("lastPrice =", value, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceNotEqualTo(Double value) {
            addCriterion("lastPrice <>", value, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceGreaterThan(Double value) {
            addCriterion("lastPrice >", value, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("lastPrice >=", value, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceLessThan(Double value) {
            addCriterion("lastPrice <", value, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceLessThanOrEqualTo(Double value) {
            addCriterion("lastPrice <=", value, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceIn(List<Double> values) {
            addCriterion("lastPrice in", values, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceNotIn(List<Double> values) {
            addCriterion("lastPrice not in", values, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceBetween(Double value1, Double value2) {
            addCriterion("lastPrice between", value1, value2, "lastprice");
            return (Criteria) this;
        }

        public Criteria andLastpriceNotBetween(Double value1, Double value2) {
            addCriterion("lastPrice not between", value1, value2, "lastprice");
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

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andDepotpartidLikeInsensitive(String value) {
            addCriterion("upper(depotpartId) like", value.toUpperCase(), "depotpartid");
            return (Criteria) this;
        }

        public Criteria andStorageidLikeInsensitive(String value) {
            addCriterion("upper(storageId) like", value.toUpperCase(), "storageid");
            return (Criteria) this;
        }

        public Criteria andProductidLikeInsensitive(String value) {
            addCriterion("upper(productId) like", value.toUpperCase(), "productid");
            return (Criteria) this;
        }

        public Criteria andLocationidLikeInsensitive(String value) {
            addCriterion("upper(locationId) like", value.toUpperCase(), "locationid");
            return (Criteria) this;
        }

        public Criteria andPricekeyLikeInsensitive(String value) {
            addCriterion("upper(priceKey) like", value.toUpperCase(), "pricekey");
            return (Criteria) this;
        }

        public Criteria andStafferidLikeInsensitive(String value) {
            addCriterion("upper(stafferId) like", value.toUpperCase(), "stafferid");
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