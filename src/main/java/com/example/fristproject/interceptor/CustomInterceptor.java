package com.example.fristproject.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

public class CustomInterceptor implements AsyncHandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Controller 진입 전 " + request.getRequestURI());
        System.out.println("Object "+ handler);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Controller 진입 후 ");
        //System.out.println("modelAndView "+ modelAndView.getView());
        System.out.println("Object "+ handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception  ex) throws Exception {
        System.out.println("JSP 렌더링 후 ");
        System.out.println("Exception "+ ex);
        System.out.println("Object "+ handler);
    }

    @Override
    public void afterConcurrentHandlingStarted( HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("비동기 Controller 진입 후 ");
    }
}
