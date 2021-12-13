package org.xendra.pfe.wizard.newField;

import java.util.HashMap;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.FormatFolder;
import org.xendra.pfe.folder.TableFolder;
import org.xendra.pfe.plugin.IExtensionHandlerKeys;

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
		if (parent instanceof FormatFolder) {
			FormatFolder f = (FormatFolder) parent;
			f.addField(fieldname);	
		}
		else if (parent instanceof TableFolder) {
			TableFolder f = (TableFolder) parent;
			f.addField(fieldname);
		}
		//String uid = m_area.getAttributeValue("uid");
		//X_C_PrinterDocumentFormat format = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
		//.setParameters(Integer.valueOf(uid)).first();
		//HashMap props = format.getProperties();
		//props.put(fieldname, "");
		//format.setProperties(props);
		//format.save();
		//
//		Element field = new Element("field");
//		field.setAttribute("uid", uid);
//		field.setAttribute("name", fieldname);
//		field.setAttribute("value", "");					
//		Object[] args = { field };
//		IExtensionHandler handler = null;
//		try {
//			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_PFE_FOLDER);
//		} catch (PluginHandlerNotFoundException ex) {
//			ErrorDialog.createDialog(ex.getMessage(), ex);
//		}
//		AbstractFolder folder = null;
//		try {
//			IExtension extension = handler.getExtension(field.getName());
//			folder = (AbstractFolder) extension.instanciateExtension(args);
//			parent.add(folder);
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}				
	}
	
	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
