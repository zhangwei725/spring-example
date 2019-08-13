package com.vip.spring.entity;


import java.io.Serializable;

/**
 *  对依赖的对象进行赋值操作有两种常用方式
 *  1> 构造方法
 *  2> seter方法
 * shift + f6
 */
public class User implements Serializable {
    private Integer uid;
    private String name;
    private Address address;

    public User() {
    }

    public User(Address address) {
        this.address = address;
    }

    public User(Integer uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void init() {
        System.out.println("初始化完成");
    }

    public void close() {
        System.out.println("销毁!!!");
    }


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
