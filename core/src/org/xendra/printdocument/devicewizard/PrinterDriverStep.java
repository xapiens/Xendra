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
package org.xendra.printdocument.devicewizard;

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.xendra.printdocument.PrintConstants;
import org.xendra.printdocument.wizard.PrintResourceLoader;
import org.compiere.util.Env;
import org.compiere.model.MPrinterDriver;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_PrinterDriver;

public class PrinterDriverStep extends AbstractStep {
    protected DataModel data;
    protected JComboBox cbPrintDriver;
    private PO m_model;	
    
    public PrinterDriverStep(DataModel data) {
        super(PrintResourceLoader.getString("dialog", "machinewizard", "printerdriver"),
        	  PrintResourceLoader.getString("dialog", "machinewizard",   "printerdriver_description"));
        this.data = data;
        setCanGoNext(true);
    }

    protected JComponent createComponent() {    	
    	JComponent component = new JPanel();
    	component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
    	component.add(new MultiLineLabel(PrintResourceLoader.getString("dialog", "machinewizard", "printerdriver_text")));
    	component.add(Box.createVerticalStrut(40));

    	WizardTextField middlePanel = new WizardTextField();

    	Method method = null;

    	LabelWithMnemonic psLabel = new LabelWithMnemonic(PrintResourceLoader.getString("dialog", "machinewizard", "printerdriver"));
    	cbPrintDriver = new JComboBox();
    	psLabel.setLabelFor(cbPrintDriver);               
		List<MPrinterDriver> printers = new Query(Env.getCtx(), MPrinterDriver.Table_Name, "IsActive = 'Y'", null)
			.list();
		for (MPrinterDriver printer:printers)
		{
			cbPrintDriver.addItem(printer);        			    					
		}
		try {
			method = cbPrintDriver.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {
		}			
		data.registerDataLookup(PrintConstants.PrintDriver,new DefaultDataLookup(cbPrintDriver, method, null));                    
		middlePanel.addTextField(cbPrintDriver);        			
		middlePanel.addEmptyExample();
		component.add(middlePanel);    	    	
    	return component;
    }

	public void prepareRendering() {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                	cbPrintDriver.requestFocus();
                }
            });
    }
}