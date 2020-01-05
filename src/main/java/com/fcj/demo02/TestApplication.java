package com.fcj.demo02;

import com.fcj.demo02.testaop.service.CglibUserService;
import com.fcj.demo02.testaop.service.UserService;
import com.fcj.demo02.testaop.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by dormi on 2020/1/3.
 */
@ComponentScan("com.fcj.demo02.*")
//@ComponentScan到底是上面的还是这一行的
@EnableAspectJAutoProxy
public class TestApplication {

    public static void main(String[] args) {
        // 因为所以想获取@Service这种形式的bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestApplication.class);
        // jdk自带动态代理
//        UserService userService = context.getBean(UserService.class);
        // cglib
        CglibUserService userService = (CglibUserService) context.getBean("cglibUserService");
        userService.login(7);
    }

}
