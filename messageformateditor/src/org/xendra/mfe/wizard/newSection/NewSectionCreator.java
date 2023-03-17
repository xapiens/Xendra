package org.xendra.mfe.wizard.newSection;

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

public class NewSectionCreator implements WizardModelListener {
	private DataModel data;
	private AbstractFolder m_node;
	public NewSectionCreator(DataModel data, AbstractFolder node) {
		this.data = data;
		m_node = node;
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
		String sectionname = (String) data.getData("name.section");
		Element section = new Element("section");
		section.setAttribute("name", sectionname);
		String parentname = "";
		if (m_node.getNode().getName().equals("section")) 
			parentname = m_node.getNode().getAttributeValue("name");
		section.setAttribute("parent", parentname);
		section.setAttribute("sequence", "0");
		Object[] args = { section };
		IExtensionHandler handler = null;
		try {
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MFE_FOLDER);
		} catch (PluginHandlerNotFoundException ex) {
			ErrorDialog.createDialog(ex.getMessage(),  ex);
		}
		AbstractFolder folder = null;			
		try {
			IExtension extension = handler.getExtension(section.getName());
			folder = (AbstractFolder) extension.instanciateExtension(args);
			m_node.add(folder);
			m_node.getNode().addContent(section);
			//getTreeController().findNode(field);
		} catch (Exception ex) {
			ex.printStackTrace();
		}												
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub		
	}

}
