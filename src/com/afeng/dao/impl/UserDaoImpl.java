package com.afeng.dao.impl;

import com.afeng.dao.UserDao;
import com.afeng.domain.User;
import com.afeng.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;


public class UserDaoImpl implements UserDao {
    @Override
    public User login(User user) {
        //获得session对象
        Session session = HibernateUtils.getCurrentSession();
        //书写HQL语句
        Query query = session.createQuery("from User where username=? and password=?");
        //设置HQL语句中的参数
        query.setParameter(0, user.getUsername());
        query.setParameter(1, user.getPassword());
        User loginUser = (User) query.uniqueResult();
        return loginUser;
    }
}
