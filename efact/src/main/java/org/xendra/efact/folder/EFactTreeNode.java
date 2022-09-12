package org.xendra.efact.folder;

import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

import org.columba.api.command.IWorkerStatusController;
import org.columba.api.plugin.IExtensionInterface;
import org.columba.core.base.Lock;
import org.columba.core.folder.api.IFolder;
import org.compiere.util.Env;
import org.jdom.Element;
import org.jdom.Parent;

public abstract class EFactTreeNode extends DefaultMutableTreeNode
	implements IFolder, IExtensionInterface {
	protected static ImageIcon expandedIcon;
	protected static ImageIcon collapsedIcon;
	private static int nextFolderUid = 0;
	protected Element node;
	protected Lock myLock;
	private final Class[] FOLDER_ITEM_ARG = new Class[] { Element.class };
	public EFactTreeNode(String name) {
		super(name);
		try {
			expandedIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.efactr", "package_obj.gif"))));
			collapsedIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.efact", "drools.gif"))));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}
	public EFactTreeNode(Element item) {
		super();
		setNode(item);
	}
	public static Object generateNextFolderUid() {
		return new Integer(++nextFolderUid);
	}
	public static void setNextFolderUid(int uid) {
		nextFolderUid = uid;
	}
	public static int getNextFolderUid() {
		return nextFolderUid;
	}
	public Element getElement() {
		return node;
	}	
	public ImageIcon getIcon() {
		return collapsedIcon;
	}
	public final static Element getDefaultItem(String className, Element props) {
		Element defaultElement = new Element("folder");
		defaultElement.setAttribute("class", className);
		defaultElement.setAttribute("uid", Integer.toString(nextFolderUid++));
		if (props != null) {
			defaultElement.addContent(props);
		}
		return defaultElement;
	}
	public static Element getDefaultProperties() {
		return null;
	}
	public ImageIcon getExpandedIcon() {
		return expandedIcon;
	}
	@Override
	public String getId() {
		return node.getAttributeValue("uid");
	}
	public boolean tryToGetLock() {
		return myLock.tryToGetLock(null);
	}
	public void releaseLock() {
		myLock.release(null);
	}
	public Element getNode() {
		return node;
	}
	public void setNode(Element node) {
		this.node = node;
	}
	public Class getDefaultChild() {
		return null;
	}
	final public List getAttributes() {
		return node.getAttributes();
	}
	public abstract void createChildren(IWorkerStatusController worker);
	
	public void addFolder(String name, Class childClass) throws Exception {
	}
	public void addFolder(String name) throws Exception {
		addFolder(name, getDefaultChild());
	}
	public void addWithXml(EFactTreeNode folder) {
		add(folder);
	}
	public void removeFromParent() {
		Parent p = getNode().getParent();
		p.removeContent(getNode());
	}
	public String getName() {		
		String name = getNode().getAttributeValue("name");
		return name;
	}
	public void setName(String newName) {
		getNode().setAttribute("name", newName);		
	}
	public void loadChildren() {}
}
