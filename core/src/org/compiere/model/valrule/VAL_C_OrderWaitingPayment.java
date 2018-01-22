package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_OrderWaitingPayment implements ValRule 
{
 	@XendraValRule(Name="C_Order Waiting Payment",
		AD_Val_Rule_ID=212,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="498a748b-4ccb-4d19-91f6-70e96c7464f6",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "498a748b-4ccb-4d19-91f6-70e96c7464f6";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Order.DocStatus='WP'");
	return sb.toString();
}
}
