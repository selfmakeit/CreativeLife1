package com.bs.create_life.service.impl;

import com.bs.create_life.base.BaseServiceImpl;
import com.bs.create_life.mapper.UserAccountMapper;
import com.bs.create_life.po.UserAccountPO;
import com.bs.create_life.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl
        extends BaseServiceImpl<UserAccountPO, UserAccountMapper>
        implements LoginService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public void setMapper(UserAccountMapper m) {

    }

    @Override
    public UserAccountPO doLogin(String userName, String password) {
        UserAccountPO u = new UserAccountPO();
        u.setPassword(password);
        u.setUserName(userName);
        UserAccountPO byUserNameAndPassword = userAccountMapper.findByUserNameAndPassword(u);
        if (null == byUserNameAndPassword) {
            return null;
        } else {
            return byUserNameAndPassword;
        }
    }
}
