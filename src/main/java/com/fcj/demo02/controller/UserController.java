package com.fcj.demo02.controller;

import com.fcj.demo02.testaop.pojo.User;
import com.fcj.demo02.testaop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dormi on 2020/1/3.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/login/{id}")
    public User login(@PathVariable int id) {
        Long start = System.currentTimeMillis();
        User user = userService.login(id);
        Long end = System.currentTimeMillis();
        System.out.println("需要执行时间：" + (end - start));

        return user;
    }

}
