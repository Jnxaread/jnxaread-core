package com.jnxaread.bean.wrap;

import com.jnxaread.bean.Comment;

/**
 * @author 未央
 * @create 2020-05-09 8:54
 */
public class CommentWrap extends Comment {

    private String username;

    private String fictionTitle;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFictionTitle() {
        return fictionTitle;
    }

    public void setFictionTitle(String fictionTitle) {
        this.fictionTitle = fictionTitle;
    }
}
