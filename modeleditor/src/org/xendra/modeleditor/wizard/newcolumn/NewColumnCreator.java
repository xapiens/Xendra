package org.xendra.modeleditor.wizard.newcolumn;

import java.math.BigDecimal;

import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.ProcessDialog;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Element;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewColumnCreator  implements WizardModelListener{
	DataModel data;
	
	public NewColumnCreator(DataModel data) {
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
		Integer AD_Table_ID = (Integer) data.getData(X_AD_Column.COLUMNNAME_AD_Table_ID);	
		String  ColumnName = (String) data.getData(X_AD_Column.COLUMNNAME_Name);
		Integer AD_Element_ID = (Integer) data.getData(X_AD_Column.COLUMNNAME_AD_Element_ID);
		Integer AD_Reference_ID = (Integer) data.getData(X_AD_Column.COLUMNNAME_AD_Reference_ID);
		String EntityType = (String) data.getData(X_AD_Column.COLUMNNAME_EntityType);
		Integer AD_Reference_Value_ID = (Integer) data.getData(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID);
		Integer FieldLength = (Integer)  data.getData(X_AD_Column.COLUMNNAME_FieldLength);
		Integer Version = (Integer) data.getData(X_AD_Column.COLUMNNAME_Version);
		X_AD_Column column = new Query(Env.getCtx(), X_AD_Column.Table_Name, "UPPER(Name) = ? AND AD_Table_ID = ?", null)
			.setParameters(ColumnName.toUpperCase(), AD_Table_ID).first();
		if (column != null) { 
			ADialog.error(0, null, "ColumnExist");
			return;
		}		
		column = new X_AD_Column(Env.getCtx(), 0, null);
		column.setAD_Table_ID(AD_Table_ID);
		column.setAD_Element_ID(AD_Element_ID);
		column.setEntityType(EntityType);
		column.setName(ColumnName);
		column.setColumnName(ColumnName);
		column.setAD_Reference_ID(AD_Reference_ID);
		if (AD_Reference_Value_ID != null)
			column.setAD_Reference_Value_ID(AD_Reference_Value_ID);
		column.setFieldLength(FieldLength);
		column.setVersion(BigDecimal.valueOf(Version));
		column.save();
//		if (column.save()) {
//			// update structs
//			
//			ProcessDialog pd = new ProcessDialog ("00cedefe-c3aa-d75e-3bd8-dac3ace4e8fa", column.getAD_Column_ID(), false);
//			if (!pd.init())
//			{
//				return;
//			}
//			
//			pd.getContentPane().invalidate();
//			pd.getContentPane().validate();
//			pd.pack();
//			AEnv.showCenterScreen(pd);			
//		}
	}
	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub	
	}
}
