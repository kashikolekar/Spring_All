package com.Singleton;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Student {
	
	
	/**
	 * @return the studentName
	 */
	private Samosa sam;
	public Student(Samosa sam) {
		super();
		this.sam = sam;
	}
	/**
	 * @return the sam 
	 */
	public Samosa getSam() {
		return sam;
	}
	/**
	 * @param sam the sam to set
	 */
	public void setSam(Samosa sam) {
		this.sam = sam;
	}
	/**
	 * @param studentName the studentName to set

	/**
	 * @return the city
	 */


	public void Study()
	{
		System.out.println("hiii first");
		this.sam.Display();
	}
	
	
	

}
