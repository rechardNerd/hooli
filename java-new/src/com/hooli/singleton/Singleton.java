/**
 * <p>Title: Singleton.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.singleton;

/**
 * <p>Title: Singleton.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * 懒汉式-线程不安全
 * 以下实现中，私有静态变量uniqueInstance被延迟实例化，这样的好处是，如果没有用到改类，那么就不会实例化uniqueInstance，从而节约资源
 * 这个实例在多线程环境下是不安全的，如果多个线程能够同时进入 if(uniqueInstance == null),并且此时uniqueInstance为null，那么会有多个线程执行uniqueInstance = new Sington();语句，
 * 这将导致实例化多次uniqueInstance
 * 
 */
public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {
		
	}
	
	public static Singleton getUniqueInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
