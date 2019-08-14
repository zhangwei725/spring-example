package com.vip.spring;

import com.vip.spring.dao.UserDao;
import com.vip.spring.dao.impl.UserDaoImpl;
import com.vip.spring.entity.User;
import com.vip.spring.service.UserService;
import com.vip.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 *   传统ssm项目采用xml方式配置
 * 三种方式
 * 1. xml注册
 * 2. 基于注解
 * ApplicationContext
 *
 */
public class App {


    public static void main(String[] args) {
        //  初始化容器
        ClassPathXmlApplicationContext context =   new ClassPathXmlApplicationContext("applicationContext1.xml");
//                                       new FileSystemXmlApplicationContext();
                                         new AnnotationConfigApplicationContext();

        // 获取容器的对象
        // 参数 注册时声明的id
//        App app = (App)context.getBean("app");
//        System.out.println(app);
//        App app1 = context.getBean("app", App.class);
//        System.out.println(app1);
//        User user2 = context.getBean("user2", User.class);
//        User user1 = context.getBean("user", User.class);
//        System.out.println(user1);
//        System.out.println(user2);
//        context.close();
//        UserDaoImpl userDao = context.getBean("userDaoImpl",UserDaoImpl.class);
//        System.out.println(userDao);
//        Object userService = context.getBean("userService", UserServiceImpl.class);
//        System.out.println(userService);

        UserService userService = context.getBean("userService", UserService.class);
        userService.register();

    }
}
