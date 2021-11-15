/**
 * <p>Title: Converter.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年10月21日
 * @author 德
 */
package com.hooli.interface8;

/**
 * <p>Title: Converter.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年10月21日
 * @author 德
 */
@FunctionalInterface
public interface Converter<F,T> {
	T convert(F from);
}
