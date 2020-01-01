package org.xendra.modeleditor.folder;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

import org.columba.api.plugin.IExtensionInterface;
import org.columba.core.base.Lock;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.modeleditor.plugin.IExtensionHandlerKeys;

public abstract class ModelEditorTreeNode extends DefaultMutableTreeNode
		implements IExtensionInterface {
	protected static ImageIcon expandedIcon;
	protected static ImageIcon collapsedIcon;
	protected Element element;
	protected Lock myLock;
	private String name;
	private final Class[] FOLDER_ITEM_ARG = new Class[] { Element.class };
	public ModelEditorTreeNode(String name) {
		super(name);
		try {
			expandedIcon = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "package_obj.gif"))));
			collapsedIcon = new ImageIcon(ImageIO.read(new File(Env.getResource(IExtensionHandlerKeys.ORG_XENDRA_MODELEDITOR, "drools.gif"))));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public ModelEditorTreeNode(Element item) {
		super();
		setElement(item);
	}
	public ImageIcon getIcon() {
		return collapsedIcon;
	}
	public ImageIcon getExpandedIcon() {
		return expandedIcon;
	}
	public void setElement(Element item) {
		element = item;
	}	
	public Element getElement() {
		return element;
	}
	public boolean tryToGetLock() {
		return myLock.tryToGetLock(null);
	}
	public void releaseLock() {
		myLock.release(null);
	}
	public Class getDefaultChild() {
		return null;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}	
}