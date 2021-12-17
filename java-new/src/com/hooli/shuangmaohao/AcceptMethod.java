package com.hooli.shuangmaohao;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月26日 15:50
 */
public class AcceptMethod {
    public static void pingValur(String str){
        System.out.println("print value: " + str);
    }

    public static void main(String[] args) {
        List<String> al = Arrays.asList("a","b","c","d");
        for (String a:al){
            AcceptMethod.pingValur(a);
        }
        // 下面的 for each循环和上面的循环是等价的
        al.forEach(x->AcceptMethod.pingValur(x));
    }
}
