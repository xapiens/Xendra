package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_OrgSecurityValidation implements ValRule 
{
 	@XendraValRule(Name="AD_Org Security validation",
		AD_Val_Rule_ID=104,
		Description="Not Summary - 0 - Organizations of the Client with user acces rights",
		Type="S",
		EntityType="D",
		Identifier="51198f6e-2576-ef9d-72fc-b53f32c8612d",
		Synchronized="2012-01-17 10:34:30.0")
	public static final String Identifier = "51198f6e-2576-ef9d-72fc-b53f32c8612d";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("(AD_Org.IsSummary='N' OR AD_Org.AD_Org_ID=0)");
	return sb.toString();
}
}
