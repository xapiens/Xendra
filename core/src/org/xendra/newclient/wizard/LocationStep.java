package org.xendra.newclient.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLocation;
import org.compiere.model.MLocation;
import org.compiere.model.MLocationLookup;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.util.Env;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class LocationStep extends AbstractStep implements VetoableChangeListener   {
	protected DataModel data;
	private VLocation location;

	public LocationStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "location"),
				ResourceLoader.getString("dialog", "newclient",   "location_description"));
		this.data = data;
		this.setCanGoNext(false);
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "location_text")));
		component.add(Box.createVerticalStrut(40));		

		WizardTextField locationPanel = new WizardTextField();
		LabelWithMnemonic loclabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "location"));
		location = new VLocation(X_C_Location.COLUMNNAME_C_Location_ID, false, false, true, new MLocationLookup(Env.getCtx(), 0));
		location.addVetoableChangeListener(this);
		Method locmethod = null;		
		try {			
			locmethod = location.getClass().getMethod("getValue", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    			
		data.registerDataLookup(X_C_Location.COLUMNNAME_Address1,new DefaultDataLookup(location, locmethod, null));
		locationPanel.addLabel(loclabel);
		locationPanel.addTextField(location);        			
		locationPanel.addEmptyExample();
		component.add(locationPanel);		
		return component;		
	}


	public void prepareRendering() {
	}


	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
		Integer locationid = (Integer) location.getValue();
		if (locationid != null) {
			MLocation location = new Query(Env.getCtx(), MLocation.Table_Name, "C_Location_ID = ? ", null)
			.setParameters(locationid).first();
			if (location.getC_City_ID() > 0 && location.getC_Country_ID() > 0 && location.getC_Region_ID() > 0) {
				this.setCanGoNext(true);			
			}			
		}
	}
}
