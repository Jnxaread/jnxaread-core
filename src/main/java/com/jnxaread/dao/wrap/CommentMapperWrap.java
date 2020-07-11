package com.jnxaread.dao.wrap;

import com.jnxaread.bean.wrap.CommentWrap;
import com.jnxaread.dao.CommentMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 未央
 * @create 2020-07-11 17:33
 */
@Mapper
public interface CommentMapperWrap extends CommentMapper {
    List<CommentWrap> findListWidthUsername(int chapterId);

    List<CommentWrap> findListByUserId(@Param("userId") int userId, @Param("level") int level);
}
