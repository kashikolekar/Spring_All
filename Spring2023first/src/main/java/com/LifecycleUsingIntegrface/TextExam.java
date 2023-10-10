package com.LifecycleUsingIntegrface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifecycleUsingIntegrface/usingInterfaceLifecycle.xml");
		   Exam  e = (Exam) context.getBean("exam");
		   System.out.println(e);
		   context.destroy();
	}

}
