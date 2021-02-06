package com.jnxaread.bean;

import java.util.Date;

public class Category {
    private Integer id;

    private String name;

    private String description;

    private Integer fictionCount;

    private Integer chapterCount;

    private Integer commentCount;

    private Integer visible;

    private Integer restricted;

    private Boolean fictionLocked;

    private Boolean chapterLocked;

    private Boolean commentLocked;

    private Integer userId;

    private Integer managerId;

    private Boolean deleted;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getRestricted() {
        return restricted;
    }

    public void setRestricted(Integer restricted) {
        this.restricted = restricted;
    }

    public Boolean getFictionLocked() {
        return fictionLocked;
    }

    public void setFictionLocked(Boolean fictionLocked) {
        this.fictionLocked = fictionLocked;
    }

    public Boolean getChapterLocked() {
        return chapterLocked;
    }

    public void setChapterLocked(Boolean chapterLocked) {
        this.chapterLocked = chapterLocked;
    }

    public Boolean getCommentLocked() {
        return commentLocked;
    }

    public void setCommentLocked(Boolean commentLocked) {
        this.commentLocked = commentLocked;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}