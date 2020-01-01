package org.xendra.ruleeditor.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.columba.core.xml.XmlElement;
import org.compiere.model.MInvoice;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.util.Env;

public class GroupModel implements IGroupModel {
	private XmlElement root;
	private XmlElement property;
	private String folderUid;
	private List<X_AD_Rule> rules;
	public GroupModel(XmlElement group, XmlElement property, String folderUid) {
		this.root = group;
		this.property = property;
	}
	public GroupModel(String AD_Rule_ID) {
		folderUid = AD_Rule_ID;
		String where = "properties->'group'  = ? ";
		rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name, where, null)
			.setParameters(AD_Rule_ID).list();
		root = new XmlElement("group");
		property = new XmlElement("property");				
		property.addElement(root);
		
	}
	@Override
	public String getUid() {
		return folderUid;
	}
	@Override
	public XmlElement getRootElement() {
		return root;
	}
	public void setName(String name) {
		property.addAttribute("name", name);
	}
	public String getName() {
		return property.getAttribute("name");
	}
	@Override
	public String getDescription() {
		return property.getAttribute("description");
	}
	@Override
	public void setDescription(String text) {
		property.addAttribute("description", text);		
	}
	@Override
	public X_AD_Rule[] getMembers() {
		List<X_AD_Rule> names = new ArrayList<X_AD_Rule>();
		for (X_AD_Rule rule:rules) {
			names.add(rule);
		}		 
		X_AD_Rule[] retValue = new X_AD_Rule[names.size()];
		names.toArray(retValue);
		return retValue;
	}
	@Override
	public void removeAllMembers() {
		for (X_AD_Rule rule:rules) {
			HashMap props = rule.getProperties();
			props.put("group", "");
			rule.setProperties(props);
			rule.save();			
		}		 		
		rules.clear();				
	}
	@Override
	public void addMember(String id) {
		X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
			.setParameters(Integer.valueOf(id)).first();
		if (rule != null) {
			HashMap props = rule.getProperties();
			props.put("group", getUid());
			rule.setProperties(props);
			if (rule.save())
				rules.add(rule);
		}
	}	
}
