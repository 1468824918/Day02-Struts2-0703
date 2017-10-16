package com.lamou.action;

import com.lamou.domain.User;
import com.lamou.service.UserService;
import com.lamou.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Arrays;

/**
 * Created by dllo on 17/10/11.
 */
public class CustomUserAction extends ActionSupport implements ModelDriven<User> {
    //接受页面数据的实体类对象
    private User user;
    private String [] hobbies;//存放表单传递过的数组
    //用户业务对象
    private UserService service = new UserServiceImpl();

    /**
     * 登录
     *
     * @return
     */
    public String login_UI() {
        //调用业务对象中的登录方法 如果能正常返回 则进入登录页面
        if (service.login(user)!=null){
            return SUCCESS;
        }
        return ERROR;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 注册
     *
     * @return
     */
    public String register_UI() {
        /*
            将表单中的爱好数组转换为实体类中的字符串对象
         */
//        user.setHobbies(Arrays.toString(hobbies));
//        //循环遍历,加入自己的间隔符
//        StringBuilder builder = new StringBuilder();
//        for (String hobby:hobbies) {
//            builder.append(hobby).append(",");
//        }
//        user.setHobbies(builder.toString());
        if (service.register(user)!=null){
            return "login";//注册成功返回登录页面
        }
        return "register";//注册失败返回注册界面
    }

    @Override
    public User getModel() {
        user = new User();
        return user;
    }
}
