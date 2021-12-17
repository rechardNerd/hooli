/**
 * <p>Title: Client.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.abstractfactory;

/**
 * <p>Title: Client.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class Client {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new ConcreteFactory1();
		AbstractProductA productA = abstractFactory.createProductA();
		AbstractProductB productB = abstractFactory.createProductB();
	}
}
