package com.afeng.web.action;

import com.afeng.domain.Customer;
import com.afeng.service.CustomerService;
import com.afeng.service.impl.CustomerServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class CustomerAction  implements ModelDriven<Customer> {
    private CustomerService customerService = new CustomerServiceImpl();
    private Customer customer = new Customer() ;
    /**
     * 查询所有Customer并将数据放入request域中
     * @return 返回至list列表
     * @throws Exception
     */
    /*public String findAll() throws Exception {
        List<Customer> customerList = customerService.findAll();
        ServletActionContext.getRequest().setAttribute("list",customerList);
        return "list";
    }*/

    /**
     * 将数据改为放在值栈中 而不是放在request域中
     * @return 返回至list页面
     * @throws Exception
     */
    public String findAll() throws Exception {
        List<Customer> customerList = customerService.findAll();
//        ServletActionContext.getRequest().setAttribute("list",customerList);
        ActionContext.getContext().getValueStack().set("list",customerList);
        return "list";
    }


    /**
     * 将用户在页面上输入的新Customer信息采用模型驱动的方式保存下来 并调用service层将数据保存下来
     * @return 保存完毕后返回list列表
     * @throws Exception
     */
    public String save() throws Exception {
        customerService.save(customer);
        return "toList";
    }

    /**
     * 前往add.jsp页面
     * @return add的UI页面对于result
     * @throws Exception
     */
    public String toAdd() throws Exception {
        return "addUI";
    }

    @Override
    public Customer getModel() {
        return customer;
    }
}
