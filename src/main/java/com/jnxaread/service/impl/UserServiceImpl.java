package com.jnxaread.service.impl;

import com.jnxaread.bean.User;
import com.jnxaread.dao.UserMapper;
import com.jnxaread.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 未央
 * @create 2020-05-02 17:04
 */
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User getUser(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public User getUserByAccount(String account) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
