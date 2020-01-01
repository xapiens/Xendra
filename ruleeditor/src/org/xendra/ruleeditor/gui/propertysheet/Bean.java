package org.xendra.ruleeditor.gui.propertysheet;

import java.util.ArrayList;
import java.util.List;

import org.compiere.model.persistence.X_AD_Process;
import org.xendra.Constants;
//import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.Bean;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.BehaviorEditor;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.ProcessingMode;
import org.xendra.ruleeditor.gui.propertysheet.PropertySheetPage.RuleTypeEditor;

import com.l2fprod.common.beans.BaseBeanInfo;

public class Bean {		
	String name;
	String category;
	String agenda;
	boolean isdefault;
	String packagename;
	String sessionname;
	String EqualsBehavior;
	String EventProcessingMode;
	String RuleType;
	String queuename;
	String EntryPoint;
	List<DocBase> docbasetype = new ArrayList<DocBase>();
	String docsubtype;
	String queuelistenerclass;
	String identifier;
	long synchro;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
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
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public String getSessionname() {
		return sessionname;
	}
	public void setSessionname(String sessionname) {
		this.sessionname = sessionname;
	}
	public String getEqualsBehavior() {
		return EqualsBehavior;
	}
	public void setEqualsBehavior(String equalsBehavior) {
		EqualsBehavior = equalsBehavior;
	}
	public String getEventProcessingMode() {
		return EventProcessingMode;
	}
	public void setEventProcessingMode(String eventProcessingMode) {
		EventProcessingMode = eventProcessingMode;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getEntryPoint() {
		return EntryPoint;
	}
	public void setEntryPoint(String entryPoint) {
		EntryPoint = entryPoint;
	}
	public String getRuleType() {
		return RuleType;
	}
	public void setRuleType(String ruleType) {
		RuleType = ruleType;
	}		
	public String getQueuename() {
		return queuename;
	}
	public void setQueuename(String queuename) {
		this.queuename = queuename;
	}		
	public void setDocbasetype(List<DocBase> docbasetype) {
		this.docbasetype = docbasetype;
	}
	public List<DocBase> getDocbasetype() {
		return docbasetype;
	}	
	public String getDocsubtype() {
		return docsubtype;
	}
	public void setDocsubtype(String docsubtype) {
		this.docsubtype = docsubtype;
	}
	public String getQueuelistenerclass() {
		return queuelistenerclass;
	}
	public void setQueuelistenerclass(String queuelistenerclass) {
		this.queuelistenerclass = queuelistenerclass;
	}
	public long getSynchro() {
		return synchro;
	}
	public void setSynchro(long synchro) {
		this.synchro = synchro;
	}				
	public String toString() {
		return "[name=" + getName() + "]";
	}
}
