/**
 * <p>Title: AbstractStringBuilder.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.builder;

import java.util.Arrays;

/**
 * <p>Title: AbstractStringBuilder.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class AbstractStringBuilder {
	protected char[] value;
	
	protected int count;
	
	public AbstractStringBuilder(int capacity) {
		count = 0;
		value = new char[capacity];
	}
	
	public AbstractStringBuilder append(char c) {
		ensureCapacityInternal(count + 1);
		value[count++] = c;
		return this;
	}
	
	private void ensureCapacityInternal(int minimumCapacity) {
		// overflow-conscious code
		if (minimumCapacity - value.length > 0)
			expandCapacity(minimumCapacity);
	}
	
	void expandCapacity(int minimumCapacity) {
		int newCapacity = value.length * 2 + 2;
		if (newCapacity - minimumCapacity < 0)
			newCapacity = minimumCapacity;
		if (newCapacity < 0) {
			if (minimumCapacity < 0)
				throw new OutOfMemoryError();
			newCapacity = Integer.MAX_VALUE;
		}
		value = Arrays.copyOf(value, newCapacity);
	}
}
