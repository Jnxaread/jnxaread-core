package com.jnxaread.bean;

public class Authority {
    private Integer id;

    private String role;

    private Boolean addNotice;

    private Boolean addCategory;

    private Boolean addBoard;

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

    private Boolean hideOwnComment;

    private Boolean hideTopic;

    private Boolean hideFiction;

    private Boolean hideChapter;

    private Boolean hideComment;

    private Boolean setAnonymousOfOwnTopic;

    private Boolean setAnonymousOfOwnReply;

    private Boolean setAnonymousOfOwnComment;

    private Boolean cancelAnonymousOfOwnTopic;

    private Boolean cancelAnonymousOfOwnReply;

    private Boolean cancelAnonymousOfOwnComment;

    private Boolean cancelAnonymousTopic;

    private Boolean cancelAnonymousReply;

    private Boolean cancelAnonymousComment;

    private Boolean restrictOwnFiction;

    private Boolean restrictOwnChapter;

    private Boolean restrictOwnTopic;

    private Boolean restrictFiction;

    private Boolean restrictChapter;

    private Boolean restrictTopic;

    private Boolean restrictNotice;

    private Boolean restrictCategory;

    private Boolean restrictBoard;

    private Boolean lockCategory;

    private Boolean lockBoard;

    private Boolean hideCategory;

    private Boolean hideBoard;

    private Boolean deleteCategory;

    private Boolean deleteBoard;

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

    public Boolean getAddNotice() {
        return addNotice;
    }

    public void setAddNotice(Boolean addNotice) {
        this.addNotice = addNotice;
    }

    public Boolean getAddCategory() {
        return addCategory;
    }

    public void setAddCategory(Boolean addCategory) {
        this.addCategory = addCategory;
    }

    public Boolean getAddBoard() {
        return addBoard;
    }

