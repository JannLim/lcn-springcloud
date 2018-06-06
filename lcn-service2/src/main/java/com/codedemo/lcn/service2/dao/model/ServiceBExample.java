package com.codedemo.lcn.service2.dao.model;

import java.util.ArrayList;
import java.util.List;

public class ServiceBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceBExample() {
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

        public Criteria andServiceBIdIsNull() {
            addCriterion("service_b_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceBIdIsNotNull() {
            addCriterion("service_b_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceBIdEqualTo(String value) {
            addCriterion("service_b_id =", value, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdNotEqualTo(String value) {
            addCriterion("service_b_id <>", value, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdGreaterThan(String value) {
            addCriterion("service_b_id >", value, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_b_id >=", value, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdLessThan(String value) {
            addCriterion("service_b_id <", value, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdLessThanOrEqualTo(String value) {
            addCriterion("service_b_id <=", value, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdLike(String value) {
            addCriterion("service_b_id like", value, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdNotLike(String value) {
            addCriterion("service_b_id not like", value, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdIn(List<String> values) {
            addCriterion("service_b_id in", values, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdNotIn(List<String> values) {
            addCriterion("service_b_id not in", values, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdBetween(String value1, String value2) {
            addCriterion("service_b_id between", value1, value2, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBIdNotBetween(String value1, String value2) {
            addCriterion("service_b_id not between", value1, value2, "serviceBId");
            return (Criteria) this;
        }

        public Criteria andServiceBNameIsNull() {
            addCriterion("service_b_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceBNameIsNotNull() {
            addCriterion("service_b_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceBNameEqualTo(String value) {
            addCriterion("service_b_name =", value, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameNotEqualTo(String value) {
            addCriterion("service_b_name <>", value, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameGreaterThan(String value) {
            addCriterion("service_b_name >", value, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_b_name >=", value, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameLessThan(String value) {
            addCriterion("service_b_name <", value, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameLessThanOrEqualTo(String value) {
            addCriterion("service_b_name <=", value, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameLike(String value) {
            addCriterion("service_b_name like", value, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameNotLike(String value) {
            addCriterion("service_b_name not like", value, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameIn(List<String> values) {
            addCriterion("service_b_name in", values, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameNotIn(List<String> values) {
            addCriterion("service_b_name not in", values, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameBetween(String value1, String value2) {
            addCriterion("service_b_name between", value1, value2, "serviceBName");
            return (Criteria) this;
        }

        public Criteria andServiceBNameNotBetween(String value1, String value2) {
            addCriterion("service_b_name not between", value1, value2, "serviceBName");
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