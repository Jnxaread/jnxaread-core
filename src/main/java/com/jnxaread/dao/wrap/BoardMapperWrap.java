package com.jnxaread.dao.wrap;

import com.jnxaread.dao.BoardMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 未央
 * @create 2020-07-11 17:36
 */
@Mapper
public interface BoardMapperWrap extends BoardMapper {
    void updateNoticeCountByPrimaryKey(int id);

    void updateTopicCountByPrimaryKey(int id);

    void updateReplyCountByPrimaryKey(int id);
}
