package com.jnxaread.service.impl;

import com.jnxaread.bean.ReplyExample;
import com.jnxaread.bean.Topic;
import com.jnxaread.bean.wrap.ReplyWrap;
import com.jnxaread.bean.wrap.TopicWrap;
import com.jnxaread.dao.ReplyMapper;
import com.jnxaread.dao.TopicMapper;
import com.jnxaread.dao.UserMapper;
import com.jnxaread.service.BaseForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-03 22:37
 */
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
    public TopicWrap getTopicWrap(int id) {
        TopicWrap topicWrap = topicMapper.findWithUsername(id);
        if (topicWrap == null) {
            return null;
        }
        topicMapper.updateViewCountByPrimaryKey(id);
        return topicWrap;
    }

    @Override
    public List<ReplyWrap> getReplyWrapList(int topicId, int page) {
        int startRow = (page - 1) * 50;
        List<ReplyWrap> replyWrapList = replyMapper.findWithUsername(topicId, startRow);
        //遍历回复列表，如果回复已被删除，则将内容替换为“该回复以被删除”
        for (ReplyWrap replyWrap : replyWrapList) {
            if (replyWrap.getDeleted()) {
                replyWrap.setContent("<p style='font-style:oblique'>该回复已被删除</p>");
            }
        }
        return replyWrapList;
    }

    @Override
    public long getReplyCountByTopicId(int topicId) {
        ReplyExample example = new ReplyExample();
        ReplyExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        long replyCount = replyMapper.countByExample(example);
        return replyCount;
    }

}
