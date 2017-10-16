package com.lamou.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 17/10/11.
 */
public class BatchAction extends ActionSupport implements ServletContextAware{
    private String[] username;
    private String[] password;
    public String batch(){
//        List list = new ArrayList();
//        list.add(username[0]);
//        list.add(password[0]);
//        list.add(username[1]);
//        list.add(password[1]);
//        list.add(username[2]);
//        list.add(password[2]);
//        for (int i = 0; i < username.length; i++) {
//            list.add(username[i]);
//            list.add(password[i]);
//        }
//        System.out.println(list);
//        ServletActionContext.getRequest().setAttribute("list", list);
        return SUCCESS;
    }
    public String batch1(){
        Map map =new HashMap();
        map.put(username[0],password[0]);
        map.put(username[1],password[1]);
        map.put(username[2],password[2]);
        System.out.println(map);
        ServletActionContext.getRequest().setAttribute("map", map);
        return SUCCESS;
    }

    public String[] getUsername() {
        return username;
    }

    public void setUsername(String[] username) {
        this.username = username;
    }

    public String[] getPassword() {
        return password;
    }

    public void setPassword(String[] password) {
        this.password = password;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {

    }
}
