package org.xendra.newclient.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.miginfocom.swing.MigLayout;

public class ImportAccountsStep extends AbstractStep implements PropertyChangeListener {
	private FileImportPanel fileimportpanel = null;
	public ImportAccountsStep() {
		super(ResourceLoader.getString("dialog", "newclient", "importaccounts"),
				ResourceLoader.getString("dialog", "newclient",   "importaccounts_description"));		
		this.setCanGoNext(false);		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout());
		fileimportpanel = new FileImportPanel("cbee83c9-4a28-bfe7-6eee-bd7f4432dd6c");		
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
