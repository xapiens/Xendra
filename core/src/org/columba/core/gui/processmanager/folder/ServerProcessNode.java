package org.columba.core.gui.processmanager.folder;

import java.sql.Timestamp;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.xendra.rules.ServerProcessInfo;

public class ServerProcessNode extends ProcessNode {
	Timestamp datenextrun;
	Timestamp datelastrun;
	String FrequencyType;
	Integer Frequency;
	private boolean active;
	
	public ServerProcessNode(ServerProcessInfo procserverinfo) {
		setA_Machine_ID(procserverinfo.getA_Machine_ID());
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(procserverinfo.getA_Machine_ID()).first();
		setName(procserverinfo.getName());
		setDatenextrun(procserverinfo.getDateNextRun());
		setDatelastrun(procserverinfo.getDateLastRun());
		setFrequencyType(procserverinfo.getFrequencyType());
		setFrequency(procserverinfo.getFrequency());
		setTableName(procserverinfo.getTableName());
		setRecord_ID(procserverinfo.getRecord_ID());
		setActive(procserverinfo.isActive());		
	}
	public Timestamp getDatenextrun() {
		return datenextrun;
	}

	public void setDatenextrun(Timestamp datenextrun) {
		this.datenextrun = datenextrun;
	}

	public Timestamp getDatelastrun() {
		return datelastrun;
	}
	public void setDatelastrun(Timestamp datelastrun) {
		this.datelastrun = datelastrun;
	}
	public String getFrequencyType() {
		return FrequencyType;
	}
	public void setFrequencyType(String frequencyType) {		
		FrequencyType = frequencyType;
	}
	public Integer getFrequency() {
		return Frequency;
	}
	public void setFrequency(Integer frequency) {
		Frequency = frequency;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
