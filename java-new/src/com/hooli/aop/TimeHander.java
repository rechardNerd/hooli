package com.hooli.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class TimeHander implements MethodBeforeAdvice, AfterReturningAdvice {


    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("代理----后------CurrentTime = " + System.currentTimeMillis());
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("代理---前-----CurrentTime = " + System.currentTimeMillis());
    }


}
