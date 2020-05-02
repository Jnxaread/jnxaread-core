package com.jnxaread.service;

import com.jnxaread.bean.User;

/**
 * @author 未央
 * @create 2020-05-02 17:01
 */
public interface UserService {

    User getUser(int id);

    User getUserByAccount(String account);

    User getUserByUsername(String username);

    User getUserByEmail(String email);

}