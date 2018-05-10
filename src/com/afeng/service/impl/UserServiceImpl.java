package com.afeng.service.impl;

import com.afeng.dao.UserDao;
import com.afeng.dao.impl.UserDaoImpl;
import com.afeng.domain.User;
import com.afeng.service.UserService;
import com.afeng.utils.HibernateUtils;
import org.hibernate.Transaction;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public User login(User user) {
        User loginUser = null;
        //开启事务
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        //调用dao层查询数据库
        loginUser = userDao.login(user);

        //提交事务
        transaction.commit();
        return loginUser;
    }
}
