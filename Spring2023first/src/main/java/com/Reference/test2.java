package com.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

	public static void main(String[] args) {
		
		
	 ApplicationContext context	= new ClassPathXmlApplicationContext("com/Reference/RefConfig.xml");
     
	
	 A a = (A) context.getBean("a");
	  
	 System.out.println(a.getX());
	 System.out.println(a.getObj().getY());
	}

}
