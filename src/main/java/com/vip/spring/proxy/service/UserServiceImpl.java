package com.vip.spring.proxy.service;

import java.lang.management.BufferPoolMXBean;

//  被代理对象
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
