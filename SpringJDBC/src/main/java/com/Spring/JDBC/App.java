package com.Spring.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.JDBC.deo.StudentSDao;
import com.Spring.JDBC.deo.studentDaoImple;
import com.Spring.JDBC.entity.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static  void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Spring jdbc
        ApplicationContext context = new AnnotationConfigApplicationContext(JDBC_Config.class);
    
  StudentSDao stuDao =     context.getBean("bean3",StudentSDao.class);
  
  //Student student = new Student(666,"Sharavani","shirala");
 /* Student student = new Student();
  student.setId(100);
  student.setCity("Shirala");
  student.setName("Ajit");
     int res = stuDao.change(student);
  
 */
  
 // int res = stuDao.delete(10);
  
  //Student student = stuDao.getStudent(666);
   List<Student> student = stuDao.getAll_Data();
  
           //   int res=  stuDao.insert(student);   
           for(Student s:student)
           {
        	   System.out.println(s);
           }
    }
}
