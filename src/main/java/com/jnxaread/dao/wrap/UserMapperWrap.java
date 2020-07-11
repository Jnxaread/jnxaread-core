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
    int updateLoginCountByPrimaryKey(int id);

    int updateTopicCountByPrimaryKey(int id);

    int updateReplyCountByPrimaryKey(int id);

    int updateFictionCountByPrimaryKey(int id);

    int updateChapterCountByPrimaryKey(int id);

    int updateCommentCountByPrimaryKey(int id);

    int updateLevelByPrimaryKey(@Param("id") int id, @Param("level") int level);

    int updateGradeByPrimaryKey(@Param("id") int id,@Param("increase") int increase);

    User selectByPrimaryKeyForUpdate(int id);
}
