package com.Spring.JDBC;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@ComponentScan(basePackages = {"com.Spring.JDBC.deo"})
public class JDBC_Config {

	@Bean("bean2")
	public DataSource getDataSource()
	{
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Ihsak@123");
		return ds;
		
	}
	
	@Bean("bean1")
	public JdbcTemplate getTemplate()
	{
	  JdbcTemplate jdbcTemplate = new JdbcTemplate();
	  jdbcTemplate.setDataSource(getDataSource());
	  return jdbcTemplate;
	}
	
	/*@Bean("bean3")
	public StudentSDao getStudentSDao()
	{
		studentDaoImple stuDao = new studentDaoImple();
		stuDao.setTemp(getTemplate());
		return stuDao;
	}*/
}
