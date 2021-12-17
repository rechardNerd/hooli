/**
 * <p>Title: SimpleFactory.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.simplefactory;

/**
 * <p>Title: SimpleFactory.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class SimpleFactory {
	public Product createProduct(int type) {
		if (type == 1) {
			return new ConcreteProduct1();
		} else if (type == 2) {
			return new ConcreteProduct2();
		}else {
			return new ConcreteProduct();
		}
	}
}
