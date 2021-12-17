/**
 * <p>Title: ConcreteFactory2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.factory;

import com.hooli.simplefactory.ConcreteProduct2;
import com.hooli.simplefactory.Product;

/**
 * <p>Title: ConcreteFactory2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class ConcreteFactory2 extends Factory {


	@Override
	public Product factoryMethod() {
		return new ConcreteProduct2();
	}
	
}
