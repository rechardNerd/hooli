package com.hooli.fanxing;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月26日 09:52
 */
@Slf4j
public class GenericTest {
    // 范型类
    public class Generic<T>{
        private T key;

        public Generic(T key){
            this.key = key;
        }
        // 方法中使用了范型，但这并不是范型方法
        // 这只是类中的一个普通的成员方法，只不过他的返回值是在声明范型类已经声明过的类型
        // 所以在这个方法中才可以继续使用T这个类型
        public T getKey(){
            return key;
        }
    }

    /**
     * 这才是一个真正的范型方法
     * 首先在public与返回值之间的<T>必不可少，这表明这是一个范型方法，并且声明了一个范型T
     * 这个T可以出现在这个范型方法的任意位置
     * 范型的数量个可以为任意多个
     * 如：public <T,K> K showKeyName(Generic<T> container){
     *
     * }
     * @param container
     * @param <T>
     * @return
     */
    public <T> T showKeyName(Generic<T> container){
        log.info("container key: {}",container.getKey() );
        // 当然这个例子举的不太合适，只是为了说明范型方法的特性
        T test = container.getKey();
        return test;
    }

    //这也不是一个泛型方法，这就是一个普通的方法，只是使用了Generic<Number>这个泛型类做形参而已。
    public void showKeyValue1(Generic<Number> obj){
        log.info("container key: {}",obj.getKey() );
    }

    // 这也不是一个范型方法，这是一个普通方法，只不过使用了范型通配符？
    // 同时这也印证了范型通配符章节所描述的，？是一种类型实参，可以看做为Number等所有类的父类
    public void showKeyValue2(Generic<?> obj){
        log.info("container key: {}",obj.getKey() );
    }
}
