package com.yycoin.vo;

import java.util.ArrayList;
import java.util.List;

public class TCenterDutyEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterDutyEntityExample() {
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

        public Criteria andIcpIsNull() {
            addCriterion("icp is null");
            return (Criteria) this;
        }

        public Criteria andIcpIsNotNull() {
            addCriterion("icp is not null");
            return (Criteria) this;
        }

        public Criteria andIcpEqualTo(String value) {
            addCriterion("icp =", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpNotEqualTo(String value) {
            addCriterion("icp <>", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpGreaterThan(String value) {
            addCriterion("icp >", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpGreaterThanOrEqualTo(String value) {
            addCriterion("icp >=", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpLessThan(String value) {
            addCriterion("icp <", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpLessThanOrEqualTo(String value) {
            addCriterion("icp <=", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpLike(String value) {
            addCriterion("icp like", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpNotLike(String value) {
            addCriterion("icp not like", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpIn(List<String> values) {
            addCriterion("icp in", values, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpNotIn(List<String> values) {
            addCriterion("icp not in", values, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpBetween(String value1, String value2) {
            addCriterion("icp between", value1, value2, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpNotBetween(String value1, String value2) {
            addCriterion("icp not between", value1, value2, "icp");
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

        public Criteria andDuesIsNull() {
            addCriterion("dues is null");
            return (Criteria) this;
        }

        public Criteria andDuesIsNotNull() {
            addCriterion("dues is not null");
            return (Criteria) this;
        }

        public Criteria andDuesEqualTo(Integer value) {
            addCriterion("dues =", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesNotEqualTo(Integer value) {
            addCriterion("dues <>", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesGreaterThan(Integer value) {
            addCriterion("dues >", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesGreaterThanOrEqualTo(Integer value) {
            addCriterion("dues >=", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesLessThan(Integer value) {
            addCriterion("dues <", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesLessThanOrEqualTo(Integer value) {
            addCriterion("dues <=", value, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesIn(List<Integer> values) {
            addCriterion("dues in", values, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesNotIn(List<Integer> values) {
            addCriterion("dues not in", values, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesBetween(Integer value1, Integer value2) {
            addCriterion("dues between", value1, value2, "dues");
            return (Criteria) this;
        }

        public Criteria andDuesNotBetween(Integer value1, Integer value2) {
            addCriterion("dues not between", value1, value2, "dues");
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

        public Criteria andShowtypeIsNull() {
            addCriterion("showType is null");
            return (Criteria) this;
        }

        public Criteria andShowtypeIsNotNull() {
            addCriterion("showType is not null");
            return (Criteria) this;
        }

        public Criteria andShowtypeEqualTo(Integer value) {
            addCriterion("showType =", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeNotEqualTo(Integer value) {
            addCriterion("showType <>", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeGreaterThan(Integer value) {
            addCriterion("showType >", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("showType >=", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeLessThan(Integer value) {
            addCriterion("showType <", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeLessThanOrEqualTo(Integer value) {
            addCriterion("showType <=", value, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeIn(List<Integer> values) {
            addCriterion("showType in", values, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeNotIn(List<Integer> values) {
            addCriterion("showType not in", values, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeBetween(Integer value1, Integer value2) {
            addCriterion("showType between", value1, value2, "showtype");
            return (Criteria) this;
        }

        public Criteria andShowtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("showType not between", value1, value2, "showtype");
            return (Criteria) this;
        }

        public Criteria andInvoicerIsNull() {
            addCriterion("invoicer is null");
            return (Criteria) this;
        }

        public Criteria andInvoicerIsNotNull() {
            addCriterion("invoicer is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicerEqualTo(String value) {
            addCriterion("invoicer =", value, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerNotEqualTo(String value) {
            addCriterion("invoicer <>", value, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerGreaterThan(String value) {
            addCriterion("invoicer >", value, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerGreaterThanOrEqualTo(String value) {
            addCriterion("invoicer >=", value, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerLessThan(String value) {
            addCriterion("invoicer <", value, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerLessThanOrEqualTo(String value) {
            addCriterion("invoicer <=", value, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerLike(String value) {
            addCriterion("invoicer like", value, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerNotLike(String value) {
            addCriterion("invoicer not like", value, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerIn(List<String> values) {
            addCriterion("invoicer in", values, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerNotIn(List<String> values) {
            addCriterion("invoicer not in", values, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerBetween(String value1, String value2) {
            addCriterion("invoicer between", value1, value2, "invoicer");
            return (Criteria) this;
        }

        public Criteria andInvoicerNotBetween(String value1, String value2) {
            addCriterion("invoicer not between", value1, value2, "invoicer");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andIcpLikeInsensitive(String value) {
            addCriterion("upper(icp) like", value.toUpperCase(), "icp");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andInvoicerLikeInsensitive(String value) {
            addCriterion("upper(invoicer) like", value.toUpperCase(), "invoicer");
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