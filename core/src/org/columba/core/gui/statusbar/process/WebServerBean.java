package org.columba.core.gui.statusbar.process;

import org.compiere.util.NamePair;

public class WebServerBean  implements ServerBean {
	Integer port;
	Integer secureport;
	String certificate;
	NamePair AD_Client_ID;
	Boolean enabled;
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
}
