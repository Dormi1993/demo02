package com.fcj.demo02.testaop.service;

import com.fcj.demo02.testaop.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by dormi on 2020/1/4.
 */
@Service("cglibUserService")
public class CglibUserService {

    public User login(int id) {
        User user = new User();
        user.setId(id);
        user.setUserName("cglibUserhaha");
        return user;
    }
}
