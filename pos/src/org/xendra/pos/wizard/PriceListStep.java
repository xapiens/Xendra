package org.xendra.pos.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import org.compiere.model.MPOS;
import org.compiere.model.MPriceList;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.model.persistence.X_M_PriceList_Version;
import org.compiere.util.Env;
import org.xendra.pos.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.xendra.swing.PriceListCtrl;

public class PriceListStep extends AbstractStep implements ActionListener  {
	protected DataModel data;
	private PriceListCtrl salespricelist = new PriceListCtrl(true);	
	public PriceListStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "pricelist"),
				ResourceLoader.getString("dialog", "machinewizard",   "pricelist_description"));
		this.data = data;		
		setCanGoNext(false);		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "pricelist_text")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField middlePanel = new WizardTextField();
		
		salespricelist.addListener(this);
		
		Method methodpl = null;
		Method methodplv = null;
		LabelWithMnemonic pricelistLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "pricelist"));		
		pricelistLabel.setLabelFor(salespricelist);
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		MPOS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
			.setParameters(C_POS_ID).first();		
		if (pos != null && pos.getM_PriceList_ID() > 0) {
			MPriceList pl = new Query(Env.getCtx(), MPriceList.Table_Name, "M_PriceList_ID = ?", null)
				.setParameters(pos.getM_PriceList_ID()).first();			
			salespricelist.setM_PriceList_ID(pl.getM_PriceList_ID());			
		}
		try {
			methodpl = salespricelist.getClass().getMethod("getM_PriceList_ID", null);
			methodplv = salespricelist.getClass().getMethod("getM_PriceList_Version_ID", null);
		} catch (NoSuchMethodException nsme) {
		}

		data.registerDataLookup(X_M_PriceList.COLUMNNAME_M_PriceList_ID,new DefaultDataLookup(salespricelist, methodpl, null));
		data.registerDataLookup(X_M_PriceList_Version.COLUMNNAME_M_PriceList_Version_ID,new DefaultDataLookup(salespricelist, methodplv, null));
		middlePanel.addLabel(pricelistLabel);
		middlePanel.addTextField(salespricelist);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;				
	}
	
	public void prepareRendering() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setCanGoNext(true);		
	}
	
}
