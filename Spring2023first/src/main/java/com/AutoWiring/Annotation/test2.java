package com.AutoWiring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

	public static void main(String[] args) {
		
		
		ApplicationContext context	= new ClassPathXmlApplicationContext("com/AutoWiring/Annotation/AutoConfig.xml");
     
	
	 A m =  (A) context.getBean("kashi");
	  
	 System.out.println(m);
	// System.out.println(a);
	}

}
