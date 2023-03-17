package org.xendra.mfe.gui.tree;

import java.util.Enumeration;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import org.xendra.mfe.folder.Root;
import org.xendra.model.AbstractFolder;

@SuppressWarnings("serial")
public class MFETreeModel extends DefaultTreeModel implements TreeModel {
	private static MFETreeModel instance = new MFETreeModel();
	public MFETreeModel() {
		super(new Root());
	}
	public static MFETreeModel getInstance() {
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
		}
		return null;		
	}

	public AbstractFolder getFolder(String uid) {
		AbstractFolder root = (AbstractFolder) getRoot();
		for (Enumeration e = root.breadthFirstEnumeration(); e.hasMoreElements();) 
		{
			AbstractFolder node = (AbstractFolder) e.nextElement();
			if (node instanceof Root) {
				continue;
			}
			String id = node.getNode().getAttributeValue("uid");
			if (uid.equals(id)) {
				return node;
			}
		}
		return null;
	}
}
