package org.xendra.newclient.wizard;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.swing.CTextField;
import org.xendra.newclient.i18n.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;


public class TaxNameStep extends AbstractStep {
	protected DataModel data;
	private CTextField taxname = new CTextField("IGV");
	public TaxNameStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "taxname"),
				ResourceLoader.getString("dialog", "newclient",   "taxname_description"));
		this.data = data;    
		this.setCanGoNext(true);		
	}	
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "taxname_text")));
		component.add(Box.createVerticalStrut(40));
		LabelWithMnemonic psLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "taxname"));
		//clientname  = new CTextField(20);    	
		psLabel.setLabelFor(taxname);
		WizardTextField middlePanel = new WizardTextField();		
		Method method = null;
		try {			
			method = taxname.getClass().getMethod("getText", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup(X_C_Tax.COLUMNNAME_C_Tax_ID,new DefaultDataLookup(taxname, method, null));
		middlePanel.addLabel(psLabel);
		middlePanel.addTextField(taxname);        			
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;
	}
	public void prepareRendering() {
	}
}
