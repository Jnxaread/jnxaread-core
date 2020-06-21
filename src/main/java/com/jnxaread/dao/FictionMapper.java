package com.jnxaread.dao;

import com.jnxaread.bean.Fiction;
import com.jnxaread.bean.FictionExample;
import com.jnxaread.bean.wrap.FictionWrap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FictionMapper {
    long countByExample(FictionExample example);

    int deleteByExample(FictionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fiction record);

    int insertSelective(Fiction record);

    List<Fiction> selectByExample(FictionExample example);

    Fiction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fiction record, @Param("example") FictionExample example);

    int updateByExample(@Param("record") Fiction record, @Param("example") FictionExample example);

    int updateByPrimaryKeySelective(Fiction record);

    int updateByPrimaryKey(Fiction record);

    /******************************************************************************************************************/

    FictionWrap findWithUsername(int id);

    void updateCommentCountByPrimaryKey(int id);

    void updateViewCountByPrimaryKey(int id);

    void updateChapterCountAndWordCountByPrimaryKey(@Param("id") int id, @Param("wordCount") int wordCount);

    List<FictionWrap> findListWithUsername(@Param("userId") int userId, @Param("level") int level, @Param("startRow") int startRow, @Param("pageSize") int pageSize);

    List<FictionWrap> findOwnListWithUsername(@Param("userId") int userId, @Param("startRow") int startRow);
}
