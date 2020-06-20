package com.jnxaread.dao;

import com.jnxaread.bean.User;
import com.jnxaread.bean.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /******************************************************************************************************************/

    int updateLoginCountByPrimaryKey(int id);

    int updateTopicCountByPrimaryKey(int id);

    int updateReplyCountByPrimaryKey(int id);

    int updateFictionCountByPrimaryKey(int id);

    int updateChapterCountByPrimaryKey(int id);

    int updateCommentCountByPrimaryKey(int id);

    int updateLevelByPrimaryKey(@Param("id") int id,@Param("level") int level);

    int updateGradeByPrimaryKey(@Param("id") int id,@Param("increase") int increase);

    User selectByPrimaryKeyForUpdate(int id);
}
