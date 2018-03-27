package com.bs.create_life.controller.login;

import com.bs.create_life.base.BaseController;
import com.bs.create_life.core.WebAllStatic;
import com.bs.create_life.po.UserAccountPO;
import com.bs.create_life.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController extends BaseController {

    @Autowired
    LoginService loginService;

    @RequestMapping
    String login(HttpServletResponse response, HttpServletRequest request,ModelMap map) {
        return "html/login";
    }

    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
    String doLogin(HttpServletRequest request, HttpServletResponse response, ModelMap map) {

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        UserAccountPO userAccount = loginService.doLogin(userName, password);
        if (null == userAccount) {
            return "redirect:html/login.ftl";
        } else {
            map.addAttribute("request", request);
            request.getSession().setAttribute(WebAllStatic.USER, userAccount);
            return "/index";
        }
    }
}
