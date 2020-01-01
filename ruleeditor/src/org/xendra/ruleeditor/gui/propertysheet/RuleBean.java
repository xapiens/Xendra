package org.xendra.ruleeditor.gui.propertysheet;

public class RuleBean {
	String name;
	String sessionname = "";
	Boolean lockout;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getLockout() {
		return lockout;
	}
	public void setLockout(Boolean lockout) {
		this.lockout = lockout;
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
