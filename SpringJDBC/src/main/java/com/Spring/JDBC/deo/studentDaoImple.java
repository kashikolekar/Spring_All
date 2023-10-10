package com.Spring.JDBC.deo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.Spring.JDBC.entity.Student;

@Component("bean3")
public class studentDaoImple implements StudentSDao {

	@Autowired
	private JdbcTemplate temp;
	
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String q = "insert into student(id,name,city) values(?,?,?)";
	   int r=    this.temp.update(q,student.getId(),student.getName(),student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		String q = "update student set name=?,city=? where id=?";
		int r = this.temp.update(q, student.getName(),student.getCity(),student.getId());
		
		return r;
	}
	
	@Override
	public int delete(int id) {
		String q = "delete from student where id=?";
		int r = this.temp.update(q,id);
		return r;
	} 

	
	@Override
	public Student getStudent(int id) {
		
		//select Single student data
		
		String q = "select * from student where id=?";
		
		RowMapper<Student>  rowMapper = new RowMapperImp();
		Student stu =this.temp.queryForObject(q,rowMapper,id);
		return stu;
	}
	
	
	//all data select
	@Override
	public List<Student> getAll_Data() {
		
		String  q = "select * from student";
		List<Student> student = this.temp.query(q,new RowMapperImp());
		return student;
	}
	
	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	





	

	

}
