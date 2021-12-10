package org.columba.core.gui.processmanager.folder;

import java.util.HashMap;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Scheduler_Para;
import org.compiere.util.Env;

public class SchedulerParaNode extends ProcessNode {
	private Integer AD_Scheduler_ID;
	private Integer AD_Scheduler_Para_ID;
	private HashMap ParameterDefault;
	private String Name;
	private String Description;
	public SchedulerParaNode(X_AD_Scheduler_Para para) {
		setAD_Scheduler_ID(para.getAD_Scheduler_ID());
		X_AD_Process_Para p = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_Para_ID = ?", null)
		.setParameters(para.getAD_Process_Para_ID()).first();
		if (p != null) {
			Name = p.getName();
			setName(p.getName());
			HashMap<String, Object> props = new HashMap<String, Object>();
			props.put(X_AD_Process_Para.COLUMNNAME_AD_Process_Para_ID, p.getAD_Process_Para_ID());
			props.put(X_AD_Scheduler_Para.COLUMNNAME_ParameterDefault, para.getParameterDefault());
			props.put(X_AD_Scheduler_Para.COLUMNNAME_ParameterDisplay, para.getParameterDisplay());
			setAD_Scheduler_Para_ID(para.getAD_Scheduler_Para_ID());			
			setParameterDefault(props);
			setDescription(para.getDescription());
		}
	}
	public Integer getAD_Scheduler_ID() {
		return AD_Scheduler_ID;
	}
	public void setAD_Scheduler_ID(Integer aD_Scheduler_ID) {
		AD_Scheduler_ID = aD_Scheduler_ID;
	}
	public Integer getAD_Scheduler_Para_ID() {
		return AD_Scheduler_Para_ID;
	}
	public void setAD_Scheduler_Para_ID(Integer aD_Scheduler_Para_ID) {
		AD_Scheduler_Para_ID = aD_Scheduler_Para_ID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}	
	public String getName() {
		return Name;
	}
	public HashMap getParameterDefault() {
		return ParameterDefault;
	}
	public void setParameterDefault(HashMap parameterDefault) {
		ParameterDefault = parameterDefault;
	}
	public String toString ()
	{
		return getName();
	}	
}
