package org.xendra.pop.folder;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

import org.columba.api.command.IWorkerStatusController;
import org.columba.api.plugin.IExtensionInterface;
import org.columba.core.base.Lock;
import org.columba.core.xml.XmlElement;
import org.compiere.util.Env;
import org.xendra.pop.config.FolderItem;

public abstract class PurchaseTreeNode extends DefaultMutableTreeNode
		implements IFolder,IExtensionInterface {
	protected static ImageIcon expandedIcon;
	protected static ImageIcon collapsedIcon;
	private static int nextFolderUid = 0;
	protected FolderItem node;
	protected Lock myLock;
	private final Class[] FOLDER_ITEM_ARG = new Class[] { FolderItem.class };
	public PurchaseTreeNode(String name) {
		super(name);
		try {
			expandedIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "package_obj.gif"))));
			collapsedIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "drools.gif"))));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public PurchaseTreeNode(FolderItem item) {
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
	public FolderItem getFolderItem() {
		return node;
	}	
	@Override
	public ImageIcon getIcon() {
		return collapsedIcon;
	}
	public final static FolderItem getDefaultItem(String className, XmlElement props) {
		XmlElement defaultElement = new XmlElement("folder");
		defaultElement.addAttribute("class", className);
		defaultElement.addAttribute("uid", Integer.toString(nextFolderUid++));
		if (props != null) {
			defaultElement.addElement(props);
		}
		return new FolderItem(defaultElement);
	}
	public static XmlElement getDefaultProperties() {
		return null;
	}
	public ImageIcon getExpandedIcon() {
		return expandedIcon;
	}
	@Override
	public String getId() {
		return node.get("uid");
	}
	public boolean tryToGetLock() {
		return myLock.tryToGetLock(null);
	}
	public void releaseLock() {
		myLock.release(null);
	}
	public XmlElement getNode() {
		return node.getRoot();
	}
	public void setNode(FolderItem node) {
		this.node = node;
	}
	public Class getDefaultChild() {
		return null;
	}
	final public Hashtable getAttributes() {
		return node.getElement("property").getAttributes();
	}
	public abstract void createChildren(IWorkerStatusController worker);
	
	public void addFolder(String name, Class childClass) throws Exception {
		Method m_getDefaultProperties = childClass.getMethod("getDefaultProperties", null);
		XmlElement props = (XmlElement) m_getDefaultProperties.invoke(null, null);
		FolderItem childNode = getDefaultItem(childClass.getName(), props);
		childNode.setString("property", "name", name);
		AbstractFolder subFolder = (AbstractFolder) childClass.getConstructor(FOLDER_ITEM_ARG).newInstance(new Object[] { childNode });
		addWithXml(subFolder);
	}
	public void addFolder(String name) throws Exception {
		addFolder(name, getDefaultChild());
	}
	public void addWithXml(PurchaseTreeNode folder) {
		add(folder);
		this.getNode().addElement(folder.getNode());
	}
	public void removeFromParent() {
		getNode().removeFromParent();
		super.removeFromParent();
	}
	public String getName() {
		FolderItem item = getFolderItem();
		String name = item.getString("property", "name");
		return name;
	}
	public void setName(String newName) {
		FolderItem item = getFolderItem();
		item.setString("property", "name", newName);
	}
}