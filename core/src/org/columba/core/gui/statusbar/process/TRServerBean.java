package org.columba.core.gui.statusbar.process;

public class TRServerBean implements ServerBean {
	Integer port;
	Boolean enabled;
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
