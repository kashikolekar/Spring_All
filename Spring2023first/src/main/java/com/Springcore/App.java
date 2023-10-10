package com.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      ApplicationContext context =  new ClassPathXmlApplicationContext("Config.xml");
        
      
       BeanOrPojo std1   =  (BeanOrPojo) context.getBean("student1");
       
       
      System.out.println(std1);
    }
}
