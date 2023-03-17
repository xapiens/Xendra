package org.xendra.mfe.wizard.newMessage;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.mfe.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewMessageCreator implements WizardModelListener {
	private DataModel data;
	private AbstractFolder parent;
	public NewMessageCreator(DataModel data, AbstractFolder node) {
		this.data = data;
		parent = node;
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
	public void wizardFinished(WizardModelEvent event) {
		String name = (String) data.getData("name.message");	
		Element m_plugin = parent.getNode();
		String type = "message";
		Element message = new Element(type);
		X_AD_MessageFormat format = new X_AD_MessageFormat(Env.getCtx(), 0, null);
		format.setName(name);
		format.setAD_Plugin_ID(Integer.valueOf(m_plugin.getAttributeValue("uid")));
		format.setLockout(false);
		if (format.save()) {
			message.setAttribute("uid", String.valueOf(format.getAD_MessageFormat_ID()));
			message.setAttribute("AD_Plugin_ID", String.valueOf(format.getAD_Plugin_ID()));
			message.setAttribute("type", type);
			message.setAttribute("name", format.getName());
			message.setAttribute("lockout", format.isLockout() ? "Y":"N");
			Object[] args = { message };
			IExtensionHandler handler = null;
			try {
				handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MFE_FOLDER);
			} catch (PluginHandlerNotFoundException ex) {
				ErrorDialog.createDialog(ex.getMessage(),  ex);
			}
			AbstractFolder folder = null;			
			try {
				IExtension extension = handler.getExtension(type);
				folder = (AbstractFolder) extension.instanciateExtension(args);
				parent.add(folder);
				parent.getNode().addContent(message);
			} catch (Exception e) {
				e.printStackTrace();
			}					
		}
	}

	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

}
