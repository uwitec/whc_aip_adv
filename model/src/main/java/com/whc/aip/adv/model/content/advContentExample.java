package com.whc.aip.adv.model.content;

import java.util.ArrayList;
import java.util.List;

public class advContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public advContentExample() {
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

        public Criteria andContentTitleIsNull() {
            addCriterion("CONTENT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andContentTitleIsNotNull() {
            addCriterion("CONTENT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andContentTitleEqualTo(String value) {
            addCriterion("CONTENT_TITLE =", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotEqualTo(String value) {
            addCriterion("CONTENT_TITLE <>", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleGreaterThan(String value) {
            addCriterion("CONTENT_TITLE >", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_TITLE >=", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLessThan(String value) {
            addCriterion("CONTENT_TITLE <", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_TITLE <=", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleLike(String value) {
            addCriterion("CONTENT_TITLE like", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotLike(String value) {
            addCriterion("CONTENT_TITLE not like", value, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleIn(List<String> values) {
            addCriterion("CONTENT_TITLE in", values, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotIn(List<String> values) {
            addCriterion("CONTENT_TITLE not in", values, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleBetween(String value1, String value2) {
            addCriterion("CONTENT_TITLE between", value1, value2, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentTitleNotBetween(String value1, String value2) {
            addCriterion("CONTENT_TITLE not between", value1, value2, "contentTitle");
            return (Criteria) this;
        }

        public Criteria andContentImageurlIsNull() {
            addCriterion("CONTENT_IMAGEURL is null");
            return (Criteria) this;
        }

        public Criteria andContentImageurlIsNotNull() {
            addCriterion("CONTENT_IMAGEURL is not null");
            return (Criteria) this;
        }

        public Criteria andContentImageurlEqualTo(String value) {
            addCriterion("CONTENT_IMAGEURL =", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlNotEqualTo(String value) {
            addCriterion("CONTENT_IMAGEURL <>", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlGreaterThan(String value) {
            addCriterion("CONTENT_IMAGEURL >", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_IMAGEURL >=", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlLessThan(String value) {
            addCriterion("CONTENT_IMAGEURL <", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_IMAGEURL <=", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlLike(String value) {
            addCriterion("CONTENT_IMAGEURL like", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlNotLike(String value) {
            addCriterion("CONTENT_IMAGEURL not like", value, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlIn(List<String> values) {
            addCriterion("CONTENT_IMAGEURL in", values, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlNotIn(List<String> values) {
            addCriterion("CONTENT_IMAGEURL not in", values, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlBetween(String value1, String value2) {
            addCriterion("CONTENT_IMAGEURL between", value1, value2, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentImageurlNotBetween(String value1, String value2) {
            addCriterion("CONTENT_IMAGEURL not between", value1, value2, "contentImageurl");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("CONTENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("CONTENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(String value) {
            addCriterion("CONTENT_TYPE =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(String value) {
            addCriterion("CONTENT_TYPE <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(String value) {
            addCriterion("CONTENT_TYPE >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(String value) {
            addCriterion("CONTENT_TYPE <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_TYPE <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLike(String value) {
            addCriterion("CONTENT_TYPE like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotLike(String value) {
            addCriterion("CONTENT_TYPE not like", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<String> values) {
            addCriterion("CONTENT_TYPE in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<String> values) {
            addCriterion("CONTENT_TYPE not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(String value1, String value2) {
            addCriterion("CONTENT_TYPE not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentUrlIsNull() {
            addCriterion("CONTENT_URL is null");
            return (Criteria) this;
        }

        public Criteria andContentUrlIsNotNull() {
            addCriterion("CONTENT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andContentUrlEqualTo(String value) {
            addCriterion("CONTENT_URL =", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotEqualTo(String value) {
            addCriterion("CONTENT_URL <>", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlGreaterThan(String value) {
            addCriterion("CONTENT_URL >", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_URL >=", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLessThan(String value) {
            addCriterion("CONTENT_URL <", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_URL <=", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLike(String value) {
            addCriterion("CONTENT_URL like", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotLike(String value) {
            addCriterion("CONTENT_URL not like", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlIn(List<String> values) {
            addCriterion("CONTENT_URL in", values, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotIn(List<String> values) {
            addCriterion("CONTENT_URL not in", values, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlBetween(String value1, String value2) {
            addCriterion("CONTENT_URL between", value1, value2, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotBetween(String value1, String value2) {
            addCriterion("CONTENT_URL not between", value1, value2, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentIndexIsNull() {
            addCriterion("CONTENT_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andContentIndexIsNotNull() {
            addCriterion("CONTENT_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andContentIndexEqualTo(String value) {
            addCriterion("CONTENT_INDEX =", value, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexNotEqualTo(String value) {
            addCriterion("CONTENT_INDEX <>", value, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexGreaterThan(String value) {
            addCriterion("CONTENT_INDEX >", value, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_INDEX >=", value, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexLessThan(String value) {
            addCriterion("CONTENT_INDEX <", value, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_INDEX <=", value, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexLike(String value) {
            addCriterion("CONTENT_INDEX like", value, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexNotLike(String value) {
            addCriterion("CONTENT_INDEX not like", value, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexIn(List<String> values) {
            addCriterion("CONTENT_INDEX in", values, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexNotIn(List<String> values) {
            addCriterion("CONTENT_INDEX not in", values, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexBetween(String value1, String value2) {
            addCriterion("CONTENT_INDEX between", value1, value2, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentIndexNotBetween(String value1, String value2) {
            addCriterion("CONTENT_INDEX not between", value1, value2, "contentIndex");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionIsNull() {
            addCriterion("CONTENT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionIsNotNull() {
            addCriterion("CONTENT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionEqualTo(String value) {
            addCriterion("CONTENT_DESCRIPTION =", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionNotEqualTo(String value) {
            addCriterion("CONTENT_DESCRIPTION <>", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionGreaterThan(String value) {
            addCriterion("CONTENT_DESCRIPTION >", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_DESCRIPTION >=", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionLessThan(String value) {
            addCriterion("CONTENT_DESCRIPTION <", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_DESCRIPTION <=", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionLike(String value) {
            addCriterion("CONTENT_DESCRIPTION like", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionNotLike(String value) {
            addCriterion("CONTENT_DESCRIPTION not like", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionIn(List<String> values) {
            addCriterion("CONTENT_DESCRIPTION in", values, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionNotIn(List<String> values) {
            addCriterion("CONTENT_DESCRIPTION not in", values, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionBetween(String value1, String value2) {
            addCriterion("CONTENT_DESCRIPTION between", value1, value2, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionNotBetween(String value1, String value2) {
            addCriterion("CONTENT_DESCRIPTION not between", value1, value2, "contentDescription");
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