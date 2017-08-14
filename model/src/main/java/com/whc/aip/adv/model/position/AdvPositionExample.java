package com.whc.aip.adv.model.position;

import java.util.ArrayList;
import java.util.List;

public class AdvPositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvPositionExample() {
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

        public Criteria andPositionIdIsNull() {
            addCriterion("POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(String value) {
            addCriterion("POSITION_ID =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(String value) {
            addCriterion("POSITION_ID <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(String value) {
            addCriterion("POSITION_ID >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_ID >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(String value) {
            addCriterion("POSITION_ID <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(String value) {
            addCriterion("POSITION_ID <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLike(String value) {
            addCriterion("POSITION_ID like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotLike(String value) {
            addCriterion("POSITION_ID not like", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<String> values) {
            addCriterion("POSITION_ID in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<String> values) {
            addCriterion("POSITION_ID not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(String value1, String value2) {
            addCriterion("POSITION_ID between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(String value1, String value2) {
            addCriterion("POSITION_ID not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositonIdIsNull() {
            addCriterion("POSITION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPositonIdIsNotNull() {
            addCriterion("POSITION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPositonIdEqualTo(String value) {
            addCriterion("POSITION_NAME =", value, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdNotEqualTo(String value) {
            addCriterion("POSITION_NAME <>", value, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdGreaterThan(String value) {
            addCriterion("POSITION_NAME >", value, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_NAME >=", value, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdLessThan(String value) {
            addCriterion("POSITION_NAME <", value, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdLessThanOrEqualTo(String value) {
            addCriterion("POSITION_NAME <=", value, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdLike(String value) {
            addCriterion("POSITION_NAME like", value, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdNotLike(String value) {
            addCriterion("POSITION_NAME not like", value, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdIn(List<String> values) {
            addCriterion("POSITION_NAME in", values, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdNotIn(List<String> values) {
            addCriterion("POSITION_NAME not in", values, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdBetween(String value1, String value2) {
            addCriterion("POSITION_NAME between", value1, value2, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositonIdNotBetween(String value1, String value2) {
            addCriterion("POSITION_NAME not between", value1, value2, "positonId");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("POSITION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("POSITION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("POSITION_CODE =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("POSITION_CODE <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("POSITION_CODE >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_CODE >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("POSITION_CODE <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("POSITION_CODE <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("POSITION_CODE like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("POSITION_CODE not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("POSITION_CODE in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("POSITION_CODE not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("POSITION_CODE between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("POSITION_CODE not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNull() {
            addCriterion("POSITION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNotNull() {
            addCriterion("POSITION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeEqualTo(String value) {
            addCriterion("POSITION_TYPE =", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotEqualTo(String value) {
            addCriterion("POSITION_TYPE <>", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThan(String value) {
            addCriterion("POSITION_TYPE >", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_TYPE >=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThan(String value) {
            addCriterion("POSITION_TYPE <", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThanOrEqualTo(String value) {
            addCriterion("POSITION_TYPE <=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLike(String value) {
            addCriterion("POSITION_TYPE like", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotLike(String value) {
            addCriterion("POSITION_TYPE not like", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIn(List<String> values) {
            addCriterion("POSITION_TYPE in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotIn(List<String> values) {
            addCriterion("POSITION_TYPE not in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeBetween(String value1, String value2) {
            addCriterion("POSITION_TYPE between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotBetween(String value1, String value2) {
            addCriterion("POSITION_TYPE not between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionIsNull() {
            addCriterion("POSITION_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionIsNotNull() {
            addCriterion("POSITION_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionEqualTo(String value) {
            addCriterion("POSITION_DESCRIPTION =", value, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionNotEqualTo(String value) {
            addCriterion("POSITION_DESCRIPTION <>", value, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionGreaterThan(String value) {
            addCriterion("POSITION_DESCRIPTION >", value, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_DESCRIPTION >=", value, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionLessThan(String value) {
            addCriterion("POSITION_DESCRIPTION <", value, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionLessThanOrEqualTo(String value) {
            addCriterion("POSITION_DESCRIPTION <=", value, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionLike(String value) {
            addCriterion("POSITION_DESCRIPTION like", value, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionNotLike(String value) {
            addCriterion("POSITION_DESCRIPTION not like", value, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionIn(List<String> values) {
            addCriterion("POSITION_DESCRIPTION in", values, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionNotIn(List<String> values) {
            addCriterion("POSITION_DESCRIPTION not in", values, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionBetween(String value1, String value2) {
            addCriterion("POSITION_DESCRIPTION between", value1, value2, "positiondescription");
            return (Criteria) this;
        }

        public Criteria andPositiondescriptionNotBetween(String value1, String value2) {
            addCriterion("POSITION_DESCRIPTION not between", value1, value2, "positiondescription");
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