package com.jnxaread.service;

import com.jnxaread.bean.Topic;
import com.jnxaread.bean.wrap.ReplyWrap;
import com.jnxaread.bean.wrap.TopicWrap;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-03 22:35
 */
public interface BaseForumService {

    int addTopic(Topic newTopic);

    TopicWrap getTopicWrap(int id);

    List<ReplyWrap> getReplyWrapList(int topicId,int page);

    long getReplyCountByTopicId(int topicId);

}
