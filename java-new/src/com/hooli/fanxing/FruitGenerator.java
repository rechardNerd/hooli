package com.hooli.fanxing;

/**
 * @Description: TODO
 * @author: wude
 * @date: 2021年11月25日 22:53
 * 传入范型实参时：
 * 定义一个生产器实现接口，虽然我们只定义了一个范型接口Generator<T>
 * 但是我们可以为T传入无数个实参，形成无数种类型的Generator接口。
 * 在实现类实现范型接口时，如已将范型类型传入实参类型，则所有使用范型的地方
 * 都要替换成传入的实参类型
 * 即：Generator<T>,public T next();中的T都要替换成传入的String类型。
 */
public class FruitGenerator implements Generator<String> {
    @Override
    public String next() {
        return null;
    }
}
