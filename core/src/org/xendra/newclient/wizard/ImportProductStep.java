package org.xendra.newclient.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.miginfocom.swing.MigLayout;

public class ImportProductStep extends AbstractStep implements PropertyChangeListener {	
	private FileImportPanel fileimportpanel = null;  	
	public ImportProductStep() {
		super(ResourceLoader.getString("dialog", "newclient", "importproduct"),
				ResourceLoader.getString("dialog", "newclient",   "importproduct_description"));		
		this.setCanGoNext(false);		
	}	
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout());
		fileimportpanel = new FileImportPanel("6ba7797c-4867-c983-8522-90f6200e4775");
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