package com.jnxaread.service.impl;

import com.jnxaread.bean.*;
import com.jnxaread.bean.wrap.ChapterWrap;
import com.jnxaread.bean.wrap.CommentWrap;
import com.jnxaread.bean.wrap.FictionWrap;
import com.jnxaread.dao.wrap.*;
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
    private FictionMapperWrap fictionMapper;

    @Autowired(required = false)
    private ChapterMapperWrap chapterMapper;

    @Autowired(required = false)
    private CommentMapperWrap commentMapper;

    @Autowired(required = false)
    private LabelMapperWrap labelMapper;

    @Autowired(required = false)
    private CategoryMapperWrap categoryMapper;

    @Autowired(required = false)
    private UserMapperWrap userMapper;

    @Autowired
    private UserGrade userGrade;

    /**
     * 新增作品
     *
     * @param newFiction 新增作品数据
     * @return 新增作品id
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addFiction(Fiction newFiction) {
        fictionMapper.insertSelective(newFiction);
        Chapter chapter = new Chapter();
        chapter.setFictionId(newFiction.getId());
        chapter.setUserId(newFiction.getUserId());
        chapter.setCreateTime(new Date());
        chapter.setNumber(-1);
        chapter.setTitle("");
        chapter.setWordCount(0);
        chapter.setCommentCount(0);
        chapter.setViewCount(0);
        chapter.setContent("");
        chapter.setDeleted(true);
        chapterMapper.insertSelective(chapter);
        userMapper.updateFictionCountByPrimaryKey(newFiction.getUserId());
        userMapper.updateGradeByPrimaryKey(newFiction.getUserId(), userGrade.getNewFiction());
        categoryMapper.updateFictionCountByPrimaryKey(newFiction.getCategoryId());
        return newFiction.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addLabel(Label label) {
        labelMapper.insertSelective(label);
    }

    /**
     * 新增章节
     *
     * @param newChapter 新增章节数据
     * @return 执行结果，【id>=0：成功，且返回章节id；id=-1:章节已存在；id=-2：章节号错误】
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addChapter(Chapter newChapter) {
        Fiction fiction = fictionMapper.selectByPrimaryKey(newChapter.getFictionId());
        //如果作品的作者与章节作者不一致，则返回-1
        if (!fiction.getUserId().equals(newChapter.getUserId())) {
            return -1;
        }
        //根据作品id和章节号查找章节，如果章节存在，则返回-2
        Chapter chapter = getChapterByNumber(newChapter.getFictionId(), newChapter.getNumber());
        if (chapter != null) return -2;
        //如果新章节不是第一章
        if (newChapter.getNumber() != 1) {
            //查找该章节的上一章是否存在，如果不存在，则返回-3
            Chapter chapter1 = getChapterByNumber(newChapter.getFictionId(), newChapter.getNumber() - 1);
            if (chapter1 == null) return -3;
        }
        chapterMapper.insertSelective(newChapter);
        //章节所属作品的章节数+1，字数+若干
        fictionMapper.updateChapterCountAndWordCountByPrimaryKey(newChapter.getFictionId(), newChapter.getWordCount());
        //作者的章节数+1
        userMapper.updateChapterCountByPrimaryKey(newChapter.getUserId());
        //作者的积分+若干
        userMapper.updateGradeByPrimaryKey(newChapter.getUserId(), userGrade.getNewChapter());
        categoryMapper.updateChapterCountByPrimaryKey(fiction.getCategoryId());
        return newChapter.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addComment(Comment newComment) {
        Fiction fiction = fictionMapper.selectByPrimaryKey(newComment.getFictionId());
        Chapter chapter = chapterMapper.selectByPrimaryKey(newComment.getChapterId());
        if (fiction.getDeleted() || (chapter.getDeleted() && chapter.getNumber() != -1)) return 1;
        commentMapper.insertSelective(newComment);
        chapter.setCommentCount(chapter.getCommentCount() + 1);
        chapterMapper.updateByPrimaryKeySelective(chapter);
        fictionMapper.updateCommentCountByPrimaryKey(newComment.getFictionId());
        userMapper.updateCommentCountByPrimaryKey(newComment.getUserId());
        userMapper.updateGradeByPrimaryKey(newComment.getUserId(), userGrade.getNewComment());
        categoryMapper.updateCommentCountByPrimaryKey(fiction.getCategoryId());
        return 0;
    }

    @Override
    public Fiction getFiction(int id) {
        return fictionMapper.selectByPrimaryKey(id);
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
        return chapterMapper.selectByPrimaryKey(id);
    }

    @Override
    public ChapterWrap getChapterWrap(int id) {
        ChapterWrap chapterWrap = chapterMapper.findWithUsername(id);
        chapterMapper.updateViewCountByPrimaryKey(id);
        return chapterWrap;
    }

    @Override
    public List<Label> getLabelByFictionId(int fictionId) {
        LabelExample example = new LabelExample();
        LabelExample.Criteria criteria = example.createCriteria();
        criteria.andFictionIdEqualTo(fictionId);
        return labelMapper.selectByExample(example);
    }

    /**
     * 根据章节号查询章节
     *
     * @param fictionId 作品id
     * @param number    章节号
     * @return 章节数据
     */
    @Override
    public Chapter getChapterByNumber(int fictionId, int number) {
        ChapterExample example = new ChapterExample();
        ChapterExample.Criteria criteria = example.createCriteria();
        criteria.andFictionIdEqualTo(fictionId);
        criteria.andNumberEqualTo(number);
        if (number != -1) {
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
    public ChapterWrap getChapterWrapByNumber(int fictionId, int number) {
        if (fictionId == 0 || number < 0) return null;
        return chapterMapper.findWithUsernameByNumber(fictionId, number);
    }

    @Override
    public List<CommentWrap> getCommentWrapList(int chapterId) {
        return commentMapper.findListWidthUsername(chapterId);
    }

    @Override
    public List<CommentWrap> getCommentWrapListByUserId(int userId, int level) {
        return commentMapper.findListByUserId(userId, level);
    }

    @Override
    public List<Chapter> getChapterList(int fictionId, int userId, int level) {
        Fiction fiction = fictionMapper.selectByPrimaryKey(fictionId);
        ChapterExample example = new ChapterExample();
        ChapterExample.Criteria criteria = example.createCriteria();
        criteria.andFictionIdEqualTo(fictionId);
        // 如果用户ID与作品的作者ID不相同，则无法查看超过用户限制性等级或被隐藏的内容
        if (userId == 0 || !fiction.getUserId().equals(userId)) {
            criteria.andRestrictedLessThanOrEqualTo(level);
            criteria.andVisibleEqualTo(1);
        }
        criteria.andDeletedEqualTo(false);
        return chapterMapper.selectByExample(example);
    }

    @Override
    public List<FictionWrap> getFictionWrapList(int userId, int level, int page, int pageSize) {
        int startRow = (page - 1) * pageSize;
        List<FictionWrap> fictionWrapList = fictionMapper.findListWithUsername(userId, level, startRow, pageSize);
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
    public List<Category> getCategoryList() {
        CategoryExample example = new CategoryExample();
        return categoryMapper.selectByExample(example);
    }

    @Override
    public long getFictionCountByUserId(int userId) {
        FictionExample example = new FictionExample();
        FictionExample.Criteria criteria = example.createCriteria();
        if (userId != 0) {
            criteria.andUserIdEqualTo(userId);
        }
        criteria.andVisibleEqualTo(1);
        criteria.andDeletedEqualTo(false);
        return fictionMapper.countByExample(example);
    }

    @Override
    public long getOwnFictionCount(int userId) {
        FictionExample example = new FictionExample();
        FictionExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andDeletedEqualTo(false);
        return fictionMapper.countByExample(example);
    }

    @Override
    public void updateChapter(Chapter updatedChapter) {
        chapterMapper.updateByPrimaryKeySelective(updatedChapter);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int hideChapter(int id, int userId, boolean hide) {
        int visible;
        if (hide) {
            visible = 0;
        } else {
            visible = 1;
        }
        Chapter chapter = chapterMapper.selectByPrimaryKeyForUpdate(id);
        if (chapter == null) return 1;
        if (!chapter.getUserId().equals(userId)) return 2;
        if (chapter.getVisible() == visible) return 3;
        chapter.setVisible(visible);
        chapterMapper.updateByPrimaryKeySelective(chapter);
        return 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteChapter(int id, int userId) {
        Chapter chapter = chapterMapper.selectByPrimaryKeyForUpdate(id);
        if (chapter == null) return 1;
        if (!chapter.getUserId().equals(userId)) return 2;
        chapter.setDeleted(true);
        chapterMapper.updateByPrimaryKeySelective(chapter);
        return 0;
    }

}
