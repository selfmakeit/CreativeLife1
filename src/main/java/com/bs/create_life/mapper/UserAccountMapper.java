package com.bs.create_life.mapper;

import com.bs.create_life.base.BaseMapper;
import com.bs.create_life.po.UserAccountPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component(value = "userMapper")
@Mapper
public interface UserAccountMapper extends BaseMapper<UserAccountPO> {
    /**
     * 登陆验证
     *
     * @param userAccount
     * @return
     */
    UserAccountPO findByUserNameAndPassword(UserAccountPO userAccount);

    /**
     * 注册验证
     *
     * @param userName
     * @return
     */
    UserAccountPO findByUserName(String userName);

    Boolean  insert(UserAccountPO userAccountPO);
}
