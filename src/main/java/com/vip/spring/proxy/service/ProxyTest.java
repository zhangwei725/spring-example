package com.vip.spring.proxy.service;

/**
 *  反射
 * 动态代理   jdk  动态代理     代理接口
 *           cglib             代理
 *
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImplProxy(new UserServiceImpl());
        userService.save();
    }

}
