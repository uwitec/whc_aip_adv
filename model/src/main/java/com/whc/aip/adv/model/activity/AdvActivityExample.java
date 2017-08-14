package com.whc.aip.adv.model.activity;

import java.util.ArrayList;
import java.util.List;

public class AdvActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvActivityExample() {
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

        public Criteria andActivityVendorIsNull() {
            addCriterion("ACTIVITY_VENDOR is null");
            return (Criteria) this;
        }

        public Criteria andActivityVendorIsNotNull() {
            addCriterion("ACTIVITY_VENDOR is not null");
            return (Criteria) this;
        }

        public Criteria andActivityVendorEqualTo(String value) {
            addCriterion("ACTIVITY_VENDOR =", value, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorNotEqualTo(String value) {
            addCriterion("ACTIVITY_VENDOR <>", value, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorGreaterThan(String value) {
            addCriterion("ACTIVITY_VENDOR >", value, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_VENDOR >=", value, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorLessThan(String value) {
            addCriterion("ACTIVITY_VENDOR <", value, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_VENDOR <=", value, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorLike(String value) {
            addCriterion("ACTIVITY_VENDOR like", value, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorNotLike(String value) {
            addCriterion("ACTIVITY_VENDOR not like", value, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorIn(List<String> values) {
            addCriterion("ACTIVITY_VENDOR in", values, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorNotIn(List<String> values) {
            addCriterion("ACTIVITY_VENDOR not in", values, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorBetween(String value1, String value2) {
            addCriterion("ACTIVITY_VENDOR between", value1, value2, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityVendorNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_VENDOR not between", value1, value2, "activityVendor");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("ACTIVITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("ACTIVITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("ACTIVITY_NAME =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("ACTIVITY_NAME >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("ACTIVITY_NAME <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("ACTIVITY_NAME like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("ACTIVITY_NAME not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("ACTIVITY_NAME in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("ACTIVITY_NAME not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromIsNull() {
            addCriterion("ACTIVITY_VALIDFROM is null");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromIsNotNull() {
            addCriterion("ACTIVITY_VALIDFROM is not null");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromEqualTo(String value) {
            addCriterion("ACTIVITY_VALIDFROM =", value, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromNotEqualTo(String value) {
            addCriterion("ACTIVITY_VALIDFROM <>", value, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromGreaterThan(String value) {
            addCriterion("ACTIVITY_VALIDFROM >", value, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_VALIDFROM >=", value, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromLessThan(String value) {
            addCriterion("ACTIVITY_VALIDFROM <", value, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_VALIDFROM <=", value, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromLike(String value) {
            addCriterion("ACTIVITY_VALIDFROM like", value, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromNotLike(String value) {
            addCriterion("ACTIVITY_VALIDFROM not like", value, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromIn(List<String> values) {
            addCriterion("ACTIVITY_VALIDFROM in", values, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromNotIn(List<String> values) {
            addCriterion("ACTIVITY_VALIDFROM not in", values, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromBetween(String value1, String value2) {
            addCriterion("ACTIVITY_VALIDFROM between", value1, value2, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidfromNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_VALIDFROM not between", value1, value2, "activityValidfrom");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoIsNull() {
            addCriterion("ACTIVITY_VALIDTO is null");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoIsNotNull() {
            addCriterion("ACTIVITY_VALIDTO is not null");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoEqualTo(String value) {
            addCriterion("ACTIVITY_VALIDTO =", value, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoNotEqualTo(String value) {
            addCriterion("ACTIVITY_VALIDTO <>", value, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoGreaterThan(String value) {
            addCriterion("ACTIVITY_VALIDTO >", value, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_VALIDTO >=", value, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoLessThan(String value) {
            addCriterion("ACTIVITY_VALIDTO <", value, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_VALIDTO <=", value, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoLike(String value) {
            addCriterion("ACTIVITY_VALIDTO like", value, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoNotLike(String value) {
            addCriterion("ACTIVITY_VALIDTO not like", value, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoIn(List<String> values) {
            addCriterion("ACTIVITY_VALIDTO in", values, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoNotIn(List<String> values) {
            addCriterion("ACTIVITY_VALIDTO not in", values, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoBetween(String value1, String value2) {
            addCriterion("ACTIVITY_VALIDTO between", value1, value2, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityValidtoNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_VALIDTO not between", value1, value2, "activityValidto");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNull() {
            addCriterion("ACTIVITY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("ACTIVITY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(String value) {
            addCriterion("ACTIVITY_STATUS =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(String value) {
            addCriterion("ACTIVITY_STATUS <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(String value) {
            addCriterion("ACTIVITY_STATUS >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_STATUS >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(String value) {
            addCriterion("ACTIVITY_STATUS <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_STATUS <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLike(String value) {
            addCriterion("ACTIVITY_STATUS like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotLike(String value) {
            addCriterion("ACTIVITY_STATUS not like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<String> values) {
            addCriterion("ACTIVITY_STATUS in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<String> values) {
            addCriterion("ACTIVITY_STATUS not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(String value1, String value2) {
            addCriterion("ACTIVITY_STATUS between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_STATUS not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionIsNull() {
            addCriterion("ACTIVITY_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionIsNotNull() {
            addCriterion("ACTIVITY_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionEqualTo(String value) {
            addCriterion("ACTIVITY_DESCRIPTION =", value, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionNotEqualTo(String value) {
            addCriterion("ACTIVITY_DESCRIPTION <>", value, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionGreaterThan(String value) {
            addCriterion("ACTIVITY_DESCRIPTION >", value, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_DESCRIPTION >=", value, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionLessThan(String value) {
            addCriterion("ACTIVITY_DESCRIPTION <", value, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_DESCRIPTION <=", value, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionLike(String value) {
            addCriterion("ACTIVITY_DESCRIPTION like", value, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionNotLike(String value) {
            addCriterion("ACTIVITY_DESCRIPTION not like", value, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionIn(List<String> values) {
            addCriterion("ACTIVITY_DESCRIPTION in", values, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionNotIn(List<String> values) {
            addCriterion("ACTIVITY_DESCRIPTION not in", values, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionBetween(String value1, String value2) {
            addCriterion("ACTIVITY_DESCRIPTION between", value1, value2, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityDecriptionNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_DESCRIPTION not between", value1, value2, "activityDecription");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultIsNull() {
            addCriterion("ACTIVITY_IFDEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultIsNotNull() {
            addCriterion("ACTIVITY_IFDEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultEqualTo(String value) {
            addCriterion("ACTIVITY_IFDEFAULT =", value, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultNotEqualTo(String value) {
            addCriterion("ACTIVITY_IFDEFAULT <>", value, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultGreaterThan(String value) {
            addCriterion("ACTIVITY_IFDEFAULT >", value, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_IFDEFAULT >=", value, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultLessThan(String value) {
            addCriterion("ACTIVITY_IFDEFAULT <", value, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_IFDEFAULT <=", value, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultLike(String value) {
            addCriterion("ACTIVITY_IFDEFAULT like", value, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultNotLike(String value) {
            addCriterion("ACTIVITY_IFDEFAULT not like", value, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultIn(List<String> values) {
            addCriterion("ACTIVITY_IFDEFAULT in", values, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultNotIn(List<String> values) {
            addCriterion("ACTIVITY_IFDEFAULT not in", values, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultBetween(String value1, String value2) {
            addCriterion("ACTIVITY_IFDEFAULT between", value1, value2, "activityifdefault");
            return (Criteria) this;
        }

        public Criteria andActivityifdefaultNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_IFDEFAULT not between", value1, value2, "activityifdefault");
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