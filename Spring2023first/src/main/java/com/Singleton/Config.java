package com.Singleton;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
public class Config {
	@Bean
	public Samosa getsobj()
	{
		return new Samosa();
	}
	
	@Bean
	public Student getobj()
	{
		Student student = new Student(getsobj());
		return student;
	}

}
