package com.Constructor;

public class Addition {

	private int a;
	private int b;
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println(" constructor is double ,double ");
	}
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println(" constructor is int ,int ");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println(" constructor is String ,String ");
	}
	
	public void dosum()
	{
		System.out.println("sum id ="+(this.a+this.b));
	}
	
	
	
}
