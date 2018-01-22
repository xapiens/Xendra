package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_OrderClosed implements ValRule 
{
 	@XendraValRule(Name="C_Order Closed",
		AD_Val_Rule_ID=187,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="8fc06bdb-6d28-1c23-b26d-0f42e3e8a026",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "8fc06bdb-6d28-1c23-b26d-0f42e3e8a026";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Order.DocStatus='CL'");
	return sb.toString();
}
}
