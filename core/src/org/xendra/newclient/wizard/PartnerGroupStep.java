package org.xendra.newclient.wizard;

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BP_Group;
import org.compiere.swing.CComboBox;
import org.compiere.util.Env;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PartnerGroupStep extends AbstractStep {
	protected DataModel data;
	private CComboBox fCurrency;
	public PartnerGroupStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "newclient", "partnergroup"),
    			ResourceLoader.getString("dialog", "newclient",   "partnergroup_description"));
    	this.data = data;
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "partnergroup_text")));
        component.add(Box.createVerticalStrut(40));
        
		WizardTextField middlePanel = new WizardTextField();
		
		Method method = null;
		
		LabelWithMnemonic saleslabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "partnergroup"));
		JComboBox PartnerGroupComboBox = new JComboBox();
		saleslabel.setLabelFor(PartnerGroupComboBox);
		List<X_C_BP_Group> ulist = new Query(Env.getCtx(), X_C_BP_Group.Table_Name, "IsActive = 'Y'", null).list();
		for (X_C_BP_Group bpgroup:ulist) {
			PartnerGroupComboBox.addItem(bpgroup);
		}
		try {
			method = PartnerGroupComboBox.getClass().getMethod("getSelectedItem", null);
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_C_BP_Group.COLUMNNAME_C_BP_Group_ID,new DefaultDataLookup(PartnerGroupComboBox, method, null));
		middlePanel.addLabel(saleslabel);
		middlePanel.addTextField(PartnerGroupComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;				
	}
	public void prepareRendering() {
	}	
}
