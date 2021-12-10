package org.columba.core.gui.processmanager.folder;

import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;

public class RootNode extends ProcessNode {
	public RootNode() {
		super();
		loadChildren();
	}

	private void loadChildren() {
		List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y'", null).list();
		for (X_A_Machine machine:machines) {
			HostNode node = new HostNode(machine);
			add(node);
		}
	}
}
