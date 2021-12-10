package org.xendra.console;

import java.util.HashMap;
import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;

public class AddMachine {
	private List<X_A_Machine> machines;
	public AddMachine(String type, MultiWindowTextGUI gui) {
		String where = "array_length(akeys(properties), 1) > 0";
		machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
		.setOrderBy("name")
		.list();		
		ActionListDialogBuilder db = new ActionListDialogBuilder();
		db.setTitle("Action List");
		db.setListBoxSize(new TerminalSize(40, 10));
		db.setDescription("add");				
		for (X_A_Machine machine:machines) {
			db.addAction(String.format("%s %s", machine.getName(), machine.getMac_Address()), new AddMachineType( machine.getA_Machine_ID(), type, gui)); 
		}
		db.build().showDialog(gui);								
	}	
}
