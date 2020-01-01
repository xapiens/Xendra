package org.xendra.ruleeditor.wizard.newchannel;

import java.util.HashMap;

import org.compiere.model.MRule;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.Env;
import org.xendra.ruleeditor.folder.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewChannelCreator implements WizardModelListener {
	private DataModel data;
	private AbstractFolder parentfolder;
	public NewChannelCreator(DataModel data, AbstractFolder parentfolder) {
		this.data = data;
		this.parentfolder = parentfolder;		
	}
	@Override
	public void wizardFinished(WizardModelEvent e) {
		String channelName = (String) data.getData(X_AD_Rule.COLUMNNAME_Name);
		MRule rule = new MRule(Env.getCtx(), 0, null);
		Integer uid = Integer.valueOf(parentfolder.getElement().getAttributeValue("uid"));
		MRule parentrule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
			.setParameters(uid).first();				
		rule.setName(channelName);
		rule.setRuleType(REF_RuleType.Channel);
		rule.setParent(parentrule);		
		HashMap map = new HashMap();
		map.put("name", channelName);
		map.put("type", "channel");
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
