package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.model.MQuery;
import org.compiere.util.NamePair;

public class ModelBean {
	String name;
	String Classname;
	MQuery filter;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return Classname;
	}
	public void setClassname(String classname) {
		Classname = classname;
	}
	public MQuery getFilter() {
		return filter;
	}
	public void setFilter(MQuery filter) {
		this.filter = filter;
	}
}
