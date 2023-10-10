package com.LifecycleUsingIntegrface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifecycleUsingIntegrface/usingInterfaceLifecycle.xml");
		Pepsi p = (Pepsi) context.getBean("pe");
		System.out.println(p);
		context.destroy();
	}

}
