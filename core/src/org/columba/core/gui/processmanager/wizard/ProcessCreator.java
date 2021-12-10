package org.columba.core.gui.processmanager.wizard;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class ProcessCreator implements WizardModelListener {

	private DataModel data;
	private int A_Machine_ID;
	public ProcessCreator(int A_Machine_ID, DataModel data) {
		this.data = data;
		this.A_Machine_ID = A_Machine_ID;
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
		Boolean addScheduler = (Boolean) data.getData(X_AD_Scheduler.COLUMNNAME_AD_Scheduler_ID); 
		KeyNamePair kp = (KeyNamePair) data.getData(X_AD_Process.COLUMNNAME_AD_Process_ID);
		X_AD_Process_Machine pm = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "A_Machine_ID = ? AND AD_Process_ID = ?", null)
		.setParameters(A_Machine_ID, kp.getKey()).first();
		if (pm == null) {
			pm = new X_AD_Process_Machine(Env.getCtx(), 0, null);
			pm.setA_Machine_ID(A_Machine_ID);
			pm.setAD_Process_ID(kp.getKey());
			pm.save();

		}
		if (pm != null) {
			pm.setIsActive(true);
			pm.save();
			if (addScheduler) {
				X_AD_Scheduler scheduler = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Process_ID = ?", null)
				.setParameters(kp.getKey()).first();
				if (scheduler == null) {
					X_AD_Process p = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_ID = ?", null)
					.setParameters(kp.getKey()).first();
					if (p != null) {
						scheduler = new X_AD_Scheduler(Env.getCtx(), 0, null);
						scheduler.setName(p.getName());
						scheduler.setAD_Process_ID(kp.getKey());
						scheduler.setFrequencyType(REF__FrequencyType.Once);
						scheduler.setFrequency(1);
						scheduler.setSupervisor_ID(Env.getAD_User_ID(Env.getCtx()));
						scheduler.setKeepLogDays(7);
						scheduler.save();
					}									
				}
				if (scheduler != null) {
					scheduler.setIsActive(true);
					scheduler.save();
				}
			}			
		}
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

}
