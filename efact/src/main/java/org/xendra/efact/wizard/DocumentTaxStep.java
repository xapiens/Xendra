package org.xendra.efact.wizard;

import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.ListModel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.util.Env;
import org.xendra.efact.util.ResourceLoader;
import org.xendra.efact.wizard.documenttax.DocumentTaxPanel;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class DocumentTaxStep extends AbstractStep {
	
	protected DataModel data;
	private DocumentTaxPanel m_doctaxpanel = new DocumentTaxPanel();
	private Method method;
	
	public DocumentTaxStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "efactwizard", "doctypedocumenttax"),
    			ResourceLoader.getString("dialog", "efactwizard",   "doctypedocumenttax_description"));
    	this.data = data;
    	setCanGoNext(true);
	}
	@Override
	protected JComponent createComponent() {
		JComponent comp = new JPanel(new MigLayout("fill"));
		ListModel pdtmodel = (ListModel) data.getData(X_C_DocType.COLUMNNAME_C_DocType_ID);
		m_doctaxpanel.set(pdtmodel);
		m_doctaxpanel.invalidate();		
		comp.add(new LabelWithMnemonic(ResourceLoader.getString("dialog", "efactwizard", "doctypedocumenttax_description")),"wrap");
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