package org.xendra.explain;

import java.math.BigDecimal;
import java.util.List;

public interface IMetrics {
	public void setTotal_Cost(BigDecimal var);
	public BigDecimal getTotal_Cost();
	public void setPlan_Rows(BigDecimal var);
	public BigDecimal getPlan_Rows();
	public void add(IMetrics child);
	public List<String> tuning();
}
