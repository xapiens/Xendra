package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_R_StatusOfCategory implements ValRule 
{
 	@XendraValRule(Name="R_Status of Category",
		AD_Val_Rule_ID=260,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="4f28ed0c-aad9-967d-e684-f95f4ca908ef",
		Synchronized="2012-01-17 10:34:03.0")
	public static final String Identifier = "4f28ed0c-aad9-967d-e684-f95f4ca908ef";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("R_StatusCategory_ID=@R_StatusCategory_ID@");
	return sb.toString();
}
}
