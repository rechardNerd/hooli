/**
 * <p>Title: Client.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.simplefactory;

/**
 * <p>Title: Client.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * 以下的Client类包含了实例化的代码，这是一种错误的实现。如果在客户类中存在这种实例化代码，就
 * 需要考虑放到简单工厂中。
 */
public class Client {
	public static void main(String[] args) {
		int type = 1;
		Product product;
		if (type == 1) {
			product = new ConcreteProduct1();
		} else if (type == 2) {
			product = new ConcreteProduct2();
		} else {
			product = new ConcreteProduct();
		}
		
		// do something with the product
	}
}
