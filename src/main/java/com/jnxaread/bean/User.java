package com.jnxaread.bean;

import java.util.Date;

public class User {
    private Integer id;

    private String account;

    private String password;

    private String username;

    private String countryCode;

    private String mobile;

    private String email;

    private Integer gender;

    private Integer authorityId;

    private Boolean bannedTopic;

    private Boolean bannedReply;

    private Boolean bannedMessage;

    private Boolean bannedFiction;

    private Boolean bannedChapter;

    private Boolean bannedComment;

    private Boolean locked;

    private Boolean deleted;

    private Integer topicCount;

    private Integer replyCount;

    private Integer fictionCount;

    private Integer chapterCount;

    private Integer commentCount;

    private Integer loginCount;

    private Date createTime;

    private String photo;

    private String comeFrom;

    private String signature;

    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public Boolean getBannedTopic() {
        return bannedTopic;
    }

    public void setBannedTopic(Boolean bannedTopic) {
        this.bannedTopic = bannedTopic;
    }

    public Boolean getBannedReply() {
        return bannedReply;
    }

    public void setBannedReply(Boolean bannedReply) {
        this.bannedReply = bannedReply;
    }

    public Boolean getBannedMessage() {
        return bannedMessage;
    }

    public void setBannedMessage(Boolean bannedMessage) {
        this.bannedMessage = bannedMessage;
    }

    public Boolean getBannedFiction() {
        return bannedFiction;
    }

    public void setBannedFiction(Boolean bannedFiction) {
        this.bannedFiction = bannedFiction;
    }

    public Boolean getBannedChapter() {
        return bannedChapter;
    }

    public void setBannedChapter(Boolean bannedChapter) {
        this.bannedChapter = bannedChapter;
    }

    public Boolean getBannedComment() {
        return bannedComment;
    }

    public void setBannedComment(Boolean bannedComment) {
        this.bannedComment = bannedComment;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getFictionCount() {
        return fictionCount;
    }

    public void setFictionCount(Integer fictionCount) {
        this.fictionCount = fictionCount;
    }

    public Integer getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(Integer chapterCount) {
        this.chapterCount = chapterCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom == null ? null : comeFrom.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}