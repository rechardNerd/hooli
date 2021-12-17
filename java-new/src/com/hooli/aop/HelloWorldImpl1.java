package com.hooli.aop;

public class HelloWorldImpl1 implements HelloWorld{
    @Override
    public void printHelloWorld() {
        System.out.println("--------1111------按下HelloWorld1.printHelloWorld()-------1111");
    }

    @Override
    public void doPrint() {
        System.out.println("---------11111111------打印H饿了咯W哦人类的I买票了--------11111-------");
        return;
    }
}
