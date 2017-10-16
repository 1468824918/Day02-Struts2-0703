package com.lamou.service;

import com.lamou.domain.User;

/**
 * Created by dllo on 17/10/11.
 */
public interface UserService {
    /*
        登录
        包含要进行登录验证的参数对象
        登录成功之后的对象
     */
    User login(User user);
    /*
        注册
        包含进行注册的用户信息
        注册成功之后的用户对象
     */
    User register(User user);
}
