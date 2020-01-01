package org.xendra.modeleditor.folder;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.swing.event.EventListenerList;

import org.columba.api.command.IWorkerStatusController;
import org.compiere.model.MTreeNode;
import org.compiere.model.persistence.X_AD_Table;
import org.jdom.Element;
import org.xendra.modeleditor.folder.ModelEditorTreeNode;

public class AbstractFolder extends ModelEditorTreeNode  {

	protected EventListenerList listenerList = new EventListenerList();
	private AbstractFolder GroupFolder;
	private AbstractFolder LastNode;
	private Integer Lastuid = 0;
	public AbstractFolder(Element item) {
		super(item);
	}	
	public void add(AbstractFolder treeNode) {
		super.add(treeNode);
	}
	public void addGroupFolder(AbstractFolder groupFolder) {
		this.GroupFolder = groupFolder; 		
	}
	public AbstractFolder getGroupFolder() {
		return this.GroupFolder;
	}
	public void loadChildren() {

	}


	/**
	 *	Return the Node with ID in list of children
	 *  @param ID id
	 *  @return VTreeNode with ID or null
	 */
	public AbstractFolder findNode(Integer nodeid) {		
		//		
		if (Lastuid.equals(nodeid))
			return LastNode;
		List<String> types = new ArrayList<String>();
		types.add("table");
		types.add("column");		
		Enumeration en = preorderEnumeration();
		while (en.hasMoreElements())
		{
			AbstractFolder nd = (AbstractFolder)en.nextElement();
			if (types.contains(nd.getElement().getName())) {
				Integer uid = Integer.valueOf(nd.getElement().getAttributeValue("uid"));
				if (nodeid.equals(uid)) {
					LastNode = nd;
					Lastuid = nodeid;
					return nd;				
				}
			}
		}
		return null;			
	} //  findNode
	
	public List<AbstractFolder> getChildrens() {
		List<AbstractFolder> childs = new ArrayList<AbstractFolder>();
		int childrens = getChildCount();
		for (int i=0; i < childrens; i++) {
			childs.add((AbstractFolder) getChildAt(i));
		}
		return childs;
	}
}
