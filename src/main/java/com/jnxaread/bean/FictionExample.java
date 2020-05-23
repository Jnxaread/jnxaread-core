package com.jnxaread.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FictionExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
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

        public Criteria andWordCountIsNull() {
            addCriterion("wordCount is null");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNotNull() {
            addCriterion("wordCount is not null");
            return (Criteria) this;
        }

        public Criteria andWordCountEqualTo(Integer value) {
            addCriterion("wordCount =", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotEqualTo(Integer value) {
            addCriterion("wordCount <>", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThan(Integer value) {
            addCriterion("wordCount >", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wordCount >=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThan(Integer value) {
            addCriterion("wordCount <", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThanOrEqualTo(Integer value) {
            addCriterion("wordCount <=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountIn(List<Integer> values) {
            addCriterion("wordCount in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotIn(List<Integer> values) {
            addCriterion("wordCount not in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountBetween(Integer value1, Integer value2) {
            addCriterion("wordCount between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotBetween(Integer value1, Integer value2) {
            addCriterion("wordCount not between", value1, value2, "wordCount");
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

        public Criteria andViewCountIsNull() {
            addCriterion("viewCount is null");
            return (Criteria) this;
        }

        public Criteria andViewCountIsNotNull() {
            addCriterion("viewCount is not null");
            return (Criteria) this;
        }

        public Criteria andViewCountEqualTo(Long value) {
            addCriterion("viewCount =", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotEqualTo(Long value) {
            addCriterion("viewCount <>", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThan(Long value) {
            addCriterion("viewCount >", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountGreaterThanOrEqualTo(Long value) {
            addCriterion("viewCount >=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThan(Long value) {
            addCriterion("viewCount <", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountLessThanOrEqualTo(Long value) {
            addCriterion("viewCount <=", value, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountIn(List<Long> values) {
            addCriterion("viewCount in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotIn(List<Long> values) {
            addCriterion("viewCount not in", values, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountBetween(Long value1, Long value2) {
            addCriterion("viewCount between", value1, value2, "viewCount");
            return (Criteria) this;
        }

        public Criteria andViewCountNotBetween(Long value1, Long value2) {
            addCriterion("viewCount not between", value1, value2, "viewCount");
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

        public Criteria andContentLockedIsNull() {
            addCriterion("contentLocked is null");
            return (Criteria) this;
        }

        public Criteria andContentLockedIsNotNull() {
            addCriterion("contentLocked is not null");
            return (Criteria) this;
        }

        public Criteria andContentLockedEqualTo(Boolean value) {
            addCriterion("contentLocked =", value, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedNotEqualTo(Boolean value) {
            addCriterion("contentLocked <>", value, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedGreaterThan(Boolean value) {
            addCriterion("contentLocked >", value, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("contentLocked >=", value, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedLessThan(Boolean value) {
            addCriterion("contentLocked <", value, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("contentLocked <=", value, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedIn(List<Boolean> values) {
            addCriterion("contentLocked in", values, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedNotIn(List<Boolean> values) {
            addCriterion("contentLocked not in", values, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("contentLocked between", value1, value2, "contentLocked");
            return (Criteria) this;
        }

        public Criteria andContentLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("contentLocked not between", value1, value2, "contentLocked");
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