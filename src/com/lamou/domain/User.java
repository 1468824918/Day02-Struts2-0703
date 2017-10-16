package com.lamou.domain;

/**
 * Created by dllo on 17/10/11.
 */
public class User {
    private String username;//用户名,与表单定义的name属性名保持一致
    private String password;//密码,与表单定义的name属性名保持一致
    private String password1;//确认密码,与表单定义的name属性名保持一致
    private String gender;//性别
    private String hobbies;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
