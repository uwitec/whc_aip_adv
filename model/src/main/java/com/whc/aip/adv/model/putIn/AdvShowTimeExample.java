package com.whc.aip.adv.model.putIn;

import java.util.ArrayList;
import java.util.List;

public class AdvShowTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvShowTimeExample() {
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

        public Criteria andShowtimeIdIsNull() {
            addCriterion("SHOWTIME_ID is null");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdIsNotNull() {
            addCriterion("SHOWTIME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdEqualTo(String value) {
            addCriterion("SHOWTIME_ID =", value, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdNotEqualTo(String value) {
            addCriterion("SHOWTIME_ID <>", value, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdGreaterThan(String value) {
            addCriterion("SHOWTIME_ID >", value, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_ID >=", value, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdLessThan(String value) {
            addCriterion("SHOWTIME_ID <", value, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdLessThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_ID <=", value, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdLike(String value) {
            addCriterion("SHOWTIME_ID like", value, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdNotLike(String value) {
            addCriterion("SHOWTIME_ID not like", value, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdIn(List<String> values) {
            addCriterion("SHOWTIME_ID in", values, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdNotIn(List<String> values) {
            addCriterion("SHOWTIME_ID not in", values, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdBetween(String value1, String value2) {
            addCriterion("SHOWTIME_ID between", value1, value2, "showtimeId");
            return (Criteria) this;
        }

        public Criteria andShowtimeIdNotBetween(String value1, String value2) {
            addCriterion("SHOWTIME_ID not between", value1, value2, "showtimeId");
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

        public Criteria andShowtimeDateFromIsNull() {
            addCriterion("SHOWTIME_DATEFROM is null");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromIsNotNull() {
            addCriterion("SHOWTIME_DATEFROM is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromEqualTo(String value) {
            addCriterion("SHOWTIME_DATEFROM =", value, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromNotEqualTo(String value) {
            addCriterion("SHOWTIME_DATEFROM <>", value, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromGreaterThan(String value) {
            addCriterion("SHOWTIME_DATEFROM >", value, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_DATEFROM >=", value, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromLessThan(String value) {
            addCriterion("SHOWTIME_DATEFROM <", value, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromLessThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_DATEFROM <=", value, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromLike(String value) {
            addCriterion("SHOWTIME_DATEFROM like", value, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromNotLike(String value) {
            addCriterion("SHOWTIME_DATEFROM not like", value, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromIn(List<String> values) {
            addCriterion("SHOWTIME_DATEFROM in", values, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromNotIn(List<String> values) {
            addCriterion("SHOWTIME_DATEFROM not in", values, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromBetween(String value1, String value2) {
            addCriterion("SHOWTIME_DATEFROM between", value1, value2, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateFromNotBetween(String value1, String value2) {
            addCriterion("SHOWTIME_DATEFROM not between", value1, value2, "showtimeDateFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToIsNull() {
            addCriterion("SHOWTIME_DATETO is null");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToIsNotNull() {
            addCriterion("SHOWTIME_DATETO is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToEqualTo(String value) {
            addCriterion("SHOWTIME_DATETO =", value, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToNotEqualTo(String value) {
            addCriterion("SHOWTIME_DATETO <>", value, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToGreaterThan(String value) {
            addCriterion("SHOWTIME_DATETO >", value, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_DATETO >=", value, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToLessThan(String value) {
            addCriterion("SHOWTIME_DATETO <", value, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToLessThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_DATETO <=", value, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToLike(String value) {
            addCriterion("SHOWTIME_DATETO like", value, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToNotLike(String value) {
            addCriterion("SHOWTIME_DATETO not like", value, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToIn(List<String> values) {
            addCriterion("SHOWTIME_DATETO in", values, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToNotIn(List<String> values) {
            addCriterion("SHOWTIME_DATETO not in", values, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToBetween(String value1, String value2) {
            addCriterion("SHOWTIME_DATETO between", value1, value2, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDateToNotBetween(String value1, String value2) {
            addCriterion("SHOWTIME_DATETO not between", value1, value2, "showtimeDateTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromIsNull() {
            addCriterion("SHOWTIME_TIMEFROM is null");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromIsNotNull() {
            addCriterion("SHOWTIME_TIMEFROM is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromEqualTo(String value) {
            addCriterion("SHOWTIME_TIMEFROM =", value, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromNotEqualTo(String value) {
            addCriterion("SHOWTIME_TIMEFROM <>", value, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromGreaterThan(String value) {
            addCriterion("SHOWTIME_TIMEFROM >", value, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_TIMEFROM >=", value, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromLessThan(String value) {
            addCriterion("SHOWTIME_TIMEFROM <", value, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromLessThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_TIMEFROM <=", value, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromLike(String value) {
            addCriterion("SHOWTIME_TIMEFROM like", value, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromNotLike(String value) {
            addCriterion("SHOWTIME_TIMEFROM not like", value, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromIn(List<String> values) {
            addCriterion("SHOWTIME_TIMEFROM in", values, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromNotIn(List<String> values) {
            addCriterion("SHOWTIME_TIMEFROM not in", values, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromBetween(String value1, String value2) {
            addCriterion("SHOWTIME_TIMEFROM between", value1, value2, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeFromNotBetween(String value1, String value2) {
            addCriterion("SHOWTIME_TIMEFROM not between", value1, value2, "showtimeTimeFrom");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToIsNull() {
            addCriterion("SHOWTIME_TIMETO is null");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToIsNotNull() {
            addCriterion("SHOWTIME_TIMETO is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToEqualTo(String value) {
            addCriterion("SHOWTIME_TIMETO =", value, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToNotEqualTo(String value) {
            addCriterion("SHOWTIME_TIMETO <>", value, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToGreaterThan(String value) {
            addCriterion("SHOWTIME_TIMETO >", value, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_TIMETO >=", value, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToLessThan(String value) {
            addCriterion("SHOWTIME_TIMETO <", value, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToLessThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_TIMETO <=", value, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToLike(String value) {
            addCriterion("SHOWTIME_TIMETO like", value, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToNotLike(String value) {
            addCriterion("SHOWTIME_TIMETO not like", value, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToIn(List<String> values) {
            addCriterion("SHOWTIME_TIMETO in", values, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToNotIn(List<String> values) {
            addCriterion("SHOWTIME_TIMETO not in", values, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToBetween(String value1, String value2) {
            addCriterion("SHOWTIME_TIMETO between", value1, value2, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeTimeToNotBetween(String value1, String value2) {
            addCriterion("SHOWTIME_TIMETO not between", value1, value2, "showtimeTimeTo");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionIsNull() {
            addCriterion("SHOWTIME_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionIsNotNull() {
            addCriterion("SHOWTIME_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionEqualTo(String value) {
            addCriterion("SHOWTIME_DESCRIPTION =", value, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionNotEqualTo(String value) {
            addCriterion("SHOWTIME_DESCRIPTION <>", value, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionGreaterThan(String value) {
            addCriterion("SHOWTIME_DESCRIPTION >", value, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_DESCRIPTION >=", value, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionLessThan(String value) {
            addCriterion("SHOWTIME_DESCRIPTION <", value, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionLessThanOrEqualTo(String value) {
            addCriterion("SHOWTIME_DESCRIPTION <=", value, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionLike(String value) {
            addCriterion("SHOWTIME_DESCRIPTION like", value, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionNotLike(String value) {
            addCriterion("SHOWTIME_DESCRIPTION not like", value, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionIn(List<String> values) {
            addCriterion("SHOWTIME_DESCRIPTION in", values, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionNotIn(List<String> values) {
            addCriterion("SHOWTIME_DESCRIPTION not in", values, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionBetween(String value1, String value2) {
            addCriterion("SHOWTIME_DESCRIPTION between", value1, value2, "showtimeDescrIption");
            return (Criteria) this;
        }

        public Criteria andShowtimeDescrIptionNotBetween(String value1, String value2) {
            addCriterion("SHOWTIME_DESCRIPTION not between", value1, value2, "showtimeDescrIption");
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