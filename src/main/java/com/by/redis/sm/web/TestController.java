package com.by.redis.sm.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 测试spring mvc框架是否可以正常运行
 * 
 * @author zwpio
 * @since 5.0
 */
@Controller
@RequestMapping(value="/test")
public class TestController {
    
    @RequestMapping(value = "tf", method = RequestMethod.GET)
    public String testFunc(HttpServletRequest request, HttpServletResponse response, Model model) {
        System.out.println("------------------------");
        return "test/tf";
    }
}
