/**
 * <p>Title: ConreteFactory2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.abstractfactory;

/**
 * <p>Title: ConreteFactory2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class ConreteFactory2 extends AbstractFactory{
	@Override
	AbstractProductA createProductA() {
		return new ProductA2();
	}
	
	@Override
	AbstractProductB createProductB() {
		return new ProductB2();
	}
}
