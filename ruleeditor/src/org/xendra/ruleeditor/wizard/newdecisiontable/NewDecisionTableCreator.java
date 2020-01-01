package org.xendra.ruleeditor.wizard.newdecisiontable;

import java.util.HashMap;

import org.compiere.model.MRule;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.Env;
import org.xendra.Constants;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewDecisionTableCreator implements WizardModelListener {

	private DataModel data;
	private Integer m_parentid;
	
	public NewDecisionTableCreator(DataModel data, Integer m_parentid) {
		this.data = data;
		this.m_parentid = m_parentid;
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
		String ruleName = (String) data.getData(X_AD_Rule.COLUMNNAME_Name);
		String script = (String) data.getData(X_AD_Plugin.COLUMNNAME_Source);
		MRule rule = new MRule(Env.getCtx(), 0, null);
		MRule parentrule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
			.setParameters(m_parentid).first();		
		String newname = String.format("src/main/resources/%s/%s.drl",parentrule.getID(),ruleName);
		rule.setName(newname);
		rule.setParent(parentrule);		
		rule.setRuleType(REF_RuleType.JSR94RuleEngineAPI);
		HashMap map = new HashMap();
		map.put("name", newname);
		map.put("type", "rule");
		map.put(Constants.XML_ATTRIBUTE_SESSIONNAME, parentrule.getProperties().get(Constants.XML_ATTRIBUTE_SESSIONNAME));
		rule.setProperties(map);
		rule.setScript(script);
		rule.save();		
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
		
	}

}
