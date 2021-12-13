package org.xendra.pop.gui.tree;

import java.util.Enumeration;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.columba.core.xml.XmlElement;
import org.compiere.model.MRule;
import org.xendra.pop.config.FolderItem;
import org.xendra.pop.folder.PurchaseTreeNode;
import org.xendra.pop.folder.Root;
import org.xendra.pop.plugin.IExtensionHandlerKeys;

public class PurchaseTreeModel  extends DefaultTreeModel implements TreeModel  {
	private static PurchaseTreeModel instance = new PurchaseTreeModel(MRule.getAll());
	
	public PurchaseTreeModel(XmlElement root) {
		super(new Root(root));
		createDirectories(((PurchaseTreeNode) getRoot()).getNode(), (PurchaseTreeNode) getRoot());
	}
	
	public void createDirectories(XmlElement parentTreeNode, PurchaseTreeNode parentFolder) {
		int count = parentTreeNode.count();
		XmlElement child;
		for (int i=0; i < count; i++) {
			child = parentTreeNode.getElement(i);
			String name = child.getName();
			if (name.equals("folder") || name.equals("id")) {
				PurchaseTreeNode folder = add(child, parentFolder);
				if (folder != null) {
					createDirectories(child, folder);
				}
			}
		}
	}	
	
	public PurchaseTreeNode add(XmlElement childNode, PurchaseTreeNode parentFolder) {
		FolderItem item = new FolderItem(childNode);
		if (item == null) {
			return null;
		}
		int uid = item.getInteger("uid");
		if (PurchaseTreeNode.getNextFolderUid() <= uid)
			PurchaseTreeNode.setNextFolderUid(uid + 1);
		String type = item.get("type");
		Object[] args = { item };
		IExtensionHandler handler = null;
		try {
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_PURCHASE_FOLDER);
		} catch (PluginHandlerNotFoundException ex) {
			ErrorDialog.createDialog(ex.getMessage(),  ex);
		}
		PurchaseTreeNode folder = null;
		try {
			IExtension extension = handler.getExtension(type);
			folder = (PurchaseTreeNode) extension.instanciateExtension(args);
			parentFolder.add(folder);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return folder;
	}
	
	public static PurchaseTreeModel getInstance() {
		return instance;
	}
	
	public PurchaseTreeNode getFirstFolder() {
		int uid = 0;
		PurchaseTreeNode root = (PurchaseTreeNode) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			PurchaseTreeNode node = (PurchaseTreeNode) e.nextElement();
			if (node instanceof Root) {
				continue;
			}
			
			if (node.getFolderItem().get("type").equals("kiebase"))
			{
				return node;
			}
		}
		return null;		
	}
	
	public PurchaseTreeNode getFolder(String uid) {
		PurchaseTreeNode root = (PurchaseTreeNode) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			PurchaseTreeNode node = (PurchaseTreeNode) e.nextElement();
			if (node instanceof Root) {
				continue;
			}
			String id = node.getId();
			if (uid.equals(id)) {
				return node;
			}
		}
		return null;
	}
}
