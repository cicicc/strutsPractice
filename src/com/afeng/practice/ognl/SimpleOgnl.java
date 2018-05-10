package com.afeng.practice.ognl;

import com.afeng.domain.User;
import com.afeng.utils.UUIDUtils;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

/**
 * 对OGNL语法的基本练习
 */
public class SimpleOgnl {
    @Test
    public void useOgnl() throws OgnlException {
        //创建OGNL上下文对象
        OgnlContext ognlContext = new OgnlContext();
        //使用ognl获得Math库中的random函数随机产生的值 并进行打印
        Object value = Ognl.getValue("@java.lang.Math@random()", ognlContext, ognlContext.getRoot());
        System.out.println(value);
    }

    /**
     * 使用Ognl表达式获取当前root对象中的数据 和context域中的数据
     * 获取root中的数据直接以"属性name"来获取
     * 而获取context中的数据则以"#属性name"来获取
     * @throws OgnlException getValue会抛出此异常 此处抛出
     */
    @Test
    public void useOgnl2() throws OgnlException {
        //创建ognl上下文对象
        //public class OgnlContext implements Map ognl实际上是map的子类
        OgnlContext ognlContext = new OgnlContext();
        ognlContext.put("name", "afeng");
        Object value = Ognl.getValue("#name", ognlContext, ognlContext.getRoot());
        System.out.println(value);
        User user = new User();
        user.setUid(UUIDUtils.getUUID());
        user.setName("pangChun");
        ognlContext.setRoot(user);
        Object name = Ognl.getValue("name", ognlContext, ognlContext.getRoot());
        System.out.println(name);

    }
}
