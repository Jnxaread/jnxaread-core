package com.jnxaread.bean;

import java.util.Date;

public class Chapter {
    private Integer id;

    private Integer fictionId;

    private Integer userId;

    private Date createTime;

    private Integer number;

    private Integer wordCount;

    private Integer viewCount;

    private Boolean hided;

    private Boolean lockedContent;

    private Boolean lockedComment;

    private Boolean deleted;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFictionId() {
        return fictionId;
    }

    public void setFictionId(Integer fictionId) {
        this.fictionId = fictionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Boolean getHided() {
        return hided;
    }

    public void setHided(Boolean hided) {
        this.hided = hided;
    }

    public Boolean getLockedContent() {
        return lockedContent;
    }

    public void setLockedContent(Boolean lockedContent) {
        this.lockedContent = lockedContent;
    }

    public Boolean getLockedComment() {
        return lockedComment;
    }

    public void setLockedComment(Boolean lockedComment) {
        this.lockedComment = lockedComment;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}