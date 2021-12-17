package com.hooli.shuangmaohao;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月26日 15:57
 */
public class MyTest {
    public static void printValer(String str) {
        System.out.println("print value: " + str);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("a","b","c","d");
        al.forEach(AcceptMethod::pingValur);
        // 下面的方法和上面等价的
        Consumer<String> methodParam = AcceptMethod::pingValur; // 方法参数
        al.forEach(x -> methodParam.accept(x)); // 方法执行accept

    }
}
