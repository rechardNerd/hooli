/**
 * <p>Title: Client.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.prototype;

/**
 * <p>Title: Client.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class Client {
	public static void main(String[] args) {
		Prototype prototype = new ConcretePrototype("abc");
		Prototype clone = prototype.myClone();
		System.out.println(clone.toString());
	}
}
