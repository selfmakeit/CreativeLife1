package com.bs.create_life.controller;

import com.bs.create_life.base.BaseController;
import com.bs.create_life.core.WebAllStatic;
import com.bs.create_life.po.UserAccountPO;
import com.bs.create_life.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("login")
public class LoginController extends BaseController {

    @Autowired
    LoginService loginService;

    @RequestMapping
    void login(HttpServletResponse response, HttpServletRequest httpServletRequest) {
        try {
            response.sendRedirect(httpServletRequest.getContextPath() + "html/login.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
    void doLogin(HttpServletRequest request, HttpServletResponse response) {
        try {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            UserAccountPO userAccount = loginService.doLogin(userName, password);
            if (null == userAccount) {
                response.sendRedirect(request.getContextPath() + "/html/login.html");
            } else {
                request.getSession().setAttribute(WebAllStatic.USER, userAccount);
                response.sendRedirect("/index.ftl");
                //response.getWriter().write("登陆成功！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
