package com.hooli.adapter;

/**
 * 鸭子（Duck）和火鸡（Turkey）拥有不同的叫声，Duck的叫声调用quack()方法，
 * 而Turkey调用gobble()方法。
 * 要求将Turkey的gobble()方法适配成Duck的quack方法，从而让火鸡冒充鸭子
 */
public class Client {
    public static void main(String[] args){
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
