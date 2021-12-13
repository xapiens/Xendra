package org.xendra.pfe.gui.tree;

import java.util.Enumeration;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;
import org.xendra.pfe.folder.Root;
import org.xendra.pfe.plugin.IExtensionHandlerKeys;

@SuppressWarnings("serial")
public class PFETreeModel extends DefaultTreeModel implements TreeModel {
	private static PFETreeModel instance = new PFETreeModel(new Element("root"));
	public PFETreeModel(Element root) {
		super(new Root(root));
	}

	public AbstractFolder add(AbstractFolder childNode, AbstractFolder parentFolder) {
		Element item = childNode.getNode();
		int uid = Integer.valueOf(item.getAttributeValue("uid"));
		String type = item.getAttributeValue("type");
		Object[] args = { item };
		IExtensionHandler handler = null;
		try {
			handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_PFE_FOLDER);
		} catch (PluginHandlerNotFoundException ex) {
			ErrorDialog.createDialog(ex.getMessage(),  ex);
		}
		AbstractFolder folder = null;
		try {
			IExtension extension = handler.getExtension(type);
			folder = (AbstractFolder) extension.instanciateExtension(args);			
			parentFolder.add(folder);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return folder;
	}

	public static PFETreeModel getInstance() {
		return instance;
	}
	public AbstractFolder getFirstFolder() {
		int uid = 0;
		AbstractFolder root = (AbstractFolder) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			AbstractFolder node = (AbstractFolder) e.nextElement();
			if (node instanceof Root) {
				continue;
			}

			if (node.getNode().getAttributeValue("type").equals("kiebase"))
			{
				return node;
			}
		}
		return null;		
	}

	public AbstractFolder getFolder(String uid) {		
		AbstractFolder root = (AbstractFolder) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			AbstractFolder node = (AbstractFolder) e.nextElement();
			if (node instanceof Root) 
				continue;			
			String id = node.getNode().getAttributeValue("uid");
			if (uid.equals(id) && node.getName().equals("format")) {
				return node;
			} else {				
				for (Enumeration f = node.children(); f.hasMoreElements();)
				{
					AbstractFolder subnode = (AbstractFolder) f.nextElement();
					String sid = subnode.getNode().getAttributeValue("uid");
					if (uid.equals(sid) && subnode.getNode().getName().equals("format")) {
						return subnode;
					}					
				}
			}
		}
		return null;
	}
}
