package com.jnxaread.service.impl;

import com.jnxaread.bean.*;
import com.jnxaread.bean.wrap.ReplyWrap;
import com.jnxaread.bean.wrap.TopicWrap;
import com.jnxaread.dao.wrap.BoardMapperWrap;
import com.jnxaread.dao.wrap.ReplyMapperWrap;
import com.jnxaread.dao.wrap.TopicMapperWrap;
import com.jnxaread.dao.wrap.UserMapperWrap;
import com.jnxaread.entity.UserGrade;
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
    private TopicMapperWrap topicMapper;

    @Autowired(required = false)
    private ReplyMapperWrap replyMapper;

    @Autowired(required = false)
    private UserMapperWrap userMapper;

    @Autowired(required = false)
    private BoardMapperWrap boardMapper;

    @Autowired
    private UserGrade userGrade;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addTopic(Topic newTopic) {
        topicMapper.insertSelective(newTopic);
        //帖子作者的发帖量+1
        userMapper.updateTopicCountByPrimaryKey(newTopic.getUserId());
        userMapper.updateGradeByPrimaryKey(newTopic.getUserId(), userGrade.getNewTopic());
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
        topic.setReplyCount(topic.getReplyCount() + 1);
        topicMapper.updateByPrimaryKeySelective(topic);
        //作者的回复数量+1
        userMapper.updateReplyCountByPrimaryKey(newReply.getUserId());
        userMapper.updateGradeByPrimaryKey(newReply.getUserId(), userGrade.getNewReply());
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
    public List<Board> getBoardList() {
        BoardExample example = new BoardExample();
        return boardMapper.selectByExample(example);
    }

    @Override
    public long getReplyCountByTopicId(int topicId) {
        ReplyExample example = new ReplyExample();
        ReplyExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        return replyMapper.countByExample(example);
    }

    @Override
    public List<TopicWrap> getTopicWrapList(int userId, int level, int page, int pageSize) {
        int startRow = (page - 1) * pageSize;
        return topicMapper.findListWithUsername(userId, level, startRow, pageSize);
    }

    @Override
    public List<ReplyWrap> getReplyWrapListByUserId(int userId, int level) {
        List<ReplyWrap> replyWrapList = replyMapper.findListByUserId(userId, level);
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
        return topicMapper.countByExample(example);
    }

    private Reply getReplyByTopicIdAndFloor(int topicId, int floor) {
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
