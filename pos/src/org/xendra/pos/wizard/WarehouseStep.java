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
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
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
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MPOS;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.MWarehouse;
import org.compiere.model.persistence.X_C_Cash;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_M_Warehouse;
import org.xendra.pos.util.ResourceLoader;

public class WarehouseStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private VLookup warehouse;
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

		LabelWithMnemonic warehouseLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "warehouse"));
		//JComboBox warehouseComboBox = new JComboBox();
		//warehouseComboBox.addActionListener(this);
		//warehouseLabel.setLabelFor(warehouseComboBox);
		warehouse = VLookup.create(X_C_POS.Table_Name, X_C_POS.COLUMNNAME_M_Warehouse_ID, 0);
		warehouse.addActionListener(this);
		warehouseLabel.setLabelFor(warehouse);
		

		Machine machine = Env.getMachine();
		MWarehouse w = null;
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0)
		{
			MPOS posmodel = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null).setParameters(C_POS_ID).first();
			if (posmodel != null)
			{
				warehouse.setValue(posmodel.getM_Warehouse_ID());
			}			
		}
		try {
			method = warehouse.getClass().getMethod("getValue", null);
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_M_Warehouse.COLUMNNAME_M_Warehouse_ID,new DefaultDataLookup(warehouse, method, null));
		middlePanel.addLabel(warehouseLabel);
		middlePanel.addTextField(warehouse);
		middlePanel.addExample(new JLabel("Almacenes"));
		component.add(middlePanel);

		return component;
	}

	public void prepareRendering() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (warehouse.getValue() != null) {
			setCanGoNext(true);
		}
	}
}