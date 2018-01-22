package org.xendra.rules.wizard;

import org.compiere.model.MClient;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.util.Env;
import org.compiere.util.ValueNamePair;
import org.xendra.rules.ProcessNode;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class ProcessCreator implements WizardModelListener {

	private DataModel data;

	public ProcessCreator(DataModel data) {
		this.data = data;
	}

	@Override
	public void stepShown(WizardModelEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardCanceled(WizardModelEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardFinished(WizardModelEvent arg0) {
		ValueNamePair processtype = (ValueNamePair) data.getData(X_AD_Process.COLUMNNAME_AD_Process_ID);
		if (processtype.getID().equals(ProcessNode.MachineServer))
		{
			X_A_Machine machine = (X_A_Machine) data.getData(X_A_Machine.COLUMNNAME_A_Machine_ID);
			ValueNamePair servertype = (ValueNamePair) data.getData(X_A_MachineServer.COLUMNNAME_ServerType);
			X_A_MachineServer machineserver = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "A_Machine_ID = ? AND ServerType = ?", null)
			.setParameters(machine.getA_Machine_ID(), servertype.getID()).first();
			if (machineserver == null)
			{
				machineserver = new X_A_MachineServer(Env.getCtx(), 0, null);
				machineserver.setServerType(servertype.getID());
				machineserver.setA_Machine_ID(machine.getA_Machine_ID());
				if (machineserver.getServerType().equals(REF_ServerType.MaterialServer)) {
					MClient client = MClient.get(Env.getCtx());
					X_M_MaterialProcessor proc = new X_M_MaterialProcessor(Env.getCtx(), 0, null);
					proc.setA_Machine_ID(machine.getA_Machine_ID());
					proc.setName(client.getName());
					proc.setFrequency(1);
					proc.setFrequencyType(REF__FrequencyType.Day);					
					proc.save();
				}
			}
			machineserver.setIsActive(true);
			machineserver.save();
		}
	}

	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub

	}
}
