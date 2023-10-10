package com.Constructor;

public class person {
	
	private  String name;
	private int per_id;
	private C obj;
	public person(String name, int per_id, C obj) {
		
		this.name = name;
		this.per_id = per_id;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "person [name = " + this.name + ", per_id = " + this.per_id +  this.obj +"]";
	}
	
}
