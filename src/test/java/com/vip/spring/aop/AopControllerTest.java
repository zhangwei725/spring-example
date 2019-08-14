package com.vip.spring.aop;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext1.xml"})
public class AopControllerTest {
    @Resource
    AopController controller;
    @Test
    public void login() throws Exception {
        int num = controller.login();
        System.out.println(num);

    }
}
