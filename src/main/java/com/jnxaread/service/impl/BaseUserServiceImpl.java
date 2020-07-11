package com.jnxaread.service.impl;

import com.jnxaread.bean.Login;
import com.jnxaread.bean.User;
import com.jnxaread.bean.UserExample;
import com.jnxaread.dao.LoginMapper;
import com.jnxaread.dao.wrap.UserMapperWrap;
import com.jnxaread.entity.UserGrade;
import com.jnxaread.entity.UserLevel;
import com.jnxaread.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-02 17:04
 */
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired(required = false)
    private UserMapperWrap userMapper;

    @Autowired(required = false)
    private LoginMapper loginMapper;

    @Autowired
    private UserGrade userGrade;

    @Autowired
    private UserLevel userLevel;

    /**
     * 添加用户
     *
     * @param newUser
     * @return
     */
    @Override
    public User addUser(User newUser) {
        userMapper.insertSelective(newUser);
        return getUser(newUser.getId());
    }

    /**
     * 根据ID获取用户
     *
     * @param id
     * @return
     */
    @Override
    public User getUser(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    /**
     * 根据账号获取用户
     *
     * @param account
     * @return
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
        User user = userList.get(0);
        return user;
    }

    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
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
        User user = listUser.get(0);
        return user;
    }

    /**
     * 根据邮箱获取用户
     *
     * @param email
     * @return
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
        User user = userList.get(0);
        return user;
    }

    @Override
    public void updateUser(User updatedUser) {
        userMapper.updateByPrimaryKeySelective(updatedUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addLogin(Login newLogin) {
        loginMapper.insertSelective(newLogin);
        /*userMapper.updateLoginCountByPrimaryKey(newLogin.getUserId());
        userMapper.updateGradeByPrimaryKey(newLogin.getUserId(),userGrade.getLogin());*/
        User user = userMapper.selectByPrimaryKeyForUpdate(newLogin.getUserId());
        user.setLoginCount(user.getLoginCount() + 1);
        user.setGrade(user.getGrade() + userGrade.getLogin());
        Integer[] gradeArr = userLevel.getGradeArr();
        for (int i = 0; i < gradeArr.length; i++) {
            if (gradeArr[i] > user.getGrade()) {
                user.setLevel(i - 1);
                break;
            }
        }
        userMapper.updateByPrimaryKeySelective(user);
    }
}
