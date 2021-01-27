package com.jnxaread.service.impl;

import com.jnxaread.bean.User;
import com.jnxaread.bean.UserExample;
import com.jnxaread.dao.wrap.UserMapperWrap;
import com.jnxaread.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-02 17:04
 */
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired(required = false)
    private UserMapperWrap userMapper;

    /**
     * 添加用户
     *
     * @param newUser 新增用户
     * @return 新增用户对象
     */
    @Override
    public User addUser(User newUser) {
        userMapper.insertSelective(newUser);
        return getUser(newUser.getId());
    }

    /**
     * 根据ID获取用户
     *
     * @param id 用户ID
     * @return 用户对象
     */
    @Override
    public User getUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据账号获取用户
     *
     * @param account 用户账号
     * @return 用户对象
     */
    @Override
    public User getUserByAccount(String account) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(account);
        List<User> userList = userMapper.selectByExample(example);
        if (userList.isEmpty()) {
            return null;
        }
        return userList.get(0);
    }

    /**
     * 根据用户名获取用户
     *
     * @param username 用户名
     * @return 用户对象
     */
    @Override
    public User getUserByUsername(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> listUser = userMapper.selectByExample(example);
        if (listUser.isEmpty()) {
            return null;
        }
        return listUser.get(0);
    }

    /**
     * 根据邮箱获取用户
     *
     * @param email 用户邮箱
     * @return 用户对象
     */
    @Override
    public User getUserByEmail(String email) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        List<User> userList = userMapper.selectByExample(example);
        if (userList.isEmpty()) {
            return null;
        }
        return userList.get(0);
    }

    @Override
    public void updateUser(User updatedUser) {
        userMapper.updateByPrimaryKeySelective(updatedUser);
    }
}
