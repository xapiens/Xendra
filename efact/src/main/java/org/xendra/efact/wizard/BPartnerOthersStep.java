package org.xendra.efact.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Method;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLocation;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MBPartner;
import org.compiere.model.MClientInfo;
import org.compiere.model.MLocation;
import org.compiere.model.MLocationLookup;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_ClientInfo;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BPartner_Location;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.util.Env;
import org.xendra.efact.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class BPartnerOthersStep extends AbstractStep implements ActionListener, VetoableChangeListener{
	private VLookup BPartner = VLookup.create(X_C_Invoice.Table_Name, X_C_Invoice.COLUMNNAME_C_BPartner_ID, 0);
	protected VLookup BPartnerDT = VLookup.create(X_C_BPartner.Table_Name, X_C_BPartner.COLUMNNAME_C_BP_DocType_ID, 0);
	private VLocation location;
	protected DataModel data;
	public BPartnerOthersStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "efactwizard", "createothers"),
				ResourceLoader.getString("dialog", "efactwizard", "createothers_description"));
		this.data = data;
		setCanGoNext(false);		
	}
	@Override
	public void prepareRendering() {
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (BPartner.getValue() != null) {
			setCanGoNext(true);
		}				
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "efactwizard", "createothers_text")));
		component.add(Box.createVerticalStrut(40));		
		
		Method method = null;
		LabelWithMnemonic partnerLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "efactwizard", "partner"));
		BPartner.addActionListener(this);
		MClientInfo ci = MClientInfo.get(Env.getCtx());
		MBPartner partner = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ? ", null)
				.setParameters(ci.getC_BPartnerCashTrx_ID()).first();						
		BPartner.setValue(partner.getC_BPartner_ID());
		partnerLabel.setLabelFor(BPartner);
		try {			
			method = BPartner.getClass().getMethod("getValue", null);			
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_AD_ClientInfo.COLUMNNAME_C_BPartnerCashTrx_ID,new DefaultDataLookup(BPartner, method, null));		
		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addLabel(partnerLabel);
		middlePanel.addTextField(BPartner);
		middlePanel.addExample(new JLabel(ResourceLoader.getString("dialog", "efactwizard", "pickpartner")));
		component.add(middlePanel);		
		//
		WizardTextField locationPanel = new WizardTextField();		
		LabelWithMnemonic loclabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "efactwizard", "location"));
		location = new VLocation(X_C_Location.COLUMNNAME_C_Location_ID, false, false, true, new MLocationLookup(Env.getCtx(), 0));
		location.addVetoableChangeListener(this);
		X_C_BPartner_Location pl = new Query(Env.getCtx(), X_C_BPartner_Location.Table_Name, "C_BPartner_ID = ?", null)
				.setParameters(partner.getC_BPartner_ID()).first();
		if (pl != null) {
			location.setValue(pl.getC_Location_ID());
			this.setCanGoNext(true);
		}						
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
		//
		WizardTextField PartnerDTPanel = new WizardTextField();
		LabelWithMnemonic parlabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "efactwizard", "anotherdoctype"));
		BPartnerDT.setValue(partner.getC_BP_DocType_ID());
		Method bptmethod = null;
		try {
			bptmethod = BPartnerDT.getClass().getMethod("getValue", null);
		}
		catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_AD_ClientInfo.COLUMNNAME_AD_Tree_BPartner_ID, new DefaultDataLookup(BPartnerDT, bptmethod, null));
		PartnerDTPanel.addLabel(parlabel);
		PartnerDTPanel.addTextField(BPartnerDT);
		PartnerDTPanel.addEmptyExample();
		component.add(PartnerDTPanel);
		return component;
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
