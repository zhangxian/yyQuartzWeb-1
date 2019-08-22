package com.yycoin.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TMessageSyhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TMessageSyhExample() {
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

        public Criteria andXlIsNull() {
            addCriterion("xl is null");
            return (Criteria) this;
        }

        public Criteria andXlIsNotNull() {
            addCriterion("xl is not null");
            return (Criteria) this;
        }

        public Criteria andXlEqualTo(Integer value) {
            addCriterion("xl =", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotEqualTo(Integer value) {
            addCriterion("xl <>", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThan(Integer value) {
            addCriterion("xl >", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThanOrEqualTo(Integer value) {
            addCriterion("xl >=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThan(Integer value) {
            addCriterion("xl <", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThanOrEqualTo(Integer value) {
            addCriterion("xl <=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIn(List<Integer> values) {
            addCriterion("xl in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotIn(List<Integer> values) {
            addCriterion("xl not in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlBetween(Integer value1, Integer value2) {
            addCriterion("xl between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotBetween(Integer value1, Integer value2) {
            addCriterion("xl not between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andMbIsNull() {
            addCriterion("mb is null");
            return (Criteria) this;
        }

        public Criteria andMbIsNotNull() {
            addCriterion("mb is not null");
            return (Criteria) this;
        }

        public Criteria andMbEqualTo(Integer value) {
            addCriterion("mb =", value, "mb");
            return (Criteria) this;
        }

        public Criteria andMbNotEqualTo(Integer value) {
            addCriterion("mb <>", value, "mb");
            return (Criteria) this;
        }

        public Criteria andMbGreaterThan(Integer value) {
            addCriterion("mb >", value, "mb");
            return (Criteria) this;
        }

        public Criteria andMbGreaterThanOrEqualTo(Integer value) {
            addCriterion("mb >=", value, "mb");
            return (Criteria) this;
        }

        public Criteria andMbLessThan(Integer value) {
            addCriterion("mb <", value, "mb");
            return (Criteria) this;
        }

        public Criteria andMbLessThanOrEqualTo(Integer value) {
            addCriterion("mb <=", value, "mb");
            return (Criteria) this;
        }

        public Criteria andMbIn(List<Integer> values) {
            addCriterion("mb in", values, "mb");
            return (Criteria) this;
        }

        public Criteria andMbNotIn(List<Integer> values) {
            addCriterion("mb not in", values, "mb");
            return (Criteria) this;
        }

        public Criteria andMbBetween(Integer value1, Integer value2) {
            addCriterion("mb between", value1, value2, "mb");
            return (Criteria) this;
        }

        public Criteria andMbNotBetween(Integer value1, Integer value2) {
            addCriterion("mb not between", value1, value2, "mb");
            return (Criteria) this;
        }

        public Criteria andWclIsNull() {
            addCriterion("wcl is null");
            return (Criteria) this;
        }

        public Criteria andWclIsNotNull() {
            addCriterion("wcl is not null");
            return (Criteria) this;
        }

        public Criteria andWclEqualTo(String value) {
            addCriterion("wcl =", value, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclNotEqualTo(String value) {
            addCriterion("wcl <>", value, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclGreaterThan(String value) {
            addCriterion("wcl >", value, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclGreaterThanOrEqualTo(String value) {
            addCriterion("wcl >=", value, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclLessThan(String value) {
            addCriterion("wcl <", value, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclLessThanOrEqualTo(String value) {
            addCriterion("wcl <=", value, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclLike(String value) {
            addCriterion("wcl like", value, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclNotLike(String value) {
            addCriterion("wcl not like", value, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclIn(List<String> values) {
            addCriterion("wcl in", values, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclNotIn(List<String> values) {
            addCriterion("wcl not in", values, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclBetween(String value1, String value2) {
            addCriterion("wcl between", value1, value2, "wcl");
            return (Criteria) this;
        }

        public Criteria andWclNotBetween(String value1, String value2) {
            addCriterion("wcl not between", value1, value2, "wcl");
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

        public Criteria andWclLikeInsensitive(String value) {
            addCriterion("upper(wcl) like", value.toUpperCase(), "wcl");
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

        public Criteria andDqnameLikeInsensitive(String value) {
            addCriterion("upper(dqname) like", value.toUpperCase(), "dqname");
            return (Criteria) this;
        }

        public Criteria andSuperlocationidLikeInsensitive(String value) {
            addCriterion("upper(superlocationid) like", value.toUpperCase(), "superlocationid");
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