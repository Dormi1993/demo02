package com.fcj.demo02.testaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by dormi on 2020/1/3.
 */
@Aspect
@Component// 这个别忘了！(spring实战里面没有，是因为它的aspect是在configuration类里定义了@Bean)
public class TestAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestAspect.class);

    @Pointcut("execution(* com.fcj.demo02.testaop.service.*.*(..))")
    private void testPoint() {

    }

//    @Before("testPoint()")
    public void takeSeats() {
        System.out.println("taking seats. ");
    }

    @Around("testPoint()")
    // 下面这儿要返回Object，不是void。如果是void则会返回空，无法返回有值的user了
    public Object testTime(ProceedingJoinPoint pjp) {
        long start = System.currentTimeMillis();
        Object proceed = null;
        try {
            proceed = pjp.proceed();
        } catch (Throwable throwable) {
            LOGGER.error("error", throwable);
        }

        long end = System.currentTimeMillis();
        LOGGER.info("执行时间为：" + (end - start));

        return proceed;
    }

}
