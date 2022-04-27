package com.example.springboot_03_web_demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 编写拦截器
 * 访问main页面时检查是否登录
 */
public class MainInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("拦截的路径---"+request.getRequestURI());
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser!=null){
            return true;
        }else {
            request.setAttribute("msg","请重新登录");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle方法执行------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion------------");
    }
}
