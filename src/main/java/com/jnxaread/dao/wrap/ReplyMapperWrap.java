package com.jnxaread.dao.wrap;

import com.jnxaread.bean.wrap.ReplyWrap;
import com.jnxaread.dao.ReplyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 未央
 * @create 2020-07-11 17:25
 */
@Mapper
public interface ReplyMapperWrap extends ReplyMapper {
    List<ReplyWrap> findListWithUsername(@Param("topicId") int topicId, @Param("startRow") int startRow);

    List<ReplyWrap> findListByUserId(@Param("userId") int userId, @Param("level") int level);

    ReplyWrap findWithUsername(int id);
}
