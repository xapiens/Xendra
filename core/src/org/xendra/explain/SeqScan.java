package org.xendra.explain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jdom.Element;
import org.jdom.Namespace;

public class SeqScan implements IMetrics {
	List<IMetrics> childs = new ArrayList<IMetrics>();	
	BigDecimal Total_Cost;
	BigDecimal Plan_Rows;
	String Relation_Name;
	String Alias;
	String Filter;
	public SeqScan(Element plan) {
		Namespace ns = plan.getNamespace();
		String parent_relationship = "";
		if (plan.getChild("Parent-Relationship",ns) != null)
			parent_relationship = plan.getChild("Parent-Relationship",ns).getValue();
		String parallel_aware = plan.getChild("Parallel-Aware",ns).getValue();
		Relation_Name = plan.getChild("Relation-Name",ns).getValue();
		
		Alias = plan.getChild("Alias",ns).getValue();
		String startup_cost = plan.getChild("Startup-Cost",ns).getValue();
		String total_cost = plan.getChild("Total-Cost",ns).getValue();
		
		setTotal_Cost(new BigDecimal(total_cost));
		String plan_rows = plan.getChild("Plan-Rows",ns).getValue();
		setPlan_Rows(new BigDecimal(plan_rows));
		String plan_width = plan.getChild("Plan-Width",ns).getValue();		
		Element ef = plan.getChild("Filter",ns);
		if (ef != null)
			Filter = ef.getValue();
		else
			Filter = "";
	}
	@Override
	public void setTotal_Cost(BigDecimal var) {
		this.Total_Cost = var;
	}
	@Override
	public BigDecimal getTotal_Cost() {
		return this.Total_Cost;
	}
	@Override
	public void add(IMetrics child) {
		childs.add(child);
	}	
	public String getRelation_Name() {
		return Relation_Name;
	}	
	public String getAlias() {
		return Alias;
	}
	
	@Override
	public List<String> tuning() {
		List<String> commands = new ArrayList<String>();
		String relationname = getRelation_Name();
		String relationalias = getAlias();
		String filter = getFilter();
		List<String> filters = getFilterFields(filter);
		if (filters.size() > 0) {
			String indexname = String.format("SeqScan%s", relationname);
			String filtercontent = "";
			for (String flt:filters) {
				if (filtercontent.length() > 0)
					filtercontent += ",";
				filtercontent += flt;
			}			
			String tun = String.format("CREATE INDEX %s ON %s (%s)", indexname, relationname, filtercontent);
			commands.add(tun);
		}
		return commands;
	}
	private List<String> getFilterFields(String filterexpression) {
		List<String> noexpressions = new ArrayList<String>();
		noexpressions.add("IS");
		noexpressions.add("NULL");
		noexpressions.add("NUMERIC");
		noexpressions.add("AND");
		List<String> expresions = new ArrayList<String>();
		List<String> filters = new ArrayList<String>();
		Pattern parenthesis = Pattern.compile("\\((.+?)\\)");
		Pattern words = Pattern.compile("[\\w]+");
		String startwithnumber = "^[0-9].*$";
		Matcher m = parenthesis.matcher(filterexpression);
		while (m.find()) {			
			filters.add(m.group(1));
		}
		if (filters.size() == 0)
			filters.add(filterexpression);
		for (String filter:filters) {
			Matcher mtext = words.matcher(filter);
			while (mtext.find()) {
				String token = mtext.group();
				if (!noexpressions.contains(token.toUpperCase())) {
					if (!expresions.contains(token)) {						
						if (!token.matches(startwithnumber)) {
							expresions.add(token);
						}
					}
				}
			}
		}		
		return expresions;
	}
	@Override
	public void setPlan_Rows(BigDecimal var) {
		Plan_Rows = var;
	}
	@Override
	public BigDecimal getPlan_Rows() {
		return Plan_Rows;
	}
	public String getFilter() {
		return Filter;
	}
	public void setFilter(String filter) {
		Filter = filter;
	}	
}
