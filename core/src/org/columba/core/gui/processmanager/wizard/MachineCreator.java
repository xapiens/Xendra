package org.columba.core.gui.processmanager.wizard;

import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class MachineCreator implements WizardModelListener {

	private DataModel data;
	
	public MachineCreator(DataModel data) {
		this.data = data;
	}

	@Override
	public void stepShown(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardFinished(WizardModelEvent e) {
		String name = (String) data.getData(X_A_Machine.COLUMNNAME_A_Machine_ID);
		X_A_Machine machine = new X_A_Machine(Env.getCtx(), 0, null);
		machine.setName(name);
		machine.save();
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

}
