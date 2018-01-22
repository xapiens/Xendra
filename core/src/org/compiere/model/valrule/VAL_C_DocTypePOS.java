package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypePOS implements ValRule 
{
 	@XendraValRule(Name="C_DocType POS",
		AD_Val_Rule_ID=208,
		Description="Document Type for POS",
		Type="S",
		EntityType="D",
		Identifier="f6464f93-a5dc-4ece-95fe-b9ca1ee1a1fe",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "f6464f93-a5dc-4ece-95fe-b9ca1ee1a1fe";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocSubType='WR'");
	return sb.toString();
}
}
