package com.spring.Dao;



import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Model.User;

@Repository
public class UserDao {


  /*private JdbcTemplate jdbcTemplate;


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
*/


	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Transactional("TM")
	public int saveUser(User user) {
		// TODO Auto-generated method stub
	/*	String sql = "insert into user(name,email,pass) values(?,?,?)";
		int i = jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getPass());

		*/


		int i = (Integer)hibernateTemplate.save(user);

		return i;

	}




}
