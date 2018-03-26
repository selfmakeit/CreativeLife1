package com.bs.create_life.service.impl;

import com.bs.create_life.mapper.UserAccountMapper;
import com.bs.create_life.po.UserAccountPO;
import com.bs.create_life.service.RegisterService;
import com.bs.create_life.util.JsonValue;
import com.bs.create_life.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    UserAccountMapper userAccountMapper;

    @Override
    public JsonValue Register(String userName, String password) {
        UserAccountPO i = userAccountMapper.findByUserName(userName);
        if (null != i) {
            return JsonValue.errMessage("账号存在");
        } else {
            UserAccountPO userAccountPO = new UserAccountPO();
            userAccountPO.setId(UUIDUtil.getUUID());
            userAccountPO.setUserName(userName);
            userAccountPO.setPassword(password);
            Boolean insert = userAccountMapper.insert(userAccountPO);
            if (insert) {
                return JsonValue.ok();
            } else {
                return JsonValue.err();
            }
        }
    }
}
