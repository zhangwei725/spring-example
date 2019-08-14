package com.vip.spring.aop;

import org.springframework.stereotype.Controller;
// 控制层 Servelet

/**
 * @author zhangwei
 */
@Controller
public class AopController {

    public int login() throws Exception {
        System.out.println("2.这个是AopController的登录方法");
        return 1;
    }

}
