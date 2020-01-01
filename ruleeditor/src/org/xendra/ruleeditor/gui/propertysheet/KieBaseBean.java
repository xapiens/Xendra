package org.xendra.ruleeditor.gui.propertysheet;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.compiere.util.NamePair;
import org.compiere.util.ValueNamePair;

public class KieBaseBean {
	String name;
	String category = "";
	String agenda = "";
	boolean isdefault;
	String packagename = "";
	String sessionname = "";	
	String EqualsBehavior;
	String EventProcessingMode;
	NamePair RuleType;
	String queuename = "";
	String entrypoint  = "";
	NamePair docbasetype;
	NamePair docsubtype;
	String queuelistenerclass = "";
	String identifier;
	NamePair group;
	Timestamp synchronize;
	Boolean lockout;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String val) {
		if (val == null)
			return;		
		this.category = val;
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String val) {
		if (val == null)
			return;		
		this.agenda = val;
	}
	public boolean isIsdefault() {
		return isdefault;
	}
	public void setIsdefault(boolean isdefault) {
		this.isdefault = isdefault;
	}
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String val) {
		if (val == null)
			return;		
		this.packagename = val;
	}
	public String getSessionname() {
		return sessionname;
	}
	public void setSessionname(String val) {
		if (val == null)
			return;		
		this.sessionname = val;
	}
	public String getEqualsBehavior() {
		return EqualsBehavior;
	}
	public void setEqualsBehavior(String val) {
		if (val == null)
			return;		
		EqualsBehavior = val;
	}
	public String getEventProcessingMode() {
		return EventProcessingMode;
	}
	public void setEventProcessingMode(String val) {
		if (val == null)
			return;		
		EventProcessingMode = val;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getEntrypoint() {
		return entrypoint;
	}
	public void setEntrypoint(String val) {
		if (val == null)
			return;
		this.entrypoint = val;
	}
	public String getQueuename() {
		return queuename;
	}
	public void setQueuename(String val) {
		if (val == null)
			return;		
		this.queuename = val;
	}	
	public NamePair getRuleType() {
		return RuleType;
	}
	public void setRuleType(NamePair val) {
		if (val == null)
			return;		
		RuleType = val;
	}
	public NamePair getDocbasetype() {
		return docbasetype;
	}
	public void setDocbasetype(NamePair val) {
		if (val == null)
			return;		
		docbasetype = val;
	}
	public NamePair getDocsubtype() {
		return docsubtype;
	}
	public void setDocsubtype(NamePair val) {
		if (val == null)
			return;		
		docsubtype = val;
	}
	public String getQueuelistenerclass() {
		return queuelistenerclass;
	}
	public void setQueuelistenerclass(String val) {
		if (val == null)
			return;		
		this.queuelistenerclass = val;
	}	
	public Timestamp getSynchronize() {
		return synchronize;
	}
	public void setSynchronize(Timestamp synchronize) {
		this.synchronize = synchronize;
	}
	public String toString() {
		return "[name=" + getName() + "]";
	}
	public NamePair getGroup() {
		return group;
	}
	public void setGroup(NamePair val) {
		if (val == null)
			return;		
		this.group = val;
	}
	public Boolean getLockout() {
		return lockout;
	}
	public void setLockout(Boolean lockout) {
		this.lockout = lockout;
	}	
}
