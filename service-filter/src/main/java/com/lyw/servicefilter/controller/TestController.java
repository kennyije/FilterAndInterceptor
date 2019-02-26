package com.lyw.servicefilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/2/26.
 */
@RestController
@RequestMapping("/testController")
public class TestController {
    @GetMapping("/test")
    public void getMessage(){
        System.out.println("controller 开始");
    }
}
