package com.jnxaread.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoardExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andNoticeCountIsNull() {
            addCriterion("noticeCount is null");
            return (Criteria) this;
        }

        public Criteria andNoticeCountIsNotNull() {
            addCriterion("noticeCount is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeCountEqualTo(Integer value) {
            addCriterion("noticeCount =", value, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountNotEqualTo(Integer value) {
            addCriterion("noticeCount <>", value, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountGreaterThan(Integer value) {
            addCriterion("noticeCount >", value, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("noticeCount >=", value, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountLessThan(Integer value) {
            addCriterion("noticeCount <", value, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountLessThanOrEqualTo(Integer value) {
            addCriterion("noticeCount <=", value, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountIn(List<Integer> values) {
            addCriterion("noticeCount in", values, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountNotIn(List<Integer> values) {
            addCriterion("noticeCount not in", values, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountBetween(Integer value1, Integer value2) {
            addCriterion("noticeCount between", value1, value2, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andNoticeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("noticeCount not between", value1, value2, "noticeCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountIsNull() {
            addCriterion("topicCount is null");
            return (Criteria) this;
        }

        public Criteria andTopicCountIsNotNull() {
            addCriterion("topicCount is not null");
            return (Criteria) this;
        }

        public Criteria andTopicCountEqualTo(Integer value) {
            addCriterion("topicCount =", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountNotEqualTo(Integer value) {
            addCriterion("topicCount <>", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountGreaterThan(Integer value) {
            addCriterion("topicCount >", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("topicCount >=", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountLessThan(Integer value) {
            addCriterion("topicCount <", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountLessThanOrEqualTo(Integer value) {
            addCriterion("topicCount <=", value, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountIn(List<Integer> values) {
            addCriterion("topicCount in", values, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountNotIn(List<Integer> values) {
            addCriterion("topicCount not in", values, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountBetween(Integer value1, Integer value2) {
            addCriterion("topicCount between", value1, value2, "topicCount");
            return (Criteria) this;
        }

        public Criteria andTopicCountNotBetween(Integer value1, Integer value2) {
            addCriterion("topicCount not between", value1, value2, "topicCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNull() {
            addCriterion("replyCount is null");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNotNull() {
            addCriterion("replyCount is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCountEqualTo(Integer value) {
            addCriterion("replyCount =", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotEqualTo(Integer value) {
            addCriterion("replyCount <>", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThan(Integer value) {
            addCriterion("replyCount >", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyCount >=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThan(Integer value) {
            addCriterion("replyCount <", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("replyCount <=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIn(List<Integer> values) {
            addCriterion("replyCount in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotIn(List<Integer> values) {
            addCriterion("replyCount not in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountBetween(Integer value1, Integer value2) {
            addCriterion("replyCount between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("replyCount not between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("visible is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("visible is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(Integer value) {
            addCriterion("visible =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(Integer value) {
            addCriterion("visible <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(Integer value) {
            addCriterion("visible >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("visible >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(Integer value) {
            addCriterion("visible <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(Integer value) {
            addCriterion("visible <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<Integer> values) {
            addCriterion("visible in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<Integer> values) {
            addCriterion("visible not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(Integer value1, Integer value2) {
            addCriterion("visible between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(Integer value1, Integer value2) {
            addCriterion("visible not between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andRestrictedIsNull() {
            addCriterion("restricted is null");
            return (Criteria) this;
        }

        public Criteria andRestrictedIsNotNull() {
            addCriterion("restricted is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictedEqualTo(Integer value) {
            addCriterion("restricted =", value, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedNotEqualTo(Integer value) {
            addCriterion("restricted <>", value, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedGreaterThan(Integer value) {
            addCriterion("restricted >", value, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedGreaterThanOrEqualTo(Integer value) {
            addCriterion("restricted >=", value, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedLessThan(Integer value) {
            addCriterion("restricted <", value, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedLessThanOrEqualTo(Integer value) {
            addCriterion("restricted <=", value, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedIn(List<Integer> values) {
            addCriterion("restricted in", values, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedNotIn(List<Integer> values) {
            addCriterion("restricted not in", values, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedBetween(Integer value1, Integer value2) {
            addCriterion("restricted between", value1, value2, "restricted");
            return (Criteria) this;
        }

        public Criteria andRestrictedNotBetween(Integer value1, Integer value2) {
            addCriterion("restricted not between", value1, value2, "restricted");
            return (Criteria) this;
        }

        public Criteria andTopicLockedIsNull() {
            addCriterion("topicLocked is null");
            return (Criteria) this;
        }

        public Criteria andTopicLockedIsNotNull() {
            addCriterion("topicLocked is not null");
            return (Criteria) this;
        }

        public Criteria andTopicLockedEqualTo(Boolean value) {
            addCriterion("topicLocked =", value, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedNotEqualTo(Boolean value) {
            addCriterion("topicLocked <>", value, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedGreaterThan(Boolean value) {
            addCriterion("topicLocked >", value, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("topicLocked >=", value, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedLessThan(Boolean value) {
            addCriterion("topicLocked <", value, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("topicLocked <=", value, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedIn(List<Boolean> values) {
            addCriterion("topicLocked in", values, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedNotIn(List<Boolean> values) {
            addCriterion("topicLocked not in", values, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("topicLocked between", value1, value2, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andTopicLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("topicLocked not between", value1, value2, "topicLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedIsNull() {
            addCriterion("replyLocked is null");
            return (Criteria) this;
        }

        public Criteria andReplyLockedIsNotNull() {
            addCriterion("replyLocked is not null");
            return (Criteria) this;
        }

        public Criteria andReplyLockedEqualTo(Boolean value) {
            addCriterion("replyLocked =", value, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedNotEqualTo(Boolean value) {
            addCriterion("replyLocked <>", value, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedGreaterThan(Boolean value) {
            addCriterion("replyLocked >", value, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("replyLocked >=", value, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedLessThan(Boolean value) {
            addCriterion("replyLocked <", value, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("replyLocked <=", value, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedIn(List<Boolean> values) {
            addCriterion("replyLocked in", values, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedNotIn(List<Boolean> values) {
            addCriterion("replyLocked not in", values, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("replyLocked between", value1, value2, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andReplyLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("replyLocked not between", value1, value2, "replyLocked");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
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