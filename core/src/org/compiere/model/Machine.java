package org.compiere.model;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;

import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;

public class Machine extends X_A_Machine {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1640887122711952620L;

	public Machine(Properties ctx, int A_Machine_ID, String trxName) {
		super(ctx, A_Machine_ID, trxName);
	}

	public Machine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
	
	public Integer getIntProperty(String PropertyName)
	{
		Integer intvalue = 0;
		String value = (String) getProperties().get(PropertyName);
		if (value != null)
			intvalue = Integer.valueOf(value);
		return intvalue;
	}
	public void setIntProperty(String PropertyName, Integer value) {
		String val = String.valueOf(value);
		HashMap prop = getProperties();
		prop.put(PropertyName, val);
		setProperties(prop);
		save();
	}
	public String toString()
	{		
		return getName();
	}
		
}
