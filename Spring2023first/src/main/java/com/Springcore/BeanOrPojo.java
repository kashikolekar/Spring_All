package com.Springcore;

public class BeanOrPojo {

	
	private int Studentid;
	private String student_name;
	private String StudentAdd;
	
	
	
	
	
	
	public BeanOrPojo() {
		super();
		
	}
	
	
	
	
	
	
	public BeanOrPojo(int studentid, String student_name, String studentAdd) {
		super();
		Studentid = studentid;
		this.student_name = student_name;
		StudentAdd = studentAdd;
	}
	
	
	
	
	
	public int getStudentid() {
		return Studentid;
	}
	/**
	 * @param studentid the studentid to set
	 */
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return student_name;
	}
	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	/**
	 * @return the studentAdd
	 */
	public String getStudentAdd() {
		return StudentAdd;
	}
	/**
	 * @param studentAdd the studentAdd to set
	 */
	public void setStudentAdd(String studentAdd) {
		StudentAdd = studentAdd;
	}






	@Override
	public String toString() {
		return "BeanOrPojo [Studentid=" + Studentid + ", student_name=" + student_name + ", StudentAdd=" + StudentAdd
				+ "]";
	}
	
	
	
	
}
