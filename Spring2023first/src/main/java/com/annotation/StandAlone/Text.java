package com.annotation.StandAlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/StandAlone/StereotypeConfig.xml");
		Student s =context.getBean("stu",Student.class);
		System.out.println(s);
		System.out.println(s.getAdd());
	}

}
 