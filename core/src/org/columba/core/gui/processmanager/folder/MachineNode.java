package org.columba.core.gui.processmanager.folder;

import javax.swing.tree.DefaultMutableTreeNode;
import org.compiere.model.persistence.X_A_Machine;

public class MachineNode extends DefaultMutableTreeNode {
	X_A_Machine machine;
	public X_A_Machine getMachine() {
		return machine;
	}
	public void setMachine(X_A_Machine machine) {
		this.machine = machine;
	}	
}
