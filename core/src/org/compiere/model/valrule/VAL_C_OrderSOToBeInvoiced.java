package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_OrderSOToBeInvoiced implements ValRule 
{
 	@XendraValRule(Name="C_Order SO to be invoiced",
		AD_Val_Rule_ID=134,
		Description="Ordered <> Invoiced",
		Type="S",
		EntityType="D",
		Identifier="57fa1e8d-7b0c-90e8-3296-fd0ebd21d519",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "57fa1e8d-7b0c-90e8-3296-fd0ebd21d519";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("DocStatus NOT IN ('DR','IP')  AND EXISTS (SELECT * FROM C_OrderLine WHERE C_Order.C_Order_ID=C_OrderLine.C_Order_ID AND QtyOrdered <> QtyInvoiced) AND IsSOTrx='Y'");
	return sb.toString();
}
}
