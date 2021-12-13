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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.StepModelCustomizer;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.util.Env;
import org.compiere.apps.ADialog;
import org.compiere.model.MPOP;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Config;
import org.compiere.model.persistence.X_C_POP;
import org.xendra.Constants;
import org.xendra.pop.util.ResourceLoader;


class IdentityStep extends AbstractStep  implements StepModelCustomizer {
    protected DataModel data;
    protected JTextField addressTextField;
    protected JTextField accountNameTextField;    
    protected JComboBox POPModelComboBox;
    protected JCheckBox newprofile;
    
    public IdentityStep(DataModel data) {
        super(ResourceLoader.getString("dialog", "machinewizard", "identity"),
            ResourceLoader.getString("dialog", "machinewizard",   "identity_description"));
        this.data = data;
        setCanGoNext(false);
    }

    protected JComponent createComponent() {
        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "identity_text")));
        component.add(Box.createVerticalStrut(40));

        WizardTextField middlePanel = new WizardTextField();

        Method method = null;
        Method methodprofile = null;
                
        LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "type"));
        POPModelComboBox = new JComboBox();
        typeLabel.setLabelFor(POPModelComboBox);               

        Machine machine = Env.getMachine();
        Integer C_POP_ID = machine.getIntProperty(X_C_POP.COLUMNNAME_C_POP_ID);
        MPOP pop = new Query(Env.getCtx(), X_C_POP.Table_Name, "C_POP_ID = ?", null).setParameters(C_POP_ID).first();
		String where ="AD_Org_ID = ?";
		List<MPOP> poplist = new Query(Env.getCtx(), MPOP.Table_Name, where, null)        	
		.setParameters(Env.getAD_Org_ID(Env.getCtx())).list();
		for (MPOP ps:poplist)
		{
			POPModelComboBox.addItem(ps);
			if (pop != null)
			{
				if (ps.equals(pop))
					POPModelComboBox.setSelectedItem(ps);
			}
		}				
		POPModelComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MPOP ps = (MPOP) POPModelComboBox.getSelectedItem();
				if (ps != null) {
					setCanGoNext(true);
				} else {
					setCanGoNext(false);
				} 					
			}
		});
		newprofile = new JCheckBox(ResourceLoader.getString("dialog", "machinewizard", "newprofile"));
		newprofile.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
            	if (newprofile.isSelected()) {
            		setCanGoNext(true);
            	} else {
            		setCanGoNext(false);
            	}
                //TileFactory factory = factories.get(combo.getSelectedIndex());
                //mapViewer.setTileFactory(factory);
            }
        });		
        try {
            method = POPModelComboBox.getClass().getMethod("getSelectedItem", null);
            methodprofile = newprofile.getClass().getMethod("isSelected", null);
        } catch (NoSuchMethodException nsme) {
        }        
        data.registerDataLookup(Constants.Model,new DefaultDataLookup(POPModelComboBox, method, null));
        data.registerDataLookup(X_AD_Config.COLUMNNAME_AD_Config_ID, new DefaultDataLookup(newprofile, methodprofile, null));
        middlePanel.addTextField(POPModelComboBox);
        middlePanel.addEmptyExample();        
        middlePanel.addTextField(newprofile);
        middlePanel.addEmptyExample();
        component.add(middlePanel);        
        return component;
    }

    public void prepareRendering() {

    }
	public Step[] getPendingSteps() {					
		List<Step> steps = new ArrayList<Step>();
		//if (newprofile.isSelected())
		Boolean newprofile = (Boolean) data.getData(X_AD_Config.COLUMNNAME_AD_Config_ID);
		if (newprofile)
			steps.add(new ProfileStep(data));
		steps.add(new RuleStep(data));
		steps.add(new WarehouseStep(data));
		steps.add(new OptionsStep(data));
		steps.add(new MessageServerStep(data));
		steps.add(new DocTypeStep(data));
		steps.add(new ColumnsPurchaseStep(data));
		//steps.add(new ColumnsBothStep(data));
		steps.add(new ColumnsUpdateStep(data));
		steps.add(new FinishStep());
		Step[] list = new Step[steps.size()];
		steps.toArray(list);
		return list;
	}
}