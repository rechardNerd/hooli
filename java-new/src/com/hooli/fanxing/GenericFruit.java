package com.hooli.fanxing;

import org.junit.Test;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月26日 10:40
 */
public class GenericFruit {

    class Fruit{
        @Override
        public String toString(){
            return "fruit";
        }
    }

    class Apple extends Fruit{
        @Override
        public String toString(){
            return "apple";
        }
    }

    class Person{
        @Override
        public String toString(){
            return "Person";
        }
    }

    class GenerateTest<T>{
        public void show_1(T t){
            System.out.println(t.toString());
        }

        // 在范型类中声明一个范型方法，使用范型E，这种范型E可以为任意类型，也可以不同。
        // 由于范型方法在声明的时候会声明范型<E>，因此即使在范型类中从未声明范型，
        // 编译器也能够正确识别范型方法中识别的范型
        public <E> void show_3(E t){
            System.out.println(t.toString());
        }
        // 范型类中声明了一个范型方法，使用范型T，注意这个T是一个全新的类型，可以与范型类中的声明的T不是同一种类型
        public <T> void show_2(T t){
            System.out.println(t.toString());
        }

        // 范型方法与可变参数
        public <T> void printMsg(T... args){
            for (T t : args){
                System.out.println("t is "+ t);
            }
        }
    }



    @Test
    public void test(){
        Apple apple = new Apple();
        Person person = new Person();

        GenerateTest<Fruit> generateTest = new GenerateTest<Fruit>();
        // apple是Fruit的子类，所以这里可以
        generateTest.show_1(apple);
        //编译器会报错，因为泛型类型实参指定的是Fruit，而传入的实参类是Person
        //generateTest.show_1(person);

        // 使用这两个方法都可以成功
        generateTest.show_2(apple);
        generateTest.show_2(person);

        // 使用这两个方法也都可以成功
        generateTest.show_3(apple);
        generateTest.show_3(person);
        generateTest.printMsg("111",2222,"aaa",33.3);
    }
}
