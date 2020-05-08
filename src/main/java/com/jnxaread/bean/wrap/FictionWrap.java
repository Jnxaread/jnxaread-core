package com.jnxaread.bean.wrap;

import com.jnxaread.bean.Fiction;

/**
 * @author 未央
 * @create 2020-05-07 10:02
 */
public class FictionWrap extends Fiction {

    private String category;

    private String username;

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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
