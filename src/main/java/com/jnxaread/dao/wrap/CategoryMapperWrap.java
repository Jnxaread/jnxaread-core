package com.jnxaread.dao.wrap;

import com.jnxaread.dao.CategoryMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 未央
 * @create 2020-07-11 17:35
 */
@Mapper
public interface CategoryMapperWrap extends CategoryMapper {
    void updateFictionCountByPrimaryKey(int id);

    void updateChapterCountByPrimaryKey(int id);

    void updateCommentCountByPrimaryKey(int id);
}
