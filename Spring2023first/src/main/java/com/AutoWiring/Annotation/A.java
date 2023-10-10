package com.AutoWiring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	
	private int x;
	
	private B obj;


	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the obj
	 */
	public B getObj() {
		return obj;
	}


	/**
	 * @param obj the obj to set
	 */
	
	public void setObj(B obj) {
		this.obj = obj;
	}

	@Autowired
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
