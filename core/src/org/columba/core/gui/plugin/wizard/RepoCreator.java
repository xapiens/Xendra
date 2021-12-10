package org.columba.core.gui.plugin.wizard;

import java.util.HashMap;

import org.compiere.model.MRole;
import org.compiere.model.MStore;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.Util;
import org.xendra.api.XendrianServer;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class RepoCreator implements WizardModelListener {
	DataModel data;
	public RepoCreator(DataModel data) {
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
		String repository = (String) data.getData(X_AD_Plugin.COLUMNNAME_Source);		
		MStore.getInstance().setRepository(repository);
		MStore.getInstance().save();
		new XendrianServer().setServlet("store").setType("refreshstore");				
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
	}
}
