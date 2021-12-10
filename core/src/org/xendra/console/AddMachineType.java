package org.xendra.console;

import java.util.HashMap;

import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;

public class AddMachineType implements Runnable {
	int A_Machine_ID = 0;
	String type = "";
	MultiWindowTextGUI gui;
	public AddMachineType(int A_Machine_ID, String type, MultiWindowTextGUI gui) {
		this.A_Machine_ID = A_Machine_ID;
		this.type = type;
		this.gui = gui;
	}

	@Override
	public void run() {
		if (type.equals("server")) {
			ActionListDialogBuilder db = new ActionListDialogBuilder();
			db.setTitle("");
			db.setListBoxSize(new TerminalSize(40, 10));
			db.setDescription("add");
			db.addAction("Web Server", new AddServerType(A_Machine_ID, REF_ServerType.WebServer));
			//db.addAction("Update Server", new AddServerType(A_Machine_ID, REF_ServerType.UpdateServer));
			db.addAction("Material Server", new AddServerType(A_Machine_ID, REF_ServerType.MaterialServer));
			db.addAction("Message Server", new AddServerType(A_Machine_ID, REF_ServerType.MessageServer));
			db.build().showDialog(gui);
		}			
	}
	class AddServerType implements Runnable {
		int A_Machine_ID = 0;
		String typeserver = "";
		public AddServerType(int A_Machine_ID, String typeserver) {
			this.A_Machine_ID = A_Machine_ID;
			this.typeserver = typeserver;			
		}
		public void run() {
			X_A_MachineServer ms = new X_A_MachineServer(Env.getCtx(), 0, null);
			HashMap p = ms.getProperties();
			p.put("A_Machine_ID", A_Machine_ID);
			p.put("IsDefault","true");
			ms.setServerType(typeserver);
			ms.setProperties(p);
			ms.save();							
		}
	}
} 