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

import java.awt.BorderLayout;
import java.lang.reflect.Method;
import java.util.HashMap;

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

import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.MPOS;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.util.Env;
import org.xendra.pos.util.ResourceLoader;

class OptionsStep extends AbstractStep {
    protected DataModel data;    
    protected optcheckbox ismodifyprice = 		new optcheckbox(MachineCreator.ismodifyprice, false);
    protected optcheckbox iscashbased = 		new optcheckbox(MachineCreator.iscashbased, false);
    protected optcheckbox isModifyDate = 		new optcheckbox(MachineCreator.isModifyDate, false);
    protected optcheckbox overwritepricelimit = new optcheckbox(MachineCreator.overwritepricelimit, false);
    protected optcheckbox overwritepricelist  = new optcheckbox(MachineCreator.overwritepricelist, false);
    protected optcheckbox iscandelete		  = new optcheckbox(MachineCreator.iscandelete, false);
    protected optcheckbox ismodifydocnumber   = new optcheckbox(MachineCreator.ismodifydocnumber, false);
    protected optcheckbox isshowDocument	  = new optcheckbox(MachineCreator.isshowDocument, false);
    protected optcheckbox iscredit			  = new optcheckbox(MachineCreator.iscredit, false);
    protected optcheckbox iscash			  = new optcheckbox(MachineCreator.iscash, false);
    protected optcheckbox ispartial			  = new optcheckbox(MachineCreator.ispartial, false);
    protected optcheckbox iscoupon			  = new optcheckbox(MachineCreator.iscoupon, false);
    protected optcheckbox ispayment			  = new optcheckbox(MachineCreator.ispayment, false);
    protected optcheckbox iscanvoid			  = new optcheckbox(MachineCreator.iscanvoid, false);
    protected optcheckbox isallowduplicated   = new optcheckbox(MachineCreator.isallowduplicated, false);
    protected optcheckbox isBalance			  = new optcheckbox(MachineCreator.isBalance, false);
    //protected optcheckbox isSearchAtBegin	  = new optcheckbox(MachineCreator.isSearchAtBegin, false);
    protected optcheckbox isBonusPoints		  = new optcheckbox(MachineCreator.isBonusPoints, false);
    protected optcheckbox isGlobalDiscount	  = new optcheckbox(MachineCreator.isGlobalDiscount, false);
    protected optcheckbox isThirdSalesman	  = new optcheckbox(MachineCreator.isThirdSalesman, false);
    protected optcheckbox isForceSalesman	  = new optcheckbox(MachineCreator.isForceSalesman, false);
    protected optcheckbox isCloseWindow		  = new optcheckbox(MachineCreator.isCloseWindow, false);
    protected optcheckbox ismodifyPriceList	  = new optcheckbox(MachineCreator.ismodifyPriceList, false);
    protected spnfield startcodebalance = new spnfield(MachineCreator.startcodebalance, 0,0,50); 
    protected spnfield endcodebalance = new spnfield(MachineCreator.endcodebalance, 7,0,50);
    protected spnfield startweightbalance = new spnfield(MachineCreator.startweightbalance, 7,0,50);
    protected spnfield endweightbalance = new spnfield(MachineCreator.endweightbalance,12,0,50);
    protected spnfield  nrocopiescollection = new spnfield(MachineCreator.nrocopiescollection,2,1,10);
    protected spnfield 	nrocolumnspanel = new spnfield(MachineCreator.nrocolumnspanel,1,1,4);
    public OptionsStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "machinewizard", "options"),
    			ResourceLoader.getString("dialog", "machinewizard",   "options_description"));
    	this.data = data;
    	setCanGoNext(true);
    }

    protected JComponent createComponent() {    	
        JComponent comp = new JPanel();        
		Machine machine = Env.getMachine();		
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		MPOS posmodel = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null).setParameters(C_POS_ID).first();
		if (posmodel != null)		
        {
        	HashMap props = Env.getMachine().getProperties();        	
        	ismodifyprice.setSelected(getBoolProp(props, MachineCreator.ismodifyprice));
            iscashbased.setSelected(getBoolProp(props, MachineCreator.iscashbased));
            isModifyDate.setSelected(getBoolProp(props, MachineCreator.isModifyDate));
            overwritepricelimit.setSelected(getBoolProp(props, MachineCreator.overwritepricelimit));
            overwritepricelist.setSelected(getBoolProp(props, MachineCreator.overwritepricelist));
            iscandelete.setSelected(getBoolProp(props, MachineCreator.iscandelete));
            ismodifydocnumber.setSelected(getBoolProp(props, MachineCreator.ismodifydocnumber));
            isshowDocument.setSelected(getBoolProp(props, MachineCreator.isshowDocument));
            iscredit.setSelected(getBoolProp(props, MachineCreator.iscredit));
            iscash.setSelected(getBoolProp(props, MachineCreator.iscash));
            ispartial.setSelected(getBoolProp(props, MachineCreator.ispartial));
            iscoupon.setSelected(getBoolProp(props, MachineCreator.iscoupon));
            ispayment.setSelected(getBoolProp(props, MachineCreator.ispayment));
            iscanvoid.setSelected(getBoolProp(props, MachineCreator.iscanvoid));
            isallowduplicated.setSelected(getBoolProp(props, MachineCreator.isallowduplicated));
            isBalance.setSelected(getBoolProp(props, MachineCreator.isBalance));
            //isSearchAtBegin.setSelected(getBoolProp(props, MachineCreator.isSearchAtBegin));
            isBonusPoints.setSelected(getBoolProp(props, MachineCreator.isBonusPoints));
            isGlobalDiscount.setSelected(getBoolProp(props, MachineCreator.isGlobalDiscount));
            isThirdSalesman.setSelected(getBoolProp(props, MachineCreator.isThirdSalesman));
            isForceSalesman.setSelected(getBoolProp(props, MachineCreator.isForceSalesman));
            isCloseWindow.setSelected(getBoolProp(props, MachineCreator.isCloseWindow));
            ismodifyPriceList.setSelected(getBoolProp(props, MachineCreator.ismodifyPriceList));
            startcodebalance.setValue(getIntProp(props, MachineCreator.startcodebalance,0));
            endcodebalance.setValue(getIntProp(props,MachineCreator.endcodebalance,7));
            startweightbalance.setValue(getIntProp(props,MachineCreator.startweightbalance,7));
            endweightbalance.setValue(getIntProp(props,MachineCreator.endweightbalance,12));
            nrocopiescollection.setValue(getIntProp(props,MachineCreator.nrocopiescollection,2));        	  
            nrocolumnspanel.setValue(getIntProp(props,MachineCreator.nrocolumnspanel, 1));
        }
        JPanel pan1 = new JPanel();        
        pan1.setLayout(new MigLayout("flowy", "[75%,fill,grow]", "[fill,grow]"));
		add(pan1, iscredit);
		add(pan1, iscash);
		add(pan1, ispartial);
		add(pan1, iscoupon);
		add(pan1, ispayment);
		add(pan1, iscanvoid);
		add(pan1, isallowduplicated);
        add(pan1, ismodifyprice);
        add(pan1, iscashbased);
    	add(pan1, isModifyDate);
    	add(pan1, nrocopiescollection);
        JPanel pan2 = new JPanel();        
        pan2.setLayout(new MigLayout("flowy", "[75%,fill,grow]", "[fill,grow]"));        
        add(pan2, iscandelete);
		add(pan2, ismodifydocnumber);
		add(pan2, isshowDocument);
		add(pan2, isBalance);
		add(pan2, startcodebalance);
		add(pan2, endcodebalance);
		add(pan2, startweightbalance);
		add(pan2, endweightbalance);
        JPanel pan3 = new JPanel();        
        pan3.setLayout(new MigLayout("flowy", "[75%,fill,grow]", "[fill,grow]"));
        add(pan3, overwritepricelimit);
		add(pan3, overwritepricelist);
		//add(pan3, isSearchAtBegin);
		add(pan3, isBonusPoints);
		add(pan3, isGlobalDiscount);
		add(pan3, isThirdSalesman);
		add(pan3, isForceSalesman);
		add(pan3, isCloseWindow);
		add(pan3, ismodifyPriceList);		
		add(pan3, nrocolumnspanel);
		comp.add(pan1,  BorderLayout.WEST);
		comp.add(pan2,  BorderLayout.CENTER);
		comp.add(pan3,  BorderLayout.EAST);
        return comp;
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
	
	public void prepareRendering() {
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