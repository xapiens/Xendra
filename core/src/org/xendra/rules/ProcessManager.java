package org.xendra.rules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_WorkflowProcessor;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.model.persistence.X_C_CashFlowProcessor;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.persistence.X_R_RequestProcessor;
import org.compiere.util.Env;

public class ProcessManager {
	private static ProcessManager instance = new ProcessManager();

	public static ProcessManager getInstance() {
		return instance;		
	}	

	public List<X_A_Machine> getMachines() {
		List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y'", null).list();
		return machines;
	}

//	public boolean hasProcess(X_A_Machine machine) {
//		int count = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "A_Machine_ID = ?", null)
//		.setParameters(machine.getA_Machine_ID())
//		.count();
//		return (count > 0);		
//	}

//	public boolean hasServerProcess(X_A_Machine machine) {		
//		if (new Query(Env.getCtx(), X_R_RequestProcessor.Table_Name, "A_Machine_ID = ?", null)
//			.setParameters(machine.getA_Machine_ID()).count() > 0)		
//			return true;
//		if (new Query(Env.getCtx(), X_AD_WorkflowProcessor.Table_Name, "A_Machine_ID = ?", null)
//		.setParameters(machine.getA_Machine_ID()).count() > 0)		
//			return true;
//		if (new Query(Env.getCtx(), X_C_AcctProcessor.Table_Name, "A_Machine_ID = ?", null)
//		.setParameters(machine.getA_Machine_ID()).count() > 0)		
//			return true;
//		if (new Query(Env.getCtx(), X_C_CashFlowProcessor.Table_Name, "A_Machine_ID = ?", null)
//		.setParameters(machine.getA_Machine_ID()).count() > 0)		
//			return true;		
//		if (new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "A_Machine_ID = ?", null)
//		.setParameters(machine.getA_Machine_ID()).count() > 0)		
//			return true;
//		return false;
//	}

	public List<X_AD_Process_Machine> getProcess(X_A_Machine machine) {		
		List<X_AD_Process_Machine> processes = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(machine.getA_Machine_ID())
		.list();		
		return processes;
	}
	public List<X_A_MachineServer> getMachineServers(X_A_Machine machine) {
		List<X_A_MachineServer> servers = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(machine.getA_Machine_ID())
		.list();
		return servers;
	}
	public List<ServerProcessInfo> getServerProcess(X_A_Machine machine) {
		List<ServerProcessInfo> spilist = new ArrayList<ServerProcessInfo>();
		List<X_R_RequestProcessor> r = new Query(Env.getCtx(), X_R_RequestProcessor.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID()).list();
		for (X_R_RequestProcessor p:r)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(machine.getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_R_RequestProcessor.Table_Name);
			spi.setRecord_ID(p.getR_RequestProcessor_ID());
			spi.setActive(p.isActive());
			spilist.add(spi);
		}
		List<X_AD_WorkflowProcessor> w = new Query(Env.getCtx(), X_AD_WorkflowProcessor.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID()).list();		
		for (X_AD_WorkflowProcessor p:w)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(machine.getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_AD_WorkflowProcessor.Table_Name);
			spi.setRecord_ID(p.getAD_WorkflowProcessor_ID());
			spi.setActive(p.isActive());
			spilist.add(spi);			
		}
		List<X_C_AcctProcessor> a = new Query(Env.getCtx(), X_C_AcctProcessor.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID()).list();
		for (X_C_AcctProcessor p:a)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(machine.getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_C_AcctProcessor.Table_Name);
			spi.setRecord_ID(p.getC_AcctProcessor_ID());
			spi.setActive(p.isActive());
			spilist.add(spi);						
		}
		List<X_C_CashFlowProcessor> c = new Query(Env.getCtx(), X_C_CashFlowProcessor.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID()).list();		
		for (X_C_CashFlowProcessor p:c)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(machine.getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_C_CashFlowProcessor.Table_Name);
			spi.setRecord_ID(p.getC_CashFlowProcessor_ID());
			spi.setActive(p.isActive());
			spilist.add(spi);									
		}
		List<X_M_MaterialProcessor> m = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID()).list();
		for (X_M_MaterialProcessor p:m)
		{
			ServerProcessInfo spi = new ServerProcessInfo();
			spi.setName(p.getName());
			spi.setA_Machine_ID(machine.getA_Machine_ID());
			spi.setFrequency(p.getFrequency());
			spi.setFrequencyType(p.getFrequencyType());
			spi.setDateLastRun(p.getDateLastRun());
			spi.setDateNextRun(p.getDateNextRun());
			spi.setSupervisor_ID(p.getSupervisor_ID());
			spi.setTableName(X_M_MaterialProcessor.Table_Name);
			spi.setRecord_ID(p.getM_MaterialProcessor_ID());
			spi.setActive(p.isActive());
			spilist.add(spi);												
		}
		return spilist;
	}
}
