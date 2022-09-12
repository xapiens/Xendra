package org.xendra.efact.gui.tree;

import java.util.Enumeration;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.jdom.Element;
import org.xendra.efact.folder.EFactTreeNode;
import org.xendra.efact.folder.Root;
import org.xendra.efact.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;

public class EFactTreeModel extends DefaultTreeModel implements TreeModel {
	private static EFactTreeModel instance = new EFactTreeModel();
	public EFactTreeModel() {
		super(new Root());
	}			
	public EFactTreeModel(AbstractFolder folder) {
		super(folder);
	}
	public EFactTreeNode add(EFactTreeNode parentFolder) {
		Element item = parentFolder.getElement();
		if (item == null) {
			return null;
		}
		int uid = Integer.valueOf(item.getAttributeValue("uid"));
		if (EFactTreeNode.getNextFolderUid() <= uid)
			EFactTreeNode.setNextFolderUid(uid + 1);
		String type = item.getAttributeValue("type");		
		Object[] args = { item };
		IExtensionHandler handler = null;
		try {
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_EFACT_FOLDER);
		} catch (PluginHandlerNotFoundException ex) {
			ErrorDialog.createDialog(ex.getMessage(),  ex);
		}
		EFactTreeNode folder = null;
		try {
			IExtension extension = handler.getExtension(type);
			folder = (EFactTreeNode) extension.instanciateExtension(args);
			parentFolder.add(folder);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return folder;
	}
	
	public static EFactTreeModel getInstance() {
		return instance;
	}
	
	public EFactTreeNode getFirstFolder() {
		int uid = 0;
		EFactTreeNode root = (EFactTreeNode) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			EFactTreeNode node = (EFactTreeNode) e.nextElement();
			if (node instanceof Root) {
				continue;
			}
			
			if (node.getElement().getAttributeValue("type").equals("kiebase"))
			{
				return node;
			}
		}
		return null;		
	}	
}
