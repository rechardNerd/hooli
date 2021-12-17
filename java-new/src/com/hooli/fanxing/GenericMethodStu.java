package com.hooli.fanxing;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月26日 09:37
 * 范型类，是在实例化类的时候指明范型的具体类型
 * 范型方法，是在调用方法的时候指明范型的具体类型
 *
 *
 */
public class GenericMethodStu {


    /**
     * 范型方法的基本介绍
     * @param tClass 传入的范型实参
     * @param <T> 返回值为T类型
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     * 说明：
     *      1）public 与 返回值中间的<T>非常重要，可以理解为声明此方法为范型方法。
     *      2）只声明了<T>的方法才是范型方法，范型类中的使用了范型的成员方法并不是范型方法。
     *      3）<T>表明该方法将使用范型类型T，此时才可以在方法中使用范型类型T
     *      4）与范型类定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示范型
     */
    public <T> T genericMethod(Class<T> tClass) throws InstantiationException,
            IllegalAccessException{
        T instance = tClass.newInstance();
        return instance;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        GenericMethodStu genericMethodStu = new GenericMethodStu();
        Object obj = genericMethodStu.genericMethod(Class.forName("com.test.test"));
    }
}
