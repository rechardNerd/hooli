package com.hooli.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args){
    //@SuppressWarnings("resource")
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("application.xml");
        HelloWorld hw1 = (HelloWorld) appCtx.getBean("proxy");
        HelloWorld hw2 = (HelloWorld) appCtx.getBean("proxy2");
        hw1.printHelloWorld();
        hw1.doPrint();

        hw2.printHelloWorld();
        hw2.doPrint();
    }
}
