package com.jnxaread.service;

import com.jnxaread.bean.Login;
import com.jnxaread.bean.User;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-02 17:01
 */
public interface BaseUserService {

    User addUser(User newUser);

    User getUser(int id);

    List<User> getUserList();

    User getUserByAccount(String account);

    User getUserByUsername(String username);

    User getUserByEmail(String email);

    void updateUser(User updatedUser);

    void addLogin(Login newLogin);

}
