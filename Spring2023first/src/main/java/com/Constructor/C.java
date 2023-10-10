package com.Constructor;

public class C {

	 private String last_name;
	 private String mid_name;
long n ;
	public C(String last_name, String mid_name,long n) {
		super();
		this.last_name = last_name;
		this.mid_name = mid_name;
		this.n=n;
	}
	
	  @Override public String toString() { return "   C [last_name =" + this.last_name + ", mid_name = " + this.mid_name + "  n ="+this.n+"]"; }
	 
	
	
	
	
	
}
