package com.neusoft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FastdfsfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FastdfsfileExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andCallPathIsNull() {
            addCriterion("call_path is null");
            return (Criteria) this;
        }

        public Criteria andCallPathIsNotNull() {
            addCriterion("call_path is not null");
            return (Criteria) this;
        }

        public Criteria andCallPathEqualTo(String value) {
            addCriterion("call_path =", value, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathNotEqualTo(String value) {
            addCriterion("call_path <>", value, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathGreaterThan(String value) {
            addCriterion("call_path >", value, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathGreaterThanOrEqualTo(String value) {
            addCriterion("call_path >=", value, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathLessThan(String value) {
            addCriterion("call_path <", value, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathLessThanOrEqualTo(String value) {
            addCriterion("call_path <=", value, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathLike(String value) {
            addCriterion("call_path like", value, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathNotLike(String value) {
            addCriterion("call_path not like", value, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathIn(List<String> values) {
            addCriterion("call_path in", values, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathNotIn(List<String> values) {
            addCriterion("call_path not in", values, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathBetween(String value1, String value2) {
            addCriterion("call_path between", value1, value2, "callPath");
            return (Criteria) this;
        }

        public Criteria andCallPathNotBetween(String value1, String value2) {
            addCriterion("call_path not between", value1, value2, "callPath");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andIsActivateIsNull() {
            addCriterion("is_activate is null");
            return (Criteria) this;
        }

        public Criteria andIsActivateIsNotNull() {
            addCriterion("is_activate is not null");
            return (Criteria) this;
        }

        public Criteria andIsActivateEqualTo(Integer value) {
            addCriterion("is_activate =", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotEqualTo(Integer value) {
            addCriterion("is_activate <>", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateGreaterThan(Integer value) {
            addCriterion("is_activate >", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_activate >=", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateLessThan(Integer value) {
            addCriterion("is_activate <", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateLessThanOrEqualTo(Integer value) {
            addCriterion("is_activate <=", value, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateIn(List<Integer> values) {
            addCriterion("is_activate in", values, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotIn(List<Integer> values) {
            addCriterion("is_activate not in", values, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateBetween(Integer value1, Integer value2) {
            addCriterion("is_activate between", value1, value2, "isActivate");
            return (Criteria) this;
        }

        public Criteria andIsActivateNotBetween(Integer value1, Integer value2) {
            addCriterion("is_activate not between", value1, value2, "isActivate");
            return (Criteria) this;
        }

        public Criteria andFileDateIsNull() {
            addCriterion("file_date is null");
            return (Criteria) this;
        }

        public Criteria andFileDateIsNotNull() {
            addCriterion("file_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileDateEqualTo(Date value) {
            addCriterion("file_date =", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateNotEqualTo(Date value) {
            addCriterion("file_date <>", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateGreaterThan(Date value) {
            addCriterion("file_date >", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateGreaterThanOrEqualTo(Date value) {
            addCriterion("file_date >=", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateLessThan(Date value) {
            addCriterion("file_date <", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateLessThanOrEqualTo(Date value) {
            addCriterion("file_date <=", value, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateIn(List<Date> values) {
            addCriterion("file_date in", values, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateNotIn(List<Date> values) {
            addCriterion("file_date not in", values, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateBetween(Date value1, Date value2) {
            addCriterion("file_date between", value1, value2, "fileDate");
            return (Criteria) this;
        }

        public Criteria andFileDateNotBetween(Date value1, Date value2) {
            addCriterion("file_date not between", value1, value2, "fileDate");
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