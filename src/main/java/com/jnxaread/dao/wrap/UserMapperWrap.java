package com.jnxaread.dao.wrap;

import com.jnxaread.bean.User;
import com.jnxaread.dao.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 未央
 * @create 2020-07-11 13:10
 */
@Mapper
public interface UserMapperWrap extends UserMapper {
    void updateLoginCountByPrimaryKey(int id);

    void updateTopicCountByPrimaryKey(int id);

    void updateReplyCountByPrimaryKey(int id);

    void updateFictionCountByPrimaryKey(int id);

    void updateChapterCountByPrimaryKey(int id);

    void updateCommentCountByPrimaryKey(int id);

    void updateLevelByPrimaryKey(@Param("id") int id, @Param("level") int level);

    void updateGradeByPrimaryKey(@Param("id") int id, @Param("increase") int increase);

    User selectByPrimaryKeyForUpdate(int id);
}
