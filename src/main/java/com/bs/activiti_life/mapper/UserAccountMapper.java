package com.bs.activiti_life.mapper;

import com.bs.activiti_life.po.UserAccount;

public interface UserAccountMapper {

    public UserAccount findByUserNameAndPassword(String userName, String password);
}
