package com.jnxaread.bean;

import java.util.Date;

public class Board {
    private Integer id;

    private String name;

    private String description;

    private Integer noticeCount;

    private Integer topicCount;

    private Integer replyCount;

    private Integer visible;

    private Integer restricted;

    private Boolean topicLocked;

    private Boolean replyLocked;

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

    public Integer getNoticeCount() {
        return noticeCount;
    }

    public void setNoticeCount(Integer noticeCount) {
        this.noticeCount = noticeCount;
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

    public Boolean getTopicLocked() {
        return topicLocked;
    }

    public void setTopicLocked(Boolean topicLocked) {
        this.topicLocked = topicLocked;
    }

    public Boolean getReplyLocked() {
        return replyLocked;
    }

    public void setReplyLocked(Boolean replyLocked) {
        this.replyLocked = replyLocked;
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