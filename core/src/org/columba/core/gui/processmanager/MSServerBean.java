package org.columba.core.gui.processmanager;

import org.compiere.util.NamePair;


public class MSServerBean implements ServerBean {
	int A_Machine_ID;
	Integer port;
	String Alias;
	Boolean IsDefault;
	NamePair Identifier;
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public int getA_Machine_ID() {
		return A_Machine_ID;
	}
	public void setA_Machine_ID(int a_Machine_ID) {
		A_Machine_ID = a_Machine_ID;
	}
	public NamePair getIdentifier() {
		return Identifier;
	}
	public void setIdentifier(NamePair identifier) {
		Identifier = identifier;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}
	public Boolean getIsDefault() {
		return IsDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		IsDefault = isDefault;
	}	
}
