package com.jnxaread.service.impl;

import com.jnxaread.bean.Authority;
import com.jnxaread.bean.AuthorityExample;
import com.jnxaread.dao.AuthorityMapper;
import com.jnxaread.service.BaseAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 权限Service实现类
 * @author 未央
 * @create 2020-04-20 9:20
 */
public class BaseAuthorityServiceImpl implements BaseAuthorityService {

    @Autowired(required = false)
    private AuthorityMapper authorityMapper;

    @Override
    public List<Authority> getAuthorityList() {
        AuthorityExample authorityExample = new AuthorityExample();
        List<Authority> authorityList = authorityMapper.selectByExample(authorityExample);
        return authorityList;
    }
}
