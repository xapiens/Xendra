package org.xendra.ruleeditor.folder;

import java.util.List;
import java.util.Map;

import javax.swing.event.EventListenerList;

import org.columba.api.command.IWorkerStatusController;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;
import org.jdom.Element;

public class AbstractFolder extends RuleEditorTreeNode implements IRuleFolder {

	protected EventListenerList listenerList = new EventListenerList();
	protected int nextContactUid = 0;
	public AbstractFolder(String name, String dir) {
		super(name);
	}
	public AbstractFolder(Element item) {
		super(item);
	}

	@Override 
	public void createChildren(IWorkerStatusController worker) {
	}
	public boolean exists(String uid) {
		return false;
	}
	public int getNextContactUid() {
		while(exists(new Integer(nextContactUid).toString())) {
			nextContactUid++;
		}
		return nextContactUid;
	}
	/**
	 *
	 * @see org.columba.addressbook.folder.IContactStorage#modify(java.lang.Object,
	 *      IContactModel)
	 */
	public void modify(String uid, X_AD_Rule contact) {

	}
	
	@Override
	public X_AD_Rule get(Integer id) {
		X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID ? ?", null)
			.setParameters(id).first();
		return rule;
	}
	@Override
	public void modify(int X_AD_Rule_ID) {
		// TODO Auto-generated method stub
		
	}
	
	public List<AbstractFolder> getChildrens() {
		return null;
	}
//	@Override
//	public List<X_AD_Rule> getHeaderItemList() {
//		List<X_AD_Rule> list = new Query(Env.getCtx(),X_AD_Rule.Table_Name, "IsActive='Y'", null).list();
//		return list;
//	}

//	public Map<String, X_AD_Rule> getContactItemMap() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public void loadChildren() {}	
}
