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
package org.xendra.pop.wizard;

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
import org.xendra.pop.util.ResourceLoader;
import org.compiere.util.Env;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.MPOP;
import org.compiere.model.MWarehouse;
import org.compiere.model.persistence.X_C_POP;
import org.compiere.model.persistence.X_M_Warehouse;

class WarehouseStep extends AbstractStep {
	protected DataModel data;

	public WarehouseStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "warehouse"),
				ResourceLoader.getString("dialog", "machinewizard", "warehouse_description"));
		this.data = data;
		setCanGoNext(false);
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "warehouse_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField middlePanel = new WizardTextField();

		Method method = null;

		LabelWithMnemonic warehouseLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "rule"));
		JComboBox warehouseComboBox = new JComboBox();		
		warehouseLabel.setLabelFor(warehouseComboBox);               

		Machine machine = Env.getMachine();
		int warehouseid = 0;
		Integer C_POP_ID = machine.getIntProperty(X_C_POP.COLUMNNAME_C_POP_ID);
		if (C_POP_ID > 0)
		{
			MPOP pop = new Query(Env.getCtx(), X_C_POP.Table_Name, "C_POP_ID = ?", null).setParameters(C_POP_ID).first();
			if (pop != null && pop.getM_Warehouse_ID() > 0 )
			{
				warehouseid = pop.getM_Warehouse_ID();
			}			
		}
		String query = "isactive = 'Y' ";
		List<MWarehouse> whlist = new Query(Env.getCtx(), MWarehouse.Table_Name, query, null).list();
		for (MWarehouse wh:whlist)
		{
			warehouseComboBox.addItem(wh);
			if (warehouseid > 0 && warehouseid == wh.getM_Warehouse_ID())
			{
				warehouseComboBox.setSelectedItem(wh);
				setCanGoNext(true);
			}
		}						
		if (warehouseid == 0)
		{
			if (warehouseComboBox.getModel().getSize() > 0)
			{
				warehouseComboBox.setSelectedIndex(0);
				setCanGoNext(true);
			}
		}
		try {
			method = warehouseComboBox.getClass().getMethod("getSelectedItem", null);
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_M_Warehouse.COLUMNNAME_M_Warehouse_ID,new DefaultDataLookup(warehouseComboBox, method, null));        
		middlePanel.addTextField(warehouseComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}

	public void prepareRendering() {
	}
}