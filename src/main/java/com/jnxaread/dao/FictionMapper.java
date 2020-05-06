package com.jnxaread.dao;

import com.jnxaread.bean.Fiction;
import com.jnxaread.bean.FictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}