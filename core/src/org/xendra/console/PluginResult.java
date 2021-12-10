package org.xendra.console;

import java.sql.Timestamp;

public class PluginResult {
	String error = "";
	Timestamp Lastupdate;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Timestamp getLastupdate() {
		return Lastupdate;
	}
	public void setLastupdate(Timestamp lastupdate) {
		Lastupdate = lastupdate;
	}	
}
