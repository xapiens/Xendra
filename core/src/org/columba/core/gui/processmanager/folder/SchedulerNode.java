package org.columba.core.gui.processmanager.folder;

import java.sql.Timestamp;
import java.util.List;

import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_AD_Scheduler_Para;
import org.compiere.util.Env;
import org.compiere.util.NamePair;

public class SchedulerNode extends ProcessNode {
	Integer AD_Scheduler_ID;
	Timestamp datenextrun;
	Timestamp datelastrun;
	//String FrequencyType;
	NamePair FrequencyType;
	Integer Frequency;
	Integer FrequencyStartAt;
	String Tag;

	public SchedulerNode(X_AD_Scheduler scheduler) {
		setName(scheduler.getName());
		setAD_Scheduler_ID(scheduler.getAD_Scheduler_ID());
		setDatelastrun(scheduler.getDateLastRun());
		setDatenextrun(scheduler.getDateNextRun());
		setFrequency(scheduler.getFrequency());
		
		MColumn column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Scheduler.Table_Name, X_AD_Scheduler.COLUMNNAME_FrequencyType, null));
		Lookup lkfqtype = MLookupFactory.get(Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());
		//setAD_Rule_ID(lkrules.get(proc.getAD_Rule_ID()));
		setFrequencyType(lkfqtype.get(scheduler.getFrequencyType()));
		//schedulernode.setFrequencyType(scheduler.getFrequencyType());
		setTag(scheduler.getTag());
		setActive(scheduler.isActive());
		loadChildrens();
	}

	private void loadChildrens() {
		List<X_AD_Scheduler_Para> params = new Query(Env.getCtx(), X_AD_Scheduler_Para.Table_Name, "AD_Scheduler_ID = ?", null)
		.setParameters(AD_Scheduler_ID).list();
		for (X_AD_Scheduler_Para para:params) {
			SchedulerParaNode sp = new SchedulerParaNode(para);
			this.add(sp);
		}		
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
	//	public String getFrequencyType() {
	//		return FrequencyType;
	//	}
	//
	//	public void setFrequencyType(String frequencyType) {		
	//		FrequencyType = frequencyType;
	//	}
	public Integer getFrequency() {
		return Frequency;
	}
	public NamePair getFrequencyType() {
		return FrequencyType;
	}
	public void setFrequencyType(NamePair frequencyType) {
		FrequencyType = frequencyType;
	}

	public void setFrequency(Integer frequency) {
		Frequency = frequency;
	}	
	public Integer getFrequencyStartAt() {
		return FrequencyStartAt;
	}
	public void setFrequencyStartAt(Integer frequencyStartAt) {
		FrequencyStartAt = frequencyStartAt;
	}
	public String getTag() {
		return Tag;
	}

	public void setTag(String tag) {
		Tag = tag;
	}		
	public Integer getAD_Scheduler_ID() {
		return AD_Scheduler_ID;
	}

	public void setAD_Scheduler_ID(Integer aD_Scheduler_ID) {
		AD_Scheduler_ID = aD_Scheduler_ID;
	}	
	public String toString ()
	{
		return getName();
	}
}
