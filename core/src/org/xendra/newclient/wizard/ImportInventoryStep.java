package org.xendra.newclient.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.xendra.newclient.i18n.ResourceLoader;


import net.javaprog.ui.wizard.AbstractStep;
import net.miginfocom.swing.MigLayout;

public class ImportInventoryStep extends AbstractStep implements PropertyChangeListener {	
	protected FileImportPanel fileimportpanel = null;
	
	public ImportInventoryStep() {
		super(ResourceLoader.getString("dialog","newclient","importinventory"),
			  ResourceLoader.getString("dialog","newclient","importinventory_description"));
		this.setCanGoNext(false);
	}
	
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout());
		fileimportpanel = new FileImportPanel("95976be3-fc37-4467-b5ee-ef054d3c1a1b");
		fileimportpanel.addPropertyChangeListener(this);
		Method method = null;
		try {
			method = fileimportpanel.getClass().getMethod("getText", null);
		}
		catch (NoSuchMethodException nsme) {}
		component.add(fileimportpanel, "wrap");
		return component;
	}
	
	public void preparerendering() {		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if (e.getPropertyName().equals("sucessfully"))
			setCanGoNext((Boolean) e.getNewValue());
	}
	public void prepareRendering() {
	}
}
