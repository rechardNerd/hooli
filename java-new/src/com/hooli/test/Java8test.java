/**
 * <p>Title: Java8test.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年10月21日
 * @author 德
 */
package com.hooli.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import com.hooli.interface8.Converter;
import com.hooli.interface8.Formula;
import com.hooli.interface8.Person;
import com.hooli.interface8.PersonFactory;
import com.hooli.interface8.Something;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>Title: Java8test.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>
 * @date 2021年10月21日
 * @author 德
 */
@Slf4j
public class Java8test {
	
	@Test
	public void testFormula() {
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a*100);
			}
		};
		double d1 = formula.calculate(100);
		double d2 = formula.sqrt(16);
		log.info("d1[{}],d2[{}]",d1,d2);
	}
	
	@Test
	public void lambdaExpressions() {
		List<String> names = Arrays.asList("peter","anna","mike","rechard");
		
		//first write method
		Collections.sort(names,new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		log.info("first[{}]",names.toString());
		//second
		Collections.sort(names,(String a,String b)->{
			return b.compareTo(a);
		});
		log.info("second[{}]",names.toString());
		//third
		Collections.sort(names, (String a, String b) -> a.compareTo(b));
		log.info("thired[{}]",names.toString());
	}
	
	@Test
	public void functionalInterface() {
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("0123");
		log.info("functionalInterface[{}]",converted);
	}
	
	@Test
	public void functinalInterfaceConstructor() {
		Converter<String,Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("0234");
		log.info("functinalInterfaceConstructor[{}]",converted);
	}
	
	@Test
	public void functionalInterfaceRef() {
		Something something = new Something();
		Converter<String,String> converter = something::startsWith;
		String converted = converter.convert("java");
		log.info("functionalInterfaceRef[{}]",converted);
		
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");
	}
}
