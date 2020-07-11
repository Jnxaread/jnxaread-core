package com.jnxaread.dao.wrap;

import com.jnxaread.bean.Topic;
import com.jnxaread.bean.wrap.TopicWrap;
import com.jnxaread.dao.TopicMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 未央
 * @create 2020-07-11 10:34
 */
@Mapper
public interface TopicMapperWrap extends TopicMapper {
    List<TopicWrap> findListWithUsername(@Param("userId") int userId, @Param("level") int level, @Param("startRow") int startRow, @Param("pageSize") int pageSize);

    TopicWrap findWithUsername(int id);

    Topic selectByPrimaryKeyForUpdate(int id);

    int updateViewCountByPrimaryKey(int id);

    int updateReplyCountByPrimaryKey(int id);
}
