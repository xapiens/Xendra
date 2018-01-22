package org.columba.core.filter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class FilterActionList {
	@XmlElement
	List<FilterAction> action = new ArrayList<FilterAction>();

	public List<FilterAction> getAction() {
		return action;
	}

	public void setAction(List<FilterAction> action) {
		this.action = action;
	}

	public int getChildCount() {
		return action.size();
	}

	public void remove(int i) {
		action.remove(i);
	}

	public FilterAction get(int i) {
		return action.get(i);
	}

	public void addEmptyAction() {		
		FilterAction action = new FilterAction();
		action.setType("Mark Message");
		this.action.add(action);
	}	
}
