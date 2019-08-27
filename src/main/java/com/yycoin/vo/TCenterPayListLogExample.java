package com.yycoin.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCenterPayListLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterPayListLogExample() {
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

        public Criteria andOutidIsNull() {
            addCriterion("Outid is null");
            return (Criteria) this;
        }

        public Criteria andOutidIsNotNull() {
            addCriterion("Outid is not null");
            return (Criteria) this;
        }

        public Criteria andOutidEqualTo(String value) {
            addCriterion("Outid =", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotEqualTo(String value) {
            addCriterion("Outid <>", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThan(String value) {
            addCriterion("Outid >", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThanOrEqualTo(String value) {
            addCriterion("Outid >=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThan(String value) {
            addCriterion("Outid <", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThanOrEqualTo(String value) {
            addCriterion("Outid <=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLike(String value) {
            addCriterion("Outid like", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotLike(String value) {
            addCriterion("Outid not like", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidIn(List<String> values) {
            addCriterion("Outid in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotIn(List<String> values) {
            addCriterion("Outid not in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidBetween(String value1, String value2) {
            addCriterion("Outid between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotBetween(String value1, String value2) {
            addCriterion("Outid not between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("Bankname is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("Bankname is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("Bankname =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("Bankname <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("Bankname >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("Bankname >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("Bankname <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("Bankname <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("Bankname like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("Bankname not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("Bankname in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("Bankname not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("Bankname between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("Bankname not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNull() {
            addCriterion("bankno is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("bankno is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("bankno =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("bankno <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("bankno >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("bankno >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("bankno <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("bankno <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("bankno like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("bankno not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("bankno in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("bankno not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("bankno between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("bankno not between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("Money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("Money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("Money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("Money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("Money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("Money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("Money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("Money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Money not between", value1, value2, "money");
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

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andOutidtimeIsNull() {
            addCriterion("outidtime is null");
            return (Criteria) this;
        }

        public Criteria andOutidtimeIsNotNull() {
            addCriterion("outidtime is not null");
            return (Criteria) this;
        }

        public Criteria andOutidtimeEqualTo(String value) {
            addCriterion("outidtime =", value, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeNotEqualTo(String value) {
            addCriterion("outidtime <>", value, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeGreaterThan(String value) {
            addCriterion("outidtime >", value, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeGreaterThanOrEqualTo(String value) {
            addCriterion("outidtime >=", value, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeLessThan(String value) {
            addCriterion("outidtime <", value, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeLessThanOrEqualTo(String value) {
            addCriterion("outidtime <=", value, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeLike(String value) {
            addCriterion("outidtime like", value, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeNotLike(String value) {
            addCriterion("outidtime not like", value, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeIn(List<String> values) {
            addCriterion("outidtime in", values, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeNotIn(List<String> values) {
            addCriterion("outidtime not in", values, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeBetween(String value1, String value2) {
            addCriterion("outidtime between", value1, value2, "outidtime");
            return (Criteria) this;
        }

        public Criteria andOutidtimeNotBetween(String value1, String value2) {
            addCriterion("outidtime not between", value1, value2, "outidtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOutbillidIsNull() {
            addCriterion("outbillid is null");
            return (Criteria) this;
        }

        public Criteria andOutbillidIsNotNull() {
            addCriterion("outbillid is not null");
            return (Criteria) this;
        }

        public Criteria andOutbillidEqualTo(String value) {
            addCriterion("outbillid =", value, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidNotEqualTo(String value) {
            addCriterion("outbillid <>", value, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidGreaterThan(String value) {
            addCriterion("outbillid >", value, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidGreaterThanOrEqualTo(String value) {
            addCriterion("outbillid >=", value, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidLessThan(String value) {
            addCriterion("outbillid <", value, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidLessThanOrEqualTo(String value) {
            addCriterion("outbillid <=", value, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidLike(String value) {
            addCriterion("outbillid like", value, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidNotLike(String value) {
            addCriterion("outbillid not like", value, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidIn(List<String> values) {
            addCriterion("outbillid in", values, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidNotIn(List<String> values) {
            addCriterion("outbillid not in", values, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidBetween(String value1, String value2) {
            addCriterion("outbillid between", value1, value2, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOutbillidNotBetween(String value1, String value2) {
            addCriterion("outbillid not between", value1, value2, "outbillid");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("operatorid is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("operatorid is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(String value) {
            addCriterion("operatorid =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(String value) {
            addCriterion("operatorid <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(String value) {
            addCriterion("operatorid >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(String value) {
            addCriterion("operatorid >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(String value) {
            addCriterion("operatorid <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(String value) {
            addCriterion("operatorid <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLike(String value) {
            addCriterion("operatorid like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotLike(String value) {
            addCriterion("operatorid not like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<String> values) {
            addCriterion("operatorid in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<String> values) {
            addCriterion("operatorid not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(String value1, String value2) {
            addCriterion("operatorid between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(String value1, String value2) {
            addCriterion("operatorid not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(String value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(String value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(String value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(String value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(String value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLike(String value) {
            addCriterion("paytime like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotLike(String value) {
            addCriterion("paytime not like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<String> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<String> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(String value1, String value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(String value1, String value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPayaccountIsNull() {
            addCriterion("Payaccount is null");
            return (Criteria) this;
        }

        public Criteria andPayaccountIsNotNull() {
            addCriterion("Payaccount is not null");
            return (Criteria) this;
        }

        public Criteria andPayaccountEqualTo(String value) {
            addCriterion("Payaccount =", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotEqualTo(String value) {
            addCriterion("Payaccount <>", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountGreaterThan(String value) {
            addCriterion("Payaccount >", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountGreaterThanOrEqualTo(String value) {
            addCriterion("Payaccount >=", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLessThan(String value) {
            addCriterion("Payaccount <", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLessThanOrEqualTo(String value) {
            addCriterion("Payaccount <=", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLike(String value) {
            addCriterion("Payaccount like", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotLike(String value) {
            addCriterion("Payaccount not like", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountIn(List<String> values) {
            addCriterion("Payaccount in", values, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotIn(List<String> values) {
            addCriterion("Payaccount not in", values, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountBetween(String value1, String value2) {
            addCriterion("Payaccount between", value1, value2, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotBetween(String value1, String value2) {
            addCriterion("Payaccount not between", value1, value2, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPaybankIsNull() {
            addCriterion("Paybank is null");
            return (Criteria) this;
        }

        public Criteria andPaybankIsNotNull() {
            addCriterion("Paybank is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankEqualTo(String value) {
            addCriterion("Paybank =", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotEqualTo(String value) {
            addCriterion("Paybank <>", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankGreaterThan(String value) {
            addCriterion("Paybank >", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankGreaterThanOrEqualTo(String value) {
            addCriterion("Paybank >=", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLessThan(String value) {
            addCriterion("Paybank <", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLessThanOrEqualTo(String value) {
            addCriterion("Paybank <=", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLike(String value) {
            addCriterion("Paybank like", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotLike(String value) {
            addCriterion("Paybank not like", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankIn(List<String> values) {
            addCriterion("Paybank in", values, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotIn(List<String> values) {
            addCriterion("Paybank not in", values, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankBetween(String value1, String value2) {
            addCriterion("Paybank between", value1, value2, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotBetween(String value1, String value2) {
            addCriterion("Paybank not between", value1, value2, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankidIsNull() {
            addCriterion("Paybankid is null");
            return (Criteria) this;
        }

        public Criteria andPaybankidIsNotNull() {
            addCriterion("Paybankid is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankidEqualTo(String value) {
            addCriterion("Paybankid =", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidNotEqualTo(String value) {
            addCriterion("Paybankid <>", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidGreaterThan(String value) {
            addCriterion("Paybankid >", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidGreaterThanOrEqualTo(String value) {
            addCriterion("Paybankid >=", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidLessThan(String value) {
            addCriterion("Paybankid <", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidLessThanOrEqualTo(String value) {
            addCriterion("Paybankid <=", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidLike(String value) {
            addCriterion("Paybankid like", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidNotLike(String value) {
            addCriterion("Paybankid not like", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidIn(List<String> values) {
            addCriterion("Paybankid in", values, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidNotIn(List<String> values) {
            addCriterion("Paybankid not in", values, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidBetween(String value1, String value2) {
            addCriterion("Paybankid between", value1, value2, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidNotBetween(String value1, String value2) {
            addCriterion("Paybankid not between", value1, value2, "paybankid");
            return (Criteria) this;
        }

        public Criteria andBankstatusIsNull() {
            addCriterion("bankstatus is null");
            return (Criteria) this;
        }

        public Criteria andBankstatusIsNotNull() {
            addCriterion("bankstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBankstatusEqualTo(String value) {
            addCriterion("bankstatus =", value, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusNotEqualTo(String value) {
            addCriterion("bankstatus <>", value, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusGreaterThan(String value) {
            addCriterion("bankstatus >", value, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusGreaterThanOrEqualTo(String value) {
            addCriterion("bankstatus >=", value, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusLessThan(String value) {
            addCriterion("bankstatus <", value, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusLessThanOrEqualTo(String value) {
            addCriterion("bankstatus <=", value, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusLike(String value) {
            addCriterion("bankstatus like", value, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusNotLike(String value) {
            addCriterion("bankstatus not like", value, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusIn(List<String> values) {
            addCriterion("bankstatus in", values, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusNotIn(List<String> values) {
            addCriterion("bankstatus not in", values, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusBetween(String value1, String value2) {
            addCriterion("bankstatus between", value1, value2, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankstatusNotBetween(String value1, String value2) {
            addCriterion("bankstatus not between", value1, value2, "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeIsNull() {
            addCriterion("bankpaytime is null");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeIsNotNull() {
            addCriterion("bankpaytime is not null");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeEqualTo(String value) {
            addCriterion("bankpaytime =", value, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeNotEqualTo(String value) {
            addCriterion("bankpaytime <>", value, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeGreaterThan(String value) {
            addCriterion("bankpaytime >", value, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("bankpaytime >=", value, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeLessThan(String value) {
            addCriterion("bankpaytime <", value, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeLessThanOrEqualTo(String value) {
            addCriterion("bankpaytime <=", value, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeLike(String value) {
            addCriterion("bankpaytime like", value, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeNotLike(String value) {
            addCriterion("bankpaytime not like", value, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeIn(List<String> values) {
            addCriterion("bankpaytime in", values, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeNotIn(List<String> values) {
            addCriterion("bankpaytime not in", values, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeBetween(String value1, String value2) {
            addCriterion("bankpaytime between", value1, value2, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeNotBetween(String value1, String value2) {
            addCriterion("bankpaytime not between", value1, value2, "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andOutidLikeInsensitive(String value) {
            addCriterion("upper(Outid) like", value.toUpperCase(), "outid");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(TYPE) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andBanknameLikeInsensitive(String value) {
            addCriterion("upper(Bankname) like", value.toUpperCase(), "bankname");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andBanknoLikeInsensitive(String value) {
            addCriterion("upper(bankno) like", value.toUpperCase(), "bankno");
            return (Criteria) this;
        }

        public Criteria andProvinceLikeInsensitive(String value) {
            addCriterion("upper(province) like", value.toUpperCase(), "province");
            return (Criteria) this;
        }

        public Criteria andCityLikeInsensitive(String value) {
            addCriterion("upper(city) like", value.toUpperCase(), "city");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andOutidtimeLikeInsensitive(String value) {
            addCriterion("upper(outidtime) like", value.toUpperCase(), "outidtime");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andOutbillidLikeInsensitive(String value) {
            addCriterion("upper(outbillid) like", value.toUpperCase(), "outbillid");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(operator) like", value.toUpperCase(), "operator");
            return (Criteria) this;
        }

        public Criteria andOperatoridLikeInsensitive(String value) {
            addCriterion("upper(operatorid) like", value.toUpperCase(), "operatorid");
            return (Criteria) this;
        }

        public Criteria andPaytimeLikeInsensitive(String value) {
            addCriterion("upper(paytime) like", value.toUpperCase(), "paytime");
            return (Criteria) this;
        }

        public Criteria andPayaccountLikeInsensitive(String value) {
            addCriterion("upper(Payaccount) like", value.toUpperCase(), "payaccount");
            return (Criteria) this;
        }

        public Criteria andPaybankLikeInsensitive(String value) {
            addCriterion("upper(Paybank) like", value.toUpperCase(), "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankidLikeInsensitive(String value) {
            addCriterion("upper(Paybankid) like", value.toUpperCase(), "paybankid");
            return (Criteria) this;
        }

        public Criteria andBankstatusLikeInsensitive(String value) {
            addCriterion("upper(bankstatus) like", value.toUpperCase(), "bankstatus");
            return (Criteria) this;
        }

        public Criteria andBankpaytimeLikeInsensitive(String value) {
            addCriterion("upper(bankpaytime) like", value.toUpperCase(), "bankpaytime");
            return (Criteria) this;
        }

        public Criteria andMessageLikeInsensitive(String value) {
            addCriterion("upper(message) like", value.toUpperCase(), "message");
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