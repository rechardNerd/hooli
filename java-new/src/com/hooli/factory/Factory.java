/**
 * <p>Title: Factory.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.factory;

import com.hooli.simplefactory.*;

/**
 * <p>Title: Factory.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * Intent
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法吧实例化操作推迟到子类
 * Class Diagram
 * 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象
 * 
 */
public abstract class Factory {
	abstract public Product factoryMethod();
	public void doSomething() {
		Product product = factoryMethod();
		// do something with the product
	}
}
