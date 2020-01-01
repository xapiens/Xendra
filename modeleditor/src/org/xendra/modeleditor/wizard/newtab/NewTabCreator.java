package org.xendra.modeleditor.wizard.newtab;

import org.compiere.apps.ADialog;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Tab;
import org.compiere.util.DB;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewTabCreator implements WizardModelListener{
	DataModel data;
	Integer AD_Window_ID;
	public NewTabCreator(Integer AD_Window_ID, DataModel data) {
		this.AD_Window_ID = AD_Window_ID;
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
		String Name = (String) data.getData(X_AD_Tab.COLUMNNAME_Name);
		Integer AD_Table_ID = (Integer) data.getData(X_AD_Tab.COLUMNNAME_AD_Table_ID);
		String Description = (String) data.getData(X_AD_Tab.COLUMNNAME_Description);
		String Help = (String) data.getData(X_AD_Tab.COLUMNNAME_Help);
		String EntityType = (String) data.getData(X_AD_Tab.COLUMNNAME_EntityType);
		int SeqNo = DB.getSQLValue(null, "SELECT COALESCE(max(seqno),0) from ad_tab  where ad_window_id = ?", AD_Window_ID);		
		SeqNo += 10;
		X_AD_Tab tab = new Query(Env.getCtx(), X_AD_Tab.Table_Name, "AD_Window_ID = ? AND AD_Table_ID = ?", null)
			.setParameters(AD_Window_ID, AD_Table_ID).first();
		if (tab != null) { 
			ADialog.error(0, null, "TabExist");
			return;
		}		
		tab = new X_AD_Tab(Env.getCtx(), 0, null);
		tab.setName(Name);
		tab.setAD_Table_ID(AD_Table_ID);
		tab.setAD_Window_ID(AD_Window_ID);
		tab.setSeqNo(SeqNo);
		tab.setTabLevel(0);
		tab.setDescription(Description);
		tab.setHelp(Help);
		tab.setEntityType(EntityType);
		if (tab.save()) {
			
		}
	}
	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub		
	}	
}
