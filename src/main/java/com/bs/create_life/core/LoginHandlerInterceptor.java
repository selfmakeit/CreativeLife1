package com.bs.create_life.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器配置
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String servletPath = httpServletRequest.getServletPath();
        System.out.println(servletPath + "-------------");
        if (servletPath.contains("static")) {
            return true;
        }
        if (servletPath.contains("register")) {
            return true;
        }
        if (servletPath.contains("login")) {
            return true;
        }
        /*if (null == httpServletRequest.getSession().getAttribute(WebAllStatic.USER)) {
            httpServletResponse.sendRedirect("/html/login.ftl");
            return false;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        // System.out.println(1222222222);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //System.out.println(1222222222);
    }
}
