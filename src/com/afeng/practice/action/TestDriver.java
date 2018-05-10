package com.afeng.practice.action;

import com.opensymphony.xwork2.ActionSupport;

/**
     * 测试属性驱动和模型驱动
     */
public class TestDriver extends ActionSupport {
    //属性驱动赋值法--1 通过创建私有成员变量并为变量提供set方法 对于属性的赋值会自动进行类型转换和寻找与属性name名一致的成员变量
    private String name ;
    private String password;
    private Integer age;
    public String DriverByVariable() throws Exception {
        System.out.println(name);
        System.out.println(password);
        System.out.println(age);
        return SUCCESS;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
