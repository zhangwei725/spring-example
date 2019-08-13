package com.vip.spring.entity;


import java.io.Serializable;
public class Address implements Serializable {
    private Integer aid;
    private String detail;

    public Address() {
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", detail='" + detail + '\'' +
                '}';
    }
}
