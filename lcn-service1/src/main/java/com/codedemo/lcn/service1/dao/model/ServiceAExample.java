package com.codedemo.lcn.service1.dao.model;

import java.util.ArrayList;
import java.util.List;

public class ServiceAExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceAExample() {
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

        public Criteria andServiceAIdIsNull() {
            addCriterion("service_a_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceAIdIsNotNull() {
            addCriterion("service_a_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAIdEqualTo(String value) {
            addCriterion("service_a_id =", value, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdNotEqualTo(String value) {
            addCriterion("service_a_id <>", value, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdGreaterThan(String value) {
            addCriterion("service_a_id >", value, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_a_id >=", value, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdLessThan(String value) {
            addCriterion("service_a_id <", value, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdLessThanOrEqualTo(String value) {
            addCriterion("service_a_id <=", value, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdLike(String value) {
            addCriterion("service_a_id like", value, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdNotLike(String value) {
            addCriterion("service_a_id not like", value, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdIn(List<String> values) {
            addCriterion("service_a_id in", values, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdNotIn(List<String> values) {
            addCriterion("service_a_id not in", values, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdBetween(String value1, String value2) {
            addCriterion("service_a_id between", value1, value2, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceAIdNotBetween(String value1, String value2) {
            addCriterion("service_a_id not between", value1, value2, "serviceAId");
            return (Criteria) this;
        }

        public Criteria andServiceANameIsNull() {
            addCriterion("service_a_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceANameIsNotNull() {
            addCriterion("service_a_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceANameEqualTo(String value) {
            addCriterion("service_a_name =", value, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameNotEqualTo(String value) {
            addCriterion("service_a_name <>", value, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameGreaterThan(String value) {
            addCriterion("service_a_name >", value, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameGreaterThanOrEqualTo(String value) {
            addCriterion("service_a_name >=", value, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameLessThan(String value) {
            addCriterion("service_a_name <", value, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameLessThanOrEqualTo(String value) {
            addCriterion("service_a_name <=", value, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameLike(String value) {
            addCriterion("service_a_name like", value, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameNotLike(String value) {
            addCriterion("service_a_name not like", value, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameIn(List<String> values) {
            addCriterion("service_a_name in", values, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameNotIn(List<String> values) {
            addCriterion("service_a_name not in", values, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameBetween(String value1, String value2) {
            addCriterion("service_a_name between", value1, value2, "serviceAName");
            return (Criteria) this;
        }

        public Criteria andServiceANameNotBetween(String value1, String value2) {
            addCriterion("service_a_name not between", value1, value2, "serviceAName");
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