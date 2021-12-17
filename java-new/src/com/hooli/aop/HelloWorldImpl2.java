package com.hooli.aop;

public class HelloWorldImpl2 implements HelloWorld{
    @Override
    public void printHelloWorld() {
        System.out.println("------2222-------按下HelloWorld2.printHelloWorld()-----22222---");
    }

    @Override
    public void doPrint() {
        System.out.println("------222-------打印HelloWorld2------2222");
    }
}
