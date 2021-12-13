//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.
package org.xendra.pos.wizard;

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.xendra.Constants;
import org.xendra.pos.util.ResourceLoader;
import org.compiere.util.Env;
import org.compiere.model.MPOS;
import org.compiere.model.MRule;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POS;

class RuleStep extends AbstractStep {
	protected DataModel data;

	public RuleStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "rule"),
				ResourceLoader.getString("dialog", "machinewizard",   "rule_description"));
		this.data = data;
		setCanGoNext(false);
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "rule_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField middlePanel = new WizardTextField();

		Method method = null;

		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "rule"));
		JComboBox POSRuleComboBox = new JComboBox();		
		typeLabel.setLabelFor(POSRuleComboBox);               

		Machine machine = Env.getMachine();
		int ruleid = 0;
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0)
		{
			MPOS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null).setParameters(C_POS_ID).first();
			if (pos != null && pos.getAD_Rule_ID() > 0 )
			{
				ruleid = pos.getAD_Rule_ID();
				//setCanGoNext(true);
			}			
		}
		//String query = "properties->'type'  = 'kiebase'  AND  properties->'package'='org.xendra.pos.rules' AND id = 'org.xendra.pos' ";
		String query = "properties->'type'  = 'kiebase'  AND  id = 'org.xendra.pos' ";
		List<MRule> poslist = new Query(Env.getCtx(), MRule.Table_Name, query, null).list();
		for (MRule rule:poslist)
		{
			POSRuleComboBox.addItem(rule);
			if (ruleid > 0 && ruleid == rule.getAD_Rule_ID())
			{
				POSRuleComboBox.setSelectedItem(rule);
				setCanGoNext(true);
			}
		}						
		if (ruleid == 0)
		{
			if (POSRuleComboBox.getModel().getSize() > 0)
			{
				POSRuleComboBox.setSelectedIndex(0);
				setCanGoNext(true);
			}
		}
		try {
			method = POSRuleComboBox.getClass().getMethod("getSelectedItem", null);
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(Constants.Rule,new DefaultDataLookup(POSRuleComboBox, method, null));
		middlePanel.addLabel(typeLabel);
		middlePanel.addTextField(POSRuleComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}

	public void prepareRendering() {
	}
}