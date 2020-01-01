package org.xendra.modeleditor.wizard.newpackage;

import org.compiere.apps.ADialog;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Package;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewPackageCreator implements WizardModelListener {
	DataModel data;
	public NewPackageCreator(DataModel data) {
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
		String Name = (String) data.getData(X_AD_Package.COLUMNNAME_Name);
		Integer AD_Plugin_ID = (Integer) data.getData(X_AD_Package.COLUMNNAME_AD_Plugin_ID);
		X_AD_Package p = new Query(Env.getCtx(), X_AD_Package.Table_Name, "Name = ?", null)
			.setParameters(Name).first();
		if (p != null) { 
			ADialog.error(0, null, "PackageExist");
			return;
		}				
		p = new X_AD_Package(Env.getCtx(), 0 , null);
		p.setAD_Plugin_ID(AD_Plugin_ID);
		p.setName(Name);
		if (p.save()) {
			
		}
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
		
	}

}
