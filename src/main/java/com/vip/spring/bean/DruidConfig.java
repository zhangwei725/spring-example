package com.vip.spring.bean;

import com.vip.spring.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangwei
 */
@Configuration
public class DruidConfig {
    @Bean
    public User getUser(){
        return  new User();
    }
}
