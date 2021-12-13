package org.xendra.invoice.wizard;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.MPOP;
import org.compiere.model.MPriceList;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POP;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.model.persistence.X_M_PriceList_Version;
import org.compiere.util.Env;
import org.xendra.pop.util.ResourceLoader;
import org.xendra.swing.PriceListCtrl;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PickPriceList extends AbstractStep {
	protected DataModel data;
	private PriceListCtrl pricelist = new PriceListCtrl(false);
	public PickPriceList(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "pricelist"),
				ResourceLoader.getString("dialog", "machinewizard",   "pricelist_description"));
		this.data = data;		
		setCanGoNext(true);		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "pricelist_text")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField middlePanel = new WizardTextField();
		
		Method methodpl = null;
		Method methodplv = null;
		LabelWithMnemonic pricelistLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "pricelist"));		
		pricelistLabel.setLabelFor(pricelist);
		Machine machine = Env.getMachine();
		Integer C_POP_ID = machine.getIntProperty(X_C_POP.COLUMNNAME_C_POP_ID);
		MPOP pop = new Query(Env.getCtx(), X_C_POP.Table_Name, "C_POP_ID = ?", null)
			.setParameters(C_POP_ID).first();		
		if (pop != null && pop.getM_PriceList_ID() > 0) {
			MPriceList pl = new Query(Env.getCtx(), MPriceList.Table_Name, "M_PriceList_ID = ?", null)
				.setParameters(pop.getM_PriceList_ID()).first();			
			pricelist.setM_PriceList_ID(pl.getM_PriceList_ID());
		}
		try {
			methodpl = pricelist.getClass().getMethod("getM_PriceList_ID", null);
			methodplv = pricelist.getClass().getMethod("getM_PriceList_Version_ID", null);
		} catch (NoSuchMethodException nsme) {
			nsme.printStackTrace();
		}

		data.registerDataLookup(X_M_PriceList.COLUMNNAME_M_PriceList_ID,new DefaultDataLookup(pricelist, methodpl, null));
		data.registerDataLookup(X_M_PriceList_Version.COLUMNNAME_M_PriceList_Version_ID,new DefaultDataLookup(pricelist, methodplv, null));
		middlePanel.addLabel(pricelistLabel);
		middlePanel.addTextField(pricelist);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;				
	}
	
	public void prepareRendering() {
	}	
}
