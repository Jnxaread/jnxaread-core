package com.jnxaread.bean.wrap;

import com.jnxaread.bean.Reply;

/**
 * @author 未央
 * @create 2019-11-02 16:13
 */
public class ReplyWrap extends Reply {

    private String username;

    private ReplyWrap quotedReply;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ReplyWrap getQuotedReply() {
        return quotedReply;
    }

    public void setQuotedReply(ReplyWrap quotedReply) {
        this.quotedReply = quotedReply;
    }
}