    public void setAddBoard(Boolean addBoard) {
        this.addBoard = addBoard;
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

    public Boolean getHideOwnComment() {
        return hideOwnComment;
    }

    public void setHideOwnComment(Boolean hideOwnComment) {
        this.hideOwnComment = hideOwnComment;
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

    public Boolean getHideComment() {
        return hideComment;
    }

    public void setHideComment(Boolean hideComment) {
        this.hideComment = hideComment;
    }

    public Boolean getSetAnonymousOfOwnTopic() {
        return setAnonymousOfOwnTopic;
    }

    public void setSetAnonymousOfOwnTopic(Boolean setAnonymousOfOwnTopic) {
        this.setAnonymousOfOwnTopic = setAnonymousOfOwnTopic;
    }

    public Boolean getSetAnonymousOfOwnReply() {
        return setAnonymousOfOwnReply;
    }

    public void setSetAnonymousOfOwnReply(Boolean setAnonymousOfOwnReply) {
        this.setAnonymousOfOwnReply = setAnonymousOfOwnReply;
    }

    public Boolean getSetAnonymousOfOwnComment() {
        return setAnonymousOfOwnComment;
    }

    public void setSetAnonymousOfOwnComment(Boolean setAnonymousOfOwnComment) {
        this.setAnonymousOfOwnComment = setAnonymousOfOwnComment;
    }

    public Boolean getCancelAnonymousOfOwnTopic() {
        return cancelAnonymousOfOwnTopic;
    }

    public void setCancelAnonymousOfOwnTopic(Boolean cancelAnonymousOfOwnTopic) {
        this.cancelAnonymousOfOwnTopic = cancelAnonymousOfOwnTopic;
    }

    public Boolean getCancelAnonymousOfOwnReply() {
        return cancelAnonymousOfOwnReply;
    }

    public void setCancelAnonymousOfOwnReply(Boolean cancelAnonymousOfOwnReply) {
        this.cancelAnonymousOfOwnReply = cancelAnonymousOfOwnReply;
    }

    public Boolean getCancelAnonymousOfOwnComment() {
        return cancelAnonymousOfOwnComment;
    }

    public void setCancelAnonymousOfOwnComment(Boolean cancelAnonymousOfOwnComment) {
        this.cancelAnonymousOfOwnComment = cancelAnonymousOfOwnComment;
    }

    public Boolean getCancelAnonymousTopic() {
        return cancelAnonymousTopic;
    }

    public void setCancelAnonymousTopic(Boolean cancelAnonymousTopic) {
        this.cancelAnonymousTopic = cancelAnonymousTopic;
    }

    public Boolean getCancelAnonymousReply() {
        return cancelAnonymousReply;
    }

    public void setCancelAnonymousReply(Boolean cancelAnonymousReply) {
        this.cancelAnonymousReply = cancelAnonymousReply;
    }

    public Boolean getCancelAnonymousComment() {
        return cancelAnonymousComment;
    }

    public void setCancelAnonymousComment(Boolean cancelAnonymousComment) {
        this.cancelAnonymousComment = cancelAnonymousComment;
    }

    public Boolean getRestrictOwnFiction() {
        return restrictOwnFiction;
    }

    public void setRestrictOwnFiction(Boolean restrictOwnFiction) {
        this.restrictOwnFiction = restrictOwnFiction;
    }

    public Boolean getRestrictOwnChapter() {
        return restrictOwnChapter;
    }

    public void setRestrictOwnChapter(Boolean restrictOwnChapter) {
        this.restrictOwnChapter = restrictOwnChapter;
    }

    public Boolean getRestrictOwnTopic() {
        return restrictOwnTopic;
    }

    public void setRestrictOwnTopic(Boolean restrictOwnTopic) {
        this.restrictOwnTopic = restrictOwnTopic;
    }

    public Boolean getRestrictFiction() {
        return restrictFiction;
    }

    public void setRestrictFiction(Boolean restrictFiction) {
        this.restrictFiction = restrictFiction;
    }

    public Boolean getRestrictChapter() {
        return restrictChapter;
    }

    public void setRestrictChapter(Boolean restrictChapter) {
        this.restrictChapter = restrictChapter;
    }

    public Boolean getRestrictTopic() {
        return restrictTopic;
    }

    public void setRestrictTopic(Boolean restrictTopic) {
        this.restrictTopic = restrictTopic;
    }

    public Boolean getRestrictNotice() {
        return restrictNotice;
    }

    public void setRestrictNotice(Boolean restrictNotice) {
        this.restrictNotice = restrictNotice;
    }

    public Boolean getRestrictCategory() {
        return restrictCategory;
    }

    public void setRestrictCategory(Boolean restrictCategory) {
        this.restrictCategory = restrictCategory;
    }

    public Boolean getRestrictBoard() {
        return restrictBoard;
    }

    public void setRestrictBoard(Boolean restrictBoard) {
        this.restrictBoard = restrictBoard;
    }

    public Boolean getLockCategory() {
        return lockCategory;
    }

    public void setLockCategory(Boolean lockCategory) {
        this.lockCategory = lockCategory;
    }

    public Boolean getLockBoard() {
        return lockBoard;
    }

    public void setLockBoard(Boolean lockBoard) {
        this.lockBoard = lockBoard;
    }

    public Boolean getHideCategory() {
        return hideCategory;
    }

    public void setHideCategory(Boolean hideCategory) {
        this.hideCategory = hideCategory;
    }

    public Boolean getHideBoard() {
        return hideBoard;
    }

    public void setHideBoard(Boolean hideBoard) {
        this.hideBoard = hideBoard;
    }

    public Boolean getDeleteCategory() {
        return deleteCategory;
    }

    public void setDeleteCategory(Boolean deleteCategory) {
        this.deleteCategory = deleteCategory;
    }

    public Boolean getDeleteBoard() {
        return deleteBoard;
    }

    public void setDeleteBoard(Boolean deleteBoard) {
        this.deleteBoard = deleteBoard;
    }
}
