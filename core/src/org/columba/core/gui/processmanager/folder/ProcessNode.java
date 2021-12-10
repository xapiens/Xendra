package org.columba.core.gui.processmanager.folder;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.tree.DefaultMutableTreeNode;

import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.NamePair;

import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

public class ProcessNode  extends DefaultMutableTreeNode {
	int id;
	int A_Machine_ID;
	String name;	
	NamePair AD_Rule_ID;
	NamePair AD_Process_ID;
	String TableName = "";
	Integer Supervisor_ID;
	Integer Record_ID;
	Integer AD_Process_Machine_ID;
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
		setAD_Process_Machine_ID(procmachine.getAD_Process_Machine_ID());
		X_AD_Process proc = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_ID = ?", null)
		.setParameters(procmachine.getAD_Process_ID()).first();
		if (proc != null)
		{
			MColumn column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Process_Machine.Table_Name, X_AD_Process_Machine.COLUMNNAME_AD_Process_ID, null));
			Lookup lookupprocess = MLookupFactory.get(Env.getCtx(),0 ,0 , column.getAD_Column_ID(), column.getAD_Reference_ID());			
			//columndata.setAD_Val_Rule_ID();
			//setProcid(proc.getAD_Process_ID());
			setAD_Process_ID(lookupprocess.get(proc.getAD_Process_ID()));
			//setProcname(proc.getName());
			if (proc.getAD_Rule_ID() > 0)
			{
				column = MColumn.get(Env.getCtx(), MColumn.getColumn_ID(X_AD_Process.Table_Name, X_AD_Process.COLUMNNAME_AD_Rule_ID, null));
				Lookup lkrules = MLookupFactory.get(Env.getCtx(), 0, 0, column.getAD_Column_ID(), column.getAD_Reference_ID());
				setAD_Rule_ID(lkrules.get(proc.getAD_Rule_ID()));
				//X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				//.setParameters(proc.getAD_Rule_ID()).first();
				//if (rule != null) {
				//	setAD_Rule_ID(rule.getAD_Rule_ID());
				//}
			}
			X_AD_Scheduler scheduler = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Process_ID = ?", null)
			.setParameters(proc.getAD_Process_ID()).first();
			if (scheduler != null)
			{
				SchedulerNode schedulernode = new SchedulerNode(scheduler);
				this.add(schedulernode);
			}
		}
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
	public NamePair getAD_Rule_ID() {
		return AD_Rule_ID;
	}
	public void setAD_Rule_ID(NamePair var) {
		AD_Rule_ID = var;
	}
	public NamePair getAD_Process_ID() {
		return AD_Process_ID;
	}
	public void setAD_Process_ID(NamePair var) {
		AD_Process_ID = var;
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
	public String getInfo() {		
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(this.getA_Machine_ID()).first();
		String info = String.format("%s %s", "ajua", machine.getName());
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
	public Integer getAD_Process_Machine_ID() {
		return AD_Process_Machine_ID;
	}
	public void setAD_Process_Machine_ID(Integer var) {
		AD_Process_Machine_ID = var;
	}
	public String toString ()
	{
		String var = "";
		if (getAD_Process_ID() != null) {
			KeyNamePair vp = (KeyNamePair) getAD_Process_ID();
			var = vp.getName();
		}
		return var;
	}

	public static class CellProcessRenderer extends DefaultCellRenderer implements TableCellRenderer {
		public void setValue(Object value) {
			KeyNamePair var = (KeyNamePair) value;
			if (var != null) {
				setText(var.getName());
			}
		}
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			setValue(value);
			return this;
		}
	}

	public static class CellRuleRenderer extends DefaultCellRenderer implements TableCellRenderer {
		public void setValue(Object value) {
			KeyNamePair var = (KeyNamePair) value;
			if (var != null) {
				setText(var.getName());
			}
		}
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			setValue(value);
			return this;
		}
	}

}

