package com.afeng.practice.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.Map;


public class TestActionContext extends ActionSupport {
    /**
     * 默认执行的方法 放行输入信息的页面
     */
    @Override
    public String execute() throws Exception {

        return SUCCESS;

    }

    /**
     * 打印输入的信息的页面
     * 可以从代码中看出 使用ActionContext必须要通过属性驱动或者模型驱动的方式才能够获取所需要的页面上的值
     * 而ServletActionContext可以直接获取原生的request response对象的 但美中不足的是并没实现解耦
     */
    public String printDemo() throws Exception {
        //并没有打印出来值
        /*//获取context对象 操作与servlet大致相同
        ActionContext context = ActionContext.getContext();
        //获取所有参数
        Object name = context.get("name");
        System.out.println(name);
        Map<String, Object> parameters = context.getParameters();
        for (String key : parameters.keySet()) {
            String[] value = (String[])context.get(key);
            System.out.println(value);
        }*/
        //这样可以打印出值来 如果想要通过ActionContext对象获取到页面的值得话 必须要提供属性驱动或者模型驱动的方法
//        String name = ServletActionContext.getRequest().getParameter("name");
        Map<String, String[]> parameterMap = ServletActionContext.getRequest().getParameterMap();
        for (String key : parameterMap.keySet()) {
            System.out.println(ServletActionContext.getRequest().getParameter(key));
        }
        //向request域中存值
        ServletActionContext.getRequest().setAttribute("reqValue","Hello request");
        //向session域中存值
        ServletActionContext.getRequest().getSession().setAttribute("sessValue", "Hello Session");
        //向域中存值
        ServletActionContext.getServletContext().setAttribute("AppValue", "Hello ApplicationContext");

        //System.out.println(name);
        return SUCCESS;

    }
}
