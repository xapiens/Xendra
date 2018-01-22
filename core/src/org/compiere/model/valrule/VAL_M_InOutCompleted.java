package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_InOutCompleted implements ValRule 
{
 	@XendraValRule(Name="M_InOut Completed",
		AD_Val_Rule_ID=1000005,
		Description="Matches a complete Shipment/Receipt",
		Type="S",
		EntityType="D",
		Identifier="2fecac28-25a7-6d8f-d18b-70c3edba4638",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "2fecac28-25a7-6d8f-d18b-70c3edba4638";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_InOut.DocStatus IN ('CO', 'CL')");
	return sb.toString();
}
}
