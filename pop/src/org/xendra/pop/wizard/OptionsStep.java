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

import java.awt.BorderLayout;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.MPOP;
import org.compiere.util.Env;
import org.xendra.Constants;
import org.xendra.pop.util.ResourceLoader;
import org.xendra.pop.wizard.MachineCreator;

class OptionsStep extends AbstractStep {
    protected DataModel data;    
    protected optcheckbox ismodifysopricelist = new optcheckbox(MachineCreator.ismodifysopricelist, false);
    protected spnfield 	nrocolumnspanel = new spnfield(MachineCreator.nrocolumnspanel,1,1,4); 
    
    public OptionsStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "machinewizard", "options"),
    			ResourceLoader.getString("dialog", "machinewizard",   "options_description"));
    	this.data = data;
    	setCanGoNext(true);
    }

    protected JComponent createComponent() {    	
        JComponent component = new JPanel();
        MPOP posmodel = (MPOP) data.getData(Constants.Model);
        if (posmodel != null)
        {
        	HashMap props = Env.getMachine().getProperties();
        	ismodifysopricelist.setSelected(getBoolProp(props, MachineCreator.ismodifysopricelist));
        	nrocolumnspanel.setValue(getIntProp(props, MachineCreator.nrocolumnspanel,1));        	
        }
        JPanel pan1 = new JPanel();
        //pan1.setLayout(new BoxLayout(pan1, BoxLayout.PAGE_AXIS));
        pan1.setLayout(new MigLayout("flowy", "[75%,fill,grow]", "[fill,grow]"));        
		add(pan1, ismodifysopricelist);
		add(pan1, nrocolumnspanel);
		component.add(pan1,  BorderLayout.WEST);
        component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "options_text")));
        component.add(Box.createVerticalStrut(40)); 

        return component;
    }

    private int getIntProp(HashMap props, String key, int defaultvalue) {
    	if (props.containsKey(key) && props.get(key) != null)
    		return Integer.valueOf(props.get(key).toString());
    	else
    		return defaultvalue;
    }
    
	private boolean getBoolProp(HashMap props, String key) {
		if (props.containsKey(key))
		{
			Object value = props.get(key);
			if (value instanceof Boolean)
				return (boolean) value;
			else if (value instanceof String)
				return value.equals("true");
		}
		return false;
	}

	private void add(JComponent component, spnfield spinner) {
		WizardTextField textfield = new WizardTextField();		
		try {					
			Method method = spinner.getClass().getMethod("getValue", null);
			data.registerDataLookup(spinner.getName(),new DefaultDataLookup(spinner, method, null));
			textfield.addLabel(spinner.getLabel());
			textfield.addTextField(spinner);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			component.add(textfield);			
		}				
	}

	private void add(JComponent component, JCheckBox checkbox) {
		WizardTextField textfield = new WizardTextField();		
		try {			
			Method method = checkbox.getClass().getMethod("isSelected", null);
			data.registerDataLookup(checkbox.getName(),new DefaultDataLookup(checkbox, method, null));                    
			textfield.addTextField(checkbox);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			component.add(textfield);			
		}		
	}

	private void addText(JComponent component, optTextField text) {
		WizardTextField textfield = new WizardTextField();		
		try {			
			Method method = text.getClass().getMethod("getText", null);
			data.registerDataLookup(text.getName(),new DefaultDataLookup(text, method, null));          
			textfield.addLabel(text.getLabel());
			textfield.addTextField(text);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			component.add(textfield);			
		}		
	}
	
	public void prepareRendering() {
//        SwingUtilities.invokeLater(new Runnable() {
//                public void run() {
//                	cbPrintServer.requestFocus();
//                }
//            });
    }
}
class optTextField extends JTextField {
	JLabel labelname = new JLabel();
	public optTextField(String name, String defaultvalue) {
		setName(name);
		String text = ResourceLoader.getString("dialog", "machinewizard", name);
		labelname.setText(text);
		setText(defaultvalue);
	}
	public JLabel getLabel()
	{
		return labelname;
	}
}
class optcheckbox extends JCheckBox {

	public optcheckbox(String name, boolean ischeck) {
		setName(name);
		String text = ResourceLoader.getString("dialog", "machinewizard", name);
		setText(text);
		setSelected(ischeck);
	}	
}
class spnfield extends JSpinner {
	JLabel labelname = new JLabel();
	public spnfield(String name, int value, int min, int max) {
		setName(name);
		String text = ResourceLoader.getString("dialog", "machinewizard", name);
		labelname.setText(text);
		labelname.setLabelFor(this);
		setModel(new SpinnerNumberModel(value,min,max,1));
	}
	public JLabel getLabel()
	{
		return labelname;
	}	
	
}