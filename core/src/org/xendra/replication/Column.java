package org.xendra.replication;

public class Column {
	String name;
	String type;
	Object value;
	int AD_Reference_ID;
	String referenceid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getReferenceid() {
		return referenceid;
	}
	public void setReferenceid(String referenceid) {
		this.referenceid = referenceid;
	}
	public int getAD_Reference_ID() {
		return AD_Reference_ID;
	}
	public void setAD_Reference_ID(int aD_Reference_ID) {
		AD_Reference_ID = aD_Reference_ID;
	}	
}
