package com.bs.activiti_life.po;

import com.bs.activiti_life.base.BaseEntity;

//用户账号类
public class UserAccount extends BaseEntity {

    private String userName;//账号

    private String password;//密码

    private String id;//表id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
