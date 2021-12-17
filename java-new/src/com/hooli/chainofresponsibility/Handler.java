package com.hooli.chainofresponsibility;



/**
 * 动作型
 * 设计模式-责任链
 * 使多个对象有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链发送请求，知道有一个对象处理它为止
 */
public abstract class Handler {
    protected Handler sucessor;

    public Handler(Handler successor){
        this.sucessor = successor;
    }

    protected abstract void handleRequest(Request request);

}
