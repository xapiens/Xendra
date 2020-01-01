package org.xendra.ruleeditor.wizard.newsession;

import java.util.HashMap;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.reference.REF__EntityType;
import org.compiere.util.Env;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewSessionCreator implements WizardModelListener {
	private Integer m_id;
	private DataModel data;
	public NewSessionCreator(Integer id, DataModel data) {
		m_id = id;
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
	public void wizardFinished(WizardModelEvent e) {		
		String sessionname = (String) data.getData(Constants.XML_ATTRIBUTE_SESSIONNAME); 
		ValueNamePair sessiontype = (ValueNamePair) data.getData(Constants.XML_ATTRIBUTE_TYPE);
		ValueNamePair ruletype = (ValueNamePair) data.getData(X_AD_Rule.COLUMNNAME_RuleType);
		String EqualsBehavior = (String) data.getData(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR);
		String EventProcessingMode = (String) data.getData(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE);
		Boolean RuleDefault = (Boolean) data.getData(Constants.XML_ATTRIBUTE_DEFAULT);
		String packagename = (String) data.getData(Constants.XML_ATTRIBUTE_PACKAGE);
		X_AD_Rule rule = new X_AD_Rule(Env.getCtx(), 0, null);
		
		HashMap<String, String> props = new HashMap();
		//props.put(Constants.XML_ATTRIBUTE_NAME, sessionname);
		props.put(Constants.XML_ATTRIBUTE_TYPE, sessiontype.getValue());
		// agenda
		props.put(Constants.XML_ATTRIBUTE_DEFAULT, RuleDefault.toString());	
		// package
		props.put(Constants.XML_ATTRIBUTE_PACKAGE, packagename);
		// docsubtype
		props.put(Constants.XML_ATTRIBUTE_SESSIONNAME, sessionname);
		// docbasetype
		props.put(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR, EqualsBehavior);
		props.put(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE, EventProcessingMode);
		X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "AD_Plugin_ID = ?" , null)
			.setParameters(m_id).first();
		
		rule.setID(plugin.getID());
		rule.setName(sessionname);
		rule.setAD_Plugin_ID(plugin.getAD_Plugin_ID());
		rule.setRuleType(ruletype.getValue());
		rule.setEntityType(REF__EntityType.UserMaintained);
		rule.setProperties(props);
		rule.save();
	}

	@Override
	public void wizardModelChanged(WizardModelEvent arg0) {
		// TODO Auto-generated method stub

	}

}
