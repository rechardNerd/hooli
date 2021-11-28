package com.hooli.chainofresponsibility;

public class ConcreteHanderler2 extends Handler{
    public ConcreteHanderler2(Handler successor){
        super(successor);
    }


}
