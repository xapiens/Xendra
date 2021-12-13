package org.xendra.messages;

import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;

public class MessageField {
	String name;
	String area;
	boolean mandatory;
	Boolean key;
	Integer sequence;
	X_AD_Column column;
	X_AD_Table table;
	String tablename;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public boolean isMandatory() {
		return mandatory;
	}
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public Boolean getKey() {
		return key;
	}
	public void setKey(Boolean key) {
		this.key = key;
	}
	public X_AD_Column getColumn() {
		return column;
	}
	public void setColumn(X_AD_Column var) {
		this.column = var;
	}
	public X_AD_Table getTable() {
		return table;
	}
	public void setTable(X_AD_Table var) {
		this.table = var;
	}
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}	
}
