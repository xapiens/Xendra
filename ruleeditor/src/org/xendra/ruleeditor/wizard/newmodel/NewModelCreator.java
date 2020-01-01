package org.xendra.ruleeditor.wizard.newmodel;

import java.util.HashMap;

import org.compiere.model.MRule;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewModelCreator implements WizardModelListener {

	private DataModel data;
	private Integer m_parentid;

	public NewModelCreator(DataModel data, Integer m_parentid) {
		this.data = data;
		this.m_parentid = m_parentid;				
	}
	
	@Override
	public void wizardFinished(WizardModelEvent e) {
		KeyNamePair kp = (KeyNamePair) data.getData(X_AD_Table.COLUMNNAME_AD_Table_ID);
		MTable table = new Query(Env.getCtx(), MTable.Table_Name, "AD_Table_ID = ?", null)
			.setParameters(kp.getKey()).first();
		PO modelname = table.getPO(0, null);				
		MRule rule = new MRule(Env.getCtx(), 0, null);
		MRule parentrule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
			.setParameters(m_parentid).first();				
		rule.setName(modelname.getClass().getSimpleName());
		rule.setRuleType(REF_RuleType.Model);
		rule.setParent(parentrule);				
		HashMap map = new HashMap();
		map.put("name", modelname.get_TableName());
		map.put(X_AD_Process.COLUMNNAME_Classname, modelname.getClass().getName());
		map.put(X_AD_Table.COLUMNNAME_AD_Table_ID, kp.getKey());
		map.put("type", "model");
		map.put("SessionName", parentrule.getProperties().get("SessionName"));
		rule.setProperties(map);
		rule.save();				
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
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
		
	}

}
