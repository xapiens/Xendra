package org.columba.core.gui.processmanager.folder;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_AD_WorkflowProcessor;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.model.persistence.X_C_CashFlowProcessor;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.persistence.X_R_RequestProcessor;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.db.Querys;
import org.xendra.rules.ServerProcessInfo;

public class HostNode extends ProcessNode {
	public HostNode(X_A_Machine machine) {		
		setA_Machine_ID(machine.getA_Machine_ID());
		setName(machine.getName());				
		loadChildren();
	}
	private void loadChildren() {

		try {
			PreparedStatement pstmt = null;
			pstmt = DB.prepareStatement(Querys.SCHEDULERPROCESSBYMACHINE, null);
			pstmt.setInt(1, getA_Machine_ID());
			pstmt.setInt(2, getA_Machine_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{					
				int ProcessMachineID = rs.getInt(X_AD_Process_Machine.COLUMNNAME_AD_Process_Machine_ID);
				X_AD_Process_Machine process = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "AD_Process_Machine_ID = ?", null)
				.setParameters(ProcessMachineID).first();
				ProcessNode procchild = new ProcessNode(process);
				add(procchild);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		//		List<X_AD_Process_Machine> processes = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "A_Machine_ID = ?", null)
		//		.setParameters(getA_Machine_ID())
		//		.list();		
		//		//
		//		for (X_AD_Process_Machine process:processes) {
		//			ProcessNode procchild = new ProcessNode(process);
		//			add(procchild);
		//		}
		List<X_R_RequestProcessor> r = new Query(Env.getCtx(), X_R_RequestProcessor.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(getA_Machine_ID()).list();
		for (X_R_RequestProcessor p:r)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_R_RequestProcessor.Table_Name);
			spi.setRecord_ID(p.getR_RequestProcessor_ID());
			spi.setActive(p.isActive());
			//spilist.add(spi);
			ServerProcessNode procchild = new ServerProcessNode(spi);
			add(procchild);
		}
		List<X_AD_WorkflowProcessor> w = new Query(Env.getCtx(), X_AD_WorkflowProcessor.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(getA_Machine_ID()).list();		
		for (X_AD_WorkflowProcessor p:w)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_AD_WorkflowProcessor.Table_Name);
			spi.setRecord_ID(p.getAD_WorkflowProcessor_ID());
			spi.setActive(p.isActive());
			//spilist.add(spi);
			ServerProcessNode procchild = new ServerProcessNode(spi);
			add(procchild);
		}
		List<X_C_AcctProcessor> a = new Query(Env.getCtx(), X_C_AcctProcessor.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(getA_Machine_ID()).list();
		for (X_C_AcctProcessor p:a)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_C_AcctProcessor.Table_Name);
			spi.setRecord_ID(p.getC_AcctProcessor_ID());
			spi.setActive(p.isActive());
			//spilist.add(spi);
			ServerProcessNode procchild = new ServerProcessNode(spi);
			add(procchild);
		}
		List<X_C_CashFlowProcessor> c = new Query(Env.getCtx(), X_C_CashFlowProcessor.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(getA_Machine_ID()).list();		
		for (X_C_CashFlowProcessor p:c)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_C_CashFlowProcessor.Table_Name);
			spi.setRecord_ID(p.getC_CashFlowProcessor_ID());
			spi.setActive(p.isActive());
			//spilist.add(spi);
			ServerProcessNode procchild = new ServerProcessNode(spi);
			add(procchild);
		}
		List<X_M_MaterialProcessor> m = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(getA_Machine_ID()).list();
		for (X_M_MaterialProcessor p:m)
		{
			MaterialProcessorNode mpn = new MaterialProcessorNode(p);
			add(mpn);
		}
		List<X_A_MachineServer> servers = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "Properties->'A_Machine_ID' = ?", null)
		.setParameters(String.valueOf(getA_Machine_ID()))
		.list();
		for (X_A_MachineServer machineserver:servers) {
			MachineServerNode procchild = new MachineServerNode(machineserver);
			add(procchild);
		}		
	}
	public String toString () {
		return this.getName();
	}
}
