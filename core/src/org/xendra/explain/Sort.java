package org.xendra.explain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.jdom.Element;
import org.jdom.Namespace;

public class Sort implements IMetrics {
	List<IMetrics> childs = new ArrayList<IMetrics>();
	List<String> keys = new ArrayList<String>();
	BigDecimal Total_Cost;
	BigDecimal Plan_Rows;
	public Sort(Element plan) {
		Namespace ns = plan.getNamespace();
		String parent_relationship = plan.getChild("Parent-Relationship",ns).getValue();
		String parallel_aware = plan.getChild("Parallel-Aware",ns).getValue();
		String startup_cost = plan.getChild("Startup-Cost",ns).getValue();
		String total_cost = plan.getChild("Total-Cost",ns).getValue();
		setTotal_Cost(new BigDecimal(total_cost));
		String plan_rows = plan.getChild("Plan-Rows",ns).getValue();
		setPlan_Rows(new BigDecimal(plan_rows));
		String plan_width = plan.getChild("Plan-Width",ns).getValue();
		Element keys = plan.getChild("Sort-Key",ns);
		if (keys != null) {
			Iterator it = keys.getChildren().listIterator();
			while (it.hasNext()) {
				Element sortitem = (Element) it.next();
				String item = sortitem.getValue();
				addkey(item);
			}	
		}	
		Element plans = plan.getChild("Plans", ns);
		if (plans != null) {
			Iterator it = plans.getChildren().listIterator();
			while (it.hasNext() ) {
				Element planchild = (Element) it.next();				
				add(DBExplain.parseplan(planchild));
			}
		}			
	}
	private void addkey(String key) {
		keys.add(key);			
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
	@Override
	public List<String> tuning() {
		List<String> commands = new ArrayList<String>();
		if (keys.size() == 0)
			return null;
		IMetrics max = null;
		for (IMetrics child:childs) {
			if (child.getClass().equals(SeqScan.class))  {
				SeqScan scan = (SeqScan) child;
				String relationname = scan.getRelation_Name();
				String relationalias = scan.getAlias();
				String relationkey = keys.get(0);
				String key = "";
				StringTokenizer st = new StringTokenizer(relationkey, ".");
				while (st.hasMoreElements()) {
					key = (String) st.nextElement();
				}
				byte[] array = new byte[7]; 
				String indexname = String.format("Sort%s", key);
				String tun = String.format("CREATE INDEX %s ON %s (%s)", indexname, relationname, key);
				commands.add(tun);
			}			
		}		
		return commands;
	}
	@Override
	public void setPlan_Rows(BigDecimal var) {
		Plan_Rows = var;
	}
	@Override
	public BigDecimal getPlan_Rows() {
		return Plan_Rows;
	}
}
