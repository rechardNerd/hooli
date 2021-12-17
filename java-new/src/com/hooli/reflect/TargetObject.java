package com.hooli.reflect;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年12月15日 17:34
 */
public class TargetObject {
    private String value;

    public TargetObject(){
        value = "JavaGuide";
    }

    public void publicMethod(String s){
        System.out.println("I love "+ s);
    }

    private void privateMethod(){
        System.out.println("value is "+ value);
    }
}
