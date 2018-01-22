package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_RequisitionCompleted implements ValRule 
{
 	@XendraValRule(Name="M_Requisition Completed",
		AD_Val_Rule_ID=1000004,
		Description="Matches a completed requisition",
		Type="S",
		EntityType="D",
		Identifier="d3afc85b-8047-0505-5549-25ce3b0c4e4d",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "d3afc85b-8047-0505-5549-25ce3b0c4e4d";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_Requisition.DocStatus IN ('CO', 'CL')");
	return sb.toString();
}
}
