package org.xendra.modeleditor.folder.virtual;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.tree.TreeNode;

import org.compiere.model.persistence.X_AD_Table;
import org.jdom.Element;
import org.xendra.modeleditor.folder.AbstractFolder;
import org.xendra.modeleditor.folder.virtual.VirtualItem;
// the parentstore become something like the directory for save the contact.
// because we're not using files and directories, the reference for save or replace is the id itself.
public class VirtualFolder extends AbstractFolder {

	private Map<String, VirtualItem> map = new Hashtable<String, VirtualItem>();

	public VirtualFolder() {
		super(new Element("virtual"));
	}

	public String add(X_AD_Table table) {		
		if ( table == null ) throw new IllegalArgumentException("X_AD_Table == null");
		VirtualItem item = new VirtualItem(table);
		String uuid = UUID.randomUUID().toString();
		map.put(uuid, item);
		return uuid;
	}

	public int count() {
		return map.size();
	}

	public boolean exists(String id)  {
		if ( id == null ) throw new IllegalArgumentException("id == null");
		return map.containsKey(id);
	}
	

	public X_AD_Table get(String id) {
		if ( id == null ) throw new IllegalArgumentException("id == null");
		
		VirtualItem item = map.get(id);
		X_AD_Table rule = item.getAD_Rule();
		return rule;
	}

	public void modify(String id) {
		if ( id == null ) throw new IllegalArgumentException("id == null");
		
		VirtualItem item = map.get(id);
		X_AD_Table table = item.getAD_Rule();
		table.save();
	}

	public void remove(String id)  {
		if ( id == null ) throw new IllegalArgumentException("id == null");
		VirtualItem item = map.get(id);
		X_AD_Table table = item.getAD_Rule();
		table.delete(true);		
	}

	public ImageIcon getIcon() {
		return null;
	}

	public String getId() {
		return "id";
	}

	public String getName() {
		return "vfolder";
	}

	public Enumeration children() {
		return new Vector().elements();
	}

	public boolean getAllowsChildren() {
		return false;
	}

	public TreeNode getChildAt(int childIndex) {
		return null;
	}

	public int getChildCount() {
		return 0;
	}

	public int getIndex(TreeNode node) {
		return 0;
	}

	public TreeNode getParent() {
		return null;
	}

	public boolean isLeaf() {
		return false;
	}

}
