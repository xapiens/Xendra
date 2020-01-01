package org.xendra.modeleditor.model;

import org.xendra.modeleditor.gui.propertysheet.TablePick;

public class TabBean {
	TablePick AD_Table_ID;
	String Name;
	public TablePick getAD_Table_ID() {
		return AD_Table_ID;
	}
	public void setAD_Table_ID(TablePick AD_Table_ID) {
		this.AD_Table_ID = AD_Table_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}	
}
