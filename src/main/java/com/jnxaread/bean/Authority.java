package com.jnxaread.bean;

public class Authority {
    private Integer id;

    private String role;

    private Boolean banAccount;

    private Boolean banTopic;

    private Boolean banReply;

    private Boolean banMessage;

    private Boolean banFiction;

    private Boolean banComment;

    private Boolean deleteOwnTopic;

    private Boolean deleteOwnReply;

    private Boolean deleteOwnFiction;

    private Boolean deleteOwnChapter;

    private Boolean deleteOwnComment;

    private Boolean deleteTopic;

    private Boolean deleteReply;

    private Boolean deleteFiction;

    private Boolean deleteChapter;

    private Boolean deleteComment;

    private Boolean lockTopic;

    private Boolean lockFiction;

    private Boolean lockChapter;

    private Boolean lockNotice;

    private Boolean lockContentOfTopic;

    private Boolean lockContentOfFiction;

    private Boolean lockContentOfChapter;

    private Boolean lockCommentOfOwnFiction;

    private Boolean lockCommentOfOwnChapter;

    private Boolean lockCommentOfFiction;

    private Boolean lockCommentOfChapter;

    private Boolean hideOwnTopic;

    private Boolean hideOwnFiction;

    private Boolean hideOwnChapter;

    private Boolean hideTopic;

    private Boolean hideFiction;

    private Boolean hideChapter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Boolean getBanAccount() {
        return banAccount;
    }

    public void setBanAccount(Boolean banAccount) {
        this.banAccount = banAccount;
    }

    public Boolean getBanTopic() {
        return banTopic;
    }

    public void setBanTopic(Boolean banTopic) {
        this.banTopic = banTopic;
    }

    public Boolean getBanReply() {
        return banReply;
    }

    public void setBanReply(Boolean banReply) {
        this.banReply = banReply;
    }

    public Boolean getBanMessage() {
        return banMessage;
    }

    public void setBanMessage(Boolean banMessage) {
        this.banMessage = banMessage;
    }

    public Boolean getBanFiction() {
        return banFiction;
    }

    public void setBanFiction(Boolean banFiction) {
        this.banFiction = banFiction;
    }

    public Boolean getBanComment() {
        return banComment;
    }

    public void setBanComment(Boolean banComment) {
        this.banComment = banComment;
    }

    public Boolean getDeleteOwnTopic() {
        return deleteOwnTopic;
    }

    public void setDeleteOwnTopic(Boolean deleteOwnTopic) {
        this.deleteOwnTopic = deleteOwnTopic;
    }

    public Boolean getDeleteOwnReply() {
        return deleteOwnReply;
    }

    public void setDeleteOwnReply(Boolean deleteOwnReply) {
        this.deleteOwnReply = deleteOwnReply;
    }

    public Boolean getDeleteOwnFiction() {
        return deleteOwnFiction;
    }

    public void setDeleteOwnFiction(Boolean deleteOwnFiction) {
        this.deleteOwnFiction = deleteOwnFiction;
    }

    public Boolean getDeleteOwnChapter() {
        return deleteOwnChapter;
    }

    public void setDeleteOwnChapter(Boolean deleteOwnChapter) {
        this.deleteOwnChapter = deleteOwnChapter;
    }

    public Boolean getDeleteOwnComment() {
        return deleteOwnComment;
    }

    public void setDeleteOwnComment(Boolean deleteOwnComment) {
        this.deleteOwnComment = deleteOwnComment;
    }

    public Boolean getDeleteTopic() {
        return deleteTopic;
    }

    public void setDeleteTopic(Boolean deleteTopic) {
        this.deleteTopic = deleteTopic;
    }

    public Boolean getDeleteReply() {
        return deleteReply;
    }

    public void setDeleteReply(Boolean deleteReply) {
        this.deleteReply = deleteReply;
    }

    public Boolean getDeleteFiction() {
        return deleteFiction;
    }

    public void setDeleteFiction(Boolean deleteFiction) {
        this.deleteFiction = deleteFiction;
    }

