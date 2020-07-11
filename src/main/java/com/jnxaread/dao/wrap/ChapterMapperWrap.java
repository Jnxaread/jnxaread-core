package com.jnxaread.dao.wrap;

import com.jnxaread.bean.Chapter;
import com.jnxaread.bean.wrap.ChapterWrap;
import com.jnxaread.dao.ChapterMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 未央
 * @create 2020-07-11 17:34
 */
@Mapper
public interface ChapterMapperWrap extends ChapterMapper {
    ChapterWrap findWithUsername(int id);

    int selectMaxNumberByFictionId(int fictionId);

    Chapter selectByPrimaryKeyForUpdate(int id);
}
