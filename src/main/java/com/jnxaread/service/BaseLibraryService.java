package com.jnxaread.service;

import com.jnxaread.bean.*;
import com.jnxaread.bean.wrap.ChapterWrap;
import com.jnxaread.bean.wrap.CommentWrap;
import com.jnxaread.bean.wrap.FictionWrap;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-06 15:08
 */
public interface BaseLibraryService {

    /**
     * 添加作品
     *
     * @param newFiction
     * @return
     */
    int addFiction(Fiction newFiction);

    /**
     * 添加作品标签
     *
     * @param label
     */
    void addLabel(Label label);

    /**
     * 添加章节
     *
     * @param newChapter
     * @return
     */
    int addChapter(Chapter newChapter);

    /**
     * 添加评论
     *
     * @param newComment
     * @return
     */
    int addComment(Comment newComment);

    Fiction getFiction(int id);

    FictionWrap getFictionWrap(int id);

    Chapter getChapter(int id);

    ChapterWrap getChapterWrap(int id);

    List<Label> getLabelByFictionId(int fictionId);

    Chapter getChapterByNumber(int fictionId, int number);

    ChapterWrap getChapterWrapByNumber(int fictionId, int number);

    List<CommentWrap> getCommentWrapList(int chapterId);

    List<CommentWrap> getCommentWrapListByUserId(int userId, int level);

    List<Chapter> getChapterList(int fictionId, int userId, int level);

    List<FictionWrap> getFictionWrapList(int userId, int level, int page, int pageSize);

    List<FictionWrap> getOwnFictionWrapList(int userId, int page);

    List<Category> getCategoryList();

    long getFictionCountByUserId(int userId);

    long getOwnFictionCount(int userId);

    void updateChapter(Chapter updatedChapter);

    int hideChapter(int id, int userId, boolean hide);

    int deleteChapter(int id, int userId);

}
