package org.columba.core.gui.processmanager;

public class MMServerBean implements ServerBean {
	int A_Machine_ID;
	Integer port;
	Boolean enabled;	
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
	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}	
}
