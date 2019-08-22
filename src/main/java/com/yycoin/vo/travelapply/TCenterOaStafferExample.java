package com.yycoin.vo.travelapply;

import java.util.ArrayList;
import java.util.List;

public class TCenterOaStafferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterOaStafferExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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

        public Criteria andIndustryid2IsNull() {
            addCriterion("industryId2 is null");
            return (Criteria) this;
        }

        public Criteria andIndustryid2IsNotNull() {
            addCriterion("industryId2 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryid2EqualTo(String value) {
            addCriterion("industryId2 =", value, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2NotEqualTo(String value) {
            addCriterion("industryId2 <>", value, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2GreaterThan(String value) {
            addCriterion("industryId2 >", value, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2GreaterThanOrEqualTo(String value) {
            addCriterion("industryId2 >=", value, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2LessThan(String value) {
            addCriterion("industryId2 <", value, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2LessThanOrEqualTo(String value) {
            addCriterion("industryId2 <=", value, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2Like(String value) {
            addCriterion("industryId2 like", value, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2NotLike(String value) {
            addCriterion("industryId2 not like", value, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2In(List<String> values) {
            addCriterion("industryId2 in", values, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2NotIn(List<String> values) {
            addCriterion("industryId2 not in", values, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2Between(String value1, String value2) {
            addCriterion("industryId2 between", value1, value2, "industryid2");
            return (Criteria) this;
        }

        public Criteria andIndustryid2NotBetween(String value1, String value2) {
            addCriterion("industryId2 not between", value1, value2, "industryid2");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBlackIsNull() {
            addCriterion("black is null");
            return (Criteria) this;
        }

        public Criteria andBlackIsNotNull() {
            addCriterion("black is not null");
            return (Criteria) this;
        }

        public Criteria andBlackEqualTo(Integer value) {
            addCriterion("black =", value, "black");
            return (Criteria) this;
        }

        public Criteria andBlackNotEqualTo(Integer value) {
            addCriterion("black <>", value, "black");
            return (Criteria) this;
        }

        public Criteria andBlackGreaterThan(Integer value) {
            addCriterion("black >", value, "black");
            return (Criteria) this;
        }

        public Criteria andBlackGreaterThanOrEqualTo(Integer value) {
            addCriterion("black >=", value, "black");
            return (Criteria) this;
        }

        public Criteria andBlackLessThan(Integer value) {
            addCriterion("black <", value, "black");
            return (Criteria) this;
        }

        public Criteria andBlackLessThanOrEqualTo(Integer value) {
            addCriterion("black <=", value, "black");
            return (Criteria) this;
        }

        public Criteria andBlackIn(List<Integer> values) {
            addCriterion("black in", values, "black");
            return (Criteria) this;
        }

        public Criteria andBlackNotIn(List<Integer> values) {
            addCriterion("black not in", values, "black");
            return (Criteria) this;
        }

        public Criteria andBlackBetween(Integer value1, Integer value2) {
            addCriterion("black between", value1, value2, "black");
            return (Criteria) this;
        }

        public Criteria andBlackNotBetween(Integer value1, Integer value2) {
            addCriterion("black not between", value1, value2, "black");
            return (Criteria) this;
        }

        public Criteria andGraduatedateIsNull() {
            addCriterion("graduateDate is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedateIsNotNull() {
            addCriterion("graduateDate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedateEqualTo(String value) {
            addCriterion("graduateDate =", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateNotEqualTo(String value) {
            addCriterion("graduateDate <>", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateGreaterThan(String value) {
            addCriterion("graduateDate >", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateGreaterThanOrEqualTo(String value) {
            addCriterion("graduateDate >=", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateLessThan(String value) {
            addCriterion("graduateDate <", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateLessThanOrEqualTo(String value) {
            addCriterion("graduateDate <=", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateLike(String value) {
            addCriterion("graduateDate like", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateNotLike(String value) {
            addCriterion("graduateDate not like", value, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateIn(List<String> values) {
            addCriterion("graduateDate in", values, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateNotIn(List<String> values) {
            addCriterion("graduateDate not in", values, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateBetween(String value1, String value2) {
            addCriterion("graduateDate between", value1, value2, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andGraduatedateNotBetween(String value1, String value2) {
            addCriterion("graduateDate not between", value1, value2, "graduatedate");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("specialty is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("specialty is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("specialty =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("specialty <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("specialty >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("specialty >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("specialty <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("specialty <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("specialty like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("specialty not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("specialty in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("specialty not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("specialty between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("specialty not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNull() {
            addCriterion("graduate is null");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNotNull() {
            addCriterion("graduate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateEqualTo(String value) {
            addCriterion("graduate =", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotEqualTo(String value) {
            addCriterion("graduate <>", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThan(String value) {
            addCriterion("graduate >", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThanOrEqualTo(String value) {
            addCriterion("graduate >=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThan(String value) {
            addCriterion("graduate <", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThanOrEqualTo(String value) {
            addCriterion("graduate <=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLike(String value) {
            addCriterion("graduate like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotLike(String value) {
            addCriterion("graduate not like", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateIn(List<String> values) {
            addCriterion("graduate in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotIn(List<String> values) {
            addCriterion("graduate not in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateBetween(String value1, String value2) {
            addCriterion("graduate between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotBetween(String value1, String value2) {
            addCriterion("graduate not between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNull() {
            addCriterion("graduateSchool is null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNotNull() {
            addCriterion("graduateSchool is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolEqualTo(String value) {
            addCriterion("graduateSchool =", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotEqualTo(String value) {
            addCriterion("graduateSchool <>", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThan(String value) {
            addCriterion("graduateSchool >", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduateSchool >=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThan(String value) {
            addCriterion("graduateSchool <", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("graduateSchool <=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLike(String value) {
            addCriterion("graduateSchool like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotLike(String value) {
            addCriterion("graduateSchool not like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIn(List<String> values) {
            addCriterion("graduateSchool in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotIn(List<String> values) {
            addCriterion("graduateSchool not in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolBetween(String value1, String value2) {
            addCriterion("graduateSchool between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotBetween(String value1, String value2) {
            addCriterion("graduateSchool not between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(String value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(String value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(String value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(String value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLike(String value) {
            addCriterion("departmentId like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotLike(String value) {
            addCriterion("departmentId not like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<String> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<String> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(String value1, String value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(String value1, String value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("postId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(String value) {
            addCriterion("postId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(String value) {
            addCriterion("postId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(String value) {
            addCriterion("postId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(String value) {
            addCriterion("postId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(String value) {
            addCriterion("postId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(String value) {
            addCriterion("postId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLike(String value) {
            addCriterion("postId like", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotLike(String value) {
            addCriterion("postId not like", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<String> values) {
            addCriterion("postId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<String> values) {
            addCriterion("postId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(String value1, String value2) {
            addCriterion("postId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(String value1, String value2) {
            addCriterion("postId not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidIsNull() {
            addCriterion("principalshipId is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidIsNotNull() {
            addCriterion("principalshipId is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidEqualTo(String value) {
            addCriterion("principalshipId =", value, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidNotEqualTo(String value) {
            addCriterion("principalshipId <>", value, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidGreaterThan(String value) {
            addCriterion("principalshipId >", value, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidGreaterThanOrEqualTo(String value) {
            addCriterion("principalshipId >=", value, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidLessThan(String value) {
            addCriterion("principalshipId <", value, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidLessThanOrEqualTo(String value) {
            addCriterion("principalshipId <=", value, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidLike(String value) {
            addCriterion("principalshipId like", value, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidNotLike(String value) {
            addCriterion("principalshipId not like", value, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidIn(List<String> values) {
            addCriterion("principalshipId in", values, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidNotIn(List<String> values) {
            addCriterion("principalshipId not in", values, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidBetween(String value1, String value2) {
            addCriterion("principalshipId between", value1, value2, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidNotBetween(String value1, String value2) {
            addCriterion("principalshipId not between", value1, value2, "principalshipid");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
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

        public Criteria andVisageIsNull() {
            addCriterion("visage is null");
            return (Criteria) this;
        }

        public Criteria andVisageIsNotNull() {
            addCriterion("visage is not null");
            return (Criteria) this;
        }

        public Criteria andVisageEqualTo(String value) {
            addCriterion("visage =", value, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageNotEqualTo(String value) {
            addCriterion("visage <>", value, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageGreaterThan(String value) {
            addCriterion("visage >", value, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageGreaterThanOrEqualTo(String value) {
            addCriterion("visage >=", value, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageLessThan(String value) {
            addCriterion("visage <", value, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageLessThanOrEqualTo(String value) {
            addCriterion("visage <=", value, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageLike(String value) {
            addCriterion("visage like", value, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageNotLike(String value) {
            addCriterion("visage not like", value, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageIn(List<String> values) {
            addCriterion("visage in", values, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageNotIn(List<String> values) {
            addCriterion("visage not in", values, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageBetween(String value1, String value2) {
            addCriterion("visage between", value1, value2, "visage");
            return (Criteria) this;
        }

        public Criteria andVisageNotBetween(String value1, String value2) {
            addCriterion("visage not between", value1, value2, "visage");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andHandphoneIsNull() {
            addCriterion("handphone is null");
            return (Criteria) this;
        }

        public Criteria andHandphoneIsNotNull() {
            addCriterion("handphone is not null");
            return (Criteria) this;
        }

        public Criteria andHandphoneEqualTo(String value) {
            addCriterion("handphone =", value, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneNotEqualTo(String value) {
            addCriterion("handphone <>", value, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneGreaterThan(String value) {
            addCriterion("handphone >", value, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneGreaterThanOrEqualTo(String value) {
            addCriterion("handphone >=", value, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneLessThan(String value) {
            addCriterion("handphone <", value, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneLessThanOrEqualTo(String value) {
            addCriterion("handphone <=", value, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneLike(String value) {
            addCriterion("handphone like", value, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneNotLike(String value) {
            addCriterion("handphone not like", value, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneIn(List<String> values) {
            addCriterion("handphone in", values, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneNotIn(List<String> values) {
            addCriterion("handphone not in", values, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneBetween(String value1, String value2) {
            addCriterion("handphone between", value1, value2, "handphone");
            return (Criteria) this;
        }

        public Criteria andHandphoneNotBetween(String value1, String value2) {
            addCriterion("handphone not between", value1, value2, "handphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneIsNull() {
            addCriterion("subphone is null");
            return (Criteria) this;
        }

        public Criteria andSubphoneIsNotNull() {
            addCriterion("subphone is not null");
            return (Criteria) this;
        }

        public Criteria andSubphoneEqualTo(String value) {
            addCriterion("subphone =", value, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneNotEqualTo(String value) {
            addCriterion("subphone <>", value, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneGreaterThan(String value) {
            addCriterion("subphone >", value, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneGreaterThanOrEqualTo(String value) {
            addCriterion("subphone >=", value, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneLessThan(String value) {
            addCriterion("subphone <", value, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneLessThanOrEqualTo(String value) {
            addCriterion("subphone <=", value, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneLike(String value) {
            addCriterion("subphone like", value, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneNotLike(String value) {
            addCriterion("subphone not like", value, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneIn(List<String> values) {
            addCriterion("subphone in", values, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneNotIn(List<String> values) {
            addCriterion("subphone not in", values, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneBetween(String value1, String value2) {
            addCriterion("subphone between", value1, value2, "subphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneNotBetween(String value1, String value2) {
            addCriterion("subphone not between", value1, value2, "subphone");
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

        public Criteria andPicpathIsNull() {
            addCriterion("picPath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("picPath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("picPath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("picPath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("picPath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("picPath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("picPath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("picPath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("picPath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("picPath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("picPath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("picPath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("picPath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("picPath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andIdiographIsNull() {
            addCriterion("idiograph is null");
            return (Criteria) this;
        }

        public Criteria andIdiographIsNotNull() {
            addCriterion("idiograph is not null");
            return (Criteria) this;
        }

        public Criteria andIdiographEqualTo(String value) {
            addCriterion("idiograph =", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographNotEqualTo(String value) {
            addCriterion("idiograph <>", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographGreaterThan(String value) {
            addCriterion("idiograph >", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographGreaterThanOrEqualTo(String value) {
            addCriterion("idiograph >=", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographLessThan(String value) {
            addCriterion("idiograph <", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographLessThanOrEqualTo(String value) {
            addCriterion("idiograph <=", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographLike(String value) {
            addCriterion("idiograph like", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographNotLike(String value) {
            addCriterion("idiograph not like", value, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographIn(List<String> values) {
            addCriterion("idiograph in", values, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographNotIn(List<String> values) {
            addCriterion("idiograph not in", values, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographBetween(String value1, String value2) {
            addCriterion("idiograph between", value1, value2, "idiograph");
            return (Criteria) this;
        }

        public Criteria andIdiographNotBetween(String value1, String value2) {
            addCriterion("idiograph not between", value1, value2, "idiograph");
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

        public Criteria andExamtypeIsNull() {
            addCriterion("examType is null");
            return (Criteria) this;
        }

        public Criteria andExamtypeIsNotNull() {
            addCriterion("examType is not null");
            return (Criteria) this;
        }

        public Criteria andExamtypeEqualTo(Integer value) {
            addCriterion("examType =", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotEqualTo(Integer value) {
            addCriterion("examType <>", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeGreaterThan(Integer value) {
            addCriterion("examType >", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("examType >=", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLessThan(Integer value) {
            addCriterion("examType <", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeLessThanOrEqualTo(Integer value) {
            addCriterion("examType <=", value, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeIn(List<Integer> values) {
            addCriterion("examType in", values, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotIn(List<Integer> values) {
            addCriterion("examType not in", values, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeBetween(Integer value1, Integer value2) {
            addCriterion("examType between", value1, value2, "examtype");
            return (Criteria) this;
        }

        public Criteria andExamtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("examType not between", value1, value2, "examtype");
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

        public Criteria andLeverIsNull() {
            addCriterion("lever is null");
            return (Criteria) this;
        }

        public Criteria andLeverIsNotNull() {
            addCriterion("lever is not null");
            return (Criteria) this;
        }

        public Criteria andLeverEqualTo(Integer value) {
            addCriterion("lever =", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotEqualTo(Integer value) {
            addCriterion("lever <>", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverGreaterThan(Integer value) {
            addCriterion("lever >", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverGreaterThanOrEqualTo(Integer value) {
            addCriterion("lever >=", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverLessThan(Integer value) {
            addCriterion("lever <", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverLessThanOrEqualTo(Integer value) {
            addCriterion("lever <=", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverIn(List<Integer> values) {
            addCriterion("lever in", values, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotIn(List<Integer> values) {
            addCriterion("lever not in", values, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverBetween(Integer value1, Integer value2) {
            addCriterion("lever between", value1, value2, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotBetween(Integer value1, Integer value2) {
            addCriterion("lever not between", value1, value2, "lever");
            return (Criteria) this;
        }

        public Criteria andPwkeyIsNull() {
            addCriterion("pwkey is null");
            return (Criteria) this;
        }

        public Criteria andPwkeyIsNotNull() {
            addCriterion("pwkey is not null");
            return (Criteria) this;
        }

        public Criteria andPwkeyEqualTo(String value) {
            addCriterion("pwkey =", value, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyNotEqualTo(String value) {
            addCriterion("pwkey <>", value, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyGreaterThan(String value) {
            addCriterion("pwkey >", value, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyGreaterThanOrEqualTo(String value) {
            addCriterion("pwkey >=", value, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyLessThan(String value) {
            addCriterion("pwkey <", value, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyLessThanOrEqualTo(String value) {
            addCriterion("pwkey <=", value, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyLike(String value) {
            addCriterion("pwkey like", value, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyNotLike(String value) {
            addCriterion("pwkey not like", value, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyIn(List<String> values) {
            addCriterion("pwkey in", values, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyNotIn(List<String> values) {
            addCriterion("pwkey not in", values, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyBetween(String value1, String value2) {
            addCriterion("pwkey between", value1, value2, "pwkey");
            return (Criteria) this;
        }

        public Criteria andPwkeyNotBetween(String value1, String value2) {
            addCriterion("pwkey not between", value1, value2, "pwkey");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Double value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Double value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Double value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Double value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Double value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Double value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Double> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Double> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Double value1, Double value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Double value1, Double value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andIndustryid3IsNull() {
            addCriterion("industryId3 is null");
            return (Criteria) this;
        }

        public Criteria andIndustryid3IsNotNull() {
            addCriterion("industryId3 is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryid3EqualTo(String value) {
            addCriterion("industryId3 =", value, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3NotEqualTo(String value) {
            addCriterion("industryId3 <>", value, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3GreaterThan(String value) {
            addCriterion("industryId3 >", value, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3GreaterThanOrEqualTo(String value) {
            addCriterion("industryId3 >=", value, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3LessThan(String value) {
            addCriterion("industryId3 <", value, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3LessThanOrEqualTo(String value) {
            addCriterion("industryId3 <=", value, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3Like(String value) {
            addCriterion("industryId3 like", value, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3NotLike(String value) {
            addCriterion("industryId3 not like", value, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3In(List<String> values) {
            addCriterion("industryId3 in", values, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3NotIn(List<String> values) {
            addCriterion("industryId3 not in", values, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3Between(String value1, String value2) {
            addCriterion("industryId3 between", value1, value2, "industryid3");
            return (Criteria) this;
        }

        public Criteria andIndustryid3NotBetween(String value1, String value2) {
            addCriterion("industryId3 not between", value1, value2, "industryid3");
            return (Criteria) this;
        }

        public Criteria andOtypeIsNull() {
            addCriterion("otype is null");
            return (Criteria) this;
        }

        public Criteria andOtypeIsNotNull() {
            addCriterion("otype is not null");
            return (Criteria) this;
        }

        public Criteria andOtypeEqualTo(Integer value) {
            addCriterion("otype =", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotEqualTo(Integer value) {
            addCriterion("otype <>", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeGreaterThan(Integer value) {
            addCriterion("otype >", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("otype >=", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeLessThan(Integer value) {
            addCriterion("otype <", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeLessThanOrEqualTo(Integer value) {
            addCriterion("otype <=", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeIn(List<Integer> values) {
            addCriterion("otype in", values, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotIn(List<Integer> values) {
            addCriterion("otype not in", values, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeBetween(Integer value1, Integer value2) {
            addCriterion("otype between", value1, value2, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("otype not between", value1, value2, "otype");
            return (Criteria) this;
        }

        public Criteria andZwIsNull() {
            addCriterion("zw is null");
            return (Criteria) this;
        }

        public Criteria andZwIsNotNull() {
            addCriterion("zw is not null");
            return (Criteria) this;
        }

        public Criteria andZwEqualTo(String value) {
            addCriterion("zw =", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotEqualTo(String value) {
            addCriterion("zw <>", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThan(String value) {
            addCriterion("zw >", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThanOrEqualTo(String value) {
            addCriterion("zw >=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThan(String value) {
            addCriterion("zw <", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThanOrEqualTo(String value) {
            addCriterion("zw <=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLike(String value) {
            addCriterion("zw like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotLike(String value) {
            addCriterion("zw not like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwIn(List<String> values) {
            addCriterion("zw in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotIn(List<String> values) {
            addCriterion("zw not in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwBetween(String value1, String value2) {
            addCriterion("zw between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotBetween(String value1, String value2) {
            addCriterion("zw not between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZzztIsNull() {
            addCriterion("zzzt is null");
            return (Criteria) this;
        }

        public Criteria andZzztIsNotNull() {
            addCriterion("zzzt is not null");
            return (Criteria) this;
        }

        public Criteria andZzztEqualTo(String value) {
            addCriterion("zzzt =", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztNotEqualTo(String value) {
            addCriterion("zzzt <>", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztGreaterThan(String value) {
            addCriterion("zzzt >", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztGreaterThanOrEqualTo(String value) {
            addCriterion("zzzt >=", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztLessThan(String value) {
            addCriterion("zzzt <", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztLessThanOrEqualTo(String value) {
            addCriterion("zzzt <=", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztLike(String value) {
            addCriterion("zzzt like", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztNotLike(String value) {
            addCriterion("zzzt not like", value, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztIn(List<String> values) {
            addCriterion("zzzt in", values, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztNotIn(List<String> values) {
            addCriterion("zzzt not in", values, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztBetween(String value1, String value2) {
            addCriterion("zzzt between", value1, value2, "zzzt");
            return (Criteria) this;
        }

        public Criteria andZzztNotBetween(String value1, String value2) {
            addCriterion("zzzt not between", value1, value2, "zzzt");
            return (Criteria) this;
        }

        public Criteria andLzsjIsNull() {
            addCriterion("lzsj is null");
            return (Criteria) this;
        }

        public Criteria andLzsjIsNotNull() {
            addCriterion("lzsj is not null");
            return (Criteria) this;
        }

        public Criteria andLzsjEqualTo(String value) {
            addCriterion("lzsj =", value, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjNotEqualTo(String value) {
            addCriterion("lzsj <>", value, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjGreaterThan(String value) {
            addCriterion("lzsj >", value, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjGreaterThanOrEqualTo(String value) {
            addCriterion("lzsj >=", value, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjLessThan(String value) {
            addCriterion("lzsj <", value, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjLessThanOrEqualTo(String value) {
            addCriterion("lzsj <=", value, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjLike(String value) {
            addCriterion("lzsj like", value, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjNotLike(String value) {
            addCriterion("lzsj not like", value, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjIn(List<String> values) {
            addCriterion("lzsj in", values, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjNotIn(List<String> values) {
            addCriterion("lzsj not in", values, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjBetween(String value1, String value2) {
            addCriterion("lzsj between", value1, value2, "lzsj");
            return (Criteria) this;
        }

        public Criteria andLzsjNotBetween(String value1, String value2) {
            addCriterion("lzsj not between", value1, value2, "lzsj");
            return (Criteria) this;
        }

        public Criteria andOutsjIsNull() {
            addCriterion("outsj is null");
            return (Criteria) this;
        }

        public Criteria andOutsjIsNotNull() {
            addCriterion("outsj is not null");
            return (Criteria) this;
        }

        public Criteria andOutsjEqualTo(String value) {
            addCriterion("outsj =", value, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjNotEqualTo(String value) {
            addCriterion("outsj <>", value, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjGreaterThan(String value) {
            addCriterion("outsj >", value, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjGreaterThanOrEqualTo(String value) {
            addCriterion("outsj >=", value, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjLessThan(String value) {
            addCriterion("outsj <", value, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjLessThanOrEqualTo(String value) {
            addCriterion("outsj <=", value, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjLike(String value) {
            addCriterion("outsj like", value, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjNotLike(String value) {
            addCriterion("outsj not like", value, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjIn(List<String> values) {
            addCriterion("outsj in", values, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjNotIn(List<String> values) {
            addCriterion("outsj not in", values, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjBetween(String value1, String value2) {
            addCriterion("outsj between", value1, value2, "outsj");
            return (Criteria) this;
        }

        public Criteria andOutsjNotBetween(String value1, String value2) {
            addCriterion("outsj not between", value1, value2, "outsj");
            return (Criteria) this;
        }

        public Criteria andWxnameIsNull() {
            addCriterion("wxname is null");
            return (Criteria) this;
        }

        public Criteria andWxnameIsNotNull() {
            addCriterion("wxname is not null");
            return (Criteria) this;
        }

        public Criteria andWxnameEqualTo(String value) {
            addCriterion("wxname =", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotEqualTo(String value) {
            addCriterion("wxname <>", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameGreaterThan(String value) {
            addCriterion("wxname >", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameGreaterThanOrEqualTo(String value) {
            addCriterion("wxname >=", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLessThan(String value) {
            addCriterion("wxname <", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLessThanOrEqualTo(String value) {
            addCriterion("wxname <=", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameLike(String value) {
            addCriterion("wxname like", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotLike(String value) {
            addCriterion("wxname not like", value, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameIn(List<String> values) {
            addCriterion("wxname in", values, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotIn(List<String> values) {
            addCriterion("wxname not in", values, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameBetween(String value1, String value2) {
            addCriterion("wxname between", value1, value2, "wxname");
            return (Criteria) this;
        }

        public Criteria andWxnameNotBetween(String value1, String value2) {
            addCriterion("wxname not between", value1, value2, "wxname");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderIsNull() {
            addCriterion("superiorLeader is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderIsNotNull() {
            addCriterion("superiorLeader is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderEqualTo(String value) {
            addCriterion("superiorLeader =", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderNotEqualTo(String value) {
            addCriterion("superiorLeader <>", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderGreaterThan(String value) {
            addCriterion("superiorLeader >", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderGreaterThanOrEqualTo(String value) {
            addCriterion("superiorLeader >=", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderLessThan(String value) {
            addCriterion("superiorLeader <", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderLessThanOrEqualTo(String value) {
            addCriterion("superiorLeader <=", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderLike(String value) {
            addCriterion("superiorLeader like", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderNotLike(String value) {
            addCriterion("superiorLeader not like", value, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderIn(List<String> values) {
            addCriterion("superiorLeader in", values, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderNotIn(List<String> values) {
            addCriterion("superiorLeader not in", values, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderBetween(String value1, String value2) {
            addCriterion("superiorLeader between", value1, value2, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderNotBetween(String value1, String value2) {
            addCriterion("superiorLeader not between", value1, value2, "superiorleader");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andLocationidLikeInsensitive(String value) {
            addCriterion("upper(locationId) like", value.toUpperCase(), "locationid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLikeInsensitive(String value) {
            addCriterion("upper(industryId) like", value.toUpperCase(), "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryid2LikeInsensitive(String value) {
            addCriterion("upper(industryId2) like", value.toUpperCase(), "industryid2");
            return (Criteria) this;
        }

        public Criteria andGraduatedateLikeInsensitive(String value) {
            addCriterion("upper(graduateDate) like", value.toUpperCase(), "graduatedate");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLikeInsensitive(String value) {
            addCriterion("upper(specialty) like", value.toUpperCase(), "specialty");
            return (Criteria) this;
        }

        public Criteria andGraduateLikeInsensitive(String value) {
            addCriterion("upper(graduate) like", value.toUpperCase(), "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLikeInsensitive(String value) {
            addCriterion("upper(graduateSchool) like", value.toUpperCase(), "graduateschool");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLikeInsensitive(String value) {
            addCriterion("upper(departmentId) like", value.toUpperCase(), "departmentid");
            return (Criteria) this;
        }

        public Criteria andPostidLikeInsensitive(String value) {
            addCriterion("upper(postId) like", value.toUpperCase(), "postid");
            return (Criteria) this;
        }

        public Criteria andPrincipalshipidLikeInsensitive(String value) {
            addCriterion("upper(principalshipId) like", value.toUpperCase(), "principalshipid");
            return (Criteria) this;
        }

        public Criteria andNationLikeInsensitive(String value) {
            addCriterion("upper(nation) like", value.toUpperCase(), "nation");
            return (Criteria) this;
        }

        public Criteria andCityLikeInsensitive(String value) {
            addCriterion("upper(city) like", value.toUpperCase(), "city");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andVisageLikeInsensitive(String value) {
            addCriterion("upper(visage) like", value.toUpperCase(), "visage");
            return (Criteria) this;
        }

        public Criteria andIdcardLikeInsensitive(String value) {
            addCriterion("upper(idCard) like", value.toUpperCase(), "idcard");
            return (Criteria) this;
        }

        public Criteria andBirthdayLikeInsensitive(String value) {
            addCriterion("upper(birthday) like", value.toUpperCase(), "birthday");
            return (Criteria) this;
        }

        public Criteria andHandphoneLikeInsensitive(String value) {
            addCriterion("upper(handphone) like", value.toUpperCase(), "handphone");
            return (Criteria) this;
        }

        public Criteria andSubphoneLikeInsensitive(String value) {
            addCriterion("upper(subphone) like", value.toUpperCase(), "subphone");
            return (Criteria) this;
        }

        public Criteria andLogtimeLikeInsensitive(String value) {
            addCriterion("upper(logTime) like", value.toUpperCase(), "logtime");
            return (Criteria) this;
        }

        public Criteria andPicpathLikeInsensitive(String value) {
            addCriterion("upper(picPath) like", value.toUpperCase(), "picpath");
            return (Criteria) this;
        }

        public Criteria andIdiographLikeInsensitive(String value) {
            addCriterion("upper(idiograph) like", value.toUpperCase(), "idiograph");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andPwkeyLikeInsensitive(String value) {
            addCriterion("upper(pwkey) like", value.toUpperCase(), "pwkey");
            return (Criteria) this;
        }

        public Criteria andIndustryid3LikeInsensitive(String value) {
            addCriterion("upper(industryId3) like", value.toUpperCase(), "industryid3");
            return (Criteria) this;
        }

        public Criteria andZwLikeInsensitive(String value) {
            addCriterion("upper(zw) like", value.toUpperCase(), "zw");
            return (Criteria) this;
        }

        public Criteria andZzztLikeInsensitive(String value) {
            addCriterion("upper(zzzt) like", value.toUpperCase(), "zzzt");
            return (Criteria) this;
        }

        public Criteria andLzsjLikeInsensitive(String value) {
            addCriterion("upper(lzsj) like", value.toUpperCase(), "lzsj");
            return (Criteria) this;
        }

        public Criteria andOutsjLikeInsensitive(String value) {
            addCriterion("upper(outsj) like", value.toUpperCase(), "outsj");
            return (Criteria) this;
        }

        public Criteria andWxnameLikeInsensitive(String value) {
            addCriterion("upper(wxname) like", value.toUpperCase(), "wxname");
            return (Criteria) this;
        }

        public Criteria andSuperiorleaderLikeInsensitive(String value) {
            addCriterion("upper(superiorLeader) like", value.toUpperCase(), "superiorleader");
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