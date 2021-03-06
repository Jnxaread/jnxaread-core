package com.jnxaread.dao.wrap;

import com.jnxaread.bean.wrap.ProjectWrap;
import com.jnxaread.dao.ProjectMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 未央
 * @create 2020-07-11 17:28
 */
@Mapper
public interface ProjectMapperWrap extends ProjectMapper {

    List<ProjectWrap> findListWithUsername();

}
