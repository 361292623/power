package com.app.power.controller;

import com.app.power.services.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@Slf4j
public class HelloWorldController {

    @Autowired
    private IUserService userService;

    @GetMapping("/select_sql")
    public Object getUserBySql() {
        return userService.selectListBySQL();
    }

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    /**
     * 测试thymeleaf
     */
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model){
        //把数据存入model
        model.addAttribute("name","MaximusRj");
        //返回test.html
        return "test";
    }
}