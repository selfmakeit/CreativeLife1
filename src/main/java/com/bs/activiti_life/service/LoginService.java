package com.bs.activiti_life.service;

import com.bs.activiti_life.po.UserAccount;

public interface LoginService {

    public UserAccount doLogin(String userName, String password);
}
