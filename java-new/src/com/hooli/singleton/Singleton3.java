/**
 * <p>Title: Singleton3.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.singleton;

/**
 * <p>Title: Singleton3.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * 只需要对 getUniqueInstance()方法加锁，那么在一个时间点只能有一个线程能进入该方法，从而避免实例化多次uniqueInstance
 * 但是当一个线程进入该方法后，其他试图进入该方法的线程都必须等待，即使uniqueInstance已经被实例化了。这会让线程阻塞时间过
 * 长，因此该方法有性能问题，不推荐使用
 */
public class Singleton3 {
	private static Singleton3 uniqueInstance;
	
	public static synchronized Singleton3 getUniqueInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton3();
		}
		return uniqueInstance;
	}
}
