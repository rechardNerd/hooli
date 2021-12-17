package com.hooli.reflect;

import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月26日 15:21
 */
public class Test1 {
    public static void main(String[] args)throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> klass = methodClass.class;
        // 创建methodClass的实例
        Object obj = klass.newInstance();
        // 获取methodClass类的add方法
        Method method = klass.getMethod("add",int.class,int.class);
        // 调用method对应的方法 => add(1,4)
        Object result = method.invoke(obj,1,4);
        System.out.println(result);
    }

    class methodClass{
        public final int fuck = 3;
        public int add(int a, int b){
            return a + b;
        }
        public int sub(int a,int b){
            return a + b;
        }
    }

    /**
     * 利用反射创建数组
     * @throws ClassNotFoundException
     */
    @Test
    public void testArray() throws ClassNotFoundException{
        Class<?> cls = Class.forName("java.lang.String");
        Object array = Array.newInstance(cls,25);
        // 往数组里添加内容
        Array.set(array,0,"hello");
        Array.set(array,1,"java");
        Array.set(array,2,"fuck");
        Array.set(array,3,"Scala");
        Array.set(array,4,"Clojure");
        // 获取某一项内容
        System.out.println(Array.get(array,3));
    }
}
