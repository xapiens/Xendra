package org.xendra.newclient.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_City;
import org.compiere.model.persistence.X_C_Country;
import org.compiere.model.persistence.X_C_Location;
import org.compiere.model.persistence.X_C_Region;
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class LocationStep extends AbstractStep implements ActionListener   {
	protected DataModel data;
	private CTextField Address = new CTextField(20);
	private JComboBox cbcountries = new JComboBox();
	private JComboBox cbregions = new JComboBox();
	private JComboBox cbcities = new JComboBox();	

	public LocationStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "location"),
				ResourceLoader.getString("dialog", "newclient",   "location_description"));
		this.data = data;
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient","location_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField addrpanel = new WizardTextField();
		Method methodaddr = null;
		LabelWithMnemonic addrLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "address"));
		addrLabel.setLabelFor(Address);
		try {
			methodaddr = Address.getClass().getMethod("getText", null);			
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_C_Location.COLUMNNAME_Address1, new DefaultDataLookup(Address, methodaddr, null));
		addrpanel.addLabel(addrLabel);
		addrpanel.addTextField(Address);
		addrpanel.addEmptyExample();
		component.add(addrpanel);
		
		WizardTextField middlePanel = new WizardTextField();		
		Method method = null;		
		LabelWithMnemonic conditionLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "country"));		
		conditionLabel.setLabelFor(cbcountries);

		MCurrency currency = (MCurrency) data.getData(MCurrency.COLUMNNAME_C_Currency_ID);

		List<X_C_Country> countries = new Query(Env.getCtx(), X_C_Country.Table_Name, "not ad_language isnull", null)
		.setOrderBy("name").list();
		for (X_C_Country country:countries) {
			cbcountries.addItem(country);			
			if (country.getC_Currency_ID() == currency.getC_Currency_ID()) {
				cbcountries.setSelectedItem(country);
			}
		}		
		try {
			method = cbcountries.getClass().getMethod("getSelectedItem", null);
		} 
		catch (NoSuchMethodException nsme) {}				
		cbcountries.addActionListener(this);
		data.registerDataLookup(X_C_Country.COLUMNNAME_C_Country_ID,new DefaultDataLookup(cbcountries, method, null));
		middlePanel.addLabel(conditionLabel);
		middlePanel.addTextField(cbcountries);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		//
		WizardTextField cash = new WizardTextField();
		Method methodcash = null;
		LabelWithMnemonic cashLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog","machinewizard", "region"));		
		cashLabel.setLabelFor(cbregions);
		X_C_Country country = (X_C_Country) cbcountries.getSelectedItem();
		fillregions(country);
		try {
			methodcash = cbregions.getClass().getMethod("getSelectedItem", null);
		}
		catch (NoSuchMethodException nsme) {}
		cbregions.addActionListener(this);
		data.registerDataLookup(X_C_Region.COLUMNNAME_C_Region_ID, new DefaultDataLookup(cbregions, methodcash, null));
		cash.addLabel(cashLabel);
		cash.addTextField(cbregions);
		cash.addEmptyExample();
		component.add(cash);
		//
		WizardTextField credit = new WizardTextField();
		Method methodcredit = null;
		LabelWithMnemonic creditLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "city"));
		creditLabel.setLabelFor(cbcities);		
		List<X_C_City> cities = null;
		X_C_Region region = (X_C_Region) cbregions.getSelectedItem();
		fillcities(region);		
		try {
			methodcredit  = cbcities.getClass().getMethod("getSelectedItem", null);
		}
		catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_C_City.COLUMNNAME_C_City_ID,new DefaultDataLookup(cbcities, methodcredit, null));
		credit.addLabel(creditLabel);
		credit.addTextField(cbcities);
		credit.addEmptyExample();
		component.add(credit);
		//
		return component;
	}

	public void prepareRendering() {
	}

	public void fillregions(X_C_Country country) {
		cbregions.removeAllItems();
		if (country != null) {
			List<X_C_Region> regions = new Query(Env.getCtx(), X_C_Region.Table_Name, "C_Country_ID = ?", null)
			.setParameters(country.getC_Country_ID()).setOrderBy("Name").list();					
			for (X_C_Region region:regions) {
				cbregions.addItem(region);	
				if (region.isDefault())
					cbregions.setSelectedItem(region);
			}
		}
		X_C_Region region = (X_C_Region) cbregions.getSelectedItem();
		if (region == null && cbregions.getModel().getSize() > 0) {
			region = (X_C_Region) cbregions.getItemAt(0);			
		}
		fillcities(region);
	}	
	public void fillcities(X_C_Region region) {
		cbcities.removeAllItems();
		if (region != null) {
			List<X_C_City> cities = new Query(Env.getCtx(), X_C_City.Table_Name, "C_Region_ID = ?", null)
			.setParameters(region.getC_Region_ID()).setOrderBy("Name").list();		
			for (X_C_City city:cities) {
				cbcities.addItem(city);
				if (city.isDefault())
					cbcities.setSelectedItem(city);
			}
		}
		X_C_City city = (X_C_City) cbcities.getSelectedItem();
		if (city == null && cbcities.getModel().getSize() > 0) {
			cbcities.setSelectedIndex(0);
		}		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(cbcountries)) {
			X_C_Country country = (X_C_Country) cbcountries.getSelectedItem();
			fillregions(country);
		} else if (e.getSource().equals(cbregions)) {
			X_C_Region region = (X_C_Region) cbregions.getSelectedItem();
			fillcities(region);
		}		
	}
}
