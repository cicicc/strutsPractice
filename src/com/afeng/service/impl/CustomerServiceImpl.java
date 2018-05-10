package com.afeng.service.impl;

import com.afeng.dao.CustomerDao;
import com.afeng.dao.impl.CustomerDaoImpl;
import com.afeng.domain.Customer;
import com.afeng.service.CustomerService;
import com.afeng.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public List<Customer> findAll() {
        List<Customer> list = null;
        //获得session对象并开启事务
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //调用dao层查询数据
        list =customerDao.findAll();
        transaction.commit();

        return list;
    }

    @Override
    public void save(Customer customer) {
        //开启事务
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        customerDao.save(customer);
        //提交事务
        transaction.commit();
    }
}
