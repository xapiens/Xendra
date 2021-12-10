package org.columba.core.gui.processmanager;

import org.compiere.util.NamePair;

public class WebServerBean  implements ServerBean {
	int A_Machine_ID;
	Integer port = 0;
	Integer secureport = 0;
	String certificate;
	NamePair AD_Client_ID;
	Boolean IsDefault;
	Boolean enabled;	
	Boolean Synchronized;
	public int getA_Machine_ID() {
		return A_Machine_ID;
	}
	public void setA_Machine_ID(int a_Machine_ID) {
		A_Machine_ID = a_Machine_ID;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Integer getSecureport() {
		return secureport;
	}
	public void setSecureport(Integer secureport) {
		this.secureport = secureport;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public NamePair getAD_Client_ID() {
		return AD_Client_ID;
	}
	public void setAD_Client_ID(NamePair aD_Client_ID) {
		AD_Client_ID = aD_Client_ID;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Boolean getIsDefault() {
		return IsDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		IsDefault = isDefault;
	}
	public Boolean getSynchronized() {
		return Synchronized;
	}
	public void setSynchronized(Boolean synchronized1) {
		Synchronized = synchronized1;
	}	
}
