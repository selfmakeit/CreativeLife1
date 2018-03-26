package com.bs.create_life.service;

import com.bs.create_life.po.UserAccountPO;

public interface LoginService {

    public UserAccountPO doLogin(String userName, String password);
}
