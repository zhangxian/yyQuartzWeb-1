package com.yycoin.vo.bill;

import java.util.ArrayList;
import java.util.List;

public class TCenterOutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterOutExample() {
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

        public Criteria andFullidIsNull() {
            addCriterion("fullId is null");
            return (Criteria) this;
        }

        public Criteria andFullidIsNotNull() {
            addCriterion("fullId is not null");
            return (Criteria) this;
        }

        public Criteria andFullidEqualTo(String value) {
            addCriterion("fullId =", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidNotEqualTo(String value) {
            addCriterion("fullId <>", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidGreaterThan(String value) {
            addCriterion("fullId >", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidGreaterThanOrEqualTo(String value) {
            addCriterion("fullId >=", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidLessThan(String value) {
            addCriterion("fullId <", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidLessThanOrEqualTo(String value) {
            addCriterion("fullId <=", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidLike(String value) {
            addCriterion("fullId like", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidNotLike(String value) {
            addCriterion("fullId not like", value, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidIn(List<String> values) {
            addCriterion("fullId in", values, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidNotIn(List<String> values) {
            addCriterion("fullId not in", values, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidBetween(String value1, String value2) {
            addCriterion("fullId between", value1, value2, "fullid");
            return (Criteria) this;
        }

        public Criteria andFullidNotBetween(String value1, String value2) {
            addCriterion("fullId not between", value1, value2, "fullid");
            return (Criteria) this;
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

        public Criteria andFlowidIsNull() {
            addCriterion("flowId is null");
            return (Criteria) this;
        }

        public Criteria andFlowidIsNotNull() {
            addCriterion("flowId is not null");
            return (Criteria) this;
        }

        public Criteria andFlowidEqualTo(String value) {
            addCriterion("flowId =", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotEqualTo(String value) {
            addCriterion("flowId <>", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThan(String value) {
            addCriterion("flowId >", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThanOrEqualTo(String value) {
            addCriterion("flowId >=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThan(String value) {
            addCriterion("flowId <", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThanOrEqualTo(String value) {
            addCriterion("flowId <=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLike(String value) {
            addCriterion("flowId like", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotLike(String value) {
            addCriterion("flowId not like", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidIn(List<String> values) {
            addCriterion("flowId in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotIn(List<String> values) {
            addCriterion("flowId not in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidBetween(String value1, String value2) {
            addCriterion("flowId between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotBetween(String value1, String value2) {
            addCriterion("flowId not between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("outTime is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("outTime is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(String value) {
            addCriterion("outTime =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(String value) {
            addCriterion("outTime <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(String value) {
            addCriterion("outTime >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(String value) {
            addCriterion("outTime >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(String value) {
            addCriterion("outTime <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(String value) {
            addCriterion("outTime <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLike(String value) {
            addCriterion("outTime like", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotLike(String value) {
            addCriterion("outTime not like", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<String> values) {
            addCriterion("outTime in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<String> values) {
            addCriterion("outTime not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(String value1, String value2) {
            addCriterion("outTime between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(String value1, String value2) {
            addCriterion("outTime not between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andManagertimeIsNull() {
            addCriterion("managerTime is null");
            return (Criteria) this;
        }

        public Criteria andManagertimeIsNotNull() {
            addCriterion("managerTime is not null");
            return (Criteria) this;
        }

        public Criteria andManagertimeEqualTo(String value) {
            addCriterion("managerTime =", value, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeNotEqualTo(String value) {
            addCriterion("managerTime <>", value, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeGreaterThan(String value) {
            addCriterion("managerTime >", value, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeGreaterThanOrEqualTo(String value) {
            addCriterion("managerTime >=", value, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeLessThan(String value) {
            addCriterion("managerTime <", value, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeLessThanOrEqualTo(String value) {
            addCriterion("managerTime <=", value, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeLike(String value) {
            addCriterion("managerTime like", value, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeNotLike(String value) {
            addCriterion("managerTime not like", value, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeIn(List<String> values) {
            addCriterion("managerTime in", values, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeNotIn(List<String> values) {
            addCriterion("managerTime not in", values, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeBetween(String value1, String value2) {
            addCriterion("managerTime between", value1, value2, "managertime");
            return (Criteria) this;
        }

        public Criteria andManagertimeNotBetween(String value1, String value2) {
            addCriterion("managerTime not between", value1, value2, "managertime");
            return (Criteria) this;
        }

        public Criteria andOuttypeIsNull() {
            addCriterion("outType is null");
            return (Criteria) this;
        }

        public Criteria andOuttypeIsNotNull() {
            addCriterion("outType is not null");
            return (Criteria) this;
        }

        public Criteria andOuttypeEqualTo(Integer value) {
            addCriterion("outType =", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeNotEqualTo(Integer value) {
            addCriterion("outType <>", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeGreaterThan(Integer value) {
            addCriterion("outType >", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("outType >=", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeLessThan(Integer value) {
            addCriterion("outType <", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeLessThanOrEqualTo(Integer value) {
            addCriterion("outType <=", value, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeIn(List<Integer> values) {
            addCriterion("outType in", values, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeNotIn(List<Integer> values) {
            addCriterion("outType not in", values, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeBetween(Integer value1, Integer value2) {
            addCriterion("outType between", value1, value2, "outtype");
            return (Criteria) this;
        }

        public Criteria andOuttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("outType not between", value1, value2, "outtype");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNull() {
            addCriterion("locationID is null");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNotNull() {
            addCriterion("locationID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationidEqualTo(Integer value) {
            addCriterion("locationID =", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotEqualTo(Integer value) {
            addCriterion("locationID <>", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThan(Integer value) {
            addCriterion("locationID >", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationID >=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThan(Integer value) {
            addCriterion("locationID <", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThanOrEqualTo(Integer value) {
            addCriterion("locationID <=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidIn(List<Integer> values) {
            addCriterion("locationID in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotIn(List<Integer> values) {
            addCriterion("locationID not in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidBetween(Integer value1, Integer value2) {
            addCriterion("locationID between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotBetween(Integer value1, Integer value2) {
            addCriterion("locationID not between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
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

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
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

        public Criteria andHadpayIsNull() {
            addCriterion("hadPay is null");
            return (Criteria) this;
        }

        public Criteria andHadpayIsNotNull() {
            addCriterion("hadPay is not null");
            return (Criteria) this;
        }

        public Criteria andHadpayEqualTo(Double value) {
            addCriterion("hadPay =", value, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayNotEqualTo(Double value) {
            addCriterion("hadPay <>", value, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayGreaterThan(Double value) {
            addCriterion("hadPay >", value, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayGreaterThanOrEqualTo(Double value) {
            addCriterion("hadPay >=", value, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayLessThan(Double value) {
            addCriterion("hadPay <", value, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayLessThanOrEqualTo(Double value) {
            addCriterion("hadPay <=", value, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayIn(List<Double> values) {
            addCriterion("hadPay in", values, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayNotIn(List<Double> values) {
            addCriterion("hadPay not in", values, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayBetween(Double value1, Double value2) {
            addCriterion("hadPay between", value1, value2, "hadpay");
            return (Criteria) this;
        }

        public Criteria andHadpayNotBetween(Double value1, Double value2) {
            addCriterion("hadPay not between", value1, value2, "hadpay");
            return (Criteria) this;
        }

        public Criteria andBaddebtsIsNull() {
            addCriterion("badDebts is null");
            return (Criteria) this;
        }

        public Criteria andBaddebtsIsNotNull() {
            addCriterion("badDebts is not null");
            return (Criteria) this;
        }

        public Criteria andBaddebtsEqualTo(Double value) {
            addCriterion("badDebts =", value, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsNotEqualTo(Double value) {
            addCriterion("badDebts <>", value, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsGreaterThan(Double value) {
            addCriterion("badDebts >", value, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsGreaterThanOrEqualTo(Double value) {
            addCriterion("badDebts >=", value, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsLessThan(Double value) {
            addCriterion("badDebts <", value, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsLessThanOrEqualTo(Double value) {
            addCriterion("badDebts <=", value, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsIn(List<Double> values) {
            addCriterion("badDebts in", values, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsNotIn(List<Double> values) {
            addCriterion("badDebts not in", values, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsBetween(Double value1, Double value2) {
            addCriterion("badDebts between", value1, value2, "baddebts");
            return (Criteria) this;
        }

        public Criteria andBaddebtsNotBetween(Double value1, Double value2) {
            addCriterion("badDebts not between", value1, value2, "baddebts");
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

        public Criteria andHasinvoiceIsNull() {
            addCriterion("hasInvoice is null");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceIsNotNull() {
            addCriterion("hasInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceEqualTo(Integer value) {
            addCriterion("hasInvoice =", value, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceNotEqualTo(Integer value) {
            addCriterion("hasInvoice <>", value, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceGreaterThan(Integer value) {
            addCriterion("hasInvoice >", value, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasInvoice >=", value, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceLessThan(Integer value) {
            addCriterion("hasInvoice <", value, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("hasInvoice <=", value, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceIn(List<Integer> values) {
            addCriterion("hasInvoice in", values, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceNotIn(List<Integer> values) {
            addCriterion("hasInvoice not in", values, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceBetween(Integer value1, Integer value2) {
            addCriterion("hasInvoice between", value1, value2, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andHasinvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("hasInvoice not between", value1, value2, "hasinvoice");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusIsNull() {
            addCriterion("invoiceStatus is null");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusIsNotNull() {
            addCriterion("invoiceStatus is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusEqualTo(Integer value) {
            addCriterion("invoiceStatus =", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotEqualTo(Integer value) {
            addCriterion("invoiceStatus <>", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusGreaterThan(Integer value) {
            addCriterion("invoiceStatus >", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoiceStatus >=", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusLessThan(Integer value) {
            addCriterion("invoiceStatus <", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusLessThanOrEqualTo(Integer value) {
            addCriterion("invoiceStatus <=", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusIn(List<Integer> values) {
            addCriterion("invoiceStatus in", values, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotIn(List<Integer> values) {
            addCriterion("invoiceStatus not in", values, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusBetween(Integer value1, Integer value2) {
            addCriterion("invoiceStatus between", value1, value2, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("invoiceStatus not between", value1, value2, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNull() {
            addCriterion("invoiceId is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNotNull() {
            addCriterion("invoiceId is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidEqualTo(String value) {
            addCriterion("invoiceId =", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotEqualTo(String value) {
            addCriterion("invoiceId <>", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThan(String value) {
            addCriterion("invoiceId >", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceId >=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThan(String value) {
            addCriterion("invoiceId <", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThanOrEqualTo(String value) {
            addCriterion("invoiceId <=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLike(String value) {
            addCriterion("invoiceId like", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotLike(String value) {
            addCriterion("invoiceId not like", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIn(List<String> values) {
            addCriterion("invoiceId in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotIn(List<String> values) {
            addCriterion("invoiceId not in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidBetween(String value1, String value2) {
            addCriterion("invoiceId between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotBetween(String value1, String value2) {
            addCriterion("invoiceId not between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNull() {
            addCriterion("dutyId is null");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNotNull() {
            addCriterion("dutyId is not null");
            return (Criteria) this;
        }

        public Criteria andDutyidEqualTo(String value) {
            addCriterion("dutyId =", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotEqualTo(String value) {
            addCriterion("dutyId <>", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThan(String value) {
            addCriterion("dutyId >", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThanOrEqualTo(String value) {
            addCriterion("dutyId >=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThan(String value) {
            addCriterion("dutyId <", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThanOrEqualTo(String value) {
            addCriterion("dutyId <=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLike(String value) {
            addCriterion("dutyId like", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotLike(String value) {
            addCriterion("dutyId not like", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidIn(List<String> values) {
            addCriterion("dutyId in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotIn(List<String> values) {
            addCriterion("dutyId not in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidBetween(String value1, String value2) {
            addCriterion("dutyId between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotBetween(String value1, String value2) {
            addCriterion("dutyId not between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(Integer value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(Integer value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(Integer value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(Integer value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(Integer value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<Integer> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<Integer> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(Integer value1, Integer value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Integer value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Integer value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Integer value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Integer value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Integer value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Integer> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Integer> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Integer value1, Integer value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay not between", value1, value2, "pay");
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

        public Criteria andTemptypeIsNull() {
            addCriterion("tempType is null");
            return (Criteria) this;
        }

        public Criteria andTemptypeIsNotNull() {
            addCriterion("tempType is not null");
            return (Criteria) this;
        }

        public Criteria andTemptypeEqualTo(Integer value) {
            addCriterion("tempType =", value, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeNotEqualTo(Integer value) {
            addCriterion("tempType <>", value, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeGreaterThan(Integer value) {
            addCriterion("tempType >", value, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tempType >=", value, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeLessThan(Integer value) {
            addCriterion("tempType <", value, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeLessThanOrEqualTo(Integer value) {
            addCriterion("tempType <=", value, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeIn(List<Integer> values) {
            addCriterion("tempType in", values, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeNotIn(List<Integer> values) {
            addCriterion("tempType not in", values, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeBetween(Integer value1, Integer value2) {
            addCriterion("tempType between", value1, value2, "temptype");
            return (Criteria) this;
        }

        public Criteria andTemptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tempType not between", value1, value2, "temptype");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andConnectorIsNull() {
            addCriterion("connector is null");
            return (Criteria) this;
        }

        public Criteria andConnectorIsNotNull() {
            addCriterion("connector is not null");
            return (Criteria) this;
        }

        public Criteria andConnectorEqualTo(String value) {
            addCriterion("connector =", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorNotEqualTo(String value) {
            addCriterion("connector <>", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorGreaterThan(String value) {
            addCriterion("connector >", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorGreaterThanOrEqualTo(String value) {
            addCriterion("connector >=", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorLessThan(String value) {
            addCriterion("connector <", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorLessThanOrEqualTo(String value) {
            addCriterion("connector <=", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorLike(String value) {
            addCriterion("connector like", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorNotLike(String value) {
            addCriterion("connector not like", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorIn(List<String> values) {
            addCriterion("connector in", values, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorNotIn(List<String> values) {
            addCriterion("connector not in", values, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorBetween(String value1, String value2) {
            addCriterion("connector between", value1, value2, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorNotBetween(String value1, String value2) {
            addCriterion("connector not between", value1, value2, "connector");
            return (Criteria) this;
        }

        public Criteria andChecksIsNull() {
            addCriterion("checks is null");
            return (Criteria) this;
        }

        public Criteria andChecksIsNotNull() {
            addCriterion("checks is not null");
            return (Criteria) this;
        }

        public Criteria andChecksEqualTo(String value) {
            addCriterion("checks =", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksNotEqualTo(String value) {
            addCriterion("checks <>", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksGreaterThan(String value) {
            addCriterion("checks >", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksGreaterThanOrEqualTo(String value) {
            addCriterion("checks >=", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksLessThan(String value) {
            addCriterion("checks <", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksLessThanOrEqualTo(String value) {
            addCriterion("checks <=", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksLike(String value) {
            addCriterion("checks like", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksNotLike(String value) {
            addCriterion("checks not like", value, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksIn(List<String> values) {
            addCriterion("checks in", values, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksNotIn(List<String> values) {
            addCriterion("checks not in", values, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksBetween(String value1, String value2) {
            addCriterion("checks between", value1, value2, "checks");
            return (Criteria) this;
        }

        public Criteria andChecksNotBetween(String value1, String value2) {
            addCriterion("checks not between", value1, value2, "checks");
            return (Criteria) this;
        }

        public Criteria andRedayIsNull() {
            addCriterion("reday is null");
            return (Criteria) this;
        }

        public Criteria andRedayIsNotNull() {
            addCriterion("reday is not null");
            return (Criteria) this;
        }

        public Criteria andRedayEqualTo(String value) {
            addCriterion("reday =", value, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayNotEqualTo(String value) {
            addCriterion("reday <>", value, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayGreaterThan(String value) {
            addCriterion("reday >", value, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayGreaterThanOrEqualTo(String value) {
            addCriterion("reday >=", value, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayLessThan(String value) {
            addCriterion("reday <", value, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayLessThanOrEqualTo(String value) {
            addCriterion("reday <=", value, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayLike(String value) {
            addCriterion("reday like", value, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayNotLike(String value) {
            addCriterion("reday not like", value, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayIn(List<String> values) {
            addCriterion("reday in", values, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayNotIn(List<String> values) {
            addCriterion("reday not in", values, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayBetween(String value1, String value2) {
            addCriterion("reday between", value1, value2, "reday");
            return (Criteria) this;
        }

        public Criteria andRedayNotBetween(String value1, String value2) {
            addCriterion("reday not between", value1, value2, "reday");
            return (Criteria) this;
        }

        public Criteria andArrivedateIsNull() {
            addCriterion("arriveDate is null");
            return (Criteria) this;
        }

        public Criteria andArrivedateIsNotNull() {
            addCriterion("arriveDate is not null");
            return (Criteria) this;
        }

        public Criteria andArrivedateEqualTo(String value) {
            addCriterion("arriveDate =", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateNotEqualTo(String value) {
            addCriterion("arriveDate <>", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateGreaterThan(String value) {
            addCriterion("arriveDate >", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateGreaterThanOrEqualTo(String value) {
            addCriterion("arriveDate >=", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateLessThan(String value) {
            addCriterion("arriveDate <", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateLessThanOrEqualTo(String value) {
            addCriterion("arriveDate <=", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateLike(String value) {
            addCriterion("arriveDate like", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateNotLike(String value) {
            addCriterion("arriveDate not like", value, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateIn(List<String> values) {
            addCriterion("arriveDate in", values, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateNotIn(List<String> values) {
            addCriterion("arriveDate not in", values, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateBetween(String value1, String value2) {
            addCriterion("arriveDate between", value1, value2, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andArrivedateNotBetween(String value1, String value2) {
            addCriterion("arriveDate not between", value1, value2, "arrivedate");
            return (Criteria) this;
        }

        public Criteria andRedateIsNull() {
            addCriterion("redate is null");
            return (Criteria) this;
        }

        public Criteria andRedateIsNotNull() {
            addCriterion("redate is not null");
            return (Criteria) this;
        }

        public Criteria andRedateEqualTo(String value) {
            addCriterion("redate =", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotEqualTo(String value) {
            addCriterion("redate <>", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateGreaterThan(String value) {
            addCriterion("redate >", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateGreaterThanOrEqualTo(String value) {
            addCriterion("redate >=", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateLessThan(String value) {
            addCriterion("redate <", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateLessThanOrEqualTo(String value) {
            addCriterion("redate <=", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateLike(String value) {
            addCriterion("redate like", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotLike(String value) {
            addCriterion("redate not like", value, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateIn(List<String> values) {
            addCriterion("redate in", values, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotIn(List<String> values) {
            addCriterion("redate not in", values, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateBetween(String value1, String value2) {
            addCriterion("redate between", value1, value2, "redate");
            return (Criteria) this;
        }

        public Criteria andRedateNotBetween(String value1, String value2) {
            addCriterion("redate not between", value1, value2, "redate");
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

        public Criteria andDestinationidIsNull() {
            addCriterion("destinationId is null");
            return (Criteria) this;
        }

        public Criteria andDestinationidIsNotNull() {
            addCriterion("destinationId is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationidEqualTo(String value) {
            addCriterion("destinationId =", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotEqualTo(String value) {
            addCriterion("destinationId <>", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidGreaterThan(String value) {
            addCriterion("destinationId >", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidGreaterThanOrEqualTo(String value) {
            addCriterion("destinationId >=", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLessThan(String value) {
            addCriterion("destinationId <", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLessThanOrEqualTo(String value) {
            addCriterion("destinationId <=", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLike(String value) {
            addCriterion("destinationId like", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotLike(String value) {
            addCriterion("destinationId not like", value, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidIn(List<String> values) {
            addCriterion("destinationId in", values, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotIn(List<String> values) {
            addCriterion("destinationId not in", values, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidBetween(String value1, String value2) {
            addCriterion("destinationId between", value1, value2, "destinationid");
            return (Criteria) this;
        }

        public Criteria andDestinationidNotBetween(String value1, String value2) {
            addCriterion("destinationId not between", value1, value2, "destinationid");
            return (Criteria) this;
        }

        public Criteria andTrannoIsNull() {
            addCriterion("tranNo is null");
            return (Criteria) this;
        }

        public Criteria andTrannoIsNotNull() {
            addCriterion("tranNo is not null");
            return (Criteria) this;
        }

        public Criteria andTrannoEqualTo(String value) {
            addCriterion("tranNo =", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotEqualTo(String value) {
            addCriterion("tranNo <>", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoGreaterThan(String value) {
            addCriterion("tranNo >", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoGreaterThanOrEqualTo(String value) {
            addCriterion("tranNo >=", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoLessThan(String value) {
            addCriterion("tranNo <", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoLessThanOrEqualTo(String value) {
            addCriterion("tranNo <=", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoLike(String value) {
            addCriterion("tranNo like", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotLike(String value) {
            addCriterion("tranNo not like", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoIn(List<String> values) {
            addCriterion("tranNo in", values, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotIn(List<String> values) {
            addCriterion("tranNo not in", values, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoBetween(String value1, String value2) {
            addCriterion("tranNo between", value1, value2, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotBetween(String value1, String value2) {
            addCriterion("tranNo not between", value1, value2, "tranno");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidIsNull() {
            addCriterion("refOutFullId is null");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidIsNotNull() {
            addCriterion("refOutFullId is not null");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidEqualTo(String value) {
            addCriterion("refOutFullId =", value, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidNotEqualTo(String value) {
            addCriterion("refOutFullId <>", value, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidGreaterThan(String value) {
            addCriterion("refOutFullId >", value, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidGreaterThanOrEqualTo(String value) {
            addCriterion("refOutFullId >=", value, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidLessThan(String value) {
            addCriterion("refOutFullId <", value, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidLessThanOrEqualTo(String value) {
            addCriterion("refOutFullId <=", value, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidLike(String value) {
            addCriterion("refOutFullId like", value, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidNotLike(String value) {
            addCriterion("refOutFullId not like", value, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidIn(List<String> values) {
            addCriterion("refOutFullId in", values, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidNotIn(List<String> values) {
            addCriterion("refOutFullId not in", values, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidBetween(String value1, String value2) {
            addCriterion("refOutFullId between", value1, value2, "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidNotBetween(String value1, String value2) {
            addCriterion("refOutFullId not between", value1, value2, "refoutfullid");
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

        public Criteria andManageridIsNull() {
            addCriterion("managerId is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerId is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(String value) {
            addCriterion("managerId =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(String value) {
            addCriterion("managerId <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(String value) {
            addCriterion("managerId >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(String value) {
            addCriterion("managerId >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(String value) {
            addCriterion("managerId <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(String value) {
            addCriterion("managerId <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLike(String value) {
            addCriterion("managerId like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotLike(String value) {
            addCriterion("managerId not like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<String> values) {
            addCriterion("managerId in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<String> values) {
            addCriterion("managerId not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(String value1, String value2) {
            addCriterion("managerId between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(String value1, String value2) {
            addCriterion("managerId not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNull() {
            addCriterion("reserve1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("reserve1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(Integer value) {
            addCriterion("reserve1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(Integer value) {
            addCriterion("reserve1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(Integer value) {
            addCriterion("reserve1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(Integer value) {
            addCriterion("reserve1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(Integer value) {
            addCriterion("reserve1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<Integer> values) {
            addCriterion("reserve1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<Integer> values) {
            addCriterion("reserve1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(Integer value1, Integer value2) {
            addCriterion("reserve1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(Integer value1, Integer value2) {
            addCriterion("reserve1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("reserve2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("reserve2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(Integer value) {
            addCriterion("reserve2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(Integer value) {
            addCriterion("reserve2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(Integer value) {
            addCriterion("reserve2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(Integer value) {
            addCriterion("reserve2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(Integer value) {
            addCriterion("reserve2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<Integer> values) {
            addCriterion("reserve2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<Integer> values) {
            addCriterion("reserve2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(Integer value1, Integer value2) {
            addCriterion("reserve2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(Integer value1, Integer value2) {
            addCriterion("reserve2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNull() {
            addCriterion("reserve3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("reserve3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(Integer value) {
            addCriterion("reserve3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(Integer value) {
            addCriterion("reserve3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(Integer value) {
            addCriterion("reserve3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(Integer value) {
            addCriterion("reserve3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(Integer value) {
            addCriterion("reserve3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<Integer> values) {
            addCriterion("reserve3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<Integer> values) {
            addCriterion("reserve3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(Integer value1, Integer value2) {
            addCriterion("reserve3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(Integer value1, Integer value2) {
            addCriterion("reserve3 not between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNull() {
            addCriterion("reserve4 is null");
            return (Criteria) this;
        }

        public Criteria andReserve4IsNotNull() {
            addCriterion("reserve4 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve4EqualTo(String value) {
            addCriterion("reserve4 =", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotEqualTo(String value) {
            addCriterion("reserve4 <>", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThan(String value) {
            addCriterion("reserve4 >", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4GreaterThanOrEqualTo(String value) {
            addCriterion("reserve4 >=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThan(String value) {
            addCriterion("reserve4 <", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4LessThanOrEqualTo(String value) {
            addCriterion("reserve4 <=", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Like(String value) {
            addCriterion("reserve4 like", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotLike(String value) {
            addCriterion("reserve4 not like", value, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4In(List<String> values) {
            addCriterion("reserve4 in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotIn(List<String> values) {
            addCriterion("reserve4 not in", values, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4Between(String value1, String value2) {
            addCriterion("reserve4 between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve4NotBetween(String value1, String value2) {
            addCriterion("reserve4 not between", value1, value2, "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve5IsNull() {
            addCriterion("reserve5 is null");
            return (Criteria) this;
        }

        public Criteria andReserve5IsNotNull() {
            addCriterion("reserve5 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve5EqualTo(String value) {
            addCriterion("reserve5 =", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotEqualTo(String value) {
            addCriterion("reserve5 <>", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5GreaterThan(String value) {
            addCriterion("reserve5 >", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5GreaterThanOrEqualTo(String value) {
            addCriterion("reserve5 >=", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5LessThan(String value) {
            addCriterion("reserve5 <", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5LessThanOrEqualTo(String value) {
            addCriterion("reserve5 <=", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5Like(String value) {
            addCriterion("reserve5 like", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotLike(String value) {
            addCriterion("reserve5 not like", value, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5In(List<String> values) {
            addCriterion("reserve5 in", values, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotIn(List<String> values) {
            addCriterion("reserve5 not in", values, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5Between(String value1, String value2) {
            addCriterion("reserve5 between", value1, value2, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve5NotBetween(String value1, String value2) {
            addCriterion("reserve5 not between", value1, value2, "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve6IsNull() {
            addCriterion("reserve6 is null");
            return (Criteria) this;
        }

        public Criteria andReserve6IsNotNull() {
            addCriterion("reserve6 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve6EqualTo(String value) {
            addCriterion("reserve6 =", value, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6NotEqualTo(String value) {
            addCriterion("reserve6 <>", value, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6GreaterThan(String value) {
            addCriterion("reserve6 >", value, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6GreaterThanOrEqualTo(String value) {
            addCriterion("reserve6 >=", value, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6LessThan(String value) {
            addCriterion("reserve6 <", value, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6LessThanOrEqualTo(String value) {
            addCriterion("reserve6 <=", value, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6Like(String value) {
            addCriterion("reserve6 like", value, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6NotLike(String value) {
            addCriterion("reserve6 not like", value, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6In(List<String> values) {
            addCriterion("reserve6 in", values, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6NotIn(List<String> values) {
            addCriterion("reserve6 not in", values, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6Between(String value1, String value2) {
            addCriterion("reserve6 between", value1, value2, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve6NotBetween(String value1, String value2) {
            addCriterion("reserve6 not between", value1, value2, "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve7IsNull() {
            addCriterion("reserve7 is null");
            return (Criteria) this;
        }

        public Criteria andReserve7IsNotNull() {
            addCriterion("reserve7 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve7EqualTo(String value) {
            addCriterion("reserve7 =", value, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7NotEqualTo(String value) {
            addCriterion("reserve7 <>", value, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7GreaterThan(String value) {
            addCriterion("reserve7 >", value, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7GreaterThanOrEqualTo(String value) {
            addCriterion("reserve7 >=", value, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7LessThan(String value) {
            addCriterion("reserve7 <", value, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7LessThanOrEqualTo(String value) {
            addCriterion("reserve7 <=", value, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7Like(String value) {
            addCriterion("reserve7 like", value, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7NotLike(String value) {
            addCriterion("reserve7 not like", value, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7In(List<String> values) {
            addCriterion("reserve7 in", values, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7NotIn(List<String> values) {
            addCriterion("reserve7 not in", values, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7Between(String value1, String value2) {
            addCriterion("reserve7 between", value1, value2, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve7NotBetween(String value1, String value2) {
            addCriterion("reserve7 not between", value1, value2, "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve8IsNull() {
            addCriterion("reserve8 is null");
            return (Criteria) this;
        }

        public Criteria andReserve8IsNotNull() {
            addCriterion("reserve8 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve8EqualTo(String value) {
            addCriterion("reserve8 =", value, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8NotEqualTo(String value) {
            addCriterion("reserve8 <>", value, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8GreaterThan(String value) {
            addCriterion("reserve8 >", value, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8GreaterThanOrEqualTo(String value) {
            addCriterion("reserve8 >=", value, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8LessThan(String value) {
            addCriterion("reserve8 <", value, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8LessThanOrEqualTo(String value) {
            addCriterion("reserve8 <=", value, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8Like(String value) {
            addCriterion("reserve8 like", value, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8NotLike(String value) {
            addCriterion("reserve8 not like", value, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8In(List<String> values) {
            addCriterion("reserve8 in", values, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8NotIn(List<String> values) {
            addCriterion("reserve8 not in", values, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8Between(String value1, String value2) {
            addCriterion("reserve8 between", value1, value2, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve8NotBetween(String value1, String value2) {
            addCriterion("reserve8 not between", value1, value2, "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve9IsNull() {
            addCriterion("reserve9 is null");
            return (Criteria) this;
        }

        public Criteria andReserve9IsNotNull() {
            addCriterion("reserve9 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve9EqualTo(String value) {
            addCriterion("reserve9 =", value, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9NotEqualTo(String value) {
            addCriterion("reserve9 <>", value, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9GreaterThan(String value) {
            addCriterion("reserve9 >", value, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9GreaterThanOrEqualTo(String value) {
            addCriterion("reserve9 >=", value, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9LessThan(String value) {
            addCriterion("reserve9 <", value, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9LessThanOrEqualTo(String value) {
            addCriterion("reserve9 <=", value, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9Like(String value) {
            addCriterion("reserve9 like", value, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9NotLike(String value) {
            addCriterion("reserve9 not like", value, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9In(List<String> values) {
            addCriterion("reserve9 in", values, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9NotIn(List<String> values) {
            addCriterion("reserve9 not in", values, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9Between(String value1, String value2) {
            addCriterion("reserve9 between", value1, value2, "reserve9");
            return (Criteria) this;
        }

        public Criteria andReserve9NotBetween(String value1, String value2) {
            addCriterion("reserve9 not between", value1, value2, "reserve9");
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

        public Criteria andCurcreditIsNull() {
            addCriterion("curcredit is null");
            return (Criteria) this;
        }

        public Criteria andCurcreditIsNotNull() {
            addCriterion("curcredit is not null");
            return (Criteria) this;
        }

        public Criteria andCurcreditEqualTo(Double value) {
            addCriterion("curcredit =", value, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditNotEqualTo(Double value) {
            addCriterion("curcredit <>", value, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditGreaterThan(Double value) {
            addCriterion("curcredit >", value, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditGreaterThanOrEqualTo(Double value) {
            addCriterion("curcredit >=", value, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditLessThan(Double value) {
            addCriterion("curcredit <", value, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditLessThanOrEqualTo(Double value) {
            addCriterion("curcredit <=", value, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditIn(List<Double> values) {
            addCriterion("curcredit in", values, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditNotIn(List<Double> values) {
            addCriterion("curcredit not in", values, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditBetween(Double value1, Double value2) {
            addCriterion("curcredit between", value1, value2, "curcredit");
            return (Criteria) this;
        }

        public Criteria andCurcreditNotBetween(Double value1, Double value2) {
            addCriterion("curcredit not between", value1, value2, "curcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditIsNull() {
            addCriterion("staffcredit is null");
            return (Criteria) this;
        }

        public Criteria andStaffcreditIsNotNull() {
            addCriterion("staffcredit is not null");
            return (Criteria) this;
        }

        public Criteria andStaffcreditEqualTo(Double value) {
            addCriterion("staffcredit =", value, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditNotEqualTo(Double value) {
            addCriterion("staffcredit <>", value, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditGreaterThan(Double value) {
            addCriterion("staffcredit >", value, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditGreaterThanOrEqualTo(Double value) {
            addCriterion("staffcredit >=", value, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditLessThan(Double value) {
            addCriterion("staffcredit <", value, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditLessThanOrEqualTo(Double value) {
            addCriterion("staffcredit <=", value, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditIn(List<Double> values) {
            addCriterion("staffcredit in", values, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditNotIn(List<Double> values) {
            addCriterion("staffcredit not in", values, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditBetween(Double value1, Double value2) {
            addCriterion("staffcredit between", value1, value2, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andStaffcreditNotBetween(Double value1, Double value2) {
            addCriterion("staffcredit not between", value1, value2, "staffcredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditIsNull() {
            addCriterion("managercredit is null");
            return (Criteria) this;
        }

        public Criteria andManagercreditIsNotNull() {
            addCriterion("managercredit is not null");
            return (Criteria) this;
        }

        public Criteria andManagercreditEqualTo(Double value) {
            addCriterion("managercredit =", value, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditNotEqualTo(Double value) {
            addCriterion("managercredit <>", value, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditGreaterThan(Double value) {
            addCriterion("managercredit >", value, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditGreaterThanOrEqualTo(Double value) {
            addCriterion("managercredit >=", value, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditLessThan(Double value) {
            addCriterion("managercredit <", value, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditLessThanOrEqualTo(Double value) {
            addCriterion("managercredit <=", value, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditIn(List<Double> values) {
            addCriterion("managercredit in", values, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditNotIn(List<Double> values) {
            addCriterion("managercredit not in", values, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditBetween(Double value1, Double value2) {
            addCriterion("managercredit between", value1, value2, "managercredit");
            return (Criteria) this;
        }

        public Criteria andManagercreditNotBetween(Double value1, Double value2) {
            addCriterion("managercredit not between", value1, value2, "managercredit");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("checkStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(Integer value) {
            addCriterion("checkStatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(Integer value) {
            addCriterion("checkStatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(Integer value) {
            addCriterion("checkStatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkStatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(Integer value) {
            addCriterion("checkStatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(Integer value) {
            addCriterion("checkStatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<Integer> values) {
            addCriterion("checkStatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<Integer> values) {
            addCriterion("checkStatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(Integer value1, Integer value2) {
            addCriterion("checkStatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("checkStatus not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusIsNull() {
            addCriterion("badDebtsCheckStatus is null");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusIsNotNull() {
            addCriterion("badDebtsCheckStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusEqualTo(Integer value) {
            addCriterion("badDebtsCheckStatus =", value, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusNotEqualTo(Integer value) {
            addCriterion("badDebtsCheckStatus <>", value, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusGreaterThan(Integer value) {
            addCriterion("badDebtsCheckStatus >", value, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("badDebtsCheckStatus >=", value, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusLessThan(Integer value) {
            addCriterion("badDebtsCheckStatus <", value, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusLessThanOrEqualTo(Integer value) {
            addCriterion("badDebtsCheckStatus <=", value, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusIn(List<Integer> values) {
            addCriterion("badDebtsCheckStatus in", values, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusNotIn(List<Integer> values) {
            addCriterion("badDebtsCheckStatus not in", values, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusBetween(Integer value1, Integer value2) {
            addCriterion("badDebtsCheckStatus between", value1, value2, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andBaddebtscheckstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("badDebtsCheckStatus not between", value1, value2, "baddebtscheckstatus");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNull() {
            addCriterion("changeTime is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("changeTime is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(String value) {
            addCriterion("changeTime =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(String value) {
            addCriterion("changeTime <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(String value) {
            addCriterion("changeTime >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(String value) {
            addCriterion("changeTime >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(String value) {
            addCriterion("changeTime <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(String value) {
            addCriterion("changeTime <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLike(String value) {
            addCriterion("changeTime like", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotLike(String value) {
            addCriterion("changeTime not like", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<String> values) {
            addCriterion("changeTime in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<String> values) {
            addCriterion("changeTime not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(String value1, String value2) {
            addCriterion("changeTime between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(String value1, String value2) {
            addCriterion("changeTime not between", value1, value2, "changetime");
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

        public Criteria andSailtypeIsNull() {
            addCriterion("sailType is null");
            return (Criteria) this;
        }

        public Criteria andSailtypeIsNotNull() {
            addCriterion("sailType is not null");
            return (Criteria) this;
        }

        public Criteria andSailtypeEqualTo(String value) {
            addCriterion("sailType =", value, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeNotEqualTo(String value) {
            addCriterion("sailType <>", value, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeGreaterThan(String value) {
            addCriterion("sailType >", value, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeGreaterThanOrEqualTo(String value) {
            addCriterion("sailType >=", value, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeLessThan(String value) {
            addCriterion("sailType <", value, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeLessThanOrEqualTo(String value) {
            addCriterion("sailType <=", value, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeLike(String value) {
            addCriterion("sailType like", value, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeNotLike(String value) {
            addCriterion("sailType not like", value, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeIn(List<String> values) {
            addCriterion("sailType in", values, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeNotIn(List<String> values) {
            addCriterion("sailType not in", values, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeBetween(String value1, String value2) {
            addCriterion("sailType between", value1, value2, "sailtype");
            return (Criteria) this;
        }

        public Criteria andSailtypeNotBetween(String value1, String value2) {
            addCriterion("sailType not between", value1, value2, "sailtype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("productType is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("productType is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("productType =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("productType <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("productType >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("productType >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("productType <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("productType <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("productType like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("productType not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("productType in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("productType not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("productType between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("productType not between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("ratio is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(String value) {
            addCriterion("ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(String value) {
            addCriterion("ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(String value) {
            addCriterion("ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(String value) {
            addCriterion("ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(String value) {
            addCriterion("ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(String value) {
            addCriterion("ratio <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLike(String value) {
            addCriterion("ratio like", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotLike(String value) {
            addCriterion("ratio not like", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<String> values) {
            addCriterion("ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<String> values) {
            addCriterion("ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(String value1, String value2) {
            addCriterion("ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(String value1, String value2) {
            addCriterion("ratio not between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andVtypeIsNull() {
            addCriterion("vtype is null");
            return (Criteria) this;
        }

        public Criteria andVtypeIsNotNull() {
            addCriterion("vtype is not null");
            return (Criteria) this;
        }

        public Criteria andVtypeEqualTo(Integer value) {
            addCriterion("vtype =", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotEqualTo(Integer value) {
            addCriterion("vtype <>", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeGreaterThan(Integer value) {
            addCriterion("vtype >", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vtype >=", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeLessThan(Integer value) {
            addCriterion("vtype <", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeLessThanOrEqualTo(Integer value) {
            addCriterion("vtype <=", value, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeIn(List<Integer> values) {
            addCriterion("vtype in", values, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotIn(List<Integer> values) {
            addCriterion("vtype not in", values, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeBetween(Integer value1, Integer value2) {
            addCriterion("vtype between", value1, value2, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("vtype not between", value1, value2, "vtype");
            return (Criteria) this;
        }

        public Criteria andVtypefullidIsNull() {
            addCriterion("vtypeFullId is null");
            return (Criteria) this;
        }

        public Criteria andVtypefullidIsNotNull() {
            addCriterion("vtypeFullId is not null");
            return (Criteria) this;
        }

        public Criteria andVtypefullidEqualTo(String value) {
            addCriterion("vtypeFullId =", value, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidNotEqualTo(String value) {
            addCriterion("vtypeFullId <>", value, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidGreaterThan(String value) {
            addCriterion("vtypeFullId >", value, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidGreaterThanOrEqualTo(String value) {
            addCriterion("vtypeFullId >=", value, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidLessThan(String value) {
            addCriterion("vtypeFullId <", value, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidLessThanOrEqualTo(String value) {
            addCriterion("vtypeFullId <=", value, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidLike(String value) {
            addCriterion("vtypeFullId like", value, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidNotLike(String value) {
            addCriterion("vtypeFullId not like", value, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidIn(List<String> values) {
            addCriterion("vtypeFullId in", values, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidNotIn(List<String> values) {
            addCriterion("vtypeFullId not in", values, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidBetween(String value1, String value2) {
            addCriterion("vtypeFullId between", value1, value2, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andVtypefullidNotBetween(String value1, String value2) {
            addCriterion("vtypeFullId not between", value1, value2, "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andPmtypeIsNull() {
            addCriterion("pmtype is null");
            return (Criteria) this;
        }

        public Criteria andPmtypeIsNotNull() {
            addCriterion("pmtype is not null");
            return (Criteria) this;
        }

        public Criteria andPmtypeEqualTo(Integer value) {
            addCriterion("pmtype =", value, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeNotEqualTo(Integer value) {
            addCriterion("pmtype <>", value, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeGreaterThan(Integer value) {
            addCriterion("pmtype >", value, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pmtype >=", value, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeLessThan(Integer value) {
            addCriterion("pmtype <", value, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeLessThanOrEqualTo(Integer value) {
            addCriterion("pmtype <=", value, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeIn(List<Integer> values) {
            addCriterion("pmtype in", values, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeNotIn(List<Integer> values) {
            addCriterion("pmtype not in", values, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeBetween(Integer value1, Integer value2) {
            addCriterion("pmtype between", value1, value2, "pmtype");
            return (Criteria) this;
        }

        public Criteria andPmtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pmtype not between", value1, value2, "pmtype");
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

        public Criteria andPaytimeIsNull() {
            addCriterion("payTime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("payTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(String value) {
            addCriterion("payTime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(String value) {
            addCriterion("payTime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(String value) {
            addCriterion("payTime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("payTime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(String value) {
            addCriterion("payTime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(String value) {
            addCriterion("payTime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLike(String value) {
            addCriterion("payTime like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotLike(String value) {
            addCriterion("payTime not like", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<String> values) {
            addCriterion("payTime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<String> values) {
            addCriterion("payTime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(String value1, String value2) {
            addCriterion("payTime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(String value1, String value2) {
            addCriterion("payTime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeIsNull() {
            addCriterion("forceBuyType is null");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeIsNotNull() {
            addCriterion("forceBuyType is not null");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeEqualTo(Integer value) {
            addCriterion("forceBuyType =", value, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeNotEqualTo(Integer value) {
            addCriterion("forceBuyType <>", value, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeGreaterThan(Integer value) {
            addCriterion("forceBuyType >", value, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("forceBuyType >=", value, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeLessThan(Integer value) {
            addCriterion("forceBuyType <", value, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeLessThanOrEqualTo(Integer value) {
            addCriterion("forceBuyType <=", value, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeIn(List<Integer> values) {
            addCriterion("forceBuyType in", values, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeNotIn(List<Integer> values) {
            addCriterion("forceBuyType not in", values, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeBetween(Integer value1, Integer value2) {
            addCriterion("forceBuyType between", value1, value2, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andForcebuytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("forceBuyType not between", value1, value2, "forcebuytype");
            return (Criteria) this;
        }

        public Criteria andEventidIsNull() {
            addCriterion("eventId is null");
            return (Criteria) this;
        }

        public Criteria andEventidIsNotNull() {
            addCriterion("eventId is not null");
            return (Criteria) this;
        }

        public Criteria andEventidEqualTo(String value) {
            addCriterion("eventId =", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotEqualTo(String value) {
            addCriterion("eventId <>", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThan(String value) {
            addCriterion("eventId >", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidGreaterThanOrEqualTo(String value) {
            addCriterion("eventId >=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThan(String value) {
            addCriterion("eventId <", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLessThanOrEqualTo(String value) {
            addCriterion("eventId <=", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidLike(String value) {
            addCriterion("eventId like", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotLike(String value) {
            addCriterion("eventId not like", value, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidIn(List<String> values) {
            addCriterion("eventId in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotIn(List<String> values) {
            addCriterion("eventId not in", values, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidBetween(String value1, String value2) {
            addCriterion("eventId between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andEventidNotBetween(String value1, String value2) {
            addCriterion("eventId not between", value1, value2, "eventid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidIsNull() {
            addCriterion("refBindOutId is null");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidIsNotNull() {
            addCriterion("refBindOutId is not null");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidEqualTo(String value) {
            addCriterion("refBindOutId =", value, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidNotEqualTo(String value) {
            addCriterion("refBindOutId <>", value, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidGreaterThan(String value) {
            addCriterion("refBindOutId >", value, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidGreaterThanOrEqualTo(String value) {
            addCriterion("refBindOutId >=", value, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidLessThan(String value) {
            addCriterion("refBindOutId <", value, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidLessThanOrEqualTo(String value) {
            addCriterion("refBindOutId <=", value, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidLike(String value) {
            addCriterion("refBindOutId like", value, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidNotLike(String value) {
            addCriterion("refBindOutId not like", value, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidIn(List<String> values) {
            addCriterion("refBindOutId in", values, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidNotIn(List<String> values) {
            addCriterion("refBindOutId not in", values, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidBetween(String value1, String value2) {
            addCriterion("refBindOutId between", value1, value2, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidNotBetween(String value1, String value2) {
            addCriterion("refBindOutId not between", value1, value2, "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andPromvalueIsNull() {
            addCriterion("promValue is null");
            return (Criteria) this;
        }

        public Criteria andPromvalueIsNotNull() {
            addCriterion("promValue is not null");
            return (Criteria) this;
        }

        public Criteria andPromvalueEqualTo(Double value) {
            addCriterion("promValue =", value, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueNotEqualTo(Double value) {
            addCriterion("promValue <>", value, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueGreaterThan(Double value) {
            addCriterion("promValue >", value, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("promValue >=", value, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueLessThan(Double value) {
            addCriterion("promValue <", value, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueLessThanOrEqualTo(Double value) {
            addCriterion("promValue <=", value, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueIn(List<Double> values) {
            addCriterion("promValue in", values, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueNotIn(List<Double> values) {
            addCriterion("promValue not in", values, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueBetween(Double value1, Double value2) {
            addCriterion("promValue between", value1, value2, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromvalueNotBetween(Double value1, Double value2) {
            addCriterion("promValue not between", value1, value2, "promvalue");
            return (Criteria) this;
        }

        public Criteria andPromstatusIsNull() {
            addCriterion("promStatus is null");
            return (Criteria) this;
        }

        public Criteria andPromstatusIsNotNull() {
            addCriterion("promStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPromstatusEqualTo(Integer value) {
            addCriterion("promStatus =", value, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusNotEqualTo(Integer value) {
            addCriterion("promStatus <>", value, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusGreaterThan(Integer value) {
            addCriterion("promStatus >", value, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("promStatus >=", value, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusLessThan(Integer value) {
            addCriterion("promStatus <", value, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusLessThanOrEqualTo(Integer value) {
            addCriterion("promStatus <=", value, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusIn(List<Integer> values) {
            addCriterion("promStatus in", values, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusNotIn(List<Integer> values) {
            addCriterion("promStatus not in", values, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusBetween(Integer value1, Integer value2) {
            addCriterion("promStatus between", value1, value2, "promstatus");
            return (Criteria) this;
        }

        public Criteria andPromstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("promStatus not between", value1, value2, "promstatus");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedIsNull() {
            addCriterion("lastModified is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedIsNotNull() {
            addCriterion("lastModified is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedEqualTo(String value) {
            addCriterion("lastModified =", value, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedNotEqualTo(String value) {
            addCriterion("lastModified <>", value, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedGreaterThan(String value) {
            addCriterion("lastModified >", value, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedGreaterThanOrEqualTo(String value) {
            addCriterion("lastModified >=", value, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedLessThan(String value) {
            addCriterion("lastModified <", value, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedLessThanOrEqualTo(String value) {
            addCriterion("lastModified <=", value, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedLike(String value) {
            addCriterion("lastModified like", value, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedNotLike(String value) {
            addCriterion("lastModified not like", value, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedIn(List<String> values) {
            addCriterion("lastModified in", values, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedNotIn(List<String> values) {
            addCriterion("lastModified not in", values, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedBetween(String value1, String value2) {
            addCriterion("lastModified between", value1, value2, "lastmodified");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedNotBetween(String value1, String value2) {
            addCriterion("lastModified not between", value1, value2, "lastmodified");
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

        public Criteria andOperatornameIsNull() {
            addCriterion("operatorName is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("operatorName is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("operatorName =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("operatorName <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("operatorName >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("operatorName >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("operatorName <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("operatorName <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("operatorName like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("operatorName not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("operatorName in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("operatorName not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("operatorName between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("operatorName not between", value1, value2, "operatorname");
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

        public Criteria andGuarantorIsNull() {
            addCriterion("guarantor is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorIsNotNull() {
            addCriterion("guarantor is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorEqualTo(String value) {
            addCriterion("guarantor =", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotEqualTo(String value) {
            addCriterion("guarantor <>", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorGreaterThan(String value) {
            addCriterion("guarantor >", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorGreaterThanOrEqualTo(String value) {
            addCriterion("guarantor >=", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLessThan(String value) {
            addCriterion("guarantor <", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLessThanOrEqualTo(String value) {
            addCriterion("guarantor <=", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLike(String value) {
            addCriterion("guarantor like", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotLike(String value) {
            addCriterion("guarantor not like", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorIn(List<String> values) {
            addCriterion("guarantor in", values, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotIn(List<String> values) {
            addCriterion("guarantor not in", values, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorBetween(String value1, String value2) {
            addCriterion("guarantor between", value1, value2, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotBetween(String value1, String value2) {
            addCriterion("guarantor not between", value1, value2, "guarantor");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitIsNull() {
            addCriterion("feedBackVisit is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitIsNotNull() {
            addCriterion("feedBackVisit is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitEqualTo(Integer value) {
            addCriterion("feedBackVisit =", value, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitNotEqualTo(Integer value) {
            addCriterion("feedBackVisit <>", value, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitGreaterThan(Integer value) {
            addCriterion("feedBackVisit >", value, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitGreaterThanOrEqualTo(Integer value) {
            addCriterion("feedBackVisit >=", value, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitLessThan(Integer value) {
            addCriterion("feedBackVisit <", value, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitLessThanOrEqualTo(Integer value) {
            addCriterion("feedBackVisit <=", value, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitIn(List<Integer> values) {
            addCriterion("feedBackVisit in", values, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitNotIn(List<Integer> values) {
            addCriterion("feedBackVisit not in", values, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitBetween(Integer value1, Integer value2) {
            addCriterion("feedBackVisit between", value1, value2, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackvisitNotBetween(Integer value1, Integer value2) {
            addCriterion("feedBackVisit not between", value1, value2, "feedbackvisit");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckIsNull() {
            addCriterion("feedBackCheck is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckIsNotNull() {
            addCriterion("feedBackCheck is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckEqualTo(Integer value) {
            addCriterion("feedBackCheck =", value, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckNotEqualTo(Integer value) {
            addCriterion("feedBackCheck <>", value, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckGreaterThan(Integer value) {
            addCriterion("feedBackCheck >", value, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("feedBackCheck >=", value, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckLessThan(Integer value) {
            addCriterion("feedBackCheck <", value, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckLessThanOrEqualTo(Integer value) {
            addCriterion("feedBackCheck <=", value, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckIn(List<Integer> values) {
            addCriterion("feedBackCheck in", values, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckNotIn(List<Integer> values) {
            addCriterion("feedBackCheck not in", values, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckBetween(Integer value1, Integer value2) {
            addCriterion("feedBackCheck between", value1, value2, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andFeedbackcheckNotBetween(Integer value1, Integer value2) {
            addCriterion("feedBackCheck not between", value1, value2, "feedbackcheck");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNull() {
            addCriterion("taxTotal is null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIsNotNull() {
            addCriterion("taxTotal is not null");
            return (Criteria) this;
        }

        public Criteria andTaxtotalEqualTo(Double value) {
            addCriterion("taxTotal =", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotEqualTo(Double value) {
            addCriterion("taxTotal <>", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThan(Double value) {
            addCriterion("taxTotal >", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("taxTotal >=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThan(Double value) {
            addCriterion("taxTotal <", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalLessThanOrEqualTo(Double value) {
            addCriterion("taxTotal <=", value, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalIn(List<Double> values) {
            addCriterion("taxTotal in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotIn(List<Double> values) {
            addCriterion("taxTotal not in", values, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalBetween(Double value1, Double value2) {
            addCriterion("taxTotal between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andTaxtotalNotBetween(Double value1, Double value2) {
            addCriterion("taxTotal not between", value1, value2, "taxtotal");
            return (Criteria) this;
        }

        public Criteria andHasrebateIsNull() {
            addCriterion("hasRebate is null");
            return (Criteria) this;
        }

        public Criteria andHasrebateIsNotNull() {
            addCriterion("hasRebate is not null");
            return (Criteria) this;
        }

        public Criteria andHasrebateEqualTo(Integer value) {
            addCriterion("hasRebate =", value, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateNotEqualTo(Integer value) {
            addCriterion("hasRebate <>", value, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateGreaterThan(Integer value) {
            addCriterion("hasRebate >", value, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasRebate >=", value, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateLessThan(Integer value) {
            addCriterion("hasRebate <", value, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateLessThanOrEqualTo(Integer value) {
            addCriterion("hasRebate <=", value, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateIn(List<Integer> values) {
            addCriterion("hasRebate in", values, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateNotIn(List<Integer> values) {
            addCriterion("hasRebate not in", values, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateBetween(Integer value1, Integer value2) {
            addCriterion("hasRebate between", value1, value2, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andHasrebateNotBetween(Integer value1, Integer value2) {
            addCriterion("hasRebate not between", value1, value2, "hasrebate");
            return (Criteria) this;
        }

        public Criteria andPidutyidIsNull() {
            addCriterion("piDutyId is null");
            return (Criteria) this;
        }

        public Criteria andPidutyidIsNotNull() {
            addCriterion("piDutyId is not null");
            return (Criteria) this;
        }

        public Criteria andPidutyidEqualTo(String value) {
            addCriterion("piDutyId =", value, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidNotEqualTo(String value) {
            addCriterion("piDutyId <>", value, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidGreaterThan(String value) {
            addCriterion("piDutyId >", value, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidGreaterThanOrEqualTo(String value) {
            addCriterion("piDutyId >=", value, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidLessThan(String value) {
            addCriterion("piDutyId <", value, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidLessThanOrEqualTo(String value) {
            addCriterion("piDutyId <=", value, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidLike(String value) {
            addCriterion("piDutyId like", value, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidNotLike(String value) {
            addCriterion("piDutyId not like", value, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidIn(List<String> values) {
            addCriterion("piDutyId in", values, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidNotIn(List<String> values) {
            addCriterion("piDutyId not in", values, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidBetween(String value1, String value2) {
            addCriterion("piDutyId between", value1, value2, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPidutyidNotBetween(String value1, String value2) {
            addCriterion("piDutyId not between", value1, value2, "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPimtypeIsNull() {
            addCriterion("piMtype is null");
            return (Criteria) this;
        }

        public Criteria andPimtypeIsNotNull() {
            addCriterion("piMtype is not null");
            return (Criteria) this;
        }

        public Criteria andPimtypeEqualTo(Integer value) {
            addCriterion("piMtype =", value, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeNotEqualTo(Integer value) {
            addCriterion("piMtype <>", value, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeGreaterThan(Integer value) {
            addCriterion("piMtype >", value, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("piMtype >=", value, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeLessThan(Integer value) {
            addCriterion("piMtype <", value, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeLessThanOrEqualTo(Integer value) {
            addCriterion("piMtype <=", value, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeIn(List<Integer> values) {
            addCriterion("piMtype in", values, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeNotIn(List<Integer> values) {
            addCriterion("piMtype not in", values, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeBetween(Integer value1, Integer value2) {
            addCriterion("piMtype between", value1, value2, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPimtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("piMtype not between", value1, value2, "pimtype");
            return (Criteria) this;
        }

        public Criteria andPitypeIsNull() {
            addCriterion("piType is null");
            return (Criteria) this;
        }

        public Criteria andPitypeIsNotNull() {
            addCriterion("piType is not null");
            return (Criteria) this;
        }

        public Criteria andPitypeEqualTo(Integer value) {
            addCriterion("piType =", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeNotEqualTo(Integer value) {
            addCriterion("piType <>", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeGreaterThan(Integer value) {
            addCriterion("piType >", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("piType >=", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeLessThan(Integer value) {
            addCriterion("piType <", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeLessThanOrEqualTo(Integer value) {
            addCriterion("piType <=", value, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeIn(List<Integer> values) {
            addCriterion("piType in", values, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeNotIn(List<Integer> values) {
            addCriterion("piType not in", values, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeBetween(Integer value1, Integer value2) {
            addCriterion("piType between", value1, value2, "pitype");
            return (Criteria) this;
        }

        public Criteria andPitypeNotBetween(Integer value1, Integer value2) {
            addCriterion("piType not between", value1, value2, "pitype");
            return (Criteria) this;
        }

        public Criteria andPistatusIsNull() {
            addCriterion("piStatus is null");
            return (Criteria) this;
        }

        public Criteria andPistatusIsNotNull() {
            addCriterion("piStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPistatusEqualTo(Integer value) {
            addCriterion("piStatus =", value, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusNotEqualTo(Integer value) {
            addCriterion("piStatus <>", value, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusGreaterThan(Integer value) {
            addCriterion("piStatus >", value, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("piStatus >=", value, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusLessThan(Integer value) {
            addCriterion("piStatus <", value, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusLessThanOrEqualTo(Integer value) {
            addCriterion("piStatus <=", value, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusIn(List<Integer> values) {
            addCriterion("piStatus in", values, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusNotIn(List<Integer> values) {
            addCriterion("piStatus not in", values, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusBetween(Integer value1, Integer value2) {
            addCriterion("piStatus between", value1, value2, "pistatus");
            return (Criteria) this;
        }

        public Criteria andPistatusNotBetween(Integer value1, Integer value2) {
            addCriterion("piStatus not between", value1, value2, "pistatus");
            return (Criteria) this;
        }

        public Criteria andHasconfirmIsNull() {
            addCriterion("hasConfirm is null");
            return (Criteria) this;
        }

        public Criteria andHasconfirmIsNotNull() {
            addCriterion("hasConfirm is not null");
            return (Criteria) this;
        }

        public Criteria andHasconfirmEqualTo(Integer value) {
            addCriterion("hasConfirm =", value, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmNotEqualTo(Integer value) {
            addCriterion("hasConfirm <>", value, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmGreaterThan(Integer value) {
            addCriterion("hasConfirm >", value, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasConfirm >=", value, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmLessThan(Integer value) {
            addCriterion("hasConfirm <", value, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmLessThanOrEqualTo(Integer value) {
            addCriterion("hasConfirm <=", value, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmIn(List<Integer> values) {
            addCriterion("hasConfirm in", values, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmNotIn(List<Integer> values) {
            addCriterion("hasConfirm not in", values, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmBetween(Integer value1, Integer value2) {
            addCriterion("hasConfirm between", value1, value2, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("hasConfirm not between", value1, value2, "hasconfirm");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyIsNull() {
            addCriterion("hasConfirmInsMoney is null");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyIsNotNull() {
            addCriterion("hasConfirmInsMoney is not null");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyEqualTo(Double value) {
            addCriterion("hasConfirmInsMoney =", value, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyNotEqualTo(Double value) {
            addCriterion("hasConfirmInsMoney <>", value, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyGreaterThan(Double value) {
            addCriterion("hasConfirmInsMoney >", value, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("hasConfirmInsMoney >=", value, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyLessThan(Double value) {
            addCriterion("hasConfirmInsMoney <", value, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyLessThanOrEqualTo(Double value) {
            addCriterion("hasConfirmInsMoney <=", value, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyIn(List<Double> values) {
            addCriterion("hasConfirmInsMoney in", values, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyNotIn(List<Double> values) {
            addCriterion("hasConfirmInsMoney not in", values, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyBetween(Double value1, Double value2) {
            addCriterion("hasConfirmInsMoney between", value1, value2, "hasconfirminsmoney");
            return (Criteria) this;
        }

        public Criteria andHasconfirminsmoneyNotBetween(Double value1, Double value2) {
            addCriterion("hasConfirmInsMoney not between", value1, value2, "hasconfirminsmoney");
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

        public Criteria andPresentflagIsNull() {
            addCriterion("presentFlag is null");
            return (Criteria) this;
        }

        public Criteria andPresentflagIsNotNull() {
            addCriterion("presentFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPresentflagEqualTo(Integer value) {
            addCriterion("presentFlag =", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagNotEqualTo(Integer value) {
            addCriterion("presentFlag <>", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagGreaterThan(Integer value) {
            addCriterion("presentFlag >", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("presentFlag >=", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagLessThan(Integer value) {
            addCriterion("presentFlag <", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagLessThanOrEqualTo(Integer value) {
            addCriterion("presentFlag <=", value, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagIn(List<Integer> values) {
            addCriterion("presentFlag in", values, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagNotIn(List<Integer> values) {
            addCriterion("presentFlag not in", values, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagBetween(Integer value1, Integer value2) {
            addCriterion("presentFlag between", value1, value2, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPresentflagNotBetween(Integer value1, Integer value2) {
            addCriterion("presentFlag not between", value1, value2, "presentflag");
            return (Criteria) this;
        }

        public Criteria andPodateIsNull() {
            addCriterion("podate is null");
            return (Criteria) this;
        }

        public Criteria andPodateIsNotNull() {
            addCriterion("podate is not null");
            return (Criteria) this;
        }

        public Criteria andPodateEqualTo(String value) {
            addCriterion("podate =", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateNotEqualTo(String value) {
            addCriterion("podate <>", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateGreaterThan(String value) {
            addCriterion("podate >", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateGreaterThanOrEqualTo(String value) {
            addCriterion("podate >=", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateLessThan(String value) {
            addCriterion("podate <", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateLessThanOrEqualTo(String value) {
            addCriterion("podate <=", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateLike(String value) {
            addCriterion("podate like", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateNotLike(String value) {
            addCriterion("podate not like", value, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateIn(List<String> values) {
            addCriterion("podate in", values, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateNotIn(List<String> values) {
            addCriterion("podate not in", values, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateBetween(String value1, String value2) {
            addCriterion("podate between", value1, value2, "podate");
            return (Criteria) this;
        }

        public Criteria andPodateNotBetween(String value1, String value2) {
            addCriterion("podate not between", value1, value2, "podate");
            return (Criteria) this;
        }

        public Criteria andIbflagIsNull() {
            addCriterion("ibFlag is null");
            return (Criteria) this;
        }

        public Criteria andIbflagIsNotNull() {
            addCriterion("ibFlag is not null");
            return (Criteria) this;
        }

        public Criteria andIbflagEqualTo(Integer value) {
            addCriterion("ibFlag =", value, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagNotEqualTo(Integer value) {
            addCriterion("ibFlag <>", value, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagGreaterThan(Integer value) {
            addCriterion("ibFlag >", value, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ibFlag >=", value, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagLessThan(Integer value) {
            addCriterion("ibFlag <", value, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagLessThanOrEqualTo(Integer value) {
            addCriterion("ibFlag <=", value, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagIn(List<Integer> values) {
            addCriterion("ibFlag in", values, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagNotIn(List<Integer> values) {
            addCriterion("ibFlag not in", values, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagBetween(Integer value1, Integer value2) {
            addCriterion("ibFlag between", value1, value2, "ibflag");
            return (Criteria) this;
        }

        public Criteria andIbflagNotBetween(Integer value1, Integer value2) {
            addCriterion("ibFlag not between", value1, value2, "ibflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagIsNull() {
            addCriterion("motivationFlag is null");
            return (Criteria) this;
        }

        public Criteria andMotivationflagIsNotNull() {
            addCriterion("motivationFlag is not null");
            return (Criteria) this;
        }

        public Criteria andMotivationflagEqualTo(Integer value) {
            addCriterion("motivationFlag =", value, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagNotEqualTo(Integer value) {
            addCriterion("motivationFlag <>", value, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagGreaterThan(Integer value) {
            addCriterion("motivationFlag >", value, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("motivationFlag >=", value, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagLessThan(Integer value) {
            addCriterion("motivationFlag <", value, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagLessThanOrEqualTo(Integer value) {
            addCriterion("motivationFlag <=", value, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagIn(List<Integer> values) {
            addCriterion("motivationFlag in", values, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagNotIn(List<Integer> values) {
            addCriterion("motivationFlag not in", values, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagBetween(Integer value1, Integer value2) {
            addCriterion("motivationFlag between", value1, value2, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andMotivationflagNotBetween(Integer value1, Integer value2) {
            addCriterion("motivationFlag not between", value1, value2, "motivationflag");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateIsNull() {
            addCriterion("remoteAllocate is null");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateIsNotNull() {
            addCriterion("remoteAllocate is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateEqualTo(Integer value) {
            addCriterion("remoteAllocate =", value, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateNotEqualTo(Integer value) {
            addCriterion("remoteAllocate <>", value, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateGreaterThan(Integer value) {
            addCriterion("remoteAllocate >", value, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateGreaterThanOrEqualTo(Integer value) {
            addCriterion("remoteAllocate >=", value, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateLessThan(Integer value) {
            addCriterion("remoteAllocate <", value, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateLessThanOrEqualTo(Integer value) {
            addCriterion("remoteAllocate <=", value, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateIn(List<Integer> values) {
            addCriterion("remoteAllocate in", values, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateNotIn(List<Integer> values) {
            addCriterion("remoteAllocate not in", values, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateBetween(Integer value1, Integer value2) {
            addCriterion("remoteAllocate between", value1, value2, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andRemoteallocateNotBetween(Integer value1, Integer value2) {
            addCriterion("remoteAllocate not between", value1, value2, "remoteallocate");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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

        public Criteria andSwbzIsNull() {
            addCriterion("swbz is null");
            return (Criteria) this;
        }

        public Criteria andSwbzIsNotNull() {
            addCriterion("swbz is not null");
            return (Criteria) this;
        }

        public Criteria andSwbzEqualTo(String value) {
            addCriterion("swbz =", value, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzNotEqualTo(String value) {
            addCriterion("swbz <>", value, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzGreaterThan(String value) {
            addCriterion("swbz >", value, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzGreaterThanOrEqualTo(String value) {
            addCriterion("swbz >=", value, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzLessThan(String value) {
            addCriterion("swbz <", value, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzLessThanOrEqualTo(String value) {
            addCriterion("swbz <=", value, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzLike(String value) {
            addCriterion("swbz like", value, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzNotLike(String value) {
            addCriterion("swbz not like", value, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzIn(List<String> values) {
            addCriterion("swbz in", values, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzNotIn(List<String> values) {
            addCriterion("swbz not in", values, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzBetween(String value1, String value2) {
            addCriterion("swbz between", value1, value2, "swbz");
            return (Criteria) this;
        }

        public Criteria andSwbzNotBetween(String value1, String value2) {
            addCriterion("swbz not between", value1, value2, "swbz");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusIsNull() {
            addCriterion("outbackStatus is null");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusIsNotNull() {
            addCriterion("outbackStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusEqualTo(String value) {
            addCriterion("outbackStatus =", value, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusNotEqualTo(String value) {
            addCriterion("outbackStatus <>", value, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusGreaterThan(String value) {
            addCriterion("outbackStatus >", value, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusGreaterThanOrEqualTo(String value) {
            addCriterion("outbackStatus >=", value, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusLessThan(String value) {
            addCriterion("outbackStatus <", value, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusLessThanOrEqualTo(String value) {
            addCriterion("outbackStatus <=", value, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusLike(String value) {
            addCriterion("outbackStatus like", value, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusNotLike(String value) {
            addCriterion("outbackStatus not like", value, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusIn(List<String> values) {
            addCriterion("outbackStatus in", values, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusNotIn(List<String> values) {
            addCriterion("outbackStatus not in", values, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusBetween(String value1, String value2) {
            addCriterion("outbackStatus between", value1, value2, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusNotBetween(String value1, String value2) {
            addCriterion("outbackStatus not between", value1, value2, "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedIsNull() {
            addCriterion("customerCreated is null");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedIsNotNull() {
            addCriterion("customerCreated is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedEqualTo(Integer value) {
            addCriterion("customerCreated =", value, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedNotEqualTo(Integer value) {
            addCriterion("customerCreated <>", value, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedGreaterThan(Integer value) {
            addCriterion("customerCreated >", value, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerCreated >=", value, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedLessThan(Integer value) {
            addCriterion("customerCreated <", value, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedLessThanOrEqualTo(Integer value) {
            addCriterion("customerCreated <=", value, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedIn(List<Integer> values) {
            addCriterion("customerCreated in", values, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedNotIn(List<Integer> values) {
            addCriterion("customerCreated not in", values, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedBetween(Integer value1, Integer value2) {
            addCriterion("customerCreated between", value1, value2, "customercreated");
            return (Criteria) this;
        }

        public Criteria andCustomercreatedNotBetween(Integer value1, Integer value2) {
            addCriterion("customerCreated not between", value1, value2, "customercreated");
            return (Criteria) this;
        }

        public Criteria andFlowtimeIsNull() {
            addCriterion("flowTime is null");
            return (Criteria) this;
        }

        public Criteria andFlowtimeIsNotNull() {
            addCriterion("flowTime is not null");
            return (Criteria) this;
        }

        public Criteria andFlowtimeEqualTo(String value) {
            addCriterion("flowTime =", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeNotEqualTo(String value) {
            addCriterion("flowTime <>", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeGreaterThan(String value) {
            addCriterion("flowTime >", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeGreaterThanOrEqualTo(String value) {
            addCriterion("flowTime >=", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeLessThan(String value) {
            addCriterion("flowTime <", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeLessThanOrEqualTo(String value) {
            addCriterion("flowTime <=", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeLike(String value) {
            addCriterion("flowTime like", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeNotLike(String value) {
            addCriterion("flowTime not like", value, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeIn(List<String> values) {
            addCriterion("flowTime in", values, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeNotIn(List<String> values) {
            addCriterion("flowTime not in", values, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeBetween(String value1, String value2) {
            addCriterion("flowTime between", value1, value2, "flowtime");
            return (Criteria) this;
        }

        public Criteria andFlowtimeNotBetween(String value1, String value2) {
            addCriterion("flowTime not between", value1, value2, "flowtime");
            return (Criteria) this;
        }

        public Criteria andIbapplyidIsNull() {
            addCriterion("ibApplyId is null");
            return (Criteria) this;
        }

        public Criteria andIbapplyidIsNotNull() {
            addCriterion("ibApplyId is not null");
            return (Criteria) this;
        }

        public Criteria andIbapplyidEqualTo(String value) {
            addCriterion("ibApplyId =", value, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidNotEqualTo(String value) {
            addCriterion("ibApplyId <>", value, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidGreaterThan(String value) {
            addCriterion("ibApplyId >", value, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("ibApplyId >=", value, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidLessThan(String value) {
            addCriterion("ibApplyId <", value, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidLessThanOrEqualTo(String value) {
            addCriterion("ibApplyId <=", value, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidLike(String value) {
            addCriterion("ibApplyId like", value, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidNotLike(String value) {
            addCriterion("ibApplyId not like", value, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidIn(List<String> values) {
            addCriterion("ibApplyId in", values, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidNotIn(List<String> values) {
            addCriterion("ibApplyId not in", values, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidBetween(String value1, String value2) {
            addCriterion("ibApplyId between", value1, value2, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andIbapplyidNotBetween(String value1, String value2) {
            addCriterion("ibApplyId not between", value1, value2, "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidIsNull() {
            addCriterion("motivationApplyId is null");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidIsNotNull() {
            addCriterion("motivationApplyId is not null");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidEqualTo(String value) {
            addCriterion("motivationApplyId =", value, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidNotEqualTo(String value) {
            addCriterion("motivationApplyId <>", value, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidGreaterThan(String value) {
            addCriterion("motivationApplyId >", value, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("motivationApplyId >=", value, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidLessThan(String value) {
            addCriterion("motivationApplyId <", value, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidLessThanOrEqualTo(String value) {
            addCriterion("motivationApplyId <=", value, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidLike(String value) {
            addCriterion("motivationApplyId like", value, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidNotLike(String value) {
            addCriterion("motivationApplyId not like", value, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidIn(List<String> values) {
            addCriterion("motivationApplyId in", values, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidNotIn(List<String> values) {
            addCriterion("motivationApplyId not in", values, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidBetween(String value1, String value2) {
            addCriterion("motivationApplyId between", value1, value2, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidNotBetween(String value1, String value2) {
            addCriterion("motivationApplyId not between", value1, value2, "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidIsNull() {
            addCriterion("refGiftId is null");
            return (Criteria) this;
        }

        public Criteria andRefgiftidIsNotNull() {
            addCriterion("refGiftId is not null");
            return (Criteria) this;
        }

        public Criteria andRefgiftidEqualTo(String value) {
            addCriterion("refGiftId =", value, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidNotEqualTo(String value) {
            addCriterion("refGiftId <>", value, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidGreaterThan(String value) {
            addCriterion("refGiftId >", value, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidGreaterThanOrEqualTo(String value) {
            addCriterion("refGiftId >=", value, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidLessThan(String value) {
            addCriterion("refGiftId <", value, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidLessThanOrEqualTo(String value) {
            addCriterion("refGiftId <=", value, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidLike(String value) {
            addCriterion("refGiftId like", value, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidNotLike(String value) {
            addCriterion("refGiftId not like", value, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidIn(List<String> values) {
            addCriterion("refGiftId in", values, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidNotIn(List<String> values) {
            addCriterion("refGiftId not in", values, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidBetween(String value1, String value2) {
            addCriterion("refGiftId between", value1, value2, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidNotBetween(String value1, String value2) {
            addCriterion("refGiftId not between", value1, value2, "refgiftid");
            return (Criteria) this;
        }

        public Criteria andProfigflagIsNull() {
            addCriterion("profigflag is null");
            return (Criteria) this;
        }

        public Criteria andProfigflagIsNotNull() {
            addCriterion("profigflag is not null");
            return (Criteria) this;
        }

        public Criteria andProfigflagEqualTo(Integer value) {
            addCriterion("profigflag =", value, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagNotEqualTo(Integer value) {
            addCriterion("profigflag <>", value, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagGreaterThan(Integer value) {
            addCriterion("profigflag >", value, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("profigflag >=", value, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagLessThan(Integer value) {
            addCriterion("profigflag <", value, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagLessThanOrEqualTo(Integer value) {
            addCriterion("profigflag <=", value, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagIn(List<Integer> values) {
            addCriterion("profigflag in", values, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagNotIn(List<Integer> values) {
            addCriterion("profigflag not in", values, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagBetween(Integer value1, Integer value2) {
            addCriterion("profigflag between", value1, value2, "profigflag");
            return (Criteria) this;
        }

        public Criteria andProfigflagNotBetween(Integer value1, Integer value2) {
            addCriterion("profigflag not between", value1, value2, "profigflag");
            return (Criteria) this;
        }

        public Criteria andCashflagIsNull() {
            addCriterion("cashflag is null");
            return (Criteria) this;
        }

        public Criteria andCashflagIsNotNull() {
            addCriterion("cashflag is not null");
            return (Criteria) this;
        }

        public Criteria andCashflagEqualTo(Integer value) {
            addCriterion("cashflag =", value, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagNotEqualTo(Integer value) {
            addCriterion("cashflag <>", value, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagGreaterThan(Integer value) {
            addCriterion("cashflag >", value, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashflag >=", value, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagLessThan(Integer value) {
            addCriterion("cashflag <", value, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagLessThanOrEqualTo(Integer value) {
            addCriterion("cashflag <=", value, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagIn(List<Integer> values) {
            addCriterion("cashflag in", values, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagNotIn(List<Integer> values) {
            addCriterion("cashflag not in", values, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagBetween(Integer value1, Integer value2) {
            addCriterion("cashflag between", value1, value2, "cashflag");
            return (Criteria) this;
        }

        public Criteria andCashflagNotBetween(Integer value1, Integer value2) {
            addCriterion("cashflag not between", value1, value2, "cashflag");
            return (Criteria) this;
        }

        public Criteria andIbflag2IsNull() {
            addCriterion("ibFlag2 is null");
            return (Criteria) this;
        }

        public Criteria andIbflag2IsNotNull() {
            addCriterion("ibFlag2 is not null");
            return (Criteria) this;
        }

        public Criteria andIbflag2EqualTo(Integer value) {
            addCriterion("ibFlag2 =", value, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2NotEqualTo(Integer value) {
            addCriterion("ibFlag2 <>", value, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2GreaterThan(Integer value) {
            addCriterion("ibFlag2 >", value, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ibFlag2 >=", value, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2LessThan(Integer value) {
            addCriterion("ibFlag2 <", value, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2LessThanOrEqualTo(Integer value) {
            addCriterion("ibFlag2 <=", value, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2In(List<Integer> values) {
            addCriterion("ibFlag2 in", values, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2NotIn(List<Integer> values) {
            addCriterion("ibFlag2 not in", values, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2Between(Integer value1, Integer value2) {
            addCriterion("ibFlag2 between", value1, value2, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbflag2NotBetween(Integer value1, Integer value2) {
            addCriterion("ibFlag2 not between", value1, value2, "ibflag2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2IsNull() {
            addCriterion("ibApplyId2 is null");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2IsNotNull() {
            addCriterion("ibApplyId2 is not null");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2EqualTo(String value) {
            addCriterion("ibApplyId2 =", value, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2NotEqualTo(String value) {
            addCriterion("ibApplyId2 <>", value, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2GreaterThan(String value) {
            addCriterion("ibApplyId2 >", value, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2GreaterThanOrEqualTo(String value) {
            addCriterion("ibApplyId2 >=", value, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2LessThan(String value) {
            addCriterion("ibApplyId2 <", value, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2LessThanOrEqualTo(String value) {
            addCriterion("ibApplyId2 <=", value, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2Like(String value) {
            addCriterion("ibApplyId2 like", value, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2NotLike(String value) {
            addCriterion("ibApplyId2 not like", value, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2In(List<String> values) {
            addCriterion("ibApplyId2 in", values, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2NotIn(List<String> values) {
            addCriterion("ibApplyId2 not in", values, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2Between(String value1, String value2) {
            addCriterion("ibApplyId2 between", value1, value2, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2NotBetween(String value1, String value2) {
            addCriterion("ibApplyId2 not between", value1, value2, "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2IsNull() {
            addCriterion("motivationFlag2 is null");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2IsNotNull() {
            addCriterion("motivationFlag2 is not null");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2EqualTo(Integer value) {
            addCriterion("motivationFlag2 =", value, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2NotEqualTo(Integer value) {
            addCriterion("motivationFlag2 <>", value, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2GreaterThan(Integer value) {
            addCriterion("motivationFlag2 >", value, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2GreaterThanOrEqualTo(Integer value) {
            addCriterion("motivationFlag2 >=", value, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2LessThan(Integer value) {
            addCriterion("motivationFlag2 <", value, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2LessThanOrEqualTo(Integer value) {
            addCriterion("motivationFlag2 <=", value, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2In(List<Integer> values) {
            addCriterion("motivationFlag2 in", values, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2NotIn(List<Integer> values) {
            addCriterion("motivationFlag2 not in", values, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2Between(Integer value1, Integer value2) {
            addCriterion("motivationFlag2 between", value1, value2, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationflag2NotBetween(Integer value1, Integer value2) {
            addCriterion("motivationFlag2 not between", value1, value2, "motivationflag2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2IsNull() {
            addCriterion("motivationApplyId2 is null");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2IsNotNull() {
            addCriterion("motivationApplyId2 is not null");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2EqualTo(String value) {
            addCriterion("motivationApplyId2 =", value, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2NotEqualTo(String value) {
            addCriterion("motivationApplyId2 <>", value, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2GreaterThan(String value) {
            addCriterion("motivationApplyId2 >", value, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2GreaterThanOrEqualTo(String value) {
            addCriterion("motivationApplyId2 >=", value, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2LessThan(String value) {
            addCriterion("motivationApplyId2 <", value, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2LessThanOrEqualTo(String value) {
            addCriterion("motivationApplyId2 <=", value, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2Like(String value) {
            addCriterion("motivationApplyId2 like", value, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2NotLike(String value) {
            addCriterion("motivationApplyId2 not like", value, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2In(List<String> values) {
            addCriterion("motivationApplyId2 in", values, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2NotIn(List<String> values) {
            addCriterion("motivationApplyId2 not in", values, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2Between(String value1, String value2) {
            addCriterion("motivationApplyId2 between", value1, value2, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2NotBetween(String value1, String value2) {
            addCriterion("motivationApplyId2 not between", value1, value2, "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionIsNull() {
            addCriterion("customerDescription is null");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionIsNotNull() {
            addCriterion("customerDescription is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionEqualTo(String value) {
            addCriterion("customerDescription =", value, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionNotEqualTo(String value) {
            addCriterion("customerDescription <>", value, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionGreaterThan(String value) {
            addCriterion("customerDescription >", value, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("customerDescription >=", value, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionLessThan(String value) {
            addCriterion("customerDescription <", value, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionLessThanOrEqualTo(String value) {
            addCriterion("customerDescription <=", value, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionLike(String value) {
            addCriterion("customerDescription like", value, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionNotLike(String value) {
            addCriterion("customerDescription not like", value, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionIn(List<String> values) {
            addCriterion("customerDescription in", values, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionNotIn(List<String> values) {
            addCriterion("customerDescription not in", values, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionBetween(String value1, String value2) {
            addCriterion("customerDescription between", value1, value2, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionNotBetween(String value1, String value2) {
            addCriterion("customerDescription not between", value1, value2, "customerdescription");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNull() {
            addCriterion("delivery is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIsNotNull() {
            addCriterion("delivery is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryEqualTo(String value) {
            addCriterion("delivery =", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotEqualTo(String value) {
            addCriterion("delivery <>", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThan(String value) {
            addCriterion("delivery >", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("delivery >=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThan(String value) {
            addCriterion("delivery <", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLessThanOrEqualTo(String value) {
            addCriterion("delivery <=", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryLike(String value) {
            addCriterion("delivery like", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotLike(String value) {
            addCriterion("delivery not like", value, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryIn(List<String> values) {
            addCriterion("delivery in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotIn(List<String> values) {
            addCriterion("delivery not in", values, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryBetween(String value1, String value2) {
            addCriterion("delivery between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotBetween(String value1, String value2) {
            addCriterion("delivery not between", value1, value2, "delivery");
            return (Criteria) this;
        }

        public Criteria andPospayerIsNull() {
            addCriterion("posPayer is null");
            return (Criteria) this;
        }

        public Criteria andPospayerIsNotNull() {
            addCriterion("posPayer is not null");
            return (Criteria) this;
        }

        public Criteria andPospayerEqualTo(String value) {
            addCriterion("posPayer =", value, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerNotEqualTo(String value) {
            addCriterion("posPayer <>", value, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerGreaterThan(String value) {
            addCriterion("posPayer >", value, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerGreaterThanOrEqualTo(String value) {
            addCriterion("posPayer >=", value, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerLessThan(String value) {
            addCriterion("posPayer <", value, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerLessThanOrEqualTo(String value) {
            addCriterion("posPayer <=", value, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerLike(String value) {
            addCriterion("posPayer like", value, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerNotLike(String value) {
            addCriterion("posPayer not like", value, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerIn(List<String> values) {
            addCriterion("posPayer in", values, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerNotIn(List<String> values) {
            addCriterion("posPayer not in", values, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerBetween(String value1, String value2) {
            addCriterion("posPayer between", value1, value2, "pospayer");
            return (Criteria) this;
        }

        public Criteria andPospayerNotBetween(String value1, String value2) {
            addCriterion("posPayer not between", value1, value2, "pospayer");
            return (Criteria) this;
        }

        public Criteria andRecommendationIsNull() {
            addCriterion("recommendation is null");
            return (Criteria) this;
        }

        public Criteria andRecommendationIsNotNull() {
            addCriterion("recommendation is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendationEqualTo(String value) {
            addCriterion("recommendation =", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationNotEqualTo(String value) {
            addCriterion("recommendation <>", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationGreaterThan(String value) {
            addCriterion("recommendation >", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationGreaterThanOrEqualTo(String value) {
            addCriterion("recommendation >=", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationLessThan(String value) {
            addCriterion("recommendation <", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationLessThanOrEqualTo(String value) {
            addCriterion("recommendation <=", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationLike(String value) {
            addCriterion("recommendation like", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationNotLike(String value) {
            addCriterion("recommendation not like", value, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationIn(List<String> values) {
            addCriterion("recommendation in", values, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationNotIn(List<String> values) {
            addCriterion("recommendation not in", values, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationBetween(String value1, String value2) {
            addCriterion("recommendation between", value1, value2, "recommendation");
            return (Criteria) this;
        }

        public Criteria andRecommendationNotBetween(String value1, String value2) {
            addCriterion("recommendation not between", value1, value2, "recommendation");
            return (Criteria) this;
        }

        public Criteria andPlatformflagIsNull() {
            addCriterion("platformFlag is null");
            return (Criteria) this;
        }

        public Criteria andPlatformflagIsNotNull() {
            addCriterion("platformFlag is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformflagEqualTo(Integer value) {
            addCriterion("platformFlag =", value, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagNotEqualTo(Integer value) {
            addCriterion("platformFlag <>", value, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagGreaterThan(Integer value) {
            addCriterion("platformFlag >", value, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("platformFlag >=", value, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagLessThan(Integer value) {
            addCriterion("platformFlag <", value, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagLessThanOrEqualTo(Integer value) {
            addCriterion("platformFlag <=", value, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagIn(List<Integer> values) {
            addCriterion("platformFlag in", values, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagNotIn(List<Integer> values) {
            addCriterion("platformFlag not in", values, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagBetween(Integer value1, Integer value2) {
            addCriterion("platformFlag between", value1, value2, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformflagNotBetween(Integer value1, Integer value2) {
            addCriterion("platformFlag not between", value1, value2, "platformflag");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidIsNull() {
            addCriterion("platformApplyId is null");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidIsNotNull() {
            addCriterion("platformApplyId is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidEqualTo(String value) {
            addCriterion("platformApplyId =", value, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidNotEqualTo(String value) {
            addCriterion("platformApplyId <>", value, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidGreaterThan(String value) {
            addCriterion("platformApplyId >", value, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("platformApplyId >=", value, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidLessThan(String value) {
            addCriterion("platformApplyId <", value, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidLessThanOrEqualTo(String value) {
            addCriterion("platformApplyId <=", value, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidLike(String value) {
            addCriterion("platformApplyId like", value, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidNotLike(String value) {
            addCriterion("platformApplyId not like", value, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidIn(List<String> values) {
            addCriterion("platformApplyId in", values, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidNotIn(List<String> values) {
            addCriterion("platformApplyId not in", values, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidBetween(String value1, String value2) {
            addCriterion("platformApplyId between", value1, value2, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidNotBetween(String value1, String value2) {
            addCriterion("platformApplyId not between", value1, value2, "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusIsNull() {
            addCriterion("virtualstatus is null");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusIsNotNull() {
            addCriterion("virtualstatus is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusEqualTo(Integer value) {
            addCriterion("virtualstatus =", value, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusNotEqualTo(Integer value) {
            addCriterion("virtualstatus <>", value, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusGreaterThan(Integer value) {
            addCriterion("virtualstatus >", value, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtualstatus >=", value, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusLessThan(Integer value) {
            addCriterion("virtualstatus <", value, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusLessThanOrEqualTo(Integer value) {
            addCriterion("virtualstatus <=", value, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusIn(List<Integer> values) {
            addCriterion("virtualstatus in", values, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusNotIn(List<Integer> values) {
            addCriterion("virtualstatus not in", values, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusBetween(Integer value1, Integer value2) {
            addCriterion("virtualstatus between", value1, value2, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andVirtualstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("virtualstatus not between", value1, value2, "virtualstatus");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagIsNull() {
            addCriterion("buyReturnFlag is null");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagIsNotNull() {
            addCriterion("buyReturnFlag is not null");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagEqualTo(String value) {
            addCriterion("buyReturnFlag =", value, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagNotEqualTo(String value) {
            addCriterion("buyReturnFlag <>", value, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagGreaterThan(String value) {
            addCriterion("buyReturnFlag >", value, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagGreaterThanOrEqualTo(String value) {
            addCriterion("buyReturnFlag >=", value, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagLessThan(String value) {
            addCriterion("buyReturnFlag <", value, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagLessThanOrEqualTo(String value) {
            addCriterion("buyReturnFlag <=", value, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagLike(String value) {
            addCriterion("buyReturnFlag like", value, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagNotLike(String value) {
            addCriterion("buyReturnFlag not like", value, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagIn(List<String> values) {
            addCriterion("buyReturnFlag in", values, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagNotIn(List<String> values) {
            addCriterion("buyReturnFlag not in", values, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagBetween(String value1, String value2) {
            addCriterion("buyReturnFlag between", value1, value2, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagNotBetween(String value1, String value2) {
            addCriterion("buyReturnFlag not between", value1, value2, "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeIsNull() {
            addCriterion("buyReturnType is null");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeIsNotNull() {
            addCriterion("buyReturnType is not null");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeEqualTo(String value) {
            addCriterion("buyReturnType =", value, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeNotEqualTo(String value) {
            addCriterion("buyReturnType <>", value, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeGreaterThan(String value) {
            addCriterion("buyReturnType >", value, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeGreaterThanOrEqualTo(String value) {
            addCriterion("buyReturnType >=", value, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeLessThan(String value) {
            addCriterion("buyReturnType <", value, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeLessThanOrEqualTo(String value) {
            addCriterion("buyReturnType <=", value, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeLike(String value) {
            addCriterion("buyReturnType like", value, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeNotLike(String value) {
            addCriterion("buyReturnType not like", value, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeIn(List<String> values) {
            addCriterion("buyReturnType in", values, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeNotIn(List<String> values) {
            addCriterion("buyReturnType not in", values, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeBetween(String value1, String value2) {
            addCriterion("buyReturnType between", value1, value2, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeNotBetween(String value1, String value2) {
            addCriterion("buyReturnType not between", value1, value2, "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andBackpayIsNull() {
            addCriterion("backPay is null");
            return (Criteria) this;
        }

        public Criteria andBackpayIsNotNull() {
            addCriterion("backPay is not null");
            return (Criteria) this;
        }

        public Criteria andBackpayEqualTo(Integer value) {
            addCriterion("backPay =", value, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayNotEqualTo(Integer value) {
            addCriterion("backPay <>", value, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayGreaterThan(Integer value) {
            addCriterion("backPay >", value, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("backPay >=", value, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayLessThan(Integer value) {
            addCriterion("backPay <", value, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayLessThanOrEqualTo(Integer value) {
            addCriterion("backPay <=", value, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayIn(List<Integer> values) {
            addCriterion("backPay in", values, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayNotIn(List<Integer> values) {
            addCriterion("backPay not in", values, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayBetween(Integer value1, Integer value2) {
            addCriterion("backPay between", value1, value2, "backpay");
            return (Criteria) this;
        }

        public Criteria andBackpayNotBetween(Integer value1, Integer value2) {
            addCriterion("backPay not between", value1, value2, "backpay");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andDroptypeIsNull() {
            addCriterion("dropType is null");
            return (Criteria) this;
        }

        public Criteria andDroptypeIsNotNull() {
            addCriterion("dropType is not null");
            return (Criteria) this;
        }

        public Criteria andDroptypeEqualTo(Integer value) {
            addCriterion("dropType =", value, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeNotEqualTo(Integer value) {
            addCriterion("dropType <>", value, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeGreaterThan(Integer value) {
            addCriterion("dropType >", value, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dropType >=", value, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeLessThan(Integer value) {
            addCriterion("dropType <", value, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeLessThanOrEqualTo(Integer value) {
            addCriterion("dropType <=", value, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeIn(List<Integer> values) {
            addCriterion("dropType in", values, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeNotIn(List<Integer> values) {
            addCriterion("dropType not in", values, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeBetween(Integer value1, Integer value2) {
            addCriterion("dropType between", value1, value2, "droptype");
            return (Criteria) this;
        }

        public Criteria andDroptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dropType not between", value1, value2, "droptype");
            return (Criteria) this;
        }

        public Criteria andFullidLikeInsensitive(String value) {
            addCriterion("upper(fullId) like", value.toUpperCase(), "fullid");
            return (Criteria) this;
        }

        public Criteria andFlowidLikeInsensitive(String value) {
            addCriterion("upper(flowId) like", value.toUpperCase(), "flowid");
            return (Criteria) this;
        }

        public Criteria andOuttimeLikeInsensitive(String value) {
            addCriterion("upper(outTime) like", value.toUpperCase(), "outtime");
            return (Criteria) this;
        }

        public Criteria andManagertimeLikeInsensitive(String value) {
            addCriterion("upper(managerTime) like", value.toUpperCase(), "managertime");
            return (Criteria) this;
        }

        public Criteria andChannelLikeInsensitive(String value) {
            addCriterion("upper(channel) like", value.toUpperCase(), "channel");
            return (Criteria) this;
        }

        public Criteria andLocationLikeInsensitive(String value) {
            addCriterion("upper(location) like", value.toUpperCase(), "location");
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

        public Criteria andDepartmentLikeInsensitive(String value) {
            addCriterion("upper(department) like", value.toUpperCase(), "department");
            return (Criteria) this;
        }

        public Criteria andCustomeridLikeInsensitive(String value) {
            addCriterion("upper(customerId) like", value.toUpperCase(), "customerid");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLikeInsensitive(String value) {
            addCriterion("upper(invoiceId) like", value.toUpperCase(), "invoiceid");
            return (Criteria) this;
        }

        public Criteria andDutyidLikeInsensitive(String value) {
            addCriterion("upper(dutyId) like", value.toUpperCase(), "dutyid");
            return (Criteria) this;
        }

        public Criteria andCustomernameLikeInsensitive(String value) {
            addCriterion("upper(customerName) like", value.toUpperCase(), "customername");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andStaffernameLikeInsensitive(String value) {
            addCriterion("upper(stafferName) like", value.toUpperCase(), "staffername");
            return (Criteria) this;
        }

        public Criteria andConnectorLikeInsensitive(String value) {
            addCriterion("upper(connector) like", value.toUpperCase(), "connector");
            return (Criteria) this;
        }

        public Criteria andChecksLikeInsensitive(String value) {
            addCriterion("upper(checks) like", value.toUpperCase(), "checks");
            return (Criteria) this;
        }

        public Criteria andRedayLikeInsensitive(String value) {
            addCriterion("upper(reday) like", value.toUpperCase(), "reday");
            return (Criteria) this;
        }

        public Criteria andArrivedateLikeInsensitive(String value) {
            addCriterion("upper(arriveDate) like", value.toUpperCase(), "arrivedate");
            return (Criteria) this;
        }

        public Criteria andRedateLikeInsensitive(String value) {
            addCriterion("upper(redate) like", value.toUpperCase(), "redate");
            return (Criteria) this;
        }

        public Criteria andDepotpartidLikeInsensitive(String value) {
            addCriterion("upper(depotpartId) like", value.toUpperCase(), "depotpartid");
            return (Criteria) this;
        }

        public Criteria andDestinationidLikeInsensitive(String value) {
            addCriterion("upper(destinationId) like", value.toUpperCase(), "destinationid");
            return (Criteria) this;
        }

        public Criteria andTrannoLikeInsensitive(String value) {
            addCriterion("upper(tranNo) like", value.toUpperCase(), "tranno");
            return (Criteria) this;
        }

        public Criteria andRefoutfullidLikeInsensitive(String value) {
            addCriterion("upper(refOutFullId) like", value.toUpperCase(), "refoutfullid");
            return (Criteria) this;
        }

        public Criteria andStafferidLikeInsensitive(String value) {
            addCriterion("upper(stafferId) like", value.toUpperCase(), "stafferid");
            return (Criteria) this;
        }

        public Criteria andManageridLikeInsensitive(String value) {
            addCriterion("upper(managerId) like", value.toUpperCase(), "managerid");
            return (Criteria) this;
        }

        public Criteria andReserve4LikeInsensitive(String value) {
            addCriterion("upper(reserve4) like", value.toUpperCase(), "reserve4");
            return (Criteria) this;
        }

        public Criteria andReserve5LikeInsensitive(String value) {
            addCriterion("upper(reserve5) like", value.toUpperCase(), "reserve5");
            return (Criteria) this;
        }

        public Criteria andReserve6LikeInsensitive(String value) {
            addCriterion("upper(reserve6) like", value.toUpperCase(), "reserve6");
            return (Criteria) this;
        }

        public Criteria andReserve7LikeInsensitive(String value) {
            addCriterion("upper(reserve7) like", value.toUpperCase(), "reserve7");
            return (Criteria) this;
        }

        public Criteria andReserve8LikeInsensitive(String value) {
            addCriterion("upper(reserve8) like", value.toUpperCase(), "reserve8");
            return (Criteria) this;
        }

        public Criteria andReserve9LikeInsensitive(String value) {
            addCriterion("upper(reserve9) like", value.toUpperCase(), "reserve9");
            return (Criteria) this;
        }

        public Criteria andChangetimeLikeInsensitive(String value) {
            addCriterion("upper(changeTime) like", value.toUpperCase(), "changetime");
            return (Criteria) this;
        }

        public Criteria andSailtypeLikeInsensitive(String value) {
            addCriterion("upper(sailType) like", value.toUpperCase(), "sailtype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLikeInsensitive(String value) {
            addCriterion("upper(productType) like", value.toUpperCase(), "producttype");
            return (Criteria) this;
        }

        public Criteria andRatioLikeInsensitive(String value) {
            addCriterion("upper(ratio) like", value.toUpperCase(), "ratio");
            return (Criteria) this;
        }

        public Criteria andVtypefullidLikeInsensitive(String value) {
            addCriterion("upper(vtypeFullId) like", value.toUpperCase(), "vtypefullid");
            return (Criteria) this;
        }

        public Criteria andIndustryid3LikeInsensitive(String value) {
            addCriterion("upper(industryId3) like", value.toUpperCase(), "industryid3");
            return (Criteria) this;
        }

        public Criteria andPaytimeLikeInsensitive(String value) {
            addCriterion("upper(payTime) like", value.toUpperCase(), "paytime");
            return (Criteria) this;
        }

        public Criteria andEventidLikeInsensitive(String value) {
            addCriterion("upper(eventId) like", value.toUpperCase(), "eventid");
            return (Criteria) this;
        }

        public Criteria andRefbindoutidLikeInsensitive(String value) {
            addCriterion("upper(refBindOutId) like", value.toUpperCase(), "refbindoutid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedLikeInsensitive(String value) {
            addCriterion("upper(lastModified) like", value.toUpperCase(), "lastmodified");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(operator) like", value.toUpperCase(), "operator");
            return (Criteria) this;
        }

        public Criteria andOperatornameLikeInsensitive(String value) {
            addCriterion("upper(operatorName) like", value.toUpperCase(), "operatorname");
            return (Criteria) this;
        }

        public Criteria andLogtimeLikeInsensitive(String value) {
            addCriterion("upper(logTime) like", value.toUpperCase(), "logtime");
            return (Criteria) this;
        }

        public Criteria andGuarantorLikeInsensitive(String value) {
            addCriterion("upper(guarantor) like", value.toUpperCase(), "guarantor");
            return (Criteria) this;
        }

        public Criteria andPidutyidLikeInsensitive(String value) {
            addCriterion("upper(piDutyId) like", value.toUpperCase(), "pidutyid");
            return (Criteria) this;
        }

        public Criteria andPodateLikeInsensitive(String value) {
            addCriterion("upper(podate) like", value.toUpperCase(), "podate");
            return (Criteria) this;
        }

        public Criteria andReasonLikeInsensitive(String value) {
            addCriterion("upper(reason) like", value.toUpperCase(), "reason");
            return (Criteria) this;
        }

        public Criteria andTransportnoLikeInsensitive(String value) {
            addCriterion("upper(transportNo) like", value.toUpperCase(), "transportno");
            return (Criteria) this;
        }

        public Criteria andSwbzLikeInsensitive(String value) {
            addCriterion("upper(swbz) like", value.toUpperCase(), "swbz");
            return (Criteria) this;
        }

        public Criteria andOutbackstatusLikeInsensitive(String value) {
            addCriterion("upper(outbackStatus) like", value.toUpperCase(), "outbackstatus");
            return (Criteria) this;
        }

        public Criteria andFlowtimeLikeInsensitive(String value) {
            addCriterion("upper(flowTime) like", value.toUpperCase(), "flowtime");
            return (Criteria) this;
        }

        public Criteria andIbapplyidLikeInsensitive(String value) {
            addCriterion("upper(ibApplyId) like", value.toUpperCase(), "ibapplyid");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyidLikeInsensitive(String value) {
            addCriterion("upper(motivationApplyId) like", value.toUpperCase(), "motivationapplyid");
            return (Criteria) this;
        }

        public Criteria andRefgiftidLikeInsensitive(String value) {
            addCriterion("upper(refGiftId) like", value.toUpperCase(), "refgiftid");
            return (Criteria) this;
        }

        public Criteria andIbapplyid2LikeInsensitive(String value) {
            addCriterion("upper(ibApplyId2) like", value.toUpperCase(), "ibapplyid2");
            return (Criteria) this;
        }

        public Criteria andMotivationapplyid2LikeInsensitive(String value) {
            addCriterion("upper(motivationApplyId2) like", value.toUpperCase(), "motivationapplyid2");
            return (Criteria) this;
        }

        public Criteria andCustomerdescriptionLikeInsensitive(String value) {
            addCriterion("upper(customerDescription) like", value.toUpperCase(), "customerdescription");
            return (Criteria) this;
        }

        public Criteria andDeliveryLikeInsensitive(String value) {
            addCriterion("upper(delivery) like", value.toUpperCase(), "delivery");
            return (Criteria) this;
        }

        public Criteria andPospayerLikeInsensitive(String value) {
            addCriterion("upper(posPayer) like", value.toUpperCase(), "pospayer");
            return (Criteria) this;
        }

        public Criteria andRecommendationLikeInsensitive(String value) {
            addCriterion("upper(recommendation) like", value.toUpperCase(), "recommendation");
            return (Criteria) this;
        }

        public Criteria andPlatformapplyidLikeInsensitive(String value) {
            addCriterion("upper(platformApplyId) like", value.toUpperCase(), "platformapplyid");
            return (Criteria) this;
        }

        public Criteria andBuyreturnflagLikeInsensitive(String value) {
            addCriterion("upper(buyReturnFlag) like", value.toUpperCase(), "buyreturnflag");
            return (Criteria) this;
        }

        public Criteria andBuyreturntypeLikeInsensitive(String value) {
            addCriterion("upper(buyReturnType) like", value.toUpperCase(), "buyreturntype");
            return (Criteria) this;
        }

        public Criteria andProjectIdLikeInsensitive(String value) {
            addCriterion("upper(project_id) like", value.toUpperCase(), "projectId");
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