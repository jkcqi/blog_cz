package com.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleBoidIsNull() {
            addCriterion("article_boid is null");
            return (Criteria) this;
        }

        public Criteria andArticleBoidIsNotNull() {
            addCriterion("article_boid is not null");
            return (Criteria) this;
        }

        public Criteria andArticleBoidEqualTo(Integer value) {
            addCriterion("article_boid =", value, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidNotEqualTo(Integer value) {
            addCriterion("article_boid <>", value, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidGreaterThan(Integer value) {
            addCriterion("article_boid >", value, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_boid >=", value, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidLessThan(Integer value) {
            addCriterion("article_boid <", value, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidLessThanOrEqualTo(Integer value) {
            addCriterion("article_boid <=", value, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidIn(List<Integer> values) {
            addCriterion("article_boid in", values, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidNotIn(List<Integer> values) {
            addCriterion("article_boid not in", values, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidBetween(Integer value1, Integer value2) {
            addCriterion("article_boid between", value1, value2, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticleBoidNotBetween(Integer value1, Integer value2) {
            addCriterion("article_boid not between", value1, value2, "articleBoid");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNull() {
            addCriterion("articletitle is null");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNotNull() {
            addCriterion("articletitle is not null");
            return (Criteria) this;
        }

        public Criteria andArticletitleEqualTo(String value) {
            addCriterion("articletitle =", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotEqualTo(String value) {
            addCriterion("articletitle <>", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThan(String value) {
            addCriterion("articletitle >", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThanOrEqualTo(String value) {
            addCriterion("articletitle >=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThan(String value) {
            addCriterion("articletitle <", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThanOrEqualTo(String value) {
            addCriterion("articletitle <=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLike(String value) {
            addCriterion("articletitle like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotLike(String value) {
            addCriterion("articletitle not like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleIn(List<String> values) {
            addCriterion("articletitle in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotIn(List<String> values) {
            addCriterion("articletitle not in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleBetween(String value1, String value2) {
            addCriterion("articletitle between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotBetween(String value1, String value2) {
            addCriterion("articletitle not between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticleabstractIsNull() {
            addCriterion("articleabstract is null");
            return (Criteria) this;
        }

        public Criteria andArticleabstractIsNotNull() {
            addCriterion("articleabstract is not null");
            return (Criteria) this;
        }

        public Criteria andArticleabstractEqualTo(String value) {
            addCriterion("articleabstract =", value, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractNotEqualTo(String value) {
            addCriterion("articleabstract <>", value, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractGreaterThan(String value) {
            addCriterion("articleabstract >", value, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractGreaterThanOrEqualTo(String value) {
            addCriterion("articleabstract >=", value, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractLessThan(String value) {
            addCriterion("articleabstract <", value, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractLessThanOrEqualTo(String value) {
            addCriterion("articleabstract <=", value, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractLike(String value) {
            addCriterion("articleabstract like", value, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractNotLike(String value) {
            addCriterion("articleabstract not like", value, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractIn(List<String> values) {
            addCriterion("articleabstract in", values, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractNotIn(List<String> values) {
            addCriterion("articleabstract not in", values, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractBetween(String value1, String value2) {
            addCriterion("articleabstract between", value1, value2, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andArticleabstractNotBetween(String value1, String value2) {
            addCriterion("articleabstract not between", value1, value2, "articleabstract");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextIsNull() {
            addCriterion("ariticlecontext is null");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextIsNotNull() {
            addCriterion("ariticlecontext is not null");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextEqualTo(String value) {
            addCriterion("ariticlecontext =", value, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextNotEqualTo(String value) {
            addCriterion("ariticlecontext <>", value, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextGreaterThan(String value) {
            addCriterion("ariticlecontext >", value, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextGreaterThanOrEqualTo(String value) {
            addCriterion("ariticlecontext >=", value, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextLessThan(String value) {
            addCriterion("ariticlecontext <", value, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextLessThanOrEqualTo(String value) {
            addCriterion("ariticlecontext <=", value, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextLike(String value) {
            addCriterion("ariticlecontext like", value, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextNotLike(String value) {
            addCriterion("ariticlecontext not like", value, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextIn(List<String> values) {
            addCriterion("ariticlecontext in", values, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextNotIn(List<String> values) {
            addCriterion("ariticlecontext not in", values, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextBetween(String value1, String value2) {
            addCriterion("ariticlecontext between", value1, value2, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andAriticlecontextNotBetween(String value1, String value2) {
            addCriterion("ariticlecontext not between", value1, value2, "ariticlecontext");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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