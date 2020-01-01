package org.xendra.ruleeditor.wizard.newrule;

import java.util.HashMap;

import org.compiere.model.MRule;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.Env;
import org.xendra.Constants;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewRuleCreator implements WizardModelListener {

	private DataModel data;
	private Integer m_parentid;

	public NewRuleCreator(DataModel data, Integer m_parentid) {
		this.data = data;
		this.m_parentid = m_parentid;
	}

	@Override
	public void wizardFinished(WizardModelEvent e) {
		String ruleName = (String) data.getData(X_AD_Rule.COLUMNNAME_Name);
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
		rule.save();
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
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
