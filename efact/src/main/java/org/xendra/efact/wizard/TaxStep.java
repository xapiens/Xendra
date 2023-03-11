package org.xendra.efact.wizard;

import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.ListModel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.compiere.model.persistence.X_C_DocType;
import org.xendra.efact.util.ResourceLoader;
import org.xendra.efact.wizard.documenttax.DocumentTaxPanel;
import org.xendra.efact.wizard.tax.TaxPanel;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class TaxStep extends AbstractStep {	
	protected DataModel data;
	private TaxPanel m_doctaxpanel = new TaxPanel();
	private Method method;
	
	public TaxStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "machinewizard", "doctypeprintformat"),
    			ResourceLoader.getString("dialog", "machinewizard",   "doctypeprintformat_description"));
    	this.data = data;
    	setCanGoNext(true);
	}
	@Override
	protected JComponent createComponent() {
		JComponent comp = new JPanel(new MigLayout("fill"));
		ListModel pdtmodel = (ListModel) data.getData(X_C_DocType.COLUMNNAME_C_DocType_ID);
		m_doctaxpanel.set(pdtmodel);
		m_doctaxpanel.invalidate();		
		comp.add(new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "doctypeprintformat_description")),"wrap");
		comp.add(m_doctaxpanel);		
		try {			
			method = m_doctaxpanel.getClass().getMethod("getModel", null);
		} catch (NoSuchMethodException nsme) {
		}		
		data.registerDataLookup(X_C_DocType.COLUMNNAME_C_DocumentTax_ID,new DefaultDataLookup(m_doctaxpanel, method, null));		
		return comp;
	}	
		
	@Override
	public void prepareRendering() {
	}
}