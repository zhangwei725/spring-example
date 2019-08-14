package com.vip.spring.proxy.service;

public class UserServiceImplProxy implements UserService {
    // 在代理类持有被代理的引用
    private UserService userService;

    public UserServiceImplProxy(UserService userService) {
        this.userService = userService;
    }

    public void  start(){
        System.out.println("开启事物");
    }


    @Override
    public void save() {
        start();
        //调用被代理类的核心方法
        userService.save();
        commit();
    }


    public void  commit(){
        System.out.println("提交事物");
    }

}
