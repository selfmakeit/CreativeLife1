package com.bs.create_life.controller.login;

import com.bs.create_life.base.BaseController;
import com.bs.create_life.po.UserAccountPO;
import com.bs.create_life.service.RegisterService;
import com.bs.create_life.util.JsonValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("register")
public class RegisterController extends BaseController {

    @Autowired
    RegisterService registerService;

    @RequestMapping
    String register(HttpServletResponse response) {

        return "html/register";

    }

    @RequestMapping("doRegister")

    String register(UserAccountPO userAccountPO, HttpServletRequest httpServletRequest, HttpServletResponse response) {
        JsonValue register = registerService.Register(userAccountPO.getUserName(), userAccountPO.getPassword());
        if (register.getSuccess()) {
            return "html/login";
        }
        return "html/login";
    }
}
