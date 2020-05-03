package com.jnxaread.service.impl;

import com.jnxaread.bean.Topic;
import com.jnxaread.bean.model.TopicModel;
import com.jnxaread.dao.ReplyMapper;
import com.jnxaread.dao.TopicMapper;
import com.jnxaread.dao.UserMapper;
import com.jnxaread.service.BaseForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 未央
 * @create 2020-05-03 22:37
 */
@Service
public class BaseForumServiceImpl implements BaseForumService {

    @Autowired(required = false)
    private TopicMapper topicMapper;

    @Autowired(required = false)
    private ReplyMapper replyMapper;

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    @Transactional(timeout = 5)
    public int addTopic(Topic newTopic) {
        topicMapper.insertSelective(newTopic);
        //帖子作者的发帖量+1
        userMapper.updateTopicCountByPrimaryKey(newTopic.getUserId());
        return newTopic.getId();
    }

    @Override
    public TopicModel getTopicModel(int id) {
        return null;
    }

}
