/**
 * <p>Title: Singleton2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.singleton;

/**
 * <p>Title: Singleton2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * 饿汉式-线程安全
 */
public class Singleton2 {
	private static Singleton2 uniqueInstance = new Singleton2();
}
