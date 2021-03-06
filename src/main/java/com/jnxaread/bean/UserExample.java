package com.jnxaread.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("countryCode is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("countryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("countryCode =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("countryCode <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("countryCode >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("countryCode >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("countryCode <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("countryCode <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("countryCode like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("countryCode not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("countryCode in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("countryCode not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("countryCode between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("countryCode not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNull() {
            addCriterion("authorityId is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("authorityId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(Integer value) {
            addCriterion("authorityId =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(Integer value) {
            addCriterion("authorityId <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(Integer value) {
            addCriterion("authorityId >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("authorityId >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(Integer value) {
            addCriterion("authorityId <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("authorityId <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<Integer> values) {
            addCriterion("authorityId in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<Integer> values) {
            addCriterion("authorityId not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(Integer value1, Integer value2) {
            addCriterion("authorityId between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("authorityId not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andBannedTopicIsNull() {
            addCriterion("bannedTopic is null");
            return (Criteria) this;
        }

        public Criteria andBannedTopicIsNotNull() {
            addCriterion("bannedTopic is not null");
            return (Criteria) this;
        }

        public Criteria andBannedTopicEqualTo(Boolean value) {
            addCriterion("bannedTopic =", value, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicNotEqualTo(Boolean value) {
            addCriterion("bannedTopic <>", value, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicGreaterThan(Boolean value) {
            addCriterion("bannedTopic >", value, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bannedTopic >=", value, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicLessThan(Boolean value) {
            addCriterion("bannedTopic <", value, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicLessThanOrEqualTo(Boolean value) {
            addCriterion("bannedTopic <=", value, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicIn(List<Boolean> values) {
            addCriterion("bannedTopic in", values, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicNotIn(List<Boolean> values) {
            addCriterion("bannedTopic not in", values, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedTopic between", value1, value2, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedTopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedTopic not between", value1, value2, "bannedTopic");
            return (Criteria) this;
        }

        public Criteria andBannedReplyIsNull() {
            addCriterion("bannedReply is null");
            return (Criteria) this;
        }

        public Criteria andBannedReplyIsNotNull() {
            addCriterion("bannedReply is not null");
            return (Criteria) this;
        }

        public Criteria andBannedReplyEqualTo(Boolean value) {
            addCriterion("bannedReply =", value, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyNotEqualTo(Boolean value) {
            addCriterion("bannedReply <>", value, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyGreaterThan(Boolean value) {
            addCriterion("bannedReply >", value, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bannedReply >=", value, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyLessThan(Boolean value) {
            addCriterion("bannedReply <", value, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("bannedReply <=", value, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyIn(List<Boolean> values) {
            addCriterion("bannedReply in", values, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyNotIn(List<Boolean> values) {
            addCriterion("bannedReply not in", values, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedReply between", value1, value2, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedReply not between", value1, value2, "bannedReply");
            return (Criteria) this;
        }

        public Criteria andBannedMessageIsNull() {
            addCriterion("bannedMessage is null");
            return (Criteria) this;
        }

        public Criteria andBannedMessageIsNotNull() {
            addCriterion("bannedMessage is not null");
            return (Criteria) this;
        }

        public Criteria andBannedMessageEqualTo(Boolean value) {
            addCriterion("bannedMessage =", value, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageNotEqualTo(Boolean value) {
            addCriterion("bannedMessage <>", value, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageGreaterThan(Boolean value) {
            addCriterion("bannedMessage >", value, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bannedMessage >=", value, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageLessThan(Boolean value) {
            addCriterion("bannedMessage <", value, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageLessThanOrEqualTo(Boolean value) {
            addCriterion("bannedMessage <=", value, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageIn(List<Boolean> values) {
            addCriterion("bannedMessage in", values, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageNotIn(List<Boolean> values) {
            addCriterion("bannedMessage not in", values, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedMessage between", value1, value2, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedMessageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedMessage not between", value1, value2, "bannedMessage");
            return (Criteria) this;
        }

        public Criteria andBannedFictionIsNull() {
            addCriterion("bannedFiction is null");
            return (Criteria) this;
        }

        public Criteria andBannedFictionIsNotNull() {
            addCriterion("bannedFiction is not null");
            return (Criteria) this;
        }

        public Criteria andBannedFictionEqualTo(Boolean value) {
            addCriterion("bannedFiction =", value, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionNotEqualTo(Boolean value) {
            addCriterion("bannedFiction <>", value, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionGreaterThan(Boolean value) {
            addCriterion("bannedFiction >", value, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bannedFiction >=", value, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionLessThan(Boolean value) {
            addCriterion("bannedFiction <", value, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionLessThanOrEqualTo(Boolean value) {
            addCriterion("bannedFiction <=", value, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionIn(List<Boolean> values) {
            addCriterion("bannedFiction in", values, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionNotIn(List<Boolean> values) {
            addCriterion("bannedFiction not in", values, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedFiction between", value1, value2, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedFictionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedFiction not between", value1, value2, "bannedFiction");
            return (Criteria) this;
        }

        public Criteria andBannedChapterIsNull() {
            addCriterion("bannedChapter is null");
            return (Criteria) this;
        }

        public Criteria andBannedChapterIsNotNull() {
            addCriterion("bannedChapter is not null");
            return (Criteria) this;
        }

        public Criteria andBannedChapterEqualTo(Boolean value) {
            addCriterion("bannedChapter =", value, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterNotEqualTo(Boolean value) {
            addCriterion("bannedChapter <>", value, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterGreaterThan(Boolean value) {
            addCriterion("bannedChapter >", value, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bannedChapter >=", value, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterLessThan(Boolean value) {
            addCriterion("bannedChapter <", value, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterLessThanOrEqualTo(Boolean value) {
            addCriterion("bannedChapter <=", value, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterIn(List<Boolean> values) {
            addCriterion("bannedChapter in", values, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterNotIn(List<Boolean> values) {
            addCriterion("bannedChapter not in", values, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedChapter between", value1, value2, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedChapterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedChapter not between", value1, value2, "bannedChapter");
            return (Criteria) this;
        }

        public Criteria andBannedCommentIsNull() {
            addCriterion("bannedComment is null");
            return (Criteria) this;
        }

        public Criteria andBannedCommentIsNotNull() {
            addCriterion("bannedComment is not null");
            return (Criteria) this;
        }

        public Criteria andBannedCommentEqualTo(Boolean value) {
            addCriterion("bannedComment =", value, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentNotEqualTo(Boolean value) {
            addCriterion("bannedComment <>", value, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentGreaterThan(Boolean value) {
            addCriterion("bannedComment >", value, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bannedComment >=", value, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentLessThan(Boolean value) {
            addCriterion("bannedComment <", value, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentLessThanOrEqualTo(Boolean value) {
            addCriterion("bannedComment <=", value, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentIn(List<Boolean> values) {
            addCriterion("bannedComment in", values, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentNotIn(List<Boolean> values) {
            addCriterion("bannedComment not in", values, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedComment between", value1, value2, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andBannedCommentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bannedComment not between", value1, value2, "bannedComment");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Boolean value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Boolean value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Boolean value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Boolean value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Boolean> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Boolean> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("locked not between", value1, value2, "locked");
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

        public Criteria andLoginCountIsNull() {
            addCriterion("loginCount is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("loginCount is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("loginCount =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("loginCount <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("loginCount >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginCount >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("loginCount <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("loginCount <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("loginCount in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("loginCount not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("loginCount between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loginCount not between", value1, value2, "loginCount");
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

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNull() {
            addCriterion("comeFrom is null");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNotNull() {
            addCriterion("comeFrom is not null");
            return (Criteria) this;
        }

        public Criteria andComeFromEqualTo(String value) {
            addCriterion("comeFrom =", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotEqualTo(String value) {
            addCriterion("comeFrom <>", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThan(String value) {
            addCriterion("comeFrom >", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThanOrEqualTo(String value) {
            addCriterion("comeFrom >=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThan(String value) {
            addCriterion("comeFrom <", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThanOrEqualTo(String value) {
            addCriterion("comeFrom <=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLike(String value) {
            addCriterion("comeFrom like", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotLike(String value) {
            addCriterion("comeFrom not like", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromIn(List<String> values) {
            addCriterion("comeFrom in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotIn(List<String> values) {
            addCriterion("comeFrom not in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromBetween(String value1, String value2) {
            addCriterion("comeFrom between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotBetween(String value1, String value2) {
            addCriterion("comeFrom not between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
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
