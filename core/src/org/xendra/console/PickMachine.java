package org.xendra.console;

import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;
import com.googlecode.lanterna.gui2.table.Table;

public class PickMachine implements Runnable {
	Table<String> table;
	private List<X_A_Machine> machines;
	MultiWindowTextGUI gui;
	String header;
	String type;
	List<Integer> ids;
	public PickMachine(Table<String> table, MultiWindowTextGUI gui, String header, String type, List<Integer> ids) {
		this.table = table;
		this.gui = gui;
		this.header = header;
		this.type = type;
		this.ids = ids;
	}

	@Override
	public void run() {
		List<String> data = table.getTableModel().getRow(table.getSelectedRow());
		String where = "array_length(akeys(properties), 1) > 0";
		machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
		.setOrderBy("name")
		.list();		
		ActionListDialogBuilder db = new ActionListDialogBuilder();
		db.setTitle("Action List");
		db.setListBoxSize(new TerminalSize(40, 10));
		db.setDescription(header);				
		for (X_A_Machine machine:machines) {
			//Integer acctid = Integer.valueOf(data.get(0));
			db.addAction(String.format("%s %s", machine.getName(), machine.getMac_Address()),new ChangeMachine(ids.get(table.getSelectedRow()), machine.getA_Machine_ID(), table, type)); 
		}
		db.build().showDialog(gui);				
	}

}
