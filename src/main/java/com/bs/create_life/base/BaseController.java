package com.bs.create_life.base;

import com.bs.create_life.core.ResultDataDto;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BaseController {

    
    @ExceptionHandler(Exception.class)   //在Controller类中添加该注解方法即可(注意：添加到某个controller，只针对该controller起作用)
    public void exceptionHandler(Exception ex, HttpServletResponse response, HttpServletRequest request) throws IOException {

        response.setContentType("text/html;charset=utf-8");
        response.sendRedirect("");
    }
}
