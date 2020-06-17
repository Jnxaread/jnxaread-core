package com.jnxaread.service.impl;

import com.jnxaread.bean.*;
import com.jnxaread.bean.wrap.ChapterWrap;
import com.jnxaread.bean.wrap.CommentWrap;
import com.jnxaread.bean.wrap.FictionWrap;
import com.jnxaread.dao.*;
import com.jnxaread.entity.UserGrade;
import com.jnxaread.service.BaseLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 未央
 * @create 2020-05-06 15:09
 */
public class BaseLibraryServiceImpl implements BaseLibraryService {

    @Autowired(required = false)
    private FictionMapper fictionMapper;

    @Autowired(required = false)
    private ChapterMapper chapterMapper;

    @Autowired(required = false)
    private CommentMapper commentMapper;

    @Autowired(required = false)
    private LabelMapper labelMapper;

    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired
    private UserGrade userGrade;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addFiction(Fiction newFiction) {
        fictionMapper.insertSelective(newFiction);
        Chapter chapter = new Chapter();
        chapter.setFictionId(newFiction.getId());
        chapter.setUserId(newFiction.getUserId());
        chapter.setCreateTime(new Date());
        chapter.setNumber(0);
        chapter.setTitle("");
        chapter.setWordCount(0);
        chapter.setCommentCount(0);
        chapter.setViewCount(0);
        chapter.setContent("");
        chapter.setDeleted(true);
        chapterMapper.insertSelective(chapter);
        userMapper.updateFictionCountByPrimaryKey(newFiction.getUserId());
        userMapper.updateGradeByPrimaryKey(newFiction.getUserId(), userGrade.getNewFiction());
        return newFiction.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addLabel(Label label) {
        labelMapper.insertSelective(label);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addChapter(Chapter newChapter) {
        Chapter chapter = getChapterByNumber(newChapter.getFictionId(), newChapter.getNumber());
        if (chapter != null) return -1;
        Chapter chapter1 = getChapterByNumber(newChapter.getFictionId(), newChapter.getNumber() - 1);
        if (chapter1 == null) return -2;
        chapterMapper.insertSelective(newChapter);
        userMapper.updateChapterCountByPrimaryKey(newChapter.getUserId());
        userMapper.updateGradeByPrimaryKey(newChapter.getUserId(), userGrade.getNewChapter());
        return newChapter.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addComment(Comment newComment) {
        Fiction fiction = fictionMapper.selectByPrimaryKey(newComment.getFictionId());
        Chapter chapter = chapterMapper.selectByPrimaryKey(newComment.getChapterId());
        if (fiction.getDeleted() || (chapter.getDeleted() && chapter.getNumber() != 0)) return 1;
        commentMapper.insertSelective(newComment);
        userMapper.updateCommentCountByPrimaryKey(newComment.getUserId());
        userMapper.updateGradeByPrimaryKey(newComment.getUserId(), userGrade.getNewComment());
        return 0;
    }

    @Override
    public Fiction getFiction(int id) {
        Fiction fiction = fictionMapper.selectByPrimaryKey(id);
        return fiction;
    }

    @Override
    public FictionWrap getFictionWrap(int id) {
        FictionWrap fictionWrap = fictionMapper.findWithUsername(id);
        List<Label> labelList = getLabelByFictionId(id);
        ArrayList<String> tagArrayList = new ArrayList<>();
        labelList.forEach(label -> tagArrayList.add(label.getLabel()));
        String[] tagsTemp = new String[tagArrayList.size()];
        String[] tags = tagArrayList.toArray(tagsTemp);
        fictionWrap.setTags(tags);
        fictionMapper.updateViewCountByPrimaryKey(id);
        return fictionWrap;
    }

    @Override
    public Chapter getChapter(int id) {
        Chapter chapter = chapterMapper.selectByPrimaryKey(id);
        return chapter;
    }

    @Override
    public ChapterWrap getChapterWrap(int id) {
        ChapterWrap chapterWrap = chapterMapper.findWithUsername(id);
        return chapterWrap;
    }

    @Override
    public List<Label> getLabelByFictionId(int fictionId) {
        LabelExample example = new LabelExample();
        LabelExample.Criteria criteria = example.createCriteria();
        criteria.andFictionIdEqualTo(fictionId);
        List<Label> labelList = labelMapper.selectByExample(example);
        return labelList;
    }

    @Override
    public Chapter getChapterByNumber(int fictionId, int number) {
        ChapterExample example = new ChapterExample();
        ChapterExample.Criteria criteria = example.createCriteria();
        criteria.andFictionIdEqualTo(fictionId);
        criteria.andNumberEqualTo(number);
        if (number != 0) {
            criteria.andDeletedEqualTo(false);
        }
        List<Chapter> chapterList = chapterMapper.selectByExample(example);
        if (chapterList.size() > 0) {
            return chapterList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<CommentWrap> getCommentWrapList(int chapterId) {
        List<CommentWrap> commentWrapList = commentMapper.findListWidthUsername(chapterId);
        return commentWrapList;
    }

    @Override
    public List<CommentWrap> getCommentWrapListByUserId(int userId,int level) {
        List<CommentWrap> commentWrapList = commentMapper.findListByUserId(userId,level);
        return commentWrapList;
    }

    @Override
    public List<Chapter> getChapterList(int fictionId, int level) {
        ChapterExample example = new ChapterExample();
        ChapterExample.Criteria criteria = example.createCriteria();
        criteria.andFictionIdEqualTo(fictionId);
        criteria.andRestrictedLessThanOrEqualTo(level);
        criteria.andHidedEqualTo(false);
        criteria.andDeletedEqualTo(false);
        return chapterMapper.selectByExample(example);
    }

    @Override
    public List<FictionWrap> getFictionWrapList(int userId, int level, int page) {
        int startRow = (page - 1) * 30;
        List<FictionWrap> fictionWrapList = fictionMapper.findListWithUsername(userId, level, startRow);
        //遍历fictionWrapList，给每一个fictionWrap设置tags
        fictionWrapList.forEach(fictionWrap -> {
            List<Label> labelList = getLabelByFictionId(fictionWrap.getId());
            List<String> tagList = new ArrayList<>();
            labelList.forEach(label -> tagList.add(label.getLabel()));
            String[] tags = tagList.toArray(new String[labelList.size()]);
            fictionWrap.setTags(tags);
        });
        return fictionWrapList;
    }

    @Override
    public List<FictionWrap> getOwnFictionWrapList(int userId, int page) {
        int startRow = (page - 1) * 30;
        List<FictionWrap> fictionWrapList = fictionMapper.findOwnListWithUsername(userId, startRow);
        //遍历fictionWrapList，给每一个fictionWrap设置tags
        fictionWrapList.forEach(fictionWrap -> {
            List<Label> labelList = getLabelByFictionId(fictionWrap.getId());
            List<String> tagList = new ArrayList<>();
            labelList.forEach(label -> tagList.add(label.getLabel()));
            String[] tags = tagList.toArray(new String[labelList.size()]);
            fictionWrap.setTags(tags);
        });
        return fictionWrapList;
    }

    @Override
    public long getFictionCountByUserId(int userId) {
        FictionExample example = new FictionExample();
        FictionExample.Criteria criteria = example.createCriteria();
        if (userId != 0) {
            criteria.andUserIdEqualTo(userId);
        }
        criteria.andHidedEqualTo(false);
        criteria.andDeletedEqualTo(false);
        long fictionCount = fictionMapper.countByExample(example);
        return fictionCount;
    }

    @Override
    public long getOwnFictionCount(int userId) {
        FictionExample example = new FictionExample();
        FictionExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andDeletedEqualTo(false);
        long fictionCount = fictionMapper.countByExample(example);
        return fictionCount;
    }

}
