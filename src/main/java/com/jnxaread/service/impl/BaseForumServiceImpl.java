package com.jnxaread.service.impl;

import com.jnxaread.bean.Reply;
import com.jnxaread.bean.ReplyExample;
import com.jnxaread.bean.Topic;
import com.jnxaread.bean.TopicExample;
import com.jnxaread.bean.wrap.ReplyWrap;
import com.jnxaread.bean.wrap.TopicWrap;
import com.jnxaread.dao.ReplyMapper;
import com.jnxaread.dao.TopicMapper;
import com.jnxaread.dao.UserMapper;
import com.jnxaread.service.BaseForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

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
    @Transactional(rollbackFor = Exception.class)
    public int addTopic(Topic newTopic) {
        topicMapper.insertSelective(newTopic);
        //帖子作者的发帖量+1
        userMapper.updateTopicCountByPrimaryKey(newTopic.getUserId());
        return newTopic.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addReply(Reply newReply) {
        Topic topic = topicMapper.selectByPrimaryKeyForUpdate(newReply.getTopicId());
        //如果帖子不存在或已被删除，则禁止回复
        if (topic == null || topic.getDeleted()) return 1;
        //如果帖子被锁定，则禁止回复
        if (topic.getLocked()) return 2;
        //如果引用的回复不存在，则禁止回复
        if (newReply.getQuote() != 0) {
            Reply quoteReply = getReplyByTopicIdAndFloor(newReply.getTopicId(), newReply.getQuote());
            if (quoteReply == null) return 3;
        }

        int replyCount = topic.getReplyCount();
        newReply.setFloor(replyCount + 1);
        replyMapper.insertSelective(newReply);

        //帖子的回复数量+1
//        topicMapper.updateReplyCountByPrimaryKey(topic.getId());
        topic.setReplyCount(topic.getReplyCount()+1);
        topicMapper.updateByPrimaryKeySelective(topic);
        //作者的回复数量+1
        userMapper.updateReplyCountByPrimaryKey(newReply.getUserId());
        return 0;
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
        List<ReplyWrap> replyWrapList = replyMapper.findListWithUsername(topicId, startRow);
        //遍历回复列表，如果回复已被删除，则将内容替换为“该回复以被删除”
        for (ReplyWrap replyWrap : replyWrapList) {
            if (replyWrap.getQuote() != 0) {
                ReplyWrap quotedReply = replyMapper.findWithUsername(replyWrap.getQuote());
                if (quotedReply.getDeleted()) {
                    quotedReply.setContent("<p style='font-style:oblique'>该回复已被删除</p>");
                }
                replyWrap.setQuotedReply(quotedReply);
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

    @Override
    public List<TopicWrap> getTopicWrapList(int page) {
        int startRow = (page - 1) * 45;
        List<TopicWrap> topicWrapList = topicMapper.findListWithUsername(startRow);
        return topicWrapList;
    }

    @Override
    public List<ReplyWrap> getReplyWrapListByUserId(int userId) {
        List<ReplyWrap> replyWrapList = replyMapper.findListByUserId(userId);
        //遍历回复列表，如果回复已被删除，则将内容替换为“该回复以被删除”
        for (ReplyWrap replyWrap : replyWrapList) {
            if (replyWrap.getQuote() != 0) {
                ReplyWrap quotedReply = replyMapper.findWithUsername(replyWrap.getQuote());
                if (quotedReply.getDeleted()) {
                    quotedReply.setContent("<p style='font-style:oblique'>该回复已被删除</p>");
                }
                replyWrap.setQuotedReply(quotedReply);
            }
        }
        return replyWrapList;
    }

    @Override
    public long getTopicCount() {
        TopicExample example = new TopicExample();
        long topicCount = topicMapper.countByExample(example);
        return topicCount;
    }

    public Reply getReplyByTopicIdAndFloor(int topicId, int floor) {
        ReplyExample example = new ReplyExample();
        ReplyExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andFloorEqualTo(floor);
        List<Reply> replyList = replyMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(replyList)) {
            return null;
        }
        return replyList.get(0);
    }

}
