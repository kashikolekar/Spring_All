package com.Spring.JDBC.deo;

import java.util.List;

import com.Spring.JDBC.entity.Student;

public interface StudentSDao {
	
	public int insert(Student student);
	public int change(Student student);
    public int delete(int id);
    public Student getStudent(int id);
    
    public List<Student> getAll_Data();
}
