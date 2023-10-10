package com.LifecycleUsingIntegrface;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exam {
	private String sub;

	/**
	 * @return the sub
	 */
	public String getSub() {
		return sub;
	}

	/**
	 * @param sub the sub to set
	 */
	public void setSub(String sub) {
		this.sub = sub;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Exam [sub=" + sub + "]";
	}
	
	@PostConstruct
	public void starting()
	{
		System.out.println("init method");
	}
	@PreDestroy
	public void ending()
	{
		System.out.println("destroy method 2");
	}
	
}
