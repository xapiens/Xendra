package org.xendra.rules;

import java.sql.Timestamp;

public class ServerProcessInfo {
	Timestamp dateLastRun;
	Timestamp dateNextRun;
	String FrequencyType;
	Integer Frequency;
	String Name;
	String TableName;
	Integer Supervisor_ID;
	Integer Record_ID;
	Integer A_Machine_ID;
	boolean active;
	public Timestamp getDateLastRun() {
		return dateLastRun;
	}
	public void setDateLastRun(Timestamp dateLastRun) {
		this.dateLastRun = dateLastRun;
	}
	public Timestamp getDateNextRun() {
		return dateNextRun;
	}
	public void setDateNextRun(Timestamp dateNextRun) {
		this.dateNextRun = dateNextRun;
	}
	public String getFrequencyType() {
		return FrequencyType;
	}
	public void setFrequencyType(String frequencyType) {
		FrequencyType = frequencyType;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getSupervisor_ID() {
		return Supervisor_ID;
	}
	public void setSupervisor_ID(Integer supervisor_ID) {
		Supervisor_ID = supervisor_ID;
	}
	public Integer getFrequency() {
		return Frequency;
	}
	public void setFrequency(Integer frequency) {
		Frequency = frequency;
	}
	public String getTableName() {
		return TableName;
	}
	public void setTableName(String tableName) {
		TableName = tableName;
	}
	public Integer getRecord_ID() {
		return Record_ID;
	}
	public void setRecord_ID(Integer record_ID) {
		Record_ID = record_ID;
	}
	public Integer getA_Machine_ID() {
		return A_Machine_ID;
	}
	public void setA_Machine_ID(Integer a_Machine_ID) {
		A_Machine_ID = a_Machine_ID;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}		
}
