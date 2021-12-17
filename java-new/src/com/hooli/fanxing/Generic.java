package com.hooli.fanxing;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Description:
 *  范型有三种使用方式，分别为：范型类、范型接口、范型方法
 * @author: wude
 * @date: 2021年11月25日 22:28
 */
// 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示范型
// 在实例化范型类时,必须指定T的具体类型
@Slf4j
public class Generic <T>{
    // key这个成员变量的类型为T，T的类型由外部指定
    private T key;

    public Generic(T key){ // 范型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){
        return key;
    }



    public static void main(String[] args){
        // 范型的类型参数只能是类类型（包括自定义类），不能是简单的类型
        // 传入的实参类型需与范型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<>(123456);
        // 传入的实参类型需与范型的类型参数类型相同，即为String
        Generic<Float> genericString = new Generic<Float>(12.45f);
        log.info("范型测试，key is [{}]",genericInteger.getKey());
        log.info("范型测试，key is [{}]",genericString.getKey());
    }

}
