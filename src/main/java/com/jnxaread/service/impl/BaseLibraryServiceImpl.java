package com.jnxaread.service.impl;

import com.jnxaread.bean.*;
import com.jnxaread.bean.wrap.CommentWrap;
import com.jnxaread.bean.wrap.FictionWrap;
import com.jnxaread.dao.ChapterMapper;
import com.jnxaread.dao.CommentMapper;
import com.jnxaread.dao.FictionMapper;
import com.jnxaread.dao.LabelMapper;
import com.jnxaread.service.BaseLibraryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
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
        return newFiction.getId();
    }

    @Override
    public void addLabel(Label label) {
        labelMapper.insertSelective(label);
    }

    @Override
    public int addComment(Comment newComment) {
        Chapter chapter = chapterMapper.selectByPrimaryKey(newComment.getChapterId());
        if (chapter.getDeleted() && newComment.getChapterId() != 0) {
            return 1;
        }
        commentMapper.insertSelective(newComment);
        return 0;
    }

    @Override
    public FictionWrap getFictionWrap(int id) {
        FictionWrap fictionWrap = fictionMapper.findWidthUsername(id);
        List<Label> labelList = getLabelByFictionId(id);
        ArrayList<String> tagArrayList = new ArrayList<>();
        labelList.forEach(label ->
                tagArrayList.add(label.getLabel())
        );
        String[] tagsTemp = new String[tagArrayList.size()];
        String[] tags = tagArrayList.toArray(tagsTemp);
        fictionWrap.setTags(tags);
        fictionMapper.updateViewCountByPrimaryKey(id);
        return fictionWrap;
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
    public List<CommentWrap> getCommentWrapList(int fictionId,int chapterId) {
        List<CommentWrap> commentWrapList=commentMapper.findListWidthUsername(fictionId,chapterId);
        return commentWrapList;
    }

}
