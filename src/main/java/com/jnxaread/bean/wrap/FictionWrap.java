package com.jnxaread.bean.wrap;

import com.jnxaread.bean.Fiction;

import java.util.Date;

/**
 * @author 未央
 * @create 2020-05-07 10:02
 */
public class FictionWrap extends Fiction {

    private String category;

    private String username;

    private Date lastTime;

    private Integer lastNumber;

    private String lastChapter;

    private String[] tags;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Integer lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(String lastChapter) {
        this.lastChapter = lastChapter;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
