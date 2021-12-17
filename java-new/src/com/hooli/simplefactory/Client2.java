/**
 * <p>Title: Client2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.simplefactory;

/**
 * <p>Title: Client2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class Client2 {
	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		Product product = simpleFactory.createProduct(1);
		// do something with the product
	}
}
