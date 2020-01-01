package org.xendra.modeleditor.wizard.newplugin;

import org.compiere.apps.ADialog;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewPluginCreator implements WizardModelListener {
	DataModel data;
	public NewPluginCreator(DataModel data) {
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
		String Name = (String) data.getData(X_AD_Plugin.COLUMNNAME_Name);
		String Description = (String) data.getData(X_AD_Plugin.COLUMNNAME_Description);
 		String CategoryName = (String) data.getData(X_AD_Plugin.COLUMNNAME_CategoryName);
		String Folder = (String) data.getData(X_AD_Plugin.COLUMNNAME_Folder);
		String AccessLevel = (String) data.getData(MTable.COLUMNNAME_AccessLevel);
		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "Name = ? OR Folder = ?", null)
			.setParameters(Name, Folder).first();
		if (plugin != null) { 
			ADialog.error(0, null, "PluginExist");
			return;
		}		
		plugin = new X_AD_Plugin(Env.getCtx(), 0, null);
		plugin.setName(Name);
		plugin.setDescription(Description);
		plugin.setCategoryName(CategoryName);
		plugin.setAccessLevel(AccessLevel);
		plugin.setID(Folder);
		plugin.setFolder(Folder);
		if (plugin.save()) {
			
		}
	}
	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub		
	}		
}
