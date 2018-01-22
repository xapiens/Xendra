package org.columba.api.plugin;

import java.sql.Timestamp;

public class ExtensionMenuItem {
	String Name = "";
	String Description = "";
	Boolean IsSummary;
	Boolean IsSOTrx;
	Boolean IsReadOnly;
	String Parent_ID;
	String Identifier;
	String Action = "";
	String EntityType = "";
	String AD_Process_ID = "";
	Integer AD_Window_ID = 0;
	Integer AD_Menu_ID = 0;
	String FormIdentifier = "";
	Integer ID = 0;
	int Level;
	Timestamp Synchronized;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Boolean getIsSummary() {
		return IsSummary;
	}
	public void setIsSummary(Boolean isSummary) {
		IsSummary = isSummary;
	}
	public Boolean getIsSOTrx() {
		return IsSOTrx;
	}
	public void setIsSOTrx(Boolean isSOTrx) {
		IsSOTrx = isSOTrx;
	}
	public Boolean getIsReadOnly() {
		return IsReadOnly;
	}
	public void setIsReadOnly(Boolean isReadOnly) {
		IsReadOnly = isReadOnly;
	}
	public String getParent_ID() {
		return Parent_ID;
	}
	public void setParent_ID(String parent_ID) {
		Parent_ID = parent_ID;
	}
	public String getIdentifier() {
		return Identifier;
	}
	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}
	public Timestamp getSynchronized() {
		return Synchronized;
	}
	public void setSynchronized(Timestamp synchronized1) {
		Synchronized = synchronized1;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
		if (Action == null)
			Action = "";
	}
	public String getAD_Process_ID() {
		return AD_Process_ID;
	}
	public void setAD_Process_ID(String Process_ID) {
		if (Process_ID == null)
			Process_ID = "";
		AD_Process_ID = Process_ID;
	}
	public Integer getAD_Window_ID() {
		return AD_Window_ID;
	}
	public void setAD_Window_ID(Integer Window_ID) {
		AD_Window_ID = Window_ID;
	}	
	public Integer getAD_Menu_ID() {
		return AD_Menu_ID;
	}
	public void setAD_Menu_ID(Integer aD_Menu_ID) {
		AD_Menu_ID = aD_Menu_ID;
	}
	public String getEntityType() {
		return EntityType;
	}
	public void setEntityType(String entityType) {
		EntityType = entityType;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public void setAD_Form_ID(String identifier) {
		FormIdentifier = identifier;		
	}		
	public String getAD_Form_ID() {
		return FormIdentifier;		
	}			
}
