package com.bs.activiti_life.controller;

import com.bs.activiti_life.base.BaseController;
import com.bs.activiti_life.po.UserAccount;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("login")
public class LoginController extends BaseController {

    @RequestMapping
    void login(HttpServletResponse response) {
        try {
            response.sendRedirect("html/index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "doLogin",method = RequestMethod.POST)
    String doLogin(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        return null;
    }

}
