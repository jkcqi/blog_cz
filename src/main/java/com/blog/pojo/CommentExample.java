package com.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommentUidIsNull() {
            addCriterion("comment_uid is null");
            return (Criteria) this;
        }

        public Criteria andCommentUidIsNotNull() {
            addCriterion("comment_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUidEqualTo(Integer value) {
            addCriterion("comment_uid =", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidNotEqualTo(Integer value) {
            addCriterion("comment_uid <>", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidGreaterThan(Integer value) {
            addCriterion("comment_uid >", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_uid >=", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidLessThan(Integer value) {
            addCriterion("comment_uid <", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_uid <=", value, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidIn(List<Integer> values) {
            addCriterion("comment_uid in", values, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidNotIn(List<Integer> values) {
            addCriterion("comment_uid not in", values, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidBetween(Integer value1, Integer value2) {
            addCriterion("comment_uid between", value1, value2, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentUidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_uid not between", value1, value2, "commentUid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidIsNull() {
            addCriterion("comment_boid is null");
            return (Criteria) this;
        }

        public Criteria andCommentBoidIsNotNull() {
            addCriterion("comment_boid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentBoidEqualTo(Integer value) {
            addCriterion("comment_boid =", value, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidNotEqualTo(Integer value) {
            addCriterion("comment_boid <>", value, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidGreaterThan(Integer value) {
            addCriterion("comment_boid >", value, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_boid >=", value, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidLessThan(Integer value) {
            addCriterion("comment_boid <", value, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_boid <=", value, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidIn(List<Integer> values) {
            addCriterion("comment_boid in", values, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidNotIn(List<Integer> values) {
            addCriterion("comment_boid not in", values, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidBetween(Integer value1, Integer value2) {
            addCriterion("comment_boid between", value1, value2, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentBoidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_boid not between", value1, value2, "commentBoid");
            return (Criteria) this;
        }

        public Criteria andCommentAridIsNull() {
            addCriterion("comment_arid is null");
            return (Criteria) this;
        }

        public Criteria andCommentAridIsNotNull() {
            addCriterion("comment_arid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAridEqualTo(Integer value) {
            addCriterion("comment_arid =", value, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridNotEqualTo(Integer value) {
            addCriterion("comment_arid <>", value, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridGreaterThan(Integer value) {
            addCriterion("comment_arid >", value, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_arid >=", value, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridLessThan(Integer value) {
            addCriterion("comment_arid <", value, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridLessThanOrEqualTo(Integer value) {
            addCriterion("comment_arid <=", value, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridIn(List<Integer> values) {
            addCriterion("comment_arid in", values, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridNotIn(List<Integer> values) {
            addCriterion("comment_arid not in", values, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridBetween(Integer value1, Integer value2) {
            addCriterion("comment_arid between", value1, value2, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentAridNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_arid not between", value1, value2, "commentArid");
            return (Criteria) this;
        }

        public Criteria andCommentcontextIsNull() {
            addCriterion("commentcontext is null");
            return (Criteria) this;
        }

        public Criteria andCommentcontextIsNotNull() {
            addCriterion("commentcontext is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcontextEqualTo(String value) {
            addCriterion("commentcontext =", value, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextNotEqualTo(String value) {
            addCriterion("commentcontext <>", value, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextGreaterThan(String value) {
            addCriterion("commentcontext >", value, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextGreaterThanOrEqualTo(String value) {
            addCriterion("commentcontext >=", value, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextLessThan(String value) {
            addCriterion("commentcontext <", value, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextLessThanOrEqualTo(String value) {
            addCriterion("commentcontext <=", value, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextLike(String value) {
            addCriterion("commentcontext like", value, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextNotLike(String value) {
            addCriterion("commentcontext not like", value, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextIn(List<String> values) {
            addCriterion("commentcontext in", values, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextNotIn(List<String> values) {
            addCriterion("commentcontext not in", values, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextBetween(String value1, String value2) {
            addCriterion("commentcontext between", value1, value2, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommentcontextNotBetween(String value1, String value2) {
            addCriterion("commentcontext not between", value1, value2, "commentcontext");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("commenttime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("commenttime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterion("commenttime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterion("commenttime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterion("commenttime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commenttime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterion("commenttime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("commenttime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterion("commenttime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterion("commenttime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterion("commenttime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("commenttime not between", value1, value2, "commenttime");
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