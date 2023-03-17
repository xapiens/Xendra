package org.xendra.mfe.wizard.newField;


import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.jdom.Element;
import org.xendra.mfe.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewFieldCreator implements WizardModelListener {	
	private AbstractFolder parent; 
	private DataModel data;
	public NewFieldCreator(DataModel data, AbstractFolder parent) {
		this.parent = parent;
		this.data = data;
	}

	@Override
	public void stepShown(WizardModelEvent e) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void wizardFinished(WizardModelEvent e) {
		String fieldname = (String) data.getData("name.field");
		Element m_area = parent.getNode();
		Element field = new Element("field");
		field.setAttribute("area", m_area.getAttributeValue("name"));
		field.setAttribute("mandatory", "true");
		field.setAttribute("name", fieldname);
		field.setAttribute("sequence", "0");
		Object[] args = { field };
		IExtensionHandler handler = null;
		try {
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MFE_FOLDER);
		} catch (PluginHandlerNotFoundException ex) {
			ErrorDialog.createDialog(ex.getMessage(),  ex);
		}
		AbstractFolder folder = null;			
		try {
			IExtension extension = handler.getExtension(field.getName());
			folder = (AbstractFolder) extension.instanciateExtension(args);
			parent.add(folder);		
			parent.getNode().addContent(field);												
		} catch (Exception ex) {
			ex.printStackTrace();
		}												
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub		
	}
}
