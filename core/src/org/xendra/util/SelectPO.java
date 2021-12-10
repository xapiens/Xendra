package org.xendra.util;

import java.util.HashMap;

public class SelectPO {
	String tablename = "";
	String alias = "";
	String where = "";
	Integer field = 0;
	HashMap<Integer, String> fields = new HashMap<Integer, String>();
	HashMap<Integer, Object> fieldsexpr = new HashMap<Integer, Object>();
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public String getTablename() {
		return tablename;
	}	
	public void setField(String name) {		
		fields.put(field, name);
		field++;
	}
	public void setFieldExpr(Object expr) {
		fieldsexpr.put(field, expr);
		field++;
	}		
	public int getLength() {
		return field;
	}
	public void setAlias(String alias) {
		this.alias = alias;	
	}	
	public String getAlias() {
		return alias;
	}
	public String getField(int i) {
		String name = "";
		if (fields.containsKey(i))
			name = fields.get(i);
		else if (fieldsexpr.containsKey(i)) {
			Object var = fieldsexpr.get(i);
			if (var instanceof String)
				name = String.format("'%s'", var);
			else if (var instanceof Integer){
				name = String.valueOf(var);				
			} else {
				System.out.println("X");
			}
		}
		return name;
	}
	public void setWhere(String where) {
		this.where = where;		
	}	
	public String getWhere() {
		return where;
	}
}
