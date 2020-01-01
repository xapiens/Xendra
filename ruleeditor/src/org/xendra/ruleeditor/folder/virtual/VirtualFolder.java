package org.xendra.ruleeditor.folder.virtual;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.tree.TreeNode;

import org.compiere.model.persistence.X_AD_Rule;
import org.xendra.ruleeditor.folder.AbstractFolder;
// the parentstore become something like the directory for save the contact.
// because we're not using files and directories, the reference for save or replace is the id itself.
public class VirtualFolder extends AbstractFolder {

	private Map<String, VirtualItem> map = new Hashtable<String, VirtualItem>();

	public VirtualFolder() {
		super("name", "directory");
	}

	public String add(X_AD_Rule rule) {		
		if ( rule == null ) throw new IllegalArgumentException("X_AD_Rule == null");
		VirtualItem item = new VirtualItem(rule);
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
	
	/**
	 * @see org.columba.addressbook.folder.IContactStorage#getHeaderItemList()
	 * 
	 */	
	public Map<String, X_AD_Rule> getContactItemMap() {
		Map<String, X_AD_Rule> result = new Hashtable<String, X_AD_Rule>();

		Iterator<Map.Entry<String, VirtualItem>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, VirtualItem> entry = it.next();
			VirtualItem item = entry.getValue();			
			X_AD_Rule rule = item.getAD_Rule();
			result.put(entry.getKey(), rule);
		}
		
		return result;
	}

	public X_AD_Rule get(String id) {
		if ( id == null ) throw new IllegalArgumentException("id == null");
		
		VirtualItem item = map.get(id);
		X_AD_Rule rule = item.getAD_Rule();
		return rule;
	}

	public void modify(String id) {
		if ( id == null ) throw new IllegalArgumentException("id == null");
		
		VirtualItem item = map.get(id);
		X_AD_Rule rule = item.getAD_Rule();
		rule.save();
	}

	public void remove(String id)  {
		if ( id == null ) throw new IllegalArgumentException("id == null");
		VirtualItem item = map.get(id);
		X_AD_Rule rule = item.getAD_Rule();
		rule.delete(true);
		
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
