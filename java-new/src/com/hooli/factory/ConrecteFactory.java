/**
 * <p>Title: ConrecteFactory.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.factory;

import com.hooli.simplefactory.ConcreteProduct;
import com.hooli.simplefactory.Product;

/**
 * <p>Title: ConrecteFactory.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class ConrecteFactory extends Factory {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}
	
}
