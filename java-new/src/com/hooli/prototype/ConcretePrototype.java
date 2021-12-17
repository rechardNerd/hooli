/**
 * <p>Title: ConcretePrototype.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
package com.hooli.prototype;

/**
 * <p>Title: ConcretePrototype.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年11月17日
 * @author 德
 */
public class ConcretePrototype extends Prototype{
	
	private String filed;
	
	public ConcretePrototype(String filed) {
		this.filed = filed;
	}


	@Override
	Prototype myClone() {
		return new ConcretePrototype(filed);
	}

	@Override
	public String toString() {
		return filed;
	}
}
