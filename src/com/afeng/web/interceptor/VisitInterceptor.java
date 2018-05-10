package com.afeng.web.interceptor;

import com.afeng.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class VisitInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        //首先从session中,试图取出loginUser对象
        User  loginUser = (User) ActionContext.getContext().getSession().get("loginUser");
        System.out.println("Hello");
        if (loginUser == null) {
            //用户并没有登录
            ActionContext.getContext().put("msg","please login");
            return "login";
        }else{
            //已经登录 放行
            return actionInvocation.invoke();
        }
    }
}
