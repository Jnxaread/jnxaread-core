package com.jnxaread.service.impl;

import com.jnxaread.bean.Authority;
import com.jnxaread.bean.AuthorityExample;
import com.jnxaread.dao.AuthorityMapper;
import com.jnxaread.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 权限Service
 * @author 未央
 * @create 2020-04-20 9:20
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired(required = false)
    private AuthorityMapper authorityMapper;

    @Override
    public List<Authority> getAuthorityList() {
        AuthorityExample authorityExample = new AuthorityExample();
        List<Authority> authorityList = authorityMapper.selectByExample(authorityExample);
        return authorityList;
    }
}
