package com.annotation.StandAlone;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu")
@Scope("prototype")
public class Student {
	@Value("Kashinath")
	private String studentName;
	@Value("Shirala")
	private String city;
	
	@Value("#{temp1}")
	private List<String> add;

	
	
	
	/**
	 * @return the add
	 */
	public List<String> getAdd() {
		return add;
	}


	/**
	 * @param add the add to set
	 */
	public void setAdd(List<String> add) {
		this.add = add;
	}


	public String getStudentName() {
		return studentName;
	}
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", add=" + add + "]";
	}
	

}
