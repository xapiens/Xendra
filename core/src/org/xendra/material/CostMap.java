package org.xendra.material;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CostMap implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1477477445869383097L;
	private Integer AD_Client_ID = 0;
	public void setAD_Client_ID(int id) {
		AD_Client_ID = id;		
	}
	public Integer getAD_Client_ID() {
		return AD_Client_ID;
	}
	public static List<String> getHeaders() {
		List<String> test = new ArrayList<String>();
		test.add("test");
		return test;
	}
	public static Object[][] getData() {	
		Object[][] data = {{"test"},{"test2"}};
		return data;
	}
}
