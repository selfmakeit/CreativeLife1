package com.bs.create_life.service;

import com.bs.create_life.po.UserAccountPO;
import com.bs.create_life.util.JsonValue;

public interface RegisterService {
    JsonValue Register(String name, String password);
}
