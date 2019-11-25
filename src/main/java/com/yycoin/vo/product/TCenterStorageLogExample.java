package com.yycoin.vo.product;

import java.util.ArrayList;
import java.util.List;

public class TCenterStorageLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterStorageLogExample() {
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

        public Criteria andSerializeidIsNull() {
            addCriterion("serializeId is null");
            return (Criteria) this;
        }

        public Criteria andSerializeidIsNotNull() {
            addCriterion("serializeId is not null");
            return (Criteria) this;
        }

        public Criteria andSerializeidEqualTo(String value) {
            addCriterion("serializeId =", value, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidNotEqualTo(String value) {
            addCriterion("serializeId <>", value, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidGreaterThan(String value) {
            addCriterion("serializeId >", value, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidGreaterThanOrEqualTo(String value) {
            addCriterion("serializeId >=", value, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidLessThan(String value) {
            addCriterion("serializeId <", value, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidLessThanOrEqualTo(String value) {
            addCriterion("serializeId <=", value, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidLike(String value) {
            addCriterion("serializeId like", value, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidNotLike(String value) {
            addCriterion("serializeId not like", value, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidIn(List<String> values) {
            addCriterion("serializeId in", values, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidNotIn(List<String> values) {
            addCriterion("serializeId not in", values, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidBetween(String value1, String value2) {
            addCriterion("serializeId between", value1, value2, "serializeid");
            return (Criteria) this;
        }

        public Criteria andSerializeidNotBetween(String value1, String value2) {
            addCriterion("serializeId not between", value1, value2, "serializeid");
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

        public Criteria andPreamountIsNull() {
            addCriterion("preAmount is null");
            return (Criteria) this;
        }

        public Criteria andPreamountIsNotNull() {
            addCriterion("preAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPreamountEqualTo(Integer value) {
            addCriterion("preAmount =", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountNotEqualTo(Integer value) {
            addCriterion("preAmount <>", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountGreaterThan(Integer value) {
            addCriterion("preAmount >", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("preAmount >=", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountLessThan(Integer value) {
            addCriterion("preAmount <", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountLessThanOrEqualTo(Integer value) {
            addCriterion("preAmount <=", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountIn(List<Integer> values) {
            addCriterion("preAmount in", values, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountNotIn(List<Integer> values) {
            addCriterion("preAmount not in", values, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountBetween(Integer value1, Integer value2) {
            addCriterion("preAmount between", value1, value2, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountNotBetween(Integer value1, Integer value2) {
            addCriterion("preAmount not between", value1, value2, "preamount");
            return (Criteria) this;
        }

        public Criteria andAfteramountIsNull() {
            addCriterion("afterAmount is null");
            return (Criteria) this;
        }

        public Criteria andAfteramountIsNotNull() {
            addCriterion("afterAmount is not null");
            return (Criteria) this;
        }

        public Criteria andAfteramountEqualTo(Integer value) {
            addCriterion("afterAmount =", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotEqualTo(Integer value) {
            addCriterion("afterAmount <>", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountGreaterThan(Integer value) {
            addCriterion("afterAmount >", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountGreaterThanOrEqualTo(Integer value) {
            addCriterion("afterAmount >=", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountLessThan(Integer value) {
            addCriterion("afterAmount <", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountLessThanOrEqualTo(Integer value) {
            addCriterion("afterAmount <=", value, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountIn(List<Integer> values) {
            addCriterion("afterAmount in", values, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotIn(List<Integer> values) {
            addCriterion("afterAmount not in", values, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountBetween(Integer value1, Integer value2) {
            addCriterion("afterAmount between", value1, value2, "afteramount");
            return (Criteria) this;
        }

        public Criteria andAfteramountNotBetween(Integer value1, Integer value2) {
            addCriterion("afterAmount not between", value1, value2, "afteramount");
            return (Criteria) this;
        }

        public Criteria andPreamount1IsNull() {
            addCriterion("preAmount1 is null");
            return (Criteria) this;
        }

        public Criteria andPreamount1IsNotNull() {
            addCriterion("preAmount1 is not null");
            return (Criteria) this;
        }

        public Criteria andPreamount1EqualTo(Integer value) {
            addCriterion("preAmount1 =", value, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1NotEqualTo(Integer value) {
            addCriterion("preAmount1 <>", value, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1GreaterThan(Integer value) {
            addCriterion("preAmount1 >", value, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("preAmount1 >=", value, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1LessThan(Integer value) {
            addCriterion("preAmount1 <", value, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1LessThanOrEqualTo(Integer value) {
            addCriterion("preAmount1 <=", value, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1In(List<Integer> values) {
            addCriterion("preAmount1 in", values, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1NotIn(List<Integer> values) {
            addCriterion("preAmount1 not in", values, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1Between(Integer value1, Integer value2) {
            addCriterion("preAmount1 between", value1, value2, "preamount1");
            return (Criteria) this;
        }

        public Criteria andPreamount1NotBetween(Integer value1, Integer value2) {
            addCriterion("preAmount1 not between", value1, value2, "preamount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1IsNull() {
            addCriterion("afterAmount1 is null");
            return (Criteria) this;
        }

        public Criteria andAfteramount1IsNotNull() {
            addCriterion("afterAmount1 is not null");
            return (Criteria) this;
        }

        public Criteria andAfteramount1EqualTo(Integer value) {
            addCriterion("afterAmount1 =", value, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1NotEqualTo(Integer value) {
            addCriterion("afterAmount1 <>", value, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1GreaterThan(Integer value) {
            addCriterion("afterAmount1 >", value, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("afterAmount1 >=", value, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1LessThan(Integer value) {
            addCriterion("afterAmount1 <", value, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1LessThanOrEqualTo(Integer value) {
            addCriterion("afterAmount1 <=", value, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1In(List<Integer> values) {
            addCriterion("afterAmount1 in", values, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1NotIn(List<Integer> values) {
            addCriterion("afterAmount1 not in", values, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1Between(Integer value1, Integer value2) {
            addCriterion("afterAmount1 between", value1, value2, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andAfteramount1NotBetween(Integer value1, Integer value2) {
            addCriterion("afterAmount1 not between", value1, value2, "afteramount1");
            return (Criteria) this;
        }

        public Criteria andPreamount11IsNull() {
            addCriterion("preAmount11 is null");
            return (Criteria) this;
        }

        public Criteria andPreamount11IsNotNull() {
            addCriterion("preAmount11 is not null");
            return (Criteria) this;
        }

        public Criteria andPreamount11EqualTo(Integer value) {
            addCriterion("preAmount11 =", value, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11NotEqualTo(Integer value) {
            addCriterion("preAmount11 <>", value, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11GreaterThan(Integer value) {
            addCriterion("preAmount11 >", value, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11GreaterThanOrEqualTo(Integer value) {
            addCriterion("preAmount11 >=", value, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11LessThan(Integer value) {
            addCriterion("preAmount11 <", value, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11LessThanOrEqualTo(Integer value) {
            addCriterion("preAmount11 <=", value, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11In(List<Integer> values) {
            addCriterion("preAmount11 in", values, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11NotIn(List<Integer> values) {
            addCriterion("preAmount11 not in", values, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11Between(Integer value1, Integer value2) {
            addCriterion("preAmount11 between", value1, value2, "preamount11");
            return (Criteria) this;
        }

        public Criteria andPreamount11NotBetween(Integer value1, Integer value2) {
            addCriterion("preAmount11 not between", value1, value2, "preamount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11IsNull() {
            addCriterion("afterAmount11 is null");
            return (Criteria) this;
        }

        public Criteria andAfteramount11IsNotNull() {
            addCriterion("afterAmount11 is not null");
            return (Criteria) this;
        }

        public Criteria andAfteramount11EqualTo(Integer value) {
            addCriterion("afterAmount11 =", value, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11NotEqualTo(Integer value) {
            addCriterion("afterAmount11 <>", value, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11GreaterThan(Integer value) {
            addCriterion("afterAmount11 >", value, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11GreaterThanOrEqualTo(Integer value) {
            addCriterion("afterAmount11 >=", value, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11LessThan(Integer value) {
            addCriterion("afterAmount11 <", value, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11LessThanOrEqualTo(Integer value) {
            addCriterion("afterAmount11 <=", value, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11In(List<Integer> values) {
            addCriterion("afterAmount11 in", values, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11NotIn(List<Integer> values) {
            addCriterion("afterAmount11 not in", values, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11Between(Integer value1, Integer value2) {
            addCriterion("afterAmount11 between", value1, value2, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andAfteramount11NotBetween(Integer value1, Integer value2) {
            addCriterion("afterAmount11 not between", value1, value2, "afteramount11");
            return (Criteria) this;
        }

        public Criteria andPreamount2IsNull() {
            addCriterion("preAmount2 is null");
            return (Criteria) this;
        }

        public Criteria andPreamount2IsNotNull() {
            addCriterion("preAmount2 is not null");
            return (Criteria) this;
        }

        public Criteria andPreamount2EqualTo(Integer value) {
            addCriterion("preAmount2 =", value, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2NotEqualTo(Integer value) {
            addCriterion("preAmount2 <>", value, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2GreaterThan(Integer value) {
            addCriterion("preAmount2 >", value, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("preAmount2 >=", value, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2LessThan(Integer value) {
            addCriterion("preAmount2 <", value, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2LessThanOrEqualTo(Integer value) {
            addCriterion("preAmount2 <=", value, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2In(List<Integer> values) {
            addCriterion("preAmount2 in", values, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2NotIn(List<Integer> values) {
            addCriterion("preAmount2 not in", values, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2Between(Integer value1, Integer value2) {
            addCriterion("preAmount2 between", value1, value2, "preamount2");
            return (Criteria) this;
        }

        public Criteria andPreamount2NotBetween(Integer value1, Integer value2) {
            addCriterion("preAmount2 not between", value1, value2, "preamount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2IsNull() {
            addCriterion("afterAmount2 is null");
            return (Criteria) this;
        }

        public Criteria andAfteramount2IsNotNull() {
            addCriterion("afterAmount2 is not null");
            return (Criteria) this;
        }

        public Criteria andAfteramount2EqualTo(Integer value) {
            addCriterion("afterAmount2 =", value, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2NotEqualTo(Integer value) {
            addCriterion("afterAmount2 <>", value, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2GreaterThan(Integer value) {
            addCriterion("afterAmount2 >", value, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("afterAmount2 >=", value, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2LessThan(Integer value) {
            addCriterion("afterAmount2 <", value, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2LessThanOrEqualTo(Integer value) {
            addCriterion("afterAmount2 <=", value, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2In(List<Integer> values) {
            addCriterion("afterAmount2 in", values, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2NotIn(List<Integer> values) {
            addCriterion("afterAmount2 not in", values, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2Between(Integer value1, Integer value2) {
            addCriterion("afterAmount2 between", value1, value2, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andAfteramount2NotBetween(Integer value1, Integer value2) {
            addCriterion("afterAmount2 not between", value1, value2, "afteramount2");
            return (Criteria) this;
        }

        public Criteria andPreamount22IsNull() {
            addCriterion("preAmount22 is null");
            return (Criteria) this;
        }

        public Criteria andPreamount22IsNotNull() {
            addCriterion("preAmount22 is not null");
            return (Criteria) this;
        }

        public Criteria andPreamount22EqualTo(Integer value) {
            addCriterion("preAmount22 =", value, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22NotEqualTo(Integer value) {
            addCriterion("preAmount22 <>", value, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22GreaterThan(Integer value) {
            addCriterion("preAmount22 >", value, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22GreaterThanOrEqualTo(Integer value) {
            addCriterion("preAmount22 >=", value, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22LessThan(Integer value) {
            addCriterion("preAmount22 <", value, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22LessThanOrEqualTo(Integer value) {
            addCriterion("preAmount22 <=", value, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22In(List<Integer> values) {
            addCriterion("preAmount22 in", values, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22NotIn(List<Integer> values) {
            addCriterion("preAmount22 not in", values, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22Between(Integer value1, Integer value2) {
            addCriterion("preAmount22 between", value1, value2, "preamount22");
            return (Criteria) this;
        }

        public Criteria andPreamount22NotBetween(Integer value1, Integer value2) {
            addCriterion("preAmount22 not between", value1, value2, "preamount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22IsNull() {
            addCriterion("afterAmount22 is null");
            return (Criteria) this;
        }

        public Criteria andAfteramount22IsNotNull() {
            addCriterion("afterAmount22 is not null");
            return (Criteria) this;
        }

        public Criteria andAfteramount22EqualTo(Integer value) {
            addCriterion("afterAmount22 =", value, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22NotEqualTo(Integer value) {
            addCriterion("afterAmount22 <>", value, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22GreaterThan(Integer value) {
            addCriterion("afterAmount22 >", value, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22GreaterThanOrEqualTo(Integer value) {
            addCriterion("afterAmount22 >=", value, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22LessThan(Integer value) {
            addCriterion("afterAmount22 <", value, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22LessThanOrEqualTo(Integer value) {
            addCriterion("afterAmount22 <=", value, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22In(List<Integer> values) {
            addCriterion("afterAmount22 in", values, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22NotIn(List<Integer> values) {
            addCriterion("afterAmount22 not in", values, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22Between(Integer value1, Integer value2) {
            addCriterion("afterAmount22 between", value1, value2, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andAfteramount22NotBetween(Integer value1, Integer value2) {
            addCriterion("afterAmount22 not between", value1, value2, "afteramount22");
            return (Criteria) this;
        }

        public Criteria andChangeamountIsNull() {
            addCriterion("changeAmount is null");
            return (Criteria) this;
        }

        public Criteria andChangeamountIsNotNull() {
            addCriterion("changeAmount is not null");
            return (Criteria) this;
        }

        public Criteria andChangeamountEqualTo(Integer value) {
            addCriterion("changeAmount =", value, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountNotEqualTo(Integer value) {
            addCriterion("changeAmount <>", value, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountGreaterThan(Integer value) {
            addCriterion("changeAmount >", value, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeAmount >=", value, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountLessThan(Integer value) {
            addCriterion("changeAmount <", value, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountLessThanOrEqualTo(Integer value) {
            addCriterion("changeAmount <=", value, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountIn(List<Integer> values) {
            addCriterion("changeAmount in", values, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountNotIn(List<Integer> values) {
            addCriterion("changeAmount not in", values, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountBetween(Integer value1, Integer value2) {
            addCriterion("changeAmount between", value1, value2, "changeamount");
            return (Criteria) this;
        }

        public Criteria andChangeamountNotBetween(Integer value1, Integer value2) {
            addCriterion("changeAmount not between", value1, value2, "changeamount");
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

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
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

        public Criteria andSerializeidLikeInsensitive(String value) {
            addCriterion("upper(serializeId) like", value.toUpperCase(), "serializeid");
            return (Criteria) this;
        }

        public Criteria andStorageidLikeInsensitive(String value) {
            addCriterion("upper(storageId) like", value.toUpperCase(), "storageid");
            return (Criteria) this;
        }

        public Criteria andDepotpartidLikeInsensitive(String value) {
            addCriterion("upper(depotpartId) like", value.toUpperCase(), "depotpartid");
            return (Criteria) this;
        }

        public Criteria andProductidLikeInsensitive(String value) {
            addCriterion("upper(productId) like", value.toUpperCase(), "productid");
            return (Criteria) this;
        }

        public Criteria andLogtimeLikeInsensitive(String value) {
            addCriterion("upper(logTime) like", value.toUpperCase(), "logtime");
            return (Criteria) this;
        }

        public Criteria andLocationidLikeInsensitive(String value) {
            addCriterion("upper(locationId) like", value.toUpperCase(), "locationid");
            return (Criteria) this;
        }

        public Criteria andUserLikeInsensitive(String value) {
            addCriterion("upper(user) like", value.toUpperCase(), "user");
            return (Criteria) this;
        }

        public Criteria andPricekeyLikeInsensitive(String value) {
            addCriterion("upper(priceKey) like", value.toUpperCase(), "pricekey");
            return (Criteria) this;
        }

        public Criteria andOwnerLikeInsensitive(String value) {
            addCriterion("upper(owner) like", value.toUpperCase(), "owner");
            return (Criteria) this;
        }

        public Criteria andRefidLikeInsensitive(String value) {
            addCriterion("upper(refId) like", value.toUpperCase(), "refid");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
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