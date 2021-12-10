package org.columba.core.gui.processmanager.folder;

import java.sql.Timestamp;
import java.util.HashMap;

import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.NamePair;
import org.compiere.util.ValueNamePair;

public class MaterialPolicyNode extends ProcessNode {
	Integer M_MaterialPolicy_ID;
	Integer AD_Process_ID;
	Timestamp StartDate;	
	String Name;
	Boolean IsSyncStorage;
	Boolean Synchronized;
	NamePair M_CostElement_ID;
	public MaterialPolicyNode(X_M_MaterialPolicy p) {
		setName(p.getName());		
		MColumn adcolumn = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_M_MaterialPolicy.Table_Name, X_M_MaterialPolicy.COLUMNNAME_M_CostElement_ID, null));
		Lookup lookupvalrule = MLookupFactory.get(Env.getCtx(),0 ,0 , adcolumn.getAD_Column_ID(), adcolumn.getAD_Reference_ID());
		HashMap props = p.getProperties();
		if (props.containsKey("process")) {
			Integer pid = Integer.valueOf(props.get("process").toString());
			X_AD_Process proc = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_ID = ?", null)
			.setParameters(pid).first();
			if (proc != null) {
				KeyNamePair vp = new KeyNamePair(proc.getAD_Process_ID(), proc.getName());		
				setAD_Process_ID(vp);
				//
				//
				X_AD_Scheduler scheduler = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Process_ID = ?", null)
				.setParameters(proc.getAD_Process_ID()).first();
				if (scheduler != null)
				{
					SchedulerNode schedulernode = new SchedulerNode(scheduler);
//					schedulernode.setName(scheduler.getName());
//					schedulernode.setAD_Scheduler_ID(scheduler.getAD_Scheduler_ID());
//					schedulernode.setDatelastrun(scheduler.getDateLastRun());
//					schedulernode.setDatenextrun(scheduler.getDateNextRun());
//					schedulernode.setFrequency(scheduler.getFrequency());					
//					MColumn column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Scheduler.Table_Name, X_AD_Scheduler.COLUMNNAME_FrequencyType, null));
//					Lookup lkfqtype = MLookupFactory.get(Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());
//					//setAD_Rule_ID(lkrules.get(proc.getAD_Rule_ID()));
//					schedulernode.setFrequencyType(lkfqtype.get(scheduler.getFrequencyType()));
//					//schedulernode.setFrequencyType(scheduler.getFrequencyType());
//					schedulernode.setTag(scheduler.getTag());
//					schedulernode.setActive(scheduler.isActive());
					this.add(schedulernode);
				}				
			}
		}		
		setM_CostElement_ID(lookupvalrule.get(p.getM_CostElement_ID()));
		setM_MaterialPolicy_ID(p.getM_MaterialPolicy_ID());
		setStartDate(p.getStartDate());
		setSynchronized(p.isSynchronized());
		setIsSyncStorage(p.isSynchStorage());
		
	}
	public Timestamp getStartDate() {
		return StartDate;
	}
	public void setStartDate(Timestamp var) {
		StartDate = var;
	}
	public Boolean getIsSyncStorage() {
		return IsSyncStorage;
	}
	public void setIsSyncStorage(Boolean isSyncStorage) {
		IsSyncStorage = isSyncStorage;
	}
	public Boolean getSynchronized() {
		return Synchronized;
	}
	public void setSynchronized(Boolean synchronized1) {
		Synchronized = synchronized1;
	}
	public Integer getM_MaterialPolicy_ID() {
		return M_MaterialPolicy_ID;
	}
	public void setM_MaterialPolicy_ID(Integer m_MaterialPolicy_ID) {
		M_MaterialPolicy_ID = m_MaterialPolicy_ID;
	}	
	public NamePair getM_CostElement_ID() {
		return M_CostElement_ID;
	}
	public void setM_CostElement_ID(NamePair m_CostElement_ID) {
		M_CostElement_ID = m_CostElement_ID;
	}	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String toString () {
		return getName();
	}	
}
