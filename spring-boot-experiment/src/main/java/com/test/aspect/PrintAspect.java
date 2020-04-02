package com.test.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintAspect {

    // 定义切点 Pointcut
    @Pointcut("execution(*  com.test.service.impl.*.*(..))")
    public void printPointcut() {
    }

    @Before(value = "printPointcut()")
    public void doBefore() {
        System.out.println(Thread.currentThread());
        System.out.println("Before execution.");
    }

    @AfterReturning(pointcut = "printPointcut()")
    public void doAfterReturning() {
        System.out.println(Thread.currentThread());
        System.out.println("AfterReturning execution.");
    }
}
