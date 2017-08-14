package com.whc.aip.adv.model.shows;

import java.util.ArrayList;
import java.util.List;

public class AdvShowsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvShowsExample() {
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

        public Criteria andShowsIdIsNull() {
            addCriterion("SHOWS_ID is null");
            return (Criteria) this;
        }

        public Criteria andShowsIdIsNotNull() {
            addCriterion("SHOWS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShowsIdEqualTo(String value) {
            addCriterion("SHOWS_ID =", value, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdNotEqualTo(String value) {
            addCriterion("SHOWS_ID <>", value, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdGreaterThan(String value) {
            addCriterion("SHOWS_ID >", value, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWS_ID >=", value, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdLessThan(String value) {
            addCriterion("SHOWS_ID <", value, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdLessThanOrEqualTo(String value) {
            addCriterion("SHOWS_ID <=", value, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdLike(String value) {
            addCriterion("SHOWS_ID like", value, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdNotLike(String value) {
            addCriterion("SHOWS_ID not like", value, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdIn(List<String> values) {
            addCriterion("SHOWS_ID in", values, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdNotIn(List<String> values) {
            addCriterion("SHOWS_ID not in", values, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdBetween(String value1, String value2) {
            addCriterion("SHOWS_ID between", value1, value2, "showsId");
            return (Criteria) this;
        }

        public Criteria andShowsIdNotBetween(String value1, String value2) {
            addCriterion("SHOWS_ID not between", value1, value2, "showsId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("ACTIVITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("ACTIVITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("ACTIVITY_ID =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("ACTIVITY_ID <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("ACTIVITY_ID >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("ACTIVITY_ID <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("ACTIVITY_ID like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("ACTIVITY_ID not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("ACTIVITY_ID in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("ACTIVITY_ID not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdIsNull() {
            addCriterion("SHOWS_WAHOID is null");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdIsNotNull() {
            addCriterion("SHOWS_WAHOID is not null");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdEqualTo(String value) {
            addCriterion("SHOWS_WAHOID =", value, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdNotEqualTo(String value) {
            addCriterion("SHOWS_WAHOID <>", value, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdGreaterThan(String value) {
            addCriterion("SHOWS_WAHOID >", value, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWS_WAHOID >=", value, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdLessThan(String value) {
            addCriterion("SHOWS_WAHOID <", value, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdLessThanOrEqualTo(String value) {
            addCriterion("SHOWS_WAHOID <=", value, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdLike(String value) {
            addCriterion("SHOWS_WAHOID like", value, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdNotLike(String value) {
            addCriterion("SHOWS_WAHOID not like", value, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdIn(List<String> values) {
            addCriterion("SHOWS_WAHOID in", values, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdNotIn(List<String> values) {
            addCriterion("SHOWS_WAHOID not in", values, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdBetween(String value1, String value2) {
            addCriterion("SHOWS_WAHOID between", value1, value2, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsWahoIdNotBetween(String value1, String value2) {
            addCriterion("SHOWS_WAHOID not between", value1, value2, "showsWahoId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdIsNull() {
            addCriterion("SHOWS_USERID is null");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdIsNotNull() {
            addCriterion("SHOWS_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdEqualTo(String value) {
            addCriterion("SHOWS_USERID =", value, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdNotEqualTo(String value) {
            addCriterion("SHOWS_USERID <>", value, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdGreaterThan(String value) {
            addCriterion("SHOWS_USERID >", value, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWS_USERID >=", value, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdLessThan(String value) {
            addCriterion("SHOWS_USERID <", value, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdLessThanOrEqualTo(String value) {
            addCriterion("SHOWS_USERID <=", value, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdLike(String value) {
            addCriterion("SHOWS_USERID like", value, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdNotLike(String value) {
            addCriterion("SHOWS_USERID not like", value, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdIn(List<String> values) {
            addCriterion("SHOWS_USERID in", values, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdNotIn(List<String> values) {
            addCriterion("SHOWS_USERID not in", values, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdBetween(String value1, String value2) {
            addCriterion("SHOWS_USERID between", value1, value2, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsUserIdNotBetween(String value1, String value2) {
            addCriterion("SHOWS_USERID not between", value1, value2, "showsUserId");
            return (Criteria) this;
        }

        public Criteria andShowsTimeIsNull() {
            addCriterion("SHOWS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andShowsTimeIsNotNull() {
            addCriterion("SHOWS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andShowsTimeEqualTo(String value) {
            addCriterion("SHOWS_TIME =", value, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeNotEqualTo(String value) {
            addCriterion("SHOWS_TIME <>", value, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeGreaterThan(String value) {
            addCriterion("SHOWS_TIME >", value, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWS_TIME >=", value, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeLessThan(String value) {
            addCriterion("SHOWS_TIME <", value, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeLessThanOrEqualTo(String value) {
            addCriterion("SHOWS_TIME <=", value, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeLike(String value) {
            addCriterion("SHOWS_TIME like", value, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeNotLike(String value) {
            addCriterion("SHOWS_TIME not like", value, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeIn(List<String> values) {
            addCriterion("SHOWS_TIME in", values, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeNotIn(List<String> values) {
            addCriterion("SHOWS_TIME not in", values, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeBetween(String value1, String value2) {
            addCriterion("SHOWS_TIME between", value1, value2, "showsTime");
            return (Criteria) this;
        }

        public Criteria andShowsTimeNotBetween(String value1, String value2) {
            addCriterion("SHOWS_TIME not between", value1, value2, "showsTime");
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