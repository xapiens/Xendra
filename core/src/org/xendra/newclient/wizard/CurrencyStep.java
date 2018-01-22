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
import org.compiere.model.MCurrency;
import org.compiere.model.MUser;
import org.compiere.model.Query;
import org.compiere.swing.CComboBox;
import org.compiere.util.Env;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class CurrencyStep extends AbstractStep {
	protected DataModel data;
	private CComboBox fCurrency;
	public CurrencyStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "newclient", "currency"),
    			ResourceLoader.getString("dialog", "newclient",   "currency_description"));
    	this.data = data;
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "currency_text")));
        component.add(Box.createVerticalStrut(40));
        
		WizardTextField middlePanel = new WizardTextField();
		
		Method method = null;
		
		LabelWithMnemonic saleslabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "currency"));
		JComboBox salesrepComboBox = new JComboBox();
		saleslabel.setLabelFor(salesrepComboBox);
		List<MCurrency> ulist = new Query(Env.getCtx(), MCurrency.Table_Name, "IsActive = 'Y'", null).list();
		for (MCurrency currency:ulist) {
			salesrepComboBox.addItem(currency);
		}
		try {
			method = salesrepComboBox.getClass().getMethod("getSelectedItem", null);
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(MCurrency.COLUMNNAME_C_Currency_ID,new DefaultDataLookup(salesrepComboBox, method, null));
		middlePanel.addLabel(saleslabel);
		middlePanel.addTextField(salesrepComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;				
	}
	public void prepareRendering() {
	}
}
