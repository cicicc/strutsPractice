package com.afeng.practice.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 测试action访问路径的通配符配置及访问具体方式
 */
public class ExtensiveChar extends ActionSupport {

    public String find() throws Exception {
        System.out.println("find");
        return SUCCESS;
    }
    public String add() throws Exception {
        System.out.println("add");
        return SUCCESS;
    }
    public String update() throws Exception {
        System.out.println("update");
        return SUCCESS;
    }
    public String delete() throws Exception {
        System.out.println("delete");
        return SUCCESS;
    }
}