    public Boolean getDeleteChapter() {
        return deleteChapter;
    }

    public void setDeleteChapter(Boolean deleteChapter) {
        this.deleteChapter = deleteChapter;
    }

    public Boolean getDeleteComment() {
        return deleteComment;
    }

    public void setDeleteComment(Boolean deleteComment) {
        this.deleteComment = deleteComment;
    }

    public Boolean getLockTopic() {
        return lockTopic;
    }

    public void setLockTopic(Boolean lockTopic) {
        this.lockTopic = lockTopic;
    }

    public Boolean getLockFiction() {
        return lockFiction;
    }

    public void setLockFiction(Boolean lockFiction) {
        this.lockFiction = lockFiction;
    }

    public Boolean getLockChapter() {
        return lockChapter;
    }

    public void setLockChapter(Boolean lockChapter) {
        this.lockChapter = lockChapter;
    }

    public Boolean getLockNotice() {
        return lockNotice;
    }

    public void setLockNotice(Boolean lockNotice) {
        this.lockNotice = lockNotice;
    }

    public Boolean getLockContentOfTopic() {
        return lockContentOfTopic;
    }

    public void setLockContentOfTopic(Boolean lockContentOfTopic) {
        this.lockContentOfTopic = lockContentOfTopic;
    }

    public Boolean getLockContentOfFiction() {
        return lockContentOfFiction;
    }

    public void setLockContentOfFiction(Boolean lockContentOfFiction) {
        this.lockContentOfFiction = lockContentOfFiction;
    }

    public Boolean getLockContentOfChapter() {
        return lockContentOfChapter;
    }

    public void setLockContentOfChapter(Boolean lockContentOfChapter) {
        this.lockContentOfChapter = lockContentOfChapter;
    }

    public Boolean getLockCommentOfOwnFiction() {
        return lockCommentOfOwnFiction;
    }

    public void setLockCommentOfOwnFiction(Boolean lockCommentOfOwnFiction) {
        this.lockCommentOfOwnFiction = lockCommentOfOwnFiction;
    }

    public Boolean getLockCommentOfOwnChapter() {
        return lockCommentOfOwnChapter;
    }

    public void setLockCommentOfOwnChapter(Boolean lockCommentOfOwnChapter) {
        this.lockCommentOfOwnChapter = lockCommentOfOwnChapter;
    }

    public Boolean getLockCommentOfFiction() {
        return lockCommentOfFiction;
    }

    public void setLockCommentOfFiction(Boolean lockCommentOfFiction) {
        this.lockCommentOfFiction = lockCommentOfFiction;
    }

    public Boolean getLockCommentOfChapter() {
        return lockCommentOfChapter;
    }

    public void setLockCommentOfChapter(Boolean lockCommentOfChapter) {
        this.lockCommentOfChapter = lockCommentOfChapter;
    }

    public Boolean getHideOwnTopic() {
        return hideOwnTopic;
    }

    public void setHideOwnTopic(Boolean hideOwnTopic) {
        this.hideOwnTopic = hideOwnTopic;
    }

    public Boolean getHideOwnFiction() {
        return hideOwnFiction;
    }

    public void setHideOwnFiction(Boolean hideOwnFiction) {
        this.hideOwnFiction = hideOwnFiction;
    }

    public Boolean getHideOwnChapter() {
        return hideOwnChapter;
    }

    public void setHideOwnChapter(Boolean hideOwnChapter) {
        this.hideOwnChapter = hideOwnChapter;
    }

    public Boolean getHideTopic() {
        return hideTopic;
    }

    public void setHideTopic(Boolean hideTopic) {
        this.hideTopic = hideTopic;
    }

    public Boolean getHideFiction() {
        return hideFiction;
    }

    public void setHideFiction(Boolean hideFiction) {
        this.hideFiction = hideFiction;
    }

    public Boolean getHideChapter() {
        return hideChapter;
    }

    public void setHideChapter(Boolean hideChapter) {
        this.hideChapter = hideChapter;
    }
}