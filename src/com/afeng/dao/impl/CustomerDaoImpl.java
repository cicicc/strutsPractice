package com.afeng.dao.impl;

import com.afeng.dao.CustomerDao;
import com.afeng.domain.Customer;
import com.afeng.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public List<Customer> findAll() {
        //获得当前线程绑定的session对象
        Session session = HibernateUtils.getCurrentSession();
        //书写HQL查询语句
        List<Customer> list = session.createQuery("from Customer").list();

        return list;
    }

    @Override
    public void save(Customer customer) {
        //获取当前线程绑定的session对象
        Session session = HibernateUtils.getCurrentSession();
        //保存customer对象
        session.save(customer);

    }
}
