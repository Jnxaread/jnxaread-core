package com.jnxaread.service.impl;

import com.jnxaread.bean.Access;
import com.jnxaread.dao.AccessMapper;
import com.jnxaread.service.BaseAccessService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 访问统计Service实现类
 *
 * @author 未央
 * @create 2020-06-19 16:44
 */
public class BaseAccessServiceImpl implements BaseAccessService {

    @Autowired(required = false)
    private AccessMapper accessMapper;

    @Override
    public void addAccess(Access newAccess) {
        accessMapper.insertSelective(newAccess);
    }
}
