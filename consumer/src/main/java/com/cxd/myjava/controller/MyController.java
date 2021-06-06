package com.cxd.myjava.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cxd.myjava.service.BookService;
import com.cxd.myjava.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @Reference
    private UserService userService;

    @Reference
    private BookService bookService;

    @RequestMapping("/")
    public String  index(){
        return "login";
    }

    @RequestMapping("/login")
    public ModelAndView login(String username,String password){
        Integer userId = userService.queryUser(username,password);
        ModelAndView mv = new ModelAndView();

        return mv;
    }

}
