package org.xendra.ruleeditor.wizard.newfact;

import java.util.HashMap;

import org.compiere.model.MRule;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewFactCreator implements WizardModelListener {
	
	private DataModel data;
	private Integer m_parentid;

	public NewFactCreator(DataModel data, Integer m_parentid) {
		this.data = data;
		this.m_parentid = m_parentid;		
	}
	
	@Override
	public void wizardFinished(WizardModelEvent e) {
		String factName = (String) data.getData(X_AD_Rule.COLUMNNAME_Name);
		MRule rule = new MRule(Env.getCtx(), 0, null);
		MRule parentrule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
			.setParameters(m_parentid).first();				
		rule.setName(factName);
		rule.setRuleType(REF_RuleType.Fact);
		rule.setParent(parentrule);		
		HashMap map = new HashMap();
		map.put("name", factName);
		map.put("type", "fact");
		map.put("SessionName", parentrule.getProperties().get("SessionName"));
		rule.setProperties(map);
		rule.save();		
	}
	@Override
	public void stepShown(WizardModelEvent e) {
	}
	@Override
	public void wizardCanceled(WizardModelEvent e) {
	}
	@Override
	public void wizardModelChanged(WizardModelEvent e) {
	}
}
