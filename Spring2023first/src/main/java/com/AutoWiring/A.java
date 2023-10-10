  package com.AutoWiring;

public class A {

	private int x;
	private B obj;


	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public A(int x, B obj) {
		super();
		
		this.x = x;
		this.obj = obj;
		System.out.println(" in constuctor");
	}
	@Override
	public String toString() {
		return "A [x=" +x + ", obj=" + obj + "]";
	}
	
}
