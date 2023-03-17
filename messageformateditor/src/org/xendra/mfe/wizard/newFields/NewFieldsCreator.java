package org.xendra.mfe.wizard.newFields;

import javax.swing.tree.TreePath;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.mfe.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewFieldsCreator implements WizardModelListener {
	private AbstractFolder parent;
	private DataModel data;
	public NewFieldsCreator(DataModel data, AbstractFolder parent) {
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
		TreePath[] paths = (TreePath[]) data.getData(X_AD_Rule.COLUMNNAME_Lockout);
		for (TreePath path:paths) {
			AbstractFolder node = (AbstractFolder) path.getLastPathComponent();
			Element item = node.getNode();
			if (item.getName().equals("column")) {				
				String uid = item.getAttributeValue("uid");
				String name = item.getAttributeValue("name");
				X_AD_Column c = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Column_ID = ?", null)
					.setParameters(Integer.valueOf(uid)).first();
				Element field = new Element("field");
				field.setAttribute("area", parent.getNode().getAttributeValue("name"));
				field.setAttribute("mandatory", "true");
				field.setAttribute("name", name);
				field.setAttribute("sequence", "0");
				field.setAttribute("key", c.isKey() ? "true":"false");
				field.setAttribute("columnid", c.getIdentifier());
				Object[] args = { field };
				IExtensionHandler handler = null;
				try {
					handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MFE_FOLDER);
				} catch (PluginHandlerNotFoundException ex) {
					ErrorDialog.createDialog(ex.getMessage(),  ex);
				}
				AbstractFolder folder = null;			
				try {
					IExtension extension = handler.getExtension(item.getName());
					folder = (AbstractFolder) extension.instanciateExtension(args);
					parent.add(folder);
					parent.getNode().addContent(field);
				} catch (Exception ex) {
					ex.printStackTrace();
				}								
				
				
			}
		}		
	}
	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
		
	}

}
