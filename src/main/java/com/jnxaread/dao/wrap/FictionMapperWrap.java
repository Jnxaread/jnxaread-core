package com.jnxaread.dao.wrap;

import com.jnxaread.bean.wrap.FictionWrap;
import com.jnxaread.dao.FictionMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 未央
 * @create 2020-07-11 17:31
 */
@Mapper
public interface FictionMapperWrap extends FictionMapper {
    FictionWrap findWithUsername(int id);

    void updateCommentCountByPrimaryKey(int id);

    void updateViewCountByPrimaryKey(int id);

    void updateChapterCountAndWordCountByPrimaryKey(@Param("id") int id, @Param("wordCount") int wordCount);

    List<FictionWrap> findListWithUsername(@Param("userId") int userId, @Param("level") int level, @Param("startRow") int startRow, @Param("pageSize") int pageSize);

    List<FictionWrap> findOwnListWithUsername(@Param("userId") int userId, @Param("startRow") int startRow);
}
