package org.columba.core.filter;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class FilterRule {
	public final static int MATCH_ALL = 0;
	public final static int MATCH_ANY = 1;
	@XmlAttribute
	String condition = "matchall";
	@XmlElement
	List<FilterCriteria> criteria = new ArrayList<FilterCriteria>();
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public FilterCriteria getCriteria() {
		return criteria.get(0);
	}
	public List<FilterCriteria> getAll() {
		return criteria;
	}
//	public void setCriteria(Criteria criteria) {
//		this.criteria = criteria;
//	}
	public void setCondition(int condition) {
		if (condition == MATCH_ALL)
			setCondition("matchall");
		else if (condition == MATCH_ANY)
			setCondition("matchany");
		else
			throw new IllegalArgumentException("condition <" + condition+ "> unknown");
	}	
	public int getConditionInt() {
		// System.out.println("condigtion: "+ condition );
		if (getCondition().equals("matchall")) {
			return MATCH_ALL;
		}

		if (getCondition().equals("matchany")) {
			return MATCH_ANY;
		}

		return -1;
	}
	public void add(FilterCriteria c) {
		criteria.add(c);
	}
	public void remove(int index) {
		criteria.remove(index);
	}
	public void removeAll() {
		criteria.clear();
	}
	public void removeLast() {
		criteria.remove(criteria.size());
	}
	public FilterCriteria get(int index) {
		return criteria.get(index);
	}
	public int count() {
		return criteria.size();
	}
//	String getCondition() {
//		
//	}
//	void setCondition(String s) {
//		
//	}
//	void setCondition(int condition) {
//		
//	}
//	int getConditionInt() {
//		
//	}
}
