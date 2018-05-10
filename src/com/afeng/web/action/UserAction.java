package com.afeng.web.action;

import com.afeng.domain.User;
import com.afeng.service.UserService;
import com.afeng.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction implements ModelDriven<User> {
    /**
     * 采用模型驱动的方式处理从页面获取到的数据
     * 将数据封装到model对象中去
     */
    private User user = new User();
    private UserService userService = new UserServiceImpl();
    @Override
    public User getModel() {
        return user;
    }
    public String login(){
        //调用service层查询数据
       User loginUser =  userService.login(user);
        if (loginUser == null) {
            //将错误信息放入ActionContext中 并转发到登录页面 且将错误信息打印出来
            ActionContext.getContext().put("msg","please check your input,something is wrong");
            return "login";
        }else{
            //登陆成功
            //将登陆的用户信息放入session中 并跳转到首页
            ActionContext.getContext().getSession().put("loginUser", loginUser);
            System.out.println("session");
            return "success";

        }

    }
}
