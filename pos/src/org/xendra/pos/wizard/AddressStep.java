package org.xendra.pos.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

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
import org.compiere.model.MClient;
import org.compiere.model.MClientInfo;
import org.compiere.model.MCountry;
import org.compiere.model.MLanguage;
import org.compiere.model.MLocationLookup;
import org.compiere.model.MOrgInfo;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.swing.CComboBox;
import org.compiere.util.Env;
import org.xendra.Constants;
import org.xendra.pos.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;

public class AddressStep extends AbstractStep implements VetoableChangeListener {
	protected DataModel data;
	private VLocation 	fAddress;
	private CComboBox	fCountry;
	public AddressStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "machinewizard", "location"),
    			ResourceLoader.getString("dialog", "machinewizard",   "location_description"));
    	this.data = data;
	}

	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createComponent() {
		
		JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "address_text")));
        component.add(Box.createVerticalStrut(40));
		
		
		VLookup pickPartner = VLookup.createBPartner(0);
		
		pickPartner.setMandatory(true);
		pickPartner.addVetoableChangeListener(this);		
		MClient client = MClient.get(Env.getCtx());
		MClientInfo ci = MClientInfo.get(Env.getCtx());
		MBPartner partner = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ? ", null)
			.setParameters(ci.getC_BPartnerCashTrx_ID()).first();
		if (partner != null)		
			pickPartner.setValue(partner.getC_BPartner_ID());
		else
			setCanGoNext(false);
		pickPartner.setReadWrite(false);				
		Integer orgid = (Integer) data.getData(Constants.COLUMNNAME_AD_Org_ID);
        MOrgInfo orginfo = MOrgInfo.get(Env.getCtx(), orgid);        
		fAddress = new VLocation ("C_Location_ID", false, true, false, new MLocationLookup (Env.getCtx(), 0));
		if (orginfo.getC_Location_ID() != 0)
			fAddress.setValue (orginfo.getC_Location_ID());
		if (orginfo.getC_Location_ID() == 0)
			setCanGoNext(false);
		
		WizardTextField textfield = new WizardTextField();		
		LabelWithMnemonic PartnerLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "bpartner_template"));
		textfield.addLabel(PartnerLabel);
		textfield.addTextField(pickPartner);
		textfield.addExample(new JLabel(ResourceLoader.getString("dialog", "machinewizard", "bpartnerexample")));
		
		LabelWithMnemonic AddressLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "address_template"));
		textfield.addLabel(AddressLabel);
		textfield.addTextField(fAddress);
		textfield.addExample(new JLabel("direccion de la organizacion seleccionada al ingresar"));
				
		MLanguage lang = MLanguage.get(Env.getCtx(), client.getAD_Language());
		MCountry country = MCountry.getCountryByCode(Env.getCtx(), lang.getCountryCode());
		
		fCountry = new CComboBox(MCountry.getCountries(Env.getCtx()));
		fCountry.setSelectedItem(country);
		fCountry.setReadWrite(false);		
		
		LabelWithMnemonic CountryLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "country_template"));
		textfield.addLabel(CountryLabel);
		textfield.addTextField(fCountry);
		textfield.addExample(new JLabel(ResourceLoader.getString("dialog", "machinewizard", "countryexample")));
		
		component.add(textfield,"gap 10px");
		
		return component;
	}

	@Override
	public void vetoableChange(PropertyChangeEvent arg0)
			throws PropertyVetoException {
		// TODO Auto-generated method stub
		
	}
}
