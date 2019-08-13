package com.vip.spring.service.impl;

import com.vip.spring.dao.UserDao;
import com.vip.spring.service.UserService;

//  在开发中 autoWired
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    // 线程安全
    @Resource(name = "userDao")
    private UserDao userDao;

    @Autowired
    private UserDao userDao1;

    @Override
    public void register() {
        userDao.save();
    }
}
