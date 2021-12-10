package org.xendra.newclient.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.miginfocom.swing.MigLayout;

public class ImportSchemaDefaultStep extends AbstractStep implements PropertyChangeListener{
	private FileImportPanel fileimportpanel = null;
	public ImportSchemaDefaultStep() {
		super(ResourceLoader.getString("dialog", "newclient", "importschemadefault"),
				ResourceLoader.getString("dialog", "newclient",   "importschemadefault_description"));		
		this.setCanGoNext(false);		
	}	
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout());
		fileimportpanel = new FileImportPanel("8e0affd6-99c8-45ea-abc2-c4a88967d4c1");
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
