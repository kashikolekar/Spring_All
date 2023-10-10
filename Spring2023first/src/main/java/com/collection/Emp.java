package com.collection;

import java.util.*;

public class Emp {
 
	private String name;
	private List<String> phones;
	private Set<String> add;
	private Map<String, String> cou;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phones
	 */
	public List<String> getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	/**
	 * @return the add
	 */
	public Set<String> getAdd() {
		return add;
	}
	/**
	 * @param add the add to set
	 */
	public void setAdd(Set<String> add) {
		this.add = add;
	}
	/**
	 * @return the cou
	 */
	public Map<String, String> getCou() {
		return cou;
	}
	/**
	 * @param cou the cou to set
	 */
	public void setCou(Map<String, String> cou) {
		this.cou = cou;
	}
	public Emp(String name, List<String> phones, Set<String> add, Map<String, String> cou) {
		super();
		this.name = name;
		this.phones = phones;
		this.add = add;
		this.cou = cou;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
