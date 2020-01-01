package org.xendra.modeleditor.wizard.newtable;

import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ProcessDialog;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewTableCreator  implements WizardModelListener {
	DataModel data;
	public NewTableCreator(DataModel data) {
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
		String Id = (String) data.getData(MTable.COLUMNNAME_ID);
		Integer AD_Plugin_ID = (Integer) data.getData(MTable.COLUMNNAME_AD_Plugin_ID);		
		String Name = (String) data.getData(MTable.COLUMNNAME_Name);
		String TableName = (String) data.getData(MTable.COLUMNNAME_TableName);
		String Description = (String) data.getData(MTable.COLUMNNAME_Description);
		String Help = (String) data.getData(MTable.COLUMNNAME_Help);
		String EntityType = (String) data.getData(MTable.COLUMNNAME_EntityType);
		String AccessLevel = (String) data.getData(MTable.COLUMNNAME_AccessLevel);
		Integer AD_Val_Rule_ID = (Integer) data.getData(MTable.COLUMNNAME_AD_Val_Rule_ID);
		Boolean IsSecurityEnabled = (Boolean) data.getData(MTable.COLUMNNAME_IsSecurityEnabled);
		MTable table = new Query(Env.getCtx(), MTable.Table_Name, "UPPER(TableName) = ?", null)
			.setParameters(TableName.toUpperCase()).first();
		if (table != null) { 
			ADialog.error(0, null, "TableExist");
			return;
		}		
		table = new MTable(Env.getCtx(), 0, null);
		table.setName(Name);
		table.setTableName(TableName);
		table.setDescription(Description);
		table.setHelp(Help);
		table.setEntityType(EntityType);
		table.setAccessLevel(AccessLevel);
		if (AD_Val_Rule_ID != null)
			table.setAD_Val_Rule_ID(AD_Val_Rule_ID);
		table.setIsSecurityEnabled(IsSecurityEnabled);
		table.setAD_Plugin_ID(AD_Plugin_ID);
		table.setID(Id);
		if (table.save()) {
			table.createDefaults(1);
			// update structs
			
			ProcessDialog pd = new ProcessDialog ("143f62fd-832b-2e26-c8ca-e2467cbaeff3", table.getAD_Table_ID(), false);
			if (!pd.init())
			{
				return;
			}
			
			pd.getContentPane().invalidate();
			pd.getContentPane().validate();
			pd.pack();
			AEnv.showCenterScreen(pd);			
		}
	}
	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub		
	}

}
