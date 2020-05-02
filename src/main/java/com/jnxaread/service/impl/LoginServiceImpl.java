package com.jnxaread.service.impl;

import com.jnxaread.bean.Login;
import com.jnxaread.dao.LoginMapper;
import com.jnxaread.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 未央
 * @create 2020-05-02 18:21
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired(required = false)
    private LoginMapper loginMapper;

    @Override
    public void addLogin(Login newLogin) {
        loginMapper.insertSelective(newLogin);
    }
}
