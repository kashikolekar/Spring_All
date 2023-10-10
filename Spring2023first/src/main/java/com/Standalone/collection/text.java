package com.Standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class text {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Standalone/collection/AlonConfig.xml");
		  A a = (A) context.getBean("a");
		  A b = (A) context.getBean("a");
		  System.out.println(a);
		  System.out.println(a.getList().getClass().getName());
		  System.out.println(a.getMap().getClass().getName());
		  
		  System.out.println(a.getList());
		  System.out.println(a.getMap());
		  System.out.println(a.getP());
		  System.out.println(a.hashCode());
		  System.out.println(b.hashCode());
		  SpelExpressionParser temp = new SpelExpressionParser();
		 Expression ex = temp.parseExpression("22+44");
		 System.out.println(ex.getValue());
		 
	}

}
