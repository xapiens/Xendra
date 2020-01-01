package org.xendra.ruleeditor.wizard.newrgroup;

import java.util.HashMap;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_C_GroupDoc;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.model.reference.REF__EntityType;
import org.compiere.util.Env;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewGroupCreator implements WizardModelListener {
	
	private Integer AD_Plugin_ID;
	private DataModel data;
	public NewGroupCreator(Integer AD_Plugin_ID, DataModel data) {
		this.AD_Plugin_ID = AD_Plugin_ID;
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
		String groupname = (String) data.getData(X_C_GroupDoc.COLUMNNAME_C_GroupDoc_ID);
		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?", null)
			.setParameters(AD_Plugin_ID).first();
		X_AD_Rule rule = new X_AD_Rule(Env.getCtx(), 0, null);
		rule.setID(plugin.getID());
		rule.setAD_Plugin_ID(AD_Plugin_ID);
		rule.setName(groupname);
		rule.setRuleType(REF_RuleType.Group);
		rule.setAD_Plugin_ID(AD_Plugin_ID);
		HashMap Properties = new HashMap();
		Properties.put("type", "group");
		rule.setProperties(Properties);
		rule.setEntityType(REF__EntityType.UserMaintained);
		rule.save();
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

}
