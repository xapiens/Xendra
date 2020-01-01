package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.util.NamePair;

public class FactBean {
	String name;
	NamePair Action;
	NamePair AD_Table_ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NamePair getAD_Table_ID() {
		return AD_Table_ID;
	}
	public void setAD_Table_ID(NamePair aD_Table_ID) {
		AD_Table_ID = aD_Table_ID;
	}
	public NamePair getAction() {
		return Action;
	}
	public void setAction(NamePair action) {
		Action = action;
	}	
}
