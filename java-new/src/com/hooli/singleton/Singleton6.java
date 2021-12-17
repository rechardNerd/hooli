/**
 * <p>Title: Singleton6.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.singleton;

/**
 * <p>Title: Singleton6.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * 枚举实现
 * 该实现可以放置反射攻击。在其他实现中，通过setAccessible()方法可以将私有的
 * 构造函数的访问级别设置为public，然后调用构造函数从而实例化对象，如果要防止
 * 这种攻击，需要在构造函数中添加防止多次实例化的代码。该实现是由JVM保证只会实例化一次，
 * 因此不会出现上述的反射攻击。
 * 
 * 该实现在多次序列化和序列化之后，不会得到多个实例。而其他实现需要使用transient修饰所有
 * 字段，并且实现序列化和反序列化的方法。
 */
public enum Singleton6 {
	
	INSTANCE;
	
	private String objName;
	
	public String getObjName() {
		return objName;
	}
	
	public void setObjName(String objName) {
		this.objName = objName;
	}
	
	public static void main(String[] args) {
		// 单例测试
		Singleton6 firstSingleton = Singleton6.INSTANCE;
		firstSingleton.setObjName("firstName");
		System.out.println(firstSingleton.getObjName());
		Singleton6 secondSingleton = Singleton6.INSTANCE;
		secondSingleton.setObjName("secondName");
		System.out.println(firstSingleton.getObjName());
		System.out.println(secondSingleton.getObjName());
		
		// 反射获取实例测试
		try {
			Singleton6[] enumConstants = Singleton6.class.getEnumConstants();
			for (Singleton6 enumConstant : enumConstants) {
				System.out.println(enumConstant.getObjName());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
