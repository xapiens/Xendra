package org.xendra.ruleeditor.gui.propertysheet;

import org.compiere.util.NamePair;

public class ChannelBean {
	String name;
	String sessionname = "";
	NamePair AD_MessageFormat_ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public NamePair getAD_MessageFormat_ID() {
		return AD_MessageFormat_ID;
	}
	public void setAD_MessageFormat_ID(NamePair aD_MessageFormat_ID) {
		AD_MessageFormat_ID = aD_MessageFormat_ID;
	}
	public String getSessionname() {
		return sessionname;
	}
	public void setSessionname(String val) {
		if (val == null)
			return;		
		this.sessionname = val;
	}		
}
