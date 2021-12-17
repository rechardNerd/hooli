/**
 * <p>Title: Singleton5.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.singleton;

/**
 * 
 * <p>Title: Singleton5.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * 静态内部类实现
 * 当Singleton5类被加载时，静态内部类SingletonHolder没有被加载进内存。只有当调用
 * getUniqueInstance()方式从从而触发 SingletonHolder.INSTANCE 时 SingletonHolder
 * 才会被加载，此时初始化INSTANCE实例，并且JVM能确保INSTANCE只被实例化一次。
 * 这种方式不仅具有延迟实例化的好处，而且由JVM提供了对线程安全的支持
 */
public class Singleton5 {
	private Singleton5() {
		
	}
	
	private static class SingletonHolder{
		private static final Singleton5 INSTANCE = new Singleton5();
	}
	
	public static Singleton5 getUniqueInstance() {
		return SingletonHolder.INSTANCE;
	}
}
