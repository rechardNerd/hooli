/**
 * <p>Title: StringBuilder.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.builder;

/**
 * <p>Title: StringBuilder.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class StringBuilder extends AbstractStringBuilder{
	public StringBuilder() {
		super(16);
	}
	
	@Override
	public String toString() {
		// Create a copy, don't share the array
		return new String(value, 0, count);
	}
}
