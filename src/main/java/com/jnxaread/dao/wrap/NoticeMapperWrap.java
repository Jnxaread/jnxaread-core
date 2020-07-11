package com.jnxaread.dao.wrap;

import com.jnxaread.bean.wrap.NoticeWrap;
import com.jnxaread.dao.NoticeMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 未央
 * @create 2020-07-11 17:29
 */
@Mapper
public interface NoticeMapperWrap extends NoticeMapper {
    List<NoticeWrap> findListWithUsername();

    NoticeWrap findWithUsername(int id);

    int updateViewCountByPrimaryKey(int id);
}
