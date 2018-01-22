package org.xendra.newclient.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.miginfocom.swing.MigLayout;

public class ImportPriceListStep extends AbstractStep implements PropertyChangeListener {	
	protected FileImportPanel fileimportpanel = null;
	
	public ImportPriceListStep() {
		super(ResourceLoader.getString("dialog","newclient","importpricelist"),
			  ResourceLoader.getString("dialog","newclient","importpricelist_description"));
		this.setCanGoNext(false);
	}
	
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout());
		fileimportpanel = new FileImportPanel("04af3d3f-a3df-b5d4-1d91-936761df871a");
		fileimportpanel.addPropertyChangeListener(this);
		Method method = null;
		try {
			method = fileimportpanel.getClass().getMethod("getText", null);
		}
		catch (NoSuchMethodException nsme) {}
		component.add(fileimportpanel, "wrap");
		return component;
	}
	
	public void prepareRendering() {		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if (e.getPropertyName().equals("sucessfully"))
			setCanGoNext((Boolean) e.getNewValue());
	}
}
