package com.jnxaread.service;

import com.jnxaread.bean.Chapter;
import com.jnxaread.bean.Comment;
import com.jnxaread.bean.Fiction;
import com.jnxaread.bean.Label;
import com.jnxaread.bean.wrap.ChapterWrap;
import com.jnxaread.bean.wrap.CommentWrap;
import com.jnxaread.bean.wrap.FictionWrap;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-06 15:08
 */
public interface BaseLibraryService {

    int addFiction(Fiction newFiction);

    void addLabel(Label label);

    int addChapter(Chapter newChapter);

    int addComment(Comment newComment);

    FictionWrap getFictionWrap(int id);

    ChapterWrap getChapterWrap(int id);

    List<Label> getLabelByFictionId(int fictionId);

    Chapter getChapterByNumber(int fictionId,int number);

    List<CommentWrap> getCommentWrapList(int chapterId);

    List<FictionWrap> getFictionWrapList(int page);

    long getFictionCount();

}
