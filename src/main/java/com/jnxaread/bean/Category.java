package com.jnxaread.bean;

import java.util.Date;

public class Category {
    private Integer id;

    private String name;

    private String description;

    private Integer fictionCount;

    private Integer chapterCount;

    private Integer commentCount;

    private Integer restricted;

    private Boolean fictionLocked;

    private Boolean chapterLocked;

    private Boolean commentLocked;

    private Boolean hided;

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

    public Boolean getHided() {
        return hided;
    }

    public void setHided(Boolean hided) {
        this.hided = hided;
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
