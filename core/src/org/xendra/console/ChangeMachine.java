package org.xendra.console;

import java.util.HashMap;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.util.Env;

import com.googlecode.lanterna.gui2.table.Table;

public class ChangeMachine  implements Runnable {
	Integer id;
	Integer machineid;
	Table<String> table; 
	String type;
	ChangeMachine(Integer id, Integer machineid, Table<String> table, String type) {
		this.id = id;
		this.machineid = machineid;
		this.table = table;
		this.type = type;
	}
	public void run() {
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(this.machineid).first();
		if (machine != null) {
			if (type.equals("account")) {
				X_C_AcctProcessor p = new Query(Env.getCtx(), X_C_AcctProcessor.Table_Name, "C_AcctProcessor_ID = ?", null)
				.setParameters(this.id).first();
				p.setA_Machine_ID(machine.getA_Machine_ID());
				p.save();			
				table.getTableModel().setCell(0, table.getSelectedRow(), machine.getName());
				table.getTableModel().setCell(1, table.getSelectedRow(), machine.getMac_Address());
			} else if (type.equals("scheduler")) {
				X_AD_Process_Machine pm = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "AD_Process_Machine_ID = ?", null)
					.setParameters(this.id).first();
				X_AD_Process_Machine exists = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "AD_Process_ID = ? AND A_Machine_ID = ?", null)
				.setParameters(pm.getAD_Process_ID(), machine.getA_Machine_ID()).first();
				if (exists != null) {
					exists.delete(true);
				}
				pm.setA_Machine_ID(machine.getA_Machine_ID());
				pm.save();
				table.getTableModel().setCell(0, table.getSelectedRow(), machine.getName());
				table.getTableModel().setCell(1, table.getSelectedRow(), machine.getMac_Address());				
			} else if (type.equals("server")) {
				X_A_MachineServer ms = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_MachineServer_ID = ?", null)
				.setParameters(this.id).first();
				HashMap p = ms.getProperties();
				p.put("A_Machine_ID", machine.getA_Machine_ID());
				p.put("IsDefault","true");
				ms.setProperties(p);
				ms.save();
				table.getTableModel().setCell(0, table.getSelectedRow(), machine.getName());
				table.getTableModel().setCell(1, table.getSelectedRow(), machine.getMac_Address());				
			}
		}
	}
}
