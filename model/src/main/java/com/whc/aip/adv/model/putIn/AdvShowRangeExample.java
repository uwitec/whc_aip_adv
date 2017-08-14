package com.whc.aip.adv.model.putIn;

import java.util.ArrayList;
import java.util.List;

public class AdvShowRangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvShowRangeExample() {
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

        public Criteria andShowrangeIdIsNull() {
            addCriterion("SHOWRANGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdIsNotNull() {
            addCriterion("SHOWRANGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdEqualTo(String value) {
            addCriterion("SHOWRANGE_ID =", value, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdNotEqualTo(String value) {
            addCriterion("SHOWRANGE_ID <>", value, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdGreaterThan(String value) {
            addCriterion("SHOWRANGE_ID >", value, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_ID >=", value, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdLessThan(String value) {
            addCriterion("SHOWRANGE_ID <", value, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdLessThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_ID <=", value, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdLike(String value) {
            addCriterion("SHOWRANGE_ID like", value, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdNotLike(String value) {
            addCriterion("SHOWRANGE_ID not like", value, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdIn(List<String> values) {
            addCriterion("SHOWRANGE_ID in", values, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdNotIn(List<String> values) {
            addCriterion("SHOWRANGE_ID not in", values, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_ID between", value1, value2, "showrangeId");
            return (Criteria) this;
        }

        public Criteria andShowrangeIdNotBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_ID not between", value1, value2, "showrangeId");
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

        public Criteria andShowrangeWahoIdIsNull() {
            addCriterion("SHOWRANGE_WAHOID is null");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdIsNotNull() {
            addCriterion("SHOWRANGE_WAHOID is not null");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdEqualTo(String value) {
            addCriterion("SHOWRANGE_WAHOID =", value, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdNotEqualTo(String value) {
            addCriterion("SHOWRANGE_WAHOID <>", value, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdGreaterThan(String value) {
            addCriterion("SHOWRANGE_WAHOID >", value, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_WAHOID >=", value, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdLessThan(String value) {
            addCriterion("SHOWRANGE_WAHOID <", value, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdLessThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_WAHOID <=", value, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdLike(String value) {
            addCriterion("SHOWRANGE_WAHOID like", value, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdNotLike(String value) {
            addCriterion("SHOWRANGE_WAHOID not like", value, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdIn(List<String> values) {
            addCriterion("SHOWRANGE_WAHOID in", values, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdNotIn(List<String> values) {
            addCriterion("SHOWRANGE_WAHOID not in", values, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_WAHOID between", value1, value2, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangeWahoIdNotBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_WAHOID not between", value1, value2, "showrangeWahoId");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeIsNull() {
            addCriterion("SHOWRANGE_PROPERTYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeIsNotNull() {
            addCriterion("SHOWRANGE_PROPERTYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeEqualTo(String value) {
            addCriterion("SHOWRANGE_PROPERTYTYPE =", value, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeNotEqualTo(String value) {
            addCriterion("SHOWRANGE_PROPERTYTYPE <>", value, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeGreaterThan(String value) {
            addCriterion("SHOWRANGE_PROPERTYTYPE >", value, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_PROPERTYTYPE >=", value, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeLessThan(String value) {
            addCriterion("SHOWRANGE_PROPERTYTYPE <", value, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeLessThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_PROPERTYTYPE <=", value, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeLike(String value) {
            addCriterion("SHOWRANGE_PROPERTYTYPE like", value, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeNotLike(String value) {
            addCriterion("SHOWRANGE_PROPERTYTYPE not like", value, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeIn(List<String> values) {
            addCriterion("SHOWRANGE_PROPERTYTYPE in", values, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeNotIn(List<String> values) {
            addCriterion("SHOWRANGE_PROPERTYTYPE not in", values, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_PROPERTYTYPE between", value1, value2, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePropertytypeNotBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_PROPERTYTYPE not between", value1, value2, "showrangePropertytype");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceIsNull() {
            addCriterion("SHOWRANGE_PRINCE is null");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceIsNotNull() {
            addCriterion("SHOWRANGE_PRINCE is not null");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceEqualTo(String value) {
            addCriterion("SHOWRANGE_PRINCE =", value, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceNotEqualTo(String value) {
            addCriterion("SHOWRANGE_PRINCE <>", value, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceGreaterThan(String value) {
            addCriterion("SHOWRANGE_PRINCE >", value, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_PRINCE >=", value, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceLessThan(String value) {
            addCriterion("SHOWRANGE_PRINCE <", value, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceLessThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_PRINCE <=", value, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceLike(String value) {
            addCriterion("SHOWRANGE_PRINCE like", value, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceNotLike(String value) {
            addCriterion("SHOWRANGE_PRINCE not like", value, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceIn(List<String> values) {
            addCriterion("SHOWRANGE_PRINCE in", values, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceNotIn(List<String> values) {
            addCriterion("SHOWRANGE_PRINCE not in", values, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_PRINCE between", value1, value2, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangePrinceNotBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_PRINCE not between", value1, value2, "showrangePrince");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityIsNull() {
            addCriterion("SHOWRANGE_CITY is null");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityIsNotNull() {
            addCriterion("SHOWRANGE_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityEqualTo(String value) {
            addCriterion("SHOWRANGE_CITY =", value, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityNotEqualTo(String value) {
            addCriterion("SHOWRANGE_CITY <>", value, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityGreaterThan(String value) {
            addCriterion("SHOWRANGE_CITY >", value, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_CITY >=", value, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityLessThan(String value) {
            addCriterion("SHOWRANGE_CITY <", value, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityLessThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_CITY <=", value, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityLike(String value) {
            addCriterion("SHOWRANGE_CITY like", value, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityNotLike(String value) {
            addCriterion("SHOWRANGE_CITY not like", value, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityIn(List<String> values) {
            addCriterion("SHOWRANGE_CITY in", values, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityNotIn(List<String> values) {
            addCriterion("SHOWRANGE_CITY not in", values, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_CITY between", value1, value2, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeCityNotBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_CITY not between", value1, value2, "showrangeCity");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionIsNull() {
            addCriterion("SHOWRANGE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionIsNotNull() {
            addCriterion("SHOWRANGE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionEqualTo(String value) {
            addCriterion("SHOWRANGE_DESCRIPTION =", value, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionNotEqualTo(String value) {
            addCriterion("SHOWRANGE_DESCRIPTION <>", value, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionGreaterThan(String value) {
            addCriterion("SHOWRANGE_DESCRIPTION >", value, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_DESCRIPTION >=", value, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionLessThan(String value) {
            addCriterion("SHOWRANGE_DESCRIPTION <", value, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("SHOWRANGE_DESCRIPTION <=", value, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionLike(String value) {
            addCriterion("SHOWRANGE_DESCRIPTION like", value, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionNotLike(String value) {
            addCriterion("SHOWRANGE_DESCRIPTION not like", value, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionIn(List<String> values) {
            addCriterion("SHOWRANGE_DESCRIPTION in", values, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionNotIn(List<String> values) {
            addCriterion("SHOWRANGE_DESCRIPTION not in", values, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_DESCRIPTION between", value1, value2, "showrangeDescription");
            return (Criteria) this;
        }

        public Criteria andShowrangeDescriptionNotBetween(String value1, String value2) {
            addCriterion("SHOWRANGE_DESCRIPTION not between", value1, value2, "showrangeDescription");
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