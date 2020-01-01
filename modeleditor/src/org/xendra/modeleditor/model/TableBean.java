package org.xendra.modeleditor.model;

import java.sql.Timestamp;

import org.compiere.util.KeyNamePair;
import org.compiere.util.NamePair;
import org.compiere.util.ValueNamePair;

public class TableBean {
	String name;
	String description;
	String help;
	NamePair EntityType;
	String TableName;
	NamePair AccessLevel;
	NamePair AD_Window_ID;
	NamePair AD_Val_Rule_ID;
	Integer LoadSeq;
	boolean IsSecurityEnabled;
	boolean IsDeleteable;
	boolean IsHighVolume;
	boolean IsChangeLog;
	NamePair ReplicationType;
	NamePair PO_Window_ID;
	Timestamp Synchronized;
	String ID;
	Integer AD_Table_ID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	public NamePair getEntityType() {
		return EntityType;
	}
	public void setEntityType(NamePair entityType) {
		EntityType = entityType;
	}
	public String getTableName() {
		return TableName;
	}
	public void setTableName(String tableName) {
		TableName = tableName;
	}
	public NamePair getAccessLevel() {
		return AccessLevel;
	}
	public void setAccessLevel(NamePair accessLevel) {
		AccessLevel = accessLevel;
	}
	public NamePair getAD_Window_ID() {
		return AD_Window_ID;
	}
	public void setAD_Window_ID(NamePair aD_Window_ID) {
		AD_Window_ID = aD_Window_ID;
	}
	public NamePair getAD_Val_Rule_ID() {
		return AD_Val_Rule_ID;
	}
	public void setAD_Val_Rule_ID(NamePair aD_Val_Rule_ID) {
		AD_Val_Rule_ID = aD_Val_Rule_ID;
	}
	public Integer getLoadSeq() {
		return LoadSeq;
	}
	public void setLoadSeq(Integer loadSeq) {
		LoadSeq = loadSeq;
	}	
	public Boolean getIsSecurityEnabled() {
		return IsSecurityEnabled;
	}
	public void setIsSecurityEnabled(Boolean sec) {
		IsSecurityEnabled = sec;
	}
	public Boolean getIsDeleteable() {
		return IsDeleteable;
	}
	public void setIsDeleteable(Boolean del) {
		IsDeleteable = del;
	}
	public Boolean getIsHighVolume() {
		return IsHighVolume;
	}
	public void setIsHighVolume(Boolean high) {
		IsHighVolume = high;
	}		
	public Boolean getIsChangeLog() {
		return IsChangeLog;
	}
	public void setIsChangeLog(Boolean change) {
		IsChangeLog = change;
	}
	public NamePair getReplicationType() {
		return ReplicationType;
	}
	public void setReplicationType(NamePair replicationType) {
		ReplicationType = replicationType;
	}
	public NamePair getPO_Window_ID() {
		return PO_Window_ID;
	}
	public void setPO_Window_ID(NamePair po) {
		PO_Window_ID = po;
	}
	public Timestamp getSynchronized() {
		return Synchronized;
	}
	public void setSynchronized(Timestamp synchronized1) {
		Synchronized = synchronized1;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Integer getAD_Table_ID() {
		return AD_Table_ID;
	}
	public void setAD_Table_ID(Integer aD_Table_ID) {
		AD_Table_ID = aD_Table_ID;
	}	
}