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

import javax.swing.Box;
import javax.swing.BoxLayout;
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
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.compiere.model.MPOS;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POS;

class IdentityStep extends AbstractStep {
	protected DataModel data;
	protected CTextField name = new CTextField(20);
	private MPOS pos;

	public IdentityStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "identity"),
				ResourceLoader.getString("dialog", "machinewizard",   "identity_description"));
		this.data = data;		
		setCanGoNext(true);
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField POSListPanel = new WizardTextField();
		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "type"));
		typeLabel.setLabelFor(name);

		LabelWithMnemonic nameLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "name"));
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			X_C_POS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
				.setParameters(C_POS_ID).first();
			if (pos != null) {
				name.setText(pos.getName());
			}
		}
		if (name.getText().length() == 0) {
			name.setText(Env.getMachine().getName());
		}
			
		Method method = null;
		try {
			method = name.getClass().getMethod("getText", null);
			
		} catch (NoSuchMethodException nsme) {
		}
		data.registerDataLookup(X_C_POS.COLUMNNAME_Name,new DefaultDataLookup(name, method, null));        
		POSListPanel.addTextField(name);
		POSListPanel.addEmptyExample();
		component.add(POSListPanel);
		return component;
	}

	public void prepareRendering() {
	}
}