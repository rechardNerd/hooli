/**
 * <p>Title: Singleton4.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.singleton;

/**
 * <p>Title: Singleton4.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * uniqueInstance只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化的代码进行，只有当uniqueInstance没有被实例化时，才需要进行加锁。
 * 双重校验锁先判断uniqueInstance是否已经被实例化，如果没有实例化，那么才对实例化语句加锁
 */
public class Singleton4 {
	/* volatile 关键字的作用 
	 * 1.保证内存可见性
	 * 可见性是指线程之间的可见性，一个线程修改的状态对另一个线程是可见的。其实也就是说一个线程修改的结果，另一个线程马上就能看见
	 * 2.禁止指令重拍
	 * 只能重排序是JVM为了优化指令、提高程序运行效率，提高并行度。指令重排序包括编译器重排序和运行时重排序
	 */
	
	/**
	 * uniqueInstance采用volatile关键字修饰也是必要的，
	 * uniqueInstance = new Singleton();这段代码其实是分三部执行：
	 * 1.为uniqueInstance分配内存空间
	 * 2.初始化uniqueInstance
	 * 3.将uniqueInstance指向分配的内存地址
	 * 但由于JVM具有指令重拍的特性，执行顺序有可能变成1>3>2。指令重拍在单线程环境下不会出现问题，
	 * 但是在多线程环境下会导致一个线程获得嗨，诶呦初始化实例。例如T1执行了1和3，此时T2调用getUniqueInstance()
	 * 后发现uniqueInstance不为空，因此返回uniqueInstance,但此时uniqueInstance还未被初始化
	 * 使用volatile可以禁止JVM的指令重排，保证在多线程环境下也能正常运行
	 */
	private volatile static Singleton4 uniqueInstance;
	
	private Singleton4() {
		
	}
	
	public static Singleton4 getUniqueInstance() {
		if(uniqueInstance==null) {
			synchronized (Singleton4.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton4();
				}
			}
		}
		return uniqueInstance;
	}
	
	/**
	 * if(uniqueInstance ==null){
	 * 		synchronized (Sington4.class){
	 * 			uniqueInstance = new Singleton();
	 * 		}
	 * }
	 * 考虑到以上的实现，也就是只使用了一个if语句。在uniqueInstance == null的情况下
	 * 如果两个都执行了if语句，那么两个程序都会进入if语句块。虽然在if语句块内有加锁操作，
	 * 但是两个线程都会执行unqueInstance = new Singleton4();这条语句，只是先后的问题，
	 * 那么就会进行两次实例化。因此必须使用双重校验锁，也就是需要使用两个if语句：第一个if避免
	 * uniqueInstance已经实例化之后的加锁操作。而第二个if语句进行了加锁，所以只能一个线程进入，
	 * 就不会uniqueInstance==null时两个线程同时进行实例化操作
	 */
}
