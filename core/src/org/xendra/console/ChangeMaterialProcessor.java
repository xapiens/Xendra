package org.xendra.console;

import org.compiere.model.MMaterialProcessor;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;

import com.googlecode.lanterna.gui2.table.Table;

public class ChangeMaterialProcessor implements Runnable {
	Integer id;
	Integer machineid;
	Table<String> table; 		
	public ChangeMaterialProcessor(Integer id, int machineid,
			Table<String> table) {
		this.id = id;
		this.machineid = machineid;
		this.table = table;	
	}	
	@Override
	public void run() {
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
		.setParameters(this.machineid).first();
		if (machine != null) {
			MMaterialProcessor mp = new Query(Env.getCtx(), MMaterialProcessor.Table_Name, "M_MaterialProcessor_ID = ?", null)
			.setParameters(this.id).first();
			mp.setA_Machine_ID(machine.getA_Machine_ID());
			mp.save();
		}
	}
}
