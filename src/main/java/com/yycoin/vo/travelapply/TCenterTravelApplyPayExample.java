package com.yycoin.vo.travelapply;

import java.util.ArrayList;
import java.util.List;

public class TCenterTravelApplyPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterTravelApplyPayExample() {
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

        public Criteria andReceivetypeIsNull() {
            addCriterion("receiveType is null");
            return (Criteria) this;
        }

        public Criteria andReceivetypeIsNotNull() {
            addCriterion("receiveType is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetypeEqualTo(Integer value) {
            addCriterion("receiveType =", value, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeNotEqualTo(Integer value) {
            addCriterion("receiveType <>", value, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeGreaterThan(Integer value) {
            addCriterion("receiveType >", value, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiveType >=", value, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeLessThan(Integer value) {
            addCriterion("receiveType <", value, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeLessThanOrEqualTo(Integer value) {
            addCriterion("receiveType <=", value, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeIn(List<Integer> values) {
            addCriterion("receiveType in", values, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeNotIn(List<Integer> values) {
            addCriterion("receiveType not in", values, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeBetween(Integer value1, Integer value2) {
            addCriterion("receiveType between", value1, value2, "receivetype");
            return (Criteria) this;
        }

        public Criteria andReceivetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("receiveType not between", value1, value2, "receivetype");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("bankName is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankName is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankName =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankName <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankName >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankName >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankName <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankName <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankName like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankName not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankName in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankName not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankName between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankName not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNull() {
            addCriterion("bankNo is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("bankNo is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("bankNo =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("bankNo <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("bankNo >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("bankNo >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("bankNo <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("bankNo <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("bankNo like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("bankNo not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("bankNo in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("bankNo not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("bankNo between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("bankNo not between", value1, value2, "bankno");
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

        public Criteria andCdescriptionIsNull() {
            addCriterion("cdescription is null");
            return (Criteria) this;
        }

        public Criteria andCdescriptionIsNotNull() {
            addCriterion("cdescription is not null");
            return (Criteria) this;
        }

        public Criteria andCdescriptionEqualTo(String value) {
            addCriterion("cdescription =", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionNotEqualTo(String value) {
            addCriterion("cdescription <>", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionGreaterThan(String value) {
            addCriterion("cdescription >", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("cdescription >=", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionLessThan(String value) {
            addCriterion("cdescription <", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionLessThanOrEqualTo(String value) {
            addCriterion("cdescription <=", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionLike(String value) {
            addCriterion("cdescription like", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionNotLike(String value) {
            addCriterion("cdescription not like", value, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionIn(List<String> values) {
            addCriterion("cdescription in", values, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionNotIn(List<String> values) {
            addCriterion("cdescription not in", values, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionBetween(String value1, String value2) {
            addCriterion("cdescription between", value1, value2, "cdescription");
            return (Criteria) this;
        }

        public Criteria andCdescriptionNotBetween(String value1, String value2) {
            addCriterion("cdescription not between", value1, value2, "cdescription");
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

        public Criteria andBankprovinceIsNull() {
            addCriterion("bankprovince is null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIsNotNull() {
            addCriterion("bankprovince is not null");
            return (Criteria) this;
        }

        public Criteria andBankprovinceEqualTo(String value) {
            addCriterion("bankprovince =", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotEqualTo(String value) {
            addCriterion("bankprovince <>", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThan(String value) {
            addCriterion("bankprovince >", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("bankprovince >=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThan(String value) {
            addCriterion("bankprovince <", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLessThanOrEqualTo(String value) {
            addCriterion("bankprovince <=", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLike(String value) {
            addCriterion("bankprovince like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotLike(String value) {
            addCriterion("bankprovince not like", value, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceIn(List<String> values) {
            addCriterion("bankprovince in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotIn(List<String> values) {
            addCriterion("bankprovince not in", values, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceBetween(String value1, String value2) {
            addCriterion("bankprovince between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankprovinceNotBetween(String value1, String value2) {
            addCriterion("bankprovince not between", value1, value2, "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNull() {
            addCriterion("bankcity is null");
            return (Criteria) this;
        }

        public Criteria andBankcityIsNotNull() {
            addCriterion("bankcity is not null");
            return (Criteria) this;
        }

        public Criteria andBankcityEqualTo(String value) {
            addCriterion("bankcity =", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotEqualTo(String value) {
            addCriterion("bankcity <>", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThan(String value) {
            addCriterion("bankcity >", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityGreaterThanOrEqualTo(String value) {
            addCriterion("bankcity >=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThan(String value) {
            addCriterion("bankcity <", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLessThanOrEqualTo(String value) {
            addCriterion("bankcity <=", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityLike(String value) {
            addCriterion("bankcity like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotLike(String value) {
            addCriterion("bankcity not like", value, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityIn(List<String> values) {
            addCriterion("bankcity in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotIn(List<String> values) {
            addCriterion("bankcity not in", values, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityBetween(String value1, String value2) {
            addCriterion("bankcity between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andBankcityNotBetween(String value1, String value2) {
            addCriterion("bankcity not between", value1, value2, "bankcity");
            return (Criteria) this;
        }

        public Criteria andPayflagIsNull() {
            addCriterion("payflag is null");
            return (Criteria) this;
        }

        public Criteria andPayflagIsNotNull() {
            addCriterion("payflag is not null");
            return (Criteria) this;
        }

        public Criteria andPayflagEqualTo(String value) {
            addCriterion("payflag =", value, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagNotEqualTo(String value) {
            addCriterion("payflag <>", value, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagGreaterThan(String value) {
            addCriterion("payflag >", value, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagGreaterThanOrEqualTo(String value) {
            addCriterion("payflag >=", value, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagLessThan(String value) {
            addCriterion("payflag <", value, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagLessThanOrEqualTo(String value) {
            addCriterion("payflag <=", value, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagLike(String value) {
            addCriterion("payflag like", value, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagNotLike(String value) {
            addCriterion("payflag not like", value, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagIn(List<String> values) {
            addCriterion("payflag in", values, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagNotIn(List<String> values) {
            addCriterion("payflag not in", values, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagBetween(String value1, String value2) {
            addCriterion("payflag between", value1, value2, "payflag");
            return (Criteria) this;
        }

        public Criteria andPayflagNotBetween(String value1, String value2) {
            addCriterion("payflag not between", value1, value2, "payflag");
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

        public Criteria andBanknameLikeInsensitive(String value) {
            addCriterion("upper(bankName) like", value.toUpperCase(), "bankname");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(userName) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andBanknoLikeInsensitive(String value) {
            addCriterion("upper(bankNo) like", value.toUpperCase(), "bankno");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andCdescriptionLikeInsensitive(String value) {
            addCriterion("upper(cdescription) like", value.toUpperCase(), "cdescription");
            return (Criteria) this;
        }

        public Criteria andBankprovinceLikeInsensitive(String value) {
            addCriterion("upper(bankprovince) like", value.toUpperCase(), "bankprovince");
            return (Criteria) this;
        }

        public Criteria andBankcityLikeInsensitive(String value) {
            addCriterion("upper(bankcity) like", value.toUpperCase(), "bankcity");
            return (Criteria) this;
        }

        public Criteria andPayflagLikeInsensitive(String value) {
            addCriterion("upper(payflag) like", value.toUpperCase(), "payflag");
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