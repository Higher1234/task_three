package com.example.homework3;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DemoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        System.out.println("++++++++++ preHandle ++++++++++");
        System.out.println("request:"+request);
        System.out.println("\nresponse:"+response);
        System.out.println("\nhandler:"+handler);
        HttpSession session=request.getSession();
        Object login=session.getAttribute("login");
        System.out.println("login:"+login+"\n");
        if(login==null)
        {
            response.sendRedirect("/first");
            return false;
        }
        return true;
    }
}
