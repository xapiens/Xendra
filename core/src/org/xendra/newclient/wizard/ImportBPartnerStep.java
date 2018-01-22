package org.xendra.newclient.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.miginfocom.swing.MigLayout;

public class ImportBPartnerStep extends AbstractStep implements PropertyChangeListener {
	private FileImportPanel fileimportpanel = null;
	
	public ImportBPartnerStep() {
		super(ResourceLoader.getString("dialog", "newclient", "importbpartner"),
				ResourceLoader.getString("dialog", "newclient",   "importbpartner_description"));		
		this.setCanGoNext(false);		
	}
	
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout());
		fileimportpanel = new FileImportPanel("a3eaf0a7-3b29-2920-9953-6e0d00ea21e0");		
		fileimportpanel.addPropertyChangeListener(this);
		Method method = null;
		try {			
			method = fileimportpanel.getClass().getMethod("getText", null);
		} 
		catch (NoSuchMethodException nsme) {
		}		
		component.add(fileimportpanel, "wrap");
		return component;
	}
	public void prepareRendering() {
	}
	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if (e.getPropertyName().equals("sucessfully")) 
			setCanGoNext((Boolean)e.getNewValue());		
	}
}
