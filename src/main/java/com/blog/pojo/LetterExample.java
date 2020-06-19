package com.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LetterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LetterExample() {
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

        public Criteria andLettercomtextIsNull() {
            addCriterion("lettercomtext is null");
            return (Criteria) this;
        }

        public Criteria andLettercomtextIsNotNull() {
            addCriterion("lettercomtext is not null");
            return (Criteria) this;
        }

        public Criteria andLettercomtextEqualTo(String value) {
            addCriterion("lettercomtext =", value, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextNotEqualTo(String value) {
            addCriterion("lettercomtext <>", value, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextGreaterThan(String value) {
            addCriterion("lettercomtext >", value, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextGreaterThanOrEqualTo(String value) {
            addCriterion("lettercomtext >=", value, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextLessThan(String value) {
            addCriterion("lettercomtext <", value, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextLessThanOrEqualTo(String value) {
            addCriterion("lettercomtext <=", value, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextLike(String value) {
            addCriterion("lettercomtext like", value, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextNotLike(String value) {
            addCriterion("lettercomtext not like", value, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextIn(List<String> values) {
            addCriterion("lettercomtext in", values, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextNotIn(List<String> values) {
            addCriterion("lettercomtext not in", values, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextBetween(String value1, String value2) {
            addCriterion("lettercomtext between", value1, value2, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andLettercomtextNotBetween(String value1, String value2) {
            addCriterion("lettercomtext not between", value1, value2, "lettercomtext");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBoIdIsNull() {
            addCriterion("bo_id is null");
            return (Criteria) this;
        }

        public Criteria andBoIdIsNotNull() {
            addCriterion("bo_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoIdEqualTo(Integer value) {
            addCriterion("bo_id =", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdNotEqualTo(Integer value) {
            addCriterion("bo_id <>", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdGreaterThan(Integer value) {
            addCriterion("bo_id >", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bo_id >=", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdLessThan(Integer value) {
            addCriterion("bo_id <", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdLessThanOrEqualTo(Integer value) {
            addCriterion("bo_id <=", value, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdIn(List<Integer> values) {
            addCriterion("bo_id in", values, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdNotIn(List<Integer> values) {
            addCriterion("bo_id not in", values, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdBetween(Integer value1, Integer value2) {
            addCriterion("bo_id between", value1, value2, "boId");
            return (Criteria) this;
        }

        public Criteria andBoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bo_id not between", value1, value2, "boId");
            return (Criteria) this;
        }

        public Criteria andLetterstateIsNull() {
            addCriterion("letterstate is null");
            return (Criteria) this;
        }

        public Criteria andLetterstateIsNotNull() {
            addCriterion("letterstate is not null");
            return (Criteria) this;
        }

        public Criteria andLetterstateEqualTo(Integer value) {
            addCriterion("letterstate =", value, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateNotEqualTo(Integer value) {
            addCriterion("letterstate <>", value, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateGreaterThan(Integer value) {
            addCriterion("letterstate >", value, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("letterstate >=", value, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateLessThan(Integer value) {
            addCriterion("letterstate <", value, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateLessThanOrEqualTo(Integer value) {
            addCriterion("letterstate <=", value, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateIn(List<Integer> values) {
            addCriterion("letterstate in", values, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateNotIn(List<Integer> values) {
            addCriterion("letterstate not in", values, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateBetween(Integer value1, Integer value2) {
            addCriterion("letterstate between", value1, value2, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLetterstateNotBetween(Integer value1, Integer value2) {
            addCriterion("letterstate not between", value1, value2, "letterstate");
            return (Criteria) this;
        }

        public Criteria andLettertimeIsNull() {
            addCriterion("lettertime is null");
            return (Criteria) this;
        }

        public Criteria andLettertimeIsNotNull() {
            addCriterion("lettertime is not null");
            return (Criteria) this;
        }

        public Criteria andLettertimeEqualTo(Date value) {
            addCriterion("lettertime =", value, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeNotEqualTo(Date value) {
            addCriterion("lettertime <>", value, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeGreaterThan(Date value) {
            addCriterion("lettertime >", value, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lettertime >=", value, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeLessThan(Date value) {
            addCriterion("lettertime <", value, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeLessThanOrEqualTo(Date value) {
            addCriterion("lettertime <=", value, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeIn(List<Date> values) {
            addCriterion("lettertime in", values, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeNotIn(List<Date> values) {
            addCriterion("lettertime not in", values, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeBetween(Date value1, Date value2) {
            addCriterion("lettertime between", value1, value2, "lettertime");
            return (Criteria) this;
        }

        public Criteria andLettertimeNotBetween(Date value1, Date value2) {
            addCriterion("lettertime not between", value1, value2, "lettertime");
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