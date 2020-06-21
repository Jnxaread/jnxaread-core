package com.jnxaread.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andFictionCountIsNull() {
            addCriterion("fictionCount is null");
            return (Criteria) this;
        }

        public Criteria andFictionCountIsNotNull() {
            addCriterion("fictionCount is not null");
            return (Criteria) this;
        }

        public Criteria andFictionCountEqualTo(Integer value) {
            addCriterion("fictionCount =", value, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountNotEqualTo(Integer value) {
            addCriterion("fictionCount <>", value, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountGreaterThan(Integer value) {
            addCriterion("fictionCount >", value, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fictionCount >=", value, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountLessThan(Integer value) {
            addCriterion("fictionCount <", value, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountLessThanOrEqualTo(Integer value) {
            addCriterion("fictionCount <=", value, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountIn(List<Integer> values) {
            addCriterion("fictionCount in", values, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountNotIn(List<Integer> values) {
            addCriterion("fictionCount not in", values, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountBetween(Integer value1, Integer value2) {
            addCriterion("fictionCount between", value1, value2, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andFictionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fictionCount not between", value1, value2, "fictionCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountIsNull() {
            addCriterion("chapterCount is null");
            return (Criteria) this;
        }

        public Criteria andChapterCountIsNotNull() {
            addCriterion("chapterCount is not null");
            return (Criteria) this;
        }

        public Criteria andChapterCountEqualTo(Integer value) {
            addCriterion("chapterCount =", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountNotEqualTo(Integer value) {
            addCriterion("chapterCount <>", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountGreaterThan(Integer value) {
            addCriterion("chapterCount >", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapterCount >=", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountLessThan(Integer value) {
            addCriterion("chapterCount <", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountLessThanOrEqualTo(Integer value) {
            addCriterion("chapterCount <=", value, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountIn(List<Integer> values) {
            addCriterion("chapterCount in", values, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountNotIn(List<Integer> values) {
            addCriterion("chapterCount not in", values, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountBetween(Integer value1, Integer value2) {
            addCriterion("chapterCount between", value1, value2, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andChapterCountNotBetween(Integer value1, Integer value2) {
            addCriterion("chapterCount not between", value1, value2, "chapterCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("commentCount is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("commentCount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("commentCount =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("commentCount <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("commentCount >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentCount >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("commentCount <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("commentCount <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("commentCount in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("commentCount not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("commentCount between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentCount not between", value1, value2, "commentCount");
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

        public Criteria andFictionLockedIsNull() {
            addCriterion("fictionLocked is null");
            return (Criteria) this;
        }

        public Criteria andFictionLockedIsNotNull() {
            addCriterion("fictionLocked is not null");
            return (Criteria) this;
        }

        public Criteria andFictionLockedEqualTo(Boolean value) {
            addCriterion("fictionLocked =", value, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedNotEqualTo(Boolean value) {
            addCriterion("fictionLocked <>", value, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedGreaterThan(Boolean value) {
            addCriterion("fictionLocked >", value, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fictionLocked >=", value, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedLessThan(Boolean value) {
            addCriterion("fictionLocked <", value, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("fictionLocked <=", value, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedIn(List<Boolean> values) {
            addCriterion("fictionLocked in", values, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedNotIn(List<Boolean> values) {
            addCriterion("fictionLocked not in", values, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("fictionLocked between", value1, value2, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andFictionLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fictionLocked not between", value1, value2, "fictionLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedIsNull() {
            addCriterion("chapterLocked is null");
            return (Criteria) this;
        }

        public Criteria andChapterLockedIsNotNull() {
            addCriterion("chapterLocked is not null");
            return (Criteria) this;
        }

        public Criteria andChapterLockedEqualTo(Boolean value) {
            addCriterion("chapterLocked =", value, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedNotEqualTo(Boolean value) {
            addCriterion("chapterLocked <>", value, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedGreaterThan(Boolean value) {
            addCriterion("chapterLocked >", value, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("chapterLocked >=", value, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedLessThan(Boolean value) {
            addCriterion("chapterLocked <", value, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("chapterLocked <=", value, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedIn(List<Boolean> values) {
            addCriterion("chapterLocked in", values, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedNotIn(List<Boolean> values) {
            addCriterion("chapterLocked not in", values, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("chapterLocked between", value1, value2, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andChapterLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("chapterLocked not between", value1, value2, "chapterLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedIsNull() {
            addCriterion("commentLocked is null");
            return (Criteria) this;
        }

        public Criteria andCommentLockedIsNotNull() {
            addCriterion("commentLocked is not null");
            return (Criteria) this;
        }

        public Criteria andCommentLockedEqualTo(Boolean value) {
            addCriterion("commentLocked =", value, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedNotEqualTo(Boolean value) {
            addCriterion("commentLocked <>", value, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedGreaterThan(Boolean value) {
            addCriterion("commentLocked >", value, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("commentLocked >=", value, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedLessThan(Boolean value) {
            addCriterion("commentLocked <", value, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("commentLocked <=", value, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedIn(List<Boolean> values) {
            addCriterion("commentLocked in", values, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedNotIn(List<Boolean> values) {
            addCriterion("commentLocked not in", values, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("commentLocked between", value1, value2, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andCommentLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("commentLocked not between", value1, value2, "commentLocked");
            return (Criteria) this;
        }

        public Criteria andHidedIsNull() {
            addCriterion("hided is null");
            return (Criteria) this;
        }

        public Criteria andHidedIsNotNull() {
            addCriterion("hided is not null");
            return (Criteria) this;
        }

        public Criteria andHidedEqualTo(Boolean value) {
            addCriterion("hided =", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedNotEqualTo(Boolean value) {
            addCriterion("hided <>", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedGreaterThan(Boolean value) {
            addCriterion("hided >", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hided >=", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedLessThan(Boolean value) {
            addCriterion("hided <", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedLessThanOrEqualTo(Boolean value) {
            addCriterion("hided <=", value, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedIn(List<Boolean> values) {
            addCriterion("hided in", values, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedNotIn(List<Boolean> values) {
            addCriterion("hided not in", values, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedBetween(Boolean value1, Boolean value2) {
            addCriterion("hided between", value1, value2, "hided");
            return (Criteria) this;
        }

        public Criteria andHidedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hided not between", value1, value2, "hided");
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
