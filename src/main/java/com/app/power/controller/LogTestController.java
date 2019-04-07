package com.app.power.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zack
 * @Description: 日志输出配置
 * @Date: 2019/4/7 21:46
 */
@RestController
@RequestMapping("/log")
@Slf4j
public class LogTestController {

    @RequestMapping("/debug")
    public String printDebug() {

        String msg = "this is a debug msg !";
        log.debug(msg);
        return msg;
    }

    @RequestMapping("/info")
    public String printInfo() {

        String msg = "this is a info msg !";
        log.info(msg);
        return msg;
    }

    @RequestMapping("/warn")
    public String printWarn() {

        String msg = "this is a warn msg !";
        log.warn(msg);
        return msg;
    }

    @RequestMapping("/error")
    public String printError() {

        String msg = "this is a error msg !";
        log.error(msg);
        return msg;
    }

}