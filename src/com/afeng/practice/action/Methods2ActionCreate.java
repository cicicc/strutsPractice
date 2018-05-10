package com.afeng.practice.action;

    /**
     * 第一种Action类的创建
     * 一个pojo类 有一个空参构造以及一个返回String的execute方法
     * 空参构造使用类自带的构造
     */
/*public class Methods2ActionCreate {

    public String execute(){
        System.out.println("Hello Struts");
        return "success";
    }
}*/

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
     * 第二种Action类的创建方法 使类实现Action接口
     * package com.opensymphony.xwork2; 该类位于xwork包下 因为struts2是基于xwork改写的
     * 类中定义了五个变量 用于返回 总而言之 就是稍微简化了一下代码的书写 所以--并不常用
     * public interface Action {
     *     String SUCCESS = "success";
     *     String NONE = "none";
     *     String ERROR = "error";
     *     String INPUT = "input";
     *     String LOGIN = "login";
     *
     *     String execute() throws Exception;
     * }
     */
  /*  public class Methods2ActionCreate implements Action {

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}*/

    /**
     * 第三种方法 也是最为常用的方法 使类继承于ActionSupport类 类中已经有大量的方法和变量的定义了
     * 类实现了很多接口
     * public class ActionSupport implements Action, Validateable, ValidationAware, TextProvider, LocaleProvider, Serializable
     */
public class Methods2ActionCreate extends ActionSupport {
    //下面的代码就是他父类的execute方法了
//    public String execute() throws Exception {
//        return "success";
//    }
        @Override
        public String execute() throws Exception {
            System.out.println("I'm came from China");
            return null;
        }
    }










