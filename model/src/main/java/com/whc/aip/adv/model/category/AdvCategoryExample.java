package com.whc.aip.adv.model.category;

import java.util.ArrayList;
import java.util.List;

public class AdvCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvCategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("CATEGORY_ID like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("CATEGORY_ID not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_ID not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("CATEGORY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("CATEGORY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("CATEGORY_CODE =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("CATEGORY_CODE <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("CATEGORY_CODE >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_CODE >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("CATEGORY_CODE <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_CODE <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("CATEGORY_CODE like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("CATEGORY_CODE not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("CATEGORY_CODE in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("CATEGORY_CODE not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("CATEGORY_CODE between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_CODE not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("CATEGORY_NAME =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("CATEGORY_NAME <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("CATEGORY_NAME >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("CATEGORY_NAME <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("CATEGORY_NAME like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("CATEGORY_NAME not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("CATEGORY_NAME in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("CATEGORY_NAME not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoIsNull() {
            addCriterion("CATEGORY_SERIALNO is null");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoIsNotNull() {
            addCriterion("CATEGORY_SERIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoEqualTo(String value) {
            addCriterion("CATEGORY_SERIALNO =", value, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoNotEqualTo(String value) {
            addCriterion("CATEGORY_SERIALNO <>", value, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoGreaterThan(String value) {
            addCriterion("CATEGORY_SERIALNO >", value, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_SERIALNO >=", value, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoLessThan(String value) {
            addCriterion("CATEGORY_SERIALNO <", value, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_SERIALNO <=", value, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoLike(String value) {
            addCriterion("CATEGORY_SERIALNO like", value, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoNotLike(String value) {
            addCriterion("CATEGORY_SERIALNO not like", value, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoIn(List<String> values) {
            addCriterion("CATEGORY_SERIALNO in", values, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoNotIn(List<String> values) {
            addCriterion("CATEGORY_SERIALNO not in", values, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoBetween(String value1, String value2) {
            addCriterion("CATEGORY_SERIALNO between", value1, value2, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategorySerialnoNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_SERIALNO not between", value1, value2, "categorySerialno");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidIsNull() {
            addCriterion("CATEGORY_PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidIsNotNull() {
            addCriterion("CATEGORY_PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidEqualTo(String value) {
            addCriterion("CATEGORY_PARENTID =", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidNotEqualTo(String value) {
            addCriterion("CATEGORY_PARENTID <>", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidGreaterThan(String value) {
            addCriterion("CATEGORY_PARENTID >", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_PARENTID >=", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidLessThan(String value) {
            addCriterion("CATEGORY_PARENTID <", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_PARENTID <=", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidLike(String value) {
            addCriterion("CATEGORY_PARENTID like", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidNotLike(String value) {
            addCriterion("CATEGORY_PARENTID not like", value, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidIn(List<String> values) {
            addCriterion("CATEGORY_PARENTID in", values, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidNotIn(List<String> values) {
            addCriterion("CATEGORY_PARENTID not in", values, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidBetween(String value1, String value2) {
            addCriterion("CATEGORY_PARENTID between", value1, value2, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryParentidNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_PARENTID not between", value1, value2, "categoryParentid");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionIsNull() {
            addCriterion("CATEGORY_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionIsNotNull() {
            addCriterion("CATEGORY_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionEqualTo(String value) {
            addCriterion("CATEGORY_DESCRIPTION =", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionNotEqualTo(String value) {
            addCriterion("CATEGORY_DESCRIPTION <>", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionGreaterThan(String value) {
            addCriterion("CATEGORY_DESCRIPTION >", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_DESCRIPTION >=", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionLessThan(String value) {
            addCriterion("CATEGORY_DESCRIPTION <", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_DESCRIPTION <=", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionLike(String value) {
            addCriterion("CATEGORY_DESCRIPTION like", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionNotLike(String value) {
            addCriterion("CATEGORY_DESCRIPTION not like", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionIn(List<String> values) {
            addCriterion("CATEGORY_DESCRIPTION in", values, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionNotIn(List<String> values) {
            addCriterion("CATEGORY_DESCRIPTION not in", values, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionBetween(String value1, String value2) {
            addCriterion("CATEGORY_DESCRIPTION between", value1, value2, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_DESCRIPTION not between", value1, value2, "categoryDescription");
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