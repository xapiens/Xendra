package org.xendra.explain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Element;
import org.jdom.Namespace;

public class MergeJoin implements IMetrics {
	List<IMetrics> childs = new ArrayList<IMetrics>();	
	BigDecimal Total_Cost;
	BigDecimal Plan_Rows;
	public MergeJoin(Element plan) {
		Namespace ns = plan.getNamespace();
		String parallel_aware = plan.getChild("Parallel-Aware", ns).getValue();
		String join_type = plan.getChild("Join-Type", ns).getValue();
		String startup_cost = plan.getChild("Startup-Cost", ns).getValue();
		String total_cost = plan.getChild("Total-Cost", ns).getValue();
		setTotal_Cost(new BigDecimal(total_cost));
		String plan_rows = plan.getChild("Plan-Rows", ns).getValue();
		setPlan_Rows(new BigDecimal(plan_rows));
		String plan_width = plan.getChild("Plan-Width", ns).getValue();
		String merge_cond = plan.getChild("Merge-Cond", ns).getValue();
		Element plans = plan.getChild("Plans", ns);
		if (plans != null) {
			Iterator it = plans.getChildren().listIterator();
			while (it.hasNext() ) {
				Element planchild = (Element) it.next();
				add(DBExplain.parseplan(planchild));
			}
		}
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
		IMetrics max = null;
		for (IMetrics child:childs) {
			if (max == null)
				max = child;
			else if (max.getTotal_Cost().compareTo(child.getTotal_Cost()) < 0) {
				max = child;
			}									
		}
		if (max != null) {
			commands = max.tuning();			
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
