package com.vip.spring.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 第一步  写一个动态代理 实现 InvocationHandler接口
 */
public class DanamicProxyDemo implements InvocationHandler {
    // 第二歩  声明被代理的对象
    Object  target;
    // 第三步   创建代理对象
    public  Object newInstance(Object target){
        //  初始化被代理对象
        this.target = target;
        /**
         * 第一个参数  通过被代理对象的getClass方法getClassLoader
         * 第二个参数 获取被代理对象的接口
         *  第三个参数  InvocationHandler的实现类
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this );
    }

    // 通过反射获取方法  (公开  所有的)
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 执行的核心方法
        Object obj = null;
        try {
            System.out.println("前置通知");
             obj = method.invoke(target, args);
            System.out.println("后置通知");
        }catch (Exception e){
            System.out.println("异常通知");
        }
        return obj;
    }

}
