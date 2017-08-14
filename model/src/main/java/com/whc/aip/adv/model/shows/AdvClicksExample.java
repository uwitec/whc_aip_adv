package com.whc.aip.adv.model.shows;

import java.util.ArrayList;
import java.util.List;

public class AdvClicksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvClicksExample() {
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

        public Criteria andClicksIdIsNull() {
            addCriterion("CLICKS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClicksIdIsNotNull() {
            addCriterion("CLICKS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClicksIdEqualTo(String value) {
            addCriterion("CLICKS_ID =", value, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdNotEqualTo(String value) {
            addCriterion("CLICKS_ID <>", value, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdGreaterThan(String value) {
            addCriterion("CLICKS_ID >", value, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLICKS_ID >=", value, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdLessThan(String value) {
            addCriterion("CLICKS_ID <", value, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdLessThanOrEqualTo(String value) {
            addCriterion("CLICKS_ID <=", value, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdLike(String value) {
            addCriterion("CLICKS_ID like", value, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdNotLike(String value) {
            addCriterion("CLICKS_ID not like", value, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdIn(List<String> values) {
            addCriterion("CLICKS_ID in", values, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdNotIn(List<String> values) {
            addCriterion("CLICKS_ID not in", values, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdBetween(String value1, String value2) {
            addCriterion("CLICKS_ID between", value1, value2, "clicksId");
            return (Criteria) this;
        }

        public Criteria andClicksIdNotBetween(String value1, String value2) {
            addCriterion("CLICKS_ID not between", value1, value2, "clicksId");
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

        public Criteria andContentIdIsNull() {
            addCriterion("CONTENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("CONTENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(String value) {
            addCriterion("CONTENT_ID =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(String value) {
            addCriterion("CONTENT_ID <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(String value) {
            addCriterion("CONTENT_ID >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_ID >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(String value) {
            addCriterion("CONTENT_ID <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_ID <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLike(String value) {
            addCriterion("CONTENT_ID like", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotLike(String value) {
            addCriterion("CONTENT_ID not like", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<String> values) {
            addCriterion("CONTENT_ID in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<String> values) {
            addCriterion("CONTENT_ID not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(String value1, String value2) {
            addCriterion("CONTENT_ID between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(String value1, String value2) {
            addCriterion("CONTENT_ID not between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdIsNull() {
            addCriterion("CLICKS_USERID is null");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdIsNotNull() {
            addCriterion("CLICKS_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdEqualTo(String value) {
            addCriterion("CLICKS_USERID =", value, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdNotEqualTo(String value) {
            addCriterion("CLICKS_USERID <>", value, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdGreaterThan(String value) {
            addCriterion("CLICKS_USERID >", value, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLICKS_USERID >=", value, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdLessThan(String value) {
            addCriterion("CLICKS_USERID <", value, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdLessThanOrEqualTo(String value) {
            addCriterion("CLICKS_USERID <=", value, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdLike(String value) {
            addCriterion("CLICKS_USERID like", value, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdNotLike(String value) {
            addCriterion("CLICKS_USERID not like", value, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdIn(List<String> values) {
            addCriterion("CLICKS_USERID in", values, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdNotIn(List<String> values) {
            addCriterion("CLICKS_USERID not in", values, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdBetween(String value1, String value2) {
            addCriterion("CLICKS_USERID between", value1, value2, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksUserIdNotBetween(String value1, String value2) {
            addCriterion("CLICKS_USERID not between", value1, value2, "clicksUserId");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeIsNull() {
            addCriterion("CLICKS_PHONETYPE is null");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeIsNotNull() {
            addCriterion("CLICKS_PHONETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeEqualTo(String value) {
            addCriterion("CLICKS_PHONETYPE =", value, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeNotEqualTo(String value) {
            addCriterion("CLICKS_PHONETYPE <>", value, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeGreaterThan(String value) {
            addCriterion("CLICKS_PHONETYPE >", value, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLICKS_PHONETYPE >=", value, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeLessThan(String value) {
            addCriterion("CLICKS_PHONETYPE <", value, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeLessThanOrEqualTo(String value) {
            addCriterion("CLICKS_PHONETYPE <=", value, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeLike(String value) {
            addCriterion("CLICKS_PHONETYPE like", value, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeNotLike(String value) {
            addCriterion("CLICKS_PHONETYPE not like", value, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeIn(List<String> values) {
            addCriterion("CLICKS_PHONETYPE in", values, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeNotIn(List<String> values) {
            addCriterion("CLICKS_PHONETYPE not in", values, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeBetween(String value1, String value2) {
            addCriterion("CLICKS_PHONETYPE between", value1, value2, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksPhonetypeNotBetween(String value1, String value2) {
            addCriterion("CLICKS_PHONETYPE not between", value1, value2, "clicksPhonetype");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpIsNull() {
            addCriterion("CLICKS_USERIP is null");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpIsNotNull() {
            addCriterion("CLICKS_USERIP is not null");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpEqualTo(String value) {
            addCriterion("CLICKS_USERIP =", value, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpNotEqualTo(String value) {
            addCriterion("CLICKS_USERIP <>", value, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpGreaterThan(String value) {
            addCriterion("CLICKS_USERIP >", value, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("CLICKS_USERIP >=", value, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpLessThan(String value) {
            addCriterion("CLICKS_USERIP <", value, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpLessThanOrEqualTo(String value) {
            addCriterion("CLICKS_USERIP <=", value, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpLike(String value) {
            addCriterion("CLICKS_USERIP like", value, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpNotLike(String value) {
            addCriterion("CLICKS_USERIP not like", value, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpIn(List<String> values) {
            addCriterion("CLICKS_USERIP in", values, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpNotIn(List<String> values) {
            addCriterion("CLICKS_USERIP not in", values, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpBetween(String value1, String value2) {
            addCriterion("CLICKS_USERIP between", value1, value2, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksUserIpNotBetween(String value1, String value2) {
            addCriterion("CLICKS_USERIP not between", value1, value2, "clicksUserIp");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdIsNull() {
            addCriterion("CLICKS_WAHOCEID is null");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdIsNotNull() {
            addCriterion("CLICKS_WAHOCEID is not null");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdEqualTo(String value) {
            addCriterion("CLICKS_WAHOCEID =", value, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdNotEqualTo(String value) {
            addCriterion("CLICKS_WAHOCEID <>", value, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdGreaterThan(String value) {
            addCriterion("CLICKS_WAHOCEID >", value, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLICKS_WAHOCEID >=", value, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdLessThan(String value) {
            addCriterion("CLICKS_WAHOCEID <", value, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdLessThanOrEqualTo(String value) {
            addCriterion("CLICKS_WAHOCEID <=", value, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdLike(String value) {
            addCriterion("CLICKS_WAHOCEID like", value, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdNotLike(String value) {
            addCriterion("CLICKS_WAHOCEID not like", value, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdIn(List<String> values) {
            addCriterion("CLICKS_WAHOCEID in", values, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdNotIn(List<String> values) {
            addCriterion("CLICKS_WAHOCEID not in", values, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdBetween(String value1, String value2) {
            addCriterion("CLICKS_WAHOCEID between", value1, value2, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksWahoceIdNotBetween(String value1, String value2) {
            addCriterion("CLICKS_WAHOCEID not between", value1, value2, "clicksWahoceId");
            return (Criteria) this;
        }

        public Criteria andClicksTimeIsNull() {
            addCriterion("CLICKS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClicksTimeIsNotNull() {
            addCriterion("CLICKS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClicksTimeEqualTo(String value) {
            addCriterion("CLICKS_TIME =", value, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeNotEqualTo(String value) {
            addCriterion("CLICKS_TIME <>", value, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeGreaterThan(String value) {
            addCriterion("CLICKS_TIME >", value, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CLICKS_TIME >=", value, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeLessThan(String value) {
            addCriterion("CLICKS_TIME <", value, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeLessThanOrEqualTo(String value) {
            addCriterion("CLICKS_TIME <=", value, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeLike(String value) {
            addCriterion("CLICKS_TIME like", value, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeNotLike(String value) {
            addCriterion("CLICKS_TIME not like", value, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeIn(List<String> values) {
            addCriterion("CLICKS_TIME in", values, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeNotIn(List<String> values) {
            addCriterion("CLICKS_TIME not in", values, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeBetween(String value1, String value2) {
            addCriterion("CLICKS_TIME between", value1, value2, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTimeNotBetween(String value1, String value2) {
            addCriterion("CLICKS_TIME not between", value1, value2, "clicksTime");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountIsNull() {
            addCriterion("CLICKS_TELRESERVECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountIsNotNull() {
            addCriterion("CLICKS_TELRESERVECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountEqualTo(String value) {
            addCriterion("CLICKS_TELRESERVECOUNT =", value, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountNotEqualTo(String value) {
            addCriterion("CLICKS_TELRESERVECOUNT <>", value, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountGreaterThan(String value) {
            addCriterion("CLICKS_TELRESERVECOUNT >", value, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountGreaterThanOrEqualTo(String value) {
            addCriterion("CLICKS_TELRESERVECOUNT >=", value, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountLessThan(String value) {
            addCriterion("CLICKS_TELRESERVECOUNT <", value, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountLessThanOrEqualTo(String value) {
            addCriterion("CLICKS_TELRESERVECOUNT <=", value, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountLike(String value) {
            addCriterion("CLICKS_TELRESERVECOUNT like", value, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountNotLike(String value) {
            addCriterion("CLICKS_TELRESERVECOUNT not like", value, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountIn(List<String> values) {
            addCriterion("CLICKS_TELRESERVECOUNT in", values, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountNotIn(List<String> values) {
            addCriterion("CLICKS_TELRESERVECOUNT not in", values, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountBetween(String value1, String value2) {
            addCriterion("CLICKS_TELRESERVECOUNT between", value1, value2, "clicksTelreservecount");
            return (Criteria) this;
        }

        public Criteria andClicksTelreservecountNotBetween(String value1, String value2) {
            addCriterion("CLICKS_TELRESERVECOUNT not between", value1, value2, "clicksTelreservecount");
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