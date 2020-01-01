package org.xendra.ruleeditor.gui.tree;

import java.util.Enumeration;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.jdom.Element;
import org.xendra.ruleeditor.folder.AbstractFolder;
import org.xendra.ruleeditor.folder.Root;
import org.xendra.ruleeditor.folder.RuleEditorTreeNode;
import org.xendra.ruleeditor.folder.RuleFolder;
import org.xendra.ruleeditor.plugin.IExtensionHandlerKeys;

public class RuleEditorTreeModel extends DefaultTreeModel implements TreeModel {
	private static RuleEditorTreeModel instance = new RuleEditorTreeModel();
	
	public RuleEditorTreeModel() {
		super(new Root());
	}
			
	public RuleEditorTreeModel(AbstractFolder folder) {
		super(folder);
	}

	public RuleEditorTreeNode add(RuleEditorTreeNode parentFolder) {
		Element item = parentFolder.getElement();
		if (item == null) {
			return null;
		}
		int uid = Integer.valueOf(item.getAttributeValue("uid"));
		if (RuleEditorTreeNode.getNextFolderUid() <= uid)
			RuleEditorTreeNode.setNextFolderUid(uid + 1);
		String type = item.getAttributeValue("type");		
		Object[] args = { item };
		IExtensionHandler handler = null;
		try {
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_RULEEDITOR_FOLDER);
		} catch (PluginHandlerNotFoundException ex) {
			ErrorDialog.createDialog(ex.getMessage(),  ex);
		}
		RuleEditorTreeNode folder = null;
		try {
			IExtension extension = handler.getExtension(type);
			folder = (RuleEditorTreeNode) extension.instanciateExtension(args);
			parentFolder.add(folder);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return folder;
	}
	
	public static RuleEditorTreeModel getInstance() {
		return instance;
	}
	
	public RuleEditorTreeNode getFirstFolder() {
		int uid = 0;
		RuleEditorTreeNode root = (RuleEditorTreeNode) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			RuleEditorTreeNode node = (RuleEditorTreeNode) e.nextElement();
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
	
	public RuleEditorTreeNode getFolderRule(String uid) {
		RuleEditorTreeNode root = (RuleEditorTreeNode) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			RuleEditorTreeNode node = (RuleEditorTreeNode) e.nextElement();
			if (!(node instanceof RuleFolder)) {
				continue;
			}
			String id = node.getId();
			if (uid.equals(id)) {
				return node;
			}
		}
		return null;
	}
	
	public RuleEditorTreeNode getFolder(String uid) {
		RuleEditorTreeNode root = (RuleEditorTreeNode) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			RuleEditorTreeNode node = (RuleEditorTreeNode) e.nextElement();
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
