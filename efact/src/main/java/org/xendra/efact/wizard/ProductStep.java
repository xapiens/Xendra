package org.xendra.efact.wizard;

import java.lang.reflect.Method;
import javax.swing.JPanel;
import javax.swing.JComponent;
import org.columba.core.gui.base.LabelWithMnemonic;
import org.compiere.model.persistence.X_M_Product;
import org.xendra.efact.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class ProductStep extends AbstractStep {
	
	protected DataModel data;
	private PriceTypeCodePanel m_pricetypecodepanel = new PriceTypeCodePanel();
	private Method method;
	
	public ProductStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "efactwizard", "pricetypecode"),
    			ResourceLoader.getString("dialog", "efactwizard",   "pricetypecode_description"));
    	this.data = data;
    	setCanGoNext(true);		
	} 
	@Override
	protected JComponent createComponent() {
		JComponent comp = new JPanel(new MigLayout("fill"));
		//ListModel pdtmodel = (ListModel) data.getData()
		//m_pricetypecodepanel =
		m_pricetypecodepanel.config();
		comp.add(new LabelWithMnemonic(ResourceLoader.getString("dialog", "efactwizard", "pricetypecode_description")), "wrap");
		comp.add(m_pricetypecodepanel);
		try {
			method = m_pricetypecodepanel.getClass().getMethod("getModel", null);			
		} catch (NoSuchMethodException nsme) {			
		}
		data.registerDataLookup(X_M_Product.COLUMNNAME_M_Product_Category_ID, new DefaultDataLookup(m_pricetypecodepanel, method, null));
		return comp;
	}	
	
	@Override
	public void prepareRendering() {
	}
}
