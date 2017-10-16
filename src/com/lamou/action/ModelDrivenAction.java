package com.lamou.action;

import com.lamou.domain.User;
import com.lamou.domain.Users;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by dllo on 17/10/11.
 */
public class ModelDrivenAction extends ActionSupport implements ModelDriven<Users>{
    private Users users;

    public String batch1(){
        return SUCCESS;
    }
    @Override
    public Users getModel() {
        users = new Users();
        return users;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
