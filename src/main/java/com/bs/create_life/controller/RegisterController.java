package com.bs.create_life.controller;

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
    void register(HttpServletResponse response) {
        try {
            response.sendRedirect("html/register.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("doRegister")
    @ResponseBody
    void register(UserAccountPO userAccountPO, HttpServletRequest httpServletRequest) {
        JsonValue register = registerService.Register(userAccountPO.getUserName(), userAccountPO.getPassword());
        if (register.getSuccess()) {
            try {
                response.sendRedirect(httpServletRequest.getContextPath() + "html/login.ftl");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
