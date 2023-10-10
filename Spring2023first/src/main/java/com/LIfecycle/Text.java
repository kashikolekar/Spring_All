package com.LIfecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 AbstractApplicationContext context = new  ClassPathXmlApplicationContext("com/LIfecycle/ConfigLifecycle.xml");
	 Samosa s1 = (Samosa) context.getBean("sam");
	 System.out.println(s1);
	 
	 context.registerShutdownHook();

	}

}
