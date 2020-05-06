package com.jnxaread.service.impl;

import com.jnxaread.bean.Fiction;
import com.jnxaread.dao.ChapterMapper;
import com.jnxaread.dao.CommentMapper;
import com.jnxaread.dao.FictionMapper;
import com.jnxaread.service.BaseLibraryService;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Override
    public int addFiction(Fiction newFiction) {
        fictionMapper.insertSelective(newFiction);
        return newFiction.getId();
    }
}
