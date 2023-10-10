package com.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

	public static void main(String[] args) {
		
		
	 ApplicationContext context	= new ClassPathXmlApplicationContext("com/AutoWiring/AutoConfig.xml");
     
	
	 A a =  context.getBean("a",A.class);
	  
	 System.out.println(a);
	// System.out.println(a);
	}

}
