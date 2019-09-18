package com.yycoin.vo.sms;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TMessageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TMessageInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andStafferidIsNull() {
            addCriterion("stafferid is null");
            return (Criteria) this;
        }

        public Criteria andStafferidIsNotNull() {
            addCriterion("stafferid is not null");
            return (Criteria) this;
        }

        public Criteria andStafferidEqualTo(Integer value) {
            addCriterion("stafferid =", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidNotEqualTo(Integer value) {
            addCriterion("stafferid <>", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidGreaterThan(Integer value) {
            addCriterion("stafferid >", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stafferid >=", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidLessThan(Integer value) {
            addCriterion("stafferid <", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidLessThanOrEqualTo(Integer value) {
            addCriterion("stafferid <=", value, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidIn(List<Integer> values) {
            addCriterion("stafferid in", values, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidNotIn(List<Integer> values) {
            addCriterion("stafferid not in", values, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidBetween(Integer value1, Integer value2) {
            addCriterion("stafferid between", value1, value2, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStafferidNotBetween(Integer value1, Integer value2) {
            addCriterion("stafferid not between", value1, value2, "stafferid");
            return (Criteria) this;
        }

        public Criteria andStaffernameIsNull() {
            addCriterion("staffername is null");
            return (Criteria) this;
        }

        public Criteria andStaffernameIsNotNull() {
            addCriterion("staffername is not null");
            return (Criteria) this;
        }

        public Criteria andStaffernameEqualTo(String value) {
            addCriterion("staffername =", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameNotEqualTo(String value) {
            addCriterion("staffername <>", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameGreaterThan(String value) {
            addCriterion("staffername >", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameGreaterThanOrEqualTo(String value) {
            addCriterion("staffername >=", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameLessThan(String value) {
            addCriterion("staffername <", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameLessThanOrEqualTo(String value) {
            addCriterion("staffername <=", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameLike(String value) {
            addCriterion("staffername like", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameNotLike(String value) {
            addCriterion("staffername not like", value, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameIn(List<String> values) {
            addCriterion("staffername in", values, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameNotIn(List<String> values) {
            addCriterion("staffername not in", values, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameBetween(String value1, String value2) {
            addCriterion("staffername between", value1, value2, "staffername");
            return (Criteria) this;
        }

        public Criteria andStaffernameNotBetween(String value1, String value2) {
            addCriterion("staffername not between", value1, value2, "staffername");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNull() {
            addCriterion("locationid is null");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNotNull() {
            addCriterion("locationid is not null");
            return (Criteria) this;
        }

        public Criteria andLocationidEqualTo(String value) {
            addCriterion("locationid =", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotEqualTo(String value) {
            addCriterion("locationid <>", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThan(String value) {
            addCriterion("locationid >", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThanOrEqualTo(String value) {
            addCriterion("locationid >=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThan(String value) {
            addCriterion("locationid <", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThanOrEqualTo(String value) {
            addCriterion("locationid <=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLike(String value) {
            addCriterion("locationid like", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotLike(String value) {
            addCriterion("locationid not like", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidIn(List<String> values) {
            addCriterion("locationid in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotIn(List<String> values) {
            addCriterion("locationid not in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidBetween(String value1, String value2) {
            addCriterion("locationid between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotBetween(String value1, String value2) {
            addCriterion("locationid not between", value1, value2, "locationid");
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

        public Criteria andBmidIsNull() {
            addCriterion("bmid is null");
            return (Criteria) this;
        }

        public Criteria andBmidIsNotNull() {
            addCriterion("bmid is not null");
            return (Criteria) this;
        }

        public Criteria andBmidEqualTo(Integer value) {
            addCriterion("bmid =", value, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidNotEqualTo(Integer value) {
            addCriterion("bmid <>", value, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidGreaterThan(Integer value) {
            addCriterion("bmid >", value, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bmid >=", value, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidLessThan(Integer value) {
            addCriterion("bmid <", value, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidLessThanOrEqualTo(Integer value) {
            addCriterion("bmid <=", value, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidIn(List<Integer> values) {
            addCriterion("bmid in", values, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidNotIn(List<Integer> values) {
            addCriterion("bmid not in", values, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidBetween(Integer value1, Integer value2) {
            addCriterion("bmid between", value1, value2, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmidNotBetween(Integer value1, Integer value2) {
            addCriterion("bmid not between", value1, value2, "bmid");
            return (Criteria) this;
        }

        public Criteria andBmnameIsNull() {
            addCriterion("bmname is null");
            return (Criteria) this;
        }

        public Criteria andBmnameIsNotNull() {
            addCriterion("bmname is not null");
            return (Criteria) this;
        }

        public Criteria andBmnameEqualTo(String value) {
            addCriterion("bmname =", value, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameNotEqualTo(String value) {
            addCriterion("bmname <>", value, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameGreaterThan(String value) {
            addCriterion("bmname >", value, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameGreaterThanOrEqualTo(String value) {
            addCriterion("bmname >=", value, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameLessThan(String value) {
            addCriterion("bmname <", value, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameLessThanOrEqualTo(String value) {
            addCriterion("bmname <=", value, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameLike(String value) {
            addCriterion("bmname like", value, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameNotLike(String value) {
            addCriterion("bmname not like", value, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameIn(List<String> values) {
            addCriterion("bmname in", values, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameNotIn(List<String> values) {
            addCriterion("bmname not in", values, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameBetween(String value1, String value2) {
            addCriterion("bmname between", value1, value2, "bmname");
            return (Criteria) this;
        }

        public Criteria andBmnameNotBetween(String value1, String value2) {
            addCriterion("bmname not between", value1, value2, "bmname");
            return (Criteria) this;
        }

        public Criteria andYwbnameIsNull() {
            addCriterion("ywbname is null");
            return (Criteria) this;
        }

        public Criteria andYwbnameIsNotNull() {
            addCriterion("ywbname is not null");
            return (Criteria) this;
        }

        public Criteria andYwbnameEqualTo(String value) {
            addCriterion("ywbname =", value, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameNotEqualTo(String value) {
            addCriterion("ywbname <>", value, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameGreaterThan(String value) {
            addCriterion("ywbname >", value, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameGreaterThanOrEqualTo(String value) {
            addCriterion("ywbname >=", value, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameLessThan(String value) {
            addCriterion("ywbname <", value, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameLessThanOrEqualTo(String value) {
            addCriterion("ywbname <=", value, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameLike(String value) {
            addCriterion("ywbname like", value, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameNotLike(String value) {
            addCriterion("ywbname not like", value, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameIn(List<String> values) {
            addCriterion("ywbname in", values, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameNotIn(List<String> values) {
            addCriterion("ywbname not in", values, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameBetween(String value1, String value2) {
            addCriterion("ywbname between", value1, value2, "ywbname");
            return (Criteria) this;
        }

        public Criteria andYwbnameNotBetween(String value1, String value2) {
            addCriterion("ywbname not between", value1, value2, "ywbname");
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

        public Criteria andTtypeIsNull() {
            addCriterion("tType is null");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNotNull() {
            addCriterion("tType is not null");
            return (Criteria) this;
        }

        public Criteria andTtypeEqualTo(Integer value) {
            addCriterion("tType =", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotEqualTo(Integer value) {
            addCriterion("tType <>", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThan(Integer value) {
            addCriterion("tType >", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tType >=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThan(Integer value) {
            addCriterion("tType <", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThanOrEqualTo(Integer value) {
            addCriterion("tType <=", value, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeIn(List<Integer> values) {
            addCriterion("tType in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotIn(List<Integer> values) {
            addCriterion("tType not in", values, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeBetween(Integer value1, Integer value2) {
            addCriterion("tType between", value1, value2, "ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tType not between", value1, value2, "ttype");
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

        public Criteria andMlIsNull() {
            addCriterion("ml is null");
            return (Criteria) this;
        }

        public Criteria andMlIsNotNull() {
            addCriterion("ml is not null");
            return (Criteria) this;
        }

        public Criteria andMlEqualTo(Double value) {
            addCriterion("ml =", value, "ml");
            return (Criteria) this;
        }

        public Criteria andMlNotEqualTo(Double value) {
            addCriterion("ml <>", value, "ml");
            return (Criteria) this;
        }

        public Criteria andMlGreaterThan(Double value) {
            addCriterion("ml >", value, "ml");
            return (Criteria) this;
        }

        public Criteria andMlGreaterThanOrEqualTo(Double value) {
            addCriterion("ml >=", value, "ml");
            return (Criteria) this;
        }

        public Criteria andMlLessThan(Double value) {
            addCriterion("ml <", value, "ml");
            return (Criteria) this;
        }

        public Criteria andMlLessThanOrEqualTo(Double value) {
            addCriterion("ml <=", value, "ml");
            return (Criteria) this;
        }

        public Criteria andMlIn(List<Double> values) {
            addCriterion("ml in", values, "ml");
            return (Criteria) this;
        }

        public Criteria andMlNotIn(List<Double> values) {
            addCriterion("ml not in", values, "ml");
            return (Criteria) this;
        }

        public Criteria andMlBetween(Double value1, Double value2) {
            addCriterion("ml between", value1, value2, "ml");
            return (Criteria) this;
        }

        public Criteria andMlNotBetween(Double value1, Double value2) {
            addCriterion("ml not between", value1, value2, "ml");
            return (Criteria) this;
        }

        public Criteria andAvgmlIsNull() {
            addCriterion("avgml is null");
            return (Criteria) this;
        }

        public Criteria andAvgmlIsNotNull() {
            addCriterion("avgml is not null");
            return (Criteria) this;
        }

        public Criteria andAvgmlEqualTo(Double value) {
            addCriterion("avgml =", value, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlNotEqualTo(Double value) {
            addCriterion("avgml <>", value, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlGreaterThan(Double value) {
            addCriterion("avgml >", value, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlGreaterThanOrEqualTo(Double value) {
            addCriterion("avgml >=", value, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlLessThan(Double value) {
            addCriterion("avgml <", value, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlLessThanOrEqualTo(Double value) {
            addCriterion("avgml <=", value, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlIn(List<Double> values) {
            addCriterion("avgml in", values, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlNotIn(List<Double> values) {
            addCriterion("avgml not in", values, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlBetween(Double value1, Double value2) {
            addCriterion("avgml between", value1, value2, "avgml");
            return (Criteria) this;
        }

        public Criteria andAvgmlNotBetween(Double value1, Double value2) {
            addCriterion("avgml not between", value1, value2, "avgml");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbIsNull() {
            addCriterion("totalml_ywb is null");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbIsNotNull() {
            addCriterion("totalml_ywb is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbEqualTo(Double value) {
            addCriterion("totalml_ywb =", value, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbNotEqualTo(Double value) {
            addCriterion("totalml_ywb <>", value, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbGreaterThan(Double value) {
            addCriterion("totalml_ywb >", value, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbGreaterThanOrEqualTo(Double value) {
            addCriterion("totalml_ywb >=", value, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbLessThan(Double value) {
            addCriterion("totalml_ywb <", value, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbLessThanOrEqualTo(Double value) {
            addCriterion("totalml_ywb <=", value, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbIn(List<Double> values) {
            addCriterion("totalml_ywb in", values, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbNotIn(List<Double> values) {
            addCriterion("totalml_ywb not in", values, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbBetween(Double value1, Double value2) {
            addCriterion("totalml_ywb between", value1, value2, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlYwbNotBetween(Double value1, Double value2) {
            addCriterion("totalml_ywb not between", value1, value2, "totalmlYwb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybIsNull() {
            addCriterion("totalml_syb is null");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybIsNotNull() {
            addCriterion("totalml_syb is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybEqualTo(Double value) {
            addCriterion("totalml_syb =", value, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybNotEqualTo(Double value) {
            addCriterion("totalml_syb <>", value, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybGreaterThan(Double value) {
            addCriterion("totalml_syb >", value, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybGreaterThanOrEqualTo(Double value) {
            addCriterion("totalml_syb >=", value, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybLessThan(Double value) {
            addCriterion("totalml_syb <", value, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybLessThanOrEqualTo(Double value) {
            addCriterion("totalml_syb <=", value, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybIn(List<Double> values) {
            addCriterion("totalml_syb in", values, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybNotIn(List<Double> values) {
            addCriterion("totalml_syb not in", values, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybBetween(Double value1, Double value2) {
            addCriterion("totalml_syb between", value1, value2, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andTotalmlSybNotBetween(Double value1, Double value2) {
            addCriterion("totalml_syb not between", value1, value2, "totalmlSyb");
            return (Criteria) this;
        }

        public Criteria andYestnoIsNull() {
            addCriterion("yestno is null");
            return (Criteria) this;
        }

        public Criteria andYestnoIsNotNull() {
            addCriterion("yestno is not null");
            return (Criteria) this;
        }

        public Criteria andYestnoEqualTo(Integer value) {
            addCriterion("yestno =", value, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoNotEqualTo(Integer value) {
            addCriterion("yestno <>", value, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoGreaterThan(Integer value) {
            addCriterion("yestno >", value, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("yestno >=", value, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoLessThan(Integer value) {
            addCriterion("yestno <", value, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoLessThanOrEqualTo(Integer value) {
            addCriterion("yestno <=", value, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoIn(List<Integer> values) {
            addCriterion("yestno in", values, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoNotIn(List<Integer> values) {
            addCriterion("yestno not in", values, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoBetween(Integer value1, Integer value2) {
            addCriterion("yestno between", value1, value2, "yestno");
            return (Criteria) this;
        }

        public Criteria andYestnoNotBetween(Integer value1, Integer value2) {
            addCriterion("yestno not between", value1, value2, "yestno");
            return (Criteria) this;
        }

        public Criteria andTodaynoIsNull() {
            addCriterion("todayno is null");
            return (Criteria) this;
        }

        public Criteria andTodaynoIsNotNull() {
            addCriterion("todayno is not null");
            return (Criteria) this;
        }

        public Criteria andTodaynoEqualTo(Integer value) {
            addCriterion("todayno =", value, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoNotEqualTo(Integer value) {
            addCriterion("todayno <>", value, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoGreaterThan(Integer value) {
            addCriterion("todayno >", value, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoGreaterThanOrEqualTo(Integer value) {
            addCriterion("todayno >=", value, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoLessThan(Integer value) {
            addCriterion("todayno <", value, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoLessThanOrEqualTo(Integer value) {
            addCriterion("todayno <=", value, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoIn(List<Integer> values) {
            addCriterion("todayno in", values, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoNotIn(List<Integer> values) {
            addCriterion("todayno not in", values, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoBetween(Integer value1, Integer value2) {
            addCriterion("todayno between", value1, value2, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodaynoNotBetween(Integer value1, Integer value2) {
            addCriterion("todayno not between", value1, value2, "todayno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoIsNull() {
            addCriterion("todayavgno is null");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoIsNotNull() {
            addCriterion("todayavgno is not null");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoEqualTo(Integer value) {
            addCriterion("todayavgno =", value, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoNotEqualTo(Integer value) {
            addCriterion("todayavgno <>", value, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoGreaterThan(Integer value) {
            addCriterion("todayavgno >", value, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("todayavgno >=", value, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoLessThan(Integer value) {
            addCriterion("todayavgno <", value, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoLessThanOrEqualTo(Integer value) {
            addCriterion("todayavgno <=", value, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoIn(List<Integer> values) {
            addCriterion("todayavgno in", values, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoNotIn(List<Integer> values) {
            addCriterion("todayavgno not in", values, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoBetween(Integer value1, Integer value2) {
            addCriterion("todayavgno between", value1, value2, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoNotBetween(Integer value1, Integer value2) {
            addCriterion("todayavgno not between", value1, value2, "todayavgno");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybIsNull() {
            addCriterion("todayno_syb is null");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybIsNotNull() {
            addCriterion("todayno_syb is not null");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybEqualTo(Integer value) {
            addCriterion("todayno_syb =", value, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybNotEqualTo(Integer value) {
            addCriterion("todayno_syb <>", value, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybGreaterThan(Integer value) {
            addCriterion("todayno_syb >", value, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybGreaterThanOrEqualTo(Integer value) {
            addCriterion("todayno_syb >=", value, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybLessThan(Integer value) {
            addCriterion("todayno_syb <", value, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybLessThanOrEqualTo(Integer value) {
            addCriterion("todayno_syb <=", value, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybIn(List<Integer> values) {
            addCriterion("todayno_syb in", values, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybNotIn(List<Integer> values) {
            addCriterion("todayno_syb not in", values, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybBetween(Integer value1, Integer value2) {
            addCriterion("todayno_syb between", value1, value2, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodaynoSybNotBetween(Integer value1, Integer value2) {
            addCriterion("todayno_syb not between", value1, value2, "todaynoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybIsNull() {
            addCriterion("todayavgno_syb is null");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybIsNotNull() {
            addCriterion("todayavgno_syb is not null");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybEqualTo(Integer value) {
            addCriterion("todayavgno_syb =", value, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybNotEqualTo(Integer value) {
            addCriterion("todayavgno_syb <>", value, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybGreaterThan(Integer value) {
            addCriterion("todayavgno_syb >", value, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybGreaterThanOrEqualTo(Integer value) {
            addCriterion("todayavgno_syb >=", value, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybLessThan(Integer value) {
            addCriterion("todayavgno_syb <", value, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybLessThanOrEqualTo(Integer value) {
            addCriterion("todayavgno_syb <=", value, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybIn(List<Integer> values) {
            addCriterion("todayavgno_syb in", values, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybNotIn(List<Integer> values) {
            addCriterion("todayavgno_syb not in", values, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybBetween(Integer value1, Integer value2) {
            addCriterion("todayavgno_syb between", value1, value2, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andTodayavgnoSybNotBetween(Integer value1, Integer value2) {
            addCriterion("todayavgno_syb not between", value1, value2, "todayavgnoSyb");
            return (Criteria) this;
        }

        public Criteria andNotxtIsNull() {
            addCriterion("notxt is null");
            return (Criteria) this;
        }

        public Criteria andNotxtIsNotNull() {
            addCriterion("notxt is not null");
            return (Criteria) this;
        }

        public Criteria andNotxtEqualTo(String value) {
            addCriterion("notxt =", value, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtNotEqualTo(String value) {
            addCriterion("notxt <>", value, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtGreaterThan(String value) {
            addCriterion("notxt >", value, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtGreaterThanOrEqualTo(String value) {
            addCriterion("notxt >=", value, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtLessThan(String value) {
            addCriterion("notxt <", value, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtLessThanOrEqualTo(String value) {
            addCriterion("notxt <=", value, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtLike(String value) {
            addCriterion("notxt like", value, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtNotLike(String value) {
            addCriterion("notxt not like", value, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtIn(List<String> values) {
            addCriterion("notxt in", values, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtNotIn(List<String> values) {
            addCriterion("notxt not in", values, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtBetween(String value1, String value2) {
            addCriterion("notxt between", value1, value2, "notxt");
            return (Criteria) this;
        }

        public Criteria andNotxtNotBetween(String value1, String value2) {
            addCriterion("notxt not between", value1, value2, "notxt");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNull() {
            addCriterion("logdate is null");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNotNull() {
            addCriterion("logdate is not null");
            return (Criteria) this;
        }

        public Criteria andLogdateEqualTo(Date value) {
            addCriterionForJDBCDate("logdate =", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("logdate <>", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThan(Date value) {
            addCriterionForJDBCDate("logdate >", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("logdate >=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThan(Date value) {
            addCriterionForJDBCDate("logdate <", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("logdate <=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateIn(List<Date> values) {
            addCriterionForJDBCDate("logdate in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("logdate not in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("logdate between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("logdate not between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andSuperleaderIsNull() {
            addCriterion("superleader is null");
            return (Criteria) this;
        }

        public Criteria andSuperleaderIsNotNull() {
            addCriterion("superleader is not null");
            return (Criteria) this;
        }

        public Criteria andSuperleaderEqualTo(String value) {
            addCriterion("superleader =", value, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderNotEqualTo(String value) {
            addCriterion("superleader <>", value, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderGreaterThan(String value) {
            addCriterion("superleader >", value, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderGreaterThanOrEqualTo(String value) {
            addCriterion("superleader >=", value, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderLessThan(String value) {
            addCriterion("superleader <", value, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderLessThanOrEqualTo(String value) {
            addCriterion("superleader <=", value, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderLike(String value) {
            addCriterion("superleader like", value, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderNotLike(String value) {
            addCriterion("superleader not like", value, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderIn(List<String> values) {
            addCriterion("superleader in", values, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderNotIn(List<String> values) {
            addCriterion("superleader not in", values, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderBetween(String value1, String value2) {
            addCriterion("superleader between", value1, value2, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperleaderNotBetween(String value1, String value2) {
            addCriterion("superleader not between", value1, value2, "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidIsNull() {
            addCriterion("superlocationid is null");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidIsNotNull() {
            addCriterion("superlocationid is not null");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidEqualTo(String value) {
            addCriterion("superlocationid =", value, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidNotEqualTo(String value) {
            addCriterion("superlocationid <>", value, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidGreaterThan(String value) {
            addCriterion("superlocationid >", value, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidGreaterThanOrEqualTo(String value) {
            addCriterion("superlocationid >=", value, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidLessThan(String value) {
            addCriterion("superlocationid <", value, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidLessThanOrEqualTo(String value) {
            addCriterion("superlocationid <=", value, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidLike(String value) {
            addCriterion("superlocationid like", value, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidNotLike(String value) {
            addCriterion("superlocationid not like", value, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidIn(List<String> values) {
            addCriterion("superlocationid in", values, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidNotIn(List<String> values) {
            addCriterion("superlocationid not in", values, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidBetween(String value1, String value2) {
            addCriterion("superlocationid between", value1, value2, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidNotBetween(String value1, String value2) {
            addCriterion("superlocationid not between", value1, value2, "superlocationid");
            return (Criteria) this;
        }

        public Criteria andMlmbIsNull() {
            addCriterion("mlmb is null");
            return (Criteria) this;
        }

        public Criteria andMlmbIsNotNull() {
            addCriterion("mlmb is not null");
            return (Criteria) this;
        }

        public Criteria andMlmbEqualTo(Double value) {
            addCriterion("mlmb =", value, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbNotEqualTo(Double value) {
            addCriterion("mlmb <>", value, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbGreaterThan(Double value) {
            addCriterion("mlmb >", value, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbGreaterThanOrEqualTo(Double value) {
            addCriterion("mlmb >=", value, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbLessThan(Double value) {
            addCriterion("mlmb <", value, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbLessThanOrEqualTo(Double value) {
            addCriterion("mlmb <=", value, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbIn(List<Double> values) {
            addCriterion("mlmb in", values, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbNotIn(List<Double> values) {
            addCriterion("mlmb not in", values, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbBetween(Double value1, Double value2) {
            addCriterion("mlmb between", value1, value2, "mlmb");
            return (Criteria) this;
        }

        public Criteria andMlmbNotBetween(Double value1, Double value2) {
            addCriterion("mlmb not between", value1, value2, "mlmb");
            return (Criteria) this;
        }

        public Criteria andSymlIsNull() {
            addCriterion("syml is null");
            return (Criteria) this;
        }

        public Criteria andSymlIsNotNull() {
            addCriterion("syml is not null");
            return (Criteria) this;
        }

        public Criteria andSymlEqualTo(Double value) {
            addCriterion("syml =", value, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlNotEqualTo(Double value) {
            addCriterion("syml <>", value, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlGreaterThan(Double value) {
            addCriterion("syml >", value, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlGreaterThanOrEqualTo(Double value) {
            addCriterion("syml >=", value, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlLessThan(Double value) {
            addCriterion("syml <", value, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlLessThanOrEqualTo(Double value) {
            addCriterion("syml <=", value, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlIn(List<Double> values) {
            addCriterion("syml in", values, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlNotIn(List<Double> values) {
            addCriterion("syml not in", values, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlBetween(Double value1, Double value2) {
            addCriterion("syml between", value1, value2, "syml");
            return (Criteria) this;
        }

        public Criteria andSymlNotBetween(Double value1, Double value2) {
            addCriterion("syml not between", value1, value2, "syml");
            return (Criteria) this;
        }

        public Criteria andMlwclIsNull() {
            addCriterion("mlwcl is null");
            return (Criteria) this;
        }

        public Criteria andMlwclIsNotNull() {
            addCriterion("mlwcl is not null");
            return (Criteria) this;
        }

        public Criteria andMlwclEqualTo(String value) {
            addCriterion("mlwcl =", value, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclNotEqualTo(String value) {
            addCriterion("mlwcl <>", value, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclGreaterThan(String value) {
            addCriterion("mlwcl >", value, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclGreaterThanOrEqualTo(String value) {
            addCriterion("mlwcl >=", value, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclLessThan(String value) {
            addCriterion("mlwcl <", value, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclLessThanOrEqualTo(String value) {
            addCriterion("mlwcl <=", value, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclLike(String value) {
            addCriterion("mlwcl like", value, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclNotLike(String value) {
            addCriterion("mlwcl not like", value, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclIn(List<String> values) {
            addCriterion("mlwcl in", values, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclNotIn(List<String> values) {
            addCriterion("mlwcl not in", values, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclBetween(String value1, String value2) {
            addCriterion("mlwcl between", value1, value2, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andMlwclNotBetween(String value1, String value2) {
            addCriterion("mlwcl not between", value1, value2, "mlwcl");
            return (Criteria) this;
        }

        public Criteria andZfxlIsNull() {
            addCriterion("zfxl is null");
            return (Criteria) this;
        }

        public Criteria andZfxlIsNotNull() {
            addCriterion("zfxl is not null");
            return (Criteria) this;
        }

        public Criteria andZfxlEqualTo(Integer value) {
            addCriterion("zfxl =", value, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlNotEqualTo(Integer value) {
            addCriterion("zfxl <>", value, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlGreaterThan(Integer value) {
            addCriterion("zfxl >", value, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlGreaterThanOrEqualTo(Integer value) {
            addCriterion("zfxl >=", value, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlLessThan(Integer value) {
            addCriterion("zfxl <", value, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlLessThanOrEqualTo(Integer value) {
            addCriterion("zfxl <=", value, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlIn(List<Integer> values) {
            addCriterion("zfxl in", values, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlNotIn(List<Integer> values) {
            addCriterion("zfxl not in", values, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlBetween(Integer value1, Integer value2) {
            addCriterion("zfxl between", value1, value2, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlNotBetween(Integer value1, Integer value2) {
            addCriterion("zfxl not between", value1, value2, "zfxl");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbIsNull() {
            addCriterion("zfxl_ywb is null");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbIsNotNull() {
            addCriterion("zfxl_ywb is not null");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbEqualTo(Integer value) {
            addCriterion("zfxl_ywb =", value, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbNotEqualTo(Integer value) {
            addCriterion("zfxl_ywb <>", value, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbGreaterThan(Integer value) {
            addCriterion("zfxl_ywb >", value, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbGreaterThanOrEqualTo(Integer value) {
            addCriterion("zfxl_ywb >=", value, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbLessThan(Integer value) {
            addCriterion("zfxl_ywb <", value, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbLessThanOrEqualTo(Integer value) {
            addCriterion("zfxl_ywb <=", value, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbIn(List<Integer> values) {
            addCriterion("zfxl_ywb in", values, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbNotIn(List<Integer> values) {
            addCriterion("zfxl_ywb not in", values, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbBetween(Integer value1, Integer value2) {
            addCriterion("zfxl_ywb between", value1, value2, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andZfxlYwbNotBetween(Integer value1, Integer value2) {
            addCriterion("zfxl_ywb not between", value1, value2, "zfxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlIsNull() {
            addCriterion("syhxl is null");
            return (Criteria) this;
        }

        public Criteria andSyhxlIsNotNull() {
            addCriterion("syhxl is not null");
            return (Criteria) this;
        }

        public Criteria andSyhxlEqualTo(Integer value) {
            addCriterion("syhxl =", value, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlNotEqualTo(Integer value) {
            addCriterion("syhxl <>", value, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlGreaterThan(Integer value) {
            addCriterion("syhxl >", value, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlGreaterThanOrEqualTo(Integer value) {
            addCriterion("syhxl >=", value, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlLessThan(Integer value) {
            addCriterion("syhxl <", value, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlLessThanOrEqualTo(Integer value) {
            addCriterion("syhxl <=", value, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlIn(List<Integer> values) {
            addCriterion("syhxl in", values, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlNotIn(List<Integer> values) {
            addCriterion("syhxl not in", values, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlBetween(Integer value1, Integer value2) {
            addCriterion("syhxl between", value1, value2, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlNotBetween(Integer value1, Integer value2) {
            addCriterion("syhxl not between", value1, value2, "syhxl");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbIsNull() {
            addCriterion("syhxl_ywb is null");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbIsNotNull() {
            addCriterion("syhxl_ywb is not null");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbEqualTo(Integer value) {
            addCriterion("syhxl_ywb =", value, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbNotEqualTo(Integer value) {
            addCriterion("syhxl_ywb <>", value, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbGreaterThan(Integer value) {
            addCriterion("syhxl_ywb >", value, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbGreaterThanOrEqualTo(Integer value) {
            addCriterion("syhxl_ywb >=", value, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbLessThan(Integer value) {
            addCriterion("syhxl_ywb <", value, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbLessThanOrEqualTo(Integer value) {
            addCriterion("syhxl_ywb <=", value, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbIn(List<Integer> values) {
            addCriterion("syhxl_ywb in", values, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbNotIn(List<Integer> values) {
            addCriterion("syhxl_ywb not in", values, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbBetween(Integer value1, Integer value2) {
            addCriterion("syhxl_ywb between", value1, value2, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhxlYwbNotBetween(Integer value1, Integer value2) {
            addCriterion("syhxl_ywb not between", value1, value2, "syhxlYwb");
            return (Criteria) this;
        }

        public Criteria andSyhmbIsNull() {
            addCriterion("syhmb is null");
            return (Criteria) this;
        }

        public Criteria andSyhmbIsNotNull() {
            addCriterion("syhmb is not null");
            return (Criteria) this;
        }

        public Criteria andSyhmbEqualTo(Integer value) {
            addCriterion("syhmb =", value, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbNotEqualTo(Integer value) {
            addCriterion("syhmb <>", value, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbGreaterThan(Integer value) {
            addCriterion("syhmb >", value, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbGreaterThanOrEqualTo(Integer value) {
            addCriterion("syhmb >=", value, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbLessThan(Integer value) {
            addCriterion("syhmb <", value, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbLessThanOrEqualTo(Integer value) {
            addCriterion("syhmb <=", value, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbIn(List<Integer> values) {
            addCriterion("syhmb in", values, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbNotIn(List<Integer> values) {
            addCriterion("syhmb not in", values, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbBetween(Integer value1, Integer value2) {
            addCriterion("syhmb between", value1, value2, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhmbNotBetween(Integer value1, Integer value2) {
            addCriterion("syhmb not between", value1, value2, "syhmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbIsNull() {
            addCriterion("syhwcmb is null");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbIsNotNull() {
            addCriterion("syhwcmb is not null");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbEqualTo(String value) {
            addCriterion("syhwcmb =", value, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbNotEqualTo(String value) {
            addCriterion("syhwcmb <>", value, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbGreaterThan(String value) {
            addCriterion("syhwcmb >", value, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbGreaterThanOrEqualTo(String value) {
            addCriterion("syhwcmb >=", value, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbLessThan(String value) {
            addCriterion("syhwcmb <", value, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbLessThanOrEqualTo(String value) {
            addCriterion("syhwcmb <=", value, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbLike(String value) {
            addCriterion("syhwcmb like", value, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbNotLike(String value) {
            addCriterion("syhwcmb not like", value, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbIn(List<String> values) {
            addCriterion("syhwcmb in", values, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbNotIn(List<String> values) {
            addCriterion("syhwcmb not in", values, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbBetween(String value1, String value2) {
            addCriterion("syhwcmb between", value1, value2, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbNotBetween(String value1, String value2) {
            addCriterion("syhwcmb not between", value1, value2, "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andDqnameIsNull() {
            addCriterion("dqname is null");
            return (Criteria) this;
        }

        public Criteria andDqnameIsNotNull() {
            addCriterion("dqname is not null");
            return (Criteria) this;
        }

        public Criteria andDqnameEqualTo(String value) {
            addCriterion("dqname =", value, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameNotEqualTo(String value) {
            addCriterion("dqname <>", value, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameGreaterThan(String value) {
            addCriterion("dqname >", value, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameGreaterThanOrEqualTo(String value) {
            addCriterion("dqname >=", value, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameLessThan(String value) {
            addCriterion("dqname <", value, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameLessThanOrEqualTo(String value) {
            addCriterion("dqname <=", value, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameLike(String value) {
            addCriterion("dqname like", value, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameNotLike(String value) {
            addCriterion("dqname not like", value, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameIn(List<String> values) {
            addCriterion("dqname in", values, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameNotIn(List<String> values) {
            addCriterion("dqname not in", values, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameBetween(String value1, String value2) {
            addCriterion("dqname between", value1, value2, "dqname");
            return (Criteria) this;
        }

        public Criteria andDqnameNotBetween(String value1, String value2) {
            addCriterion("dqname not between", value1, value2, "dqname");
            return (Criteria) this;
        }

        public Criteria andStaffernameLikeInsensitive(String value) {
            addCriterion("upper(staffername) like", value.toUpperCase(), "staffername");
            return (Criteria) this;
        }

        public Criteria andLocationidLikeInsensitive(String value) {
            addCriterion("upper(locationid) like", value.toUpperCase(), "locationid");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andBmnameLikeInsensitive(String value) {
            addCriterion("upper(bmname) like", value.toUpperCase(), "bmname");
            return (Criteria) this;
        }

        public Criteria andYwbnameLikeInsensitive(String value) {
            addCriterion("upper(ywbname) like", value.toUpperCase(), "ywbname");
            return (Criteria) this;
        }

        public Criteria andNotxtLikeInsensitive(String value) {
            addCriterion("upper(notxt) like", value.toUpperCase(), "notxt");
            return (Criteria) this;
        }

        public Criteria andSuperleaderLikeInsensitive(String value) {
            addCriterion("upper(superleader) like", value.toUpperCase(), "superleader");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidLikeInsensitive(String value) {
            addCriterion("upper(superlocationid) like", value.toUpperCase(), "superlocationid");
            return (Criteria) this;
        }

        public Criteria andMlwclLikeInsensitive(String value) {
            addCriterion("upper(mlwcl) like", value.toUpperCase(), "mlwcl");
            return (Criteria) this;
        }

        public Criteria andSyhwcmbLikeInsensitive(String value) {
            addCriterion("upper(syhwcmb) like", value.toUpperCase(), "syhwcmb");
            return (Criteria) this;
        }

        public Criteria andDqnameLikeInsensitive(String value) {
            addCriterion("upper(dqname) like", value.toUpperCase(), "dqname");
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