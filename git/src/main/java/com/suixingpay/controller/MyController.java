package com.suixingpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author:muziru
 * @date:2019/11/07
 * @version:v1.0
 */
@Controller
public class MyController {
    @ResponseBody
    @RequestMapping("/hello")
    public String mian(){
        return "hello world";
    }
}
