package com.fcj.demo02.testaop.service;

import com.fcj.demo02.testaop.pojo.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * Created by dormi on 2020/1/3.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User login(int id) {
        User user = new User();
        user.setId(id);
        user.setUserName("fcjhaooo");
        return user;
    }
}
