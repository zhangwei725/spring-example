package com.vip.spring.dao.impl;

import com.vip.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 使用注解的方式注册对象
 * @author zhangwei
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save方法");
    }
}
