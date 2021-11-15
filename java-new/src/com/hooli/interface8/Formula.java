/**
 * <p>Title: Formula.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年10月21日
 * @author 德
 */
package com.hooli.interface8;

/**
 * <p>Title: Formula.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年10月21日
 * @author 德
 */
public interface Formula {
	double calculate(int a);
	
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
