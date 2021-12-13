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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MCashBook;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Cash;
import org.compiere.model.persistence.X_C_POS;
import org.xendra.pos.util.ResourceLoader;

class CashBookStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private VLookup cashbook;
	private VLookup doctype;

	public CashBookStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "cashbook"),
				ResourceLoader.getString("dialog", "machinewizard", "cashbook_description"));
		this.data = data;
		setCanGoNext(false);
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "cashbook_text")));
		component.add(Box.createVerticalStrut(40));

		Method method = null;
		Method methoddoctype = null;
		LabelWithMnemonic cashbookLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "cashbook"));		
		cashbook = VLookup.create(X_C_Cash.Table_Name, X_C_Cash.COLUMNNAME_C_CashBook_ID, 0);
		cashbook.addActionListener(this);
		cashbookLabel.setLabelFor(cashbook);
		
		LabelWithMnemonic doctypeLabel = new LabelWithMnemonic(Msg.translate(Env.getCtx(), X_C_Cash.COLUMNNAME_C_DocType_ID));
		doctype = VLookup.create(X_C_Cash.Table_Name, X_C_Cash.COLUMNNAME_C_DocType_ID, 0);
		doctype.addActionListener(this);
		doctypeLabel.setLabelFor(doctype);
		
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			X_C_POS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
				.setParameters(C_POS_ID).first();
			if (pos != null) {
				if (pos.getC_CashBook_ID() > 0) {
					cashbook.setValue(pos.getC_CashBook_ID());					
					doctype.setValue(pos.getCash_C_DocType_ID());
				}				
			}
		}		
		try {			
			method = cashbook.getClass().getMethod("getValue", null);
			methoddoctype = doctype.getClass().getMethod("getValue", null);
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(MCashBook.COLUMNNAME_C_CashBook_ID,new DefaultDataLookup(cashbook, method, null));

		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addLabel(cashbookLabel);
		middlePanel.addTextField(cashbook);
		middlePanel.addExample(new JLabel(ResourceLoader.getString("dialog", "machinewizard", "cashbookexample")));
		component.add(middlePanel);		

		WizardTextField credit = new WizardTextField();		
		data.registerDataLookup(X_C_POS.COLUMNNAME_Cash_C_DocType_ID,new DefaultDataLookup(doctype, methoddoctype, null));
		credit.addLabel(doctypeLabel);
		credit.addTextField(doctype);
		credit.addEmptyExample();
		component.add(credit);
		
		
		return component;
	}

	public void prepareRendering() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if (cashbook.getValue() != null) {
			setCanGoNext(true);
		}
	}
}