package com.jnxaread.dao;

import com.jnxaread.bean.Topic;
import com.jnxaread.bean.TopicExample;
import com.jnxaread.bean.wrap.TopicWrap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TopicMapper {
    long countByExample(TopicExample example);

    int deleteByExample(TopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Topic record);

    int insertSelective(Topic record);

    List<Topic> selectByExampleWithBLOBs(TopicExample example);

    List<Topic> selectByExample(TopicExample example);

    Topic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByExampleWithBLOBs(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByPrimaryKeySelective(Topic record);

    int updateByPrimaryKeyWithBLOBs(Topic record);

    int updateByPrimaryKey(Topic record);

    /**********************************************************************************/

    List<TopicWrap> findListWithUsername(@Param("userId") int userId, @Param("level") int level, @Param("startRow") int startRow);

    TopicWrap findWithUsername(int id);

    Topic selectByPrimaryKeyForUpdate(int id);

    int updateViewCountByPrimaryKey(int id);

    int updateReplyCountByPrimaryKey(int id);
}
