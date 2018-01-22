package org.xendra.report;

import java.util.HashMap;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class MyImplementation implements JRDataSource {

	private static final String[] namearray = {"uno","dos"};
	private static final Integer[] agearray = {20,23};
	private int counter = -1;
	private HashMap<String, Integer> fieldnumber = new HashMap<String, Integer>();
	private int lastFieldsAdded = 0;
	
	public boolean next() throws JRException {
		if (counter<namearray.length-1) {
			counter++;
			return true;
		}
		return false;
	}

	public Object getFieldValue(JRField jrfield) throws JRException {
		Integer fieldIndex;
		if (fieldnumber.containsKey(jrfield.getName()))
			fieldIndex = fieldnumber.get(jrfield.getName());
		else
		{
			fieldnumber.put(jrfield.getName(), lastFieldsAdded);
			fieldIndex = lastFieldsAdded;
			lastFieldsAdded ++;
		}
		if (fieldIndex == 0) return namearray[counter];
		else if (fieldIndex == 1) return agearray[counter];
		return "";		
	}
	
	public Object getFieldValue2(JRField jrField) throws JRException {
		if (jrField.getName().equals("Name")) return namearray[counter];
		else if (jrField.getName().equals("Age")) return agearray[counter];
		return "";
	}
	
	public static JRDataSource getDataSource() {
		return new MyImplementation();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
