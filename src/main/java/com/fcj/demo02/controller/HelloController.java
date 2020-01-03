package com.fcj.demo02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dormi on 2019/12/31.
 */
@RestController
public class HelloController {

    @RequestMapping("/home")
    public String goHome() {
        return "hahaha, it's home.";
    }
}
