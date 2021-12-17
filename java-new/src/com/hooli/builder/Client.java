/**
 * <p>Title: Client.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.builder;

/**
 * <p>Title: Client.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 * 封装一个对象的构造过程，并允许按步骤构造
 */
public class Client {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		final int count = 26;
		for (int i = 0; i < count; i++) {
			sb.append((char)('a' + i));
		}
		System.out.println(sb.toString());
	}
}
