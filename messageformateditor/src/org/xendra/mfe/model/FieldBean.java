package org.xendra.mfe.model;

public class FieldBean {
	String area;
	String name;
	Boolean mandatory;
	Integer sequence;
	String columnid = "";
	String tableid = "";
	Boolean key;
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getMandatory() {
		return mandatory;
	}
	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public String getColumnid() {
		return columnid;
	}
	public void setColumnid(String var) {
		if (var != null)
			columnid = var;
	}	
	public String getTableid() {
		return tableid;
	}
	public void setTableid(String var) {
		if (var != null)
			tableid = var;
	}
	public Boolean getKey() {
		return key;
	}
	public void setKey(Boolean key) {
		this.key = key;
	}
}