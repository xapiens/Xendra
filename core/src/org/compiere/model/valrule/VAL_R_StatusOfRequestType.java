package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_R_StatusOfRequestType implements ValRule 
{
 	@XendraValRule(Name="R_Status of Request Type",
		AD_Val_Rule_ID=261,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="0e96f775-7575-bf2f-2a6a-e25170023cab",
		Synchronized="2012-01-17 10:35:16.0")
	public static final String Identifier = "0e96f775-7575-bf2f-2a6a-e25170023cab";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM R_RequestType rt ");
	sb.append("INNER JOIN R_StatusCategory sc ON (rt.R_StatusCategory_ID=sc.R_StatusCategory_ID)");
	sb.append("WHERE R_Status.R_StatusCategory_ID=sc.R_StatusCategory_ID");
	sb.append("AND rt.R_RequestType_ID=@R_RequestType_ID@)");
	return sb.toString();
}
}
