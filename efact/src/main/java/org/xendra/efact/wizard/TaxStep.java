package org.xendra.efact.wizard;

import java.awt.Dimension;
import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.xendra.efact.util.ResourceLoader;
import org.xendra.efact.wizard.tax.TaxPanel;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.miginfocom.swing.MigLayout;

public class TaxStep extends AbstractStep {		
	private TaxPanel m_doctaxpanel = new TaxPanel();	
	
	public TaxStep() {
    	super(ResourceLoader.getString("dialog", "efactwizard", "tax"),
    			ResourceLoader.getString("dialog", "efactwizard",   "tax_description"));    	
    	setCanGoNext(true);
	}
	@Override
	protected JComponent createComponent() {
		JComponent comp = new JPanel(new MigLayout("fill"));
		m_doctaxpanel.initialize();
		m_doctaxpanel.invalidate();		
		comp.add(new LabelWithMnemonic(ResourceLoader.getString("dialog", "efactwizard", "tax_text")),"wrap");
		comp.add(m_doctaxpanel);		
		comp.setPreferredSize(new Dimension(800,400));
		comp.invalidate();
		return comp;
	}	
		
	@Override
	public void prepareRendering() {
	}
}