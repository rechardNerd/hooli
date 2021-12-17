package com.hooli.fanxing;

/**
 * 范型接口与范型类的定义及使用基本相同。
 * 范型接口常被用在各种类的生成器中
 * @param <T>
 */
public interface Generator<T> {
    public T next();
}
