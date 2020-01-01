package org.xendra.modeleditor.wizard.newwindow;

import org.compiere.apps.ADialog;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewWindowCreator implements WizardModelListener {
	DataModel data;
	public NewWindowCreator(DataModel data) {
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
		String Id = (String) data.getData(X_AD_Window.COLUMNNAME_ID);
		Integer AD_Plugin_ID = (Integer) data.getData(X_AD_Window.COLUMNNAME_AD_Plugin_ID);		
		String Name = (String) data.getData(X_AD_Window.COLUMNNAME_Name);
		String Description = (String) data.getData(X_AD_Window.COLUMNNAME_Description);
		String Help = (String) data.getData(X_AD_Window.COLUMNNAME_Help);
		String EntityType = (String) data.getData(X_AD_Window.COLUMNNAME_EntityType);
		MWindow window = new Query(Env.getCtx(), MWindow.Table_Name, "UPPER(Name) = ?", null)
			.setParameters(Name.toUpperCase()).first();
		if (window != null) { 
			ADialog.error(0, null, "TableExist");
			return;
		}		
		window = new MWindow(Env.getCtx(), 0, null);
		window.setName(Name);
		window.setDescription(Description);
		window.setHelp(Help);
		window.setEntityType(EntityType);
		window.setAD_Plugin_ID(AD_Plugin_ID);
		window.setID(Id);
		if (window.save()) {
			//window.createDefaults(1);
		}
	}
	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub		
	}
}
