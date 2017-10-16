package com.lamou.service.impl;

import com.lamou.dao.UserDao;
import com.lamou.dao.impl.UserDaoImpl;
import com.lamou.domain.User;
import com.lamou.service.UserService;

/**
 * Created by dllo on 17/10/11.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public User login(User user) {
        //调用dao层的登录方法
        return userDao.login(user);
    }

    @Override
    public User register(User user) {
        //调用dao层的注册方法
        return userDao.register(user);
    }
}
