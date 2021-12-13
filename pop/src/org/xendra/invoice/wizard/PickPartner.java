package org.xendra.invoice.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Method;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;

import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLocation;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MLocation;
import org.compiere.model.MLocationLookup;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.util.Env;
import org.xendra.pop.util.ResourceLoader;

public class PickPartner extends AbstractStep implements VetoableChangeListener {
	protected DataModel data;
	private VLookup pickPartner = VLookup.createBPartner(0);
	private VLocation location;

	public PickPartner(DataModel data) {
		super(ResourceLoader.getString("dialog", "pop", "importpartner"),
				ResourceLoader.getString("dialog", "pop",   "importpartner_description"));		
		this.data = data;
		this.setCanGoNext(true);					
	}
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		WizardTextField middlePanel = new WizardTextField();
		pickPartner.setValue(InvoiceParser.getInstance().getC_BPartner_ID());
		pickPartner.setReadWrite(false);
		middlePanel.addTextField(pickPartner);		
		location = new VLocation(X_C_Location.COLUMNNAME_C_Location_ID, false, false, true, new MLocationLookup(Env.getCtx(), 0));
		location.setReadWrite(true);
		MLocation loc = MLocation.getBPLocation(Env.getCtx(), InvoiceParser.getInstance().getC_BPartner_Location_ID(), null);
		if (loc != null) {
			location.setValue(loc.getC_Location_ID());		
		}
		location.addVetoableChangeListener(this);
		WizardTextField middlePanel2 = new WizardTextField();
		middlePanel2.addTextField(location);
		component.add(middlePanel);
		component.add(middlePanel2);
		return component;
	}
	public void prepareRendering() {
	}
	@Override
	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
		if (evt.getPropertyName().equals(X_C_Location.COLUMNNAME_C_Location_ID)) {
			VLocation xx = (VLocation) evt.getSource();
			int xxq = (int) xx.getValue();			
			InvoiceParser.getInstance().setC_BPartner_Location_ID(xxq);
		}		
	}
}

