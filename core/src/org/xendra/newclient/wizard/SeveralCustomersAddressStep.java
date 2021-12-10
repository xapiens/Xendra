package org.xendra.newclient.wizard;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLocation;
import org.compiere.model.MLocationLookup;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.util.Env;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class SeveralCustomersAddressStep extends AbstractStep {

	private DataModel data;	

	public SeveralCustomersAddressStep(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public SeveralCustomersAddressStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "SeveralCustomersAddress"),
				ResourceLoader.getString("dialog", "newclient",   "SeveralCustomersAddress"));				
		this.data = data;
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "SeveralCustomersAddress")));
		component.add(Box.createVerticalStrut(40));		
		
		WizardTextField locationPanel = new WizardTextField();
		LabelWithMnemonic loclabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "location"));
		VLocation location = new VLocation(X_C_Location.COLUMNNAME_Address2, false, false, true, new MLocationLookup(Env.getCtx(), 0));
		Method locmethod = null;		
		try {			
			locmethod = location.getClass().getMethod("getValue", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    			
		data.registerDataLookup(X_C_Location.COLUMNNAME_Address2,new DefaultDataLookup(location, locmethod, null));
		locationPanel.addLabel(loclabel);
		locationPanel.addTextField(location);        			
		locationPanel.addEmptyExample();
		component.add(locationPanel);		
		return component;		
	}
	
	public void prepareRendering() {
	}	
}
