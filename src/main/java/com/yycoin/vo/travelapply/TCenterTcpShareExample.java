package com.yycoin.vo.travelapply;

import java.util.ArrayList;
import java.util.List;

public class TCenterTcpShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private int startRecordNum;

    private int recordIndex;

    private int numberOfRecordsToSelect;

    private String sortField;

    private String sortOrder;

    public TCenterTcpShareExample() {
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

        public Criteria andBudgetidIsNull() {
            addCriterion("budgetId is null");
            return (Criteria) this;
        }

        public Criteria andBudgetidIsNotNull() {
            addCriterion("budgetId is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetidEqualTo(String value) {
            addCriterion("budgetId =", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidNotEqualTo(String value) {
            addCriterion("budgetId <>", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidGreaterThan(String value) {
            addCriterion("budgetId >", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidGreaterThanOrEqualTo(String value) {
            addCriterion("budgetId >=", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidLessThan(String value) {
            addCriterion("budgetId <", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidLessThanOrEqualTo(String value) {
            addCriterion("budgetId <=", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidLike(String value) {
            addCriterion("budgetId like", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidNotLike(String value) {
            addCriterion("budgetId not like", value, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidIn(List<String> values) {
            addCriterion("budgetId in", values, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidNotIn(List<String> values) {
            addCriterion("budgetId not in", values, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidBetween(String value1, String value2) {
            addCriterion("budgetId between", value1, value2, "budgetid");
            return (Criteria) this;
        }

        public Criteria andBudgetidNotBetween(String value1, String value2) {
            addCriterion("budgetId not between", value1, value2, "budgetid");
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

        public Criteria andApproveridIsNull() {
            addCriterion("approverId is null");
            return (Criteria) this;
        }

        public Criteria andApproveridIsNotNull() {
            addCriterion("approverId is not null");
            return (Criteria) this;
        }

        public Criteria andApproveridEqualTo(String value) {
            addCriterion("approverId =", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridNotEqualTo(String value) {
            addCriterion("approverId <>", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridGreaterThan(String value) {
            addCriterion("approverId >", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridGreaterThanOrEqualTo(String value) {
            addCriterion("approverId >=", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridLessThan(String value) {
            addCriterion("approverId <", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridLessThanOrEqualTo(String value) {
            addCriterion("approverId <=", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridLike(String value) {
            addCriterion("approverId like", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridNotLike(String value) {
            addCriterion("approverId not like", value, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridIn(List<String> values) {
            addCriterion("approverId in", values, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridNotIn(List<String> values) {
            addCriterion("approverId not in", values, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridBetween(String value1, String value2) {
            addCriterion("approverId between", value1, value2, "approverid");
            return (Criteria) this;
        }

        public Criteria andApproveridNotBetween(String value1, String value2) {
            addCriterion("approverId not between", value1, value2, "approverid");
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

        public Criteria andRatioEqualTo(Integer value) {
            addCriterion("ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(Integer value) {
            addCriterion("ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(Integer value) {
            addCriterion("ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(Integer value) {
            addCriterion("ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(Integer value) {
            addCriterion("ratio <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<Integer> values) {
            addCriterion("ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<Integer> values) {
            addCriterion("ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(Integer value1, Integer value2) {
            addCriterion("ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("ratio not between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRealmoneryIsNull() {
            addCriterion("realMonery is null");
            return (Criteria) this;
        }

        public Criteria andRealmoneryIsNotNull() {
            addCriterion("realMonery is not null");
            return (Criteria) this;
        }

        public Criteria andRealmoneryEqualTo(Long value) {
            addCriterion("realMonery =", value, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryNotEqualTo(Long value) {
            addCriterion("realMonery <>", value, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryGreaterThan(Long value) {
            addCriterion("realMonery >", value, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryGreaterThanOrEqualTo(Long value) {
            addCriterion("realMonery >=", value, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryLessThan(Long value) {
            addCriterion("realMonery <", value, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryLessThanOrEqualTo(Long value) {
            addCriterion("realMonery <=", value, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryIn(List<Long> values) {
            addCriterion("realMonery in", values, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryNotIn(List<Long> values) {
            addCriterion("realMonery not in", values, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryBetween(Long value1, Long value2) {
            addCriterion("realMonery between", value1, value2, "realmonery");
            return (Criteria) this;
        }

        public Criteria andRealmoneryNotBetween(Long value1, Long value2) {
            addCriterion("realMonery not between", value1, value2, "realmonery");
            return (Criteria) this;
        }

        public Criteria andBearidIsNull() {
            addCriterion("bearId is null");
            return (Criteria) this;
        }

        public Criteria andBearidIsNotNull() {
            addCriterion("bearId is not null");
            return (Criteria) this;
        }

        public Criteria andBearidEqualTo(String value) {
            addCriterion("bearId =", value, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidNotEqualTo(String value) {
            addCriterion("bearId <>", value, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidGreaterThan(String value) {
            addCriterion("bearId >", value, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidGreaterThanOrEqualTo(String value) {
            addCriterion("bearId >=", value, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidLessThan(String value) {
            addCriterion("bearId <", value, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidLessThanOrEqualTo(String value) {
            addCriterion("bearId <=", value, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidLike(String value) {
            addCriterion("bearId like", value, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidNotLike(String value) {
            addCriterion("bearId not like", value, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidIn(List<String> values) {
            addCriterion("bearId in", values, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidNotIn(List<String> values) {
            addCriterion("bearId not in", values, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidBetween(String value1, String value2) {
            addCriterion("bearId between", value1, value2, "bearid");
            return (Criteria) this;
        }

        public Criteria andBearidNotBetween(String value1, String value2) {
            addCriterion("bearId not between", value1, value2, "bearid");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andRefidLikeInsensitive(String value) {
            addCriterion("upper(refId) like", value.toUpperCase(), "refid");
            return (Criteria) this;
        }

        public Criteria andBudgetidLikeInsensitive(String value) {
            addCriterion("upper(budgetId) like", value.toUpperCase(), "budgetid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLikeInsensitive(String value) {
            addCriterion("upper(departmentId) like", value.toUpperCase(), "departmentid");
            return (Criteria) this;
        }

        public Criteria andApproveridLikeInsensitive(String value) {
            addCriterion("upper(approverId) like", value.toUpperCase(), "approverid");
            return (Criteria) this;
        }

        public Criteria andBearidLikeInsensitive(String value) {
            addCriterion("upper(bearId) like", value.toUpperCase(), "bearid");
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