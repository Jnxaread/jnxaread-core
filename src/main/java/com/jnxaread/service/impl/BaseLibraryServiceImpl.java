package com.jnxaread.service.impl;

import com.jnxaread.bean.*;
import com.jnxaread.bean.wrap.ChapterWrap;
import com.jnxaread.bean.wrap.CommentWrap;
import com.jnxaread.bean.wrap.FictionWrap;
import com.jnxaread.dao.ChapterMapper;
import com.jnxaread.dao.CommentMapper;
import com.jnxaread.dao.FictionMapper;
import com.jnxaread.dao.LabelMapper;
import com.jnxaread.service.BaseLibraryService;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Override
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
        return newFiction.getId();
    }

    @Override
    public void addLabel(Label label) {
        labelMapper.insertSelective(label);
    }

    @Override
    public int addChapter(Chapter newChapter) {
        chapterMapper.insertSelective(newChapter);
        return newChapter.getId();
    }

    @Override
    public int addComment(Comment newComment) {
        Fiction fiction = fictionMapper.selectByPrimaryKey(newComment.getFictionId());
        Chapter chapter = chapterMapper.selectByPrimaryKey(newComment.getChapterId());
        if (fiction.getDeleted() || (chapter.getDeleted() && chapter.getNumber() != 0)) {
            return 1;
        }
        commentMapper.insertSelective(newComment);
        return 0;
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
        return chapterList.get(0);
    }

    @Override
    public List<CommentWrap> getCommentWrapList(int chapterId) {
        List<CommentWrap> commentWrapList = commentMapper.findListWidthUsername(chapterId);
        return commentWrapList;
    }

    @Override
    public List<Chapter> getChapterList(int fictionId) {
        ChapterExample example = new ChapterExample();
        ChapterExample.Criteria criteria = example.createCriteria();
        criteria.andFictionIdEqualTo(fictionId);
        criteria.andHidedEqualTo(false);
        criteria.andDeletedEqualTo(false);
        return chapterMapper.selectByExample(example);
    }

    @Override
    public List<FictionWrap> getFictionWrapList(int userId, int page) {
        int startRow = (page - 1) * 30;
        List<FictionWrap> fictionWrapList = fictionMapper.findListWithUsername(userId, startRow);
        //遍历fictionWrapList，给每一个fictionWrap设置tags
        fictionWrapList.forEach(fictionWrap -> {
            List<Label> labelList = getLabelByFictionId(fictionWrap.getId());
            labelList.forEach(label -> {
                List<String> tagList = new ArrayList<>();
                tagList.add(label.getLabel());
                String[] tags = tagList.toArray(new String[labelList.size()]);
                fictionWrap.setTags(tags);
            });
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
            labelList.forEach(label -> {
                List<String> tagList = new ArrayList<>();
                tagList.add(label.getLabel());
                String[] tags = tagList.toArray(new String[labelList.size()]);
                fictionWrap.setTags(tags);
            });
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
