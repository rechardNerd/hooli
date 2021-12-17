package com.hooli.basictype;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月25日 20:37
 */
public class BasicType {
    /**
     * 基本类型都有对应的包装类型，基本类型与其对应的包装类型之间的赋值使用自动装箱和拆箱完成。
     */
    Integer x = 2;      // 装箱 调用了 Integer.valueOf(2)
    int y = x;          // 拆箱 调用了 X.intValue

    public static void main(String[] args){
        /**
         * 缓存池
         * new Integer(123) 与 Integer.valueOf(123)的区别在于
         * new Integer(123)每次都会新建一个对象；
         * Integer.valueOf(123)会使用缓存池中的对象，多次调用会取得同一个对象的引用
         */
        Integer a = new Integer(123);
        Integer b = new Integer(123);
        System.out.println(a == b);             // false
        Integer c = Integer.valueOf(123);
        Integer d = Integer.valueOf(123);
        System.out.println(c == d);             // true
    }

    // valueOf()方法比较简单，就是先判断值是否在缓存池中，如果在的话返回缓存池的内容
    /*public static Integer valueOf(int i){
        if( i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)]
        return new Integer(i)
    }*/


}
