package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context =	new ClassPathXmlApplicationContext("com/collection/CollectionConfig.xml");
		
		Emp emp1 =(Emp) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getAdd());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getCou());
	}

}
