package com.jnxaread.service;

import com.jnxaread.bean.Reply;
import com.jnxaread.bean.Topic;
import com.jnxaread.bean.wrap.ReplyWrap;
import com.jnxaread.bean.wrap.TopicWrap;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-03 22:35
 */
public interface BaseForumService {

    /**
     * 添加帖子
     *
     * @param newTopic
     * @return
     */
    int addTopic(Topic newTopic);

    /**
     * 添加回复
     *
     * @param newReply
     * @return
     */
    int addReply(Reply newReply);

    /**
     * 获取帖子包装类型
     *
     * @param id
     * @return
     */
    TopicWrap getTopicWrap(int id);

    /**
     * 获取回复包装类型列表
     *
     * @param topicId
     * @param page
     * @return
     */
    List<ReplyWrap> getReplyWrapList(int topicId, int page);

    /**
     * 根据帖子Id获取回复数量
     *
     * @param topicId
     * @return
     */
    long getReplyCountByTopicId(int topicId);

    /**
     * 获取帖子包装类型列表
     *
     * @param page
     * @return
     */
    List<TopicWrap> getTopicWrapList(int page);

    /**
     * 根据用户ID获取回复包装类型列表
     *
     * @param userId
     * @return
     */
    List<ReplyWrap> getReplyWrapListByUserId(int userId);

    /**
     * 获取帖子数量
     *
     * @return
     */
    long getTopicCount();

}
