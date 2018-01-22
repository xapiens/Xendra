package org.xendra.rules;

import java.sql.Timestamp;

import javax.swing.tree.DefaultMutableTreeNode;

import org.compiere.model.MMovement;
import org.compiere.model.MRefList;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Ref_List;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.util.Env;

public class ProcessNode  extends DefaultMutableTreeNode {
	public static final String Host = "H";
	public static final String Process = "P";
	public static final String ServerProcess = "S";
	public static final String MachineServer = "M";
	int id;
	int A_Machine_ID;
	int A_MachineServer_ID;
	String name;
	String procname;
	String rulename;
	String Tag;
	int ruleid;
	int procid;
	Timestamp datenextrun;
	Timestamp datelastrun;
	String FrequencyType;
	Integer Frequency;
	String TableName = "";
	Integer Supervisor_ID;
	Integer Record_ID;
	Integer AD_Process_Machine;
	Integer AD_Scheduler_ID;
	private String m_hosttype = "";
	private String ServerType;
	private boolean active;
	
	public ProcessNode() {
		super();
	}

	public ProcessNode(X_A_Machine machine) {
		super(machine.getName());
		setA_Machine_ID(machine.getA_Machine_ID());
		setName(machine.getName());		
	}
		
	public ProcessNode(X_AD_Process_Machine procmachine) {
		setA_Machine_ID(procmachine.getA_Machine_ID());
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(procmachine.getA_Machine_ID()).first();
		setName(machine.getName());
		setAD_Process_Machine(procmachine.getAD_Process_Machine_ID());
		X_AD_Process proc = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_ID = ?", null)
			.setParameters(procmachine.getAD_Process_ID()).first();
		if (proc != null)
		{
			setProcid(proc.getAD_Process_ID());
			setProcname(proc.getName());
			if (proc.getAD_Rule_ID() > 0)
			{
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
					.setParameters(proc.getAD_Rule_ID()).first();
				setRuleid(rule.getAD_Rule_ID());
				setRulename(rule.getName());
			}
			X_AD_Scheduler scheduler = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Process_ID = ?", null)
				.setParameters(proc.getAD_Process_ID()).first();
			if (scheduler != null)
			{
				setAD_Scheduler_ID(scheduler.getAD_Scheduler_ID());
				setDatelastrun(scheduler.getDateLastRun());
				setDatenextrun(scheduler.getDateNextRun());
				setFrequency(scheduler.getFrequency());
				setFrequencyType(scheduler.getFrequencyType());
				setTag(scheduler.getTag());
				setActive(scheduler.isActive());
			}
		}
	}

	public ProcessNode(ServerProcessInfo procserverinfo) {
		setA_Machine_ID(procserverinfo.getA_Machine_ID());
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(procserverinfo.getA_Machine_ID()).first();
		setName(machine.getName());		
		setProcname(procserverinfo.getName());
		setDatenextrun(procserverinfo.getDateNextRun());
		setDatelastrun(procserverinfo.getDateLastRun());
		setFrequencyType(procserverinfo.getFrequencyType());
		setFrequency(procserverinfo.getFrequency());
		setTableName(procserverinfo.getTableName());
		setRecord_ID(procserverinfo.getRecord_ID());
		setActive(procserverinfo.isActive());
	}
	public ProcessNode(X_A_MachineServer machineserver) {
		setProcname("");
		setA_Machine_ID(machineserver.getA_Machine_ID());
		setA_MachineServer_ID(machineserver.getA_MachineServer_ID());
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(machineserver.getA_Machine_ID()).first();
		setName(machine.getName());
		setServerType(machineserver.getServerType());
		setTableName(machineserver.get_TableName());
		setRecord_ID(machineserver.get_ID());	
		setActive(machineserver.isActive());
	}	
	
	public void setServerType(String value) {
		ServerType = value;
	}
	public String getServerType() {
		return ServerType;
	}
	public ProcessNode(String value) {
		this.setName(value);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcname() {
		return procname;
	}

	public void setProcname(String procname) {
		this.procname = procname;
	}

	public String getRulename() {
		return rulename;
	}

	public void setRulename(String rulename) {
		this.rulename = rulename;
	}

	public int getRuleid() {
		return ruleid;
	}

	public void setRuleid(int ruleid) {
		this.ruleid = ruleid;
	}

	public int getProcid() {
		return procid;
	}

	public void setProcid(int procid) {
		this.procid = procid;
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
//		MRefList ft = MRefList.get(Env.getCtx(), X_AD_Scheduler.FREQUENCYTYPE_AD_Reference_ID,
//				frequencyType, null);
//		FrequencyType = ft.getName();
		FrequencyType = frequencyType;
	}

	public Integer getFrequency() {
		return Frequency;
	}

	public void setFrequency(Integer frequency) {
		Frequency = frequency;
	}

	public String getTag() {
		return Tag;
	}

	public void setTag(String tag) {
		Tag = tag;
	}		
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getA_Machine_ID() {
		return A_Machine_ID;
	}
	public void setA_Machine_ID(int a_Machine_ID) {
		A_Machine_ID = a_Machine_ID;
	}	
	public int getA_MachineServer_ID() {
		return A_MachineServer_ID;
	}
	public void setA_MachineServer_ID(int a_MachineServer_ID) {
		A_MachineServer_ID = a_MachineServer_ID;
	}
	public String getInfo() {		
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(this.getA_Machine_ID()).first();
		String info = String.format("%s %s", getProcname(), machine.getName());
		return info;
	}

	public String getTableName() {
		return TableName;
	}
	public void setTableName(String tableName) {
		TableName = tableName;
	}
	public Integer getSupervisor_ID() {
		return Supervisor_ID;
	}
	public void setSupervisor_ID(Integer supervisor_ID) {
		Supervisor_ID = supervisor_ID;
	}
	public Integer getRecord_ID() {
		return Record_ID;
	}
	public void setRecord_ID(Integer record_ID) {
		Record_ID = record_ID;
	}
	public Integer getAD_Process_Machine() {
		return AD_Process_Machine;
	}

	public void setAD_Process_Machine(Integer aD_Process_Machine) {
		AD_Process_Machine = aD_Process_Machine;
	}

	public Integer getAD_Scheduler_ID() {
		return AD_Scheduler_ID;
	}

	public void setAD_Scheduler_ID(Integer aD_Scheduler_ID) {
		AD_Scheduler_ID = aD_Scheduler_ID;
	}
	public String toString ()
	{		
		if (getType().equals(Host))		
			return getName();		
		else if (getType().equals(Process))
			return getProcname();
		else if (getType().equals(ServerProcess))
			return getProcname();
		else if (getType().equals(MachineServer))
		{				
			X_AD_Reference ref = new Query(Env.getCtx(), X_AD_Reference.Table_Name, "Identifier = ?", null)
				.setParameters(REF_ServerType.Identifier).first();
			X_AD_Ref_List item = new Query(Env.getCtx(), X_AD_Ref_List.Table_Name, "AD_Reference_ID = ? AND Value = ?", null)
				.setParameters(ref.getAD_Reference_ID(), ServerType).first();
			if (item != null)
			{
				return item.getName();
			}
		}
		return "";
	}

	public void settype(String type) {
		m_hosttype = type;		
	}
	public String getType() {
		return m_hosttype;
	}
}

