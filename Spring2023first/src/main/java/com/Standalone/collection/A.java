package com.Standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class A {
	
	private List<String> list;
    private Map<String,Integer> map; 
	private Properties p;
	
    
    
	/**
	 * @return the p
	 */
	public Properties getP() {
		return p;
	}

	/**
	 * @param p the p to set
	 */
	public void setP(Properties p) {
		this.p = p;
	}

	/**
	 * @return the map
	 */
	public Map<String, Integer> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "A [list=" + list + ", map=" + map + ", p=" + p + "]";
	}

}
