package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text3 {

	public static void main(String[] args) {
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/Constructor/ConstructorConfig.xml");
	
	 person per =(person) context.getBean("person");
	 
	 System.out.println(per.toString());
	 
	Addition add = (Addition) context.getBean("add");
	add.dosum();

	}

}
