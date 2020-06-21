package com.jnxaread.bean;

import java.util.ArrayList;
import java.util.List;

public class AuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
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

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andAddNoticeIsNull() {
            addCriterion("addNotice is null");
            return (Criteria) this;
        }

        public Criteria andAddNoticeIsNotNull() {
            addCriterion("addNotice is not null");
            return (Criteria) this;
        }

        public Criteria andAddNoticeEqualTo(Boolean value) {
            addCriterion("addNotice =", value, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeNotEqualTo(Boolean value) {
            addCriterion("addNotice <>", value, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeGreaterThan(Boolean value) {
            addCriterion("addNotice >", value, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("addNotice >=", value, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeLessThan(Boolean value) {
            addCriterion("addNotice <", value, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeLessThanOrEqualTo(Boolean value) {
            addCriterion("addNotice <=", value, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeIn(List<Boolean> values) {
            addCriterion("addNotice in", values, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeNotIn(List<Boolean> values) {
            addCriterion("addNotice not in", values, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeBetween(Boolean value1, Boolean value2) {
            addCriterion("addNotice between", value1, value2, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddNoticeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("addNotice not between", value1, value2, "addNotice");
            return (Criteria) this;
        }

        public Criteria andAddCategoryIsNull() {
            addCriterion("addCategory is null");
            return (Criteria) this;
        }

        public Criteria andAddCategoryIsNotNull() {
            addCriterion("addCategory is not null");
            return (Criteria) this;
        }

        public Criteria andAddCategoryEqualTo(Boolean value) {
            addCriterion("addCategory =", value, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryNotEqualTo(Boolean value) {
            addCriterion("addCategory <>", value, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryGreaterThan(Boolean value) {
            addCriterion("addCategory >", value, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("addCategory >=", value, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryLessThan(Boolean value) {
            addCriterion("addCategory <", value, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryLessThanOrEqualTo(Boolean value) {
            addCriterion("addCategory <=", value, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryIn(List<Boolean> values) {
            addCriterion("addCategory in", values, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryNotIn(List<Boolean> values) {
            addCriterion("addCategory not in", values, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryBetween(Boolean value1, Boolean value2) {
            addCriterion("addCategory between", value1, value2, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddCategoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("addCategory not between", value1, value2, "addCategory");
            return (Criteria) this;
        }

        public Criteria andAddBoardIsNull() {
            addCriterion("addBoard is null");
            return (Criteria) this;
        }

        public Criteria andAddBoardIsNotNull() {
            addCriterion("addBoard is not null");
            return (Criteria) this;
        }

        public Criteria andAddBoardEqualTo(Boolean value) {
            addCriterion("addBoard =", value, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardNotEqualTo(Boolean value) {
            addCriterion("addBoard <>", value, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardGreaterThan(Boolean value) {
            addCriterion("addBoard >", value, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("addBoard >=", value, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardLessThan(Boolean value) {
            addCriterion("addBoard <", value, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardLessThanOrEqualTo(Boolean value) {
            addCriterion("addBoard <=", value, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardIn(List<Boolean> values) {
            addCriterion("addBoard in", values, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardNotIn(List<Boolean> values) {
            addCriterion("addBoard not in", values, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardBetween(Boolean value1, Boolean value2) {
            addCriterion("addBoard between", value1, value2, "addBoard");
            return (Criteria) this;
        }

        public Criteria andAddBoardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("addBoard not between", value1, value2, "addBoard");
            return (Criteria) this;
        }

        public Criteria andBanAccountIsNull() {
            addCriterion("banAccount is null");
            return (Criteria) this;
        }

        public Criteria andBanAccountIsNotNull() {
            addCriterion("banAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBanAccountEqualTo(Boolean value) {
            addCriterion("banAccount =", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountNotEqualTo(Boolean value) {
            addCriterion("banAccount <>", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountGreaterThan(Boolean value) {
            addCriterion("banAccount >", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banAccount >=", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountLessThan(Boolean value) {
            addCriterion("banAccount <", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountLessThanOrEqualTo(Boolean value) {
            addCriterion("banAccount <=", value, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountIn(List<Boolean> values) {
            addCriterion("banAccount in", values, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountNotIn(List<Boolean> values) {
            addCriterion("banAccount not in", values, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountBetween(Boolean value1, Boolean value2) {
            addCriterion("banAccount between", value1, value2, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanAccountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banAccount not between", value1, value2, "banAccount");
            return (Criteria) this;
        }

        public Criteria andBanTopicIsNull() {
            addCriterion("banTopic is null");
            return (Criteria) this;
        }

        public Criteria andBanTopicIsNotNull() {
            addCriterion("banTopic is not null");
            return (Criteria) this;
        }

        public Criteria andBanTopicEqualTo(Boolean value) {
            addCriterion("banTopic =", value, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicNotEqualTo(Boolean value) {
            addCriterion("banTopic <>", value, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicGreaterThan(Boolean value) {
            addCriterion("banTopic >", value, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banTopic >=", value, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicLessThan(Boolean value) {
            addCriterion("banTopic <", value, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("banTopic <=", value, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicIn(List<Boolean> values) {
            addCriterion("banTopic in", values, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicNotIn(List<Boolean> values) {
            addCriterion("banTopic not in", values, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("banTopic between", value1, value2, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banTopic not between", value1, value2, "banTopic");
            return (Criteria) this;
        }

        public Criteria andBanReplyIsNull() {
            addCriterion("banReply is null");
            return (Criteria) this;
        }

        public Criteria andBanReplyIsNotNull() {
            addCriterion("banReply is not null");
            return (Criteria) this;
        }

        public Criteria andBanReplyEqualTo(Boolean value) {
            addCriterion("banReply =", value, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyNotEqualTo(Boolean value) {
            addCriterion("banReply <>", value, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyGreaterThan(Boolean value) {
            addCriterion("banReply >", value, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banReply >=", value, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyLessThan(Boolean value) {
            addCriterion("banReply <", value, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("banReply <=", value, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyIn(List<Boolean> values) {
            addCriterion("banReply in", values, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyNotIn(List<Boolean> values) {
            addCriterion("banReply not in", values, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("banReply between", value1, value2, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banReply not between", value1, value2, "banReply");
            return (Criteria) this;
        }

        public Criteria andBanMessageIsNull() {
            addCriterion("banMessage is null");
            return (Criteria) this;
        }

        public Criteria andBanMessageIsNotNull() {
            addCriterion("banMessage is not null");
            return (Criteria) this;
        }

        public Criteria andBanMessageEqualTo(Boolean value) {
            addCriterion("banMessage =", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageNotEqualTo(Boolean value) {
            addCriterion("banMessage <>", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageGreaterThan(Boolean value) {
            addCriterion("banMessage >", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banMessage >=", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageLessThan(Boolean value) {
            addCriterion("banMessage <", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageLessThanOrEqualTo(Boolean value) {
            addCriterion("banMessage <=", value, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageIn(List<Boolean> values) {
            addCriterion("banMessage in", values, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageNotIn(List<Boolean> values) {
            addCriterion("banMessage not in", values, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageBetween(Boolean value1, Boolean value2) {
            addCriterion("banMessage between", value1, value2, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanMessageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banMessage not between", value1, value2, "banMessage");
            return (Criteria) this;
        }

        public Criteria andBanFictionIsNull() {
            addCriterion("banFiction is null");
            return (Criteria) this;
        }

        public Criteria andBanFictionIsNotNull() {
            addCriterion("banFiction is not null");
            return (Criteria) this;
        }

        public Criteria andBanFictionEqualTo(Boolean value) {
            addCriterion("banFiction =", value, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionNotEqualTo(Boolean value) {
            addCriterion("banFiction <>", value, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionGreaterThan(Boolean value) {
            addCriterion("banFiction >", value, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banFiction >=", value, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionLessThan(Boolean value) {
            addCriterion("banFiction <", value, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("banFiction <=", value, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionIn(List<Boolean> values) {
            addCriterion("banFiction in", values, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionNotIn(List<Boolean> values) {
            addCriterion("banFiction not in", values, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("banFiction between", value1, value2, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banFiction not between", value1, value2, "banFiction");
            return (Criteria) this;
        }

        public Criteria andBanCommentIsNull() {
            addCriterion("banComment is null");
            return (Criteria) this;
        }

        public Criteria andBanCommentIsNotNull() {
            addCriterion("banComment is not null");
            return (Criteria) this;
        }

        public Criteria andBanCommentEqualTo(Boolean value) {
            addCriterion("banComment =", value, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentNotEqualTo(Boolean value) {
            addCriterion("banComment <>", value, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentGreaterThan(Boolean value) {
            addCriterion("banComment >", value, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banComment >=", value, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentLessThan(Boolean value) {
            addCriterion("banComment <", value, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("banComment <=", value, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentIn(List<Boolean> values) {
            addCriterion("banComment in", values, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentNotIn(List<Boolean> values) {
            addCriterion("banComment not in", values, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("banComment between", value1, value2, "banComment");
            return (Criteria) this;
        }

        public Criteria andBanCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banComment not between", value1, value2, "banComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicIsNull() {
            addCriterion("deleteOwnTopic is null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicIsNotNull() {
            addCriterion("deleteOwnTopic is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicEqualTo(Boolean value) {
            addCriterion("deleteOwnTopic =", value, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicNotEqualTo(Boolean value) {
            addCriterion("deleteOwnTopic <>", value, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicGreaterThan(Boolean value) {
            addCriterion("deleteOwnTopic >", value, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnTopic >=", value, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicLessThan(Boolean value) {
            addCriterion("deleteOwnTopic <", value, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnTopic <=", value, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicIn(List<Boolean> values) {
            addCriterion("deleteOwnTopic in", values, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicNotIn(List<Boolean> values) {
            addCriterion("deleteOwnTopic not in", values, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnTopic between", value1, value2, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnTopic not between", value1, value2, "deleteOwnTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyIsNull() {
            addCriterion("deleteOwnReply is null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyIsNotNull() {
            addCriterion("deleteOwnReply is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyEqualTo(Boolean value) {
            addCriterion("deleteOwnReply =", value, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyNotEqualTo(Boolean value) {
            addCriterion("deleteOwnReply <>", value, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyGreaterThan(Boolean value) {
            addCriterion("deleteOwnReply >", value, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnReply >=", value, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyLessThan(Boolean value) {
            addCriterion("deleteOwnReply <", value, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnReply <=", value, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyIn(List<Boolean> values) {
            addCriterion("deleteOwnReply in", values, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyNotIn(List<Boolean> values) {
            addCriterion("deleteOwnReply not in", values, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnReply between", value1, value2, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnReply not between", value1, value2, "deleteOwnReply");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionIsNull() {
            addCriterion("deleteOwnFiction is null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionIsNotNull() {
            addCriterion("deleteOwnFiction is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionEqualTo(Boolean value) {
            addCriterion("deleteOwnFiction =", value, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionNotEqualTo(Boolean value) {
            addCriterion("deleteOwnFiction <>", value, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionGreaterThan(Boolean value) {
            addCriterion("deleteOwnFiction >", value, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnFiction >=", value, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionLessThan(Boolean value) {
            addCriterion("deleteOwnFiction <", value, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnFiction <=", value, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionIn(List<Boolean> values) {
            addCriterion("deleteOwnFiction in", values, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionNotIn(List<Boolean> values) {
            addCriterion("deleteOwnFiction not in", values, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnFiction between", value1, value2, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnFiction not between", value1, value2, "deleteOwnFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterIsNull() {
            addCriterion("deleteOwnChapter is null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterIsNotNull() {
            addCriterion("deleteOwnChapter is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterEqualTo(Boolean value) {
            addCriterion("deleteOwnChapter =", value, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterNotEqualTo(Boolean value) {
            addCriterion("deleteOwnChapter <>", value, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterGreaterThan(Boolean value) {
            addCriterion("deleteOwnChapter >", value, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnChapter >=", value, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterLessThan(Boolean value) {
            addCriterion("deleteOwnChapter <", value, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnChapter <=", value, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterIn(List<Boolean> values) {
            addCriterion("deleteOwnChapter in", values, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterNotIn(List<Boolean> values) {
            addCriterion("deleteOwnChapter not in", values, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnChapter between", value1, value2, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnChapter not between", value1, value2, "deleteOwnChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentIsNull() {
            addCriterion("deleteOwnComment is null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentIsNotNull() {
            addCriterion("deleteOwnComment is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentEqualTo(Boolean value) {
            addCriterion("deleteOwnComment =", value, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentNotEqualTo(Boolean value) {
            addCriterion("deleteOwnComment <>", value, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentGreaterThan(Boolean value) {
            addCriterion("deleteOwnComment >", value, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnComment >=", value, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentLessThan(Boolean value) {
            addCriterion("deleteOwnComment <", value, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteOwnComment <=", value, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentIn(List<Boolean> values) {
            addCriterion("deleteOwnComment in", values, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentNotIn(List<Boolean> values) {
            addCriterion("deleteOwnComment not in", values, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnComment between", value1, value2, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteOwnCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteOwnComment not between", value1, value2, "deleteOwnComment");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicIsNull() {
            addCriterion("deleteTopic is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicIsNotNull() {
            addCriterion("deleteTopic is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicEqualTo(Boolean value) {
            addCriterion("deleteTopic =", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicNotEqualTo(Boolean value) {
            addCriterion("deleteTopic <>", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicGreaterThan(Boolean value) {
            addCriterion("deleteTopic >", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteTopic >=", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicLessThan(Boolean value) {
            addCriterion("deleteTopic <", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteTopic <=", value, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicIn(List<Boolean> values) {
            addCriterion("deleteTopic in", values, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicNotIn(List<Boolean> values) {
            addCriterion("deleteTopic not in", values, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteTopic between", value1, value2, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteTopic not between", value1, value2, "deleteTopic");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyIsNull() {
            addCriterion("deleteReply is null");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyIsNotNull() {
            addCriterion("deleteReply is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyEqualTo(Boolean value) {
            addCriterion("deleteReply =", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyNotEqualTo(Boolean value) {
            addCriterion("deleteReply <>", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyGreaterThan(Boolean value) {
            addCriterion("deleteReply >", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteReply >=", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyLessThan(Boolean value) {
            addCriterion("deleteReply <", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteReply <=", value, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyIn(List<Boolean> values) {
            addCriterion("deleteReply in", values, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyNotIn(List<Boolean> values) {
            addCriterion("deleteReply not in", values, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteReply between", value1, value2, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteReply not between", value1, value2, "deleteReply");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionIsNull() {
            addCriterion("deleteFiction is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionIsNotNull() {
            addCriterion("deleteFiction is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionEqualTo(Boolean value) {
            addCriterion("deleteFiction =", value, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionNotEqualTo(Boolean value) {
            addCriterion("deleteFiction <>", value, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionGreaterThan(Boolean value) {
            addCriterion("deleteFiction >", value, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteFiction >=", value, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionLessThan(Boolean value) {
            addCriterion("deleteFiction <", value, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteFiction <=", value, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionIn(List<Boolean> values) {
            addCriterion("deleteFiction in", values, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionNotIn(List<Boolean> values) {
            addCriterion("deleteFiction not in", values, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteFiction between", value1, value2, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteFiction not between", value1, value2, "deleteFiction");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterIsNull() {
            addCriterion("deleteChapter is null");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterIsNotNull() {
            addCriterion("deleteChapter is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterEqualTo(Boolean value) {
            addCriterion("deleteChapter =", value, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterNotEqualTo(Boolean value) {
            addCriterion("deleteChapter <>", value, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterGreaterThan(Boolean value) {
            addCriterion("deleteChapter >", value, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteChapter >=", value, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterLessThan(Boolean value) {
            addCriterion("deleteChapter <", value, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteChapter <=", value, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterIn(List<Boolean> values) {
            addCriterion("deleteChapter in", values, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterNotIn(List<Boolean> values) {
            addCriterion("deleteChapter not in", values, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteChapter between", value1, value2, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteChapter not between", value1, value2, "deleteChapter");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentIsNull() {
            addCriterion("deleteComment is null");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentIsNotNull() {
            addCriterion("deleteComment is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentEqualTo(Boolean value) {
            addCriterion("deleteComment =", value, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentNotEqualTo(Boolean value) {
            addCriterion("deleteComment <>", value, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentGreaterThan(Boolean value) {
            addCriterion("deleteComment >", value, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteComment >=", value, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentLessThan(Boolean value) {
            addCriterion("deleteComment <", value, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteComment <=", value, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentIn(List<Boolean> values) {
            addCriterion("deleteComment in", values, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentNotIn(List<Boolean> values) {
            addCriterion("deleteComment not in", values, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteComment between", value1, value2, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andDeleteCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteComment not between", value1, value2, "deleteComment");
            return (Criteria) this;
        }

        public Criteria andLockTopicIsNull() {
            addCriterion("lockTopic is null");
            return (Criteria) this;
        }

        public Criteria andLockTopicIsNotNull() {
            addCriterion("lockTopic is not null");
            return (Criteria) this;
        }

        public Criteria andLockTopicEqualTo(Boolean value) {
            addCriterion("lockTopic =", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicNotEqualTo(Boolean value) {
            addCriterion("lockTopic <>", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicGreaterThan(Boolean value) {
            addCriterion("lockTopic >", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockTopic >=", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicLessThan(Boolean value) {
            addCriterion("lockTopic <", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("lockTopic <=", value, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicIn(List<Boolean> values) {
            addCriterion("lockTopic in", values, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicNotIn(List<Boolean> values) {
            addCriterion("lockTopic not in", values, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("lockTopic between", value1, value2, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockTopic not between", value1, value2, "lockTopic");
            return (Criteria) this;
        }

        public Criteria andLockFictionIsNull() {
            addCriterion("lockFiction is null");
            return (Criteria) this;
        }

        public Criteria andLockFictionIsNotNull() {
            addCriterion("lockFiction is not null");
            return (Criteria) this;
        }

        public Criteria andLockFictionEqualTo(Boolean value) {
            addCriterion("lockFiction =", value, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionNotEqualTo(Boolean value) {
            addCriterion("lockFiction <>", value, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionGreaterThan(Boolean value) {
            addCriterion("lockFiction >", value, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockFiction >=", value, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionLessThan(Boolean value) {
            addCriterion("lockFiction <", value, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("lockFiction <=", value, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionIn(List<Boolean> values) {
            addCriterion("lockFiction in", values, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionNotIn(List<Boolean> values) {
            addCriterion("lockFiction not in", values, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("lockFiction between", value1, value2, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockFiction not between", value1, value2, "lockFiction");
            return (Criteria) this;
        }

        public Criteria andLockChapterIsNull() {
            addCriterion("lockChapter is null");
            return (Criteria) this;
        }

        public Criteria andLockChapterIsNotNull() {
            addCriterion("lockChapter is not null");
            return (Criteria) this;
        }

        public Criteria andLockChapterEqualTo(Boolean value) {
            addCriterion("lockChapter =", value, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterNotEqualTo(Boolean value) {
            addCriterion("lockChapter <>", value, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterGreaterThan(Boolean value) {
            addCriterion("lockChapter >", value, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockChapter >=", value, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterLessThan(Boolean value) {
            addCriterion("lockChapter <", value, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("lockChapter <=", value, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterIn(List<Boolean> values) {
            addCriterion("lockChapter in", values, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterNotIn(List<Boolean> values) {
            addCriterion("lockChapter not in", values, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("lockChapter between", value1, value2, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockChapter not between", value1, value2, "lockChapter");
            return (Criteria) this;
        }

        public Criteria andLockNoticeIsNull() {
            addCriterion("lockNotice is null");
            return (Criteria) this;
        }

        public Criteria andLockNoticeIsNotNull() {
            addCriterion("lockNotice is not null");
            return (Criteria) this;
        }

        public Criteria andLockNoticeEqualTo(Boolean value) {
            addCriterion("lockNotice =", value, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeNotEqualTo(Boolean value) {
            addCriterion("lockNotice <>", value, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeGreaterThan(Boolean value) {
            addCriterion("lockNotice >", value, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockNotice >=", value, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeLessThan(Boolean value) {
            addCriterion("lockNotice <", value, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeLessThanOrEqualTo(Boolean value) {
            addCriterion("lockNotice <=", value, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeIn(List<Boolean> values) {
            addCriterion("lockNotice in", values, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeNotIn(List<Boolean> values) {
            addCriterion("lockNotice not in", values, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeBetween(Boolean value1, Boolean value2) {
            addCriterion("lockNotice between", value1, value2, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockNoticeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockNotice not between", value1, value2, "lockNotice");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicIsNull() {
            addCriterion("lockContentOfTopic is null");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicIsNotNull() {
            addCriterion("lockContentOfTopic is not null");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicEqualTo(Boolean value) {
            addCriterion("lockContentOfTopic =", value, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicNotEqualTo(Boolean value) {
            addCriterion("lockContentOfTopic <>", value, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicGreaterThan(Boolean value) {
            addCriterion("lockContentOfTopic >", value, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockContentOfTopic >=", value, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicLessThan(Boolean value) {
            addCriterion("lockContentOfTopic <", value, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("lockContentOfTopic <=", value, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicIn(List<Boolean> values) {
            addCriterion("lockContentOfTopic in", values, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicNotIn(List<Boolean> values) {
            addCriterion("lockContentOfTopic not in", values, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("lockContentOfTopic between", value1, value2, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockContentOfTopic not between", value1, value2, "lockContentOfTopic");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionIsNull() {
            addCriterion("lockContentOfFiction is null");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionIsNotNull() {
            addCriterion("lockContentOfFiction is not null");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionEqualTo(Boolean value) {
            addCriterion("lockContentOfFiction =", value, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionNotEqualTo(Boolean value) {
            addCriterion("lockContentOfFiction <>", value, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionGreaterThan(Boolean value) {
            addCriterion("lockContentOfFiction >", value, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockContentOfFiction >=", value, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionLessThan(Boolean value) {
            addCriterion("lockContentOfFiction <", value, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("lockContentOfFiction <=", value, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionIn(List<Boolean> values) {
            addCriterion("lockContentOfFiction in", values, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionNotIn(List<Boolean> values) {
            addCriterion("lockContentOfFiction not in", values, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("lockContentOfFiction between", value1, value2, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockContentOfFiction not between", value1, value2, "lockContentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterIsNull() {
            addCriterion("lockContentOfChapter is null");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterIsNotNull() {
            addCriterion("lockContentOfChapter is not null");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterEqualTo(Boolean value) {
            addCriterion("lockContentOfChapter =", value, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterNotEqualTo(Boolean value) {
            addCriterion("lockContentOfChapter <>", value, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterGreaterThan(Boolean value) {
            addCriterion("lockContentOfChapter >", value, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockContentOfChapter >=", value, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterLessThan(Boolean value) {
            addCriterion("lockContentOfChapter <", value, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("lockContentOfChapter <=", value, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterIn(List<Boolean> values) {
            addCriterion("lockContentOfChapter in", values, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterNotIn(List<Boolean> values) {
            addCriterion("lockContentOfChapter not in", values, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("lockContentOfChapter between", value1, value2, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockContentOfChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockContentOfChapter not between", value1, value2, "lockContentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionIsNull() {
            addCriterion("lockCommentOfOwnFiction is null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionIsNotNull() {
            addCriterion("lockCommentOfOwnFiction is not null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionEqualTo(Boolean value) {
            addCriterion("lockCommentOfOwnFiction =", value, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionNotEqualTo(Boolean value) {
            addCriterion("lockCommentOfOwnFiction <>", value, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionGreaterThan(Boolean value) {
            addCriterion("lockCommentOfOwnFiction >", value, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfOwnFiction >=", value, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionLessThan(Boolean value) {
            addCriterion("lockCommentOfOwnFiction <", value, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfOwnFiction <=", value, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionIn(List<Boolean> values) {
            addCriterion("lockCommentOfOwnFiction in", values, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionNotIn(List<Boolean> values) {
            addCriterion("lockCommentOfOwnFiction not in", values, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfOwnFiction between", value1, value2, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfOwnFiction not between", value1, value2, "lockCommentOfOwnFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterIsNull() {
            addCriterion("lockCommentOfOwnChapter is null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterIsNotNull() {
            addCriterion("lockCommentOfOwnChapter is not null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterEqualTo(Boolean value) {
            addCriterion("lockCommentOfOwnChapter =", value, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterNotEqualTo(Boolean value) {
            addCriterion("lockCommentOfOwnChapter <>", value, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterGreaterThan(Boolean value) {
            addCriterion("lockCommentOfOwnChapter >", value, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfOwnChapter >=", value, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterLessThan(Boolean value) {
            addCriterion("lockCommentOfOwnChapter <", value, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfOwnChapter <=", value, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterIn(List<Boolean> values) {
            addCriterion("lockCommentOfOwnChapter in", values, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterNotIn(List<Boolean> values) {
            addCriterion("lockCommentOfOwnChapter not in", values, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfOwnChapter between", value1, value2, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfOwnChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfOwnChapter not between", value1, value2, "lockCommentOfOwnChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionIsNull() {
            addCriterion("lockCommentOfFiction is null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionIsNotNull() {
            addCriterion("lockCommentOfFiction is not null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionEqualTo(Boolean value) {
            addCriterion("lockCommentOfFiction =", value, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionNotEqualTo(Boolean value) {
            addCriterion("lockCommentOfFiction <>", value, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionGreaterThan(Boolean value) {
            addCriterion("lockCommentOfFiction >", value, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfFiction >=", value, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionLessThan(Boolean value) {
            addCriterion("lockCommentOfFiction <", value, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfFiction <=", value, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionIn(List<Boolean> values) {
            addCriterion("lockCommentOfFiction in", values, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionNotIn(List<Boolean> values) {
            addCriterion("lockCommentOfFiction not in", values, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfFiction between", value1, value2, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfFiction not between", value1, value2, "lockCommentOfFiction");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterIsNull() {
            addCriterion("lockCommentOfChapter is null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterIsNotNull() {
            addCriterion("lockCommentOfChapter is not null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterEqualTo(Boolean value) {
            addCriterion("lockCommentOfChapter =", value, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterNotEqualTo(Boolean value) {
            addCriterion("lockCommentOfChapter <>", value, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterGreaterThan(Boolean value) {
            addCriterion("lockCommentOfChapter >", value, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfChapter >=", value, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterLessThan(Boolean value) {
            addCriterion("lockCommentOfChapter <", value, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfChapter <=", value, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterIn(List<Boolean> values) {
            addCriterion("lockCommentOfChapter in", values, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterNotIn(List<Boolean> values) {
            addCriterion("lockCommentOfChapter not in", values, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfChapter between", value1, value2, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfChapter not between", value1, value2, "lockCommentOfChapter");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardIsNull() {
            addCriterion("lockTopicOfBoard is null");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardIsNotNull() {
            addCriterion("lockTopicOfBoard is not null");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardEqualTo(Boolean value) {
            addCriterion("lockTopicOfBoard =", value, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardNotEqualTo(Boolean value) {
            addCriterion("lockTopicOfBoard <>", value, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardGreaterThan(Boolean value) {
            addCriterion("lockTopicOfBoard >", value, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockTopicOfBoard >=", value, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardLessThan(Boolean value) {
            addCriterion("lockTopicOfBoard <", value, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardLessThanOrEqualTo(Boolean value) {
            addCriterion("lockTopicOfBoard <=", value, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardIn(List<Boolean> values) {
            addCriterion("lockTopicOfBoard in", values, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardNotIn(List<Boolean> values) {
            addCriterion("lockTopicOfBoard not in", values, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardBetween(Boolean value1, Boolean value2) {
            addCriterion("lockTopicOfBoard between", value1, value2, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockTopicOfBoardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockTopicOfBoard not between", value1, value2, "lockTopicOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardIsNull() {
            addCriterion("lockReplyOfBoard is null");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardIsNotNull() {
            addCriterion("lockReplyOfBoard is not null");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardEqualTo(Boolean value) {
            addCriterion("lockReplyOfBoard =", value, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardNotEqualTo(Boolean value) {
            addCriterion("lockReplyOfBoard <>", value, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardGreaterThan(Boolean value) {
            addCriterion("lockReplyOfBoard >", value, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockReplyOfBoard >=", value, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardLessThan(Boolean value) {
            addCriterion("lockReplyOfBoard <", value, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardLessThanOrEqualTo(Boolean value) {
            addCriterion("lockReplyOfBoard <=", value, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardIn(List<Boolean> values) {
            addCriterion("lockReplyOfBoard in", values, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardNotIn(List<Boolean> values) {
            addCriterion("lockReplyOfBoard not in", values, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardBetween(Boolean value1, Boolean value2) {
            addCriterion("lockReplyOfBoard between", value1, value2, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockReplyOfBoardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockReplyOfBoard not between", value1, value2, "lockReplyOfBoard");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryIsNull() {
            addCriterion("lockFictionOfCategory is null");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryIsNotNull() {
            addCriterion("lockFictionOfCategory is not null");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryEqualTo(Boolean value) {
            addCriterion("lockFictionOfCategory =", value, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryNotEqualTo(Boolean value) {
            addCriterion("lockFictionOfCategory <>", value, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryGreaterThan(Boolean value) {
            addCriterion("lockFictionOfCategory >", value, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockFictionOfCategory >=", value, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryLessThan(Boolean value) {
            addCriterion("lockFictionOfCategory <", value, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryLessThanOrEqualTo(Boolean value) {
            addCriterion("lockFictionOfCategory <=", value, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryIn(List<Boolean> values) {
            addCriterion("lockFictionOfCategory in", values, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryNotIn(List<Boolean> values) {
            addCriterion("lockFictionOfCategory not in", values, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryBetween(Boolean value1, Boolean value2) {
            addCriterion("lockFictionOfCategory between", value1, value2, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockFictionOfCategoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockFictionOfCategory not between", value1, value2, "lockFictionOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryIsNull() {
            addCriterion("lockChapterOfCategory is null");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryIsNotNull() {
            addCriterion("lockChapterOfCategory is not null");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryEqualTo(Boolean value) {
            addCriterion("lockChapterOfCategory =", value, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryNotEqualTo(Boolean value) {
            addCriterion("lockChapterOfCategory <>", value, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryGreaterThan(Boolean value) {
            addCriterion("lockChapterOfCategory >", value, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockChapterOfCategory >=", value, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryLessThan(Boolean value) {
            addCriterion("lockChapterOfCategory <", value, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryLessThanOrEqualTo(Boolean value) {
            addCriterion("lockChapterOfCategory <=", value, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryIn(List<Boolean> values) {
            addCriterion("lockChapterOfCategory in", values, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryNotIn(List<Boolean> values) {
            addCriterion("lockChapterOfCategory not in", values, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryBetween(Boolean value1, Boolean value2) {
            addCriterion("lockChapterOfCategory between", value1, value2, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockChapterOfCategoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockChapterOfCategory not between", value1, value2, "lockChapterOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryIsNull() {
            addCriterion("lockCommentOfCategory is null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryIsNotNull() {
            addCriterion("lockCommentOfCategory is not null");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryEqualTo(Boolean value) {
            addCriterion("lockCommentOfCategory =", value, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryNotEqualTo(Boolean value) {
            addCriterion("lockCommentOfCategory <>", value, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryGreaterThan(Boolean value) {
            addCriterion("lockCommentOfCategory >", value, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfCategory >=", value, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryLessThan(Boolean value) {
            addCriterion("lockCommentOfCategory <", value, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryLessThanOrEqualTo(Boolean value) {
            addCriterion("lockCommentOfCategory <=", value, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryIn(List<Boolean> values) {
            addCriterion("lockCommentOfCategory in", values, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryNotIn(List<Boolean> values) {
            addCriterion("lockCommentOfCategory not in", values, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfCategory between", value1, value2, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andLockCommentOfCategoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockCommentOfCategory not between", value1, value2, "lockCommentOfCategory");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicIsNull() {
            addCriterion("hideOwnTopic is null");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicIsNotNull() {
            addCriterion("hideOwnTopic is not null");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicEqualTo(Boolean value) {
            addCriterion("hideOwnTopic =", value, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicNotEqualTo(Boolean value) {
            addCriterion("hideOwnTopic <>", value, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicGreaterThan(Boolean value) {
            addCriterion("hideOwnTopic >", value, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideOwnTopic >=", value, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicLessThan(Boolean value) {
            addCriterion("hideOwnTopic <", value, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("hideOwnTopic <=", value, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicIn(List<Boolean> values) {
            addCriterion("hideOwnTopic in", values, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicNotIn(List<Boolean> values) {
            addCriterion("hideOwnTopic not in", values, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("hideOwnTopic between", value1, value2, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideOwnTopic not between", value1, value2, "hideOwnTopic");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionIsNull() {
            addCriterion("hideOwnFiction is null");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionIsNotNull() {
            addCriterion("hideOwnFiction is not null");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionEqualTo(Boolean value) {
            addCriterion("hideOwnFiction =", value, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionNotEqualTo(Boolean value) {
            addCriterion("hideOwnFiction <>", value, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionGreaterThan(Boolean value) {
            addCriterion("hideOwnFiction >", value, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideOwnFiction >=", value, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionLessThan(Boolean value) {
            addCriterion("hideOwnFiction <", value, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("hideOwnFiction <=", value, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionIn(List<Boolean> values) {
            addCriterion("hideOwnFiction in", values, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionNotIn(List<Boolean> values) {
            addCriterion("hideOwnFiction not in", values, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("hideOwnFiction between", value1, value2, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideOwnFiction not between", value1, value2, "hideOwnFiction");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterIsNull() {
            addCriterion("hideOwnChapter is null");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterIsNotNull() {
            addCriterion("hideOwnChapter is not null");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterEqualTo(Boolean value) {
            addCriterion("hideOwnChapter =", value, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterNotEqualTo(Boolean value) {
            addCriterion("hideOwnChapter <>", value, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterGreaterThan(Boolean value) {
            addCriterion("hideOwnChapter >", value, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideOwnChapter >=", value, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterLessThan(Boolean value) {
            addCriterion("hideOwnChapter <", value, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("hideOwnChapter <=", value, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterIn(List<Boolean> values) {
            addCriterion("hideOwnChapter in", values, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterNotIn(List<Boolean> values) {
            addCriterion("hideOwnChapter not in", values, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("hideOwnChapter between", value1, value2, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideOwnChapter not between", value1, value2, "hideOwnChapter");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentIsNull() {
            addCriterion("hideOwnComment is null");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentIsNotNull() {
            addCriterion("hideOwnComment is not null");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentEqualTo(Boolean value) {
            addCriterion("hideOwnComment =", value, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentNotEqualTo(Boolean value) {
            addCriterion("hideOwnComment <>", value, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentGreaterThan(Boolean value) {
            addCriterion("hideOwnComment >", value, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideOwnComment >=", value, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentLessThan(Boolean value) {
            addCriterion("hideOwnComment <", value, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("hideOwnComment <=", value, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentIn(List<Boolean> values) {
            addCriterion("hideOwnComment in", values, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentNotIn(List<Boolean> values) {
            addCriterion("hideOwnComment not in", values, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("hideOwnComment between", value1, value2, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideOwnCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideOwnComment not between", value1, value2, "hideOwnComment");
            return (Criteria) this;
        }

        public Criteria andHideTopicIsNull() {
            addCriterion("hideTopic is null");
            return (Criteria) this;
        }

        public Criteria andHideTopicIsNotNull() {
            addCriterion("hideTopic is not null");
            return (Criteria) this;
        }

        public Criteria andHideTopicEqualTo(Boolean value) {
            addCriterion("hideTopic =", value, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicNotEqualTo(Boolean value) {
            addCriterion("hideTopic <>", value, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicGreaterThan(Boolean value) {
            addCriterion("hideTopic >", value, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideTopic >=", value, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicLessThan(Boolean value) {
            addCriterion("hideTopic <", value, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("hideTopic <=", value, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicIn(List<Boolean> values) {
            addCriterion("hideTopic in", values, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicNotIn(List<Boolean> values) {
            addCriterion("hideTopic not in", values, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("hideTopic between", value1, value2, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideTopic not between", value1, value2, "hideTopic");
            return (Criteria) this;
        }

        public Criteria andHideFictionIsNull() {
            addCriterion("hideFiction is null");
            return (Criteria) this;
        }

        public Criteria andHideFictionIsNotNull() {
            addCriterion("hideFiction is not null");
            return (Criteria) this;
        }

        public Criteria andHideFictionEqualTo(Boolean value) {
            addCriterion("hideFiction =", value, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionNotEqualTo(Boolean value) {
            addCriterion("hideFiction <>", value, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionGreaterThan(Boolean value) {
            addCriterion("hideFiction >", value, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideFiction >=", value, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionLessThan(Boolean value) {
            addCriterion("hideFiction <", value, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("hideFiction <=", value, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionIn(List<Boolean> values) {
            addCriterion("hideFiction in", values, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionNotIn(List<Boolean> values) {
            addCriterion("hideFiction not in", values, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("hideFiction between", value1, value2, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideFiction not between", value1, value2, "hideFiction");
            return (Criteria) this;
        }

        public Criteria andHideChapterIsNull() {
            addCriterion("hideChapter is null");
            return (Criteria) this;
        }

        public Criteria andHideChapterIsNotNull() {
            addCriterion("hideChapter is not null");
            return (Criteria) this;
        }

        public Criteria andHideChapterEqualTo(Boolean value) {
            addCriterion("hideChapter =", value, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterNotEqualTo(Boolean value) {
            addCriterion("hideChapter <>", value, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterGreaterThan(Boolean value) {
            addCriterion("hideChapter >", value, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideChapter >=", value, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterLessThan(Boolean value) {
            addCriterion("hideChapter <", value, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("hideChapter <=", value, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterIn(List<Boolean> values) {
            addCriterion("hideChapter in", values, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterNotIn(List<Boolean> values) {
            addCriterion("hideChapter not in", values, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("hideChapter between", value1, value2, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideChapter not between", value1, value2, "hideChapter");
            return (Criteria) this;
        }

        public Criteria andHideCommentIsNull() {
            addCriterion("hideComment is null");
            return (Criteria) this;
        }

        public Criteria andHideCommentIsNotNull() {
            addCriterion("hideComment is not null");
            return (Criteria) this;
        }

        public Criteria andHideCommentEqualTo(Boolean value) {
            addCriterion("hideComment =", value, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentNotEqualTo(Boolean value) {
            addCriterion("hideComment <>", value, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentGreaterThan(Boolean value) {
            addCriterion("hideComment >", value, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideComment >=", value, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentLessThan(Boolean value) {
            addCriterion("hideComment <", value, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("hideComment <=", value, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentIn(List<Boolean> values) {
            addCriterion("hideComment in", values, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentNotIn(List<Boolean> values) {
            addCriterion("hideComment not in", values, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("hideComment between", value1, value2, "hideComment");
            return (Criteria) this;
        }

        public Criteria andHideCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideComment not between", value1, value2, "hideComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicIsNull() {
            addCriterion("setAnonymousOfOwnTopic is null");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicIsNotNull() {
            addCriterion("setAnonymousOfOwnTopic is not null");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnTopic =", value, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicNotEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnTopic <>", value, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicGreaterThan(Boolean value) {
            addCriterion("setAnonymousOfOwnTopic >", value, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnTopic >=", value, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicLessThan(Boolean value) {
            addCriterion("setAnonymousOfOwnTopic <", value, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnTopic <=", value, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicIn(List<Boolean> values) {
            addCriterion("setAnonymousOfOwnTopic in", values, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicNotIn(List<Boolean> values) {
            addCriterion("setAnonymousOfOwnTopic not in", values, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("setAnonymousOfOwnTopic between", value1, value2, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setAnonymousOfOwnTopic not between", value1, value2, "setAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyIsNull() {
            addCriterion("setAnonymousOfOwnReply is null");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyIsNotNull() {
            addCriterion("setAnonymousOfOwnReply is not null");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnReply =", value, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyNotEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnReply <>", value, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyGreaterThan(Boolean value) {
            addCriterion("setAnonymousOfOwnReply >", value, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnReply >=", value, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyLessThan(Boolean value) {
            addCriterion("setAnonymousOfOwnReply <", value, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnReply <=", value, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyIn(List<Boolean> values) {
            addCriterion("setAnonymousOfOwnReply in", values, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyNotIn(List<Boolean> values) {
            addCriterion("setAnonymousOfOwnReply not in", values, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("setAnonymousOfOwnReply between", value1, value2, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setAnonymousOfOwnReply not between", value1, value2, "setAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentIsNull() {
            addCriterion("setAnonymousOfOwnComment is null");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentIsNotNull() {
            addCriterion("setAnonymousOfOwnComment is not null");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnComment =", value, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentNotEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnComment <>", value, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentGreaterThan(Boolean value) {
            addCriterion("setAnonymousOfOwnComment >", value, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnComment >=", value, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentLessThan(Boolean value) {
            addCriterion("setAnonymousOfOwnComment <", value, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("setAnonymousOfOwnComment <=", value, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentIn(List<Boolean> values) {
            addCriterion("setAnonymousOfOwnComment in", values, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentNotIn(List<Boolean> values) {
            addCriterion("setAnonymousOfOwnComment not in", values, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("setAnonymousOfOwnComment between", value1, value2, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andSetAnonymousOfOwnCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setAnonymousOfOwnComment not between", value1, value2, "setAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicIsNull() {
            addCriterion("cancelAnonymousOfOwnTopic is null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicIsNotNull() {
            addCriterion("cancelAnonymousOfOwnTopic is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnTopic =", value, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicNotEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnTopic <>", value, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicGreaterThan(Boolean value) {
            addCriterion("cancelAnonymousOfOwnTopic >", value, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnTopic >=", value, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicLessThan(Boolean value) {
            addCriterion("cancelAnonymousOfOwnTopic <", value, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnTopic <=", value, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicIn(List<Boolean> values) {
            addCriterion("cancelAnonymousOfOwnTopic in", values, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicNotIn(List<Boolean> values) {
            addCriterion("cancelAnonymousOfOwnTopic not in", values, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousOfOwnTopic between", value1, value2, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousOfOwnTopic not between", value1, value2, "cancelAnonymousOfOwnTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyIsNull() {
            addCriterion("cancelAnonymousOfOwnReply is null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyIsNotNull() {
            addCriterion("cancelAnonymousOfOwnReply is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnReply =", value, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyNotEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnReply <>", value, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyGreaterThan(Boolean value) {
            addCriterion("cancelAnonymousOfOwnReply >", value, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnReply >=", value, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyLessThan(Boolean value) {
            addCriterion("cancelAnonymousOfOwnReply <", value, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnReply <=", value, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyIn(List<Boolean> values) {
            addCriterion("cancelAnonymousOfOwnReply in", values, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyNotIn(List<Boolean> values) {
            addCriterion("cancelAnonymousOfOwnReply not in", values, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousOfOwnReply between", value1, value2, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousOfOwnReply not between", value1, value2, "cancelAnonymousOfOwnReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentIsNull() {
            addCriterion("cancelAnonymousOfOwnComment is null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentIsNotNull() {
            addCriterion("cancelAnonymousOfOwnComment is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnComment =", value, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentNotEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnComment <>", value, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentGreaterThan(Boolean value) {
            addCriterion("cancelAnonymousOfOwnComment >", value, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnComment >=", value, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentLessThan(Boolean value) {
            addCriterion("cancelAnonymousOfOwnComment <", value, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousOfOwnComment <=", value, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentIn(List<Boolean> values) {
            addCriterion("cancelAnonymousOfOwnComment in", values, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentNotIn(List<Boolean> values) {
            addCriterion("cancelAnonymousOfOwnComment not in", values, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousOfOwnComment between", value1, value2, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousOfOwnCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousOfOwnComment not between", value1, value2, "cancelAnonymousOfOwnComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicIsNull() {
            addCriterion("cancelAnonymousTopic is null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicIsNotNull() {
            addCriterion("cancelAnonymousTopic is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicEqualTo(Boolean value) {
            addCriterion("cancelAnonymousTopic =", value, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicNotEqualTo(Boolean value) {
            addCriterion("cancelAnonymousTopic <>", value, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicGreaterThan(Boolean value) {
            addCriterion("cancelAnonymousTopic >", value, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousTopic >=", value, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicLessThan(Boolean value) {
            addCriterion("cancelAnonymousTopic <", value, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousTopic <=", value, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicIn(List<Boolean> values) {
            addCriterion("cancelAnonymousTopic in", values, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicNotIn(List<Boolean> values) {
            addCriterion("cancelAnonymousTopic not in", values, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousTopic between", value1, value2, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousTopic not between", value1, value2, "cancelAnonymousTopic");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyIsNull() {
            addCriterion("cancelAnonymousReply is null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyIsNotNull() {
            addCriterion("cancelAnonymousReply is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyEqualTo(Boolean value) {
            addCriterion("cancelAnonymousReply =", value, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyNotEqualTo(Boolean value) {
            addCriterion("cancelAnonymousReply <>", value, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyGreaterThan(Boolean value) {
            addCriterion("cancelAnonymousReply >", value, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousReply >=", value, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyLessThan(Boolean value) {
            addCriterion("cancelAnonymousReply <", value, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousReply <=", value, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyIn(List<Boolean> values) {
            addCriterion("cancelAnonymousReply in", values, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyNotIn(List<Boolean> values) {
            addCriterion("cancelAnonymousReply not in", values, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousReply between", value1, value2, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousReply not between", value1, value2, "cancelAnonymousReply");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentIsNull() {
            addCriterion("cancelAnonymousComment is null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentIsNotNull() {
            addCriterion("cancelAnonymousComment is not null");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentEqualTo(Boolean value) {
            addCriterion("cancelAnonymousComment =", value, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentNotEqualTo(Boolean value) {
            addCriterion("cancelAnonymousComment <>", value, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentGreaterThan(Boolean value) {
            addCriterion("cancelAnonymousComment >", value, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousComment >=", value, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentLessThan(Boolean value) {
            addCriterion("cancelAnonymousComment <", value, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("cancelAnonymousComment <=", value, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentIn(List<Boolean> values) {
            addCriterion("cancelAnonymousComment in", values, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentNotIn(List<Boolean> values) {
            addCriterion("cancelAnonymousComment not in", values, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousComment between", value1, value2, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andCancelAnonymousCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cancelAnonymousComment not between", value1, value2, "cancelAnonymousComment");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionIsNull() {
            addCriterion("restrictOwnFiction is null");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionIsNotNull() {
            addCriterion("restrictOwnFiction is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionEqualTo(Boolean value) {
            addCriterion("restrictOwnFiction =", value, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionNotEqualTo(Boolean value) {
            addCriterion("restrictOwnFiction <>", value, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionGreaterThan(Boolean value) {
            addCriterion("restrictOwnFiction >", value, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictOwnFiction >=", value, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionLessThan(Boolean value) {
            addCriterion("restrictOwnFiction <", value, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictOwnFiction <=", value, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionIn(List<Boolean> values) {
            addCriterion("restrictOwnFiction in", values, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionNotIn(List<Boolean> values) {
            addCriterion("restrictOwnFiction not in", values, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictOwnFiction between", value1, value2, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictOwnFiction not between", value1, value2, "restrictOwnFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterIsNull() {
            addCriterion("restrictOwnChapter is null");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterIsNotNull() {
            addCriterion("restrictOwnChapter is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterEqualTo(Boolean value) {
            addCriterion("restrictOwnChapter =", value, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterNotEqualTo(Boolean value) {
            addCriterion("restrictOwnChapter <>", value, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterGreaterThan(Boolean value) {
            addCriterion("restrictOwnChapter >", value, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictOwnChapter >=", value, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterLessThan(Boolean value) {
            addCriterion("restrictOwnChapter <", value, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictOwnChapter <=", value, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterIn(List<Boolean> values) {
            addCriterion("restrictOwnChapter in", values, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterNotIn(List<Boolean> values) {
            addCriterion("restrictOwnChapter not in", values, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictOwnChapter between", value1, value2, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictOwnChapter not between", value1, value2, "restrictOwnChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicIsNull() {
            addCriterion("restrictOwnTopic is null");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicIsNotNull() {
            addCriterion("restrictOwnTopic is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicEqualTo(Boolean value) {
            addCriterion("restrictOwnTopic =", value, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicNotEqualTo(Boolean value) {
            addCriterion("restrictOwnTopic <>", value, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicGreaterThan(Boolean value) {
            addCriterion("restrictOwnTopic >", value, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictOwnTopic >=", value, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicLessThan(Boolean value) {
            addCriterion("restrictOwnTopic <", value, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictOwnTopic <=", value, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicIn(List<Boolean> values) {
            addCriterion("restrictOwnTopic in", values, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicNotIn(List<Boolean> values) {
            addCriterion("restrictOwnTopic not in", values, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictOwnTopic between", value1, value2, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictOwnTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictOwnTopic not between", value1, value2, "restrictOwnTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionIsNull() {
            addCriterion("restrictFiction is null");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionIsNotNull() {
            addCriterion("restrictFiction is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionEqualTo(Boolean value) {
            addCriterion("restrictFiction =", value, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionNotEqualTo(Boolean value) {
            addCriterion("restrictFiction <>", value, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionGreaterThan(Boolean value) {
            addCriterion("restrictFiction >", value, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictFiction >=", value, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionLessThan(Boolean value) {
            addCriterion("restrictFiction <", value, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictFiction <=", value, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionIn(List<Boolean> values) {
            addCriterion("restrictFiction in", values, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionNotIn(List<Boolean> values) {
            addCriterion("restrictFiction not in", values, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictFiction between", value1, value2, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictFiction not between", value1, value2, "restrictFiction");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterIsNull() {
            addCriterion("restrictChapter is null");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterIsNotNull() {
            addCriterion("restrictChapter is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterEqualTo(Boolean value) {
            addCriterion("restrictChapter =", value, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterNotEqualTo(Boolean value) {
            addCriterion("restrictChapter <>", value, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterGreaterThan(Boolean value) {
            addCriterion("restrictChapter >", value, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictChapter >=", value, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterLessThan(Boolean value) {
            addCriterion("restrictChapter <", value, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictChapter <=", value, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterIn(List<Boolean> values) {
            addCriterion("restrictChapter in", values, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterNotIn(List<Boolean> values) {
            addCriterion("restrictChapter not in", values, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictChapter between", value1, value2, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictChapter not between", value1, value2, "restrictChapter");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicIsNull() {
            addCriterion("restrictTopic is null");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicIsNotNull() {
            addCriterion("restrictTopic is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicEqualTo(Boolean value) {
            addCriterion("restrictTopic =", value, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicNotEqualTo(Boolean value) {
            addCriterion("restrictTopic <>", value, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicGreaterThan(Boolean value) {
            addCriterion("restrictTopic >", value, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictTopic >=", value, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicLessThan(Boolean value) {
            addCriterion("restrictTopic <", value, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictTopic <=", value, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicIn(List<Boolean> values) {
            addCriterion("restrictTopic in", values, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicNotIn(List<Boolean> values) {
            addCriterion("restrictTopic not in", values, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictTopic between", value1, value2, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictTopic not between", value1, value2, "restrictTopic");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeIsNull() {
            addCriterion("restrictNotice is null");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeIsNotNull() {
            addCriterion("restrictNotice is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeEqualTo(Boolean value) {
            addCriterion("restrictNotice =", value, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeNotEqualTo(Boolean value) {
            addCriterion("restrictNotice <>", value, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeGreaterThan(Boolean value) {
            addCriterion("restrictNotice >", value, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictNotice >=", value, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeLessThan(Boolean value) {
            addCriterion("restrictNotice <", value, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictNotice <=", value, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeIn(List<Boolean> values) {
            addCriterion("restrictNotice in", values, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeNotIn(List<Boolean> values) {
            addCriterion("restrictNotice not in", values, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictNotice between", value1, value2, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictNoticeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictNotice not between", value1, value2, "restrictNotice");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryIsNull() {
            addCriterion("restrictCategory is null");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryIsNotNull() {
            addCriterion("restrictCategory is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryEqualTo(Boolean value) {
            addCriterion("restrictCategory =", value, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryNotEqualTo(Boolean value) {
            addCriterion("restrictCategory <>", value, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryGreaterThan(Boolean value) {
            addCriterion("restrictCategory >", value, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictCategory >=", value, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryLessThan(Boolean value) {
            addCriterion("restrictCategory <", value, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictCategory <=", value, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryIn(List<Boolean> values) {
            addCriterion("restrictCategory in", values, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryNotIn(List<Boolean> values) {
            addCriterion("restrictCategory not in", values, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictCategory between", value1, value2, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictCategoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictCategory not between", value1, value2, "restrictCategory");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardIsNull() {
            addCriterion("restrictBoard is null");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardIsNotNull() {
            addCriterion("restrictBoard is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardEqualTo(Boolean value) {
            addCriterion("restrictBoard =", value, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardNotEqualTo(Boolean value) {
            addCriterion("restrictBoard <>", value, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardGreaterThan(Boolean value) {
            addCriterion("restrictBoard >", value, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restrictBoard >=", value, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardLessThan(Boolean value) {
            addCriterion("restrictBoard <", value, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardLessThanOrEqualTo(Boolean value) {
            addCriterion("restrictBoard <=", value, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardIn(List<Boolean> values) {
            addCriterion("restrictBoard in", values, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardNotIn(List<Boolean> values) {
            addCriterion("restrictBoard not in", values, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictBoard between", value1, value2, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andRestrictBoardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restrictBoard not between", value1, value2, "restrictBoard");
            return (Criteria) this;
        }

        public Criteria andHideCategoryIsNull() {
            addCriterion("hideCategory is null");
            return (Criteria) this;
        }

        public Criteria andHideCategoryIsNotNull() {
            addCriterion("hideCategory is not null");
            return (Criteria) this;
        }

        public Criteria andHideCategoryEqualTo(Boolean value) {
            addCriterion("hideCategory =", value, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryNotEqualTo(Boolean value) {
            addCriterion("hideCategory <>", value, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryGreaterThan(Boolean value) {
            addCriterion("hideCategory >", value, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideCategory >=", value, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryLessThan(Boolean value) {
            addCriterion("hideCategory <", value, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryLessThanOrEqualTo(Boolean value) {
            addCriterion("hideCategory <=", value, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryIn(List<Boolean> values) {
            addCriterion("hideCategory in", values, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryNotIn(List<Boolean> values) {
            addCriterion("hideCategory not in", values, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryBetween(Boolean value1, Boolean value2) {
            addCriterion("hideCategory between", value1, value2, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideCategoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideCategory not between", value1, value2, "hideCategory");
            return (Criteria) this;
        }

        public Criteria andHideBoardIsNull() {
            addCriterion("hideBoard is null");
            return (Criteria) this;
        }

        public Criteria andHideBoardIsNotNull() {
            addCriterion("hideBoard is not null");
            return (Criteria) this;
        }

        public Criteria andHideBoardEqualTo(Boolean value) {
            addCriterion("hideBoard =", value, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardNotEqualTo(Boolean value) {
            addCriterion("hideBoard <>", value, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardGreaterThan(Boolean value) {
            addCriterion("hideBoard >", value, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hideBoard >=", value, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardLessThan(Boolean value) {
            addCriterion("hideBoard <", value, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardLessThanOrEqualTo(Boolean value) {
            addCriterion("hideBoard <=", value, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardIn(List<Boolean> values) {
            addCriterion("hideBoard in", values, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardNotIn(List<Boolean> values) {
            addCriterion("hideBoard not in", values, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardBetween(Boolean value1, Boolean value2) {
            addCriterion("hideBoard between", value1, value2, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andHideBoardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hideBoard not between", value1, value2, "hideBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryIsNull() {
            addCriterion("deleteCategory is null");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryIsNotNull() {
            addCriterion("deleteCategory is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryEqualTo(Boolean value) {
            addCriterion("deleteCategory =", value, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryNotEqualTo(Boolean value) {
            addCriterion("deleteCategory <>", value, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryGreaterThan(Boolean value) {
            addCriterion("deleteCategory >", value, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteCategory >=", value, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryLessThan(Boolean value) {
            addCriterion("deleteCategory <", value, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteCategory <=", value, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryIn(List<Boolean> values) {
            addCriterion("deleteCategory in", values, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryNotIn(List<Boolean> values) {
            addCriterion("deleteCategory not in", values, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteCategory between", value1, value2, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteCategoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteCategory not between", value1, value2, "deleteCategory");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardIsNull() {
            addCriterion("deleteBoard is null");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardIsNotNull() {
            addCriterion("deleteBoard is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardEqualTo(Boolean value) {
            addCriterion("deleteBoard =", value, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardNotEqualTo(Boolean value) {
            addCriterion("deleteBoard <>", value, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardGreaterThan(Boolean value) {
            addCriterion("deleteBoard >", value, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteBoard >=", value, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardLessThan(Boolean value) {
            addCriterion("deleteBoard <", value, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteBoard <=", value, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardIn(List<Boolean> values) {
            addCriterion("deleteBoard in", values, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardNotIn(List<Boolean> values) {
            addCriterion("deleteBoard not in", values, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteBoard between", value1, value2, "deleteBoard");
            return (Criteria) this;
        }

        public Criteria andDeleteBoardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteBoard not between", value1, value2, "deleteBoard");
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
